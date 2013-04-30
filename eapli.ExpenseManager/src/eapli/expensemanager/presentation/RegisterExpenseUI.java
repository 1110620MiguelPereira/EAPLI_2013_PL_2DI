/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.RegisterExpenseController;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseTypeRepository;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;
import eapli.expensemanager.model.PaymentMethod.types;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;

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
        System.out.println("Escolha um meio de pagamento:\n");
        PaymentMethod paymentMethod = askForPaymentMethod();
        System.out.println("Escolha um tipo de despesa:\n");
        ExpenseType expType = askForExpenseType();
               
        controller.registerExpense(amount, description, day,month,year, paymentMethod,expType);

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
            if(!exit) System.out.println("Invalid Option");
        } while (!exit) ;
        
        return expensesType_Aux.get(option-1);
    
    }
    
    
    private PaymentMethod askForPaymentMethod() {
    
        // TODO avoid duplicate code with ListExpensetypeUI
        List<PaymentMethod> paymentMethod_Aux=controller.getPaymentMethods();
        int paymentMethodsCount = paymentMethod_Aux.size();
    
        boolean exit = false;
        int option;
        
        do {
            for(int i=0;i<paymentMethodsCount;i++) {
                System.out.println(i+1+" : "+paymentMethod_Aux.get(i).toString());
            }
            option = Console.readIntegerFromConsole("Enter payment method number:"); 
            if(option-1<paymentMethodsCount) exit=true;
            if(!exit) System.out.println("Invalid Option");
        } while (!exit) ;
        
        return paymentMethod_Aux.get(option-1);
    
    }
}
