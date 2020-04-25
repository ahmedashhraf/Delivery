package com.clevertap.android.sdk;

import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1404l;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.clevertap.android.sdk.k0 */
/* compiled from: CTInboxTabAdapter */
public class C3123k0 extends C1404l {

    /* renamed from: m */
    private final Fragment[] f11179m;

    /* renamed from: n */
    private final List<String> f11180n = new ArrayList();

    public C3123k0(C1382h hVar, int i) {
        super(hVar);
        this.f11179m = new Fragment[i];
    }

    /* renamed from: a */
    public int mo8886a() {
        return this.f11179m.length;
    }

    /* renamed from: c */
    public Fragment mo6388c(int i) {
        return this.f11179m[i];
    }

    @C0195i0
    /* renamed from: a */
    public CharSequence mo8888a(int i) {
        return (CharSequence) this.f11180n.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12339a(Fragment fragment, String str, int i) {
        this.f11179m[i] = fragment;
        this.f11180n.add(str);
    }

    @C0193h0
    /* renamed from: a */
    public Object mo6380a(@C0193h0 ViewGroup viewGroup, int i) {
        Object a = super.mo6380a(viewGroup, i);
        this.f11179m[i] = (Fragment) a;
        return a;
    }
}
