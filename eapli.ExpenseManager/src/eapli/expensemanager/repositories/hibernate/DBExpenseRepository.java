/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author vasco
 */
public class DBExpenseRepository extends JpaHibernateUtil<Expense> implements ExpenseRepository {

    @Override
    public void save(Expense expense) {
        create(expense);
    }

    @Override
    public BigDecimal ExpensesOfWeek(int weekNumber, int year) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BigDecimal expensesOfMonth(int month, int year) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Expense> getListExpenses(Calendar initDate, Calendar finalDate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Expense> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BigDecimal getTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
