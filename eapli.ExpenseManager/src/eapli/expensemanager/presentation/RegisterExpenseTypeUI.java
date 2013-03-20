/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterExpenseTypeController;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
class RegisterExpenseTypeUI {

    void show() {
        String type = Console.readLineFromConsole("Type:");
        String description = Console.readLineFromConsole("Description:");
        
        RegisterExpenseTypeController controllerType = new RegisterExpenseTypeController();
        controllerType.registerExpenseType(type, description);
        
        System.out.println("OK");
    }
    
}
