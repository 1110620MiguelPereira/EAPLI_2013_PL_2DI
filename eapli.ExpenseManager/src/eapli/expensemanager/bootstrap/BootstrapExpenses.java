/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.bootstrap;

import java.math.BigDecimal;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.PaymentMethod.types;
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
        
//        BigDecimal amount = new BigDecimal("20.00");
//        Expense e1 = new Expense(amount,"Mobile Phone Plan");
//        
//        amount= new BigDecimal("50");
//        Expense e2 = new Expense(amount,"Medical Expenses");
//        
//        amount = new BigDecimal("0.50");
//        Expense e3 = new Expense(amount,"Bubblegum");
        
        types tCash = types.CASH;
        types tCC = types.CREDITCARD;
        types tCheck = types.CHECK;
        types tDC = types.DEBITCARD;
        
         ExpenseType expense = new ExpenseType("Supermercado","Compras ");
        ExpenseType expense1 = new ExpenseType("Restaurante","Jantar ");
       
        BigDecimal amount = new BigDecimal("30");
        Expense e1 = new Expense(amount,"Corn",2,3,2012,tCash,expense); 
        
        amount = new BigDecimal("600");
        Expense e2 = new Expense(amount,"Computer",8,4,2013,tCC,expense); 
        
        amount = new BigDecimal("15");
        Expense e3 = new Expense(amount,"Mouse",9,4,2013,tDC,expense1); 
        
        amount = new BigDecimal("20.99");
        Expense e4 = new Expense(amount,"Keybord",2,3,2013,tCheck,expense1); 
        
        repositorio.save(e1);
        repositorio.save(e2);
        repositorio.save(e3);
        repositorio.save(e4);
    }
}
