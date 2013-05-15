/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Big-D2xl
 */
public class ExpenseVisualizationController extends BaseController{

    public List<Expense> getExpensesOfMonth(Calendar initDate,Calendar finalDate) {
        
        ExpenseRepository repo= PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository();

        return repo.getListExpenses(initDate,finalDate);
    }
    
}
