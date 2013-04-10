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
        super.show();
        BigDecimal amount = Console.readBigDecimal("Amount:");
        String description = Console.readLineFromConsole("Description:");
        int day = Console.readIntegerFromConsole("Day:");
        int month = Console.readIntegerFromConsole("Month:");
        int year = Console.readIntegerFromConsole("Year:");
        int menu = Console.readIntegerFromConsole("1 - Cash \n2 - Credit Card \n3 - Debit Card \n4 - Check");
        
       List<ExpenseType> expensesType_Aux=InMemoryExpenseTypeRepository.getExpensesType();
        
        System.out.println("Lista de Tipos de Despesa:\n");
        System.out.println(expensesType_Aux.size());
        for(int i=0;i<expensesType_Aux.size();i++) {
            System.out.println(i+1+" : "+expensesType_Aux.get(i).toString2());
        }
        
        int optionType;
        do {
              optionType= Console.readIntegerFromConsole("Enter type number:"); 
            
        } while (!(optionType>0) && !(optionType<expensesType_Aux.size()+1));
        
        ExpenseType expType=expensesType_Aux.get(optionType-1);
               
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
        
    }

   // @Override
    protected BaseController getController() {
        return controller;
    }
    
}
