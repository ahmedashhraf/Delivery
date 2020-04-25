package okhttp3.internal;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14918d;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p514e.C14937f;
import p201f.p202a.C5952h;
import p468g.C13798a;
import p468g.C13813c0;
import p468g.C13821e;
import p468g.C13823e0.C13824a;
import p468g.C13832g0;
import p468g.C13841k;
import p468g.C13848l;
import p468g.C13866u.C13867a;
import p468g.C13876z;
import p468g.C13876z.C13878b;

public abstract class Internal {
    public static Internal instance;

    public static void initializeInstanceForTests() {
        new C13876z();
    }

    public abstract void addLenient(C13867a aVar, String str);

    public abstract void addLenient(C13867a aVar, String str, String str2);

    public abstract void apply(C13848l lVar, SSLSocket sSLSocket, boolean z);

    public abstract int code(C13824a aVar);

    public abstract boolean connectionBecameIdle(C13841k kVar, C14916c cVar);

    public abstract Socket deduplicate(C13841k kVar, C13798a aVar, C14921f fVar);

    public abstract boolean equalsNonHost(C13798a aVar, C13798a aVar2);

    public abstract C14916c get(C13841k kVar, C13798a aVar, C14921f fVar, C13832g0 g0Var);

    public abstract boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException);

    public abstract C13821e newWebSocketCall(C13876z zVar, C13813c0 c0Var);

    public abstract void put(C13841k kVar, C14916c cVar);

    public abstract C14918d routeDatabase(C13841k kVar);

    public abstract void setCache(C13878b bVar, C14937f fVar);

    public abstract C14921f streamAllocation(C13821e eVar);

    @C5952h
    public abstract IOException timeoutExit(C13821e eVar, @C5952h IOException iOException);
}
