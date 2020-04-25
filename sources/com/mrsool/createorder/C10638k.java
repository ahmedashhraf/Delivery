package com.mrsool.createorder;

import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.model.BitmapDescriptor;

/* renamed from: com.mrsool.createorder.k */
/* compiled from: lambda */
public final /* synthetic */ class C10638k implements OnCameraIdleListener {

    /* renamed from: a */
    private final /* synthetic */ C10589d f29047a;

    /* renamed from: b */
    private final /* synthetic */ BitmapDescriptor f29048b;

    public /* synthetic */ C10638k(C10589d dVar, BitmapDescriptor bitmapDescriptor) {
        this.f29047a = dVar;
        this.f29048b = bitmapDescriptor;
    }

    public final void onCameraIdle() {
        this.f29047a.mo37995a(this.f29048b);
    }
}
