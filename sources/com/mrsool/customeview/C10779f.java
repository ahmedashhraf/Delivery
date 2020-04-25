package com.mrsool.customeview;

import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C1103b;
import androidx.recyclerview.widget.RecyclerView.C1651o;

/* renamed from: com.mrsool.customeview.f */
/* compiled from: EndlessParentScrollListener */
public abstract class C10779f implements C1103b {

    /* renamed from: a */
    private int f29622a = 0;

    /* renamed from: b */
    private int f29623b = 0;

    /* renamed from: c */
    private boolean f29624c = true;

    /* renamed from: d */
    private int f29625d = 0;

    /* renamed from: e */
    private int f29626e = 300;

    /* renamed from: f */
    C1651o f29627f;

    public C10779f(C1651o oVar) {
        this.f29627f = oVar;
    }

    /* renamed from: a */
    public abstract void mo38393a(int i, int i2);

    /* renamed from: a */
    public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        int bottom = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom() - (nestedScrollView.getHeight() + nestedScrollView.getScrollY());
        int j = this.f29627f.mo7483j();
        if (j < this.f29623b) {
            this.f29622a = this.f29625d;
            this.f29623b = j;
            if (j == 0) {
                this.f29624c = true;
            }
        }
        if (this.f29624c && j > this.f29623b) {
            this.f29624c = false;
            this.f29623b = j;
        }
        if (!this.f29624c && bottom <= this.f29626e) {
            this.f29622a++;
            mo38393a(this.f29622a, j);
            this.f29624c = true;
        }
    }
}
