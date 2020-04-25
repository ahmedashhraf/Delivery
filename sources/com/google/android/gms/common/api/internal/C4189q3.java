package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.common.internal.C4329f;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;

/* renamed from: com.google.android.gms.common.api.internal.q3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4189q3<O extends C4063d> extends C4083h<O> {

    /* renamed from: j */
    private final C4071f f13123j;

    /* renamed from: k */
    private final C4149j3 f13124k;

    /* renamed from: l */
    private final C4329f f13125l;

    /* renamed from: m */
    private final C4060a<? extends C2683d, C2679a> f13126m;

    public C4189q3(@C0193h0 Context context, C4059a<O> aVar, Looper looper, @C0193h0 C4071f fVar, @C0193h0 C4149j3 j3Var, C4329f fVar2, C4060a<? extends C2683d, C2679a> aVar2) {
        super(context, aVar, looper);
        this.f13123j = fVar;
        this.f13124k = j3Var;
        this.f13125l = fVar2;
        this.f13126m = aVar2;
        this.f12835i.mo17849a((C4083h<?>) this);
    }

    /* renamed from: a */
    public final C4071f mo17668a(Looper looper, C4138a<O> aVar) {
        this.f13124k.mo17909a((C4161l3) aVar);
        return this.f13123j;
    }

    /* renamed from: k */
    public final C4071f mo17953k() {
        return this.f13123j;
    }

    /* renamed from: a */
    public final C4148j2 mo17670a(Context context, Handler handler) {
        return new C4148j2(context, handler, this.f13125l, this.f13126m);
    }
}
