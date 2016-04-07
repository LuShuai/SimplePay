package simple.pay.userfunds;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by shuailu on 4/7/16.
 */
public class UserFundsUtils {

    private static final BigDecimal TAX_RATE = new BigDecimal(0.1);

    public static BigDecimal nullCheckGet(BigDecimal amount) {
        return amount == null ? BigDecimal.ZERO : amount;
    }

    public static BigDecimal calculateTaxForCharge(BigDecimal amount) {
        //for now, use fixed tax rate 0.1
        return convertToMoneyScale(TAX_RATE.multiply(amount), RoundingMode.CEILING);
    }

    public static BigDecimal convertToMoneyScale(BigDecimal amount, RoundingMode roundingMode) {
        return amount.setScale(2, roundingMode);
    }
}
