package com.instabug.featuresrequest.p373ui.p378d;

import androidx.annotation.C0195i0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1404l;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.p368a.C9534c;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.d.d */
/* compiled from: FeaturesMainViewPagerAdapter */
public class C9677d extends C1404l {

    /* renamed from: n */
    private static transient /* synthetic */ boolean[] f25638n;

    /* renamed from: m */
    C9534c f25639m;

    public C9677d(C1382h hVar, C9534c cVar) {
        boolean[] d = m45210d();
        super(hVar);
        this.f25639m = cVar;
        d[0] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m45210d() {
        boolean[] zArr = f25638n;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4512302551272370962L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainViewPagerAdapter", 8);
        f25638n = a;
        return a;
    }

    /* renamed from: a */
    public int mo8886a() {
        m45210d()[4] = true;
        return 2;
    }

    /* renamed from: c */
    public Fragment mo6388c(int i) {
        boolean[] d = m45210d();
        if (i == 0) {
            Fragment b = this.f25639m.mo34218b(i);
            d[1] = true;
            return b;
        } else if (i != 1) {
            d[3] = true;
            return null;
        } else {
            Fragment b2 = this.f25639m.mo34218b(i);
            d[2] = true;
            return b2;
        }
    }

    @C0195i0
    /* renamed from: a */
    public CharSequence mo8888a(int i) {
        boolean[] d = m45210d();
        if (i == 0) {
            d[5] = true;
            return "Features";
        } else if (i != 1) {
            d[7] = true;
            return "";
        } else {
            d[6] = true;
            return "My features";
        }
    }
}
