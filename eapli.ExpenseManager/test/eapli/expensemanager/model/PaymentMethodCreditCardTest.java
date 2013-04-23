/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class PaymentMethodCreditCardTest {
    
    public PaymentMethodCreditCardTest() {
    }

    @Test
    public void testPaymentMethodCreditCardInvalidData() {
        try {
            String number = "";
            String bname = "";
            PaymentMethodCreditCard pmcc = new PaymentMethodCreditCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodCreditCardInvalidBName() {
        try {
            String number = "2388843";
            String bname = null;
            PaymentMethodCreditCard pmcc = new PaymentMethodCreditCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodCreditCardInvalidNumber() {
        try {
            String number = null;
            String bname = "Bank";
            PaymentMethodCreditCard pmcc = new PaymentMethodCreditCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodCreditCardValidData() {
        try {
            String number = "29923492";
            String bname = "bank";
            PaymentMethodCreditCard pmcc = new PaymentMethodCreditCard(number, bname);
        } catch (Exception e) {
            fail("Exception not expected. Test failed.");
        }
    }
}