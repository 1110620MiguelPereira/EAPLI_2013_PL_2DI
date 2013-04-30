/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class IncomeTest {
    
    public IncomeTest() {
    }

    @Test
    public void testValidIncome() {
        try {
            BigDecimal amount=new BigDecimal(12);
            IncomeType it = new IncomeType("type", "desc");
            Income inc = new Income(amount, "Descpt", 30, 04, 2013, it);
        } catch (Exception e) {
            fail("Expected IllegalArgumentException");
        }
    }
}