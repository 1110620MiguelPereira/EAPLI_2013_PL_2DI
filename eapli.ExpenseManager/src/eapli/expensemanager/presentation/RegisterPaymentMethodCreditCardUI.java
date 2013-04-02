/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterPaymentMethodController;

/**
 *
 * @author Pedro
 */
public class RegisterPaymentMethodCreditCardUI extends RegisterPaymentMethodCardBaseUI{
    
    public void show()
    {
        super.show();
        RegisterPaymentMethodController controller = new RegisterPaymentMethodController();
        controller.registerPaymentMethodCreditCard(bankname, cardnumber);
    }
    
}
