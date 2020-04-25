package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.location.zzbh;

@C4476d0
/* renamed from: com.google.android.gms.location.f */
public interface C5127f {

    /* renamed from: k */
    public static final int f14762k = 1;

    /* renamed from: l */
    public static final int f14763l = 2;

    /* renamed from: m */
    public static final int f14764m = 4;

    /* renamed from: n */
    public static final long f14765n = -1;

    @C4476d0
    /* renamed from: com.google.android.gms.location.f$a */
    public static final class C5128a {

        /* renamed from: a */
        private String f14766a = null;

        /* renamed from: b */
        private int f14767b = 0;

        /* renamed from: c */
        private long f14768c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f14769d = -1;

        /* renamed from: e */
        private double f14770e;

        /* renamed from: f */
        private double f14771f;

        /* renamed from: g */
        private float f14772g;

        /* renamed from: h */
        private int f14773h = 0;

        /* renamed from: i */
        private int f14774i = -1;

        /* renamed from: a */
        public final C5128a mo20087a(double d, double d2, float f) {
            this.f14769d = 1;
            this.f14770e = d;
            this.f14771f = d2;
            this.f14772g = f;
            return this;
        }

        /* renamed from: a */
        public final C5128a mo20088a(int i) {
            this.f14774i = i;
            return this;
        }

        /* renamed from: a */
        public final C5128a mo20089a(long j) {
            if (j < 0) {
                this.f14768c = -1;
            } else {
                this.f14768c = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        /* renamed from: a */
        public final C5128a mo20090a(String str) {
            this.f14766a = str;
            return this;
        }

        /* renamed from: a */
        public final C5127f mo20091a() {
            if (this.f14766a != null) {
                int i = this.f14767b;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) == 0 || this.f14774i >= 0) {
                    long j = this.f14768c;
                    if (j == Long.MIN_VALUE) {
                        throw new IllegalArgumentException("Expiration not set.");
                    } else if (this.f14769d != -1) {
                        int i2 = this.f14773h;
                        if (i2 >= 0) {
                            zzbh zzbh = new zzbh(this.f14766a, this.f14767b, 1, this.f14770e, this.f14771f, this.f14772g, j, i2, this.f14774i);
                            return zzbh;
                        }
                        throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                    } else {
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                } else {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        /* renamed from: b */
        public final C5128a mo20092b(int i) {
            this.f14773h = i;
            return this;
        }

        /* renamed from: c */
        public final C5128a mo20093c(int i) {
            this.f14767b = i;
            return this;
        }
    }

    /* renamed from: M */
    String mo18810M();
}
