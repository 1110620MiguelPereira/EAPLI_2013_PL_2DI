/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import eapli.expensemanager.repositories.hibernate.DBRepositoryFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterExpenseController extends BaseController{

    public void registerExpense(BigDecimal amount, String description, int day,int month,int year, PaymentMethod methodPayment, ExpenseType typeExpense) {
        Expense expense = new Expense(amount, description,day,month,year,methodPayment,typeExpense);
        
        ExpenseRepository repo = PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository();
        repo.save(expense);
    }

    public List<ExpenseType> getExpenseTypes() {
        return PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseTypeRepository().getAll();
    }
    
    public List<PaymentMethod> getPaymentMethods() {
        return PersistenceFactory.instance().buildRepositoryFactory(false).getPaymentMethodRepository().getAll();
    }
    
}
