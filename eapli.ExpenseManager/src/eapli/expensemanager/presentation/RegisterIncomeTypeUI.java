/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterIncomeTypeController;
import eapli.util.Console;

/**
 *
 * @author Adulcinio
 */
class RegisterIncomeTypeUI extends BaseRegisterTypesUI   {

    void show() {
        
       super.show();
        RegisterIncomeTypeController controllerType = new RegisterIncomeTypeController();
       controllerType.registerIncomeType(super.type,super.description);
        
        System.out.println("OK!");
    } 
}
