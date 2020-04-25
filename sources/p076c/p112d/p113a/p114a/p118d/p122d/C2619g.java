package p076c.p112d.p113a.p114a.p118d.p122d;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;

/* renamed from: c.d.a.a.d.d.g */
public final class C2619g {

    /* renamed from: a */
    private static volatile boolean f9731a = (!m12730a());

    /* renamed from: a */
    public static boolean m12730a() {
        return VERSION.SDK_INT >= 24;
    }

    @RequiresApi(24)
    @TargetApi(24)
    /* renamed from: a */
    public static Context m12729a(Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }
}
