/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpenseTypeController;
import eapli.expensemanager.controllers.ListIncomesController;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Income;

/**
 *
 * @author Pedro
 */
class ListIncomesUI extends BaseUI{

    ListIncomesController listControllerIncome = new ListIncomesController();
    
    @Override
    public void show() {       
        for (Income obj: listControllerIncome.getAllIncomes()){
            System.out.println(obj);
        }
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listControllerIncome;
    }   

    
    
    
}
