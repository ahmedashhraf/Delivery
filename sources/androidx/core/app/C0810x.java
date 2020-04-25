package androidx.core.app;

import android.app.Service;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.app.x */
/* compiled from: ServiceCompat */
public final class C0810x {

    /* renamed from: a */
    public static final int f3875a = 1;

    /* renamed from: b */
    public static final int f3876b = 1;

    /* renamed from: c */
    public static final int f3877c = 2;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.x$a */
    /* compiled from: ServiceCompat */
    public @interface C0811a {
    }

    private C0810x() {
    }

    /* renamed from: a */
    public static void m4719a(@C0193h0 Service service, int i) {
        if (VERSION.SDK_INT >= 24) {
            service.stopForeground(i);
            return;
        }
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        service.stopForeground(z);
    }
}
