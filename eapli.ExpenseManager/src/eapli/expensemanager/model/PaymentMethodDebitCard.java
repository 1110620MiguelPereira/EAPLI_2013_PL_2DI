package eapli.expensemanager.model;

import javax.persistence.Entity;

@Entity
public class PaymentMethodDebitCard extends PaymentMethodCard {

    public PaymentMethodDebitCard() {
        super();

    }

    public PaymentMethodDebitCard(String number, String bankName) {
        super(number, bankName);
    }
}
