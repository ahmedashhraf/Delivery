package androidx.core.p034l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.l.w */
/* compiled from: NestedScrollingParentHelper */
public class C1053w {

    /* renamed from: a */
    private int f4695a;

    /* renamed from: b */
    private int f4696b;

    public C1053w(@C0193h0 ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo5192a(@C0193h0 View view, @C0193h0 View view2, int i) {
        mo5193a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo5193a(@C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        if (i2 == 1) {
            this.f4696b = i;
        } else {
            this.f4695a = i;
        }
    }

    /* renamed from: a */
    public int mo5189a() {
        return this.f4695a | this.f4696b;
    }

    /* renamed from: a */
    public void mo5190a(@C0193h0 View view) {
        mo5191a(view, 0);
    }

    /* renamed from: a */
    public void mo5191a(@C0193h0 View view, int i) {
        if (i == 1) {
            this.f4696b = 0;
        } else {
            this.f4695a = 0;
        }
    }
}
