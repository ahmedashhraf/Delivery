package com.google.android.gms.common.api.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.api.C4059a.C4071f;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4202t0 extends C4222x0 {

    /* renamed from: N */
    private final /* synthetic */ C4171n0 f13147N;

    /* renamed from: b */
    private final ArrayList<C4071f> f13148b;

    public C4202t0(C4171n0 n0Var, ArrayList<C4071f> arrayList) {
        this.f13147N = n0Var;
        super(n0Var, null);
        this.f13148b = arrayList;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo17942a() {
        this.f13147N.f13058a.f13004Y.f13212t = this.f13147N.m18085i();
        ArrayList<C4071f> arrayList = this.f13148b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C4071f) obj).mo17636a(this.f13147N.f13072o, this.f13147N.f13058a.f13004Y.f13212t);
        }
    }
}
