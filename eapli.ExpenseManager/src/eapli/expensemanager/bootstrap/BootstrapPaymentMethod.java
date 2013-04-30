/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.PaymentMethodCreditCard;
import eapli.expensemanager.model.PaymentMethodDebitCard;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author schmitzoide
 */
public class BootstrapPaymentMethod {
        public void createPaymentMethods()
    {
        PaymentMethodRepository repositorio = PersistenceFactory.instance().getPaymentMethodRepository();
        
        PaymentMethodCreditCard creditCard1 = new PaymentMethodCreditCard("1111 2222 3333 4444","CGD");
        PaymentMethodDebitCard debitCard1 = new PaymentMethodDebitCard("5555 6666 7777 8888","CGD");
        
        // MISSING CHECK
        
        repositorio.save(creditCard1);
        repositorio.save(debitCard1);
        
    }
}
