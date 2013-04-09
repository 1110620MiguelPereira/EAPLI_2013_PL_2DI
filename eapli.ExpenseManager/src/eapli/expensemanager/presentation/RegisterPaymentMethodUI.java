/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterPaymentMethodUI extends BaseUI {


    void show() {


        int option;
        do {
            System.out.println("Choose a payment method type:");
            System.out.println("1. debit card");
            System.out.println("2. credit card");
            System.out.println("3. cheque");
            System.out.println("0. Sair\n");
            option = Console.readIntegerFromConsole("Introduza uma opção:");
            switch (option) {
                case 0:
                    return;
                case 1:
                    RegisterPaymentMethodDebitCardUI uiDebitCard = new RegisterPaymentMethodDebitCardUI();
                    uiDebitCard.show();
                    break;
                case 2:
                    RegisterPaymentMethodCreditCardUI uiCreditCard = new RegisterPaymentMethodCreditCardUI();
                    uiCreditCard.show();
                    break;
                case 3:
                    break;
            }
        } while (option != 0);
    }

    @Override
    protected BaseController getController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
