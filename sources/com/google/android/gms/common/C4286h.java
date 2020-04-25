package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.p172q.C4439c;
import p201f.p202a.C5944c;

@C4056a
@C4312d0
@C5944c
/* renamed from: com.google.android.gms.common.h */
public class C4286h {

    /* renamed from: c */
    private static C4286h f13291c;

    /* renamed from: a */
    private final Context f13292a;

    /* renamed from: b */
    private volatile String f13293b;

    private C4286h(Context context) {
        this.f13292a = context.getApplicationContext();
    }

    @C4056a
    /* renamed from: a */
    public static C4286h m18530a(Context context) {
        C4300a0.m18620a(context);
        synchronized (C4286h.class) {
            if (f13291c == null) {
                C4508v.m19432a(context);
                f13291c = new C4286h(context);
            }
        }
        return f13291c;
    }

    /* renamed from: b */
    private final C4281e0 m18533b(String str) {
        C4281e0 e0Var;
        String str2 = "null pkg";
        if (str == null) {
            return C4281e0.m18504a(str2);
        }
        if (str.equals(this.f13293b)) {
            return C4281e0.m18508c();
        }
        try {
            PackageInfo b = C4439c.m19110a(this.f13292a).mo18451b(str, 64);
            boolean honorsDebugCertificates = C4284g.honorsDebugCertificates(this.f13292a);
            if (b == null) {
                e0Var = C4281e0.m18504a(str2);
            } else {
                Signature[] signatureArr = b.signatures;
                if (signatureArr.length != 1) {
                    e0Var = C4281e0.m18504a("single cert required");
                } else {
                    C4511y yVar = new C4511y(signatureArr[0].toByteArray());
                    String str3 = b.packageName;
                    C4281e0 a = C4508v.m19430a(str3, yVar, honorsDebugCertificates, false);
                    if (a.f13281a) {
                        ApplicationInfo applicationInfo = b.applicationInfo;
                        if (!(applicationInfo == null || (applicationInfo.flags & 2) == 0 || !C4508v.m19430a(str3, yVar, false, true).f13281a)) {
                            e0Var = C4281e0.m18504a("debuggable release cert app rejected");
                        }
                    }
                    e0Var = a;
                }
            }
            if (e0Var.f13281a) {
                this.f13293b = str;
            }
            return e0Var;
        } catch (NameNotFoundException unused) {
            String str4 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C4281e0.m18504a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public boolean mo18127a(int i) {
        C4281e0 e0Var;
        String[] a = C4439c.m19110a(this.f13292a).mo18450a(i);
        if (a != null && a.length != 0) {
            e0Var = null;
            for (String a2 : a) {
                e0Var = m18529a(a2, i);
                if (e0Var.f13281a) {
                    break;
                }
            }
        } else {
            e0Var = C4281e0.m18504a("no pkgs");
        }
        e0Var.mo18118b();
        return e0Var.f13281a;
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public boolean mo18129a(String str) {
        C4281e0 b = m18533b(str);
        b.mo18118b();
        return b.f13281a;
    }

    /* renamed from: a */
    public static boolean m18532a(PackageInfo packageInfo, boolean z) {
        C4510x xVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                xVar = m18531a(packageInfo, C4055a0.f12774a);
            } else {
                xVar = m18531a(packageInfo, C4055a0.f12774a[0]);
            }
            if (xVar != null) {
                return true;
            }
        }
        return false;
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18128a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m18532a(packageInfo, false)) {
            return true;
        }
        return m18532a(packageInfo, true) && C4284g.honorsDebugCertificates(this.f13292a);
    }

    /* renamed from: a */
    private final C4281e0 m18529a(String str, int i) {
        try {
            PackageInfo a = C4439c.m19110a(this.f13292a).mo18447a(str, 64, i);
            boolean honorsDebugCertificates = C4284g.honorsDebugCertificates(this.f13292a);
            if (a == null) {
                return C4281e0.m18504a("null pkg");
            }
            if (a.signatures.length != 1) {
                return C4281e0.m18504a("single cert required");
            }
            C4511y yVar = new C4511y(a.signatures[0].toByteArray());
            String str2 = a.packageName;
            C4281e0 a2 = C4508v.m19430a(str2, yVar, honorsDebugCertificates, false);
            return (!a2.f13281a || a.applicationInfo == null || (a.applicationInfo.flags & 2) == 0 || !C4508v.m19430a(str2, yVar, false, true).f13281a) ? a2 : C4281e0.m18504a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C4281e0.m18504a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    /* renamed from: a */
    private static C4510x m18531a(PackageInfo packageInfo, C4510x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        C4511y yVar = new C4511y(signatureArr[0].toByteArray());
        for (int i = 0; i < xVarArr.length; i++) {
            if (xVarArr[i].equals(yVar)) {
                return xVarArr[i];
            }
        }
        return null;
    }
}
