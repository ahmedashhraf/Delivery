package okhttp3.internal.http2;

import okhttp3.internal.C14910b;
import p468g.C13866u;
import p470h.C13896f;

/* renamed from: okhttp3.internal.http2.b */
/* compiled from: Header */
public final class C14964b {

    /* renamed from: d */
    public static final C13896f f43401d = C13896f.m59655e(":");

    /* renamed from: e */
    public static final String f43402e = ":status";

    /* renamed from: f */
    public static final String f43403f = ":method";

    /* renamed from: g */
    public static final String f43404g = ":path";

    /* renamed from: h */
    public static final String f43405h = ":scheme";

    /* renamed from: i */
    public static final String f43406i = ":authority";

    /* renamed from: j */
    public static final C13896f f43407j = C13896f.m59655e(f43402e);

    /* renamed from: k */
    public static final C13896f f43408k = C13896f.m59655e(f43403f);

    /* renamed from: l */
    public static final C13896f f43409l = C13896f.m59655e(f43404g);

    /* renamed from: m */
    public static final C13896f f43410m = C13896f.m59655e(f43405h);

    /* renamed from: n */
    public static final C13896f f43411n = C13896f.m59655e(f43406i);

    /* renamed from: a */
    public final C13896f f43412a;

    /* renamed from: b */
    public final C13896f f43413b;

    /* renamed from: c */
    final int f43414c;

    /* renamed from: okhttp3.internal.http2.b$a */
    /* compiled from: Header */
    interface C14965a {
        /* renamed from: a */
        void mo46485a(C13866u uVar);
    }

    public C14964b(String str, String str2) {
        this(C13896f.m59655e(str), C13896f.m59655e(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14964b)) {
            return false;
        }
        C14964b bVar = (C14964b) obj;
        if (!this.f43412a.equals(bVar.f43412a) || !this.f43413b.equals(bVar.f43413b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f43412a.hashCode()) * 31) + this.f43413b.hashCode();
    }

    public String toString() {
        return C14910b.m66045a("%s: %s", this.f43412a.mo43990v(), this.f43413b.mo43990v());
    }

    public C14964b(C13896f fVar, String str) {
        this(fVar, C13896f.m59655e(str));
    }

    public C14964b(C13896f fVar, C13896f fVar2) {
        this.f43412a = fVar;
        this.f43413b = fVar2;
        this.f43414c = fVar.mo43985r() + 32 + fVar2.mo43985r();
    }
}
