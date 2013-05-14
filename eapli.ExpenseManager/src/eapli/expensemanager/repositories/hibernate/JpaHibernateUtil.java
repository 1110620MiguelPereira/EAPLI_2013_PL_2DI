/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Paulo Gandra Sousa
 * http://stackoverflow.com/questions/3888575/single-dao-generic-crud-methods-jpa-hibernate-spring
 * and on https://burtbeckwith.com/blog/?p=40
 */
public abstract class JpaHibernateUtil<T>  {
    
   @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("eapli.ExpenseManagerPU");
    protected EntityManager getEntityManager() {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }

    protected Class<T> entityClass;
     
    
    
    public JpaHibernateUtil() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
             .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass
             .getActualTypeArguments()[0];
    }
    
    public Object create(Object t) {
        this.getEntityManager().persist(t);
        return t;
    }

    //public Object read(Serializable id) {
    //    return this.getEntityManager().find(entityClass, id);
    //}

    public Object update(Object t) {
        return this.getEntityManager().merge(t);
    }

    public void delete(Object t) {
        t = this.getEntityManager().merge(t);
        this.getEntityManager().remove(t);
    }

    public long getTotalCount() {
        return (Long)getEntityManager().createQuery(
            "SELECT COUNT(*) FROM " + entityClass.getSimpleName())
            .getSingleResult();
    }

    public Collection<T> findAll() {
        return getEntityManager().createQuery(
            "FROM " + entityClass.getName())
        .getResultList();
    }

    public T findByPrimaryKey(Serializable pk) {
        return (T)getEntityManager().find(entityClass, pk);
    }
    
    
}
