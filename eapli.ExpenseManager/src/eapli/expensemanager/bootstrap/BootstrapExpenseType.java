/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;


/**
 *
 * @author Luís
 */
public class BootstrapExpenseType {
    
     public void createExpenseType()
    {
    ExpenseTypeRepository repositorio = PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseTypeRepository();
    
    ExpenseType expense = new ExpenseType("Supermercado","Compras ");
    ExpenseType expense1 = new ExpenseType("Restaurante","Jantar ");
    
   repositorio.save(expense);
   repositorio.save(expense1);
    }
}
