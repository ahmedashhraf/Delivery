package p076c.p112d.p113a.p130b.p131a.p225a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.play.core.internal.C5742h;
import com.google.android.play.core.internal.C7128c1;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7152y0;
import com.google.android.play.core.tasks.C7191d;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.g */
final class C6153g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C5742h f17341d = new C5742h("AppUpdateService");

    /* renamed from: e */
    private static final Intent f17342e = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    final C7128c1<C7152y0> f17343a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f17344b;

    /* renamed from: c */
    private final Context f17345c;

    public C6153g(Context context) {
        this.f17344b = context.getPackageName();
        this.f17345c = context;
        C7128c1 c1Var = new C7128c1(context.getApplicationContext(), f17341d, "AppUpdateService", f17342e, C6152f.f17340a);
        this.f17343a = c1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m28256b(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6147a m28258b(Bundle bundle, String str) {
        return C6147a.m28230a(str, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Bundle m28259c() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10603);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Bundle m28260c(String str) {
        Bundle bundle = new Bundle();
        bundle.putAll(m28259c());
        bundle.putString("package.name", str);
        Integer d = m28261d();
        if (d != null) {
            bundle.putInt("app.version.code", d.intValue());
        }
        return bundle;
    }

    /* renamed from: d */
    private final Integer m28261d() {
        try {
            return Integer.valueOf(this.f17345c.getPackageManager().getPackageInfo(this.f17345c.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException unused) {
            f17341d.mo23047d("The current version of the app could not be retrieved", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final C7191d<C6147a> mo25048a(String str) {
        f17341d.mo23043a("requestUpdateInfo(%s)", str);
        C7205o oVar = new C7205o();
        this.f17343a.mo28496a((C7130d1) new C6155i(this, oVar, str, oVar));
        return oVar.mo28632a();
    }

    /* renamed from: b */
    public final C7191d<Void> mo25049b(String str) {
        f17341d.mo23043a("completeUpdate(%s)", str);
        C7205o oVar = new C7205o();
        this.f17343a.mo28496a((C7130d1) new C6154h(this, oVar, oVar, str));
        return oVar.mo28632a();
    }
}
