/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.Expense;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public interface ExpenseRepository {
    public void save(Expense expense);
    public BigDecimal ExpensesOfWeek(int weekNumber, int year);
    public BigDecimal expensesOfMonth(int month, int year);
    public List<Expense> getListExpenses(Calendar initDate, Calendar finalDate);
    public List<Expense> getAll();
    public BigDecimal getTotal();
}
