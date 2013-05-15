/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author Daniel
 */
public class BootstrapIncomes {
    public void createIncomes(){
        IncomeRepository repositorio = PersistenceFactory.instance().buildRepositoryFactory(false).getIncomeRepository();
        
        IncomeType income = new IncomeType("Salário","Salário Mensal ");
        IncomeType income1 = new IncomeType("Bónus","Bónus Mensal ");
       
        BigDecimal amount = new BigDecimal("500");
        Income i1 = new Income(amount,"Salário Maio",2,5,2013,income);
        
        amount = new BigDecimal("100");
        Income i2 = new Income(amount,"Bónus Maio",2,5,2013,income1);
        
        amount = new BigDecimal("500");
        Income i3 = new Income(amount,"Salário Junho",2,6,2013,income);
        
        amount = new BigDecimal("50");
        Income i4 = new Income(amount,"Bónus Junho",2,6,2013,income1);
        
        repositorio.save(i1);
        repositorio.save(i2);
        repositorio.save(i3);
        repositorio.save(i4);
    }
}
