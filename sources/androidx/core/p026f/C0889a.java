package androidx.core.p026f;

import android.location.LocationManager;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;

/* renamed from: androidx.core.f.a */
/* compiled from: LocationManagerCompat */
public final class C0889a {
    private C0889a() {
    }

    /* renamed from: a */
    public static boolean m5107a(@C0193h0 LocationManager locationManager) {
        if (VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        return locationManager.isProviderEnabled(Network.TYPE_NETWORK) || locationManager.isProviderEnabled("gps");
    }
}
