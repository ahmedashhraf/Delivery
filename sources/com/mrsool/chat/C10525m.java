package com.mrsool.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.SupportMapFragment;

/* renamed from: com.mrsool.chat.m */
/* compiled from: MySupportMapFragment */
public class C10525m extends SupportMapFragment {

    /* renamed from: a */
    public View f28534a;

    /* renamed from: b */
    public C10535p f28535b;

    public View getView() {
        return this.f28534a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f28534a = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28535b = new C10535p(getActivity());
        this.f28535b.addView(this.f28534a);
        return this.f28535b;
    }
}
