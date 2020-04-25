package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: com.google.android.material.internal.u */
/* compiled from: ViewOverlayApi18 */
class C6934u implements C6935v {

    /* renamed from: a */
    private final ViewOverlay f19405a;

    C6934u(@C0193h0 View view) {
        this.f19405a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo27659a(@C0193h0 Drawable drawable) {
        this.f19405a.add(drawable);
    }

    /* renamed from: b */
    public void mo27660b(@C0193h0 Drawable drawable) {
        this.f19405a.remove(drawable);
    }
}
