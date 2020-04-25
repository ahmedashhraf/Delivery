package com.instabug.featuresrequest.p373ui.custom;

import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.f */
/* compiled from: ToolbarActionButton */
public class C9659f {

    /* renamed from: e */
    private static transient /* synthetic */ boolean[] f25601e;
    @C0213q

    /* renamed from: a */
    private int f25602a;
    @C0214q0

    /* renamed from: b */
    private int f25603b;

    /* renamed from: c */
    private C9660a f25604c;

    /* renamed from: d */
    private C9661b f25605d;

    /* renamed from: com.instabug.featuresrequest.ui.custom.f$a */
    /* compiled from: ToolbarActionButton */
    public interface C9660a {
        /* renamed from: d */
        void mo34351d();
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.f$b */
    /* compiled from: ToolbarActionButton */
    public enum C9661b {
        ICON(0),
        TEXT(1),
        VOTE(2);
        
        private int type;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C9661b(int i) {
            boolean[] d = m45157d();
            this.type = i;
            d[2] = true;
        }
    }

    public C9659f(int i, int i2, C9660a aVar, C9661b bVar) {
        boolean[] e = m45151e();
        this.f25602a = i;
        this.f25603b = i2;
        this.f25604c = aVar;
        this.f25605d = bVar;
        e[0] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45151e() {
        boolean[] zArr = f25601e;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8861428514563034387L, "com/instabug/featuresrequest/ui/custom/ToolbarActionButton", 9);
        f25601e = a;
        return a;
    }

    /* renamed from: a */
    public int mo34545a() {
        boolean[] e = m45151e();
        int i = this.f25602a;
        e[1] = true;
        return i;
    }

    /* renamed from: b */
    public int mo34546b() {
        boolean[] e = m45151e();
        int i = this.f25603b;
        e[3] = true;
        return i;
    }

    /* renamed from: c */
    public C9660a mo34547c() {
        boolean[] e = m45151e();
        C9660a aVar = this.f25604c;
        e[5] = true;
        return aVar;
    }

    /* renamed from: d */
    public C9661b mo34548d() {
        boolean[] e = m45151e();
        C9661b bVar = this.f25605d;
        e[7] = true;
        return bVar;
    }
}
