package com.google.android.gms.dynamic;

import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4526i implements C4524g<T> {

    /* renamed from: a */
    private final /* synthetic */ C4513a f13786a;

    C4526i(C4513a aVar) {
        this.f13786a = aVar;
    }

    /* renamed from: a */
    public final void mo18633a(T t) {
        this.f13786a.zaru = t;
        Iterator it = this.f13786a.zarw.iterator();
        while (it.hasNext()) {
            ((C4514a) it.next()).mo18594a(this.f13786a.zaru);
        }
        this.f13786a.zarw.clear();
        this.f13786a.zarv = null;
    }
}
