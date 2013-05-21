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
        
        Expense e = findByPrimaryKey(expense.getID_Movement());
        if (e == null) {
            create(expense);
        }else{
            update(expense);
        }
        
        tx.commit();
        em.close();
    }

    @Override
    public BigDecimal ExpensesOfWeek(int weekNumber, int year) {
        Calendar first_day = DateTime.firstDateOfWeek(year,weekNumber);
        Calendar last_day = DateTime.lastDateOfWeek(year,weekNumber);
	return (BigDecimal)getEntityManager().createQuery("SELECT SUM(E.amount) FROM " + entityClass.getSimpleName()+
                " E WHERE E.date>= :D1 AND E.date <= :D2").setParameter("D1", first_day).setParameter("D2", last_day).getSingleResult();
    }

    @Override
    public BigDecimal expensesOfMonth(int month, int year) {
        //throw new UnsupportedOperationException("Not supported yet.");
        // FIXME implement this method
        return new BigDecimal(0);
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
        BigDecimal total =  (BigDecimal)getEntityManager().createQuery("SELECT SUM(E.amount) FROM " + entityClass.getSimpleName() + " E").getSingleResult();
        return (total == null? new BigDecimal(0) : total);
    }

}
