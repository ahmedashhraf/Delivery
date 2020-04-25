package androidx.browser.p013a;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.core.app.C0748i;

/* renamed from: androidx.browser.a.j */
/* compiled from: TrustedWebUtils */
public class C0607j {

    /* renamed from: a */
    public static final String f2400a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private C0607j() {
    }

    /* renamed from: a */
    public static void m3238a(@C0193h0 Context context, @C0193h0 C0591c cVar, @C0193h0 Uri uri) {
        if (C0748i.m4315a(cVar.f2365a.getExtras(), C0591c.f2342d) != null) {
            cVar.f2365a.putExtra(f2400a, true);
            cVar.mo3032a(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }
}
