/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;
import eapli.util.DateTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author António
 */
public class ExpenseTest {
    
    public ExpenseTest() {
    }
    
    @Test
    public void testOccursAt() {
        System.out.println("occursAt");        
        PaymentMethodCreditCard creditCard = new PaymentMethodCreditCard("1111 2222 3333 4444","CGD");
        int year = 2013;
        int weekNumber = 17;
        BigDecimal amount=new BigDecimal(12); 
        ExpenseType exp=new ExpenseType("compras","compras do mes");
        Expense instance = new Expense(amount,"expense",24,4,2013,creditCard,exp);
        boolean expResult = true;
        boolean result = instance.occursAt(year, weekNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testOccursAtMonth() {
        System.out.println("occursAtMonth");
        PaymentMethodCreditCard creditCard = new PaymentMethodCreditCard("1111 2222 3333 4444","CGD");
        int month = 4;
        int year = 2013;
        BigDecimal amount=new BigDecimal(12); 
        ExpenseType exp=new ExpenseType("compras","compras do mes");
        Expense instance = new Expense(amount,"expense",24,4,2013,creditCard,exp);
        boolean expResult = true;
        boolean result = instance.occursAtMonth(month, year);
        assertEquals(expResult, result);
    }
    @Test
    public void testoccursBetweenDates() throws ParseException{
        System.out.println("occursBetweenDates\n");
        PaymentMethodCreditCard creditCard = new PaymentMethodCreditCard("1111 2222 3333 4444","CGD");
        String strDateInit="01-04-2013";
        String strDatefinal="01-06-2013";
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
         Date dateinit =df.parse(strDateInit);
         Date datefinal =df.parse(strDatefinal);          
        Calendar initDate=DateTime.dateToCalendar(dateinit);
        Calendar finalDate=DateTime.dateToCalendar(datefinal);        
        BigDecimal amount=new BigDecimal(12); 
        ExpenseType exp=new ExpenseType("compras","compras do mes");
        Expense instance = new Expense(amount,"expense",24,4,2013,creditCard,exp);
        boolean expResult = true;
        boolean result = instance.occursBetweenDates(initDate,finalDate);
        assertEquals(expResult, result);
    }
}