package simple.pay.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * Created by shuailu on 4/7/16.
 */
public class ApiException extends WebApplicationException {
    private Error error;
    private Response.Status httpStatusCode;
    private String externalErrorCode;
    private String externalErrorMessage;


    public ApiException(ErrorCodes errorCode) {
        this(new Error(errorCode.name()));
    }

    public ApiException(Error error) {
        this.error = error;
    }

    // All tests are using this currently to track the internal error code
    @Override
    public String getMessage() {
        return getInternalErrorCode();
    }

    public String getInternalErrorCode() {
        return error.getMessage();
    }

    public String getExternalErrorMessage() {
        return externalErrorMessage;
    }

    public String getExternalErrorCode() {
        return externalErrorCode;
    }

    public Response.Status getHttpStatusCode() {
        return httpStatusCode;
    }
}
