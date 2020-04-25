package org.apache.http.p541f0;

import java.util.HashMap;
import org.apache.http.C15348i;
import org.apache.http.p546g0.C15320d;

/* renamed from: org.apache.http.f0.i */
/* compiled from: HttpConnectionMetricsImpl */
public class C15259i implements C15348i {

    /* renamed from: f */
    public static final String f44198f = "http.request-count";

    /* renamed from: g */
    public static final String f44199g = "http.response-count";

    /* renamed from: h */
    public static final String f44200h = "http.sent-bytes-count";

    /* renamed from: i */
    public static final String f44201i = "http.received-bytes-count";

    /* renamed from: a */
    private final C15320d f44202a;

    /* renamed from: b */
    private final C15320d f44203b;

    /* renamed from: c */
    private long f44204c = 0;

    /* renamed from: d */
    private long f44205d = 0;

    /* renamed from: e */
    private HashMap f44206e;

    public C15259i(C15320d dVar, C15320d dVar2) {
        this.f44202a = dVar;
        this.f44203b = dVar2;
    }

    /* renamed from: a */
    public long mo47217a() {
        C15320d dVar = this.f44202a;
        if (dVar != null) {
            return dVar.mo47399a();
        }
        return -1;
    }

    /* renamed from: b */
    public long mo47220b() {
        C15320d dVar = this.f44203b;
        if (dVar != null) {
            return dVar.mo47399a();
        }
        return -1;
    }

    /* renamed from: c */
    public long mo47221c() {
        return this.f44204c;
    }

    /* renamed from: d */
    public long mo47222d() {
        return this.f44205d;
    }

    /* renamed from: e */
    public void mo47223e() {
        this.f44204c++;
    }

    /* renamed from: f */
    public void mo47224f() {
        this.f44205d++;
    }

    public void reset() {
        C15320d dVar = this.f44203b;
        if (dVar != null) {
            dVar.reset();
        }
        C15320d dVar2 = this.f44202a;
        if (dVar2 != null) {
            dVar2.reset();
        }
        this.f44204c = 0;
        this.f44205d = 0;
        this.f44206e = null;
    }

    /* renamed from: a */
    public Object mo47218a(String str) {
        HashMap hashMap = this.f44206e;
        Object obj = hashMap != null ? hashMap.get(str) : null;
        if (obj == null) {
            if (f44198f.equals(str)) {
                obj = new Long(this.f44204c);
            } else if (f44199g.equals(str)) {
                obj = new Long(this.f44205d);
            } else if (f44201i.equals(str)) {
                C15320d dVar = this.f44202a;
                if (dVar != null) {
                    return new Long(dVar.mo47399a());
                }
                return null;
            } else if (f44200h.equals(str)) {
                C15320d dVar2 = this.f44203b;
                if (dVar2 != null) {
                    return new Long(dVar2.mo47399a());
                }
                return null;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public void mo47219a(String str, Object obj) {
        if (this.f44206e == null) {
            this.f44206e = new HashMap();
        }
        this.f44206e.put(str, obj);
    }
}
