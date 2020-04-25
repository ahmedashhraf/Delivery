package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.play.core.internal.C5742h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.z */
public final class C5784z {

    /* renamed from: e */
    private static final C5742h f16663e = new C5742h("SplitInstallInfoProvider");

    /* renamed from: a */
    private final Context f16664a;

    /* renamed from: b */
    private final String f16665b;

    /* renamed from: c */
    private C5783y f16666c = null;

    /* renamed from: d */
    private C5778s f16667d = null;

    public C5784z(Context context, String str) {
        this.f16664a = context;
        this.f16665b = str;
    }

    /* renamed from: a */
    public static boolean m25344a(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: b */
    public static boolean m25345b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    /* renamed from: c */
    private final C5778s m25346c() {
        Bundle f = m25350f();
        if (f == null) {
            return null;
        }
        int i = f.getInt("com.android.vending.splits");
        if (i == 0) {
            f16663e.mo23046c("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C5778s a = new C5775p(this.f16664a.getResources().getXml(i)).mo23059a();
            if (a == null) {
                f16663e.mo23046c("Can't parse languages metadata.", new Object[0]);
            }
            return a;
        } catch (NotFoundException unused) {
            f16663e.mo23046c("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static String m25347c(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: d */
    private final Set<String> m25348d() {
        HashSet hashSet = new HashSet();
        Bundle f = m25350f();
        if (f != null) {
            String string = f.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f16663e.mo23045b("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
            }
        }
        if (VERSION.SDK_INT < 21) {
            return hashSet;
        }
        String[] e = m25349e();
        if (e != null) {
            f16663e.mo23045b("Adding splits from package manager: %s", Arrays.toString(e));
            Collections.addAll(hashSet, e);
        } else {
            f16663e.mo23045b("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C5783y a = C5781w.m25339a();
        if (a != null) {
            hashSet.addAll(a.mo10384d());
        }
        return hashSet;
    }

    /* renamed from: e */
    private final String[] m25349e() {
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.f16664a.getPackageManager().getPackageInfo(this.f16665b, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
            return strArr;
        } catch (NameNotFoundException unused) {
            f16663e.mo23046c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    private final Bundle m25350f() {
        try {
            ApplicationInfo applicationInfo = this.f16664a.getPackageManager().getApplicationInfo(this.f16665b, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f16663e.mo23045b("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (NameNotFoundException unused) {
            f16663e.mo23046c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final Set<String> mo23067a() {
        HashSet hashSet = new HashSet();
        for (String str : m25348d()) {
            if (!m25345b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Set<String> mo23068b() {
        C5778s c = m25346c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set d = m25348d();
        String str = "";
        d.add(str);
        Set a = mo23067a();
        a.add(str);
        for (Entry entry : c.mo23063a(a).entrySet()) {
            if (d.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }
}
