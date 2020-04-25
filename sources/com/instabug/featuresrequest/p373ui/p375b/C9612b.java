package com.instabug.featuresrequest.p373ui.p375b;

import com.instabug.featuresrequest.models.C9567a;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.b.b */
/* compiled from: BaseFeaturesListDao */
public abstract class C9612b {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25441b;

    /* renamed from: a */
    protected int f25442a = 1;

    public C9612b() {
        boolean[] e = m44971e();
        e[0] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m44971e() {
        boolean[] zArr = f25441b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(475993671288899634L, "com/instabug/featuresrequest/ui/base/BaseFeaturesListDao", 2);
        f25441b = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C9567a mo34420a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34421a() {
        boolean[] e = m44971e();
        this.f25442a++;
        e[1] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34422a(List<C9567a> list);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C9567a> mo34423b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo34424c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo34425d();
}
