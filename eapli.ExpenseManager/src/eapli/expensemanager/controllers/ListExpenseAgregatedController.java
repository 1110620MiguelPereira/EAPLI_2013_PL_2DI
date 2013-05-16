/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.AccountServices;
import eapli.expensemanager.model.Agregation;
import eapli.expensemanager.model.ExpenseType;
import java.util.Calendar;
import java.util.Map;

/**
 *
 * @author Fábio Queirós
 */
public class ListExpenseAgregatedController extends BaseController {

    public Map<ExpenseType, Agregation> getExpensesAgregatedByType(Calendar initDate, Calendar finalDate) {
        Map<ExpenseType, Agregation> map = new AccountServices().getExpenseAgregationByType(initDate, finalDate);
        return map;
    }
}
