package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.futuremind.recyclerviewfastscroll.b */
/* compiled from: RecyclerViewScrollListener */
public class C3879b extends C1660t {

    /* renamed from: a */
    private final FastScroller f12291a;

    /* renamed from: b */
    List<C3880a> f12292b = new ArrayList();

    /* renamed from: c */
    int f12293c = 0;

    /* renamed from: com.futuremind.recyclerviewfastscroll.b$a */
    /* compiled from: RecyclerViewScrollListener */
    public interface C3880a {
        /* renamed from: a */
        void mo17157a(float f);
    }

    public C3879b(FastScroller fastScroller) {
        this.f12291a = fastScroller;
    }

    /* renamed from: a */
    public void mo17156a(C3880a aVar) {
        this.f12292b.add(aVar);
    }

    /* renamed from: a */
    public void mo7531a(RecyclerView recyclerView, int i) {
        super.mo7531a(recyclerView, i);
        if (i == 0 && this.f12293c != 0) {
            this.f12291a.getViewProvider().mo17176h();
        } else if (i != 0 && this.f12293c == 0) {
            this.f12291a.getViewProvider().mo17177i();
        }
        this.f12293c = i;
    }

    /* renamed from: a */
    public void mo7532a(RecyclerView recyclerView, int i, int i2) {
        if (this.f12291a.mo17140b()) {
            mo17155a(recyclerView);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17155a(RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        if (this.f12291a.mo17139a()) {
            i3 = recyclerView.computeVerticalScrollOffset();
            i2 = recyclerView.computeVerticalScrollExtent();
            i = recyclerView.computeVerticalScrollRange();
        } else {
            i3 = recyclerView.computeHorizontalScrollOffset();
            i2 = recyclerView.computeHorizontalScrollExtent();
            i = recyclerView.computeHorizontalScrollRange();
        }
        float f = ((float) i3) / ((float) (i - i2));
        this.f12291a.setScrollerPosition(f);
        mo17154a(f);
    }

    /* renamed from: a */
    public void mo17154a(float f) {
        for (C3880a a : this.f12292b) {
            a.mo17157a(f);
        }
    }
}
