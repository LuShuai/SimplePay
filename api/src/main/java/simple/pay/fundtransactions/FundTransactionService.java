package simple.pay.fundtransactions;

import java.math.BigDecimal;

/**
 * Created by shuailu on 4/6/16.
 */
public interface FundTransactionService {
    void addEntry(Long userId, TransactionType type, TransactionStatus status, BigDecimal amount, BigDecimal tax,
                  Long recordedTime);
}
