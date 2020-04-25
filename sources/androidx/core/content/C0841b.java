package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.core.app.C0770p;
import com.facebook.internal.ServerProtocol;
import com.facebook.places.model.PlaceFields;
import com.google.firebase.analytics.FirebaseAnalytics.C5853a;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.jivesoftware.smackx.bookmarks.Bookmarks;

/* renamed from: androidx.core.content.b */
/* compiled from: ContextCompat */
public class C0841b {

    /* renamed from: a */
    private static final String f3981a = "ContextCompat";

    /* renamed from: b */
    private static final Object f3982b = new Object();

    /* renamed from: c */
    private static TypedValue f3983c;

    /* renamed from: androidx.core.content.b$a */
    /* compiled from: ContextCompat */
    private static final class C0842a {

        /* renamed from: a */
        static final HashMap<Class<?>, String> f3984a = new HashMap<>();

        static {
            if (VERSION.SDK_INT >= 22) {
                f3984a.put(SubscriptionManager.class, "telephony_subscription_service");
                f3984a.put(UsageStatsManager.class, "usagestats");
            }
            if (VERSION.SDK_INT >= 21) {
                f3984a.put(AppWidgetManager.class, "appwidget");
                f3984a.put(BatteryManager.class, "batterymanager");
                f3984a.put(CameraManager.class, "camera");
                f3984a.put(JobScheduler.class, "jobscheduler");
                f3984a.put(LauncherApps.class, "launcherapps");
                f3984a.put(MediaProjectionManager.class, "media_projection");
                f3984a.put(MediaSessionManager.class, "media_session");
                f3984a.put(RestrictionsManager.class, "restrictions");
                f3984a.put(TelecomManager.class, "telecom");
                f3984a.put(TvInputManager.class, "tv_input");
            }
            if (VERSION.SDK_INT >= 19) {
                f3984a.put(AppOpsManager.class, "appops");
                f3984a.put(CaptioningManager.class, "captioning");
                f3984a.put(ConsumerIrManager.class, "consumer_ir");
                f3984a.put(PrintManager.class, "print");
            }
            if (VERSION.SDK_INT >= 18) {
                f3984a.put(BluetoothManager.class, "bluetooth");
            }
            if (VERSION.SDK_INT >= 17) {
                f3984a.put(DisplayManager.class, ServerProtocol.DIALOG_PARAM_DISPLAY);
                f3984a.put(UserManager.class, "user");
            }
            if (VERSION.SDK_INT >= 16) {
                f3984a.put(InputManager.class, "input");
                f3984a.put(MediaRouter.class, "media_router");
                f3984a.put(NsdManager.class, "servicediscovery");
            }
            f3984a.put(AccessibilityManager.class, "accessibility");
            f3984a.put(AccountManager.class, "account");
            f3984a.put(ActivityManager.class, "activity");
            f3984a.put(AlarmManager.class, C0770p.f3528i0);
            f3984a.put(AudioManager.class, "audio");
            f3984a.put(ClipboardManager.class, "clipboard");
            f3984a.put(ConnectivityManager.class, "connectivity");
            f3984a.put(DevicePolicyManager.class, "device_policy");
            f3984a.put(DownloadManager.class, "download");
            f3984a.put(DropBoxManager.class, "dropbox");
            f3984a.put(InputMethodManager.class, "input_method");
            f3984a.put(KeyguardManager.class, "keyguard");
            f3984a.put(LayoutInflater.class, "layout_inflater");
            f3984a.put(LocationManager.class, "location");
            f3984a.put(NfcManager.class, "nfc");
            f3984a.put(NotificationManager.class, "notification");
            f3984a.put(PowerManager.class, "power");
            f3984a.put(SearchManager.class, C5853a.f16884q);
            f3984a.put(SensorManager.class, "sensor");
            f3984a.put(StorageManager.class, Bookmarks.ELEMENT);
            f3984a.put(TelephonyManager.class, PlaceFields.PHONE);
            f3984a.put(TextServicesManager.class, "textservices");
            f3984a.put(UiModeManager.class, "uimode");
            f3984a.put(UsbManager.class, "usb");
            f3984a.put(Vibrator.class, "vibrator");
            f3984a.put(WallpaperManager.class, "wallpaper");
            f3984a.put(WifiP2pManager.class, "wifip2p");
            f3984a.put(WifiManager.class, "wifi");
            f3984a.put(WindowManager.class, "window");
        }

        private C0842a() {
        }
    }

    /* renamed from: androidx.core.content.b$b */
    /* compiled from: ContextCompat */
    private static class C0843b implements Executor {

        /* renamed from: a */
        private final Handler f3985a;

        C0843b(@C0193h0 Handler handler) {
            this.f3985a = handler;
        }

        public void execute(Runnable runnable) {
            if (!this.f3985a.post(runnable)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f3985a);
                sb.append(" is shutting down");
                throw new RejectedExecutionException(sb.toString());
            }
        }
    }

    protected C0841b() {
    }

    /* renamed from: a */
    public static boolean m4922a(@C0193h0 Context context, @C0193h0 Intent[] intentArr) {
        return m4923a(context, intentArr, (Bundle) null);
    }

    @C0193h0
    /* renamed from: b */
    public static File[] m4927b(@C0193h0 Context context, @C0195i0 String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    @C0195i0
    /* renamed from: c */
    public static File m4929c(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        return str != null ? new File(str) : null;
    }

    @C0193h0
    /* renamed from: d */
    public static File[] m4930d(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: e */
    public static Executor m4931e(Context context) {
        if (VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new C0843b(new Handler(context.getMainLooper()));
    }

    @C0195i0
    /* renamed from: f */
    public static File m4932f(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return m4918a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    @C0193h0
    /* renamed from: g */
    public static File[] m4933g(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getObbDirs();
        }
        return new File[]{context.getObbDir()};
    }

    /* renamed from: h */
    public static boolean m4934h(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4923a(@C0193h0 Context context, @C0193h0 Intent[] intentArr, @C0195i0 Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    @C0195i0
    /* renamed from: b */
    public static ColorStateList m4924b(@C0193h0 Context context, @C0202m int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: a */
    public static void m4921a(@C0193h0 Context context, @C0193h0 Intent intent, @C0195i0 Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    @C0195i0
    /* renamed from: c */
    public static Drawable m4928c(@C0193h0 Context context, @C0213q int i) {
        int i2;
        int i3 = VERSION.SDK_INT;
        if (i3 >= 21) {
            return context.getDrawable(i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f3982b) {
            if (f3983c == null) {
                f3983c = new TypedValue();
            }
            context.getResources().getValue(i, f3983c, true);
            i2 = f3983c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: b */
    public static File m4925b(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return m4918a(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    @C0198k
    /* renamed from: a */
    public static int m4915a(@C0193h0 Context context, @C0202m int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static int m4916a(@C0193h0 Context context, @C0193h0 String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    @C0195i0
    /* renamed from: b */
    public static String m4926b(@C0193h0 Context context, @C0193h0 Class<?> cls) {
        if (VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return (String) C0842a.f3984a.get(cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m4918a(java.io.File r3) {
        /*
            java.lang.Class<androidx.core.content.b> r0 = androidx.core.content.C0841b.class
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r3
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x0030 }
            r1.append(r3)     // Catch:{ all -> 0x0030 }
            r1.toString()     // Catch:{ all -> 0x0030 }
            r3 = 0
            monitor-exit(r0)
            return r3
        L_0x002e:
            monitor-exit(r0)
            return r3
        L_0x0030:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C0841b.m4918a(java.io.File):java.io.File");
    }

    @C0195i0
    /* renamed from: a */
    public static Context m4917a(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* renamed from: a */
    public static void m4920a(@C0193h0 Context context, @C0193h0 Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @C0195i0
    /* renamed from: a */
    public static <T> T m4919a(@C0193h0 Context context, @C0193h0 Class<T> cls) {
        if (VERSION.SDK_INT >= 23) {
            return context.getSystemService(cls);
        }
        String b = m4926b(context, cls);
        return b != null ? context.getSystemService(b) : null;
    }
}
