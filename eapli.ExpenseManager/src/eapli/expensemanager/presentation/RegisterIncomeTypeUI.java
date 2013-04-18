/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterIncomeTypeController;

/**
 *
 * @author Adulcinio
 */
class RegisterIncomeTypeUI extends BaseRegisterTypesUI   {
RegisterIncomeTypeController controllerType = new RegisterIncomeTypeController();
    @Override
    public void show() {       
        super.show();
        controllerType.registerIncomeType(super.type,super.description);
        System.out.println("OK!");
    }

    @Override
    protected BaseController getController() {
        return controllerType;
    }
}
