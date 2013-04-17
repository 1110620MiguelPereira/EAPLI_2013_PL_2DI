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
    RegisterExpenseTypeController controllerType = new RegisterExpenseTypeController();
    @Override
    public void show() {
        super.show();
        controllerType.registerExpenseType(super.type,super.description);
        System.out.println("OK!");        
    } 

    @Override
     protected BaseController getController() {
        return controllerType;
    }
        
}
