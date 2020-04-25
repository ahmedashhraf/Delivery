package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {

    /* renamed from: a */
    public final C14963a f43400a;

    public StreamResetException(C14963a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(aVar);
        super(sb.toString());
        this.f43400a = aVar;
    }
}
