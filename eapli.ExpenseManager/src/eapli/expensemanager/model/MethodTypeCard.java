/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Pedro Branco
 */
public abstract class MethodTypeCard implements PaymentMethod{
    
    int number;
    String bankName;
    
    public MethodTypeCard(){
    }
    
    public MethodTypeCard(int number, String bankName){ 
        this.number = number; this.bankName=bankName;
    }
    
    
}
