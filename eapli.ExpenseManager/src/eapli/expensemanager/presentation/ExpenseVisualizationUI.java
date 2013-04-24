/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseVisualizationController;
import eapli.expensemanager.model.Expense;
import eapli.util.Console;
import eapli.util.DateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Big-D2xl
 */
public class ExpenseVisualizationUI extends BaseUI {

    
    public void show() {

        System.out.println("Which is the date range you wish to check? (mm-yyyy)");
        Calendar initDate = Console.readMonthYearFromConsole("Start date: ");
        Calendar finalDate = Console.readMonthYearFromConsole("End date: ");
                
        if (initDate!=null && finalDate!=null) {
            ExpenseVisualizationController EVC = new ExpenseVisualizationController();
          
            List<Expense> expenses = EVC.getExpensesOfMonth(initDate, finalDate);
            System.out.println("List Expenses:\n");
            for (Expense a : expenses) {
                System.out.println("" + a.toString());
               
            }
        } else {
            System.out.println("Invalid Date");

        }
        super.show();
    }

    @Override
    protected BaseController getController() {
       return new BaseController();
    }
}
