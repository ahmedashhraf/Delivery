package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4685a7 extends C5074z6<C4699b7, C4699b7> {
    C4685a7() {
    }

    /* renamed from: a */
    private static void m19910a(Object obj, C4699b7 b7Var) {
        ((C4801i4) obj).zzb = b7Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo18837a(C4808i6 i6Var) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo18840b(Object obj, C5036w7 w7Var) throws IOException {
        ((C4699b7) obj).mo18866a(w7Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo18843c(Object obj, Object obj2) {
        C4699b7 b7Var = (C4699b7) obj;
        C4699b7 b7Var2 = (C4699b7) obj2;
        if (b7Var2.equals(C4699b7.m19962d())) {
            return b7Var;
        }
        return C4699b7.m19960a(b7Var, b7Var2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo18844d(Object obj) {
        ((C4801i4) obj).zzb.mo18864a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ int mo18845e(Object obj) {
        return ((C4699b7) obj).mo18868b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ int mo18846f(Object obj) {
        return ((C4699b7) obj).mo18870c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo18835a(Object obj, C5036w7 w7Var) throws IOException {
        ((C4699b7) obj).mo18869b(w7Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo18841b(Object obj, Object obj2) {
        m19910a(obj, (C4699b7) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18836a(Object obj, Object obj2) {
        m19910a(obj, (C4699b7) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo18842c(Object obj) {
        C4699b7 b7Var = ((C4801i4) obj).zzb;
        if (b7Var != C4699b7.m19962d()) {
            return b7Var;
        }
        C4699b7 e = C4699b7.m19963e();
        m19910a(obj, e);
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo18830a(Object obj) {
        C4699b7 b7Var = (C4699b7) obj;
        b7Var.mo18864a();
        return b7Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo18838b(Object obj) {
        return ((C4801i4) obj).zzb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo18839b(Object obj, int i, long j) {
        ((C4699b7) obj).mo18865a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo18829a() {
        return C4699b7.m19963e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo18834a(Object obj, int i, Object obj2) {
        ((C4699b7) obj).mo18865a((i << 3) | 3, (Object) (C4699b7) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo18833a(Object obj, int i, C5070z2 z2Var) {
        ((C4699b7) obj).mo18865a((i << 3) | 2, (Object) z2Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo18831a(Object obj, int i, int i2) {
        ((C4699b7) obj).mo18865a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo18832a(Object obj, int i, long j) {
        ((C4699b7) obj).mo18865a(i << 3, (Object) Long.valueOf(j));
    }
}
