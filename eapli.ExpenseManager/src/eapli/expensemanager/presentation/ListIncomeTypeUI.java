/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ListIncomeTypeController;
import eapli.expensemanager.model.IncomeType;

/**
 *
 * @author Adulcinio
 */
public class ListIncomeTypeUI extends BaseUI{
    ListIncomeTypeController listControllerType = new ListIncomeTypeController();

    @Override
    public void show() {      
        // TODO ver cimo evitar duplicação com ListExpenseType
        for (IncomeType obj: listControllerType.getIncomeTypes())   {
            System.out.println(obj);
        
        }
        super.show();   
    }
    
    @Override
    protected BaseController getController() {
        return listControllerType;
    }
    
}
