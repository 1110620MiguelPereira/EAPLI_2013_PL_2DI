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

    @Override
    public void show() {
        ListExpenseTypeController listControllerType = new ListExpenseTypeController();
       
        // TODO utilizar for-each
        for (int i = 0; i < listControllerType.getExpenseTypes().size(); i++) {
            System.out.println(listControllerType.getExpenseTypes().get(i));
        }
        System.out.println("OK");
    }

    @Override
    protected BaseController getController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
