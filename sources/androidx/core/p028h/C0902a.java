package androidx.core.p028h;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.h.a */
/* compiled from: ConnectivityManagerCompat */
public final class C0902a {

    /* renamed from: a */
    public static final int f4126a = 1;

    /* renamed from: b */
    public static final int f4127b = 2;

    /* renamed from: c */
    public static final int f4128c = 3;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.h.a$a */
    /* compiled from: ConnectivityManagerCompat */
    public @interface C0903a {
    }

    private C0902a() {
    }

    @C0195i0
    @C0203m0("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: a */
    public static NetworkInfo m5204a(@C0193h0 ConnectivityManager connectivityManager, @C0193h0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    @C0203m0("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: b */
    public static boolean m5205b(@C0193h0 ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static int m5203a(@C0193h0 ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }
}
