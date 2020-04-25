package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.app.C0798u;
import androidx.core.content.C0841b;
import com.facebook.places.model.PlaceFields;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.clevertap.android.sdk.t0 */
/* compiled from: DeviceInfo */
class C3220t0 {

    /* renamed from: j */
    private static final String f11658j = "__";

    /* renamed from: k */
    private static final String f11659k = "Android";

    /* renamed from: l */
    private static ArrayList<C3145n1> f11660l = null;

    /* renamed from: m */
    private static Boolean f11661m = null;

    /* renamed from: n */
    private static Boolean f11662n = null;

    /* renamed from: o */
    private static final String f11663o = "com.google.firebase.messaging.FirebaseMessaging";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f11664a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CleverTapInstanceConfig f11665b;

    /* renamed from: c */
    private final Object f11666c = new Object();

    /* renamed from: d */
    private final Object f11667d = new Object();

    /* renamed from: e */
    private String f11668e = null;

    /* renamed from: f */
    private boolean f11669f = false;

    /* renamed from: g */
    private boolean f11670g = false;

    /* renamed from: h */
    private C3223c f11671h;

    /* renamed from: i */
    private ArrayList<C3244x1> f11672i = new ArrayList<>();

    /* renamed from: com.clevertap.android.sdk.t0$a */
    /* compiled from: DeviceInfo */
    class C3221a implements Runnable {
        C3221a() {
        }

        public void run() {
            C3220t0.this.m15541G();
        }
    }

    /* renamed from: com.clevertap.android.sdk.t0$b */
    /* compiled from: DeviceInfo */
    class C3222b implements Runnable {
        C3222b() {
        }

        public void run() {
            C3220t0.this.m15537C();
            C3220t0.this.m15538D();
            C3150p0.m15209b(C3220t0.this.f11664a, C3220t0.this.f11665b).mo12443a(C3220t0.this.mo12596h());
        }
    }

    /* renamed from: com.clevertap.android.sdk.t0$c */
    /* compiled from: DeviceInfo */
    private class C3223c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f11675a = m15593b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f11676b = m15617n();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f11677c = m15611k();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f11678d = m15614l();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f11679e = m15604g();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f11680f = m15606h();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f11681g = m15595c();
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f11682h = m15608i();
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f11683i = m15591a();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f11684j = m15597d();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f11685k = m15615m();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public double f11686l = m15601f();
        /* access modifiers changed from: private */

        /* renamed from: m */
        public double f11687m = m15619o();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f11688n = m15599e();
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f11689o = m15609j();

        C3223c() {
        }

        /* renamed from: k */
        private String m15611k() {
            return "Android";
        }

        /* renamed from: m */
        private int m15615m() {
            return C3073c.f10985e;
        }

        /* renamed from: a */
        private String m15591a() {
            if (VERSION.SDK_INT < 18 || !C3220t0.this.f11664a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                return C3220t0.this.f11664a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none";
            }
            return "ble";
        }

        /* renamed from: b */
        private int m15593b() {
            int i = 0;
            try {
                return C3220t0.this.f11664a.getPackageManager().getPackageInfo(C3220t0.this.f11664a.getPackageName(), i).versionCode;
            } catch (NameNotFoundException unused) {
                C3111h1.m14930d("Unable to get app build");
                return i;
            }
        }

        /* renamed from: c */
        private String m15595c() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C3220t0.this.f11664a.getSystemService(PlaceFields.PHONE);
                if (telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* renamed from: d */
        private String m15597d() {
            String str = "";
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C3220t0.this.f11664a.getSystemService(PlaceFields.PHONE);
                return telephonyManager != null ? telephonyManager.getSimCountryIso() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        /* renamed from: e */
        private int m15599e() {
            WindowManager windowManager = (WindowManager) C3220t0.this.f11664a.getSystemService("window");
            if (windowManager == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }

        /* renamed from: f */
        private double m15601f() {
            WindowManager windowManager = (WindowManager) C3220t0.this.f11664a.getSystemService("window");
            if (windowManager == null) {
                return 0.0d;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return m15590a((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi));
        }

        /* renamed from: g */
        private String m15604g() {
            return Build.MANUFACTURER;
        }

        /* renamed from: h */
        private String m15606h() {
            return Build.MODEL.replace(m15604g(), "");
        }

        /* renamed from: i */
        private String m15608i() {
            TelephonyManager telephonyManager = (TelephonyManager) C3220t0.this.f11664a.getSystemService(PlaceFields.PHONE);
            if (telephonyManager == null) {
                return null;
            }
            switch (telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return null;
            }
        }

        /* renamed from: j */
        private boolean m15609j() {
            return C0798u.m4641a(C3220t0.this.f11664a).mo4369a();
        }

        /* renamed from: l */
        private String m15614l() {
            return VERSION.RELEASE;
        }

        /* renamed from: n */
        private String m15617n() {
            try {
                return C3220t0.this.f11664a.getPackageManager().getPackageInfo(C3220t0.this.f11664a.getPackageName(), 0).versionName;
            } catch (NameNotFoundException unused) {
                C3111h1.m14930d("Unable to get app version");
                return null;
            }
        }

        /* renamed from: o */
        private double m15619o() {
            WindowManager windowManager = (WindowManager) C3220t0.this.f11664a.getSystemService("window");
            if (windowManager == null) {
                return 0.0d;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return m15590a((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi));
        }

        /* renamed from: a */
        private double m15590a(double d) {
            double round = (double) Math.round(d * 100.0d);
            Double.isNaN(round);
            return round / 100.0d;
        }
    }

    C3220t0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this.f11664a = context;
        this.f11665b = cleverTapInstanceConfig;
        new Thread(new C3221a()).start();
        m15555c(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return r1;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m15536B() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f11666c
            monitor-enter(r0)
            com.clevertap.android.sdk.CleverTapInstanceConfig r1 = r4.f11665b     // Catch:{ all -> 0x002f }
            boolean r1 = r1.mo12112p()     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            android.content.Context r1 = r4.f11664a     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r4.m15542H()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = com.clevertap.android.sdk.C3217s1.m15527a(r1, r3, r2)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            android.content.Context r1 = r4.f11664a     // Catch:{ all -> 0x002f }
            java.lang.String r3 = "deviceId"
            java.lang.String r1 = com.clevertap.android.sdk.C3217s1.m15527a(r1, r3, r2)     // Catch:{ all -> 0x002f }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r1
        L_0x0023:
            android.content.Context r1 = r4.f11664a     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r4.m15542H()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = com.clevertap.android.sdk.C3217s1.m15527a(r1, r3, r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r1
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3220t0.m15536B():java.lang.String");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r0 = (java.lang.String) r2.getClass().getMethod("getId", new java.lang.Class[0]).invoke(r2, new java.lang.Object[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[Catch:{ all -> 0x004c, all -> 0x0071 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058 A[SYNTHETIC, Splitter:B:26:0x0058] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m15537C() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.mo12600l()     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x00be
            boolean r0 = r7.f11670g     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x00be
            r0 = 0
            r1 = 1
            r7.f11670g = r1     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "getAdvertisingIdInfo"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x0071 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0071 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ all -> 0x0071 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0071 }
            android.content.Context r4 = r7.f11664a     // Catch:{ all -> 0x0071 }
            r3[r6] = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch:{ all -> 0x0071 }
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x0071 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x0071 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0071 }
            java.lang.Object r3 = r3.invoke(r2, r4)     // Catch:{ all -> 0x0071 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0071 }
            java.lang.Object r4 = r7.f11667d     // Catch:{ all -> 0x0071 }
            monitor-enter(r4)     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x004e
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004c:
            r1 = move-exception
            goto L_0x006f
        L_0x004e:
            r1 = 0
        L_0x004f:
            r7.f11669f = r1     // Catch:{ all -> 0x004c }
            boolean r1 = r7.f11669f     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0058
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "getId"
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x0071 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch:{ all -> 0x0071 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            r0 = r1
            goto L_0x009f
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            com.clevertap.android.sdk.h1 r2 = r7.m15540F()     // Catch:{ all -> 0x00c0 }
            com.clevertap.android.sdk.CleverTapInstanceConfig r3 = r7.f11665b     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = r3.mo12093a()     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r4.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "Failed to get Advertising ID: "
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00c0 }
            r4.append(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c0 }
            r4.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c0 }
            r2.mo12315c(r3, r1)     // Catch:{ all -> 0x00c0 }
        L_0x009f:
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x00c0 }
            int r1 = r1.length()     // Catch:{ all -> 0x00c0 }
            r2 = 2
            if (r1 <= r2) goto L_0x00be
            java.lang.Object r1 = r7.f11667d     // Catch:{ all -> 0x00c0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "-"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ all -> 0x00bb }
            r7.f11668e = r0     // Catch:{ all -> 0x00bb }
            monitor-exit(r1)     // Catch:{ all -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00be:
            monitor-exit(r7)
            return
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3220t0.m15537C():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public synchronized void m15538D() {
        String str;
        String E;
        String l = mo12600l();
        if (l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("__g");
            sb.append(l);
            str = sb.toString();
        } else {
            synchronized (this.f11666c) {
                E = m15539E();
            }
            str = E;
        }
        mo12590b(str);
    }

    /* renamed from: E */
    private String m15539E() {
        StringBuilder sb = new StringBuilder();
        sb.append(f11658j);
        sb.append(UUID.randomUUID().toString().replace("-", ""));
        return sb.toString();
    }

    /* renamed from: F */
    private C3111h1 m15540F() {
        return this.f11665b.mo12108l();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public C3223c m15541G() {
        if (this.f11671h == null) {
            this.f11671h = new C3223c();
        }
        return this.f11671h;
    }

    /* renamed from: H */
    private String m15542H() {
        StringBuilder sb = new StringBuilder();
        sb.append("deviceId:");
        sb.append(this.f11665b.mo12093a());
        return sb.toString();
    }

    /* renamed from: I */
    private String m15543I() {
        return C3217s1.m15527a(this.f11664a, m15544J(), (String) null);
    }

    /* renamed from: J */
    private String m15544J() {
        StringBuilder sb = new StringBuilder();
        sb.append("fallbackId:");
        sb.append(this.f11665b.mo12093a());
        return sb.toString();
    }

    /* renamed from: K */
    private boolean m15545K() {
        if (f11661m == null) {
            try {
                Class.forName("com.google.firebase.messaging.a");
                f11661m = Boolean.valueOf(true);
                m15540F().mo12314c("FCM installed");
            } catch (ClassNotFoundException unused) {
                f11661m = Boolean.valueOf(false);
                C3111h1.m14930d("FCM unavailable, will be unable to request FCM token");
            }
        }
        return f11661m.booleanValue();
    }

    /* renamed from: L */
    private boolean m15546L() {
        if (mo12599k() == null) {
            C3111h1.m14930d("GCM Sender ID unknown, will be unable to request GCM token");
            return false;
        } else if (m15547M().booleanValue()) {
            return true;
        } else {
            C3111h1.m14930d("Google Play Services unavailable, will be unable to request GCM token");
            return false;
        }
    }

    /* renamed from: M */
    private Boolean m15547M() {
        if (f11662n == null) {
            try {
                Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
                f11662n = Boolean.valueOf(true);
                C3111h1.m14930d("Google Play services available");
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error checking for Google Play Services: ");
                sb.append(th.getMessage());
                C3111h1.m14938f(sb.toString());
                f11662n = Boolean.valueOf(false);
            }
        }
        return f11662n;
    }

    /* renamed from: N */
    private void m15548N() {
        C3217s1.m15531b(this.f11664a, m15542H());
    }

    /* renamed from: O */
    private synchronized void m15549O() {
        if (m15543I() == null) {
            synchronized (this.f11666c) {
                StringBuilder sb = new StringBuilder();
                sb.append("__i");
                sb.append(UUID.randomUUID().toString().replace("-", ""));
                String sb2 = sb.toString();
                if (sb2.trim().length() > 2) {
                    m15559e(sb2);
                } else {
                    m15540F().mo12315c(this.f11665b.mo12093a(), "Unable to generate fallback error device ID");
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public Boolean mo12585A() {
        if (this.f11664a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11664a.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean z = true;
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public String mo12594f() {
        return m15541G().f11684j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo12595g() {
        return m15541G().f11688n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo12596h() {
        return m15536B() != null ? m15536B() : m15543I();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public ArrayList<C3145n1> mo12597i() {
        if (f11660l == null) {
            f11660l = new ArrayList<>();
            boolean K = m15545K();
            if (K) {
                f11660l.add(C3145n1.FCM);
            }
            if (!K && m15546L()) {
                f11660l.add(C3145n1.GCM);
            }
        }
        return f11660l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo12598j() {
        return C3115i1.m14962a(this.f11664a).mo12323e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public String mo12599k() {
        return C3115i1.m14962a(this.f11664a).mo12324f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public String mo12600l() {
        String str;
        synchronized (this.f11667d) {
            str = this.f11668e;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public double mo12601m() {
        return m15541G().f11686l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public String mo12602n() {
        return m15541G().f11679e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public String mo12603o() {
        return m15541G().f11680f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public String mo12604p() {
        return m15541G().f11682h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo12605q() {
        return m15541G().f11689o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public String mo12606r() {
        return m15541G().f11677c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public String mo12607s() {
        return m15541G().f11678d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public int mo12608t() {
        return m15541G().f11685k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public ArrayList<C3244x1> mo12609u() {
        ArrayList<C3244x1> arrayList = (ArrayList) this.f11672i.clone();
        this.f11672i.clear();
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public String mo12610v() {
        return m15541G().f11676b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public double mo12611w() {
        return m15541G().f11687m;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: x */
    public Boolean mo12612x() {
        try {
            if (this.f11664a.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.f11664a.getPackageName()) != 0) {
                return null;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return Boolean.valueOf(defaultAdapter.isEnabled());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public boolean mo12613y() {
        return mo12596h() != null && mo12596h().startsWith("__i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public boolean mo12614z() {
        boolean z;
        synchronized (this.f11667d) {
            z = this.f11669f;
        }
        return z;
    }

    /* renamed from: c */
    private void m15555c(String str) {
        if (this.f11665b.mo12106j()) {
            if (str == null) {
                String str2 = "CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml/Instance Configuration. CleverTap SDK will create a fallback device ID";
                this.f11665b.mo12108l().mo12310b(str2);
                m15557d(str2);
            }
        } else if (str != null) {
            String str3 = "CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml. Custom CleverTap ID passed will not be used.";
            this.f11665b.mo12108l().mo12310b(str3);
            m15557d(str3);
        }
        String B = m15536B();
        if (B != null && B.trim().length() > 2) {
            m15540F().mo12315c(this.f11665b.mo12093a(), "CleverTap ID already present for profile");
            if (str != null) {
                C3111h1 F = m15540F();
                String a = this.f11665b.mo12093a();
                StringBuilder sb = new StringBuilder();
                String str4 = "CleverTap ID - ";
                sb.append(str4);
                sb.append(B);
                String str5 = " already exists. Unable to set custom CleverTap ID - ";
                sb.append(str5);
                sb.append(str);
                F.mo12311b(a, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(B);
                sb2.append(str5);
                sb2.append(str);
                m15557d(sb2.toString());
            }
        } else if (this.f11665b.mo12106j()) {
            mo12587a(str);
        } else if (!this.f11665b.mo12116t()) {
            m15538D();
        } else {
            new Thread(new C3222b()).start();
        }
    }

    /* renamed from: d */
    private void m15557d(String str) {
        C3244x1 x1Var = new C3244x1();
        x1Var.mo12656a(514);
        x1Var.mo12658a(str);
        this.f11672i.add(x1Var);
    }

    /* renamed from: e */
    private void m15559e(String str) {
        C3111h1 F = m15540F();
        String a = this.f11665b.mo12093a();
        StringBuilder sb = new StringBuilder();
        sb.append("Updating the fallback id - ");
        sb.append(str);
        F.mo12315c(a, sb.toString());
        C3217s1.m15534b(this.f11664a, m15544J(), str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12587a(String str) {
        if (C3238w1.m15666c(str)) {
            C3111h1 F = m15540F();
            String a = this.f11665b.mo12093a();
            StringBuilder sb = new StringBuilder();
            sb.append("Setting CleverTap ID to custom CleverTap ID : ");
            sb.append(str);
            F.mo12311b(a, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("__h");
            sb2.append(str);
            mo12590b(sb2.toString());
            return;
        }
        m15549O();
        m15548N();
        C3111h1 F2 = m15540F();
        String a2 = this.f11665b.mo12093a();
        StringBuilder sb3 = new StringBuilder();
        String str2 = "Attempted to set invalid custom CleverTap ID - ";
        sb3.append(str2);
        sb3.append(str);
        String str3 = ", falling back to default error CleverTap ID - ";
        sb3.append(str3);
        sb3.append(m15543I());
        F2.mo12311b(a2, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(str);
        sb4.append(str3);
        sb4.append(m15543I());
        m15557d(sb4.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo12589b() {
        return mo12596h();
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public void mo12590b(String str) {
        C3111h1 F = m15540F();
        String a = this.f11665b.mo12093a();
        StringBuilder sb = new StringBuilder();
        sb.append("Force updating the device ID to ");
        sb.append(str);
        F.mo12315c(a, sb.toString());
        synchronized (this.f11666c) {
            C3217s1.m15534b(this.f11664a, m15542H(), str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo12593e() {
        return m15541G().f11681g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo12592d() {
        return m15541G().f11675a;
    }

    /* renamed from: b */
    static boolean m15553b(Context context, String str) {
        try {
            return C0841b.m4916a(context, str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12586a() {
        mo12590b(m15539E());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12588a(Context context, String str) {
        this.f11664a = context;
        return m15553b(context, str);
    }

    /* renamed from: a */
    static int m15550a(Context context) {
        return context.getApplicationInfo().icon;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo12591c() {
        return m15541G().f11683i;
    }
}
