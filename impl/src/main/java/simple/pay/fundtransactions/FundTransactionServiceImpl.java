package simple.pay.fundtransactions;

import simple.pay.logger.Logger;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/7/16.
 */
public class FundTransactionServiceImpl implements FundTransactionService {

    Logger LOGGER = Logger.getLogger(this.getClass());

    @Override
    public void addEntry(Long userId, TransactionType type, TransactionStatus status, BigDecimal amount,
                         BigDecimal tax, Long recordedTime) {

        String method = "addEntry";
        LOGGER.info(method, "Adding %s entry for user %s on %s, [Status: %s, Amount: %s, Tax: %s]", type, userId,
                    recordedTime, amount, tax);
        //TODO: connect database


        

    }
}
