package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1644l;
import androidx.recyclerview.widget.RecyclerView.C1644l.C1648d;

/* renamed from: androidx.recyclerview.widget.a0 */
/* compiled from: SimpleItemAnimator */
public abstract class C1677a0 extends C1644l {

    /* renamed from: m */
    private static final boolean f6449m = false;

    /* renamed from: n */
    private static final String f6450n = "SimpleItemAnimator";

    /* renamed from: l */
    boolean f6451l = true;

    /* renamed from: a */
    public void mo7697a(boolean z) {
        this.f6451l = z;
    }

    /* renamed from: a */
    public abstract boolean mo7698a(C1635d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo7699a(C1635d0 d0Var, C1635d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public boolean mo7372b(@C0193h0 C1635d0 d0Var, @C0193h0 C1648d dVar, @C0195i0 C1648d dVar2) {
        int i = dVar.f6318a;
        int i2 = dVar.f6319b;
        View view = d0Var.f6294a;
        int left = dVar2 == null ? view.getLeft() : dVar2.f6318a;
        int top = dVar2 == null ? view.getTop() : dVar2.f6319b;
        if (d0Var.mo7285r() || (i == left && i2 == top)) {
            return mo7704i(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo7698a(d0Var, i, i2, left, top);
    }

    /* renamed from: c */
    public void mo7701c(C1635d0 d0Var, boolean z) {
    }

    /* renamed from: c */
    public boolean mo7376c(@C0193h0 C1635d0 d0Var, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2) {
        if (dVar.f6318a == dVar2.f6318a && dVar.f6319b == dVar2.f6319b) {
            mo7708l(d0Var);
            return false;
        }
        return mo7698a(d0Var, dVar.f6318a, dVar.f6319b, dVar2.f6318a, dVar2.f6319b);
    }

    /* renamed from: d */
    public void mo7702d(C1635d0 d0Var, boolean z) {
    }

    /* renamed from: h */
    public abstract boolean mo7703h(C1635d0 d0Var);

    /* renamed from: i */
    public abstract boolean mo7704i(C1635d0 d0Var);

    /* renamed from: j */
    public boolean mo7706j() {
        return this.f6451l;
    }

    /* renamed from: k */
    public final void mo7707k(C1635d0 d0Var) {
        mo7713q(d0Var);
    }

    /* renamed from: l */
    public final void mo7708l(C1635d0 d0Var) {
        mo7714r(d0Var);
        mo7371b(d0Var);
    }

    /* renamed from: m */
    public final void mo7709m(C1635d0 d0Var) {
        mo7715s(d0Var);
    }

    /* renamed from: n */
    public final void mo7710n(C1635d0 d0Var) {
        mo7716t(d0Var);
        mo7371b(d0Var);
    }

    /* renamed from: o */
    public final void mo7711o(C1635d0 d0Var) {
        mo7717u(d0Var);
    }

    /* renamed from: p */
    public void mo7712p(C1635d0 d0Var) {
    }

    /* renamed from: q */
    public void mo7713q(C1635d0 d0Var) {
    }

    /* renamed from: r */
    public void mo7714r(C1635d0 d0Var) {
    }

    /* renamed from: s */
    public void mo7715s(C1635d0 d0Var) {
    }

    /* renamed from: t */
    public void mo7716t(C1635d0 d0Var) {
    }

    /* renamed from: u */
    public void mo7717u(C1635d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo7364a(@C0193h0 C1635d0 d0Var) {
        return !this.f6451l || d0Var.mo7283p();
    }

    /* renamed from: j */
    public final void mo7705j(C1635d0 d0Var) {
        mo7712p(d0Var);
        mo7371b(d0Var);
    }

    /* renamed from: a */
    public boolean mo7366a(@C0193h0 C1635d0 d0Var, @C0195i0 C1648d dVar, @C0193h0 C1648d dVar2) {
        if (dVar == null || (dVar.f6318a == dVar2.f6318a && dVar.f6319b == dVar2.f6319b)) {
            return mo7703h(d0Var);
        }
        return mo7698a(d0Var, dVar.f6318a, dVar.f6319b, dVar2.f6318a, dVar2.f6319b);
    }

    /* renamed from: a */
    public boolean mo7365a(@C0193h0 C1635d0 d0Var, @C0193h0 C1635d0 d0Var2, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2) {
        int i;
        int i2;
        int i3 = dVar.f6318a;
        int i4 = dVar.f6319b;
        if (d0Var2.mo7294z()) {
            int i5 = dVar.f6318a;
            i = dVar.f6319b;
            i2 = i5;
        } else {
            i2 = dVar2.f6318a;
            i = dVar2.f6319b;
        }
        return mo7699a(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: b */
    public final void mo7700b(C1635d0 d0Var, boolean z) {
        mo7702d(d0Var, z);
    }

    /* renamed from: a */
    public final void mo7696a(C1635d0 d0Var, boolean z) {
        mo7701c(d0Var, z);
        mo7371b(d0Var);
    }
}
