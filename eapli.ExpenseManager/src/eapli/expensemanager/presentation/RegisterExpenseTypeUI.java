/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterExpenseTypeController;
import eapli.util.Console;

/**
 *
 * @author Adulcinio
 */
class RegisterExpenseTypeUI extends BaseRegisterTypesUI   {

    @Override
    public void show() {
        
        super.show();
        RegisterExpenseTypeController controllerType = new RegisterExpenseTypeController();
        controllerType.registerExpenseType(super.type,super.description);
        
        System.out.println("OK!");
    } 

    @Override
    protected BaseController getController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
