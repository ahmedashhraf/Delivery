package p076c.p112d.p148d.p279f;

import com.google.common.base.C7397x;
import java.net.InetAddress;
import java.text.ParseException;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.f.b */
/* compiled from: HostSpecifier */
public final class C6609b {

    /* renamed from: a */
    private final String f18375a;

    private C6609b(String str) {
        this.f18375a = str;
    }

    /* renamed from: a */
    public static C6609b m31431a(String str) throws ParseException {
        try {
            return m31432b(str);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid host specifier: ");
            sb.append(str);
            ParseException parseException = new ParseException(sb.toString(), 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* renamed from: b */
    public static C6609b m31432b(String str) {
        C6608a c = C6608a.m31422c(str);
        C7397x.m35670a(!c.mo26533e());
        String a = c.mo26530a();
        InetAddress inetAddress = null;
        try {
            inetAddress = C6611d.m31445b(a);
        } catch (IllegalArgumentException unused) {
        }
        if (inetAddress != null) {
            return new C6609b(C6611d.m31457f(inetAddress));
        }
        C6613e b = C6613e.m31476b(a);
        if (b.mo26547b()) {
            return new C6609b(b.toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Domain name does not have a recognized public suffix: ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static boolean m31433c(String str) {
        try {
            m31432b(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@C5952h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6609b)) {
            return false;
        }
        return this.f18375a.equals(((C6609b) obj).f18375a);
    }

    public int hashCode() {
        return this.f18375a.hashCode();
    }

    public String toString() {
        return this.f18375a;
    }
}
