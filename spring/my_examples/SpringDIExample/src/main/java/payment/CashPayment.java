package payment;

/**
 * Created by junjaytan on 3/17/16.
 */

// This class implements a cash payment type
public class CashPayment implements IPayment {
    public void payment (int amount) {
        System.out.println("Paying with Cash: $" + amount);
    }
}
