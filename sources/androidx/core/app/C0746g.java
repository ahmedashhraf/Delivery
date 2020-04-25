package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.C0193h0;
import androidx.core.content.C0844c;

/* renamed from: androidx.core.app.g */
/* compiled from: AppLaunchChecker */
public class C0746g {

    /* renamed from: a */
    private static final String f3421a = "android.support.AppLaunchChecker";

    /* renamed from: b */
    private static final String f3422b = "startedFromLauncher";

    /* renamed from: a */
    public static boolean m4309a(@C0193h0 Context context) {
        return context.getSharedPreferences(f3421a, 0).getBoolean(f3422b, false);
    }

    /* renamed from: a */
    public static void m4308a(@C0193h0 Activity activity) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f3421a, 0);
        String str = f3422b;
        if (!sharedPreferences.getBoolean(str, false)) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                if ("android.intent.action.MAIN".equals(intent.getAction()) && (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C0844c.f3988c))) {
                    sharedPreferences.edit().putBoolean(str, true).apply();
                }
            }
        }
    }
}
