/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;

import eapli.expensemanager.repositories.IncomeRepository;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.PersistenceFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class BootstrapIncomes {

    public void createIncomes() {
        IncomeRepository repositorio = PersistenceFactory.instance().buildRepositoryFactory().getIncomeRepository();

        IncomeTypeRepository repoIncomeTypes = PersistenceFactory.instance().buildRepositoryFactory().getIncomeTypeRepository();
        List<IncomeType> incomeTypes = repoIncomeTypes.getAll();
        if (incomeTypes.size() <= 1) {
            System.out.println("É preciso criar pelo menos dois tipos de receitas.");
            return;
        }

        BigDecimal amount = new BigDecimal("500");
        Income i1 = new Income(amount, "Salário Maio", 2, 5, 2013, incomeTypes.get(0));

        amount = new BigDecimal("100");
        Income i2 = new Income(amount, "Bónus Maio", 2, 5, 2013, incomeTypes.get(1));

        amount = new BigDecimal("500");
        Income i3 = new Income(amount, "Salário Junho", 2, 6, 2013, incomeTypes.get(0));

        amount = new BigDecimal("50");
        Income i4 = new Income(amount, "Bónus Junho", 2, 6, 2013, incomeTypes.get(1));

        repositorio.save(i1);
        repositorio.save(i2);
        repositorio.save(i3);
        repositorio.save(i4);
    }
}
