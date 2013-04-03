/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public interface ExpenseTypeRepository {
    
    public void save(ExpenseType expenseType);
    public List<ExpenseType> getAll();
   
    }

