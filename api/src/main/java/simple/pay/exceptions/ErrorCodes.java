package simple.pay.exceptions;

import java.util.Objects;

/**
 * Created by shuailu on 4/7/16.
 */
public enum ErrorCodes {
    INVALID_AMOUNT(ExternalErrorCodes.E40000_INVALID_INPUT, "Invalid amount");

    private final ExternalErrorCodes externalErrorCode;
    private final String externalErrorMessage;

    ErrorCodes(ExternalErrorCodes externalErrorCode, String externalErrorMessage) {
        this.externalErrorCode = Objects.requireNonNull(externalErrorCode);
        this.externalErrorMessage = Objects.requireNonNull(externalErrorMessage);
    }

    @Override
    public String toString() {
        return this.name();
    }
}
