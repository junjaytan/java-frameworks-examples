package testbean;

/**
 * Created by junjaytan on 3/17/16.
 */

import payment.IPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* This class contains a setter for the actual payment type
    We use Spring to inject the correct payment type into this class via IoC DI
 */

@Service
public class MySpringBeanWithDependency {
    private IPayment payment;

    // Annotations tell Spring which beans should be managed
    // by Spring and how they should be connected
    @Autowired
    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void run() {
        int amount = 100;
        payment.payment(amount);
    }
}
