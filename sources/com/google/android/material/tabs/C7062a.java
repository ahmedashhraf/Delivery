package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0549t0;
import com.google.android.material.C5582R;

/* renamed from: com.google.android.material.tabs.a */
/* compiled from: TabItem */
public class C7062a extends View {

    /* renamed from: N */
    public final int f19960N;

    /* renamed from: a */
    public final CharSequence f19961a;

    /* renamed from: b */
    public final Drawable f19962b;

    public C7062a(Context context) {
        this(context, null);
    }

    public C7062a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0549t0 a = C0549t0.m2909a(context, attributeSet, C5582R.styleable.TabItem);
        this.f19961a = a.mo2889g(C5582R.styleable.TabItem_android_text);
        this.f19962b = a.mo2875b(C5582R.styleable.TabItem_android_icon);
        this.f19960N = a.mo2888g(C5582R.styleable.TabItem_android_layout, 0);
        a.mo2887f();
    }
}
