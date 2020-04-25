package com.github.aakira.expandablelayout;

import android.animation.TimeInterpolator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: com.github.aakira.expandablelayout.b */
/* compiled from: ExpandableLayout */
public interface C3900b {

    /* renamed from: e */
    public static final int f12342e = 300;

    /* renamed from: f */
    public static final boolean f12343f = false;

    /* renamed from: g */
    public static final int f12344g = 0;

    /* renamed from: h */
    public static final int f12345h = 1;

    /* renamed from: a */
    void mo17191a(long j, @C0195i0 TimeInterpolator timeInterpolator);

    /* renamed from: a */
    boolean mo17192a();

    /* renamed from: b */
    void mo17193b();

    /* renamed from: b */
    void mo17196b(long j, @C0195i0 TimeInterpolator timeInterpolator);

    /* renamed from: c */
    void mo17197c();

    /* renamed from: c */
    void mo17199c(long j, @C0195i0 TimeInterpolator timeInterpolator);

    void setDuration(int i);

    void setExpanded(boolean z);

    void setInterpolator(@C0193h0 TimeInterpolator timeInterpolator);

    void setListener(@C0193h0 C3901c cVar);

    void toggle();
}
