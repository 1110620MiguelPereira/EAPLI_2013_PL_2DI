/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterPaymentMethodController;

/**
 *
 * @author Pedro
 */
public class RegisterPaymentMethodCreditCardUI extends RegisterPaymentMethodCardBaseUI{
    RegisterPaymentMethodController controller = new RegisterPaymentMethodController();
    
    @Override
    public void show()
    {   
        controller.registerPaymentMethodCreditCard(bankname, cardnumber);
        super.show();
    }

    @Override
    protected BaseController getController() {
        return controller;
    }
    
}
