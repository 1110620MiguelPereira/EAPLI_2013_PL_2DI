/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.RepositoryFactory;
import java.util.List;

/**
 *
 * @author Pedro Branco
 */
public class ListIncomeTypeController extends BaseController{
    
    public List<IncomeType>  getIncomeTypes() {
        IncomeTypeRepository etr = RepositoryFactory.instance().getIncomeTypeRepository();
        return etr.getAll();
    }
}
