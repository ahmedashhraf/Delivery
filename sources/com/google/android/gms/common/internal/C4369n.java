package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.api.C4059a.C4071f;

/* renamed from: com.google.android.gms.common.internal.n */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4369n {

    /* renamed from: a */
    private final SparseIntArray f13512a;

    /* renamed from: b */
    private C4282f f13513b;

    public C4369n() {
        this(C4279e.m18476a());
    }

    /* renamed from: a */
    public int mo18367a(@C0193h0 Context context, @C0193h0 C4071f fVar) {
        C4300a0.m18620a(context);
        C4300a0.m18620a(fVar);
        if (!fVar.mo17644k()) {
            return 0;
        }
        int l = fVar.mo10085l();
        int i = this.f13512a.get(l, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f13512a.size()) {
                break;
            }
            int keyAt = this.f13512a.keyAt(i2);
            if (keyAt > l && this.f13512a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f13513b.mo18094a(context, l);
        }
        this.f13512a.put(l, i);
        return i;
    }

    public C4369n(@C0193h0 C4282f fVar) {
        this.f13512a = new SparseIntArray();
        C4300a0.m18620a(fVar);
        this.f13513b = fVar;
    }

    /* renamed from: a */
    public void mo18368a() {
        this.f13512a.clear();
    }
}
