package androidx.core.p038os;

import android.os.Build.VERSION;
import android.os.Trace;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.os.n */
/* compiled from: TraceCompat */
public final class C1072n {
    private C1072n() {
    }

    /* renamed from: a */
    public static void m6199a(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m6198a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
