/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import javax.persistence.Entity;

/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
public class ExpenseType extends MovementType {
    
    public ExpenseType(String type, String description) {
        super(type, description);
    }
}
