package com.google.android.material.p187p;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ScrollView;
import androidx.annotation.C0193h0;

/* renamed from: com.google.android.material.p.h */
/* compiled from: InterpolateOnScrollPositionChangeHelper */
public class C6975h {

    /* renamed from: a */
    private View f19533a;

    /* renamed from: b */
    private C6978j f19534b;

    /* renamed from: c */
    private ScrollView f19535c;

    /* renamed from: d */
    private final int[] f19536d = new int[2];

    /* renamed from: e */
    private final int[] f19537e = new int[2];

    /* renamed from: f */
    private final OnScrollChangedListener f19538f = new C6976a();

    /* renamed from: com.google.android.material.p.h$a */
    /* compiled from: InterpolateOnScrollPositionChangeHelper */
    class C6976a implements OnScrollChangedListener {
        C6976a() {
        }

        public void onScrollChanged() {
            C6975h.this.mo27773a();
        }
    }

    public C6975h(View view, C6978j jVar, ScrollView scrollView) {
        this.f19533a = view;
        this.f19534b = jVar;
        this.f19535c = scrollView;
    }

    /* renamed from: a */
    public void mo27776a(C6978j jVar) {
        this.f19534b = jVar;
    }

    /* renamed from: b */
    public void mo27777b(@C0193h0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f19538f);
    }

    /* renamed from: a */
    public void mo27775a(ScrollView scrollView) {
        this.f19535c = scrollView;
    }

    /* renamed from: a */
    public void mo27774a(@C0193h0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f19538f);
    }

    /* renamed from: a */
    public void mo27773a() {
        ScrollView scrollView = this.f19535c;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.f19535c.getLocationInWindow(this.f19536d);
                this.f19535c.getChildAt(0).getLocationInWindow(this.f19537e);
                int top = (this.f19533a.getTop() - this.f19536d[1]) + this.f19537e[1];
                int height = this.f19533a.getHeight();
                int height2 = this.f19535c.getHeight();
                if (top < 0) {
                    this.f19534b.mo27804c(Math.max(0.0f, Math.min(1.0f, (((float) top) / ((float) height)) + 1.0f)));
                    this.f19533a.invalidate();
                } else {
                    int i = top + height;
                    if (i > height2) {
                        this.f19534b.mo27804c(Math.max(0.0f, Math.min(1.0f, 1.0f - (((float) (i - height2)) / ((float) height)))));
                        this.f19533a.invalidate();
                    } else if (this.f19534b.mo27818g() != 1.0f) {
                        this.f19534b.mo27804c(1.0f);
                        this.f19533a.invalidate();
                    }
                }
                return;
            }
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
    }
}
