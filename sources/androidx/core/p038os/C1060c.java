package androidx.core.p038os;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.os.c */
/* compiled from: ConfigurationCompat */
public final class C1060c {
    private C1060c() {
    }

    @C0193h0
    /* renamed from: a */
    public static C1063f m6154a(@C0193h0 Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            return C1063f.m6159a(configuration.getLocales());
        }
        return C1063f.m6161a(configuration.locale);
    }
}
