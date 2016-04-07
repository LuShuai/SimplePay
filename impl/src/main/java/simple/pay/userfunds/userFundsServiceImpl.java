package simple.pay.userfunds;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import simple.pay.payment.ChargeRequest;
import simple.pay.payment.ChargeResponse;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/6/16.
 */
public class UserFundsServiceImpl implements UserFundsService {

    @Override
    public void addFunds(Long userId, BigDecimal amount) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChargeResponse processCharge(ChargeRequest chargeRequest) {
        return null;
    }
}
