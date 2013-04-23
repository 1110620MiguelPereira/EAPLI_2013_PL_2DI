/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author Daniel
 */
public abstract class Movement {
    protected BigDecimal amount;
    protected Calendar date;
    protected String description;
    
    
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
    
    public String toString(){
        return "Amount: "+amount+"\nDate: "+date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR)+"\nDescription: "+description+"\n";
    }
}
