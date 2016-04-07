package simple.pay.payment;

import java.math.BigDecimal;

/**
 * Created by shuailu on 3/31/16.
 */
public class ChargeRequest {
    private Long userId;
    private BigDecimal amount;
    private BigDecimal tax;
    private boolean autoCharge;

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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
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
