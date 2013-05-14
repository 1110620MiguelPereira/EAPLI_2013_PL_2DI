/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Pedro Branco
 */
public class ListIncomesController extends BaseController{
   
    public List<Income>  getAllIncomes() {
        IncomeRepository etr = PersistenceFactory.instance().buildRepositoryFactory(false).getIncomeRepository();
        return etr.getAll();
    }
    
}
