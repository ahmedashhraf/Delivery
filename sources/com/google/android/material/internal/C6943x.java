package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@SuppressLint({"AppCompatCustomView"})
@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.x */
/* compiled from: VisibilityAwareImageButton */
public class C6943x extends ImageButton {

    /* renamed from: a */
    private int f19417a;

    public C6943x(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo27676a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f19417a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f19417a;
    }

    public void setVisibility(int i) {
        mo27676a(i, true);
    }

    public C6943x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6943x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19417a = getVisibility();
    }
}
