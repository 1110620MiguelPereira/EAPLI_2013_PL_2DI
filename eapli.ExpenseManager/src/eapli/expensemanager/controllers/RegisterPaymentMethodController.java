/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.PaymentMethodDebitCard;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.inmemory.InMemoryPaymentMethodRepository;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterPaymentMethodController extends BaseController{
    
     public void registerPaymentMethodDebitCard(String bankName, String cardNumber) {
        
         PaymentMethodDebitCard payMethodDebCard = new PaymentMethodDebitCard(cardNumber,bankName);
        
        // FIX provide alternative for creating the repository
        PaymentMethodRepository repoPayMetDebit = new InMemoryPaymentMethodRepository();
        repoPayMetDebit.save(payMethodDebCard);
    }
    
}
