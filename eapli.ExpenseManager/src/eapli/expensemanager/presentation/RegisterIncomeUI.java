/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterIncomeController;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.model.PaymentMethod.types;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author António
 */
class RegisterIncomeUI extends BaseUI{

    RegisterIncomeController controller = new RegisterIncomeController();
    public RegisterIncomeUI() {
    }
    
    public void show() {
        BigDecimal amount = Console.readBigDecimal("Amount:");
        String description = Console.readLineFromConsole("Description:");
        int day = Console.readIntegerFromConsole("Day:");
        int month = Console.readIntegerFromConsole("Month:");
        int year = Console.readIntegerFromConsole("Year:");
        
        
        System.out.println("Lista de Tipos de Receita:\n");

        IncomeType incType = askForIncomeType();
        controller.registerIncome(amount, description, day,month,year, incType);
        System.out.println("OK");
        super.show();
    }

    private IncomeType askForIncomeType() {
    
        // TODO avoid duplicate code with ListExpensetypeUI
        List<IncomeType> expensesType_Aux=controller.getIncomeTypes();
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
    
    
    @Override
    protected BaseController getController() {
        return controller;
    }    
    
}
