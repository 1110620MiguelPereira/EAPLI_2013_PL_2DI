/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.model.PaymentMethod.types;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author António
 */
public class Income {
    private BigDecimal amount;
    private String description;
    private Calendar date;
    private IncomeType incomeType;

    
    public Income(BigDecimal amount, String description, int day,int month,int year, IncomeType incType) {
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
        this.date=DateTime.newCalendarDate(year, month, day);
        this.incomeType=incType;
    }
}
