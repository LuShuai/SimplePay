package simple.pay.exceptions;

import java.util.Objects;

import javax.ws.rs.core.Response;
/**
 * Created by shuailu on 4/7/16.
 */

public enum ExternalErrorCodes {
    E10000_INTERNAL_SERVER_ERROR(Response.Status.INTERNAL_SERVER_ERROR),
    E30001_UNSUPPORTED_FEATURE(Response.Status.NOT_ACCEPTABLE),
    E40000_INVALID_INPUT(Response.Status.BAD_REQUEST),
    E40004_REQUEST_CONFLICT(Response.Status.CONFLICT),
    E50000_AUTHORIZATION_ERROR(Response.Status.UNAUTHORIZED),
    E50003_SERVICE_UNAVAILABLE(Response.Status.SERVICE_UNAVAILABLE),
    E60000_REPORTING_ERROR(Response.Status.INTERNAL_SERVER_ERROR);

    /**
     * The following external error codes are being used by EWS and could not find their status codes from Jersey lib
     *
     * E40001_REQUEST_TIMEOUT   408
     * E40002_ACCOUNT_IN_SYNC_READ_ONLY 405
     * E40003_TOO_MANY_REQUESTS 429
     */

    private final Response.Status httpStatus;

    ExternalErrorCodes(Response.Status httpStatus) {
        this.httpStatus = Objects.requireNonNull(httpStatus);
    }

    public Response.Status getHttpStatus() {
        return httpStatus;
    }

    public String toString() {
        return this.name();
    }
}
