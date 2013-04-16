/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.util.Console;

/**
 *
 * @author Pedro
 */
public abstract class RegisterPaymentMethodCardBaseUI extends BaseUI {
    
    String bankname;
    String cardnumber;
    
    @Override
    public void show()
    {
        bankname = Console.readLineFromConsole("Nome do banco: ");
        cardnumber = Console.readLineFromConsole("Numero do cartao: ");
    }

 }
