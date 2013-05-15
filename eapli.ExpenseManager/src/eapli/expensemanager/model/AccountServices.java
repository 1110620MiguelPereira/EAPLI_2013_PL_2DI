/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class AccountServices {
    
    private BigDecimal balance;
    
    public AccountServices(){
        balance = new BigDecimal(0.0);
    }
    
    public AccountServices(BigDecimal initialValue){
        balance = initialValue;
    }
    
    public BigDecimal getCurrentBalance(){
        IncomeRepository incr = PersistenceFactory.instance().buildRepositoryFactory(false).getIncomeRepository();
        ExpenseRepository expr = PersistenceFactory.instance().buildRepositoryFactory(false).getExpenseRepository();
        balance = incr.getTotal().subtract(expr.getTotal());
        return balance;
    }
    
}
