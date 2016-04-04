package simple.pay.payment;

/**
 * Created by shuailu on 3/31/16.
 */
public class ChargeResponse {
    boolean successful;
    String ErrorCode;

    @Override
    public String toString() {
        return "ChargeResponse{" +
               "successful=" + successful +
               ", ErrorCode='" + ErrorCode + '\'' +
               '}';
    }
}
