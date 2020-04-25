package com.google.gson.p321x.p322m;

import com.google.gson.C8784i;
import com.google.gson.C8787l;
import com.google.gson.C8788m;
import com.google.gson.C8789n;
import com.google.gson.C8791p;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.p217i1.C14662d0;

/* renamed from: com.google.gson.x.m.e */
/* compiled from: JsonTreeReader */
public final class C8865e extends C8795a {

    /* renamed from: G0 */
    private static final Reader f23225G0 = new C8866a();

    /* renamed from: H0 */
    private static final Object f23226H0 = new Object();

    /* renamed from: C0 */
    private Object[] f23227C0 = new Object[32];

    /* renamed from: D0 */
    private int f23228D0 = 0;

    /* renamed from: E0 */
    private String[] f23229E0 = new String[32];

    /* renamed from: F0 */
    private int[] f23230F0 = new int[32];

    /* renamed from: com.google.gson.x.m.e$a */
    /* compiled from: JsonTreeReader */
    static class C8866a extends Reader {
        C8866a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C8865e(C8787l lVar) {
        super(f23225G0);
        m41474a((Object) lVar);
    }

    /* renamed from: F */
    private String m41470F() {
        StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(mo32451h());
        return sb.toString();
    }

    /* renamed from: P */
    private Object m41471P() {
        return this.f23227C0[this.f23228D0 - 1];
    }

    /* renamed from: Q */
    private Object m41472Q() {
        Object[] objArr = this.f23227C0;
        int i = this.f23228D0 - 1;
        this.f23228D0 = i;
        Object obj = objArr[i];
        objArr[this.f23228D0] = null;
        return obj;
    }

    /* renamed from: G */
    public boolean mo32436G() throws IOException {
        m41473a(C8798c.BOOLEAN);
        boolean f = ((C8791p) m41472Q()).mo32374f();
        int i = this.f23228D0;
        if (i > 0) {
            int[] iArr = this.f23230F0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    /* renamed from: H */
    public double mo32437H() throws IOException {
        C8798c peek = peek();
        if (peek == C8798c.NUMBER || peek == C8798c.STRING) {
            double o = ((C8791p) m41471P()).mo32380o();
            if (mo32434B() || (!Double.isNaN(o) && !Double.isInfinite(o))) {
                m41472Q();
                int i = this.f23228D0;
                if (i > 0) {
                    int[] iArr = this.f23230F0;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return o;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(o);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(C8798c.NUMBER);
        sb2.append(" but was ");
        sb2.append(peek);
        sb2.append(m41470F());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: I */
    public int mo32438I() throws IOException {
        C8798c peek = peek();
        if (peek == C8798c.NUMBER || peek == C8798c.STRING) {
            int q = ((C8791p) m41471P()).mo32382q();
            m41472Q();
            int i = this.f23228D0;
            if (i > 0) {
                int[] iArr = this.f23230F0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C8798c.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m41470F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: J */
    public long mo32439J() throws IOException {
        C8798c peek = peek();
        if (peek == C8798c.NUMBER || peek == C8798c.STRING) {
            long v = ((C8791p) m41471P()).mo32385v();
            m41472Q();
            int i = this.f23228D0;
            if (i > 0) {
                int[] iArr = this.f23230F0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C8798c.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m41470F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: K */
    public String mo32440K() throws IOException {
        m41473a(C8798c.NAME);
        Entry entry = (Entry) ((Iterator) m41471P()).next();
        String str = (String) entry.getKey();
        this.f23229E0[this.f23228D0 - 1] = str;
        m41474a(entry.getValue());
        return str;
    }

    /* renamed from: L */
    public void mo32441L() throws IOException {
        m41473a(C8798c.NULL);
        m41472Q();
        int i = this.f23228D0;
        if (i > 0) {
            int[] iArr = this.f23230F0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: M */
    public String mo32442M() throws IOException {
        C8798c peek = peek();
        if (peek == C8798c.STRING || peek == C8798c.NUMBER) {
            String y = ((C8791p) m41472Q()).mo32388y();
            int i = this.f23228D0;
            if (i > 0) {
                int[] iArr = this.f23230F0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return y;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C8798c.STRING);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m41470F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: N */
    public void mo32443N() throws IOException {
        String str = "null";
        if (peek() == C8798c.NAME) {
            mo32440K();
            this.f23229E0[this.f23228D0 - 2] = str;
        } else {
            m41472Q();
            int i = this.f23228D0;
            if (i > 0) {
                this.f23229E0[i - 1] = str;
            }
        }
        int i2 = this.f23228D0;
        if (i2 > 0) {
            int[] iArr = this.f23230F0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: O */
    public void mo32612O() throws IOException {
        m41473a(C8798c.NAME);
        Entry entry = (Entry) ((Iterator) m41471P()).next();
        m41474a(entry.getValue());
        m41474a((Object) new C8791p((String) entry.getKey()));
    }

    /* renamed from: a */
    public void mo32444a() throws IOException {
        m41473a(C8798c.BEGIN_ARRAY);
        m41474a((Object) ((C8784i) m41471P()).iterator());
        this.f23230F0[this.f23228D0 - 1] = 0;
    }

    public void close() throws IOException {
        this.f23227C0 = new Object[]{f23226H0};
        this.f23228D0 = 1;
    }

    /* renamed from: d */
    public void mo32447d() throws IOException {
        m41473a(C8798c.BEGIN_OBJECT);
        m41474a((Object) ((C8789n) m41471P()).entrySet().iterator());
    }

    /* renamed from: f */
    public void mo32449f() throws IOException {
        m41473a(C8798c.END_ARRAY);
        m41472Q();
        m41472Q();
        int i = this.f23228D0;
        if (i > 0) {
            int[] iArr = this.f23230F0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: g */
    public void mo32450g() throws IOException {
        m41473a(C8798c.END_OBJECT);
        m41472Q();
        m41472Q();
        int i = this.f23228D0;
        if (i > 0) {
            int[] iArr = this.f23230F0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: h */
    public String mo32451h() {
        StringBuilder sb = new StringBuilder();
        sb.append(C14662d0.f42851b);
        int i = 0;
        while (i < this.f23228D0) {
            Object[] objArr = this.f23227C0;
            if (objArr[i] instanceof C8784i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f23230F0[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C8789n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f23229E0;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo32452i() throws IOException {
        C8798c peek = peek();
        return (peek == C8798c.END_OBJECT || peek == C8798c.END_ARRAY) ? false : true;
    }

    public C8798c peek() throws IOException {
        if (this.f23228D0 == 0) {
            return C8798c.END_DOCUMENT;
        }
        Object P = m41471P();
        if (P instanceof Iterator) {
            boolean z = this.f23227C0[this.f23228D0 - 2] instanceof C8789n;
            Iterator it = (Iterator) P;
            if (!it.hasNext()) {
                return z ? C8798c.END_OBJECT : C8798c.END_ARRAY;
            } else if (z) {
                return C8798c.NAME;
            } else {
                m41474a(it.next());
                return peek();
            }
        } else if (P instanceof C8789n) {
            return C8798c.BEGIN_OBJECT;
        } else {
            if (P instanceof C8784i) {
                return C8798c.BEGIN_ARRAY;
            }
            if (P instanceof C8791p) {
                C8791p pVar = (C8791p) P;
                if (pVar.mo32424G()) {
                    return C8798c.STRING;
                }
                if (pVar.mo32422E()) {
                    return C8798c.BOOLEAN;
                }
                if (pVar.mo32423F()) {
                    return C8798c.NUMBER;
                }
                throw new AssertionError();
            } else if (P instanceof C8788m) {
                return C8798c.NULL;
            } else {
                if (P == f23226H0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public String toString() {
        return C8865e.class.getSimpleName();
    }

    /* renamed from: a */
    private void m41473a(C8798c cVar) throws IOException {
        if (peek() != cVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(cVar);
            sb.append(" but was ");
            sb.append(peek());
            sb.append(m41470F());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m41474a(Object obj) {
        int i = this.f23228D0;
        Object[] objArr = this.f23227C0;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f23230F0, 0, iArr, 0, this.f23228D0);
            System.arraycopy(this.f23229E0, 0, strArr, 0, this.f23228D0);
            this.f23227C0 = objArr2;
            this.f23230F0 = iArr;
            this.f23229E0 = strArr;
        }
        Object[] objArr3 = this.f23227C0;
        int i2 = this.f23228D0;
        this.f23228D0 = i2 + 1;
        objArr3[i2] = obj;
    }
}
