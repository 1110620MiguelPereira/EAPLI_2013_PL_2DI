/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import eapli.expensemanager.model.PaymentMethod.types;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
public class Expense extends Movement implements Serializable {
   
    // @ManyToOne(cascade = CascadeType.PERSIST)
    //TODO quando o mapeamento da interface paymentMethod 
    //..e as classes que a implementam estiver realizado descomentar a linha acima e retirar o transient
   
    @Transient
     private PaymentMethod paymentMethod;
  
    @ManyToOne(cascade = CascadeType.PERSIST)
    private ExpenseType expenseType;

    public Expense() {
    }

     public Expense(BigDecimal amount, String description, int day,int month,int year, PaymentMethod methodPayment,ExpenseType expType) {
        super(amount, description, day, month, year);
        
        this.paymentMethod=methodPayment;
        this.expenseType=expType;
    }
    
    public boolean occursAt(int year, int weekNumber) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.WEEK_OF_YEAR)==weekNumber;
    }
    public boolean occursAtMonth(int month, int year) {
        return date.get(Calendar.YEAR)==year && date.get(Calendar.MONTH)+1==month;         
    }
    public boolean occursBetweenDates(Calendar initDate,Calendar finalDate){
       
        int month_date=date.get(Calendar.MONTH)+1;
        int year_date=date.get(Calendar.YEAR);
        int month_initDate=initDate.get(Calendar.MONTH)+1;
        int year_initDate =initDate.get(Calendar.YEAR);
        int month_finalDate=finalDate.get(Calendar.MONTH)+1;
        int year_finalDate =finalDate.get(Calendar.YEAR);
        if((month_date>=month_initDate && year_date>=year_initDate) &&((month_date<=month_finalDate || month_finalDate<=month_date) && year_date<=year_finalDate) ){
            return true;
        }
        return false;
    }

}
