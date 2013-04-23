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
public class Income extends Movement{
    private IncomeType incomeType;

    
    public Income(BigDecimal amount, String description, int day,int month,int year, IncomeType incType) {
        super(amount, description, day, month, year);
        this.incomeType=incType;
    }
}
