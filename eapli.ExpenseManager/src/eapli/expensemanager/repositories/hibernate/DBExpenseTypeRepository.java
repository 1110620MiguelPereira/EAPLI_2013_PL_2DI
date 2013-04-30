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

/**
 *
 * @author schmitzoide
 */
public class DBExpenseTypeRepository extends JpaHibernateUtil<ExpenseType> implements ExpenseTypeRepository {

    // VAMOS AQUI

    
    public DBExpenseTypeRepository(){
    }
    
    @Override
    public void save(ExpenseType expenseType) {
        update(expenseType);
    }

    @Override
    public List<ExpenseType> getAll() {
        return (List)findAll();
    }
    
}
