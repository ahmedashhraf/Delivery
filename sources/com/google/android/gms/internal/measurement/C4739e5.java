package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4739e5 implements C4835k6 {

    /* renamed from: b */
    private static final C4900o5 f14054b = new C4789h5();

    /* renamed from: a */
    private final C4900o5 f14055a;

    public C4739e5() {
        this(new C4775g5(C4774g4.m20232a(), m20040a()));
    }

    /* renamed from: a */
    public final <T> C4790h6<T> mo18935a(Class<T> cls) {
        Class<C4801i4> cls2 = C4801i4.class;
        C4821j6.m20418a(cls);
        C4913p5 b = this.f14055a.mo19009b(cls);
        if (b.mo18991i()) {
            if (cls2.isAssignableFrom(cls)) {
                return C5047x5.m21797a(C4821j6.m20430c(), C5058y3.m21825a(), b.mo18992l());
            }
            return C5047x5.m21797a(C4821j6.m20408a(), C5058y3.m21826b(), b.mo18992l());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m20041a(b)) {
                return C5021v5.m21654a(cls, b, C4698b6.m19958b(), C4683a5.m19906b(), C4821j6.m20430c(), C5058y3.m21825a(), C4874m5.m20679b());
            }
            return C5021v5.m21654a(cls, b, C4698b6.m19958b(), C4683a5.m19906b(), C4821j6.m20430c(), null, C4874m5.m20679b());
        } else if (m20041a(b)) {
            return C5021v5.m21654a(cls, b, C4698b6.m19957a(), C4683a5.m19905a(), C4821j6.m20408a(), C5058y3.m21826b(), C4874m5.m20678a());
        } else {
            return C5021v5.m21654a(cls, b, C4698b6.m19957a(), C4683a5.m19905a(), C4821j6.m20424b(), null, C4874m5.m20678a());
        }
    }

    private C4739e5(C4900o5 o5Var) {
        this.f14055a = (C4900o5) C4819j4.m20396a(o5Var, "messageInfoFactory");
    }

    /* renamed from: a */
    private static boolean m20041a(C4913p5 p5Var) {
        return p5Var.mo18988a() == C4805d.f14195i;
    }

    /* renamed from: a */
    private static C4900o5 m20040a() {
        try {
            return (C4900o5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f14054b;
        }
    }
}
