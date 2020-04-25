package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.n5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4887n5 implements C4834k5 {
    C4887n5() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo19175a(Object obj) {
        return (C4861l5) obj;
    }

    /* renamed from: b */
    public final Object mo19176b(Object obj) {
        ((C4861l5) obj).mo19260e();
        return obj;
    }

    /* renamed from: c */
    public final boolean mo19177c(Object obj) {
        return !((C4861l5) obj).mo19263f();
    }

    /* renamed from: d */
    public final Map<?, ?> mo19178d(Object obj) {
        return (C4861l5) obj;
    }

    /* renamed from: e */
    public final C4807i5<?, ?> mo19179e(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: f */
    public final Object mo19180f(Object obj) {
        return C4861l5.m20625a().mo19259d();
    }

    /* renamed from: a */
    public final Object mo19174a(Object obj, Object obj2) {
        C4861l5 l5Var = (C4861l5) obj;
        C4861l5 l5Var2 = (C4861l5) obj2;
        if (!l5Var2.isEmpty()) {
            if (!l5Var.mo19263f()) {
                l5Var = l5Var.mo19259d();
            }
            l5Var.mo19257a(l5Var2);
        }
        return l5Var;
    }

    /* renamed from: a */
    public final int mo19173a(int i, Object obj, Object obj2) {
        C4861l5 l5Var = (C4861l5) obj;
        if (l5Var.isEmpty()) {
            return 0;
        }
        Iterator it = l5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
