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
    
    //FALTA LER FICHEIRO DE CONFIGURAÇÃO

    // RETIRAR ESTE BOOLEAN PARA UMA VARIAVEL DE CLASSE
    public RepositoryFactory buildRepositoryFactory(boolean shouldUseDB) {
        
        if(shouldUseDB){
            return new DBRepositoryFactory();
        
        } else {
            return new InMemoryRepositoryFactory();
        }
    }
    
    
    
}
