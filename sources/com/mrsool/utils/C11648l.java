package com.mrsool.utils;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: com.mrsool.utils.l */
/* compiled from: DividerItemDecoratorIgnoreLast */
public class C11648l extends C1650n {

    /* renamed from: a */
    private Drawable f33481a;

    public C11648l(Drawable drawable) {
        this.f33481a = drawable;
    }

    /* renamed from: a */
    public void mo7392a(Canvas canvas, RecyclerView recyclerView, State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i <= childCount - 2; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((C1656p) childAt.getLayoutParams()).bottomMargin;
            this.f33481a.setBounds(paddingLeft, bottom, width, this.f33481a.getIntrinsicHeight() + bottom);
            this.f33481a.draw(canvas);
        }
    }
}
