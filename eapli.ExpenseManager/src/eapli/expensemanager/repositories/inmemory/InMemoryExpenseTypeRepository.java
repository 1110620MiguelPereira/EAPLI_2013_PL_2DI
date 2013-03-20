/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.repositories.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryExpenseTypeRepository implements ExpenseTypeRepository{

    static List<ExpenseType> expensesType = new ArrayList<ExpenseType>();
    
    
    @Override
    public void save(ExpenseType expenseType) {
        expensesType.add(expenseType);
    }
    
}
