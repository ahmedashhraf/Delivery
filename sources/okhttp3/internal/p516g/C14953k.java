package okhttp3.internal.p516g;

import java.io.IOException;
import java.net.ProtocolException;
import p468g.C13799a0;
import p468g.C13823e0;

/* renamed from: okhttp3.internal.g.k */
/* compiled from: StatusLine */
public final class C14953k {

    /* renamed from: d */
    public static final int f43360d = 307;

    /* renamed from: e */
    public static final int f43361e = 308;

    /* renamed from: f */
    public static final int f43362f = 100;

    /* renamed from: a */
    public final C13799a0 f43363a;

    /* renamed from: b */
    public final int f43364b;

    /* renamed from: c */
    public final String f43365c;

    public C14953k(C13799a0 a0Var, int i, String str) {
        this.f43363a = a0Var;
        this.f43364b = i;
        this.f43365c = str;
    }

    /* renamed from: a */
    public static C14953k m66275a(C13823e0 e0Var) {
        return new C14953k(e0Var.mo43412K(), e0Var.mo43425g(), e0Var.mo43408G());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f43363a == C13799a0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f43364b);
        if (this.f43365c != null) {
            sb.append(' ');
            sb.append(this.f43365c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C14953k m66276a(String str) throws IOException {
        C13799a0 a0Var;
        String str2;
        int i = 9;
        String str3 = "Unexpected status line: ";
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new ProtocolException(sb.toString());
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                a0Var = C13799a0.HTTP_1_0;
            } else if (charAt == 1) {
                a0Var = C13799a0.HTTP_1_1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str);
                throw new ProtocolException(sb2.toString());
            }
        } else if (str.startsWith("ICY ")) {
            a0Var = C13799a0.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            throw new ProtocolException(sb3.toString());
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(str);
                    throw new ProtocolException(sb4.toString());
                }
                return new C14953k(a0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str);
                throw new ProtocolException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(str);
            throw new ProtocolException(sb6.toString());
        }
    }
}
