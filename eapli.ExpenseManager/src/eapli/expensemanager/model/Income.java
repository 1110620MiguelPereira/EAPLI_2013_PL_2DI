/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.model.PaymentMethod.types;
import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author António
 */
@Entity
public class Income extends Movement implements Serializable{
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private IncomeType incomeType;

    public Income() {
    }

    
    public Income(BigDecimal amount, String description, int day,int month,int year, IncomeType incType) {
        super(amount, description, day, month, year);
        this.incomeType=incType;
    }
}
