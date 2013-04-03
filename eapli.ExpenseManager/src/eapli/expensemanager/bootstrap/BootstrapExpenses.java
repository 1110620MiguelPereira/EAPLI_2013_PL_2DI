/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.bootstrap;

import java.math.BigDecimal;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
//import eapli.expensemanager.repositories.inmemory.InMemoryExpenseRepository;

/**
 *
 * @author hugosilva00
 * @author 1110634
 */

public class BootstrapExpenses
{
    public void createExpenses()
    {
        ExpenseRepository repositorio = RepositoryFactory.instance().getExpenseRepository();
        
        BigDecimal amount = new BigDecimal("20.00");
        Expense e1 = new Expense(amount,"Mobile Phone Plan");
        
        amount= new BigDecimal("50");
        Expense e2 = new Expense(amount,"Medical Expenses");
        
        amount = new BigDecimal("0.50");
        Expense e3 = new Expense(amount,"Bubblegum");
        amount = new BigDecimal("30");
        Expense e4 = new Expense(amount,"Corn",2,3,2012); 
        repositorio.save(e1);
        repositorio.save(e2);
        repositorio.save(e3);
        repositorio.save(e4);
    }
}
