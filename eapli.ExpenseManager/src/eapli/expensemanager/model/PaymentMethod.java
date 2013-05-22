/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;




/**
 *
 * @author schmitzoide
 */ 
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
public abstract class PaymentMethod  implements Serializable{
    @Id
    @GeneratedValue
    private Integer id_paymentMethod;
    
    public Integer getID()
    {
        return id_paymentMethod;
    }
    
     @Override
    public String toString()
    {
        return "ID:"+getID()+"\n";
    }
    

  
    //FIX: is the enumartion really necessary?
    //public static enum types { CREDITCARD, DEBITCARD, CASH, CHECK };
}
