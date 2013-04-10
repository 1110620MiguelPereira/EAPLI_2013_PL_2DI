/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterExpenseController;
import eapli.expensemanager.model.PaymentMethod.types;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
class RegisterExpenseUI extends BaseUI{
    RegisterExpenseController controller = new RegisterExpenseController();
    
    @Override
    public void show() {
        super.show();
        BigDecimal amount = Console.readBigDecimal("Amount:");
        String description = Console.readLineFromConsole("Description:");
        int day = Console.readIntegerFromConsole("Day:");
        int month = Console.readIntegerFromConsole("Month:");
        int year = Console.readIntegerFromConsole("Year:");
        int menu = Console.readIntegerFromConsole("1 - Cash \n2 - Credit Card \n3 - Debit Card \n4 - Check");
        
        switch(menu){
            case 1:
                controller.registerExpense(amount, description, day,month,year, types.CASH); break;
            case 2:
                controller.registerExpense(amount, description, day,month,year, types.CREDITCARD); break;
            case 3:
                controller.registerExpense(amount, description, day,month,year, types.DEBITCARD); break;
            case 4:
                controller.registerExpense(amount, description, day,month,year, types.CHECK); break;
        }        
        System.out.println("OK");
        
    }

    @Override
    protected BaseController getController() {
        return controller;
    }
    
}
