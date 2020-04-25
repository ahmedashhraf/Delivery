package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4758f6 implements C4913p5 {

    /* renamed from: a */
    private final C4945r5 f14100a;

    /* renamed from: b */
    private final String f14101b;

    /* renamed from: c */
    private final Object[] f14102c;

    /* renamed from: d */
    private final int f14103d;

    C4758f6(C4945r5 r5Var, String str, Object[] objArr) {
        this.f14100a = r5Var;
        this.f14101b = str;
        this.f14102c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14103d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f14103d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo18988a() {
        return (this.f14103d & 1) == 1 ? C4805d.f14195i : C4805d.f14196j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo18989b() {
        return this.f14101b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object[] mo18990c() {
        return this.f14102c;
    }

    /* renamed from: i */
    public final boolean mo18991i() {
        return (this.f14103d & 2) == 2;
    }

    /* renamed from: l */
    public final C4945r5 mo18992l() {
        return this.f14100a;
    }
}
