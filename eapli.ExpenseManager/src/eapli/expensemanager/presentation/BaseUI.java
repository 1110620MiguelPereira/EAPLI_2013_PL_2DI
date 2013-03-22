/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;

/**
 *
 * @author António
 */
public class BaseUI {
    
    void show(){        
        BaseController controller = new BaseController();
        
        int expensesWeek = controller.ExpensesOfWeek();
        System.out.println("Gasto semanal: "+expensesWeek);
        System.out.println("Gasto mensal: ");
    }
}
