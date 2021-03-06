package retrofit2;

import com.fasterxml.jackson.core.p162w.C3868i;
import p201f.p202a.C5952h;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    public HttpException(Response<?> response2) {
        super(getMessage(response2));
        this.code = response2.code();
        this.message = response2.message();
        this.response = response2;
    }

    private static String getMessage(Response<?> response2) {
        Utils.checkNotNull(response2, "response == null");
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(response2.code());
        sb.append(C3868i.f12248b);
        sb.append(response2.message());
        return sb.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @C5952h
    public Response<?> response() {
        return this.response;
    }
}
