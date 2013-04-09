/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseTypeRepository;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterExpenseTypeController extends BaseController{

    public void registerExpenseType(String type, String description) {
        ExpenseType expenseType = new ExpenseType(type, description);
        
         // FIX provide alternative for creating the repository  
        ExpenseTypeRepository repo = RepositoryFactory.instance().getExpenseTypeRepository();
        repo.save(expenseType);
    }
    
}
