/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Pedro Branco
 */
public abstract class PaymentMethodCard implements PaymentMethod{
    
    String number;
    String bankName;
    
    public PaymentMethodCard(){
    }
    
    public PaymentMethodCard(String number, String bankName){ 
           
        if(number == null ||  number.trim().length()<=0)
            throw new IllegalArgumentException("Invalid Number.");
        
       if(bankName == null || bankName.trim().length() <= 0)
            throw new IllegalArgumentException("Invalid Bank name.");
           
       this.number = number;
       this.bankName=bankName;  
    }   
}
