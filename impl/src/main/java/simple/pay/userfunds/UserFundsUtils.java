package simple.pay.userfunds;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/7/16.
 */
public class UserFundsUtils {
    public static BigDecimal nullCheckGet(BigDecimal amount) {
        return amount == null ? BigDecimal.ZERO : amount;
    }
}
