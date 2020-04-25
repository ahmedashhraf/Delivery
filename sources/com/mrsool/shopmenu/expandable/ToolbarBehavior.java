package com.mrsool.shopmenu.expandable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;

public class ToolbarBehavior extends Behavior {

    /* renamed from: v */
    private boolean f31667v = true;

    /* renamed from: w */
    private int f31668w;

    public ToolbarBehavior() {
    }

    /* renamed from: e */
    private void m51190e(View view) {
        int i;
        boolean z = true;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            C1638g adapter = recyclerView.getAdapter();
            if (adapter != null && adapter.mo7325b() != this.f31668w) {
                this.f31667v = false;
                this.f31668w = adapter.mo7325b();
                C1651o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    if (layoutManager instanceof LinearLayoutManager) {
                        i = Math.abs(((LinearLayoutManager) layoutManager).mo6960O());
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int[] c = staggeredGridLayoutManager.mo7604c(new int[staggeredGridLayoutManager.mo7594T()]);
                        i = Math.abs(c[c.length - 1]);
                    } else {
                        i = 0;
                    }
                    if (i >= this.f31668w - 1) {
                        z = false;
                    }
                    this.f31667v = z;
                    return;
                }
                return;
            }
            return;
        }
        this.f31667v = true;
    }

    public ToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo3998a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        return this.f31667v && super.mo3998a(coordinatorLayout, appBarLayout, motionEvent);
    }

    /* renamed from: a */
    public boolean mo4006b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        m51190e(view);
        return this.f31667v && super.mo22125a(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    /* renamed from: a */
    public boolean mo4001a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        return this.f31667v && super.mo4001a(coordinatorLayout, appBarLayout, view, f, f2, z);
    }
}
