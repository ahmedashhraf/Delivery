package com.mrsool.p423v;

import androidx.annotation.C0193h0;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.mrsool.v.h */
/* compiled from: PaletteBitmapResource */
public class C11727h implements C2322l<C11726g> {

    /* renamed from: a */
    private final C11726g f33936a;

    /* renamed from: b */
    private final C2330c f33937b;

    public C11727h(@C0193h0 C11726g gVar, @C0193h0 C2330c cVar) {
        this.f33936a = gVar;
        this.f33937b = cVar;
    }

    /* renamed from: a */
    public void mo9702a() {
        if (!this.f33937b.mo9734a(this.f33936a.f33935b)) {
            this.f33936a.f33935b.recycle();
        }
    }

    public int getSize() {
        return C2216i.m11338a(this.f33936a.f33935b);
    }

    public C11726g get() {
        return this.f33936a;
    }
}
