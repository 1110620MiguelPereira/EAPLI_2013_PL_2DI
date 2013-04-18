/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import java.util.List;

/**
 *
 * @author Miguel Azevedo
 */
public class ListExpensePaymentMethodsController extends BaseController {
    
    public List<PaymentMethod>  getPaymentMethods() {
        PaymentMethodRepository methods = RepositoryFactory.instance().getPaymentMethodRepository();
        return methods.getAll();
    }    
}
