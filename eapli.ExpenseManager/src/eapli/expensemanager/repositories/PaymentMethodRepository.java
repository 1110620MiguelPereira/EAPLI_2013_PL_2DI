/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;

import eapli.expensemanager.model.PaymentMethod;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public interface PaymentMethodRepository {
    public void save(PaymentMethod payMethod);
    public List<PaymentMethod> getAll();
}
