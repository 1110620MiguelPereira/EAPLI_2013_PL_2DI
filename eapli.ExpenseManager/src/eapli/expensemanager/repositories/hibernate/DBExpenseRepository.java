/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author vasco
 */
public class DBExpenseRepository extends JpaHibernateUtil<Expense> implements ExpenseRepository {

    @Override
    public void save(Expense expense) {
        EntityManager em = getEntityManager();
        assert em != null;
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        if(expense.getID_Movement()==null)
        {
            //em.persist(expense);
            em.merge(expense);
        }else
        {
            em.merge(expense);
        }
                
        tx.commit();
        em.close();
    }

    @Override
    public BigDecimal ExpensesOfWeek(int weekNumber, int year) {
        Calendar first_day = DateTime.firstDateOfWeek(year,weekNumber);
        Calendar last_day = DateTime.lastDateOfWeek(year,weekNumber);
        BigDecimal weekSpending = (BigDecimal)getEntityManager().createQuery("SELECT SUM(E.amount) FROM " + entityClass.getSimpleName()+
                " E WHERE E.movement_date>= :D1 AND E.movement_date <= :D2").setParameter("D1", first_day).setParameter("D2", last_day).getSingleResult();
	return (weekSpending == null ? new BigDecimal(0) : weekSpending); 
    }

    @Override
    public BigDecimal expensesOfMonth(int month, int year) {
        Calendar beginOfMonth = DateTime.newCalendarDate(year, month, 1);
        Calendar endOfMonth = DateTime.newCalendarDate(year, month, (beginOfMonth.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)));
        BigDecimal monthSpending = (BigDecimal)getEntityManager().createQuery("SELECT SUM(E.amount) FROM " + entityClass.getSimpleName()+
                " E WHERE E.movement_date>= :D1 AND E.movement_date <= :D2").setParameter("D1", beginOfMonth).setParameter("D2", endOfMonth).getSingleResult();
        return (monthSpending == null ? new BigDecimal(0) : monthSpending);
    }

    @Override
    public List<Expense> getListExpenses(Calendar initDate, Calendar finalDate) {
        List<Expense> listExpenseMonth = new ArrayList<Expense>();
        List<Expense> expenses = (List)findAll();
        for (Expense e : expenses) {
            if (e.occursBetweenDates(initDate, finalDate)) {
                listExpenseMonth.add(e);
            }
        }
        return listExpenseMonth;
    }

    @Override
    public List<Expense> getAll() {
        return (List)findAll();
    }

    @Override
    public BigDecimal getTotal() {
        return (BigDecimal)getEntityManager().createQuery("SELECT SUM(amount) FROM " + entityClass.getSimpleName()).getSingleResult();
    }

}
