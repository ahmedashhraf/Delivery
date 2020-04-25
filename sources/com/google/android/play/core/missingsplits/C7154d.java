package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.play.core.internal.C5742h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.play.core.missingsplits.d */
final class C7154d {

    /* renamed from: c */
    private static final C5742h f20256c = new C5742h("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    private final Context f20257a;

    /* renamed from: b */
    private final PackageManager f20258b;

    C7154d(Context context, PackageManager packageManager) {
        this.f20257a = context;
        this.f20258b = packageManager;
    }

    /* renamed from: a */
    private final void m34382a(List<ComponentInfo> list, int i) {
        for (ComponentInfo componentInfo : list) {
            this.f20258b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    /* renamed from: d */
    private final List<ComponentInfo> m34383d() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f20258b.getPackageInfo(this.f20257a.getPackageName(), 526);
            if (packageInfo.providers != null) {
                Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            f20256c.mo23046c("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28558a() {
        for (ComponentInfo componentInfo : m34383d()) {
            if (this.f20258b.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f20256c.mo23045b("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f20256c.mo23045b("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo28559b() {
        f20256c.mo23043a("Disabling all non-activity components", new Object[0]);
        m34382a(m34383d(), 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo28560c() {
        f20256c.mo23043a("Resetting enabled state of all non-activity components", new Object[0]);
        m34382a(m34383d(), 0);
    }
}
