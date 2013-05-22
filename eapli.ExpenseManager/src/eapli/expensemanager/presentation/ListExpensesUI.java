/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpenseTypeController;
import eapli.expensemanager.controllers.ListExpensesController;
import eapli.expensemanager.controllers.ListIncomesController;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Income;

/**
 *
 * @author Cristiano
 */
class ListExpensesUI extends BaseUI{

    ListExpensesController listControllerExpense = new ListExpensesController();
    
    @Override
    public void show() {       
        for (Expense obj: listControllerExpense.getAllExpenses()){
            System.out.println(obj);
        }
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listControllerExpense;
    }   

    
    
    
}