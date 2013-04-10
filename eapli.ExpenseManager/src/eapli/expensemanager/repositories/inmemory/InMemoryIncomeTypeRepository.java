/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adulcinio
 */
public class InMemoryIncomeTypeRepository implements IncomeTypeRepository{

    static List<IncomeType> incomeTypes = new ArrayList<IncomeType>();
       /**
     * @return the expensesType
     */
    public static List<IncomeType> getIncomesType() {
        return incomeTypes;
    }
     /**
     *
     * @return
     */
    @Override
    public List<IncomeType> getAll() {
        return incomeTypes;
    }
    
    @Override
    public void save(IncomeType incType) {
        incomeTypes.add(incType);
    }
    
}
