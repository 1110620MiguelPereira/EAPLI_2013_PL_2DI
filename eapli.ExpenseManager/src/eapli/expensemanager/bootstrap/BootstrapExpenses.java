/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.bootstrap;

import java.math.BigDecimal;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.List;


/**
 *
 * @author hugosilva00
 * @author 1110634
 */

public class BootstrapExpenses
{
    public void createExpenses()
    {
        ExpenseRepository repositorio = PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository();
        PaymentMethodRepository repositorioPaymentMethod = PersistenceFactory.instance().buildRepositoryFactory(false).getPaymentMethodRepository();
        
        List<PaymentMethod> paymentMethods = repositorioPaymentMethod.getAll();
        
        if (paymentMethods.size()<=1) {
            System.out.println("É preciso criar pelo menos dois métodos de pagamentos");
            return;
        }
            
        
//        BigDecimal amount = new BigDecimal("20.00");
//        Expense e1 = new Expense(amount,"Mobile Phone Plan");
//        
//        amount= new BigDecimal("50");
//        Expense e2 = new Expense(amount,"Medical Expenses");
//        
//        amount = new BigDecimal("0.50");
//        Expense e3 = new Expense(amount,"Bubblegum");
                
        ExpenseType expense = new ExpenseType("Supermercado","Compras ");
        ExpenseType expense1 = new ExpenseType("Restaurante","Jantar ");
       
        BigDecimal amount = new BigDecimal("30");
        Expense e1 = new Expense(amount,"Corn",2,3,2012,paymentMethods.get(0),expense); 
        
        amount = new BigDecimal("600");
        Expense e2 = new Expense(amount,"Computer",8,4,2013,paymentMethods.get(1),expense); 
        
        amount = new BigDecimal("15");
        Expense e3 = new Expense(amount,"Mouse",9,4,2013,paymentMethods.get(0),expense1); 
        
        amount = new BigDecimal("20.99");
        Expense e4 = new Expense(amount,"Keybord",2,3,2013,paymentMethods.get(1),expense1); 
        
        repositorio.save(e1);
        repositorio.save(e2);
        repositorio.save(e3);
        repositorio.save(e4);
    }
}
