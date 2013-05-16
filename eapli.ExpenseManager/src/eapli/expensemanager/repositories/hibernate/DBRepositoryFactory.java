/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.RepositoryFactory;

/**
 *
 * @author Luís
 */
public class DBRepositoryFactory implements RepositoryFactory{

    
    public DBRepositoryFactory(){}
    
    
    @Override
    public ExpenseRepository getExpenseRepository() {
        return new DBExpenseRepository();
    }

    @Override
    public ExpenseTypeRepository getExpenseTypeRepository() {
        return new DBExpenseTypeRepository();
    }

    @Override
    public PaymentMethodRepository getPaymentMethodRepository() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IncomeTypeRepository getIncomeTypeRepository() {
       return new DBIncomeTypeRepository();
    }

    @Override
    public IncomeRepository getIncomeRepository() {
        return new DBIncomeRepository();
    }
    
}
