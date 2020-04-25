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

/* renamed from: com.mrsool.utils.b0.c */
/* compiled from: FusedLocationChatUtils */
public class C11574c implements C5551g, C5549f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: m */
    private static C11574c f32764m = null;

    /* renamed from: n */
    private static final int f32765n = 100;

    /* renamed from: a */
    private LocationRequest f32766a;

    /* renamed from: b */
    private Activity f32767b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11573b f32768c;

    /* renamed from: d */
    private C5124e f32769d;

    /* renamed from: e */
    private C5138k f32770e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Location f32771f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f32772g = false;

    /* renamed from: h */
    private int f32773h = 1000;

    /* renamed from: i */
    private boolean f32774i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f32775j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Runnable f32776k;

    /* renamed from: l */
    private int f32777l;

    /* renamed from: com.mrsool.utils.b0.c$a */
    /* compiled from: FusedLocationChatUtils */
    class C11575a extends C5138k {
        C11575a() {
        }

        /* renamed from: a */
        public void mo20112a(LocationResult locationResult) {
            super.mo20112a(locationResult);
            C11574c.this.f32771f = locationResult.mo20041N();
            if (C11574c.this.f32768c != null && C11574c.this.f32771f != null && C11574c.this.f32771f.getLongitude() != 0.0d) {
                C11574c.this.f32768c.mo36526b(C11574c.this.f32771f);
                if (!C11574c.this.f32772g) {
                    C11574c.this.mo39730f();
                }
            }
        }
    }

    /* renamed from: com.mrsool.utils.b0.c$b */
    /* compiled from: FusedLocationChatUtils */
    class C11576b implements Runnable {
        C11576b() {
        }

        public void run() {
            C11574c.this.mo39729e();
        }
    }

    /* renamed from: com.mrsool.utils.b0.c$c */
    /* compiled from: FusedLocationChatUtils */
    class C11577c implements C5549f {
        C11577c() {
        }

        /* renamed from: a */
        public void mo21979a(@C0193h0 Exception exc) {
            C5880q.m25751b("Error trying to get last GPS location");
            C11574c.this.mo39729e();
            C11574c.this.f32775j.removeCallbacks(C11574c.this.f32776k);
            exc.printStackTrace();
        }
    }

    /* renamed from: com.mrsool.utils.b0.c$d */
    /* compiled from: FusedLocationChatUtils */
    class C11578d implements C5551g<Location> {
        C11578d() {
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null && C11574c.this.f32768c != null) {
                C11574c.this.f32768c.mo36525a(location);
            } else if (location == null && C11574c.this.f32768c != null) {
                C11574c.this.mo39729e();
            }
            C11574c.this.f32775j.removeCallbacks(C11574c.this.f32776k);
        }
    }

    public C11574c(Activity activity) {
        this.f32767b = activity;
    }

    /* renamed from: g */
    private void m52160g() {
        this.f32768c.mo36532t();
    }

    /* renamed from: h */
    private void m52161h() {
        if (C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            m52162i();
        } else {
            this.f32768c.mo36531s();
        }
    }

    /* renamed from: i */
    private void m52162i() {
        try {
            if (this.f32769d == null || this.f32770e == null) {
                mo39719a();
            }
            this.f32769d.mo20080a(this.f32770e);
            if (C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f32769d.mo20079a(this.f32766a, this.f32770e, Looper.myLooper());
            } else {
                this.f32768c.mo36531s();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public void mo39730f() {
        C5124e eVar = this.f32769d;
        if (eVar != null) {
            C5138k kVar = this.f32770e;
            if (kVar != null) {
                eVar.mo20080a(kVar);
                this.f32769d = null;
                this.f32770e = null;
            }
        }
    }

    public void onSuccess(Object obj) {
        if (obj instanceof C5145n) {
            m52161h();
        } else if (obj instanceof Location) {
            Location location = (Location) obj;
            if (this.f32768c != null && location != null && location.getLongitude() != 0.0d) {
                this.f32768c.mo36526b(location);
                if (!this.f32772g) {
                    mo39730f();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo39726b(boolean z) {
        this.f32774i = z;
    }

    /* renamed from: c */
    public int mo39727c() {
        return this.f32777l;
    }

    /* renamed from: d */
    public boolean mo39728d() {
        return this.f32774i;
    }

    /* renamed from: e */
    public void mo39729e() {
        try {
            if (HomeActivity.f27251n1 != null && this.f32768c != null) {
                Location location = new Location("current");
                location.setLatitude(HomeActivity.f27251n1.mo23648p().latitude);
                location.setLongitude(HomeActivity.f27251n1.mo23648p().longitude);
                this.f32768c.mo36525a(location);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C11574c m52155a(Activity activity) {
        if (f32764m == null) {
            f32764m = new C11574c(activity);
        }
        return f32764m;
    }

    /* renamed from: b */
    public void mo39724b() {
        if (C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this.f32767b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f32775j = new Handler();
            this.f32776k = new C11576b();
            this.f32775j.postDelayed(this.f32776k, 5000);
            if (this.f32769d == null) {
                mo39720a(2000);
                mo39726b(false);
                mo39723a(false);
                mo39719a();
            }
            C5124e eVar = this.f32769d;
            if (eVar != null) {
                eVar.mo20083l().mo21994a((C5551g<? super TResult>) new C11578d<Object>()).mo21993a((C5549f) new C11577c());
            }
        }
    }

    /* renamed from: a */
    public void mo39720a(int i) {
        this.f32773h = i;
    }

    /* renamed from: a */
    public void mo39722a(C11573b bVar) {
        this.f32768c = bVar;
    }

    /* renamed from: a */
    public void mo39723a(boolean z) {
        this.f32772g = z;
    }

    /* renamed from: a */
    public void mo39719a() {
        this.f32766a = LocationRequest.m22311V();
        this.f32766a.mo20037n((long) this.f32773h);
        this.f32766a.mo20033h(C11644i.f33208U6);
        this.f32766a.mo20036m((long) this.f32773h);
        if (this.f32774i) {
            this.f32766a.mo20029a(10.0f);
        }
        this.f32769d = C5142m.m22411a(this.f32767b);
        if (this.f32770e == null) {
            this.f32770e = new C11575a();
        }
        C5142m.m22415c(this.f32767b).mo20128a(new C5112a().mo20048a(this.f32766a).mo20051a()).mo21994a((C5551g<? super TResult>) this).mo21993a((C5549f) this);
    }

    /* renamed from: b */
    public void mo39725b(int i) {
        this.f32777l = i;
    }

    /* renamed from: a */
    public void mo21979a(@C0193h0 Exception exc) {
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).mo17604a(this.f32767b, 100);
            } catch (SendIntentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(e);
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo39721a(int i, int i2, Intent intent) {
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            mo39719a();
        } else {
            m52160g();
        }
    }
}
