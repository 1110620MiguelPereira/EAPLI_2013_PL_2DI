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
public class RegisterPaymentMethodUI {

    void show() {
        System.out.println("Choos a payment method type:");
        System.out.println("1. debit card");
        System.out.println("2. credit card");
        System.out.println("3. cheque");
                
                int option = Console.readIntegerFromConsole("Introduza uma opção:");
        switch (option) {
            case 1:
                break;
            case 2:
                break;
                case 3: break;
        }
        
    }
    
}
