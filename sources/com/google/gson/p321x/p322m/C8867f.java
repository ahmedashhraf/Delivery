package com.google.gson.p321x.p322m;

import com.google.gson.C8784i;
import com.google.gson.C8787l;
import com.google.gson.C8788m;
import com.google.gson.C8789n;
import com.google.gson.C8791p;
import com.google.gson.stream.C8799d;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.x.m.f */
/* compiled from: JsonTreeWriter */
public final class C8867f extends C8799d {

    /* renamed from: Z */
    private static final Writer f23231Z = new C8868a();

    /* renamed from: a0 */
    private static final C8791p f23232a0 = new C8791p(C11644i.f33433v3);

    /* renamed from: W */
    private final List<C8787l> f23233W = new ArrayList();

    /* renamed from: X */
    private String f23234X;

    /* renamed from: Y */
    private C8787l f23235Y = C8788m.f23032a;

    /* renamed from: com.google.gson.x.m.f$a */
    /* compiled from: JsonTreeWriter */
    static class C8868a extends Writer {
        C8868a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C8867f() {
        super(f23231Z);
    }

    /* renamed from: a */
    private void m41490a(C8787l lVar) {
        if (this.f23234X != null) {
            if (!lVar.mo32391A() || mo32475g()) {
                ((C8789n) peek()).mo32405a(this.f23234X, lVar);
            }
            this.f23234X = null;
        } else if (this.f23233W.isEmpty()) {
            this.f23235Y = lVar;
        } else {
            C8787l peek = peek();
            if (peek instanceof C8784i) {
                ((C8784i) peek).mo32363a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private C8787l peek() {
        List<C8787l> list = this.f23233W;
        return (C8787l) list.get(list.size() - 1);
    }

    /* renamed from: B */
    public C8799d mo32456B() throws IOException {
        m41490a((C8787l) C8788m.f23032a);
        return this;
    }

    /* renamed from: F */
    public C8787l mo32615F() {
        if (this.f23233W.isEmpty()) {
            return this.f23235Y;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(this.f23233W);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C8799d mo32465c(String str) throws IOException {
        if (this.f23233W.isEmpty() || this.f23234X != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8789n) {
            this.f23234X = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() throws IOException {
        if (this.f23233W.isEmpty()) {
            this.f23233W.add(f23232a0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C8799d mo32468d() throws IOException {
        C8789n nVar = new C8789n();
        m41490a((C8787l) nVar);
        this.f23233W.add(nVar);
        return this;
    }

    /* renamed from: e */
    public C8799d mo32471e() throws IOException {
        if (this.f23233W.isEmpty() || this.f23234X != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8784i) {
            List<C8787l> list = this.f23233W;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public C8799d mo32473f() throws IOException {
        if (this.f23233W.isEmpty() || this.f23234X != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8789n) {
            List<C8787l> list = this.f23233W;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    /* renamed from: d */
    public C8799d mo32469d(boolean z) throws IOException {
        m41490a((C8787l) new C8791p(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: e */
    public C8799d mo32472e(String str) throws IOException {
        if (str == null) {
            return mo32456B();
        }
        m41490a((C8787l) new C8791p(str));
        return this;
    }

    /* renamed from: a */
    public C8799d mo32457a() throws IOException {
        C8784i iVar = new C8784i();
        m41490a((C8787l) iVar);
        this.f23233W.add(iVar);
        return this;
    }

    /* renamed from: a */
    public C8799d mo32460a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo32456B();
        }
        m41490a((C8787l) new C8791p(bool));
        return this;
    }

    /* renamed from: a */
    public C8799d mo32458a(double d) throws IOException {
        if (mo32477i() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m41490a((C8787l) new C8791p((Number) Double.valueOf(d)));
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON forbids NaN and infinities: ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C8799d mo32459a(long j) throws IOException {
        m41490a((C8787l) new C8791p((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C8799d mo32461a(Number number) throws IOException {
        if (number == null) {
            return mo32456B();
        }
        if (!mo32477i()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m41490a((C8787l) new C8791p(number));
        return this;
    }
}
