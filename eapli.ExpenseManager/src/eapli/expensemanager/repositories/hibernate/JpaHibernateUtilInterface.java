/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author schmitzoide
 */

public interface JpaHibernateUtilInterface<T, PK extends Serializable> {
    T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
    
    /**
   * Get the total number of instances.
   * @return  the count
   */
  long getTotalCount();
 
  /**
   * Find all.
   * @return  all instances
   */
  Collection<T> findAll();
 
  /**
   * Find an instance by primary key.
   * @param pk  the primary key
   * @return  the instance
   */
  T findByPrimaryKey(Serializable pk);
 
  /**
   * Insert a new instance.
   * @param t  the new instance
   * @return  the instance updated with its primary key
   */
    
}
