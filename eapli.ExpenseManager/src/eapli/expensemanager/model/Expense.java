/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class Expense {

    private BigDecimal amount;
    private String description;
    private Date date;
    
    public Expense(BigDecimal amount, String description) {
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
    }
    public Expense(BigDecimal amount, String description,int day,int mounth,int year) {
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
        this.date=DateTime.newDate(year, mounth, day);
    }
    public Date getDate(){
        return date;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    public String toString(){
        return "Amount: "+amount+"\nDate: "+date+"\nDescription: "+description+"\n";
    }
}
