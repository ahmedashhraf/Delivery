package com.mrsool.socket;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.mrsool.socket.a */
/* compiled from: LatLngInterpolator */
public interface C11460a {

    /* renamed from: com.mrsool.socket.a$a */
    /* compiled from: LatLngInterpolator */
    public static class C11461a implements C11460a {
        /* renamed from: a */
        public LatLng mo39539a(float f, LatLng latLng, LatLng latLng2) {
            double d = latLng2.latitude;
            double d2 = latLng.latitude;
            double d3 = d - d2;
            double d4 = (double) f;
            Double.isNaN(d4);
            double d5 = (d3 * d4) + d2;
            double d6 = latLng2.longitude;
            double d7 = latLng.longitude;
            double d8 = d6 - d7;
            Double.isNaN(d4);
            return new LatLng(d5, (d8 * d4) + d7);
        }
    }

    /* renamed from: com.mrsool.socket.a$b */
    /* compiled from: LatLngInterpolator */
    public static class C11462b implements C11460a {
        /* renamed from: a */
        public LatLng mo39539a(float f, LatLng latLng, LatLng latLng2) {
            double d = latLng2.latitude;
            double d2 = latLng.latitude;
            double d3 = d - d2;
            double d4 = (double) f;
            Double.isNaN(d4);
            double d5 = (d3 * d4) + d2;
            double d6 = latLng2.longitude - latLng.longitude;
            if (Math.abs(d6) > 180.0d) {
                d6 -= Math.signum(d6) * 360.0d;
            }
            Double.isNaN(d4);
            return new LatLng(d5, (d6 * d4) + latLng.longitude);
        }
    }

    /* renamed from: com.mrsool.socket.a$c */
    /* compiled from: LatLngInterpolator */
    public static class C11463c implements C11460a {
        /* renamed from: a */
        public LatLng mo39539a(float f, LatLng latLng, LatLng latLng2) {
            float f2 = f;
            LatLng latLng3 = latLng;
            LatLng latLng4 = latLng2;
            double radians = Math.toRadians(latLng3.latitude);
            double radians2 = Math.toRadians(latLng3.longitude);
            double radians3 = Math.toRadians(latLng4.latitude);
            double radians4 = Math.toRadians(latLng4.longitude);
            double cos = Math.cos(radians);
            double cos2 = Math.cos(radians3);
            double a = m51767a(radians, radians2, radians3, radians4);
            double sin = Math.sin(a);
            if (sin < 1.0E-6d) {
                return latLng3;
            }
            double d = (double) (1.0f - f2);
            Double.isNaN(d);
            double sin2 = Math.sin(d * a) / sin;
            double d2 = (double) f2;
            Double.isNaN(d2);
            double sin3 = Math.sin(d2 * a) / sin;
            double d3 = cos * sin2;
            double d4 = cos2 * sin3;
            double cos3 = (Math.cos(radians2) * d3) + (Math.cos(radians4) * d4);
            double sin4 = (d3 * Math.sin(radians2)) + (d4 * Math.sin(radians4));
            return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (sin3 * Math.sin(radians3)), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
        }

        /* renamed from: a */
        private double m51767a(double d, double d2, double d3, double d4) {
            return Math.asin(Math.sqrt(Math.pow(Math.sin((d - d3) / 2.0d), 2.0d) + (Math.cos(d) * Math.cos(d3) * Math.pow(Math.sin((d2 - d4) / 2.0d), 2.0d)))) * 2.0d;
        }
    }

    /* renamed from: a */
    LatLng mo39539a(float f, LatLng latLng, LatLng latLng2);
}
