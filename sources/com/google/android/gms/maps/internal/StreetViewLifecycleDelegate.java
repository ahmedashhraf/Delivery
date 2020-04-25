package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.C4522e;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;

public interface StreetViewLifecycleDelegate extends C4522e {
    void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback);
}
