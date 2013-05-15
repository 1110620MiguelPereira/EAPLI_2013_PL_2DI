/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.MovementType;

import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.hibernate.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author schmitzoide
 */
public class DBExpenseTypeRepository extends JpaHibernateUtil<ExpenseType> implements ExpenseTypeRepository {

    public DBExpenseTypeRepository() {
    }

    @Override
    public void save(ExpenseType expenseType) {

        EntityManager em = getEntityManager();
        assert em != null;
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        boolean find = findById(expenseType.getType());
       
        if (find) {
            update(expenseType);
        } else {
            create(expenseType);
        }
        
        tx.commit();
        em.close();
    }

    @Override
    public List<ExpenseType> getAll() {
        return (List) findAll();
    }

    @Override
    public boolean findById(String shortName) {

        ExpenseType exp1 = findByPrimaryKey(shortName);
        if (exp1 == null) {
            return false;
        }
        return true;
    }
}
