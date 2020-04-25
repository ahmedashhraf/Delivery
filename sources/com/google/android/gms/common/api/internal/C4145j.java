package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C4053R;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4338h0;
import com.google.android.gms.common.internal.C4374o1;
import com.google.android.gms.common.util.C4476d0;
import p201f.p202a.p203u.C5966a;

@C4056a
@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C4145j {

    /* renamed from: e */
    private static final Object f13009e = new Object();
    @C5966a("sLock")

    /* renamed from: f */
    private static C4145j f13010f;

    /* renamed from: a */
    private final String f13011a;

    /* renamed from: b */
    private final Status f13012b;

    /* renamed from: c */
    private final boolean f13013c;

    /* renamed from: d */
    private final boolean f13014d;

    @C4056a
    @C4476d0
    C4145j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C4053R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f13014d = !z;
        } else {
            this.f13014d = false;
        }
        this.f13013c = z;
        String a = C4374o1.m18873a(context);
        if (a == null) {
            a = new C4338h0(context).mo18323a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f13012b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f13011a = null;
            return;
        }
        this.f13011a = a;
        this.f13012b = Status.f12780P;
    }

    @C4056a
    /* renamed from: a */
    public static Status m17954a(Context context, String str, boolean z) {
        C4300a0.m18621a(context, (Object) "Context must not be null.");
        C4300a0.m18622a(str, (Object) "App ID must be nonempty.");
        synchronized (f13009e) {
            if (f13010f != null) {
                Status a = f13010f.mo17904a(str);
                return a;
            }
            C4145j jVar = new C4145j(str, z);
            f13010f = jVar;
            Status status = jVar.f13012b;
            return status;
        }
    }

    @C4056a
    /* renamed from: b */
    public static String m17957b() {
        return m17956b("getGoogleAppId").f13011a;
    }

    @C4056a
    /* renamed from: c */
    public static boolean m17958c() {
        C4145j b = m17956b("isMeasurementEnabled");
        return b.f13012b.mo17617T() && b.f13013c;
    }

    @C4056a
    /* renamed from: d */
    public static boolean m17959d() {
        return m17956b("isMeasurementExplicitlyDisabled").f13014d;
    }

    @C4056a
    /* renamed from: b */
    private static C4145j m17956b(String str) {
        C4145j jVar;
        synchronized (f13009e) {
            if (f13010f != null) {
                jVar = f13010f;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    @C4056a
    @C4476d0
    /* renamed from: a */
    public final Status mo17904a(String str) {
        String str2 = this.f13011a;
        if (str2 == null || str2.equals(str)) {
            return Status.f12780P;
        }
        String str3 = this.f13011a;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 97);
        sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb.append(str3);
        sb.append("'.");
        return new Status(10, sb.toString());
    }

    @C4056a
    /* renamed from: a */
    public static Status m17953a(Context context) {
        Status status;
        C4300a0.m18621a(context, (Object) "Context must not be null.");
        synchronized (f13009e) {
            if (f13010f == null) {
                f13010f = new C4145j(context);
            }
            status = f13010f.f13012b;
        }
        return status;
    }

    @C4056a
    @C4476d0
    C4145j(String str, boolean z) {
        this.f13011a = str;
        this.f13012b = Status.f12780P;
        this.f13013c = z;
        this.f13014d = !z;
    }

    @C4056a
    @C4476d0
    /* renamed from: a */
    static void m17955a() {
        synchronized (f13009e) {
            f13010f = null;
        }
    }
}
