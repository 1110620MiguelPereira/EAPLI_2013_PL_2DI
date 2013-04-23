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
public class IncomeTypeTest {
    
    public IncomeTypeTest() {
    }

    @Test
    public void testIncomeTypeInvalidType() {
        try {
            String type = "";
            String desc = "Desc";
            IncomeType it = new IncomeType(type, desc);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testIncomeTypeInvalidDescription() {
        try {
            String type = "type";
            String desc = null;
            IncomeType it = new IncomeType(type, desc);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testIncomeTypeValidData() {
        try {
            String type = "type";
            String desc = "Desc";
            IncomeType it = new IncomeType(type, desc);            
        } catch (Exception e) {
            fail("IllegalArgumentException not expected");
        }
    }
}