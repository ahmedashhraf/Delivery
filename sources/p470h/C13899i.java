package p470h;

import java.io.IOException;

/* renamed from: h.i */
/* compiled from: ForwardingSource */
public abstract class C13899i implements C13883a0 {
    private final C13883a0 delegate;

    public C13899i(C13883a0 a0Var) {
        if (a0Var != null) {
            this.delegate = a0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final C13883a0 delegate() {
        return this.delegate;
    }

    public long read(C13887c cVar, long j) throws IOException {
        return this.delegate.read(cVar, j);
    }

    public C13885b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.delegate.toString());
        sb.append(")");
        return sb.toString();
    }
}
