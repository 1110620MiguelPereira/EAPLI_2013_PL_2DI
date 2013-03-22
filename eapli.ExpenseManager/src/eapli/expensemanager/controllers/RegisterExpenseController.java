/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterExpenseController extends BaseController{

    public void registerExpense(BigDecimal amount, String description) {
        Expense expense = new Expense(amount, description);
        
        // FIX provide alternative for creating the repository
        ExpenseRepository repo = new InMemoryExpenseRepository();
        repo.save(expense);
    }
    
}
