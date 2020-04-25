package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: com.google.android.material.internal.r */
/* compiled from: ViewGroupOverlayApi18 */
class C6930r implements C6931s {

    /* renamed from: a */
    private final ViewGroupOverlay f19397a;

    C6930r(@C0193h0 ViewGroup viewGroup) {
        this.f19397a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo27659a(@C0193h0 Drawable drawable) {
        this.f19397a.add(drawable);
    }

    /* renamed from: b */
    public void mo27660b(@C0193h0 Drawable drawable) {
        this.f19397a.remove(drawable);
    }

    /* renamed from: a */
    public void mo27657a(@C0193h0 View view) {
        this.f19397a.add(view);
    }

    /* renamed from: b */
    public void mo27658b(@C0193h0 View view) {
        this.f19397a.remove(view);
    }
}
