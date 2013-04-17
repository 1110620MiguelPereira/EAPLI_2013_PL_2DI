/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpensePaymentMethodsController;
import eapli.expensemanager.model.PaymentMethod;

/**
 *
 * @author Miguel Azevedo
 */
public class ListExpensePaymentMethodsUI extends BaseUI    {
 
    ListExpensePaymentMethodsController listControllerMethods = new ListExpensePaymentMethodsController();
    @Override
    public void show() {       
        
        for (PaymentMethod obj: listControllerMethods.getPaymentMethods())  { 
            System.out.println(obj);
        }
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listControllerMethods;
    }
    
    
}
