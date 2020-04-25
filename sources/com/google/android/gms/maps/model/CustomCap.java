package com.google.android.gms.maps.model;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;

public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(@C0193h0 BitmapDescriptor bitmapDescriptor2) {
        this(bitmapDescriptor2, 10.0f);
    }

    public CustomCap(@C0193h0 BitmapDescriptor bitmapDescriptor2, float f) {
        BitmapDescriptor bitmapDescriptor3 = (BitmapDescriptor) C4300a0.m18621a(bitmapDescriptor2, (Object) "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            super(bitmapDescriptor3, f);
            this.bitmapDescriptor = bitmapDescriptor2;
            this.refWidth = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.bitmapDescriptor);
        float f = this.refWidth;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
