/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Adulcínio
 */
public class PaymentMethodDebitCard extends PaymentMethodCard{

    public PaymentMethodDebitCard() {
        super();
    } 
    
    public PaymentMethodDebitCard(String number, String bankName) {
        super(number,bankName);
    }  
    
}
