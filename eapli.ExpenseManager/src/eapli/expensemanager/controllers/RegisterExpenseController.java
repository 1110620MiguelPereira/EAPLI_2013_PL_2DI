/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.PaymentMethod.types;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterExpenseController extends BaseController{

    public void registerExpense(BigDecimal amount, String description, int day,int month,int year, types paymentMethod, ExpenseType typeExpense) {
        Expense expense = new Expense(amount, description,day,month,year,paymentMethod,typeExpense);
        
        // FIX provide alternative for creating the repository
        ExpenseRepository repo = RepositoryFactory.instance().getExpenseRepository();
        repo.save(expense);
    }
    
}
