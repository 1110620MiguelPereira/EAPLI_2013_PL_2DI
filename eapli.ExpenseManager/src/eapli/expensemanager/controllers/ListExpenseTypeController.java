/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Fábio Queirós
 */
public class ListExpenseTypeController extends BaseController{

    public List<ExpenseType>  getExpenseTypes() {
        ExpenseTypeRepository etr = PersistenceFactory.instance().buildRepositoryFactory().getExpenseTypeRepository();
        return etr.getAll();
    }
    
}
