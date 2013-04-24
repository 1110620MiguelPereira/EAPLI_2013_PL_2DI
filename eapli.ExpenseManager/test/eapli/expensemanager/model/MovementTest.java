/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author António
 */
public class MovementTest {
    
    public MovementTest() {
    }

    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Income instance=new Income(new BigDecimal(16),"teste",24,4,2013,new IncomeType("salario","salario do mes"));
        BigDecimal expResult = new BigDecimal(16);
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Movement.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Income instance=new Income(new BigDecimal(16),"teste",24,4,2013,new IncomeType("salario","salario do mes"));
        String expResult = "Amount: 16\nDate: 24/4/2013\nDescription: teste\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    public class MovementImpl extends Movement {

        public MovementImpl() {
            super(null, "", 0, 0, 0);
        }
    }
}