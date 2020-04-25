package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4806e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class C5005u3 {

    /* renamed from: b */
    private static volatile boolean f14437b = false;

    /* renamed from: c */
    private static boolean f14438c = true;

    /* renamed from: d */
    private static final Class<?> f14439d = m21604c();

    /* renamed from: e */
    private static volatile C5005u3 f14440e;

    /* renamed from: f */
    private static volatile C5005u3 f14441f;

    /* renamed from: g */
    private static final C5005u3 f14442g = new C5005u3(true);

    /* renamed from: a */
    private final Map<C5006a, C4806e<?, ?>> f14443a;

    /* renamed from: com.google.android.gms.internal.measurement.u3$a */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static final class C5006a {

        /* renamed from: a */
        private final Object f14444a;

        /* renamed from: b */
        private final int f14445b;

        C5006a(Object obj, int i) {
            this.f14444a = obj;
            this.f14445b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5006a)) {
                return false;
            }
            C5006a aVar = (C5006a) obj;
            if (this.f14444a == aVar.f14444a && this.f14445b == aVar.f14445b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14444a) * 65535) + this.f14445b;
        }
    }

    C5005u3() {
        this.f14443a = new HashMap();
    }

    /* renamed from: a */
    public static C5005u3 m21602a() {
        C5005u3 u3Var = f14440e;
        if (u3Var == null) {
            synchronized (C5005u3.class) {
                u3Var = f14440e;
                if (u3Var == null) {
                    u3Var = f14442g;
                    f14440e = u3Var;
                }
            }
        }
        return u3Var;
    }

    /* renamed from: b */
    public static C5005u3 m21603b() {
        Class<C5005u3> cls = C5005u3.class;
        C5005u3 u3Var = f14441f;
        if (u3Var == null) {
            synchronized (cls) {
                u3Var = f14441f;
                if (u3Var == null) {
                    u3Var = C4788h4.m20257a(cls);
                    f14441f = u3Var;
                }
            }
        }
        return u3Var;
    }

    /* renamed from: c */
    private static Class<?> m21604c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private C5005u3(boolean z) {
        this.f14443a = Collections.emptyMap();
    }

    /* renamed from: a */
    public final <ContainingType extends C4945r5> C4806e<ContainingType, ?> mo19703a(ContainingType containingtype, int i) {
        return (C4806e) this.f14443a.get(new C5006a(containingtype, i));
    }
}
