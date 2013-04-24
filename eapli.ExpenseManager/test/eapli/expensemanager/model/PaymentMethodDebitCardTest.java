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
public class PaymentMethodDebitCardTest {
    
    public PaymentMethodDebitCardTest() {
    }

    @Test
    public void testPaymentMethodDebitCardInvalidData() {
        try {
            String number = "";
            String bname = "";
            PaymentMethodDebitCard pmcc = new PaymentMethodDebitCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodDebitCardInvalidBName() {
        try {
            String number = "2388843";
            String bname = null;
            PaymentMethodDebitCard pmcc = new PaymentMethodDebitCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodDebitCardInvalidNumber() {
        try {
            String number = null;
            String bname = "Bank";
            PaymentMethodDebitCard pmcc = new PaymentMethodDebitCard(number, bname);
            fail("Expected IllegalArgumentException exception to be thrown.");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testPaymentMethodDebitCardValidData() {
        try {
            String number = "29923492";
            String bname = "bank";
            PaymentMethodDebitCard pmcc = new PaymentMethodDebitCard(number, bname);
        } catch (Exception e) {
            fail("Exception not expected. Test failed.");
        }
    }
}