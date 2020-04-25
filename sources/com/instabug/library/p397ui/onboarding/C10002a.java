package com.instabug.library.p397ui.onboarding;

import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1404l;
import androidx.fragment.app.Fragment;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.onboarding.a */
/* compiled from: GenericPagerAdapter */
public class C10002a extends C1404l {

    /* renamed from: n */
    private static transient /* synthetic */ boolean[] f26612n;

    /* renamed from: m */
    List<C10008d> f26613m;

    public C10002a(C1382h hVar, List<C10008d> list) {
        boolean[] d = m46559d();
        super(hVar);
        this.f26613m = list;
        d[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m46559d() {
        boolean[] zArr = f26612n;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1061024606692028873L, "com/instabug/library/ui/onboarding/GenericPagerAdapter", 3);
        f26612n = a;
        return a;
    }

    /* renamed from: a */
    public int mo8886a() {
        boolean[] d = m46559d();
        int size = this.f26613m.size();
        d[2] = true;
        return size;
    }

    /* renamed from: c */
    public Fragment mo6388c(int i) {
        Fragment fragment = (Fragment) this.f26613m.get(i);
        m46559d()[1] = true;
        return fragment;
    }
}
