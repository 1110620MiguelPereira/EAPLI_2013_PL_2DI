/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
//import java.util.Date;
//import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.model.PaymentMethod.types;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class Expense {

    private BigDecimal amount;
    private String description;
    private Calendar date;
    private types paymentMethod;
    private ExpenseType expenseType;

     public Expense(BigDecimal amount, String description, int day,int month,int year, types paymentMethod,ExpenseType expType) {
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
        this.paymentMethod=paymentMethod;
        this.date=DateTime.newCalendarDate(year, month, day);
        this.paymentMethod=paymentMethod;
        this.expenseType=expType;
        //types type = types.CASH;
        // types 
    }

    public BigDecimal getAmount(){
        return amount;
    }
   
    public String toString(){
        return "Amount: "+amount+"\nDate: "+date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR)+"\nDescription: "+description+"\n";
    }
    
    public boolean occursAt(int year, int weekNumber) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.WEEK_OF_YEAR)==weekNumber;
    }
    public boolean occursAtMonth(int month, int year) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.MONTH)+1==month;         
    }
}
