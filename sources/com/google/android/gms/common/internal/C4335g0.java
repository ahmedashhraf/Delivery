package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C4059a.C4073h;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4335g0<T extends IInterface> extends C4346k<T> {

    /* renamed from: L */
    private final C4073h<T> f13478L;

    public C4335g0(Context context, Looper looper, int i, C4088b bVar, C4089c cVar, C4329f fVar, C4073h<T> hVar) {
        super(context, looper, i, fVar, bVar, cVar);
        this.f13478L = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo10082A() {
        return this.f13478L.mo17651q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo10083B() {
        return this.f13478L.mo17652r();
    }

    /* renamed from: E */
    public C4073h<T> mo17532E() {
        return this.f13478L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo10084a(IBinder iBinder) {
        return this.f13478L.mo17648a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18234a(int i, T t) {
        this.f13478L.mo17649a(i, t);
    }
}
