package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
/* renamed from: c.d.b.a.c.d.a.o */
/* compiled from: OAuth2Utils */
public class C6219o {

    /* renamed from: a */
    static final Charset f17506a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Logger f17507b = Logger.getLogger(C6219o.class.getName());

    /* renamed from: c */
    private static final String f17508c = "http://169.254.169.254";

    /* renamed from: d */
    private static final int f17509d = 3;

    /* renamed from: e */
    private static final int f17510e = 500;

    /* renamed from: a */
    static <T extends Throwable> T m28803a(T t, Throwable th) {
        t.initCause(th);
        return t;
    }

    /* renamed from: a */
    static boolean m28805a(C7299q qVar, String str, String str2) {
        Object obj = qVar.get(str);
        if (obj instanceof Collection) {
            for (Object next : (Collection) obj) {
                if ((next instanceof String) && ((String) next).equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m28804a(C7253a0 a0Var, C6220p pVar) {
        C7309x a;
        if (Boolean.parseBoolean(pVar.mo25336a("NO_GCE_CHECK"))) {
            return false;
        }
        C7274j jVar = new C7274j(m28802a(pVar));
        int i = 1;
        while (i <= 3) {
            try {
                C7305u b = a0Var.mo28859b().mo29135b(jVar);
                b.mo29078a(500);
                a = b.mo29092a();
                boolean a2 = m28805a(a.mo29150g(), "Metadata-Flavor", "Google");
                a.mo29143a();
                return a2;
            } catch (SocketTimeoutException unused) {
                i++;
            } catch (IOException e) {
                f17507b.log(Level.WARNING, "Failed to detect whether we are running on Google Compute Engine.", e);
                i++;
            } catch (Throwable th) {
                a.mo29143a();
                throw th;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m28801a() {
        return m28802a(C6220p.f17511a);
    }

    /* renamed from: a */
    static String m28802a(C6220p pVar) {
        String a = pVar.mo25336a("GCE_METADATA_HOST");
        if (a == null) {
            return f17508c;
        }
        String str = "http://";
        String valueOf = String.valueOf(a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
