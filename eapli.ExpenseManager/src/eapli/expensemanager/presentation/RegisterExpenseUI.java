/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterExpenseController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
class RegisterExpenseUI extends BaseUI{

    void show() {
        BigDecimal amount = Console.readBigDecimal("Amount:");
        String description = Console.readLineFromConsole("Description:");
        
        RegisterExpenseController controller = new RegisterExpenseController();
        controller.registerExpense(amount, description);
        
        System.out.println("OK");
    }
    
}
