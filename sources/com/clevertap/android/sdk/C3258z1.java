package com.clevertap.android.sdk;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: com.clevertap.android.sdk.z1 */
/* compiled from: VerticalSpaceItemDecoration */
public class C3258z1 extends C1650n {

    /* renamed from: a */
    private final int f11754a;

    C3258z1(int i) {
        this.f11754a = i;
    }

    /* renamed from: a */
    public void mo7394a(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.bottom = this.f11754a;
    }
}
