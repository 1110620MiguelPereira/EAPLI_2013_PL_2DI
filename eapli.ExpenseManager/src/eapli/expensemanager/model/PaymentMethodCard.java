/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Pedro Branco
 */
public abstract class PaymentMethodCard {
    
    int number;
    String bankName;
    
    public PaymentMethodCard(){
    }
    
    public PaymentMethodCard(int number, String bankName){ 
        this.number = number; this.bankName=bankName;
    }
    
    
}
