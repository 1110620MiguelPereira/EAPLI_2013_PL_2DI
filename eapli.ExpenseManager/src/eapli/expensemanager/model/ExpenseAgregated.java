/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fábio Queirós
 */

public class ExpenseAgregated {

    Map<ExpenseType, Agregation> map = new HashMap() {
    };

    void Agregated(Expense e) {
        Agregation agreg = new Agregation();
        if (map.containsKey(e.getExpenseType())) {
            agreg = map.get(e.getExpenseType());

        } else {

            map.put(e.getExpenseType(), agreg);
        }
        agreg.add(e);

    }

    Map<ExpenseType, Agregation> getMap() {
        return map;
    }
}
