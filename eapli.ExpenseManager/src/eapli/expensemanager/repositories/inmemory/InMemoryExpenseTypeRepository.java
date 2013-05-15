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
       /**
     * @return the expensesType
     */
    public List<ExpenseType> getExpensesType() {
        return expensesType;
    }
     /**
     *
     * @return
     */
    @Override
    public List<ExpenseType> getAll() {
        return expensesType;
    }
    
    @Override
    public void save(ExpenseType expenseType) {
        expensesType.add(expenseType);
    }

    @Override
    public boolean findById(String shortName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
