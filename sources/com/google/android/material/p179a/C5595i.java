package com.google.android.material.p179a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: com.google.android.material.a.i */
/* compiled from: MotionTiming */
public class C5595i {

    /* renamed from: a */
    private long f15945a = 0;

    /* renamed from: b */
    private long f15946b = 300;
    @C0195i0

    /* renamed from: c */
    private TimeInterpolator f15947c = null;

    /* renamed from: d */
    private int f15948d = 0;

    /* renamed from: e */
    private int f15949e = 1;

    public C5595i(long j, long j2) {
        this.f15945a = j;
        this.f15946b = j2;
    }

    /* renamed from: a */
    public void mo22059a(@C0193h0 Animator animator) {
        animator.setStartDelay(mo22058a());
        animator.setDuration(mo22060b());
        animator.setInterpolator(mo22061c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo22062d());
            valueAnimator.setRepeatMode(mo22063e());
        }
    }

    /* renamed from: b */
    public long mo22060b() {
        return this.f15946b;
    }

    @C0195i0
    /* renamed from: c */
    public TimeInterpolator mo22061c() {
        TimeInterpolator timeInterpolator = this.f15947c;
        return timeInterpolator != null ? timeInterpolator : C5587a.f15930b;
    }

    /* renamed from: d */
    public int mo22062d() {
        return this.f15948d;
    }

    /* renamed from: e */
    public int mo22063e() {
        return this.f15949e;
    }

    public boolean equals(@C0195i0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5595i)) {
            return false;
        }
        C5595i iVar = (C5595i) obj;
        if (mo22058a() == iVar.mo22058a() && mo22060b() == iVar.mo22060b() && mo22062d() == iVar.mo22062d() && mo22063e() == iVar.mo22063e()) {
            return mo22061c().getClass().equals(iVar.mo22061c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo22058a() ^ (mo22058a() >>> 32))) * 31) + ((int) (mo22060b() ^ (mo22060b() >>> 32)))) * 31) + mo22061c().getClass().hashCode()) * 31) + mo22062d()) * 31) + mo22063e();
    }

    @C0193h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C5595i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(mo22058a());
        sb.append(" duration: ");
        sb.append(mo22060b());
        sb.append(" interpolator: ");
        sb.append(mo22061c().getClass());
        sb.append(" repeatCount: ");
        sb.append(mo22062d());
        sb.append(" repeatMode: ");
        sb.append(mo22063e());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: b */
    private static TimeInterpolator m24277b(@C0193h0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C5587a.f15930b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C5587a.f15931c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C5587a.f15932d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public long mo22058a() {
        return this.f15945a;
    }

    @C0193h0
    /* renamed from: a */
    static C5595i m24276a(@C0193h0 ValueAnimator valueAnimator) {
        C5595i iVar = new C5595i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m24277b(valueAnimator));
        iVar.f15948d = valueAnimator.getRepeatCount();
        iVar.f15949e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public C5595i(long j, long j2, @C0193h0 TimeInterpolator timeInterpolator) {
        this.f15945a = j;
        this.f15946b = j2;
        this.f15947c = timeInterpolator;
    }
}
