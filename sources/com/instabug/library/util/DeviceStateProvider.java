package com.instabug.library.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.p038os.C1060c;
import androidx.core.p038os.C1063f;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.places.model.PlaceFields;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.C9810g;
import com.instabug.library.internal.device.C9826a;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.tracking.C9995d;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class DeviceStateProvider {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8027781131759736219L, "com/instabug/library/util/DeviceStateProvider", C13959t.f40882c2);
        $jacocoData = a;
        return a;
    }

    static {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (!DeviceStateProvider.class.desiredAssertionStatus()) {
            $jacocoInit[137] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[138] = true;
        }
        $assertionsDisabled = z;
        $jacocoInit[139] = true;
    }

    public DeviceStateProvider() {
        $jacocoInit()[0] = true;
    }

    private static long calculateTotalMemory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (VERSION.SDK_INT >= 16) {
            $jacocoInit[70] = true;
            long calculateTotalMemoryApi16 = calculateTotalMemoryApi16(context);
            $jacocoInit[71] = true;
            return calculateTotalMemoryApi16;
        }
        long calculateTotalMemoryPreApi16 = calculateTotalMemoryPreApi16();
        $jacocoInit[72] = true;
        return calculateTotalMemoryPreApi16;
    }

    @TargetApi(16)
    private static long calculateTotalMemoryApi16(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        $jacocoInit[73] = true;
        MemoryInfo memoryInfo = new MemoryInfo();
        $jacocoInit[74] = true;
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        $jacocoInit[75] = true;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long calculateTotalMemoryPreApi16() {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 76
            r2 = 1
            r3 = 0
            r0[r1] = r2     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.lang.String r4 = "/proc/meminfo"
            java.lang.String r5 = "r"
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            r3 = 77
            r0[r3] = r2     // Catch:{ IOException -> 0x0072 }
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x0072 }
            r4 = 78
            r0[r4] = r2     // Catch:{ IOException -> 0x0072 }
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ IOException -> 0x0072 }
            r4 = 79
            r0[r4] = r2     // Catch:{ IOException -> 0x0072 }
            r3 = r3[r2]     // Catch:{ IOException -> 0x0072 }
            java.lang.String r3 = r3.trim()     // Catch:{ IOException -> 0x0072 }
            r4 = 80
            r0[r4] = r2     // Catch:{ IOException -> 0x0072 }
            r4 = 0
            int r5 = r3.length()     // Catch:{ IOException -> 0x0072 }
            int r5 = r5 + -3
            java.lang.String r3 = r3.substring(r4, r5)     // Catch:{ IOException -> 0x0072 }
            java.lang.String r3 = r3.trim()     // Catch:{ IOException -> 0x0072 }
            r4 = 81
            r0[r4] = r2     // Catch:{ IOException -> 0x0072 }
            r1.close()     // Catch:{ IOException -> 0x0072 }
            r4 = 82
            r0[r4] = r2     // Catch:{ IOException -> 0x0072 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ IOException -> 0x0072 }
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r5
            r5 = 84
            r0[r5] = r2     // Catch:{ IOException -> 0x0061 }
            r1.close()     // Catch:{ IOException -> 0x0061 }
            r1 = 85
            r0[r1] = r2
            goto L_0x006d
        L_0x0061:
            r1 = move-exception
            r5 = 86
            r0[r5] = r2
            r1.printStackTrace()
            r1 = 87
            r0[r1] = r2
        L_0x006d:
            r1 = 88
            r0[r1] = r2
            return r3
        L_0x0072:
            r3 = move-exception
            goto L_0x007d
        L_0x0074:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x00ab
        L_0x0079:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x007d:
            r4 = 89
            r0[r4] = r2     // Catch:{ all -> 0x00aa }
            r3.printStackTrace()     // Catch:{ all -> 0x00aa }
            if (r1 != 0) goto L_0x008b
            r1 = 90
            r0[r1] = r2
            goto L_0x00a3
        L_0x008b:
            r3 = 91
            r0[r3] = r2     // Catch:{ IOException -> 0x0097 }
            r1.close()     // Catch:{ IOException -> 0x0097 }
            r1 = 92
            r0[r1] = r2
            goto L_0x00a3
        L_0x0097:
            r1 = move-exception
            r3 = 93
            r0[r3] = r2
            r1.printStackTrace()
            r1 = 94
            r0[r1] = r2
        L_0x00a3:
            r3 = 0
            r1 = 101(0x65, float:1.42E-43)
            r0[r1] = r2
            return r3
        L_0x00aa:
            r3 = move-exception
        L_0x00ab:
            if (r1 != 0) goto L_0x00b2
            r1 = 95
            r0[r1] = r2
            goto L_0x00ca
        L_0x00b2:
            r4 = 96
            r0[r4] = r2     // Catch:{ IOException -> 0x00be }
            r1.close()     // Catch:{ IOException -> 0x00be }
            r1 = 97
            r0[r1] = r2
            goto L_0x00ca
        L_0x00be:
            r1 = move-exception
            r4 = 98
            r0[r4] = r2
            r1.printStackTrace()
            r1 = 99
            r0[r1] = r2
        L_0x00ca:
            r1 = 100
            r0[r1] = r2
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DeviceStateProvider.calculateTotalMemoryPreApi16():long");
    }

    private static boolean externalMemoryAvailable() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        $jacocoInit[112] = true;
        return equals;
    }

    public static long getActiveSessionDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        long a = C9810g.m45766e().mo34932a();
        $jacocoInit[136] = true;
        return a;
    }

    public static String getAppPackageName(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        String packageName = InstabugDeviceProperties.getPackageName(context);
        $jacocoInit[13] = true;
        return packageName;
    }

    public static String getAppVersion(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        String appVersion = InstabugDeviceProperties.getAppVersion(context);
        $jacocoInit[14] = true;
        return appVersion;
    }

    public static int getBatteryLevel(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            $jacocoInit[15] = true;
            Intent registerReceiver = context.registerReceiver(null, intentFilter);
            $jacocoInit[16] = true;
            if ($assertionsDisabled) {
                $jacocoInit[17] = true;
            } else if (registerReceiver != null) {
                $jacocoInit[18] = true;
            } else {
                AssertionError assertionError = new AssertionError();
                $jacocoInit[19] = true;
                throw assertionError;
            }
            int intExtra = registerReceiver.getIntExtra(C5854b.f16935q, -1);
            $jacocoInit[20] = true;
            int intExtra2 = (int) ((((float) intExtra) / ((float) registerReceiver.getIntExtra("scale", -1))) * 100.0f);
            $jacocoInit[21] = true;
            return intExtra2;
        } catch (Exception e) {
            $jacocoInit[22] = true;
            InstabugSDKLogger.m46624e("DeviceStateProvider", "Got error while get battery level", e);
            $jacocoInit[23] = true;
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1 A[Catch:{ Exception -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getBatteryState(android.content.Context r7) {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 1
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b6 }
            r3 = 24
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
            r3 = 0
            android.content.Intent r7 = r7.registerReceiver(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            r2 = 25
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            boolean r2 = $assertionsDisabled     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x0022
            r2 = 26
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0028
        L_0x0022:
            if (r7 == 0) goto L_0x00ac
            r2 = 27
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
        L_0x0028:
            java.lang.String r2 = "status"
            r3 = -1
            int r2 = r7.getIntExtra(r2, r3)     // Catch:{ Exception -> 0x00b6 }
            r4 = 2
            r5 = 0
            if (r2 != r4) goto L_0x0038
            r2 = 29
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            goto L_0x003f
        L_0x0038:
            r6 = 5
            if (r2 != r6) goto L_0x0045
            r2 = 30
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
        L_0x003f:
            r2 = 31
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            r2 = 1
            goto L_0x004a
        L_0x0045:
            r2 = 32
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            r2 = 0
        L_0x004a:
            r6 = 33
            r0[r6] = r1     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = "plugged"
            int r7 = r7.getIntExtra(r6, r3)     // Catch:{ Exception -> 0x00b6 }
            if (r7 != r4) goto L_0x005c
            r3 = 34
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
            r3 = 1
            goto L_0x0061
        L_0x005c:
            r3 = 35
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
            r3 = 0
        L_0x0061:
            if (r7 != r1) goto L_0x0069
            r7 = 36
            r0[r7] = r1     // Catch:{ Exception -> 0x00b6 }
            r5 = 1
            goto L_0x006d
        L_0x0069:
            r7 = 37
            r0[r7] = r1     // Catch:{ Exception -> 0x00b6 }
        L_0x006d:
            r7 = 38
            r0[r7] = r1     // Catch:{ Exception -> 0x00b6 }
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b6 }
            r7.<init>()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r2 = "Charging"
            r7.append(r2)     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x0086
            java.lang.String r2 = " through AC Charger"
            r3 = 39
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0095
        L_0x0086:
            if (r3 == 0) goto L_0x008f
            java.lang.String r2 = " through USB cable"
            r3 = 40
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0095
        L_0x008f:
            java.lang.String r2 = ""
            r3 = 41
            r0[r3] = r1     // Catch:{ Exception -> 0x00b6 }
        L_0x0095:
            r7.append(r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00b6 }
            r2 = 42
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r7 = "Unplugged"
            r2 = 43
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
        L_0x00a7:
            r2 = 44
            r0[r2] = r1
            return r7
        L_0x00ac:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ Exception -> 0x00b6 }
            r7.<init>()     // Catch:{ Exception -> 0x00b6 }
            r2 = 28
            r0[r2] = r1     // Catch:{ Exception -> 0x00b6 }
            throw r7     // Catch:{ Exception -> 0x00b6 }
        L_0x00b6:
            r7 = move-exception
            r2 = 45
            r0[r2] = r1
            java.lang.String r2 = "DeviceStateProvider"
            java.lang.String r3 = "Got error while get battery state"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r2, r3, r7)
            r7 = 46
            r0[r7] = r1
            java.lang.String r7 = "Unknown"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DeviceStateProvider.getBatteryState(android.content.Context):java.lang.String");
    }

    public static String getCarrier(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            $jacocoInit[9] = true;
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            $jacocoInit[10] = true;
            return networkOperatorName;
        } catch (Exception e) {
            $jacocoInit[11] = true;
            InstabugSDKLogger.m46624e("DeviceStateProvider", "Got error while get Carrier", e);
            $jacocoInit[12] = true;
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    public static String getCurrentView() {
        boolean[] $jacocoInit = $jacocoInit();
        String a = C9995d.m46539c().mo35844a();
        $jacocoInit[130] = true;
        return a;
    }

    public static String getDevice() {
        boolean[] $jacocoInit = $jacocoInit();
        String deviceType = InstabugDeviceProperties.getDeviceType();
        $jacocoInit[1] = true;
        return deviceType;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        $jacocoInit[121] = true;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        $jacocoInit[122] = true;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        $jacocoInit[123] = true;
        defaultDisplay.getMetrics(displayMetrics);
        if (VERSION.SDK_INT < 17) {
            $jacocoInit[124] = true;
        } else {
            $jacocoInit[125] = true;
            defaultDisplay.getRealMetrics(displayMetrics);
            $jacocoInit[126] = true;
        }
        $jacocoInit[127] = true;
        return displayMetrics;
    }

    public static long getFreeMemory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        $jacocoInit[60] = true;
        MemoryInfo memoryInfo = new MemoryInfo();
        $jacocoInit[61] = true;
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.availMem / PlaybackStateCompat.f483r0;
        $jacocoInit[62] = true;
        return j;
    }

    public static long getFreeStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        if (externalMemoryAvailable()) {
            $jacocoInit[102] = true;
            long usableSpace = Environment.getExternalStorageDirectory().getUsableSpace() / PlaybackStateCompat.f483r0;
            $jacocoInit[103] = true;
            return usableSpace;
        }
        InstabugSDKLogger.m46623e("DeviceStateProvider", "Got error while calculate free storage");
        $jacocoInit[104] = true;
        return -1;
    }

    public static String getLocale(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        C1063f a = C1060c.m6154a(context.getResources().getConfiguration());
        $jacocoInit[132] = true;
        if (a.mo5209b() > 0) {
            $jacocoInit[133] = true;
            String language = C1060c.m6154a(context.getResources().getConfiguration()).mo5206a(0).getLanguage();
            $jacocoInit[134] = true;
            return language;
        }
        String locale = context.getResources().getConfiguration().locale.toString();
        $jacocoInit[135] = true;
        return locale;
    }

    public static String getOS() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("OS Level ");
        sb.append(VERSION.SDK_INT);
        String sb2 = sb.toString();
        $jacocoInit[8] = true;
        return sb2;
    }

    public static String getScreenDensity(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = getDisplayMetrics(context).densityDpi;
        if (i < 160) {
            $jacocoInit[113] = true;
            return "ldpi";
        } else if (i < 240) {
            $jacocoInit[114] = true;
            return "mdpi";
        } else if (i < 320) {
            $jacocoInit[115] = true;
            return "hdpi";
        } else if (i < 480) {
            $jacocoInit[116] = true;
            return "xhdpi";
        } else if (i < 640) {
            $jacocoInit[117] = true;
            return "xxhdpi";
        } else {
            $jacocoInit[118] = true;
            return "xxxhdpi";
        }
    }

    public static String getScreenOrientation(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (context.getResources().getConfiguration().orientation == 2) {
            $jacocoInit[128] = true;
            return "landscape";
        }
        $jacocoInit[129] = true;
        return "portrait";
    }

    public static String getScreenSize(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        $jacocoInit[119] = true;
        String format = String.format("%sx%s", new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)});
        $jacocoInit[120] = true;
        return format;
    }

    public static String getSdkVersion() {
        $jacocoInit()[131] = true;
        return "8.0.11";
    }

    public static long getTotalMemory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        long calculateTotalMemory = calculateTotalMemory(context);
        if (calculateTotalMemory == 0) {
            $jacocoInit[67] = true;
            InstabugSDKLogger.m46623e("DeviceStateProvider", "Got error while calculate total memory");
            $jacocoInit[68] = true;
            return -1;
        }
        long j = calculateTotalMemory / PlaybackStateCompat.f483r0;
        $jacocoInit[69] = true;
        return j;
    }

    public static long getTotalStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        if (externalMemoryAvailable()) {
            $jacocoInit[109] = true;
            long totalSpace = (long) ((int) (Environment.getExternalStorageDirectory().getTotalSpace() / PlaybackStateCompat.f483r0));
            $jacocoInit[110] = true;
            return totalSpace;
        }
        InstabugSDKLogger.m46623e("DeviceStateProvider", "Got error while calculate total storage");
        $jacocoInit[111] = true;
        return -1;
    }

    public static long getUsedMemory(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        $jacocoInit[63] = true;
        MemoryInfo memoryInfo = new MemoryInfo();
        $jacocoInit[64] = true;
        activityManager.getMemoryInfo(memoryInfo);
        $jacocoInit[65] = true;
        long calculateTotalMemory = (calculateTotalMemory(context) - memoryInfo.availMem) / PlaybackStateCompat.f483r0;
        $jacocoInit[66] = true;
        return calculateTotalMemory;
    }

    public static long getUsedStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        if (externalMemoryAvailable()) {
            $jacocoInit[105] = true;
            long totalSpace = Environment.getExternalStorageDirectory().getTotalSpace();
            $jacocoInit[106] = true;
            long freeSpace = (totalSpace - Environment.getExternalStorageDirectory().getFreeSpace()) / PlaybackStateCompat.f483r0;
            $jacocoInit[107] = true;
            return freeSpace;
        }
        InstabugSDKLogger.m46623e("DeviceStateProvider", "Got error while calculate used storage");
        $jacocoInit[108] = true;
        return -1;
    }

    public static String getWifiSSID(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getWifiState(context)) {
            try {
                $jacocoInit[53] = true;
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                $jacocoInit[54] = true;
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                $jacocoInit[55] = true;
                String ssid = connectionInfo.getSSID();
                $jacocoInit[56] = true;
                return ssid;
            } catch (SecurityException unused) {
                $jacocoInit[57] = true;
                InstabugSDKLogger.m46623e("DeviceStateProvider", "Could not read wifi SSID. To enable please add the following line in your AndroidManifest.xml <uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\"/>");
                $jacocoInit[58] = true;
                return "Connected";
            }
        } else {
            $jacocoInit[59] = true;
            return "Not Connected";
        }
    }

    public static boolean getWifiState(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        String str = "connectivity";
        try {
            $jacocoInit[47] = true;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(str);
            $jacocoInit[48] = true;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            $jacocoInit[49] = true;
            boolean isConnected = networkInfo.isConnected();
            $jacocoInit[50] = true;
            return isConnected;
        } catch (Exception e) {
            $jacocoInit[51] = true;
            InstabugSDKLogger.m46624e("DeviceStateProvider", "Got error while get wifi state", e);
            $jacocoInit[52] = true;
            return false;
        }
    }

    public static boolean isDeviceRooted() {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            if (C9826a.m45823a()) {
                $jacocoInit[2] = true;
                return true;
            }
            $jacocoInit[7] = true;
            return false;
        } catch (Exception e) {
            $jacocoInit[3] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while checking if device is rooted or not ");
            $jacocoInit[4] = true;
            sb.append(e.getMessage());
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            InstabugSDKLogger.m46623e("DeviceStateProvider", sb2);
            $jacocoInit[6] = true;
            return false;
        }
    }
}
