/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Pedro
 */
public class AccountServices {

    private BigDecimal balance;

    public AccountServices() {
        balance = new BigDecimal(0.0);
    }

    public AccountServices(BigDecimal initialValue) {
        balance = initialValue;
    }

    public BigDecimal getCurrentBalance() {
        IncomeRepository incr = PersistenceFactory.instance().buildRepositoryFactory().getIncomeRepository();
        ExpenseRepository expr = PersistenceFactory.instance().buildRepositoryFactory().getExpenseRepository();
        balance = incr.getTotal().subtract(expr.getTotal());
        return balance;
    }

    public Map<ExpenseType, Agregation> getExpenseAgregationByType(Calendar initDate, Calendar finalDate) {
        ExpenseRepository expr = PersistenceFactory.instance().buildRepositoryFactory().getExpenseRepository();
        List<Expense> expenses = expr.getListExpenses(initDate, finalDate);
        ExpenseAgregated eag = new ExpenseAgregated();
        for (Expense e : expenses) {
            eag.Agregated(e);
        }
        return eag.getMap();
    }
}
