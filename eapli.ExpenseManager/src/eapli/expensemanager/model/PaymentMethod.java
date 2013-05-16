/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;




/**
 *
 * @author schmitzoide
 */ 
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class PaymentMethod  {
    @Id
    private int id_paymentMethod;

  
    //FIX: is the enumartion really necessary?
    //public static enum types { CREDITCARD, DEBITCARD, CASH, CHECK };
}
