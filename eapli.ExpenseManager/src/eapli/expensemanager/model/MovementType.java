/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MovementType {

    protected String description;
    protected String type;

    public MovementType(String type, String description) {
        if (description == null || type == null
                || description.trim().length() <= 0
                || type.trim().length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.description=description;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nType: " + type + "\nDescription: " + description;
    }
}
