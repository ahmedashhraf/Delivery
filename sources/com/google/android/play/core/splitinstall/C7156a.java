package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.play.core.internal.C5742h;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.google.android.play.core.splitinstall.a */
public class C7156a {

    /* renamed from: a */
    private static final C5742h f20265a = new C5742h("SplitInstallHelper");

    private C7156a() {
    }

    /* renamed from: a */
    public static void m34398a(Context context) {
        int i = VERSION.SDK_INT;
        if (i > 25 && i < 28) {
            f20265a.mo23043a("Calling dispatchPackageBroadcast", new Object[0]);
            try {
                Class cls = Class.forName("android.app.ActivityThread");
                Method method = cls.getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mAppThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                obj.getClass().getMethod("dispatchPackageBroadcast", new Class[]{Integer.TYPE, String[].class}).invoke(obj, new Object[]{Integer.valueOf(3), new String[]{context.getPackageName()}});
                f20265a.mo23043a("Called dispatchPackageBroadcast", new Object[0]);
            } catch (Exception e) {
                f20265a.mo23044a((Throwable) e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m34399a(Context context, String str) throws UnsatisfiedLinkError {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            boolean z = false;
            try {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    System.load(sb2);
                    z = true;
                }
                if (!z) {
                    throw e;
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
    }
}
