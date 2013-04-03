/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.ExpenseVisualizationController;
import eapli.expensemanager.model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Big-D2xl
 */
public class ExpenseVisualizationUI extends BaseUI{
       public void show(){
         super.show();
       // int month = Console.readIntegerFromConsole("Month");
        //int year = Console.readIntegerFromConsole("Year");
        ExpenseVisualizationController EVC = new ExpenseVisualizationController();
        List<Expense> expenses = EVC.ExpenseVisualization();
        System.out.println("List Expenses:\n");
        for (Expense a : expenses) {
            System.out.println("" + a.toString());
            //a.toString();
        }
    }
}
