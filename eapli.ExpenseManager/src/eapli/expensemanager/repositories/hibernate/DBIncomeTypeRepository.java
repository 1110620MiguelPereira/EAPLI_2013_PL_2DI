/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;


import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.model.MovementType;

import eapli.expensemanager.repositories.IncomeTypeRepository;
import eapli.expensemanager.repositories.hibernate.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Adulcinio
 */
public class DBIncomeTypeRepository extends JpaHibernateUtil<IncomeType> implements IncomeTypeRepository {

    
    public DBIncomeTypeRepository(){
    }
    
     @Override
    public void save(IncomeType incType) {
        
        EntityManager em = getEntityManager();
        assert em != null;
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        boolean find = findById(incType.getType());
       
        if (find) {
            update(incType);
        } else {
            create(incType);
        }
        
        tx.commit();
        em.close();
        
        System.out.println("Save!");
         
    }

    @Override
    public List<IncomeType> getAll() {
        return (List)findAll();
    }
    
    @Override
    public boolean findById(String shortName) {

        IncomeType inc1 = findByPrimaryKey(shortName);
        if (inc1 == null) {
            return false;
        }
        return true;
    }
}
