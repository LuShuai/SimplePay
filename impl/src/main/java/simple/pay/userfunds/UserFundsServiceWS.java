package simple.pay.userfunds;

import simple.pay.exceptions.ApiException;
import simple.pay.exceptions.ErrorCodes;
import simple.pay.payment.ChargeRequest;
import simple.pay.payment.ChargeResponse;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/7/16.
 * A non-transactional environment
 */
public class UserFundsServiceWS {

    public ChargeResponse processCharge(ChargeRequest chargeRequest) {



        return null;
    }


    private void validateChargeAmount(ChargeRequest chargeInfo) {
        BigDecimal amount = UserFundsUtils.nullCheckGet(chargeInfo.getAmount());
        if (BigDecimal.ZERO.compareTo(amount) >= 0) {
            throw new ApiException(ErrorCodes.INVALID_AMOUNT);
        }
    }

}
