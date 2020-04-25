package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.p */
public final class C5149p {

    /* renamed from: a */
    public static final int f14789a = 0;

    /* renamed from: b */
    public static final int f14790b = 1;

    /* renamed from: c */
    public static final int f14791c = 1000;

    /* renamed from: d */
    public static final int f14792d = 1001;

    /* renamed from: e */
    public static final int f14793e = 1002;

    private C5149p() {
    }

    /* renamed from: a */
    public static int m22420a(int i) {
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            return 1;
        }
        return i;
    }

    /* renamed from: b */
    public static Status m22421b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
