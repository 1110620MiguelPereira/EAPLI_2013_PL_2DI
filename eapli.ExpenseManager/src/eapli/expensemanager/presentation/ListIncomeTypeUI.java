/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListIncomeTypeController;

/**
 *
 * @author Pedro Branco
 */
public class ListIncomeTypeUI extends BaseUI{
    ListIncomeTypeController listControllerType = new ListIncomeTypeController();

    @Override
    public void show() {      
        // TODO usar for-each
        // TODO ver cimo evitar duplicação com ListExpenseType
        for (int i = 0; i < listControllerType.getIncomeTypes().size(); i++) {
            System.out.println(listControllerType.getIncomeTypes().get(i));
        }
        System.out.println("OK");
        super.show();
    }
    
    @Override
    protected BaseController getController() {
        return listControllerType;
    }
    
}
