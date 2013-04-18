/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryPaymentMethodRepository implements PaymentMethodRepository{

     static List<PaymentMethod> methodsPayment = new ArrayList<PaymentMethod>();
   
     @Override
    public void save(PaymentMethod payMethodDebCard) {
         
         methodsPayment.add(payMethodDebCard);
    }
     
     @Override
    public List<PaymentMethod> getAll() {
        return methodsPayment;
    }
}
