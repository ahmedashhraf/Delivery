package com.google.android.gms.common.p172q;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4503v;

@C4056a
/* renamed from: com.google.android.gms.common.q.b */
public class C4438b {

    /* renamed from: a */
    private final Context f13606a;

    public C4438b(Context context) {
        this.f13606a = context;
    }

    @C4056a
    /* renamed from: a */
    public ApplicationInfo mo18446a(String str, int i) throws NameNotFoundException {
        return this.f13606a.getPackageManager().getApplicationInfo(str, i);
    }

    @C4056a
    /* renamed from: b */
    public PackageInfo mo18451b(String str, int i) throws NameNotFoundException {
        return this.f13606a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo18447a(String str, int i, int i2) throws NameNotFoundException {
        return this.f13606a.getPackageManager().getPackageInfo(str, 64);
    }

    @C4056a
    /* renamed from: b */
    public CharSequence mo18452b(String str) throws NameNotFoundException {
        return this.f13606a.getPackageManager().getApplicationLabel(this.f13606a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public final String[] mo18450a(int i) {
        return this.f13606a.getPackageManager().getPackagesForUid(i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo18449a(int i, String str) {
        if (C4503v.m19414h()) {
            try {
                ((AppOpsManager) this.f13606a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f13606a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @C4056a
    /* renamed from: a */
    public int mo18444a(String str) {
        return this.f13606a.checkCallingOrSelfPermission(str);
    }

    @C4056a
    /* renamed from: a */
    public int mo18445a(String str, String str2) {
        return this.f13606a.getPackageManager().checkPermission(str, str2);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18448a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4437a.m19100a(this.f13606a);
        }
        if (C4503v.m19420n()) {
            String nameForUid = this.f13606a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f13606a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
}
