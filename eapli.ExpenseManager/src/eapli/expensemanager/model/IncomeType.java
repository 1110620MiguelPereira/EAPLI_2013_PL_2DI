/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Adulcínio
 */
public class IncomeType {
    
    private String type;
    private String description;
    
    public IncomeType(String type, String description) {
        if (description == null || type == null ||
                description.trim().length() <= 0 ||
                type.trim().length() <= 0) {
            throw new IllegalArgumentException();
        }
        
        this.type = type;
        this.description = description;
    }
    @Override
     public String toString(){  
        return "\nType: " + type + "\nDescription: " + description;  
    }
}
