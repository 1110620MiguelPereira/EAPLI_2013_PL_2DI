/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.repositories.IncomeTypeRepository;
import java.util.List;

/**
 *
 * @author schmitzoide
 */
public class DBIncomeTypeRepository extends JpaHibernateUtil<IncomeType> implements IncomeTypeRepository  {

    @Override
    public void save(IncomeType expenseType) {
        update(expenseType);
    }

    @Override
    public List<IncomeType> getAll() {
        return (List)findAll();
    }
    
}
