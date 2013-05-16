/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpenseAgregatedController;
import eapli.expensemanager.model.Agregation;
import eapli.expensemanager.model.ExpenseType;
import eapli.util.Console;
import java.util.Calendar;
import java.util.Map;
import java.util.Iterator;

/**
 *
 * @author Fábio Queirós
 */
class ListExpenseAgregretedUI extends BaseUI {

    ListExpenseAgregatedController listExpenseAgregatedController = new ListExpenseAgregatedController();

    @Override
    public void show() {
        System.out.println("Which is the date range you wish to check? (mm-yyyy)");
        Calendar initDate = Console.readMonthYearFromConsole("Start date: ");
        Calendar finalDate = Console.readMonthYearFromConsole("End date: ");
        if (initDate != null && finalDate != null) {
            ListExpenseAgregatedController eac = new ListExpenseAgregatedController();
            System.out.println("List Expenses Agregated by type:\n");
            Agregation a;
            Map map = eac.getExpensesAgregatedByType(initDate, finalDate);
            if (map != null) {
                Iterator entries = map.entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) entries.next();
                    ExpenseType key = (ExpenseType) entry.getKey();
                    Agregation value = (Agregation) entry.getValue();
                    System.out.println("-> " + key.getType() + ": " + value.getTotal() + "€");
                }
            }
        } else {
            System.out.println("Invalid Date");
        }
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listExpenseAgregatedController;
    }
}
