package p212io.branch.referral;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.branch.referral.q0 */
/* compiled from: SystemObserver */
class C14161q0 {

    /* renamed from: d */
    public static final String f41678d = "bnc_no_value";

    /* renamed from: e */
    private static final int f41679e = 1500;

    /* renamed from: f */
    static String f41680f;

    /* renamed from: a */
    int f41681a = 0;

    /* renamed from: b */
    private Context f41682b;

    /* renamed from: c */
    private boolean f41683c;

    /* renamed from: io.branch.referral.q0$a */
    /* compiled from: SystemObserver */
    interface C6034a {
        /* renamed from: b */
        void mo24793b();
    }

    /* renamed from: io.branch.referral.q0$b */
    /* compiled from: SystemObserver */
    private class C14162b extends C14126f<Void, Void, Void> {

        /* renamed from: a */
        private final C6034a f41684a;

        /* renamed from: io.branch.referral.q0$b$a */
        /* compiled from: SystemObserver */
        class C14163a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CountDownLatch f41686a;

            C14163a(CountDownLatch countDownLatch) {
                this.f41686a = countDownLatch;
            }

            public void run() {
                Process.setThreadPriority(-19);
                Object a = C14161q0.this.m61277m();
                C14161q0.this.m61274a(a);
                C14161q0.this.m61276b(a);
                this.f41686a.countDown();
            }
        }

        public C14162b(C6034a aVar) {
            this.f41684a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new C14163a(countDownLatch)).start();
            try {
                countDownLatch.await(1500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            C6034a aVar = this.f41684a;
            if (aVar != null) {
                aVar.mo24793b();
            }
        }
    }

    C14161q0(Context context) {
        this.f41682b = context;
        this.f41683c = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Object m61277m() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f41682b});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    static String m61278n() {
        String str = "";
        try {
            for (NetworkInterface inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo44745c() {
        return Locale.getDefault() != null ? Locale.getDefault().getLanguage() : "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo44746d() {
        return "Android";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo44747e() {
        return VERSION.SDK_INT;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public String mo44748f() {
        try {
            return this.f41682b.getPackageManager().getPackageInfo(this.f41682b.getPackageName(), 0).packageName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo44749g() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo44750h() {
        return Build.MODEL;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public DisplayMetrics mo44751i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f41682b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo44752j() {
        String str = "UI_MODE_TYPE_UNDEFINED";
        switch (((UiModeManager) this.f41682b.getSystemService("uimode")).getCurrentModeType()) {
            case 1:
                return "UI_MODE_TYPE_NORMAL";
            case 2:
                return "UI_MODE_TYPE_DESK";
            case 3:
                return "UI_MODE_TYPE_CAR";
            case 4:
                return "UI_MODE_TYPE_TELEVISION";
            case 5:
                return "UI_MODE_TYPE_APPLIANCE";
            case 6:
                return "UI_MODE_TYPE_WATCH";
            default:
                return str;
        }
    }

    /* renamed from: k */
    public boolean mo44753k() {
        if (this.f41682b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        NetworkInfo networkInfo = ((ConnectivityManager) this.f41682b.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo44754l() {
        return this.f41683c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo44744b() {
        return Locale.getDefault() != null ? Locale.getDefault().getCountry() : "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo44742a(boolean z) {
        Context context = this.f41682b;
        if (context == null) {
            return "bnc_no_value";
        }
        String str = null;
        if (!z && !C6009d.f17238l0) {
            str = Secure.getString(context.getContentResolver(), "android_id");
        }
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.f41683c = false;
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m61276b(Object obj) {
        try {
            int i = 0;
            if (((Boolean) obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                i = 1;
            }
            this.f41681a = i;
        } catch (Exception unused) {
        }
        return this.f41681a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo44741a() {
        String str = "bnc_no_value";
        try {
            PackageInfo packageInfo = this.f41682b.getPackageManager().getPackageInfo(this.f41682b.getPackageName(), 0);
            return packageInfo.versionName != null ? packageInfo.versionName : str;
        } catch (NameNotFoundException unused) {
            return str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m61274a(Object obj) {
        try {
            f41680f = (String) obj.getClass().getMethod("getId", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
        }
        return f41680f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44743a(C6034a aVar) {
        if (!TextUtils.isEmpty(f41680f)) {
            return false;
        }
        new C14162b(aVar).mo44642a(new Void[0]);
        return true;
    }
}
