/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
    }

    @Test
    public void testExpenseTypeInvalidType() {
        try {
            String type = "";
            String desc = "Desc";
            ExpenseType it = new ExpenseType(type, desc);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testExpenseTypeInvalidDescription() {
        try {
            String type = "type";
            String desc = null;
            ExpenseType it = new ExpenseType(type, desc);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testExpenseTypeValidData() {
        try {
            String type = "type";
            String desc = "Desc";
            ExpenseType it = new ExpenseType(type, desc);            
        } catch (Exception e) {
            fail("IllegalArgumentException not expected");
        }
    }
}