package simple.pay.payment;

/**
 * Created by shuailu on 3/31/16.
 */
public interface PaymentService {
    ChargeResponse charge(ChargeRequest chargeRequest);
}
