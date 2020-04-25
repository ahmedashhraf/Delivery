package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0224v0;
import androidx.core.content.C0846e;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.m */
/* compiled from: TwilightManager */
class C0311m {

    /* renamed from: d */
    private static final String f943d = "TwilightManager";

    /* renamed from: e */
    private static final int f944e = 6;

    /* renamed from: f */
    private static final int f945f = 22;

    /* renamed from: g */
    private static C0311m f946g;

    /* renamed from: a */
    private final Context f947a;

    /* renamed from: b */
    private final LocationManager f948b;

    /* renamed from: c */
    private final C0312a f949c = new C0312a();

    /* renamed from: androidx.appcompat.app.m$a */
    /* compiled from: TwilightManager */
    private static class C0312a {

        /* renamed from: a */
        boolean f950a;

        /* renamed from: b */
        long f951b;

        /* renamed from: c */
        long f952c;

        /* renamed from: d */
        long f953d;

        /* renamed from: e */
        long f954e;

        /* renamed from: f */
        long f955f;

        C0312a() {
        }
    }

    @C0224v0
    C0311m(@C0193h0 Context context, @C0193h0 LocationManager locationManager) {
        this.f947a = context;
        this.f948b = locationManager;
    }

    /* renamed from: a */
    static C0311m m1599a(@C0193h0 Context context) {
        if (f946g == null) {
            Context applicationContext = context.getApplicationContext();
            f946g = new C0311m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f946g;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1602b() {
        Location location = null;
        Location a = C0846e.m4944b(this.f947a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1598a(Network.TYPE_NETWORK) : null;
        if (C0846e.m4944b(this.f947a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1598a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m1603c() {
        return this.f949c.f955f > System.currentTimeMillis();
    }

    @C0224v0
    /* renamed from: a */
    static void m1601a(C0311m mVar) {
        f946g = mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1107a() {
        C0312a aVar = this.f949c;
        if (m1603c()) {
            return aVar.f950a;
        }
        Location b = m1602b();
        if (b != null) {
            m1600a(b);
            return aVar.f950a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    private Location m1598a(String str) {
        try {
            if (this.f948b.isProviderEnabled(str)) {
                return this.f948b.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private void m1600a(@C0193h0 Location location) {
        long j;
        C0312a aVar = this.f949c;
        long currentTimeMillis = System.currentTimeMillis();
        C0310l a = C0310l.m1596a();
        C0310l lVar = a;
        lVar.mo1106a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f940a;
        lVar.mo1106a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f942c == 1;
        long j3 = a.f941b;
        long j4 = j2;
        long j5 = a.f940a;
        long j6 = j3;
        boolean z2 = z;
        a.mo1106a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f941b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f950a = z2;
        aVar.f951b = j4;
        aVar.f952c = j6;
        aVar.f953d = j5;
        aVar.f954e = j7;
        aVar.f955f = j;
    }
}
