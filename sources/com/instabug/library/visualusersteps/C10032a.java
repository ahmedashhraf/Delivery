package com.instabug.library.visualusersteps;

import com.instabug.library.model.C9953d.C9954a;
import java.util.LinkedList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.visualusersteps.a */
/* compiled from: Parent */
class C10032a {

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f26699f;

    /* renamed from: a */
    private String f26700a;

    /* renamed from: b */
    private String f26701b;

    /* renamed from: c */
    private C10033a f26702c;

    /* renamed from: d */
    private LinkedList<C10034b> f26703d = new LinkedList<>();

    /* renamed from: e */
    private boolean f26704e;

    /* renamed from: com.instabug.library.visualusersteps.a$a */
    /* compiled from: Parent */
    public static class C10033a {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26705c;

        /* renamed from: a */
        private String f26706a;

        /* renamed from: b */
        private String f26707b;

        public C10033a(String str) {
            boolean[] c = m46670c();
            this.f26706a = str;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46670c() {
            boolean[] zArr = f26705c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3950106910884175597L, "com/instabug/library/visualusersteps/Parent$Screenshot", 4);
            f26705c = a;
            return a;
        }

        /* renamed from: a */
        public String mo36049a() {
            boolean[] c = m46670c();
            String str = this.f26706a;
            c[1] = true;
            return str;
        }

        /* renamed from: b */
        public String mo36051b() {
            boolean[] c = m46670c();
            String str = this.f26707b;
            c[3] = true;
            return str;
        }

        /* renamed from: a */
        public void mo36050a(String str) {
            boolean[] c = m46670c();
            this.f26707b = str;
            c[2] = true;
        }
    }

    C10032a(String str, String str2) {
        boolean[] h = m46660h();
        this.f26700a = str;
        this.f26701b = str2;
        h[0] = true;
        h[1] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46660h() {
        boolean[] zArr = f26699f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1298459546098598391L, "com/instabug/library/visualusersteps/Parent", 17);
        f26699f = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo36040a() {
        boolean[] h = m46660h();
        String str = this.f26701b;
        h[2] = true;
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public LinkedList<C10034b> mo36043b() {
        boolean[] h = m46660h();
        LinkedList<C10034b> linkedList = this.f26703d;
        h[10] = true;
        return linkedList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo36044c() {
        boolean[] h = m46660h();
        int size = this.f26703d.size();
        h[11] = true;
        return size;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo36045d() {
        boolean[] h = m46660h();
        this.f26703d.removeFirst();
        h[12] = true;
    }

    /* renamed from: e */
    public String mo36046e() {
        boolean[] h = m46660h();
        String str = this.f26700a;
        h[13] = true;
        return str;
    }

    /* renamed from: f */
    public C10033a mo36047f() {
        boolean[] h = m46660h();
        C10033a aVar = this.f26702c;
        h[15] = true;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo36048g() {
        boolean[] h = m46660h();
        boolean z = this.f26704e;
        h[16] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36042a(C10034b bVar) {
        boolean[] h = m46660h();
        this.f26703d.add(bVar);
        h[3] = true;
        if (bVar.mo36063h().equals(C9954a.ACTIVITY_RESUMED)) {
            h[4] = true;
        } else {
            h[5] = true;
            if (!bVar.mo36063h().equals(C9954a.FRAGMENT_RESUMED)) {
                h[6] = true;
                h[9] = true;
            }
            h[7] = true;
        }
        this.f26704e = true;
        h[8] = true;
        h[9] = true;
    }

    /* renamed from: a */
    public void mo36041a(C10033a aVar) {
        boolean[] h = m46660h();
        this.f26702c = aVar;
        h[14] = true;
    }
}
