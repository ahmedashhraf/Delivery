package p212io.branch.referral;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.branch.referral.v */
/* compiled from: InstantAppUtil */
class C14201v {

    /* renamed from: a */
    private static Boolean f41827a;

    /* renamed from: b */
    private static Context f41828b;

    /* renamed from: c */
    private static C14202a f41829c;

    /* renamed from: io.branch.referral.v$a */
    /* compiled from: InstantAppUtil */
    private static class C14202a {

        /* renamed from: b */
        private static Method f41830b;

        /* renamed from: a */
        private final PackageManager f41831a;

        C14202a(PackageManager packageManager) {
            this.f41831a = packageManager;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean mo44924a() {
            if (!C14201v.m61497b()) {
                return null;
            }
            if (f41830b == null) {
                try {
                    f41830b = PackageManager.class.getDeclaredMethod("isInstantApp", new Class[0]);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f41830b.invoke(this.f41831a, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    C14201v() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m61497b() {
        return VERSION.SDK_INT > 25 || m61498c();
    }

    /* renamed from: c */
    private static boolean m61498c() {
        if (!"REL".equals(VERSION.CODENAME)) {
            if ("O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m61496a(@C0193h0 Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        if (f41827a != null && applicationContext.equals(f41828b)) {
            return f41827a.booleanValue();
        }
        Boolean bool = null;
        f41827a = null;
        if (m61497b()) {
            if (f41829c == null || !applicationContext.equals(f41828b)) {
                f41829c = new C14202a(applicationContext.getPackageManager());
            }
            bool = f41829c.mo44924a();
        }
        f41828b = applicationContext;
        if (bool != null) {
            f41827a = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f41827a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f41827a = Boolean.FALSE;
            }
        }
        return f41827a.booleanValue();
    }

    /* renamed from: a */
    static boolean m61495a(@C0193h0 Activity activity, int i, @C0195i0 String str) {
        if (activity == null) {
            Boolean bool = C6009d.f17239m0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
            }
            return false;
        } else if (!m61496a(activity)) {
            Boolean bool2 = C6009d.f17239m0;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
            }
            return false;
        } else {
            Intent putExtra = new Intent("android.intent.action.VIEW").setPackage("com.android.vending").addCategory("android.intent.category.DEFAULT").putExtra("callerId", activity.getPackageName()).putExtra("overlay", true);
            Builder appendQueryParameter = new Builder().scheme("market").authority("details").appendQueryParameter("id", activity.getPackageName());
            if (!TextUtils.isEmpty(str)) {
                appendQueryParameter.appendQueryParameter("referrer", str);
            }
            putExtra.setData(appendQueryParameter.build());
            activity.startActivityForResult(putExtra, i);
            return true;
        }
    }
}
