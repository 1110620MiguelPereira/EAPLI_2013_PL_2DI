package eapli.expensemanager.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.PaymentMethod.types;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joel
 */
public class ExpenseTest {
    
    public ExpenseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAmount method, of class Expense.
     */
    /**
     * Test of compareDateMonthYear method, of class Expense.
     */
    @Test
    public void occrusAtMonth() {
        System.out.println("occursAtMonth");
        int month = 3;
        int year = 2012;
        types tCash=types.CASH;
        Expense instance = new Expense(new BigDecimal("123"),"Corn",2,3,2012,tCash);
        boolean expResult = true;
        boolean result = instance.occursATMonth(month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Expense.
     */
}