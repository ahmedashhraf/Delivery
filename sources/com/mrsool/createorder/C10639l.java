package com.mrsool.createorder;

import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.model.BitmapDescriptor;

/* renamed from: com.mrsool.createorder.l */
/* compiled from: lambda */
public final /* synthetic */ class C10639l implements OnCameraIdleListener {

    /* renamed from: a */
    private final /* synthetic */ PicOrderLocationActivityRevised f29049a;

    /* renamed from: b */
    private final /* synthetic */ BitmapDescriptor f29050b;

    public /* synthetic */ C10639l(PicOrderLocationActivityRevised picOrderLocationActivityRevised, BitmapDescriptor bitmapDescriptor) {
        this.f29049a = picOrderLocationActivityRevised;
        this.f29050b = bitmapDescriptor;
    }

    public final void onCameraIdle() {
        this.f29049a.mo37987b(this.f29050b);
    }
}
