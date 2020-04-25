package p212io.fabric.sdk.android.p493p.p495b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.C5785c;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.p.b.i */
/* compiled from: CommonUtils */
public class C14248i {

    /* renamed from: A */
    public static final int f42013A = 4;

    /* renamed from: B */
    public static final int f42014B = 8;

    /* renamed from: C */
    public static final int f42015C = 16;

    /* renamed from: D */
    public static final int f42016D = 32;

    /* renamed from: E */
    public static final Comparator<File> f42017E = new C14249a();

    /* renamed from: a */
    private static final String f42018a = "A";

    /* renamed from: b */
    private static final String f42019b = "D";

    /* renamed from: c */
    private static final String f42020c = "E";

    /* renamed from: d */
    private static final String f42021d = "I";

    /* renamed from: e */
    private static final String f42022e = "V";

    /* renamed from: f */
    private static final String f42023f = "W";

    /* renamed from: g */
    private static final String f42024g = "?";

    /* renamed from: h */
    public static final String f42025h = "SHA-1";

    /* renamed from: i */
    public static final String f42026i = "SHA-256";

    /* renamed from: j */
    public static final String f42027j = "google_sdk";

    /* renamed from: k */
    public static final String f42028k = "sdk";

    /* renamed from: l */
    private static final String f42029l = "com.crashlytics.prefs";

    /* renamed from: m */
    static final String f42030m = "com.crashlytics.Trace";

    /* renamed from: n */
    static final boolean f42031n = false;

    /* renamed from: o */
    private static Boolean f42032o = null;

    /* renamed from: p */
    private static final char[] f42033p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: q */
    static final String f42034q = "io.fabric.android.build_id";

    /* renamed from: r */
    static final String f42035r = "com.crashlytics.android.build_id";

    /* renamed from: s */
    static final String f42036s = "com.google.firebase.crashlytics.unity_version";

    /* renamed from: t */
    private static final long f42037t = -1;

    /* renamed from: u */
    static final int f42038u = 1073741824;

    /* renamed from: v */
    static final int f42039v = 1048576;

    /* renamed from: w */
    static final int f42040w = 1024;

    /* renamed from: x */
    private static long f42041x = -1;

    /* renamed from: y */
    public static final int f42042y = 1;

    /* renamed from: z */
    public static final int f42043z = 2;

    /* renamed from: io.fabric.sdk.android.p.b.i$a */
    /* compiled from: CommonUtils */
    static class C14249a implements Comparator<File> {
        C14249a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.i$b */
    /* compiled from: CommonUtils */
    enum C14250b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, C14250b> matcher = null;

        static {
            matcher = new HashMap(4);
            matcher.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }

        /* renamed from: d */
        static C14250b m61850d() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C14215d.m61672j().mo45042d(C14215d.f41919m, "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C14250b bVar = (C14250b) matcher.get(str.toLowerCase(Locale.US));
            if (bVar == null) {
                bVar = UNKNOWN;
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public static String m61800a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return f42019b;
            case 4:
                return f42021d;
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return f42024g;
        }
    }

    /* renamed from: a */
    public static String m61801a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            C14228l j = C14215d.m61672j();
                            String str4 = C14215d.f41919m;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing ");
                            sb.append(file);
                            j.mo45045e(str4, sb.toString(), e);
                            m61815a((Closeable) bufferedReader, str2);
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                C14228l j2 = C14215d.m61672j();
                String str42 = C14215d.f41919m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing ");
                sb2.append(file);
                j2.mo45045e(str42, sb2.toString(), e);
                m61815a((Closeable) bufferedReader, str2);
                return str3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                m61815a((Closeable) bufferedReader, str2);
                throw th;
            }
            m61815a((Closeable) bufferedReader, str2);
        }
        return str3;
    }

    /* renamed from: b */
    public static synchronized long m61820b() {
        long j;
        synchronized (C14248i.class) {
            if (f42041x == -1) {
                long j2 = 0;
                String a = m61801a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String upperCase = a.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m61798a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m61798a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m61798a(upperCase, "GB", 1073741824);
                        } else {
                            C14228l j3 = C14215d.m61672j();
                            String str = C14215d.f41919m;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            j3.mo45042d(str, sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        C14228l j4 = C14215d.m61672j();
                        String str2 = C14215d.f41919m;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        j4.mo45045e(str2, sb2.toString(), e);
                    }
                }
                f42041x = j2;
            }
            j = f42041x;
        }
        return j;
    }

    /* renamed from: c */
    public static void m61829c(Context context, String str) {
        if (m61843k(context)) {
            C14215d.m61672j().mo45042d(C14215d.f41919m, str);
        }
    }

    /* renamed from: d */
    public static String m61834d(String str) {
        return m61804a(str, "SHA-1");
    }

    /* renamed from: e */
    public static String m61837e(String str) {
        return m61804a(str, f42026i);
    }

    /* renamed from: f */
    public static int m61838f(Context context) {
        int i = m61844l(context) ? 1 : 0;
        if (m61846n(context)) {
            i |= 2;
        }
        return m61831c() ? i | 4 : i;
    }

    /* renamed from: g */
    public static boolean m61839g(Context context) {
        boolean z = false;
        if (m61844l(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public static String m61840h(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            return context.getResources().getResourcePackageName(i);
        } catch (NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: i */
    public static SharedPreferences m61841i(Context context) {
        return context.getSharedPreferences(f42029l, 0);
    }

    /* renamed from: j */
    public static boolean m61842j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: k */
    public static boolean m61843k(Context context) {
        if (f42032o == null) {
            f42032o = Boolean.valueOf(m61819a(context, f42030m, false));
        }
        return f42032o.booleanValue();
    }

    /* renamed from: l */
    public static boolean m61844l(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!f42027j.equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    /* renamed from: m */
    public static boolean m61845m(Context context) {
        return false;
    }

    /* renamed from: n */
    public static boolean m61846n(Context context) {
        boolean l = m61844l(context);
        String str = Build.TAGS;
        if ((!l && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (l || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static String m61847o(Context context) {
        String str = "string";
        int a = m61794a(context, f42034q, str);
        if (a == 0) {
            a = m61794a(context, f42035r, str);
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Build ID is: ");
        sb.append(string);
        j.mo45042d(C14215d.f41919m, sb.toString());
        return string;
    }

    /* renamed from: p */
    public static String m61848p(Context context) {
        int a = m61794a(context, f42036s, "string");
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        j.mo45042d(C14215d.f41919m, sb.toString());
        return string;
    }

    /* renamed from: d */
    public static boolean m61835d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* renamed from: e */
    public static Float m61836e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra(C5854b.f16935q, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: c */
    public static boolean m61831c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: d */
    public static int m61833d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: c */
    public static boolean m61832c(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m61828c(Context context) {
        InputStream inputStream;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        try {
            inputStream = context.getResources().openRawResource(m61833d(context));
            try {
                String a = m61802a(inputStream);
                if (!m61832c(a)) {
                    str2 = a;
                }
                m61815a((Closeable) inputStream, str);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    C14228l j = C14215d.m61672j();
                    String str3 = C14215d.f41919m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not calculate hash for app icon:");
                    sb.append(e.getMessage());
                    j.mo45051w(str3, sb.toString());
                    m61815a((Closeable) inputStream, str);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m61815a((Closeable) inputStream, str);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            C14228l j2 = C14215d.m61672j();
            String str32 = C14215d.f41919m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not calculate hash for app icon:");
            sb2.append(e.getMessage());
            j2.mo45051w(str32, sb2.toString());
            m61815a((Closeable) inputStream, str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m61815a((Closeable) inputStream, str);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m61793a() {
        return C14250b.m61850d().ordinal();
    }

    /* renamed from: a */
    static long m61798a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m61799a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m61830c(String str, String str2) {
        if (!C14215d.m61674l()) {
            C14215d.m61672j().mo45051w(str, str2);
            return;
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static String m61823b(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: b */
    public static byte[] m61827b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m61802a(InputStream inputStream) {
        return m61803a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m61804a(String str, String str2) {
        return m61806a(str.getBytes(), str2);
    }

    /* renamed from: a */
    private static String m61803a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m61805a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: b */
    public static String m61822b(Context context, String str) {
        int a = m61794a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    /* renamed from: b */
    public static String m61821b(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: a */
    private static String m61806a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m61805a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            j.mo45045e(C14215d.f41919m, sb.toString(), e);
            return "";
        }
    }

    /* renamed from: b */
    public static void m61824b(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInputFromInputMethod(view.getWindowToken(), 0);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static boolean m61826b(Context context) {
        if (!m61818a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m61807a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m61834d(sb2);
        }
        return null;
    }

    /* renamed from: b */
    public static void m61825b(String str, String str2) {
        if (!C14215d.m61674l()) {
            C14215d.m61672j().mo45051w(str, str2);
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: a */
    public static long m61796a(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static long m61797a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: a */
    public static void m61813a(Context context, String str, Throwable th) {
        if (m61843k(context)) {
            C14215d.m61672j().mo45044e(C14215d.f41919m, str);
        }
    }

    /* renamed from: a */
    public static void m61811a(Context context, int i, String str, String str2) {
        if (m61843k(context)) {
            C14215d.m61672j().log(i, C14215d.f41919m, str2);
        }
    }

    /* renamed from: a */
    public static boolean m61819a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m61794a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = m61794a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static int m61794a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m61840h(context));
    }

    /* renamed from: a */
    public static int m61795a(Context context, boolean z) {
        Float e = m61836e(context);
        if (!z || e == null) {
            return 1;
        }
        if (((double) e.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e.floatValue()) < 99.0d ? 2 : 0;
    }

    @Deprecated
    /* renamed from: a */
    public static Cipher m61808a(int i, String str) throws InvalidKeyException {
        throw new InvalidKeyException("This method is deprecated");
    }

    /* renamed from: a */
    public static String m61805a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f42033p;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & C5785c.f16698q];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static void m61815a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C14215d.m61672j().mo45045e(C14215d.f41919m, str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m61816a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C14215d.m61672j().mo45045e(C14215d.f41919m, str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m61817a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m61814a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m61818a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    public static void m61812a(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public static void m61810a(Context context, int i) {
        if (context instanceof Activity) {
            m61809a((Activity) context, i);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public static void m61809a(Activity activity, int i) {
        if (activity != null) {
            if (VERSION.SDK_INT >= 16) {
                activity.finishAffinity();
            } else {
                activity.setResult(i);
                activity.finish();
            }
        }
    }
}
