/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Miguel Azevedo
 */
public class ListExpensePaymentMethodsController extends BaseController {
    
    public List<PaymentMethod>  getPaymentMethods() {
        PaymentMethodRepository methods = PersistenceFactory.instance().getPaymentMethodRepository();
        return methods.getAll();
    }    
}
