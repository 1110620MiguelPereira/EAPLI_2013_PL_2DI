/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;

/**
 *
 * @author Adulcinio
 */
public class RegisterIncomeTypeController extends BaseController{

    public void registerIncomeType(String type, String description) {
        IncomeType incType = new IncomeType(type, description);
 
        IncomeTypeRepository repo = PersistenceFactory.instance().buildRepositoryFactory().getIncomeTypeRepository();
        repo.save(incType);
    }
    
}
