/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.model.PaymentMethod.types;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author António
 */
public class RegisterIncomeController extends BaseController{
    
   public void registerIncome(BigDecimal amount, String description, int day,int month,int year, IncomeType typeIncome) {
        Income income = new Income(amount, description,day,month,year, typeIncome);
        
        IncomeRepository repo = RepositoryFactory.instance().getIncomeRepository();
        repo.save(income);
    }    
    
    public List<IncomeType> getIncomeTypes() {
        return RepositoryFactory.instance().getIncomeTypeRepository().getAll();
    }
    
}
