/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager;

import eapli.expensemanager.bootstrap.BootstrapExpenseType;
import eapli.expensemanager.bootstrap.BootstrapExpenses;
import eapli.expensemanager.bootstrap.BootstrapIncomeType;
import eapli.expensemanager.bootstrap.BootstrapIncomes;
import eapli.expensemanager.bootstrap.BootstrapPaymentMethod;
import eapli.expensemanager.presentation.MenuUI;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
        BootstrapPaymentMethod method=new BootstrapPaymentMethod();
        method.createPaymentMethods();
        
        BootstrapExpenseType expenseType = new BootstrapExpenseType();
        expenseType.createExpenseType();
        
        BootstrapIncomeType incomeType = new BootstrapIncomeType();
        incomeType.createIncomeType();
        
//        BootstrapIncomes incomes = new BootstrapIncomes();
//        incomes.createIncomes();
//        
//        
//        BootstrapExpenses expenseTest = new BootstrapExpenses();
//        expenseTest.createExpenses();
//        
        
        MenuUI menu = new MenuUI();
        menu.show();
    }
}
