/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class MovementType implements Serializable {

    protected String description;
    
    @Id
    protected String shortName;

    public MovementType() {
    }

    public MovementType(String shortName, String description) {
        if (description == null || shortName == null
                || description.trim().length() <= 0
                || shortName.trim().length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.description=description;
        this.shortName=shortName;
    }

    public String getType() {
        return shortName;
    }

    @Override
    public String toString() {
        return "\nType: " + shortName + "\nDescription: " + description;
    }
}
