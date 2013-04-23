/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import eapli.expensemanager.model.PaymentMethod.types;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class Expense extends Movement {
    private types paymentMethod;
    private ExpenseType expenseType;

     public Expense(BigDecimal amount, String description, int day,int month,int year, types paymentMethod,ExpenseType expType) {
        super(amount, description, day, month, year);
        
        this.paymentMethod=paymentMethod;
        this.expenseType=expType;
        //types type = types.CASH;
        // types 
    }
    
    public boolean occursAt(int year, int weekNumber) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.WEEK_OF_YEAR)==weekNumber;
    }
    public boolean occursAtMonth(int month, int year) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.MONTH)+1==month;         
    }
}
