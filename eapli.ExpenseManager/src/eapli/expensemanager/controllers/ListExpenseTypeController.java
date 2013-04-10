/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import eapli.expensemanager.repositories.inmemory.InMemoryExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ListExpenseTypeController extends BaseController{

    public List<ExpenseType>  getExpenseTypes() {
        ExpenseTypeRepository etr = RepositoryFactory.instance().getExpenseTypeRepository();
        return etr.getAll();
    }
    
}
