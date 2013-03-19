/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MenuUI {

    public void show() {
        System.out.println("EXPENSE MANAGER");
        System.out.println("1. Register expense");
        System.out.println("0. Exit");
        
        int option = Console.readIntegerFromConsole("Introduza uma opção:");
        switch (option) {
            case 0:
                return;
            case 1:
                RegisterExpenseUI ui = new RegisterExpenseUI();
                ui.show();
                break;
        }
    }
    
}
