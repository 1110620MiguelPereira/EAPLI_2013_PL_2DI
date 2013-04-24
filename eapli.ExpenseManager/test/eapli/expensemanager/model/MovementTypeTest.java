/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author António
 */
public class MovementTypeTest {
    
    public MovementTypeTest() {
    }
    
    @Test
    public void testGetType() {
        System.out.println("getType");
        IncomeType instance=new IncomeType("salario", "salario recebido");
        String expResult = "salario";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class MovementType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IncomeType instance=new IncomeType("salario", "salario recebido");
        String expResult = "\nType: salario\nDescription: salario recebido";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}