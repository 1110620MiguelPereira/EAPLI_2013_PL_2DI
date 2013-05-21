/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eapli.expensemanager.repositories.hibernate;

import eapli.expensemanager.model.PaymentMethod;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class DBPaymentMethodRepository extends JpaHibernateUtil<PaymentMethod> implements PaymentMethodRepository{
   
    @Override
    public void save(PaymentMethod payMethod) {
        EntityManager em = getEntityManager();
        assert em != null;
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        if(payMethod.getID()==null)
        {
            em.persist(payMethod);
        }else
        {
            em.merge(payMethod);
        }
                
        tx.commit();
        em.close();
    }
    
    @Override
    public List<PaymentMethod> getAll()
    {
        return (List)findAll();
    }
}
