package com.google.common.p190io;

import com.google.common.base.C5785c;
import com.google.common.base.C5799e;
import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p278e.C6602d;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.io.BaseEncoding */
public abstract class BaseEncoding {

    /* renamed from: a */
    private static final BaseEncoding f16812a;

    /* renamed from: b */
    private static final BaseEncoding f16813b;

    /* renamed from: c */
    private static final BaseEncoding f16814c;

    /* renamed from: d */
    private static final BaseEncoding f16815d;

    /* renamed from: e */
    private static final BaseEncoding f16816e = new C5850g("base16()", "0123456789ABCDEF", null);

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th) {
            initCause(th);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$a */
    class C5844a extends C8352e {

        /* renamed from: a */
        final /* synthetic */ C8376i f16817a;

        C5844a(C8376i iVar) {
            this.f16817a = iVar;
        }

        /* renamed from: c */
        public OutputStream mo23251c() throws IOException {
            return BaseEncoding.this.mo23242a(this.f16817a.mo31445c());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$b */
    class C5845b extends C8358f {

        /* renamed from: c */
        final /* synthetic */ C8377j f16819c;

        C5845b(C8377j jVar) {
            this.f16819c = jVar;
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return BaseEncoding.this.mo23241a(this.f16819c.mo31462d());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$c */
    static class C5846c implements C8419i {

        /* renamed from: a */
        final /* synthetic */ C8419i f16821a;

        /* renamed from: b */
        final /* synthetic */ C5799e f16822b;

        C5846c(C8419i iVar, C5799e eVar) {
            this.f16821a = iVar;
            this.f16822b = eVar;
        }

        public void close() throws IOException {
            this.f16821a.close();
        }

        public int read() throws IOException {
            int read;
            do {
                read = this.f16821a.read();
                if (read == -1) {
                    break;
                }
            } while (this.f16822b.mo23093a((char) read));
            return read;
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$d */
    static class C5847d implements C8420j {

        /* renamed from: a */
        int f16823a = this.f16824b;

        /* renamed from: b */
        final /* synthetic */ int f16824b;

        /* renamed from: c */
        final /* synthetic */ String f16825c;

        /* renamed from: d */
        final /* synthetic */ C8420j f16826d;

        C5847d(int i, String str, C8420j jVar) {
            this.f16824b = i;
            this.f16825c = str;
            this.f16826d = jVar;
        }

        /* renamed from: a */
        public void mo23255a(char c) throws IOException {
            if (this.f16823a == 0) {
                for (int i = 0; i < this.f16825c.length(); i++) {
                    this.f16826d.mo23255a(this.f16825c.charAt(i));
                }
                this.f16823a = this.f16824b;
            }
            this.f16826d.mo23255a(c);
            this.f16823a--;
        }

        public void close() throws IOException {
            this.f16826d.close();
        }

        public void flush() throws IOException {
            this.f16826d.flush();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$e */
    private static final class C5848e extends C5799e {

        /* renamed from: g0 */
        private final String f16827g0;

        /* renamed from: h0 */
        private final char[] f16828h0;

        /* renamed from: i0 */
        final int f16829i0;

        /* renamed from: j0 */
        final int f16830j0;

        /* renamed from: k0 */
        final int f16831k0;

        /* renamed from: l0 */
        final int f16832l0;

        /* renamed from: m0 */
        private final byte[] f16833m0;

        /* renamed from: n0 */
        private final boolean[] f16834n0;

        C5848e(String str, char[] cArr) {
            this.f16827g0 = (String) C7397x.m35664a(str);
            this.f16828h0 = (char[]) C7397x.m35664a(cArr);
            try {
                this.f16830j0 = C6602d.m31377b(cArr.length, RoundingMode.UNNECESSARY);
                int min = Math.min(8, Integer.lowestOneBit(this.f16830j0));
                this.f16831k0 = 8 / min;
                this.f16832l0 = this.f16830j0 / min;
                this.f16829i0 = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    C7397x.m35672a(C5799e.f16731N.mo23093a(c), "Non-ASCII character: %s", Character.valueOf(c));
                    C7397x.m35672a(bArr[c] == -1, "Duplicate character: %s", Character.valueOf(c));
                    bArr[c] = (byte) i;
                }
                this.f16833m0 = bArr;
                boolean[] zArr = new boolean[this.f16831k0];
                for (int i2 = 0; i2 < this.f16832l0; i2++) {
                    zArr[C6602d.m31374a(i2 * 8, this.f16830j0, RoundingMode.CEILING)] = true;
                }
                this.f16834n0 = zArr;
            } catch (ArithmeticException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Illegal alphabet length ");
                sb.append(cArr.length);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }

        /* renamed from: f */
        private boolean m25684f() {
            for (char b : this.f16828h0) {
                if (C5785c.m25360b(b)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private boolean m25685g() {
            for (char c : this.f16828h0) {
                if (C5785c.m25361c(c)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public char mo23258a(int i) {
            return this.f16828h0[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo23259b(int i) {
            return this.f16834n0[i % this.f16831k0];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo23260d(char c) throws IOException {
            if (c <= 127) {
                byte[] bArr = this.f16833m0;
                if (bArr[c] != -1) {
                    return bArr[c];
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C5848e mo23262e() {
            if (!m25684f()) {
                return this;
            }
            C7397x.m35677b(!m25685g(), (Object) "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f16828h0.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f16828h0;
                if (i < cArr2.length) {
                    cArr[i] = C5785c.m25363e(cArr2[i]);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16827g0);
                    sb.append(".upperCase()");
                    return new C5848e(sb.toString(), cArr);
                }
            }
        }

        public String toString() {
            return this.f16827g0;
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return C5799e.f16731N.mo23093a(c) && this.f16833m0[c] != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C5848e mo23261d() {
            if (!m25685g()) {
                return this;
            }
            C7397x.m35677b(!m25684f(), (Object) "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f16828h0.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f16828h0;
                if (i < cArr2.length) {
                    cArr[i] = C5785c.m25362d(cArr2[i]);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16827g0);
                    sb.append(".lowerCase()");
                    return new C5848e(sb.toString(), cArr);
                }
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$f */
    static final class C5849f extends BaseEncoding {

        /* renamed from: f */
        private final BaseEncoding f16835f;

        /* renamed from: g */
        private final String f16836g;

        /* renamed from: h */
        private final int f16837h;

        /* renamed from: i */
        private final C5799e f16838i;

        C5849f(BaseEncoding baseEncoding, String str, int i) {
            this.f16835f = (BaseEncoding) C7397x.m35664a(baseEncoding);
            this.f16836g = (String) C7397x.m35664a(str);
            this.f16837h = i;
            C7397x.m35672a(i > 0, "Cannot add a separator after every %s chars", Integer.valueOf(i));
            this.f16838i = C5799e.m25416l(str).mo23097b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8418h mo23240a(C8420j jVar) {
            return this.f16835f.mo23240a(BaseEncoding.m25656a(jVar, this.f16836g, this.f16837h));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo23246b(int i) {
            int b = this.f16835f.mo23246b(i);
            return b + (this.f16836g.length() * C6602d.m31374a(Math.max(0, b - 1), this.f16837h, RoundingMode.FLOOR));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C5799e mo23249c() {
            return this.f16835f.mo23249c();
        }

        /* renamed from: d */
        public BaseEncoding mo23250d() {
            return this.f16835f.mo23250d().mo23236a(this.f16836g, this.f16837h);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16835f.toString());
            sb.append(".withSeparator(\"");
            sb.append(this.f16836g);
            sb.append("\", ");
            sb.append(this.f16837h);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo23233a(int i) {
            return this.f16835f.mo23233a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8417g mo23239a(C8419i iVar) {
            return this.f16835f.mo23239a(BaseEncoding.m25655a(iVar, this.f16838i));
        }

        /* renamed from: b */
        public BaseEncoding mo23247b() {
            return this.f16835f.mo23247b().mo23236a(this.f16836g, this.f16837h);
        }

        /* renamed from: a */
        public BaseEncoding mo23235a(char c) {
            return this.f16835f.mo23235a(c).mo23236a(this.f16836g, this.f16837h);
        }

        /* renamed from: a */
        public BaseEncoding mo23236a(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        /* renamed from: a */
        public BaseEncoding mo23234a() {
            return this.f16835f.mo23234a().mo23236a(this.f16836g, this.f16837h);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$g */
    static final class C5850g extends BaseEncoding {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C5848e f16839f;
        /* access modifiers changed from: private */
        @C5952h

        /* renamed from: g */
        public final Character f16840g;

        /* renamed from: h */
        private transient BaseEncoding f16841h;

        /* renamed from: i */
        private transient BaseEncoding f16842i;

        /* renamed from: com.google.common.io.BaseEncoding$g$a */
        class C5851a implements C8418h {

            /* renamed from: a */
            int f16843a = 0;

            /* renamed from: b */
            int f16844b = 0;

            /* renamed from: c */
            int f16845c = 0;

            /* renamed from: d */
            final /* synthetic */ C8420j f16846d;

            C5851a(C8420j jVar) {
                this.f16846d = jVar;
            }

            /* renamed from: a */
            public void mo23265a(byte b) throws IOException {
                this.f16843a <<= 8;
                this.f16843a = (b & 255) | this.f16843a;
                this.f16844b += 8;
                while (this.f16844b >= C5850g.this.f16839f.f16830j0) {
                    this.f16846d.mo23255a(C5850g.this.f16839f.mo23258a((this.f16843a >> (this.f16844b - C5850g.this.f16839f.f16830j0)) & C5850g.this.f16839f.f16829i0));
                    this.f16845c++;
                    this.f16844b -= C5850g.this.f16839f.f16830j0;
                }
            }

            public void close() throws IOException {
                if (this.f16844b > 0) {
                    this.f16846d.mo23255a(C5850g.this.f16839f.mo23258a((this.f16843a << (C5850g.this.f16839f.f16830j0 - this.f16844b)) & C5850g.this.f16839f.f16829i0));
                    this.f16845c++;
                    if (C5850g.this.f16840g != null) {
                        while (this.f16845c % C5850g.this.f16839f.f16831k0 != 0) {
                            this.f16846d.mo23255a(C5850g.this.f16840g.charValue());
                            this.f16845c++;
                        }
                    }
                }
                this.f16846d.close();
            }

            public void flush() throws IOException {
                this.f16846d.flush();
            }
        }

        /* renamed from: com.google.common.io.BaseEncoding$g$b */
        class C5852b implements C8417g {

            /* renamed from: a */
            int f16848a = 0;

            /* renamed from: b */
            int f16849b = 0;

            /* renamed from: c */
            int f16850c = 0;

            /* renamed from: d */
            boolean f16851d = false;

            /* renamed from: e */
            final C5799e f16852e = C5850g.this.mo23249c();

            /* renamed from: f */
            final /* synthetic */ C8419i f16853f;

            C5852b(C8419i iVar) {
                this.f16853f = iVar;
            }

            public void close() throws IOException {
                this.f16853f.close();
            }

            public int read() throws IOException {
                while (true) {
                    int read = this.f16853f.read();
                    if (read != -1) {
                        this.f16850c++;
                        char c = (char) read;
                        if (this.f16852e.mo23093a(c)) {
                            if (this.f16851d || (this.f16850c != 1 && C5850g.this.f16839f.mo23259b(this.f16850c - 1))) {
                                this.f16851d = true;
                            }
                        } else if (!this.f16851d) {
                            this.f16848a <<= C5850g.this.f16839f.f16830j0;
                            this.f16848a = C5850g.this.f16839f.mo23260d(c) | this.f16848a;
                            this.f16849b += C5850g.this.f16839f.f16830j0;
                            int i = this.f16849b;
                            if (i >= 8) {
                                this.f16849b = i - 8;
                                return (this.f16848a >> this.f16849b) & 255;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected padding character but found '");
                            sb.append(c);
                            sb.append("' at index ");
                            sb.append(this.f16850c);
                            throw new DecodingException(sb.toString());
                        }
                    } else if (this.f16851d || C5850g.this.f16839f.mo23259b(this.f16850c)) {
                        return -1;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid input length ");
                        sb2.append(this.f16850c);
                        throw new DecodingException(sb2.toString());
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Padding cannot start at index ");
                sb3.append(this.f16850c);
                throw new DecodingException(sb3.toString());
            }
        }

        C5850g(String str, String str2, @C5952h Character ch) {
            this(new C5848e(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C5799e mo23249c() {
            Character ch = this.f16840g;
            return ch == null ? C5799e.f16744a0 : C5799e.m25412b(ch.charValue());
        }

        /* renamed from: d */
        public BaseEncoding mo23250d() {
            BaseEncoding baseEncoding = this.f16841h;
            if (baseEncoding == 0) {
                C5848e e = this.f16839f.mo23262e();
                BaseEncoding gVar = e == this.f16839f ? this : new C5850g(e, this.f16840g);
                this.f16841h = gVar;
                baseEncoding = gVar;
            }
            return baseEncoding;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f16839f.toString());
            if (8 % this.f16839f.f16830j0 != 0) {
                if (this.f16840g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar(");
                    sb.append(this.f16840g);
                    sb.append(')');
                }
            }
            return sb.toString();
        }

        C5850g(C5848e eVar, @C5952h Character ch) {
            this.f16839f = (C5848e) C7397x.m35664a(eVar);
            C7397x.m35672a(ch == null || !eVar.mo23093a(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f16840g = ch;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8418h mo23240a(C8420j jVar) {
            C7397x.m35664a(jVar);
            return new C5851a(jVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo23246b(int i) {
            C5848e eVar = this.f16839f;
            return eVar.f16831k0 * C6602d.m31374a(i, eVar.f16832l0, RoundingMode.CEILING);
        }

        /* renamed from: b */
        public BaseEncoding mo23247b() {
            return this.f16840g == null ? this : new C5850g(this.f16839f, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo23233a(int i) {
            return (int) (((((long) this.f16839f.f16830j0) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8417g mo23239a(C8419i iVar) {
            C7397x.m35664a(iVar);
            return new C5852b(iVar);
        }

        /* renamed from: a */
        public BaseEncoding mo23235a(char c) {
            if (8 % this.f16839f.f16830j0 != 0) {
                Character ch = this.f16840g;
                if (ch == null || ch.charValue() != c) {
                    return new C5850g(this.f16839f, Character.valueOf(c));
                }
            }
            return this;
        }

        /* renamed from: a */
        public BaseEncoding mo23236a(String str, int i) {
            C7397x.m35664a(str);
            C7397x.m35671a(mo23249c().mo23098b((C5799e) this.f16839f).mo23105f(str), (Object) "Separator cannot contain alphabet or padding characters");
            return new C5849f(this, str, i);
        }

        /* renamed from: a */
        public BaseEncoding mo23234a() {
            BaseEncoding baseEncoding = this.f16842i;
            if (baseEncoding == 0) {
                C5848e d = this.f16839f.mo23261d();
                BaseEncoding gVar = d == this.f16839f ? this : new C5850g(d, this.f16840g);
                this.f16842i = gVar;
                baseEncoding = gVar;
            }
            return baseEncoding;
        }
    }

    static {
        Character valueOf = Character.valueOf('=');
        f16812a = new C5850g("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        f16813b = new C5850g("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        f16814c = new C5850g("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        f16815d = new C5850g("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
    }

    BaseEncoding() {
    }

    /* renamed from: e */
    public static BaseEncoding m25658e() {
        return f16816e;
    }

    /* renamed from: f */
    public static BaseEncoding m25659f() {
        return f16814c;
    }

    /* renamed from: g */
    public static BaseEncoding m25660g() {
        return f16815d;
    }

    /* renamed from: h */
    public static BaseEncoding m25661h() {
        return f16812a;
    }

    /* renamed from: i */
    public static BaseEncoding m25662i() {
        return f16813b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo23233a(int i);

    @C5944c
    /* renamed from: a */
    public abstract BaseEncoding mo23234a();

    @C5944c
    /* renamed from: a */
    public abstract BaseEncoding mo23235a(char c);

    @C5944c
    /* renamed from: a */
    public abstract BaseEncoding mo23236a(String str, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C8417g mo23239a(C8419i iVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C8418h mo23240a(C8420j jVar);

    /* renamed from: a */
    public String mo23243a(byte[] bArr) {
        return mo23244a((byte[]) C7397x.m35664a(bArr), 0, bArr.length);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo23246b(int i);

    @C5944c
    /* renamed from: b */
    public abstract BaseEncoding mo23247b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo23248b(CharSequence charSequence) throws DecodingException {
        String k = mo23249c().mo23110k(charSequence);
        C8417g a = mo23239a(C8410t.m39980a((CharSequence) k));
        byte[] bArr = new byte[mo23233a(k.length())];
        try {
            int read = a.read();
            int i = 0;
            while (read != -1) {
                int i2 = i + 1;
                bArr[i] = (byte) read;
                read = a.read();
                i = i2;
            }
            return m25657a(bArr, i);
        } catch (DecodingException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C5799e mo23249c();

    @C5944c
    /* renamed from: d */
    public abstract BaseEncoding mo23250d();

    /* renamed from: a */
    public final String mo23244a(byte[] bArr, int i, int i2) {
        C7397x.m35664a(bArr);
        C7397x.m35675b(i, i + i2, bArr.length);
        C8420j a = C8410t.m39981a(mo23246b(i2));
        C8418h a2 = mo23240a(a);
        int i3 = 0;
        while (i3 < i2) {
            try {
                a2.mo23265a(bArr[i + i3]);
                i3++;
            } catch (IOException unused) {
                throw new AssertionError("impossible");
            }
        }
        a2.close();
        return a.toString();
    }

    @C2777c("Writer,OutputStream")
    /* renamed from: a */
    public final OutputStream mo23242a(Writer writer) {
        return C8410t.m39984a(mo23240a(C8410t.m39982a(writer)));
    }

    @C2777c("ByteSink,CharSink")
    /* renamed from: a */
    public final C8352e mo23237a(C8376i iVar) {
        C7397x.m35664a(iVar);
        return new C5844a(iVar);
    }

    /* renamed from: a */
    private static byte[] m25657a(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo23245a(CharSequence charSequence) {
        try {
            return mo23248b(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C2777c("Reader,InputStream")
    /* renamed from: a */
    public final InputStream mo23241a(Reader reader) {
        return C8410t.m39983a(mo23239a(C8410t.m39979a(reader)));
    }

    @C2777c("ByteSource,CharSource")
    /* renamed from: a */
    public final C8358f mo23238a(C8377j jVar) {
        C7397x.m35664a(jVar);
        return new C5845b(jVar);
    }

    /* renamed from: a */
    static C8419i m25655a(C8419i iVar, C5799e eVar) {
        C7397x.m35664a(iVar);
        C7397x.m35664a(eVar);
        return new C5846c(iVar, eVar);
    }

    /* renamed from: a */
    static C8420j m25656a(C8420j jVar, String str, int i) {
        C7397x.m35664a(jVar);
        C7397x.m35664a(str);
        C7397x.m35670a(i > 0);
        return new C5847d(i, str, jVar);
    }
}
