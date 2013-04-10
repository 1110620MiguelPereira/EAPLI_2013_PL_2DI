/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import java.util.List;

/**
 *
 * @author Big-D2xl
 */
public class ExpenseVisualizationController extends BaseController{

    public List<Expense> ExpenseVisualization(int month,int year) {
        
        ExpenseRepository repo= RepositoryFactory.instance().getExpenseRepository();
         //To change body of generated methods, choose Tools | Templates.
        return repo.getListExpenses(month,year);
    }
    
}
