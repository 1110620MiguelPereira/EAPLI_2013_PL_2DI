/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Adulcínio
 */
@Entity
public class IncomeType extends MovementType implements Serializable{

    public IncomeType() {
    }
    
    public IncomeType(String type, String description) {
       super(type, description);
    }

}
