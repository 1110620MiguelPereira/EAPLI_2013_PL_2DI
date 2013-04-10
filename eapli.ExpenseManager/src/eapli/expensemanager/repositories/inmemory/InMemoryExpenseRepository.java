/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
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
     public List<Expense> getListExpenses(int month,int year){
         
         List<Expense> listExpenseMonth=new ArrayList<Expense>();
         for(Expense e:expenses){
            if(e.occursATMonth(month, year))
                listExpenseMonth.add(e);
               }
         return listExpenseMonth;
     }
    
}
