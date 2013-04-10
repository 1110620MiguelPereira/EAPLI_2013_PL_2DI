/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.repositories.inmemory.InMemoryExpenseRepository;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseTypeRepository;
import eapli.expensemanager.repositories.inmemory.InMemoryIncomeTypeRepository;
import eapli.expensemanager.repositories.inmemory.InMemoryPaymentMethodRepository;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RepositoryFactory {
    
    static RepositoryFactory _instance = new RepositoryFactory();
    
    private RepositoryFactory() { }
    
    public static RepositoryFactory instance() {
        return _instance;
    
    }
    public ExpenseRepository getExpenseRepository() {
        return new InMemoryExpenseRepository();
    }
    
    public ExpenseTypeRepository getExpenseTypeRepository() {
        return new InMemoryExpenseTypeRepository();
    }
    
    public PaymentMethodRepository getPaymentMethodRepository() {
        return new InMemoryPaymentMethodRepository();
    }
   
     public IncomeTypeRepository getIncomeTypeRepository() {
        return new InMemoryIncomeTypeRepository();
    }
}
