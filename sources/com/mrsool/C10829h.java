package com.mrsool;

import android.view.ViewGroup;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1404l;
import androidx.fragment.app.Fragment;
import com.mrsool.order.C11035n;
import com.mrsool.p409me.C10908g;
import com.mrsool.p416s.C11190d;
import com.mrsool.p424w.C11741a;
import com.mrsool.stores.C11540g;
import java.util.ArrayList;

/* renamed from: com.mrsool.h */
/* compiled from: BottomTabPagerAdapter */
public class C10829h extends C1404l {

    /* renamed from: m */
    private ArrayList<Fragment> f29731m = new ArrayList<>();

    /* renamed from: n */
    private Fragment f29732n;

    public C10829h(C1382h hVar, boolean z) {
        super(hVar, 1);
        this.f29731m.clear();
        this.f29731m.add(new C11540g());
        this.f29731m.add(new C11035n());
        this.f29731m.add(new C11741a());
        if (z) {
            this.f29731m.add(new C11190d());
        }
        this.f29731m.add(new C10908g());
    }

    /* renamed from: a */
    public int mo8886a() {
        return this.f29731m.size();
    }

    /* renamed from: b */
    public void mo6386b(ViewGroup viewGroup, int i, Object obj) {
        if (mo38464d() != obj) {
            this.f29732n = (Fragment) obj;
        }
        super.mo6386b(viewGroup, i, obj);
    }

    /* renamed from: c */
    public Fragment mo6388c(int i) {
        return (Fragment) this.f29731m.get(i);
    }

    /* renamed from: d */
    public Fragment mo38464d() {
        return this.f29732n;
    }

    /* renamed from: a */
    public void mo6382a(ViewGroup viewGroup) {
        try {
            super.mo6382a(viewGroup);
        } catch (Exception unused) {
            System.out.println("Catch the NullPointerException in FragmentPagerAdapter.finishUpdate");
        }
    }
}
