package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.core.p033k.C0944i;
import com.google.android.material.p179a.C5588b;
import com.google.android.material.p179a.C5594h;
import java.util.ArrayList;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: BaseMotionStrategy */
abstract class C6862b implements C6881f {

    /* renamed from: a */
    private final Context f19130a;
    @C0193h0

    /* renamed from: b */
    private final ExtendedFloatingActionButton f19131b;

    /* renamed from: c */
    private final ArrayList<AnimatorListener> f19132c = new ArrayList<>();

    /* renamed from: d */
    private final C6861a f19133d;
    @C0195i0

    /* renamed from: e */
    private C5594h f19134e;
    @C0195i0

    /* renamed from: f */
    private C5594h f19135f;

    C6862b(@C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton, C6861a aVar) {
        this.f19131b = extendedFloatingActionButton;
        this.f19130a = extendedFloatingActionButton.getContext();
        this.f19133d = aVar;
    }

    /* renamed from: a */
    public final void mo27387a(@C0195i0 C5594h hVar) {
        this.f19135f = hVar;
    }

    /* renamed from: b */
    public final void mo27389b(@C0193h0 AnimatorListener animatorListener) {
        this.f19132c.add(animatorListener);
    }

    /* renamed from: c */
    public final C5594h mo27390c() {
        C5594h hVar = this.f19135f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f19134e == null) {
            this.f19134e = C5594h.m24263a(this.f19130a, mo27282d());
        }
        return (C5594h) C0944i.m5337a(this.f19134e);
    }

    @C0195i0
    /* renamed from: f */
    public C5594h mo27391f() {
        return this.f19135f;
    }

    /* renamed from: h */
    public AnimatorSet mo27285h() {
        return mo27388b(mo27390c());
    }

    @C0193h0
    /* renamed from: i */
    public final List<AnimatorListener> mo27392i() {
        return this.f19132c;
    }

    @C0194i
    public void onAnimationStart(Animator animator) {
        this.f19133d.mo27384a(animator);
    }

    /* renamed from: a */
    public final void mo27386a(@C0193h0 AnimatorListener animatorListener) {
        this.f19132c.remove(animatorListener);
    }

    @C0194i
    /* renamed from: b */
    public void mo27287b() {
        this.f19133d.mo27385b();
    }

    @C0194i
    /* renamed from: a */
    public void mo27280a() {
        this.f19133d.mo27385b();
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: b */
    public AnimatorSet mo27388b(@C0193h0 C5594h hVar) {
        ArrayList arrayList = new ArrayList();
        String str = "opacity";
        if (hVar.mo22053c(str)) {
            arrayList.add(hVar.mo22048a(str, this.f19131b, View.ALPHA));
        }
        String str2 = "scale";
        if (hVar.mo22053c(str2)) {
            arrayList.add(hVar.mo22048a(str2, this.f19131b, View.SCALE_Y));
            arrayList.add(hVar.mo22048a(str2, this.f19131b, View.SCALE_X));
        }
        String str3 = C14330v.f42318d0;
        if (hVar.mo22053c(str3)) {
            arrayList.add(hVar.mo22048a(str3, this.f19131b, ExtendedFloatingActionButton.f19067w0));
        }
        String str4 = C14330v.f42320e0;
        if (hVar.mo22053c(str4)) {
            arrayList.add(hVar.mo22048a(str4, this.f19131b, ExtendedFloatingActionButton.f19068x0));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C5588b.m24253a(animatorSet, arrayList);
        return animatorSet;
    }
}
