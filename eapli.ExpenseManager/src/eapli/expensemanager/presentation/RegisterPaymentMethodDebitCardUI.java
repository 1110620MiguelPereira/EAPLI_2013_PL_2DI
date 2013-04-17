/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterPaymentMethodController;

/**
 *
 * @author Adulcinio
 */
public class RegisterPaymentMethodDebitCardUI extends RegisterPaymentMethodCardBaseUI{
     
    RegisterPaymentMethodController controllerDebitCard = new RegisterPaymentMethodController();
    
    @Override
    public void show()
    {
        controllerDebitCard.registerPaymentMethodDebitCard(bankname, cardnumber);
        super.show();
    }

    @Override
    protected BaseController getController() {
        return controllerDebitCard;
    }
    
}
