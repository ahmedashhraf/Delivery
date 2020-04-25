package p212io.reactivex.exceptions;

import p195e.p196a.p198t0.C5934c;
import p195e.p196a.p198t0.C5937f;

@C5934c
/* renamed from: io.reactivex.exceptions.OnErrorNotImplementedException */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(String str, @C5937f Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public OnErrorNotImplementedException(@C5937f Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}
