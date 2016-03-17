package payment;

/**
 * Created by junjaytan on 3/17/16.
 */
public class CreditPayment implements IPayment {
    public void payment (int amount) {
        System.out.println("Paying with credit: $" + amount);
    }
}
