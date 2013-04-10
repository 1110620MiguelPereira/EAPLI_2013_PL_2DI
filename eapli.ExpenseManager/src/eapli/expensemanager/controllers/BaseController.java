/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.repositories.RepositoryFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author António
 */
public class BaseController {

    public BigDecimal ExpensesOfWeek() { 
        return RepositoryFactory.instance().getExpenseRepository().ExpensesOfWeek(DateTime.currentWeekNumber(), DateTime.currentYear());
    }
    public BigDecimal expensesOfThisMonth() {
        return RepositoryFactory.instance().getExpenseRepository().expensesOfMonth(DateTime.currentMonth(), DateTime.currentYear());
    }
}
