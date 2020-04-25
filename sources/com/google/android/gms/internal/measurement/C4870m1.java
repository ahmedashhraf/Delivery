package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.android.gms.internal.measurement.m1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4870m1 {

    /* renamed from: a */
    private static volatile C4694b2<Boolean> f14257a = C4694b2.m19950e();

    /* renamed from: b */
    private static final Object f14258b = new Object();

    /* renamed from: a */
    private static boolean m20646a(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & C13959t.f40835R1) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m20647a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            sb.toString();
            return false;
        } else if (f14257a.mo18861a()) {
            return ((Boolean) f14257a.mo18862d()).booleanValue();
        } else {
            synchronized (f14258b) {
                if (f14257a.mo18861a()) {
                    boolean booleanValue = ((Boolean) f14257a.mo18862d()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m20646a(context)) {
                            z2 = true;
                        }
                        f14257a = C4694b2.m19949a(Boolean.valueOf(z2));
                        return ((Boolean) f14257a.mo18862d()).booleanValue();
                    }
                }
                z = true;
                z2 = true;
                f14257a = C4694b2.m19949a(Boolean.valueOf(z2));
                return ((Boolean) f14257a.mo18862d()).booleanValue();
            }
        }
    }
}
