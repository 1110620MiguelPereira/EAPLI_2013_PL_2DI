/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.IncomeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author schmitzoide
 */
public class DBIncomeRepository extends JpaHibernateUtil<Income> implements IncomeRepository {

    @Override
    public void save(Income income) {
        EntityManager em = getEntityManager();
        assert em != null;
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        if (income.getID_Movement() == null) {
            //em.persist(expense);
            em.merge(income);
        } else {
            em.merge(income);
        }

        tx.commit();
        em.close();
    }

    @Override
    public List<Income> getAll() {
        return (List) findAll();
    }

    @Override
    public BigDecimal getTotal() {
        BigDecimal total = (BigDecimal) getEntityManager().
                createQuery("SELECT SUM(E.amount) FROM " + entityClass.
                getSimpleName() + " E").getSingleResult();
        return (total == null ? new BigDecimal(0) : total);
    }
}
