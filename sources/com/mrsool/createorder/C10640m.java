package com.mrsool.createorder;

import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.model.BitmapDescriptor;

/* renamed from: com.mrsool.createorder.m */
/* compiled from: lambda */
public final /* synthetic */ class C10640m implements OnCameraIdleListener {

    /* renamed from: a */
    private final /* synthetic */ PicOrderLocationActivityRevised f29051a;

    /* renamed from: b */
    private final /* synthetic */ BitmapDescriptor f29052b;

    public /* synthetic */ C10640m(PicOrderLocationActivityRevised picOrderLocationActivityRevised, BitmapDescriptor bitmapDescriptor) {
        this.f29051a = picOrderLocationActivityRevised;
        this.f29052b = bitmapDescriptor;
    }

    public final void onCameraIdle() {
        this.f29051a.mo37986a(this.f29052b);
    }
}
