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
import com.mrsool.utils.C5880q;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@SuppressLint({"Registered"})
/* renamed from: com.mrsool.utils.b0.g */
/* compiled from: GPSTracker */
public class C11593g extends Service implements LocationListener {

    /* renamed from: T */
    private static final long f32833T = 10;

    /* renamed from: U */
    private static final long f32834U = 60000;

    /* renamed from: N */
    boolean f32835N = false;

    /* renamed from: O */
    boolean f32836O = false;

    /* renamed from: P */
    Location f32837P;

    /* renamed from: Q */
    double f32838Q;

    /* renamed from: R */
    double f32839R;

    /* renamed from: S */
    protected LocationManager f32840S;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1376c f32841a;

    /* renamed from: b */
    boolean f32842b = false;

    /* renamed from: com.mrsool.utils.b0.g$a */
    /* compiled from: GPSTracker */
    class C11594a implements Runnable {

        /* renamed from: com.mrsool.utils.b0.g$a$a */
        /* compiled from: GPSTracker */
        class C11595a implements OnClickListener {
            C11595a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C11593g.this.f32841a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }

        /* renamed from: com.mrsool.utils.b0.g$a$b */
        /* compiled from: GPSTracker */
        class C11596b implements OnClickListener {
            C11596b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        C11594a() {
        }

        public void run() {
            C6845b bVar = new C6845b(C11593g.this.f32841a, C10232R.style.AlertDialogTheme);
            bVar.mo770b((CharSequence) "GPS is settings");
            bVar.mo758a((CharSequence) "Your GPS is disabled, Enable GPS in settings or continue with approximate location");
            bVar.mo776c((CharSequence) "Settings", (OnClickListener) new C11595a());
            bVar.mo759a((CharSequence) "Cancel", (OnClickListener) new C11596b());
            bVar.mo778c();
        }
    }

    public C11593g(C1376c cVar) {
        this.f32841a = cVar;
        mo39786c();
    }

    /* renamed from: b */
    public double mo39784b() {
        Location location = this.f32837P;
        if (location != null) {
            this.f32838Q = location.getLatitude();
        }
        return this.f32838Q;
    }

    /* renamed from: c */
    public Location mo39786c() {
        String str = Network.TYPE_NETWORK;
        String str2 = "gps";
        try {
            this.f32840S = (LocationManager) this.f32841a.getSystemService("location");
            this.f32842b = this.f32840S.isProviderEnabled(str2);
            this.f32835N = this.f32840S.isProviderEnabled(str);
            if (!this.f32842b && !this.f32835N) {
                return this.f32837P;
            }
            this.f32836O = true;
            if (this.f32835N) {
                this.f32840S.requestLocationUpdates(Network.TYPE_NETWORK, f32834U, 10.0f, this);
                if (this.f32840S != null) {
                    this.f32837P = this.f32840S.getLastKnownLocation(str);
                    mo39793g();
                }
            }
            if (this.f32842b && this.f32837P == null) {
                this.f32840S.requestLocationUpdates("gps", f32834U, 10.0f, this);
                if (this.f32840S != null) {
                    this.f32837P = this.f32840S.getLastKnownLocation(str2);
                    mo39793g();
                }
            }
            return this.f32837P;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error : LocationImpossible to connect to LocationManager");
            sb.append(e);
            C5880q.m25751b(sb.toString());
        }
    }

    /* renamed from: d */
    public double mo39788d() {
        Location location = this.f32837P;
        if (location != null) {
            this.f32839R = location.getLongitude();
        }
        return this.f32839R;
    }

    /* renamed from: e */
    public void mo39791e() {
        C1376c cVar = this.f32841a;
        if (cVar != null && !cVar.isFinishing()) {
            this.f32841a.runOnUiThread(new C11594a());
        }
    }

    /* renamed from: f */
    public void mo39792f() {
        if (this.f32840S != null && (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
            this.f32840S.removeUpdates(this);
            this.f32840S = null;
        }
    }

    /* renamed from: g */
    public void mo39793g() {
        Location location = this.f32837P;
        if (location != null) {
            this.f32838Q = location.getLatitude();
            this.f32839R = this.f32837P.getLongitude();
        }
    }

    @C0195i0
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onLocationChanged(Location location) {
    }

    public void onProviderDisabled(String str) {
        mo39791e();
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* renamed from: a */
    public boolean mo39783a() {
        return this.f32836O;
    }

    /* renamed from: a */
    public String mo39782a(Context context) {
        List c = mo39787c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getAddressLine(0);
    }

    /* renamed from: e */
    public String mo39790e(Context context) {
        List c = mo39787c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getPostalCode();
    }

    /* renamed from: b */
    public String mo39785b(Context context) {
        List c = mo39787c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getCountryName();
    }

    /* renamed from: d */
    public String mo39789d(Context context) {
        List c = mo39787c(context);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return ((Address) c.get(0)).getLocality();
    }

    /* renamed from: c */
    public List<Address> mo39787c(Context context) {
        if (this.f32837P != null) {
            try {
                return new Geocoder(context, Locale.ENGLISH).getFromLocation(this.f32838Q, this.f32839R, 1);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error : GeocoderImpossible to connect to Geocoder");
                sb.append(e);
                C5880q.m25751b(sb.toString());
            }
        }
        return null;
    }
}
