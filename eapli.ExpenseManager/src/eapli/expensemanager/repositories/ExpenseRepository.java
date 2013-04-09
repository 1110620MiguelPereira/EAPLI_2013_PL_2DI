/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.Expense;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public interface ExpenseRepository {
    public void save(Expense expense);
    public BigDecimal ExpensesOfWeek(int weekNumber, int year);
}
