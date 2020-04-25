package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.l */
/* compiled from: StateListAnimator */
public final class C6918l {

    /* renamed from: a */
    private final ArrayList<C6920b> f19361a = new ArrayList<>();
    @C0195i0

    /* renamed from: b */
    private C6920b f19362b = null;
    @C0195i0

    /* renamed from: c */
    ValueAnimator f19363c = null;

    /* renamed from: d */
    private final AnimatorListener f19364d = new C6919a();

    /* renamed from: com.google.android.material.internal.l$a */
    /* compiled from: StateListAnimator */
    class C6919a extends AnimatorListenerAdapter {
        C6919a() {
        }

        public void onAnimationEnd(Animator animator) {
            C6918l lVar = C6918l.this;
            if (lVar.f19363c == animator) {
                lVar.f19363c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.l$b */
    /* compiled from: StateListAnimator */
    static class C6920b {

        /* renamed from: a */
        final int[] f19366a;

        /* renamed from: b */
        final ValueAnimator f19367b;

        C6920b(int[] iArr, ValueAnimator valueAnimator) {
            this.f19366a = iArr;
            this.f19367b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m33226b() {
        ValueAnimator valueAnimator = this.f19363c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19363c = null;
        }
    }

    /* renamed from: a */
    public void mo27638a(int[] iArr, ValueAnimator valueAnimator) {
        C6920b bVar = new C6920b(iArr, valueAnimator);
        valueAnimator.addListener(this.f19364d);
        this.f19361a.add(bVar);
    }

    /* renamed from: a */
    public void mo27637a(int[] iArr) {
        C6920b bVar;
        int size = this.f19361a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = (C6920b) this.f19361a.get(i);
            if (StateSet.stateSetMatches(bVar.f19366a, iArr)) {
                break;
            }
            i++;
        }
        C6920b bVar2 = this.f19362b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m33226b();
            }
            this.f19362b = bVar;
            if (bVar != null) {
                m33225a(bVar);
            }
        }
    }

    /* renamed from: a */
    private void m33225a(@C0193h0 C6920b bVar) {
        this.f19363c = bVar.f19367b;
        this.f19363c.start();
    }

    /* renamed from: a */
    public void mo27636a() {
        ValueAnimator valueAnimator = this.f19363c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f19363c = null;
        }
    }
}
