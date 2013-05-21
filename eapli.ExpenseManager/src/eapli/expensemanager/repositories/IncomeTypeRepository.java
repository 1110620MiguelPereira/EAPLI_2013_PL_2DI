/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.IncomeType;
import java.util.List;

/**
 *
 * @author Adulcinio
 */
public interface IncomeTypeRepository {
    public boolean findById(String shortName);
    public void save(IncomeType expenseType);
    public List<IncomeType> getAll();
}
