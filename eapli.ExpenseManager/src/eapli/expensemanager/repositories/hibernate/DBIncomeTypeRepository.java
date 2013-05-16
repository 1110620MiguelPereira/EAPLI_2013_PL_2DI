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

/**
 *
 * @author Adulcinio
 */
public class DBIncomeTypeRepository extends JpaHibernateUtil<IncomeType> implements IncomeTypeRepository {

    
    public DBIncomeTypeRepository(){
    }
    
     @Override
    public void save(IncomeType incType) {
        
       
         
         
         boolean existe=false;
        List<IncomeType> listncomes=getAll();
        
        System.out.println("Size Lista: "+listncomes.size());
       for(IncomeType inc:listncomes)   {         
            if(inc.equals(incType)) {
                 update(incType);
                 existe=true;
                 break;                
            } 
        }
        if(existe==false)
            create(incType);
    }

    @Override
    public List<IncomeType> getAll() {
        return (List)findAll();
    }
    
}
