/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.Income;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author António
 */
public interface IncomeRepository {
    public void save(Income income);
    public List<Income> getAll();
    public BigDecimal getTotal();
}
