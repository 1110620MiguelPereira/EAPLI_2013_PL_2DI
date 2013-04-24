/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Movement implements Serializable {
    protected BigDecimal amount;
   
    
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Calendar date; 
    
    protected String description;
    
    
    @Id   
    @GeneratedValue  
    private Long id_Movement;  
    
    public Movement() {
    }
    
    
    public Movement(BigDecimal amount, String description, int day,int month,int year){
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
        this.date=DateTime.newCalendarDate(year, month, day);
    }
    
    public BigDecimal getAmount(){
        return amount;
    }
    
    @Override
    public String toString(){
        return "Amount: "+amount+"\nDate: "+date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR)+"\nDescription: "+description+"\n";
    }

   
}
