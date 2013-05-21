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

/**
 *
 * @author schmitzoide
 */
public class DBIncomeRepository extends JpaHibernateUtil<IncomeType> implements IncomeRepository {



    @Override
    public void save(Income income) {
        // FALTA VERIFICAR SE JÁ EXISTE
        update(income);
    }

    @Override
    public List<Income> getAll() {
        return (List)findAll();
    }

    @Override
    public BigDecimal getTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
