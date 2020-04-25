package com.bignerdranch.expandablerecyclerview;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0222u0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import com.bignerdranch.expandablerecyclerview.p152e.C2934b;

/* renamed from: com.bignerdranch.expandablerecyclerview.d */
/* compiled from: ParentViewHolder */
public class C2931d<P extends C2934b<C>, C> extends C1635d0 implements OnClickListener {
    @C0195i0

    /* renamed from: s0 */
    private C2932a f10389s0;

    /* renamed from: t0 */
    private boolean f10390t0 = false;

    /* renamed from: u0 */
    P f10391u0;

    /* renamed from: v0 */
    C2928c f10392v0;

    /* renamed from: com.bignerdranch.expandablerecyclerview.d$a */
    /* compiled from: ParentViewHolder */
    interface C2932a {
        @C0222u0
        /* renamed from: a */
        void mo11651a(int i);

        @C0222u0
        /* renamed from: b */
        void mo11652b(int i);
    }

    @C0222u0
    public C2931d(@C0193h0 View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @C0222u0
    /* renamed from: D */
    public void mo8948D() {
        mo11663c(false);
        mo11662b(true);
        C2932a aVar = this.f10389s0;
        if (aVar != null) {
            aVar.mo11651a(mo7273f());
        }
    }

    /* access modifiers changed from: protected */
    @C0222u0
    /* renamed from: E */
    public void mo11655E() {
        mo11663c(true);
        mo11662b(false);
        C2932a aVar = this.f10389s0;
        if (aVar != null) {
            aVar.mo11652b(mo7273f());
        }
    }

    @C0222u0
    /* renamed from: F */
    public P mo11656F() {
        return this.f10391u0;
    }

    @C0222u0
    /* renamed from: G */
    public int mo11657G() {
        int f = mo7273f();
        if (f == -1) {
            return f;
        }
        return this.f10392v0.mo11638j(f);
    }

    @C0222u0
    /* renamed from: H */
    public boolean mo11658H() {
        return this.f10390t0;
    }

    @C0222u0
    /* renamed from: I */
    public void mo11659I() {
        this.f6294a.setOnClickListener(this);
    }

    @C0222u0
    /* renamed from: J */
    public boolean mo11660J() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: a */
    public void mo11661a(C2932a aVar) {
        this.f10389s0 = aVar;
    }

    @C0222u0
    /* renamed from: b */
    public void mo11662b(boolean z) {
    }

    @C0222u0
    /* renamed from: c */
    public void mo11663c(boolean z) {
        this.f10390t0 = z;
    }

    @C0222u0
    public void onClick(View view) {
        if (this.f10390t0) {
            mo8948D();
        } else {
            mo11655E();
        }
    }
}
