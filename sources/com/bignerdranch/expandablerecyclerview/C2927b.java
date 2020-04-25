package com.bignerdranch.expandablerecyclerview;

import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0222u0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;

/* renamed from: com.bignerdranch.expandablerecyclerview.b */
/* compiled from: ChildViewHolder */
public class C2927b<C> extends C1635d0 {

    /* renamed from: s0 */
    C f10375s0;

    /* renamed from: t0 */
    C2928c f10376t0;

    public C2927b(@C0193h0 View view) {
        super(view);
    }

    @C0222u0
    /* renamed from: D */
    public C mo8948D() {
        return this.f10375s0;
    }

    @C0222u0
    /* renamed from: E */
    public int mo11610E() {
        int f = mo7273f();
        C2928c cVar = this.f10376t0;
        if (cVar == null || f == -1) {
            return -1;
        }
        return cVar.mo11636i(f);
    }

    @C0222u0
    /* renamed from: F */
    public int mo11611F() {
        int f = mo7273f();
        C2928c cVar = this.f10376t0;
        if (cVar == null || f == -1) {
            return -1;
        }
        return cVar.mo11638j(f);
    }
}
