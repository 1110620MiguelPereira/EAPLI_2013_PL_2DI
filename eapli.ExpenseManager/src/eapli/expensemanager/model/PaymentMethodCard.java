package eapli.expensemanager.model;

//import com.sun.istack.internal.NotNull; - Erro e warnings se import for feito
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class PaymentMethodCard implements PaymentMethod, java.io.Serializable {

    @Id
    int id_paymentMethod;
    //@NotNull
    String number;
    //@NotNull
    String bankName;

    public PaymentMethodCard() {
    }

    public PaymentMethodCard(String number, String bankName) {

        if (number == null || number.trim().length() <= 0) {
            throw new IllegalArgumentException("Invalid Number.");
        }

        if (bankName == null || bankName.trim().length() <= 0) {
            throw new IllegalArgumentException("Invalid Bank name.");
        }

        this.number = number;
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "\nCard number: " + number + "\nbank name: " + bankName;
    }
}
