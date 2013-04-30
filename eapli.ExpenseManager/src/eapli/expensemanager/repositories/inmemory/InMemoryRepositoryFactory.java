/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.RepositoryFactory;


/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryRepositoryFactory implements RepositoryFactory{
        
    public InMemoryRepositoryFactory() { }
    
    @Override
    public ExpenseRepository getExpenseRepository() {
        return new InMemoryExpenseRepository();
    }
    
    @Override
    public ExpenseTypeRepository getExpenseTypeRepository() {
        return new InMemoryExpenseTypeRepository();
    }
    
    @Override
    public PaymentMethodRepository getPaymentMethodRepository() {
        return new InMemoryPaymentMethodRepository();
    }
   
    @Override
     public IncomeTypeRepository getIncomeTypeRepository() {
        return new InMemoryIncomeTypeRepository();
    }

    @Override
    public IncomeRepository getIncomeRepository() {
        return new InMemoryIncomeRepository();
    
}
}
