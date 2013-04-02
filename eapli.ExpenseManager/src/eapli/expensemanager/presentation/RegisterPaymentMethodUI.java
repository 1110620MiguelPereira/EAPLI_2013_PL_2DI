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
public class RegisterPaymentMethodUI extends BaseUI {

    @Override
    void show() {
        System.out.println("Choose a payment method type:");
        System.out.println("1. debit card");
        System.out.println("2. credit card");
        System.out.println("3. cheque");
        System.out.println("0. menu anterior\n");

        int option;
        do {
            option = Console.readIntegerFromConsole("Introduza uma opção:");
            switch (option) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (option != 0);
    }
}
