package com.mrsool.utils.p420b0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C5124e;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.C5142m;
import com.google.android.gms.location.C5145n;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest.C5112a;
import com.google.android.gms.tasks.C5549f;
import com.google.android.gms.tasks.C5551g;
import com.mrsool.HomeActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;

/* renamed from: com.mrsool.utils.b0.e */
/* compiled from: FusedLocationUtils */
public class C11584e implements C5551g, C5549f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: n */
    private static C11584e f32801n = null;

    /* renamed from: o */
    private static final int f32802o = 100;

    /* renamed from: a */
    private LocationRequest f32803a;

    /* renamed from: b */
    private Activity f32804b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11573b f32805c;

    /* renamed from: d */
    private C5124e f32806d;

    /* renamed from: e */
    private C5138k f32807e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Location f32808f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f32809g = false;

    /* renamed from: h */
    private int f32810h = 1000;

    /* renamed from: i */
    private int f32811i = 1000;

    /* renamed from: j */
    private boolean f32812j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f32813k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Runnable f32814l;

    /* renamed from: m */
    private int f32815m = C11644i.f33397r;

    /* renamed from: com.mrsool.utils.b0.e$a */
    /* compiled from: FusedLocationUtils */
    class C11585a extends C5138k {
        C11585a() {
        }

        /* renamed from: a */
        public void mo20112a(LocationResult locationResult) {
            super.mo20112a(locationResult);
            C11584e.this.f32808f = locationResult.mo20041N();
            if (C11584e.this.f32805c != null && C11584e.this.f32808f != null && C11584e.this.f32808f.getLongitude() != 0.0d) {
                C11584e.this.f32805c.mo36526b(C11584e.this.f32808f);
                if (!C11584e.this.f32809g) {
                    C11584e.this.mo39759f();
                }
            }
        }
    }

    /* renamed from: com.mrsool.utils.b0.e$b */
    /* compiled from: FusedLocationUtils */
    class C11586b implements Runnable {
        C11586b() {
        }

        public void run() {
            C11584e.this.mo39758e();
        }
    }

    /* renamed from: com.mrsool.utils.b0.e$c */
    /* compiled from: FusedLocationUtils */
    class C11587c implements C5549f {
        C11587c() {
        }

        /* renamed from: a */
        public void mo21979a(@C0193h0 Exception exc) {
            C5880q.m25751b("Error trying to get last GPS location");
            C11584e.this.mo39758e();
            C11584e.this.f32813k.removeCallbacks(C11584e.this.f32814l);
            exc.printStackTrace();
        }
    }

    /* renamed from: com.mrsool.utils.b0.e$d */
    /* compiled from: FusedLocationUtils */
    class C11588d implements C5551g<Location> {
        C11588d() {
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null && C11584e.this.f32805c != null) {
                C11584e.this.f32805c.mo36525a(location);
            } else if (location == null && C11584e.this.f32805c != null) {
                C11584e.this.mo39758e();
            }
            C11584e.this.f32813k.removeCallbacks(C11584e.this.f32814l);
        }
    }

    public C11584e(Activity activity) {
        this.f32804b = activity;
    }

    /* renamed from: g */
    private void m52212g() {
        this.f32805c.mo36532t();
    }

    /* renamed from: h */
    private void m52213h() {
        if (C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m52214i();
        } else {
            this.f32805c.mo36531s();
        }
    }

    /* renamed from: i */
    private void m52214i() {
        try {
            if (this.f32806d == null || this.f32807e == null) {
                mo39747a();
            }
            this.f32806d.mo20080a(this.f32807e);
            if (C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f32806d.mo20079a(this.f32803a, this.f32807e, Looper.myLooper());
            } else {
                this.f32805c.mo36531s();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo39759f() {
        C5124e eVar = this.f32806d;
        if (eVar != null) {
            C5138k kVar = this.f32807e;
            if (kVar != null) {
                eVar.mo20080a(kVar);
                this.f32806d = null;
                this.f32807e = null;
            }
        }
    }

    public void onSuccess(Object obj) {
        if (obj instanceof C5145n) {
            m52213h();
        } else if (obj instanceof Location) {
            Location location = (Location) obj;
            if (this.f32805c != null && location != null && location.getLongitude() != 0.0d) {
                this.f32805c.mo36526b(location);
                if (!this.f32809g) {
                    mo39759f();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo39754b(boolean z) {
        this.f32812j = z;
    }

    /* renamed from: c */
    public int mo39755c() {
        return this.f32815m;
    }

    /* renamed from: d */
    public boolean mo39757d() {
        return this.f32812j;
    }

    /* renamed from: e */
    public void mo39758e() {
        try {
            if (HomeActivity.f27251n1 != null && this.f32805c != null) {
                Location location = new Location("current");
                location.setLatitude(HomeActivity.f27251n1.mo23648p().latitude);
                location.setLongitude(HomeActivity.f27251n1.mo23648p().longitude);
                this.f32805c.mo36525a(location);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C11584e m52207a(Activity activity) {
        if (f32801n == null) {
            f32801n = new C11584e(activity);
        }
        return f32801n;
    }

    /* renamed from: b */
    public void mo39753b(int i) {
        this.f32810h = i;
    }

    /* renamed from: c */
    public void mo39756c(int i) {
        this.f32815m = i;
    }

    /* renamed from: b */
    public void mo39752b() {
        if (C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32804b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f32813k = new Handler();
            this.f32814l = new C11586b();
            this.f32813k.postDelayed(this.f32814l, 5000);
            if (this.f32806d == null) {
                mo39753b(2000);
                mo39754b(false);
                mo39751a(false);
                mo39747a();
            }
            C5124e eVar = this.f32806d;
            if (eVar != null) {
                eVar.mo20083l().mo21994a((C5551g<? super TResult>) new C11588d<Object>()).mo21993a((C5549f) new C11587c());
            }
        }
    }

    /* renamed from: a */
    public void mo39748a(int i) {
        this.f32811i = i;
    }

    /* renamed from: a */
    public void mo39750a(C11573b bVar) {
        this.f32805c = bVar;
    }

    /* renamed from: a */
    public void mo39751a(boolean z) {
        this.f32809g = z;
    }

    /* renamed from: a */
    public void mo39747a() {
        this.f32803a = LocationRequest.m22311V();
        this.f32803a.mo20037n((long) this.f32810h);
        this.f32803a.mo20033h(C11644i.f33208U6);
        this.f32803a.mo20036m((long) this.f32811i);
        if (this.f32812j) {
            this.f32803a.mo20029a((float) this.f32815m);
        }
        this.f32806d = C5142m.m22411a(this.f32804b);
        if (this.f32807e == null) {
            this.f32807e = new C11585a();
        }
        C5142m.m22415c(this.f32804b).mo20128a(new C5112a().mo20048a(this.f32803a).mo20051a()).mo21994a((C5551g<? super TResult>) this).mo21993a((C5549f) this);
    }

    /* renamed from: a */
    public void mo21979a(@C0193h0 Exception exc) {
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).mo17604a(this.f32804b, 100);
            } catch (SendIntentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(e);
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo39749a(int i, int i2, Intent intent) {
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            mo39747a();
        } else {
            m52212g();
        }
    }
}
