package com.mrsool.socket;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0770p.C0779e;
import androidx.core.content.C0841b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4086i.C4087a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.C5142m;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.mrsool.C10232R;
import com.mrsool.SplashActivity;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.LocationData;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.p423v.C11718b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.socket.b */
/* compiled from: LocationServiceOld */
public class C11464b extends Service implements C4088b {

    /* renamed from: U */
    private static C11464b f32294U;

    /* renamed from: N */
    IBinder f32295N = new C11467c();

    /* renamed from: O */
    private C5887x f32296O;

    /* renamed from: P */
    private LocationData f32297P;

    /* renamed from: Q */
    private Call<DefaultBean> f32298Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Location f32299R;

    /* renamed from: S */
    private Location f32300S;

    /* renamed from: T */
    private int f32301T;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4086i f32302a;

    /* renamed from: b */
    public C5881v f32303b;

    /* renamed from: com.mrsool.socket.b$a */
    /* compiled from: LocationServiceOld */
    class C11465a implements C5140l {
        C11465a() {
        }

        public void onLocationChanged(Location location) {
            if (!C11464b.this.f32303b.mo23450a(C11644i.f33222W4) && !C11464b.this.f32303b.mo23450a(C11644i.f33206U4) && !C11464b.this.f32303b.mo23450a(C11644i.f33214V4)) {
                C11464b.this.f32302a.mo17715d();
                C11464b.super.onDestroy();
            } else if (location != null) {
                C11464b.this.f32299R = location;
                C11464b.this.m51781g();
            }
        }
    }

    /* renamed from: com.mrsool.socket.b$b */
    /* compiled from: LocationServiceOld */
    class C11466b implements Callback<DefaultBean> {
        C11466b() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5880q.m25751b("onFailure");
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (!response.isSuccessful()) {
                C5880q.m25751b("Something is wrong");
            } else if (((DefaultBean) response.body()).getCode().intValue() < 300) {
                C5880q.m25751b("Data sent successfully...");
            }
        }
    }

    /* renamed from: com.mrsool.socket.b$c */
    /* compiled from: LocationServiceOld */
    public class C11467c extends Binder {
        public C11467c() {
        }

        /* renamed from: a */
        public C11464b mo39551a() {
            return C11464b.this;
        }
    }

    /* renamed from: a */
    private double m51769a(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: b */
    private double m51775b(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: d */
    private MemoryInfo m51778d() {
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: e */
    public static C11464b m51779e() {
        return f32294U;
    }

    /* renamed from: f */
    private void m51780f() {
        Location location = this.f32299R;
        this.f32300S = location;
        this.f32303b.mo23449a(C11644i.f33303g, this.f32296O.mo23523a(location));
        this.f32303b.mo23449a(C11644i.f33312h, this.f32296O.mo23570b(this.f32299R));
        C5887x xVar = this.f32296O;
        if (xVar != null) {
            xVar.mo23473E(C11644i.f33046A4);
        }
        m51772a(this.f32299R.getLatitude(), this.f32299R.getLongitude());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m51781g() {
        Location location = this.f32299R;
        if (location != null) {
            if (this.f32300S == null) {
                m51780f();
            } else if (!(location.getLatitude() == this.f32300S.getLatitude() && this.f32299R.getLongitude() == this.f32300S.getLongitude())) {
                if (this.f32299R.getAccuracy() <= 20.0f) {
                    this.f32301T = 0;
                    m51780f();
                } else if (this.f32301T == 1 && this.f32299R.getAccuracy() <= 50.0f) {
                    this.f32301T = 0;
                    m51780f();
                } else if (this.f32301T == 2 && this.f32299R.getAccuracy() <= 80.0f) {
                    this.f32301T = 0;
                    m51780f();
                } else if (this.f32301T == 3 && this.f32299R.getAccuracy() <= 110.0f) {
                    this.f32301T = 0;
                    m51780f();
                } else if (this.f32301T != 4 || this.f32299R.getAccuracy() > 150.0f) {
                    int i = this.f32301T;
                    if (i >= 4) {
                        this.f32301T = 0;
                    } else {
                        this.f32301T = i + 1;
                    }
                } else {
                    this.f32301T = 0;
                    m51780f();
                }
            }
        }
    }

    /* renamed from: h */
    private void m51782h() {
        try {
            startForeground(1, new C0779e(this, "").mo4247e(true).mo4253g((int) C10232R.C10235drawable.icon_push_small).mo4234c((CharSequence) C11718b.f33909a).mo4228b((CharSequence) "Tracking is live!").mo4204a(PendingIntent.getActivity(this, 0, new Intent(this, SplashActivity.class), 0)).mo4196a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = 26)
    /* renamed from: i */
    private void m51783i() {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, SplashActivity.class), 0);
        String str = "my_mrsool_channel_01";
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, "mrsool Location channel", 3));
        startForeground(1, new Builder(this, str).setOngoing(true).setSmallIcon(C10232R.C10235drawable.icon_push_small).setContentTitle(C11718b.f33909a).setContentText("Tracking is live!").setContentIntent(activity).build());
    }

    /* renamed from: n */
    public void mo17778n(int i) {
        C5880q.m25751b("LocationService onConnectionSuspended");
    }

    @C0195i0
    public IBinder onBind(Intent intent) {
        return this.f32295N;
    }

    public void onCreate() {
        f32294U = this;
        if (VERSION.SDK_INT >= 26) {
            m51783i();
        } else {
            m51782h();
        }
        this.f32296O = new C5887x(this);
        super.onCreate();
        this.f32302a = new C4087a(this).mo17732a((C4088b) this).mo17728a(C5142m.f14784c).mo17736a();
        this.f32303b = this.f32296O.mo23468C();
        this.f32302a.mo17711c();
    }

    public void onDestroy() {
        C5880q.m25750a("BroadcastReceiver onDestroy");
        this.f32302a.mo17715d();
        stopSelf();
        super.onDestroy();
    }

    public void onLowMemory() {
        C5880q.m25751b("LocationService : onLowMemory()");
        super.onLowMemory();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            if (VERSION.SDK_INT >= 26) {
                m51783i();
            } else {
                m51782h();
            }
        } catch (Exception unused) {
        }
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        C5880q.m25751b("LocationService : onTaskRemoved()");
        super.onTaskRemoved(intent);
    }

    public void onTrimMemory(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationService : onTrimMemory() =>");
        sb.append(i);
        C5880q.m25751b(sb.toString());
        super.onTrimMemory(i);
        if (i == 5) {
            C5880q.m25751b("TRIM_MEMORY_RUNNING_MODERATE");
        } else if (i == 10) {
            C5880q.m25751b("TRIM_MEMORY_RUNNING_LOW");
        } else if (i == 15) {
            if (mo39542b()) {
                mo39543c();
            }
            C5880q.m25751b("TRIM_MEMORY_RUNNING_CRITICAL");
        } else if (i == 20) {
            C5880q.m25751b("TRIM_MEMORY_UI_HIDDEN");
        } else if (i == 40) {
            C5880q.m25751b("TRIM_MEMORY_BACKGROUND");
        } else if (i == 60) {
            C5880q.m25751b("TRIM_MEMORY_MODERATE");
        } else if (i == 80) {
            C5880q.m25751b("TRIM_MEMORY_COMPLETE");
        }
    }

    /* renamed from: b */
    public boolean mo39542b() {
        int i = 0;
        while (i < C11644i.f33056B6.size()) {
            try {
                if (((MyOrdersActive) C11644i.f33056B6.get(i)).isTrack_order()) {
                    return true;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo39543c() {
        try {
            if (this.f32296O.mo23495Q()) {
                startForegroundService(new Intent(getApplicationContext(), C11464b.class));
            } else {
                startService(new Intent(getApplicationContext(), C11464b.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo39541a() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationRequest V = LocationRequest.m22311V();
            V.mo20033h(100);
            V.mo20029a((float) C11644i.f33429v);
            V.mo20037n((long) (C11644i.f33421u * 1000));
            V.mo20036m((long) (C11644i.f33421u * 1000));
            C5142m.f14785d.mo18780a(this.f32302a, V, (C5140l) new C11465a());
        }
    }

    /* renamed from: a */
    public double mo39540a(LatLng latLng, LatLng latLng2) {
        return m51770a(latLng.latitude, latLng.longitude, latLng2.latitude, latLng2.longitude);
    }

    /* renamed from: a */
    private double m51770a(double d, double d2, double d3, double d4) {
        return m51775b(Math.acos((Math.sin(m51769a(d)) * Math.sin(m51769a(d3))) + (Math.cos(m51769a(d)) * Math.cos(m51769a(d3)) * Math.cos(m51769a(d2 - d4))))) * 60.0d * 1.1515d * 1000.0d;
    }

    /* renamed from: i */
    public void mo17777i(@C0195i0 Bundle bundle) {
        C5880q.m25751b("LocationService onConnected");
        mo39541a();
    }

    /* renamed from: a */
    private void m51772a(double d, double d2) {
        if (this.f32296O.mo23502X()) {
            LocationData locationData = this.f32297P;
            String str = C11644i.f33443w5;
            if (locationData == null) {
                LocationData locationData2 = new LocationData(this.f32303b.mo23459f(str), String.valueOf(d), String.valueOf(d2), String.valueOf(System.currentTimeMillis()), this.f32296O.mo23476G());
                this.f32297P = locationData2;
            } else {
                locationData.setToken(this.f32303b.mo23459f(str));
                this.f32297P.setLatitude(String.valueOf(d));
                this.f32297P.setLongitude(String.valueOf(d2));
                this.f32297P.setSent_at(String.valueOf(System.currentTimeMillis()));
            }
            this.f32298Q = C5882b.m25775b().pushMessage(this.f32297P);
            this.f32298Q.enqueue(new C11466b());
        }
    }

    /* renamed from: a */
    private void m51774a(boolean z) {
        Intent intent = new Intent(C11644i.f33118J4);
        intent.putExtra(C11644i.f33124K2, z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }
}
