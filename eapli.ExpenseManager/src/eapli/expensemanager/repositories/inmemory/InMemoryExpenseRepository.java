/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryExpenseRepository implements ExpenseRepository{

    static List<Expense> expenses = new ArrayList<Expense>();
    
    @Override
    public void save(Expense expense) {
        expenses.add(expense);
    }

    @Override
    public BigDecimal ExpensesOfWeek(int weekNumber, int year) {
        BigDecimal sum = new BigDecimal(0.00);
        for(Expense e: expenses){
            if(e.occursAt(year, weekNumber)){
                sum = sum.add(e.getAmount());
            }
        }
        return sum;
    }
    
    @Override
    public List<Expense> getListExpenses(){
        return expenses;
    }
    
}
