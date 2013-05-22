/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Cristiano
 */
public class ListExpensesController extends BaseController{
   
    public List<Expense>  getAllExpenses() {
        ExpenseRepository ete = PersistenceFactory.instance().buildRepositoryFactory().getExpenseRepository();
        return ete.getAll();
    }
    
}