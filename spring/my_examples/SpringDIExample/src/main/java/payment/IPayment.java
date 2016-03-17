package payment;

/**
 * Created by junjaytan on 3/17/16.
 */

/* You define a Payment interface that specific implementations
of payment types will use, and can therefore be injected to the implementation to
decouple dependencies from implementation
 */

public interface IPayment {
    public void payment(int amount);
}
