package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.i */
/* compiled from: BundleCompat */
public final class C0748i {

    /* renamed from: androidx.core.app.i$a */
    /* compiled from: BundleCompat */
    static class C0749a {

        /* renamed from: a */
        private static final String f3427a = "BundleCompatBaseImpl";

        /* renamed from: b */
        private static Method f3428b;

        /* renamed from: c */
        private static boolean f3429c;

        /* renamed from: d */
        private static Method f3430d;

        /* renamed from: e */
        private static boolean f3431e;

        private C0749a() {
        }

        /* renamed from: a */
        public static IBinder m4317a(Bundle bundle, String str) {
            if (!f3429c) {
                try {
                    f3428b = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f3428b.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f3429c = true;
            }
            Method method = f3428b;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f3428b = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m4318a(Bundle bundle, String str, IBinder iBinder) {
            if (!f3431e) {
                try {
                    f3430d = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f3430d.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f3431e = true;
            }
            Method method = f3430d;
            if (method != null) {
                try {
                    method.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f3430d = null;
                }
            }
        }
    }

    private C0748i() {
    }

    @C0195i0
    /* renamed from: a */
    public static IBinder m4315a(@C0193h0 Bundle bundle, @C0195i0 String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0749a.m4317a(bundle, str);
    }

    /* renamed from: a */
    public static void m4316a(@C0193h0 Bundle bundle, @C0195i0 String str, @C0195i0 IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0749a.m4318a(bundle, str, iBinder);
        }
    }
}
