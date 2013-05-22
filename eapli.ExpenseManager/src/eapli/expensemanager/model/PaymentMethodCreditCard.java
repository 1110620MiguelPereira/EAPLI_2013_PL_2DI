package eapli.expensemanager.model;

import javax.persistence.Entity;

@Entity
public class PaymentMethodCreditCard extends PaymentMethodCard {

    public PaymentMethodCreditCard() {
        super();
    }

    public PaymentMethodCreditCard(String number, String bankName) {
        super(number, bankName);
    }
    
    @Override
    public String toString()
    {
        return "Credit Card"+super.toString();
    }
}
