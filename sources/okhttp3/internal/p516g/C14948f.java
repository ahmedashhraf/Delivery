package okhttp3.internal.p516g;

import com.google.api.client.http.C7304t;

/* renamed from: okhttp3.internal.g.f */
/* compiled from: HttpMethod */
public final class C14948f {
    private C14948f() {
    }

    /* renamed from: a */
    public static boolean m66244a(String str) {
        return str.equals("POST") || str.equals(C7304t.f20670f) || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m66245b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m66246c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m66247d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m66248e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals(C7304t.f20670f) || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
