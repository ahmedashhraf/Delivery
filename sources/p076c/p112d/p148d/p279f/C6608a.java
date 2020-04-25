package p076c.p112d.p148d.p279f;

import com.google.common.base.C5827t;
import com.google.common.base.C7336f0;
import com.google.common.base.C7397x;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5967b;
import p205i.p489f.C14069f;

@C2776b
@C5967b
@C2775a
/* renamed from: c.d.d.f.a */
/* compiled from: HostAndPort */
public final class C6608a implements Serializable {

    /* renamed from: O */
    private static final int f18371O = -1;
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    private final boolean f18372N;

    /* renamed from: a */
    private final String f18373a;

    /* renamed from: b */
    private final int f18374b;

    private C6608a(String str, int i, boolean z) {
        this.f18373a = str;
        this.f18374b = i;
        this.f18372N = z;
    }

    /* renamed from: b */
    public static C6608a m31421b(String str) {
        C6608a c = m31422c(str);
        C7397x.m35672a(!c.mo26533e(), "Host has a port: %s", str);
        return c;
    }

    /* renamed from: c */
    public static C6608a m31422c(String str) {
        boolean z;
        String str2;
        String str3;
        C7397x.m35664a(str);
        int i = -1;
        if (str.startsWith("[")) {
            String[] d = m31424d(str);
            z = false;
            String str4 = d[0];
            str2 = d[1];
            str3 = str4;
        } else {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    str3 = str.substring(0, indexOf);
                    str2 = str.substring(i2);
                    z = false;
                }
            }
            boolean z2 = indexOf >= 0;
            str2 = null;
            z = z2;
            str3 = str;
        }
        if (!C7336f0.m35535b(str2)) {
            C7397x.m35672a(!str2.startsWith(C14069f.f41344H), "Unparseable port number: %s", str);
            try {
                i = Integer.parseInt(str2);
                C7397x.m35672a(m31423c(i), "Port number out of range: %s", str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unparseable port number: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new C6608a(str3, i, z);
    }

    /* renamed from: c */
    private static boolean m31423c(int i) {
        return i >= 0 && i <= 65535;
    }

    /* renamed from: a */
    public String mo26530a() {
        return this.f18373a;
    }

    /* renamed from: d */
    public int mo26532d() {
        C7397x.m35676b(mo26533e());
        return this.f18374b;
    }

    /* renamed from: e */
    public boolean mo26533e() {
        return this.f18374b >= 0;
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6608a)) {
            return false;
        }
        C6608a aVar = (C6608a) obj;
        if (!(C5827t.m25562a(this.f18373a, aVar.f18373a) && this.f18374b == aVar.f18374b && this.f18372N == aVar.f18372N)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public C6608a mo26535f() {
        C7397x.m35672a(!this.f18372N, "Possible bracketless IPv6 literal: %s", this.f18373a);
        return this;
    }

    public int hashCode() {
        return C5827t.m25558a(this.f18373a, Integer.valueOf(this.f18374b), Boolean.valueOf(this.f18372N));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f18373a.length() + 8);
        if (this.f18373a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.f18373a);
            sb.append(']');
        } else {
            sb.append(this.f18373a);
        }
        if (mo26533e()) {
            sb.append(':');
            sb.append(this.f18374b);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo26529a(int i) {
        return mo26533e() ? this.f18374b : i;
    }

    /* renamed from: a */
    public static C6608a m31420a(String str, int i) {
        C7397x.m35672a(m31423c(i), "Port out of range: %s", Integer.valueOf(i));
        C6608a c = m31422c(str);
        C7397x.m35672a(!c.mo26533e(), "Host has a port: %s", str);
        return new C6608a(c.f18373a, i, c.f18372N);
    }

    /* renamed from: d */
    private static String[] m31424d(String str) {
        C7397x.m35672a(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        C7397x.m35672a(indexOf > -1 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", str);
        String substring = str.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{substring, ""};
        }
        C7397x.m35672a(str.charAt(i) == ':', "Only a colon may follow a close bracket: %s", str);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            C7397x.m35672a(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new String[]{substring, str.substring(i2)};
    }

    /* renamed from: b */
    public C6608a mo26531b(int i) {
        C7397x.m35670a(m31423c(i));
        return (mo26533e() || this.f18374b == i) ? this : new C6608a(this.f18373a, i, this.f18372N);
    }
}
