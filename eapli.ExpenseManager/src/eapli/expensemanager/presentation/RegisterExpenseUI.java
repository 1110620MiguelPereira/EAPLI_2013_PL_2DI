/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterExpenseController;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseTypeRepository;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;
import eapli.expensemanager.model.PaymentMethod.types;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterExpenseUI extends BaseUI {
    RegisterExpenseController controller = new RegisterExpenseController();
    
  //  @Override
    public void show() {
        BigDecimal amount = Console.readBigDecimal("Amount:");
        String description = Console.readLineFromConsole("Description:");
        int day = Console.readIntegerFromConsole("Day:");
        int month = Console.readIntegerFromConsole("Month:");
        int year = Console.readIntegerFromConsole("Year:");
        System.out.println("Payment methods");
        int menu = Console.readIntegerFromConsole("1 - Cash \n2 - Credit Card \n3 - Debit Card \n4 - Check");
        
        
        System.out.println("Lista de Tipos de Despesa:\n");

        ExpenseType expType = askForExpenseType();
               
        switch(menu){
            case 1:
                controller.registerExpense(amount, description, day,month,year, types.CASH,expType); break;
            case 2:
                controller.registerExpense(amount, description, day,month,year, types.CREDITCARD,expType); break;
            case 3:
                controller.registerExpense(amount, description, day,month,year, types.DEBITCARD,expType); break;
            case 4:
                controller.registerExpense(amount, description, day,month,year, types.CHECK,expType); break;
        }        
        System.out.println("OK");
        super.show();
    }

   // @Override
    protected BaseController getController() {
        return controller;
    }
    
    private ExpenseType askForExpenseType() {
    
        // TODO avoid duplicate code with ListExpensetypeUI
        List<ExpenseType> expensesType_Aux=controller.getExpenseTypes();
        int expenseTypesCount = expensesType_Aux.size();
    
        boolean exit = false;
        int option;
        
        do {
            for(int i=0;i<expenseTypesCount;i++) {
                System.out.println(i+1+" : "+expensesType_Aux.get(i).getType());
            }
            option = Console.readIntegerFromConsole("Enter type number:"); 
            if(option-1<expenseTypesCount) exit=true;
            if(!exit) System.out.println("Opção inválida");
        } while (!exit) ;
        
        return expensesType_Aux.get(option-1);
    
    }
    
}
