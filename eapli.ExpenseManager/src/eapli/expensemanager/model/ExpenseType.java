/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
public class ExpenseType extends MovementType implements Serializable {

    public ExpenseType() {
    }
    
    public ExpenseType(String type, String description) {
        super(type, description);
    }
}
