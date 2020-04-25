package okhttp3.internal.p516g;

import java.net.Proxy.Type;
import p468g.C13813c0;
import p468g.C13868v;

/* renamed from: okhttp3.internal.g.i */
/* compiled from: RequestLine */
public final class C14951i {
    private C14951i() {
    }

    /* renamed from: a */
    public static String m66261a(C13813c0 c0Var, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c0Var.mo43356e());
        sb.append(' ');
        if (m66263b(c0Var, type)) {
            sb.append(c0Var.mo43359h());
        } else {
            sb.append(m66262a(c0Var.mo43359h()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m66263b(C13813c0 c0Var, Type type) {
        return !c0Var.mo43355d() && type == Type.HTTP;
    }

    /* renamed from: a */
    public static String m66262a(C13868v vVar) {
        String c = vVar.mo43641c();
        String e = vVar.mo43645e();
        if (e == null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('?');
        sb.append(e);
        return sb.toString();
    }
}
