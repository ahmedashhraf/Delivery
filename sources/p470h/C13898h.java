package p470h;

import java.io.IOException;

/* renamed from: h.h */
/* compiled from: ForwardingSink */
public abstract class C13898h implements C13924z {

    /* renamed from: a */
    private final C13924z f40359a;

    public C13898h(C13924z zVar) {
        if (zVar != null) {
            this.f40359a = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C13924z mo43993a() {
        return this.f40359a;
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        this.f40359a.mo43815b(cVar, j);
    }

    public void close() throws IOException {
        this.f40359a.close();
    }

    public void flush() throws IOException {
        this.f40359a.flush();
    }

    public C13885b0 timeout() {
        return this.f40359a.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f40359a.toString());
        sb.append(")");
        return sb.toString();
    }
}
