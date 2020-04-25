package com.mrsool.utils.p420b0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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

/* renamed from: com.mrsool.utils.b0.d */
/* compiled from: FusedLocationTrackingUtils */
public class C11579d implements C5551g, C5549f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: n */
    private static C11579d f32782n = null;

    /* renamed from: o */
    private static final int f32783o = 100;

    /* renamed from: a */
    private LocationRequest f32784a;

    /* renamed from: b */
    private Context f32785b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11573b f32786c;

    /* renamed from: d */
    private C5124e f32787d;

    /* renamed from: e */
    private C5138k f32788e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Location f32789f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f32790g = false;

    /* renamed from: h */
    private int f32791h = 1000;

    /* renamed from: i */
    private boolean f32792i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f32793j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Runnable f32794k;

    /* renamed from: l */
    private int f32795l;

    /* renamed from: m */
    private C11584e f32796m;

    /* renamed from: com.mrsool.utils.b0.d$a */
    /* compiled from: FusedLocationTrackingUtils */
    class C11580a extends C5138k {
        C11580a() {
        }

        /* renamed from: a */
        public void mo20112a(LocationResult locationResult) {
            super.mo20112a(locationResult);
            C11579d.this.f32789f = locationResult.mo20041N();
            if (C11579d.this.f32786c != null && C11579d.this.f32789f != null && C11579d.this.f32789f.getLongitude() != 0.0d) {
                C11579d.this.f32786c.mo36526b(C11579d.this.f32789f);
                if (!C11579d.this.f32790g) {
                    C11579d.this.mo39744f();
                }
            }
        }
    }

    /* renamed from: com.mrsool.utils.b0.d$b */
    /* compiled from: FusedLocationTrackingUtils */
    class C11581b implements Runnable {
        C11581b() {
        }

        public void run() {
            C11579d.this.mo39743e();
        }
    }

    /* renamed from: com.mrsool.utils.b0.d$c */
    /* compiled from: FusedLocationTrackingUtils */
    class C11582c implements C5549f {
        C11582c() {
        }

        /* renamed from: a */
        public void mo21979a(@C0193h0 Exception exc) {
            C5880q.m25751b("Error trying to get last GPS location");
            C11579d.this.mo39743e();
            C11579d.this.f32793j.removeCallbacks(C11579d.this.f32794k);
            exc.printStackTrace();
        }
    }

    /* renamed from: com.mrsool.utils.b0.d$d */
    /* compiled from: FusedLocationTrackingUtils */
    class C11583d implements C5551g<Location> {
        C11583d() {
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null && C11579d.this.f32786c != null) {
                C11579d.this.f32786c.mo36525a(location);
            } else if (location == null && C11579d.this.f32786c != null) {
                C11579d.this.mo39743e();
            }
            C11579d.this.f32793j.removeCallbacks(C11579d.this.f32794k);
        }
    }

    public C11579d(Context context) {
        this.f32785b = context;
    }

    /* renamed from: g */
    private void m52186g() {
        this.f32786c.mo36532t();
    }

    /* renamed from: h */
    private void m52187h() {
        if (C0841b.m4916a(this.f32785b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a(this.f32785b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m52188i();
        } else {
            this.f32786c.mo36531s();
        }
    }

    /* renamed from: i */
    private void m52188i() {
        try {
            if (this.f32787d == null || this.f32788e == null) {
                mo39733a();
            }
            this.f32787d.mo20080a(this.f32788e);
            if (C0841b.m4916a(this.f32785b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a(this.f32785b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f32787d.mo20079a(this.f32784a, this.f32788e, Looper.myLooper());
            } else {
                this.f32786c.mo36531s();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo39744f() {
        C5124e eVar = this.f32787d;
        if (eVar != null) {
            C5138k kVar = this.f32788e;
            if (kVar != null) {
                eVar.mo20080a(kVar);
                this.f32787d = null;
                this.f32788e = null;
            }
        }
    }

    public void onSuccess(Object obj) {
        if (obj instanceof C5145n) {
            m52187h();
        } else if (obj instanceof Location) {
            Location location = (Location) obj;
            if (this.f32786c != null && location != null && location.getLongitude() != 0.0d) {
                this.f32786c.mo36526b(location);
                if (!this.f32790g) {
                    mo39744f();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo39740b(boolean z) {
        this.f32792i = z;
    }

    /* renamed from: c */
    public int mo39741c() {
        return this.f32795l;
    }

    /* renamed from: d */
    public boolean mo39742d() {
        return this.f32792i;
    }

    /* renamed from: e */
    public void mo39743e() {
        try {
            if (HomeActivity.f27251n1 != null && this.f32786c != null) {
                Location location = new Location("current");
                location.setLatitude(HomeActivity.f27251n1.mo23648p().latitude);
                location.setLongitude(HomeActivity.f27251n1.mo23648p().longitude);
                this.f32786c.mo36525a(location);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C11579d m52181a(Context context) {
        if (f32782n == null) {
            f32782n = new C11579d(context);
        }
        return f32782n;
    }

    /* renamed from: b */
    public void mo39738b() {
        if (C0841b.m4916a(this.f32785b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a(this.f32785b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f32793j = new Handler();
            this.f32794k = new C11581b();
            this.f32793j.postDelayed(this.f32794k, 5000);
            if (this.f32787d == null) {
                mo39734a(2000);
                mo39740b(false);
                mo39737a(false);
                mo39733a();
            }
            C5124e eVar = this.f32787d;
            if (eVar != null) {
                eVar.mo20083l().mo21994a((C5551g<? super TResult>) new C11583d<Object>()).mo21993a((C5549f) new C11582c());
            }
        }
    }

    /* renamed from: a */
    public void mo39734a(int i) {
        this.f32791h = i;
    }

    /* renamed from: a */
    public void mo39736a(C11573b bVar) {
        this.f32786c = bVar;
    }

    /* renamed from: a */
    public void mo39737a(boolean z) {
        this.f32790g = z;
    }

    /* renamed from: a */
    public void mo39733a() {
        this.f32784a = LocationRequest.m22311V();
        this.f32784a.mo20037n((long) (C11644i.f33421u * 1000));
        this.f32784a.mo20033h(100);
        this.f32784a.mo20036m((long) (C11644i.f33421u * 1000));
        this.f32784a.mo20029a((float) C11644i.f33429v);
        this.f32787d = C5142m.m22412a(this.f32785b);
        if (this.f32788e == null) {
            this.f32788e = new C11580a();
        }
        C5142m.m22416c(this.f32785b).mo20128a(new C5112a().mo20048a(this.f32784a).mo20051a()).mo21994a((C5551g<? super TResult>) this).mo21993a((C5549f) this);
    }

    /* renamed from: b */
    public void mo39739b(int i) {
        this.f32795l = i;
    }

    /* renamed from: a */
    public void mo21979a(@C0193h0 Exception exc) {
        if (exc instanceof ResolvableApiException) {
            mo39733a();
        }
    }

    /* renamed from: a */
    public void mo39735a(int i, int i2, Intent intent) {
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            mo39733a();
        } else {
            m52186g();
        }
    }
}
