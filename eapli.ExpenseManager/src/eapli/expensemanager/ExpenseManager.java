/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager;

import eapli.expensemanager.bootstrap.BootstrapExpenses;
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
        
        BootstrapExpenses expenseTest = new BootstrapExpenses();
        expenseTest.createExpenses();
        
        MenuUI menu = new MenuUI();
        menu.show();
    }
}
