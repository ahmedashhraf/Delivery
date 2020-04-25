package com.google.gson.stream;

import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.stream.d */
/* compiled from: JsonWriter */
public class C8799d implements Closeable, Flushable {

    /* renamed from: U */
    private static final String[] f23089U = new String[128];

    /* renamed from: V */
    private static final String[] f23090V;

    /* renamed from: N */
    private int f23091N = 0;

    /* renamed from: O */
    private String f23092O;

    /* renamed from: P */
    private String f23093P;

    /* renamed from: Q */
    private boolean f23094Q;

    /* renamed from: R */
    private boolean f23095R;

    /* renamed from: S */
    private String f23096S;

    /* renamed from: T */
    private boolean f23097T;

    /* renamed from: a */
    private final Writer f23098a;

    /* renamed from: b */
    private int[] f23099b = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            f23089U[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f23089U;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f23090V = (String[]) strArr.clone();
        String[] strArr2 = f23090V;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8799d(Writer writer) {
        m41306a(6);
        this.f23093P = ":";
        this.f23097T = true;
        if (writer != null) {
            this.f23098a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: F */
    private void mo32615F() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.f23098a.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m41302H();
        m41307e(4);
    }

    /* renamed from: G */
    private void m41301G() throws IOException {
        int peek = peek();
        if (peek == 1) {
            m41307e(2);
            m41302H();
        } else if (peek == 2) {
            this.f23098a.append(',');
            m41302H();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f23094Q) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m41307e(7);
        } else {
            this.f23098a.append(this.f23093P);
            m41307e(5);
        }
    }

    /* renamed from: H */
    private void m41302H() throws IOException {
        if (this.f23092O != null) {
            this.f23098a.write("\n");
            int i = this.f23091N;
            for (int i2 = 1; i2 < i; i2++) {
                this.f23098a.write(this.f23092O);
            }
        }
    }

    /* renamed from: I */
    private void m41303I() throws IOException {
        if (this.f23096S != null) {
            mo32615F();
            m41308f(this.f23096S);
            this.f23096S = null;
        }
    }

    private int peek() {
        int i = this.f23091N;
        if (i != 0) {
            return this.f23099b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: B */
    public C8799d mo32456B() throws IOException {
        if (this.f23096S != null) {
            if (this.f23097T) {
                m41303I();
            } else {
                this.f23096S = null;
                return this;
            }
        }
        m41301G();
        this.f23098a.write("null");
        return this;
    }

    /* renamed from: a */
    public final void mo32462a(boolean z) {
        this.f23095R = z;
    }

    /* renamed from: b */
    public final void mo32464b(boolean z) {
        this.f23094Q = z;
    }

    /* renamed from: c */
    public final void mo32466c(boolean z) {
        this.f23097T = z;
    }

    public void close() throws IOException {
        this.f23098a.close();
        int i = this.f23091N;
        if (i > 1 || (i == 1 && this.f23099b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f23091N = 0;
    }

    /* renamed from: d */
    public final void mo32470d(String str) {
        if (str.length() == 0) {
            this.f23092O = null;
            this.f23093P = ":";
            return;
        }
        this.f23092O = str;
        this.f23093P = ": ";
    }

    /* renamed from: e */
    public C8799d mo32471e() throws IOException {
        return m41304a(1, 2, "]");
    }

    /* renamed from: f */
    public C8799d mo32473f() throws IOException {
        return m41304a(3, 5, "}");
    }

    public void flush() throws IOException {
        if (this.f23091N != 0) {
            this.f23098a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final boolean mo32475g() {
        return this.f23097T;
    }

    /* renamed from: h */
    public final boolean mo32476h() {
        return this.f23095R;
    }

    /* renamed from: i */
    public boolean mo32477i() {
        return this.f23094Q;
    }

    /* renamed from: e */
    private void m41307e(int i) {
        this.f23099b[this.f23091N - 1] = i;
    }

    /* renamed from: f */
    private void m41308f(String str) throws IOException {
        String str2;
        String[] strArr = this.f23095R ? f23090V : f23089U;
        String str3 = "\"";
        this.f23098a.write(str3);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f23098a.write(str, i, i2 - i);
            }
            this.f23098a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f23098a.write(str, i, length - i);
        }
        this.f23098a.write(str3);
    }

    /* renamed from: a */
    public C8799d mo32457a() throws IOException {
        m41303I();
        return m41305a(1, "[");
    }

    /* renamed from: b */
    public C8799d mo32463b(String str) throws IOException {
        if (str == null) {
            return mo32456B();
        }
        m41303I();
        m41301G();
        this.f23098a.append(str);
        return this;
    }

    /* renamed from: c */
    public C8799d mo32465c(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f23096S != null) {
            throw new IllegalStateException();
        } else if (this.f23091N != 0) {
            this.f23096S = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: e */
    public C8799d mo32472e(String str) throws IOException {
        if (str == null) {
            return mo32456B();
        }
        m41303I();
        m41301G();
        m41308f(str);
        return this;
    }

    /* renamed from: a */
    private C8799d m41305a(int i, String str) throws IOException {
        m41301G();
        m41306a(i);
        this.f23098a.write(str);
        return this;
    }

    /* renamed from: d */
    public C8799d mo32468d() throws IOException {
        m41303I();
        return m41305a(3, "{");
    }

    /* renamed from: a */
    private C8799d m41304a(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f23096S == null) {
            this.f23091N--;
            if (peek == i2) {
                m41302H();
            }
            this.f23098a.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f23096S);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: d */
    public C8799d mo32469d(boolean z) throws IOException {
        m41303I();
        m41301G();
        this.f23098a.write(z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: a */
    private void m41306a(int i) {
        int i2 = this.f23091N;
        int[] iArr = this.f23099b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f23099b = iArr2;
        }
        int[] iArr3 = this.f23099b;
        int i3 = this.f23091N;
        this.f23091N = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public C8799d mo32460a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo32456B();
        }
        m41303I();
        m41301G();
        this.f23098a.write(bool.booleanValue() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: a */
    public C8799d mo32458a(double d) throws IOException {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        m41303I();
        m41301G();
        this.f23098a.append(Double.toString(d));
        return this;
    }

    /* renamed from: a */
    public C8799d mo32459a(long j) throws IOException {
        m41303I();
        m41301G();
        this.f23098a.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C8799d mo32461a(Number number) throws IOException {
        if (number == null) {
            return mo32456B();
        }
        m41303I();
        String obj = number.toString();
        if (this.f23094Q || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m41301G();
            this.f23098a.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }
}
