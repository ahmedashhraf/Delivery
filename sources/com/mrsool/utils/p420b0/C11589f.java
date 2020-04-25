package com.mrsool.utils.p420b0;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1376c;
import com.google.android.material.p296f.C6845b;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;
import com.mrsool.C10232R;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@SuppressLint({"Registered"})
/* renamed from: com.mrsool.utils.b0.f */
/* compiled from: GPSSDLocationTracker */
public class C11589f extends Service implements LocationListener {

    /* renamed from: T */
    private static final long f32820T = 10;

    /* renamed from: U */
    private static final long f32821U = 1000;

    /* renamed from: N */
    boolean f32822N = false;

    /* renamed from: O */
    boolean f32823O = false;

    /* renamed from: P */
    boolean f32824P = false;

    /* renamed from: Q */
    Location f32825Q;

    /* renamed from: R */
    double f32826R;

    /* renamed from: S */
    double f32827S;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1376c f32828a;

    /* renamed from: b */
    protected LocationManager f32829b;

    /* renamed from: com.mrsool.utils.b0.f$a */
    /* compiled from: GPSSDLocationTracker */
    class C11590a implements Runnable {

        /* renamed from: com.mrsool.utils.b0.f$a$a */
        /* compiled from: GPSSDLocationTracker */
        class C11591a implements OnClickListener {
            C11591a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C11589f.this.f32828a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }

        /* renamed from: com.mrsool.utils.b0.f$a$b */
        /* compiled from: GPSSDLocationTracker */
        class C11592b implements OnClickListener {
            C11592b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        C11590a() {
        }

        public void run() {
            C6845b bVar = new C6845b(C11589f.this.f32828a, C10232R.style.AlertDialogTheme);
            bVar.mo770b((CharSequence) "GPS is settings");
            bVar.mo758a((CharSequence) "Your GPS is disabled, Enable GPS in settings or continue with approximate location");
            bVar.mo776c((CharSequence) "Settings", (OnClickListener) new C11591a());
            bVar.mo759a((CharSequence) "Cancel", (OnClickListener) new C11592b());
            if (C11589f.this.f32828a != null && !C11589f.this.f32828a.isFinishing()) {
                bVar.mo778c();
            }
        }
    }

    public C11589f(C1376c cVar) {
        this.f32828a = cVar;
        mo39766c();
    }

    /* renamed from: b */
    public double mo39764b() {
        Location location = this.f32825Q;
        if (location != null) {
            this.f32826R = location.getLatitude();
        }
        return this.f32826R;
    }

    /* renamed from: c */
    public Location mo39766c() {
        String str = Network.TYPE_NETWORK;
        String str2 = "gps";
        try {
            this.f32829b = (LocationManager) this.f32828a.getSystemService("location");
            this.f32822N = this.f32829b.isProviderEnabled(str2);
            this.f32823O = this.f32829b.isProviderEnabled(str);
            if (!this.f32822N && !this.f32823O) {
                return this.f32825Q;
            }
            this.f32824P = true;
            if (this.f32823O) {
                this.f32829b.requestLocationUpdates(Network.TYPE_NETWORK, f32821U, 10.0f, this);
                if (this.f32829b != null) {
                    this.f32825Q = this.f32829b.getLastKnownLocation(str);
                    mo39773g();
                }
            }
            if (this.f32822N && this.f32825Q == null) {
                this.f32829b.requestLocationUpdates("gps", f32821U, 10.0f, this);
                if (this.f32829b != null) {
                    this.f32825Q = this.f32829b.getLastKnownLocation(str2);
                    mo39773g();
                }
            }
            return this.f32825Q;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public double mo39768d() {
        Location location = this.f32825Q;
        if (location != null) {
            this.f32827S = location.getLongitude();
        }
        return this.f32827S;
    }

    /* renamed from: e */
    public void mo39771e() {
        try {
            if (this.f32828a != null) {
                if (!this.f32828a.isFinishing()) {
                    this.f32828a.runOnUiThread(new C11590a());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo39772f() {
        if (this.f32829b != null && (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
            this.f32829b.removeUpdates(this);
            this.f32829b = null;
        }
    }

    /* renamed from: g */
    public void mo39773g() {
        Location location = this.f32825Q;
        if (location != null) {
            this.f32826R = location.getLatitude();
            this.f32827S = this.f32825Q.getLongitude();
        }
    }

    @C0195i0
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onLocationChanged(Location location) {
    }

    public void onProviderDisabled(String str) {
        mo39771e();
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* renamed from: a */
    public boolean mo39763a() {
        return this.f32824P;
    }

    /* renamed from: a */
    public String mo39762a(Context context) {
        List c = mo39767c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getAddressLine(0);
    }

    /* renamed from: b */
    public String mo39765b(Context context) {
        List c = mo39767c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getCountryName();
    }

    /* renamed from: d */
    public String mo39769d(Context context) {
        List c = mo39767c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getLocality();
    }

    /* renamed from: e */
    public String mo39770e(Context context) {
        List c = mo39767c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getPostalCode();
    }

    /* renamed from: c */
    public List<Address> mo39767c(Context context) {
        if (this.f32825Q != null) {
            try {
                return new Geocoder(context, Locale.ENGLISH).getFromLocation(this.f32826R, this.f32827S, 1);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
