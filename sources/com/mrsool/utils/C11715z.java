package com.mrsool.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: com.mrsool.utils.z */
/* compiled from: VerticalSpaceItemDecoration */
public class C11715z extends C1650n {

    /* renamed from: a */
    private final int f33904a;

    public C11715z(int i) {
        this.f33904a = i;
    }

    /* renamed from: a */
    public void mo7394a(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.bottom = this.f33904a;
    }
}
