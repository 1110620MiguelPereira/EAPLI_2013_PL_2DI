/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fábio Queirós
 */
public class Agregation {

    private BigDecimal total = BigDecimal.ZERO;
    List<Expense> exp = new ArrayList<Expense>();

    void add(Expense e) {
        exp.add(e);
        total = total.add(e.getAmount());
    }

    public BigDecimal getTotal() {
        return total;
    }
}
