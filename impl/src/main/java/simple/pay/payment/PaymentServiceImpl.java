package simple.pay.payment;


import simple.pay.logger.Logger;

import java.lang.invoke.MethodHandles;

import javax.transaction.Transactional;

/**
 * Created by shuailu on 3/31/16.
 */
public class PaymentServiceImpl implements PaymentService {
    private static final Class<?> CLAZZ = MethodHandles.lookup().lookupClass();
    private static final Logger LOGGER = Logger.getLogger(CLAZZ);

    @Override
    @Transactional
    public ChargeResponse charge(ChargeRequest chargeRequest) {
        if (chargeRequest.autoCharge) {

        }
        return null;
    }

    private ChargeResponse autoCharge(ChargeRequest chargeRequest) {
        String method = "autoCharge";
        LOGGER.info(method, chargeRequest.toString());
        //TODO: added retry for auto charge
        return null;
    }




}
