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
import android.os.IBinder;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0770p.C0779e;
import com.google.android.gms.maps.model.LatLng;
import com.mrsool.C10232R;
import com.mrsool.SplashActivity;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.LocationData;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p420b0.C11573b;
import com.mrsool.utils.p420b0.C11579d;
import com.mrsool.utils.webservice.C5882b;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LocationService extends Service implements C11573b {

    /* renamed from: V */
    private static LocationService f32281V;

    /* renamed from: N */
    private C5887x f32282N;

    /* renamed from: O */
    private LocationData f32283O;

    /* renamed from: P */
    private Call<DefaultBean> f32284P;

    /* renamed from: Q */
    private C11579d f32285Q;

    /* renamed from: R */
    private String f32286R = "LocationService";

    /* renamed from: S */
    private Location f32287S;

    /* renamed from: T */
    private Location f32288T;

    /* renamed from: U */
    private int f32289U;

    /* renamed from: a */
    public C5881v f32290a;

    /* renamed from: b */
    IBinder f32291b = new C11459b();

    /* renamed from: com.mrsool.socket.LocationService$a */
    class C11458a implements Callback<DefaultBean> {
        C11458a() {
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

    /* renamed from: com.mrsool.socket.LocationService$b */
    public class C11459b extends Binder {
        public C11459b() {
        }

        /* renamed from: a */
        public LocationService mo39538a() {
            return LocationService.this;
        }
    }

    /* renamed from: a */
    private double m51744a(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: b */
    private double m51749b(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: c */
    private MemoryInfo m51750c() {
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: d */
    public static LocationService m51751d() {
        return f32281V;
    }

    /* renamed from: e */
    private void m51752e() {
        Location location = this.f32287S;
        this.f32288T = location;
        this.f32290a.mo23449a(C11644i.f33303g, this.f32282N.mo23523a(location));
        this.f32290a.mo23449a(C11644i.f33312h, this.f32282N.mo23570b(this.f32287S));
        C5887x xVar = this.f32282N;
        if (xVar != null) {
            xVar.mo23473E(C11644i.f33046A4);
        }
        m51746a(this.f32287S.getLatitude(), this.f32287S.getLongitude());
    }

    /* renamed from: f */
    private void m51753f() {
        Location location = this.f32287S;
        if (location != null) {
            if (this.f32288T == null) {
                m51752e();
            } else if (!(location.getLatitude() == this.f32288T.getLatitude() && this.f32287S.getLongitude() == this.f32288T.getLongitude())) {
                if (this.f32287S.getAccuracy() <= 20.0f) {
                    this.f32289U = 0;
                    m51752e();
                } else if (this.f32289U == 1 && this.f32287S.getAccuracy() <= 50.0f) {
                    this.f32289U = 0;
                    m51752e();
                } else if (this.f32289U == 2 && this.f32287S.getAccuracy() <= 80.0f) {
                    this.f32289U = 0;
                    m51752e();
                } else if (this.f32289U == 3 && this.f32287S.getAccuracy() <= 110.0f) {
                    this.f32289U = 0;
                    m51752e();
                } else if (this.f32289U != 4 || this.f32287S.getAccuracy() > 150.0f) {
                    int i = this.f32289U;
                    if (i >= 4) {
                        this.f32289U = 0;
                    } else {
                        this.f32289U = i + 1;
                    }
                } else {
                    this.f32289U = 0;
                    m51752e();
                }
            }
        }
    }

    /* renamed from: g */
    private void m51754g() {
        try {
            startForeground(3, new C0779e(this, "my_mrsool_channel_01").mo4247e(true).mo4253g((int) C10232R.C10235drawable.icon_push_small).mo4234c((CharSequence) getResources().getString(C10232R.string.app_name)).mo4228b((CharSequence) getResources().getString(C10232R.string.msg_keep_alive_notification)).mo4204a(PendingIntent.getActivity(this, 0, new Intent(this, SplashActivity.class), 0)).mo4196a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = 26)
    /* renamed from: h */
    private void m51755h() {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, SplashActivity.class), 0);
        String str = "my_mrsool_channel_01";
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, "mrsool Location channel", 3));
        startForeground(3, new Builder(this, str).setOngoing(true).setSmallIcon(C10232R.C10235drawable.icon_push_small).setContentTitle(getResources().getString(C10232R.string.app_name)).setContentText(getResources().getString(C10232R.string.msg_keep_alive_notification)).setContentIntent(activity).build());
    }

    /* renamed from: a */
    public void mo36525a(Location location) {
    }

    /* renamed from: b */
    public void mo36526b(Location location) {
        if (this.f32282N == null) {
            this.f32282N = new C5887x(this);
        }
        if (!this.f32282N.mo23501W()) {
            super.onDestroy();
        } else if (location != null) {
            this.f32287S = location;
            m51753f();
        }
    }

    @C0195i0
    public IBinder onBind(Intent intent) {
        return this.f32291b;
    }

    public void onCreate() {
        f32281V = this;
        if (VERSION.SDK_INT >= 26) {
            m51755h();
        } else {
            m51754g();
        }
        this.f32282N = new C5887x(this);
        super.onCreate();
        this.f32285Q = C11579d.m52181a((Context) this);
        this.f32285Q.mo39736a((C11573b) this);
        this.f32285Q.mo39734a(1000);
        this.f32285Q.mo39740b(false);
        this.f32285Q.mo39737a(true);
        this.f32285Q.mo39733a();
        this.f32290a = this.f32282N.mo23468C();
    }

    public void onDestroy() {
        C5880q.m25750a("BroadcastReceiver onDestroy");
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
                m51755h();
            } else {
                m51754g();
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
            if (mo39529a()) {
                mo39530b();
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

    /* renamed from: s */
    public void mo36531s() {
    }

    /* renamed from: t */
    public void mo36532t() {
    }

    /* renamed from: a */
    public double mo39528a(LatLng latLng, LatLng latLng2) {
        return m51745a(latLng.latitude, latLng.longitude, latLng2.latitude, latLng2.longitude);
    }

    /* renamed from: a */
    private double m51745a(double d, double d2, double d3, double d4) {
        return m51749b(Math.acos((Math.sin(m51744a(d)) * Math.sin(m51744a(d3))) + (Math.cos(m51744a(d)) * Math.cos(m51744a(d3)) * Math.cos(m51744a(d2 - d4))))) * 60.0d * 1.1515d * 1000.0d;
    }

    /* renamed from: a */
    private void m51746a(double d, double d2) {
        if (this.f32282N.mo23502X()) {
            LocationData locationData = this.f32283O;
            String str = C11644i.f33443w5;
            if (locationData == null) {
                LocationData locationData2 = new LocationData(this.f32290a.mo23459f(str), String.valueOf(d), String.valueOf(d2), String.valueOf(System.currentTimeMillis()), this.f32282N.mo23476G());
                this.f32283O = locationData2;
            } else {
                locationData.setToken(this.f32290a.mo23459f(str));
                this.f32283O.setLatitude(String.valueOf(d));
                this.f32283O.setLongitude(String.valueOf(d2));
                this.f32283O.setSent_at(String.valueOf(System.currentTimeMillis()));
            }
            this.f32284P = C5882b.m25775b().pushMessage(this.f32283O);
            this.f32284P.enqueue(new C11458a());
        }
    }

    /* renamed from: b */
    public void mo39530b() {
        try {
            if (this.f32282N.mo23495Q()) {
                startForegroundService(new Intent(getApplicationContext(), LocationService.class));
            } else {
                startService(new Intent(getApplicationContext(), LocationService.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m51748a(boolean z) {
        Intent intent = new Intent(C11644i.f33118J4);
        intent.putExtra(C11644i.f33124K2, z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* renamed from: a */
    public boolean mo39529a() {
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
}
