/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.RepositoryFactory;


/**
 *
 * @author Pedro Branco
 */
public class BootstrapIncomeType {
    
     public void createIncomeType()
    {
    IncomeTypeRepository repositorio = RepositoryFactory.instance().getIncomeTypeRepository();
    
    IncomeType income = new IncomeType("Salário","Salário mensal");
    IncomeType income1 = new IncomeType("Bonus","Bonus salarial");
    IncomeType income2 = new IncomeType("Mesada","Mesada");
    
   repositorio.save(income);
   repositorio.save(income1);
    }
}
