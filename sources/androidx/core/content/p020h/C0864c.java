package androidx.core.content.p020h;

import android.content.res.Resources;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.content.h.c */
/* compiled from: ConfigurationHelper */
public final class C0864c {
    private C0864c() {
    }

    /* renamed from: a */
    public static int m5016a(@C0193h0 Resources resources) {
        if (VERSION.SDK_INT >= 17) {
            return resources.getConfiguration().densityDpi;
        }
        return resources.getDisplayMetrics().densityDpi;
    }
}
