/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.repositories.hibernate.DBRepositoryFactory;
import eapli.expensemanager.repositories.inmemory.InMemoryRepositoryFactory;

/**
 *
 * @author Luís
 */
public class PersistenceFactory implements RepositoryFactory{
    static PersistenceFactory _instance = new PersistenceFactory();
    
    private PersistenceFactory(){}
    
    private InMemoryRepositoryFactory inMemory = new InMemoryRepositoryFactory();
    private DBRepositoryFactory db = new DBRepositoryFactory();
    
    
    
    public static PersistenceFactory instance (){
        return _instance;
        
    }
    
    //FALTA LER FICHEIRO DE CONFIGURAÇÃO

    @Override
    public ExpenseRepository getExpenseRepository() {
        return inMemory.getExpenseRepository() ;
    }

    @Override
    public ExpenseTypeRepository getExpenseTypeRepository() {
        return inMemory.getExpenseTypeRepository();
    }

    @Override
    public PaymentMethodRepository getPaymentMethodRepository() {
        return inMemory.getPaymentMethodRepository();
    }

    @Override
    public IncomeTypeRepository getIncomeTypeRepository() {
        return inMemory.getIncomeTypeRepository();
    }

    @Override
    public IncomeRepository getIncomeRepository() {
        return inMemory.getIncomeRepository();
    }
    
    
    
    
    
}
