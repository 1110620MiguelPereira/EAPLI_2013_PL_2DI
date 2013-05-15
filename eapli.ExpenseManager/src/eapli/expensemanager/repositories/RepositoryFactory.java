/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories;
/**
 *
 * @author Luís
 */
public interface RepositoryFactory {
    
    public ExpenseRepository getExpenseRepository(); 
    
    public ExpenseTypeRepository getExpenseTypeRepository();
     
    public PaymentMethodRepository getPaymentMethodRepository(); 
      
    public IncomeTypeRepository getIncomeTypeRepository(); 
    
    public IncomeRepository getIncomeRepository(); 
       
   
}
