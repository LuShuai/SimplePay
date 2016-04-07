package simple.pay.payment;

import java.math.BigDecimal;

/**
 * Created by shuailu on 3/31/16.
 */
public class ChargeRequest {
    Long userId;
    BigDecimal amount;
    boolean autoCharge;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isAutoCharge() {
        return autoCharge;
    }

    public void setAutoCharge(boolean autoCharge) {
        this.autoCharge = autoCharge;
    }

    @Override
    public String toString() {
        return "ChargeRequest{" +
               "userId=" + userId +
               ", amount=" + amount +
               ", autoCharge=" + autoCharge +
               '}';
    }
}
