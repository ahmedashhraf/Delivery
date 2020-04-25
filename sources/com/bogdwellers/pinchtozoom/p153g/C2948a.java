package com.bogdwellers.pinchtozoom.p153g;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bogdwellers.pinchtozoom.C2941b;

/* renamed from: com.bogdwellers.pinchtozoom.g.a */
/* compiled from: AbsCorrectorAnimatorHandler */
public abstract class C2948a implements AnimatorUpdateListener {

    /* renamed from: a */
    private C2941b f10447a;

    /* renamed from: b */
    private float[] f10448b = new float[9];

    public C2948a(C2941b bVar) {
        this.f10447a = bVar;
    }

    /* renamed from: a */
    public C2941b mo11729a() {
        return this.f10447a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float[] mo11730b() {
        return this.f10448b;
    }
}
