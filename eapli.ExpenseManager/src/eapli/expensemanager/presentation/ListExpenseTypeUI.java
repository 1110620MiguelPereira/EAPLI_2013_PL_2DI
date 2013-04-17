/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListExpenseTypeController;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ListExpenseTypeUI extends BaseUI{
ListExpenseTypeController listControllerType = new ListExpenseTypeController();
    @Override
    public void show() {       
        // TODO utilizar for-each
        for (int i = 0; i < listControllerType.getExpenseTypes().size(); i++) {
            System.out.println(listControllerType.getExpenseTypes().get(i));
        }
        System.out.println("OK");
        super.show();
    }

    @Override
    protected BaseController getController() {
        return listControllerType;
    }
    
}
