package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C5742h;
import com.google.android.play.core.internal.C7128c1;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7131e0;
import com.google.android.play.core.tasks.C7191d;
import com.google.android.play.core.tasks.C7205o;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.g0 */
final class C7169g0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C5742h f20293c = new C5742h("SplitInstallService");

    /* renamed from: d */
    private static final Intent f20294d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f20295a;

    /* renamed from: b */
    final C7128c1<C7131e0> f20296b;

    public C7169g0(Context context) {
        this(context, context.getPackageName());
    }

    private C7169g0(Context context, String str) {
        this.f20295a = str;
        C7128c1 c1Var = new C7128c1(context.getApplicationContext(), f20293c, "SplitInstallService", f20294d, C7167f0.f20292a);
        this.f20296b = c1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static ArrayList<Bundle> m34449c(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Bundle m34450d() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10603);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static ArrayList<Bundle> m34451d(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString(C11687c.f33783f3, str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C7191d<List<SplitInstallSessionState>> mo28597a() {
        f20293c.mo23043a("getSessionStates", new Object[0]);
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7185o0(this, oVar, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: a */
    public final C7191d<SplitInstallSessionState> mo28598a(int i) {
        f20293c.mo23043a("getSessionState(%d)", Integer.valueOf(i));
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7179l0(this, oVar, i, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: a */
    public final C7191d<Integer> mo28599a(Collection<String> collection, Collection<String> collection2) {
        f20293c.mo23043a("startInstall(%s,%s)", collection, collection2);
        C7205o oVar = new C7205o();
        C7128c1<C7131e0> c1Var = this.f20296b;
        C7173i0 i0Var = new C7173i0(this, oVar, collection, collection2, oVar);
        c1Var.mo28496a((C7130d1) i0Var);
        return oVar.mo28632a();
    }

    /* renamed from: a */
    public final C7191d<Void> mo28600a(List<String> list) {
        f20293c.mo23043a("deferredUninstall(%s)", list);
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7171h0(this, oVar, list, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: b */
    public final C7191d<Void> mo28601b(int i) {
        f20293c.mo23043a("cancelInstall(%d)", Integer.valueOf(i));
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7183n0(this, oVar, i, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: b */
    public final C7191d<Void> mo28602b(List<String> list) {
        f20293c.mo23043a("deferredInstall(%s)", list);
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7177k0(this, oVar, list, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: c */
    public final C7191d<Void> mo28603c(List<String> list) {
        f20293c.mo23043a("deferredLanguageInstall(%s)", list);
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7175j0(this, oVar, list, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: d */
    public final C7191d<Void> mo28604d(List<String> list) {
        f20293c.mo23043a("deferredLanguageUninstall(%s)", list);
        C7205o oVar = new C7205o();
        this.f20296b.mo28496a((C7130d1) new C7181m0(this, oVar, list, oVar));
        return oVar.mo28632a();
    }
}
