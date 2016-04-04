package simple.pay.payment;

import java.math.BigDecimal;

/**
 * Created by shuailu on 3/31/16.
 */
public class ChargeRequest {
    Long userId;
    BigDecimal amount;
    boolean autoCharge;

    @Override
    public String toString() {
        return "ChargeRequest{" +
               "userId=" + userId +
               ", amount=" + amount +
               ", autoCharge=" + autoCharge +
               '}';
    }
}
