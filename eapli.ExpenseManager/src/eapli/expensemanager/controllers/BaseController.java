/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.repositories.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author António
 */
public class BaseController {

    public BigDecimal ExpensesOfWeek() { 
        return PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository().ExpensesOfWeek(DateTime.currentWeekNumber(), DateTime.currentYear());
    }
    public BigDecimal expensesOfThisMonth() {
        return PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository().expensesOfMonth(DateTime.currentMonth(), DateTime.currentYear());
    }
}
