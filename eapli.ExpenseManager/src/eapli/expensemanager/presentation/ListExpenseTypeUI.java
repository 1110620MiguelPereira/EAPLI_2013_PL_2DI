/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpenseTypeController;
import eapli.expensemanager.model.ExpenseType;

/**
 *
 * @author Adulcinio
 */
class ListExpenseTypeUI extends BaseUI{
    ListExpenseTypeController listControllerType = new ListExpenseTypeController();
    @Override
    public void show() {       
        
        for (ExpenseType obj: listControllerType.getExpenseTypes()){
            System.out.println(obj);
        }
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listControllerType;
    }   
}
