package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.C14910b;

public final class RouteException extends RuntimeException {

    /* renamed from: a */
    private IOException f43179a;

    /* renamed from: b */
    private IOException f43180b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f43179a = iOException;
        this.f43180b = iOException;
    }

    /* renamed from: a */
    public IOException mo46370a() {
        return this.f43179a;
    }

    /* renamed from: d */
    public IOException mo46372d() {
        return this.f43180b;
    }

    /* renamed from: a */
    public void mo46371a(IOException iOException) {
        C14910b.m66056a((Throwable) this.f43179a, (Throwable) iOException);
        this.f43180b = iOException;
    }
}
