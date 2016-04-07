package simple.pay.userfunds;

import simple.pay.payment.ChargeRequest;
import simple.pay.payment.ChargeResponse;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/6/16.
 */
public interface UserFundsService {
    void addFunds(Long userId, BigDecimal amount);

    ChargeResponse processCharge(ChargeRequest chargeRequest);

}
