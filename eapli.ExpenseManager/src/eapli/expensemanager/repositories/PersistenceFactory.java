/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.repositories.hibernate.DBRepositoryFactory;
import eapli.expensemanager.repositories.inmemory.InMemoryRepositoryFactory;

/**
 *
 * @author Luís
 */
public class PersistenceFactory {
    static PersistenceFactory _instance = new PersistenceFactory();
    
    
    private PersistenceFactory(){}
    
    
    public static PersistenceFactory instance (){
        return _instance;
        
    }
    
    
    public RepositoryFactory buildRepositoryFactory() {
        boolean shouldUseDB = readConfiguration();
        if(shouldUseDB){
            return new DBRepositoryFactory();
        
        } else {
            return new InMemoryRepositoryFactory();
        }
    }

    //FALTA LER FICHEIRO DE CONFIGURAÇÃO
    private boolean readConfiguration() {
        //Temporarily set to false in order to use InMemory
        return false;
    }
    
    
    
}
