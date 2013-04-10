/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.Expense;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public interface ExpenseRepository {
    public void save(Expense expense);
    public List<Expense> getListExpenses(int month,int year);
}
