/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import java.math.BigDecimal;

/**
 *
 * @author António
 */
public abstract class BaseUI {
    
    public void show(){
        showStatus();
    }
    
    protected void showStatus(){
        BigDecimal currentBalance = this.getController().currentBalance();
        BigDecimal expensesWeek = this.getController().ExpensesOfWeek();
        BigDecimal expensesMonth = this.getController().expensesOfThisMonth();
        System.out.println("\nGasto Mensal: "+expensesMonth+"         Gasto Semanal: "+expensesWeek+"\n");
        System.out.println("Saldo actual: " + currentBalance);
    }
    
    abstract protected BaseController getController();
}
