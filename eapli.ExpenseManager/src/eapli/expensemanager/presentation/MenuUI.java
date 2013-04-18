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
public class MenuUI{

    public void show() { 
        int option;
        do {
       
            System.out.println("EXPENSE MANAGER");
            System.out.println("1. List");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            
            option = Console.readIntegerFromConsole("Insert option:");
            switch (option) {
                case 0:
                    return;
                case 1://Listagens
                    System.out.println("List:");
                    System.out.println("1. Monthly expenses");
                    System.out.println("2. Expense types");
                    System.out.println("3. Payment Methods");
                    System.out.println("4. Income types");
                    System.out.println("0. Exit");
                    option = Console.readIntegerFromConsole("Insert option:");
                    switch(option){
                        case 0:
                            return;
                        case 1:
                            ExpenseVisualizationUI tuii=new ExpenseVisualizationUI();
                            tuii.show();
                            break;
                        case 2:
                            ListExpenseTypeUI letUI = new ListExpenseTypeUI();
                            letUI.show();
                            break;
                        case 3:
                            ListExpensePaymentMethodsUI listPayUI = new ListExpensePaymentMethodsUI();
                            listPayUI.show();
                            break;     
                        case 4:
                            ListIncomeTypeUI listIncUI = new ListIncomeTypeUI();
                            listIncUI.show();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Register:");
                    System.out.println("1. Expense");
                    System.out.println("2. Expense type");
                    System.out.println("3. Payment method");
                    System.out.println("4. Income");
                    System.out.println("5. Income type");
                    System.out.println("0. Exit");
                    option = Console.readIntegerFromConsole("Insert option:");
                    switch(option){
                        case 0:
                            return;
                        case 1:
                            RegisterExpenseUI ui = new RegisterExpenseUI();
                            ui.show();
                            break;
                        case 2:
                            RegisterExpenseTypeUI tui = new RegisterExpenseTypeUI();
                            tui.show();
                            break;
                        case 3:
                            RegisterPaymentMethodUI paymentMethodUI = new RegisterPaymentMethodUI();
                            paymentMethodUI.show();
                            break;
                        case 4:
                            RegisterIncomeUI incUI = new RegisterIncomeUI();
                            incUI.show();
                            break;
                        case 5:
                            RegisterIncomeTypeUI incTypeUI = new RegisterIncomeTypeUI();
                            incTypeUI.show();
                            break;
                    }
            }
        } while (option != 0);
    }
}
