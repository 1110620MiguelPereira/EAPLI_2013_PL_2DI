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
            System.out.println("1. Register expense");
            System.out.println("2. Register expense type");
            System.out.println("3. Register payment method");
            System.out.println("4. List monthly expenses");
            System.out.println("5. List expenses types");
            System.out.println("6. Register income type");
            System.out.println("7. List income types");
            System.out.println("8. Register income");
            System.out.println("0. Exit");
            

            option = Console.readIntegerFromConsole("Introduza uma opção:");
            switch (option) {
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
                    ExpenseVisualizationUI tuii=new ExpenseVisualizationUI();
                    tuii.show();
                    break;
                case 5:
                    ListExpenseTypeUI letUI = new ListExpenseTypeUI();
                    letUI.show();
                    break;
                case 6:
                    RegisterIncomeTypeUI incTypeUI = new RegisterIncomeTypeUI();
                    incTypeUI.show();
                    break;
                case 7:
                    ListIncomeTypeUI listIncUI = new ListIncomeTypeUI();
                    listIncUI.show();
                    break;
                case 8:
                    RegisterIncomeUI ri = new RegisterIncomeUI();
                    ri.show();
                    break;
            }
        } while (option != 0);
    }
}
