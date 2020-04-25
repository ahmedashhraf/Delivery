package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.C0203m0;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C5359p4;
import com.google.android.gms.measurement.internal.C5371q5;
import com.google.android.gms.measurement.internal.C5404t5;

@C4312d0
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public class Analytics {
    @C4056a
    @C4312d0

    /* renamed from: b */
    public static final String f15728b = "crash";
    @C4056a
    @C4312d0

    /* renamed from: c */
    public static final String f15729c = "fcm";
    @C4056a
    @C4312d0

    /* renamed from: d */
    public static final String f15730d = "fiam";

    /* renamed from: e */
    private static volatile Analytics f15731e;

    /* renamed from: a */
    private final C5359p4 f15732a;

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.module.Analytics$a */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static final class C5473a extends C5371q5 {
        @C4056a
        @C4312d0

        /* renamed from: c */
        public static final String f15733c = "_ae";
        @C4056a
        @C4312d0

        /* renamed from: d */
        public static final String f15734d = "_ar";

        private C5473a() {
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.module.Analytics$b */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static final class C5474b extends C5404t5 {
        @C4056a
        @C4312d0

        /* renamed from: c */
        public static final String f15735c = "fatal";
        @C4056a
        @C4312d0

        /* renamed from: d */
        public static final String f15736d = "timestamp";
        @C4056a
        @C4312d0

        /* renamed from: e */
        public static final String f15737e = "type";

        private C5474b() {
        }
    }

    private Analytics(C5359p4 p4Var) {
        C4300a0.m18620a(p4Var);
        this.f15732a = p4Var;
    }

    @C4312d0
    @Keep
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static Analytics getInstance(Context context) {
        if (f15731e == null) {
            synchronized (Analytics.class) {
                if (f15731e == null) {
                    f15731e = new Analytics(C5359p4.m23334a(context, (zzv) null));
                }
            }
        }
        return f15731e;
    }
}
