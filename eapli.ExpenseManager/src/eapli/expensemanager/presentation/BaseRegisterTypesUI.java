/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterExpenseController;
import eapli.expensemanager.controllers.RegisterExpenseTypeController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Adulcínio
 */
public abstract class BaseRegisterTypesUI extends BaseUI   {
    
     String type;
     String description;
    
    @Override
    public void  show() {
        type = Console.readLineFromConsole("Type:");
        description = Console.readLineFromConsole("Description:");
        super.show();
    }
}
