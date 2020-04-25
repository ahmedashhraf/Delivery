package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.dynamic.m */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4530m implements C4514a {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f13795a;

    /* renamed from: b */
    private final /* synthetic */ LayoutInflater f13796b;

    /* renamed from: c */
    private final /* synthetic */ ViewGroup f13797c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f13798d;

    /* renamed from: e */
    private final /* synthetic */ C4513a f13799e;

    C4530m(C4513a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13799e = aVar;
        this.f13795a = frameLayout;
        this.f13796b = layoutInflater;
        this.f13797c = viewGroup;
        this.f13798d = bundle;
    }

    /* renamed from: a */
    public final void mo18594a(C4522e eVar) {
        this.f13795a.removeAllViews();
        this.f13795a.addView(this.f13799e.zaru.onCreateView(this.f13796b, this.f13797c, this.f13798d));
    }

    public final int getState() {
        return 2;
    }
}
