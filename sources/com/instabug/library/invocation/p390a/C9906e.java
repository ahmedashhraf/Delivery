package com.instabug.library.invocation.p390a;

import android.content.Context;
import com.instabug.library.invocation.C9909b;
import com.instabug.library.util.C10024e;
import com.instabug.library.util.C10024e.C10025a;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.a.e */
/* compiled from: ShakeInvoker */
public class C9906e implements C9882a<Void>, C10025a {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f26344N;

    /* renamed from: a */
    private C10024e f26345a;

    /* renamed from: b */
    private C9909b f26346b;

    public C9906e(Context context, C9909b bVar) {
        boolean[] a = m46113a();
        this.f26346b = bVar;
        a[0] = true;
        this.f26345a = new C10024e(context, this);
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46113a() {
        boolean[] zArr = f26344N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2044190373352837479L, "com/instabug/library/invocation/invoker/ShakeInvoker", 9);
        f26344N = a;
        return a;
    }

    /* renamed from: a */
    public void mo35217a(int i) {
        boolean[] a = m46113a();
        this.f26345a.mo36008a(i);
        a[7] = true;
    }

    /* renamed from: c */
    public void mo35184c() {
        boolean[] a = m46113a();
        this.f26345a.mo36010b();
        a[3] = true;
    }

    /* renamed from: d */
    public void mo35185d() {
        boolean[] a = m46113a();
        this.f26345a.mo36007a();
        a[2] = true;
    }

    /* renamed from: e */
    public void mo35218e() {
        boolean[] a = m46113a();
        InstabugSDKLogger.m46622d(this, "Shake detected, invoking SDK");
        a[5] = true;
        this.f26346b.onInvocationRequested();
        a[6] = true;
    }
}
