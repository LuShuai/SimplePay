package simple.pay.userfunds;

import simple.pay.exceptions.ApiException;
import simple.pay.exceptions.ErrorCodes;
import simple.pay.fundtransactions.FundTransactionServiceImpl;
import simple.pay.payment.ChargeRequest;
import simple.pay.payment.ChargeResponse;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by shuailu on 4/7/16.
 * A non-transactional environment
 */
public class UserFundsServiceWS {

    FundTransactionServiceImpl fundTransactionService;

    public ChargeResponse processCharge(ChargeRequest chargeRequest) {
        validateChargeAmount(chargeRequest);
        Long userId = chargeRequest.getUserId();
        //TODO: load and validate user if needed
        BigDecimal amount = UserFundsUtils.convertToMoneyScale(chargeRequest.getAmount(), RoundingMode.FLOOR);
        BigDecimal tax = UserFundsUtils.calculateTaxForCharge(amount);
        //overwrite amount and tax in request
        chargeRequest.setAmount(amount);
        chargeRequest.setTax(tax);



        return null;
    }


    private void validateChargeAmount(ChargeRequest chargeRequest) {
        BigDecimal amount = UserFundsUtils.nullCheckGet(chargeRequest.getAmount());
        if (BigDecimal.ZERO.compareTo(amount) >= 0) {
            throw new ApiException(ErrorCodes.INVALID_AMOUNT);
        }
    }

}
