package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5969d;

@C5969d
public class SoLoader {
    static final boolean DEBUG = false;
    public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
    public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
    public static final int SOLOADER_LOOK_IN_ZIP = 4;
    private static final String SO_STORE_NAME_MAIN = "lib-main";
    static final boolean SYSTRACE_LIBRARY_LOADING;
    static final String TAG = "SoLoader";
    @C5952h
    @C5966a("sSoSourcesLock")
    private static ApplicationSoSource sApplicationSoSource;
    @C5952h
    @C5966a("sSoSourcesLock")
    private static UnpackingSoSource sBackupSoSource;
    @C5966a("sSoSourcesLock")
    private static int sFlags;
    private static final Set<String> sLoadedAndMergedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    @C5966a("SoLoader.class")
    private static final HashSet<String> sLoadedLibraries = new HashSet<>();
    @C5966a("SoLoader.class")
    private static final Map<String, Object> sLoadingLibraries = new HashMap();
    @C5952h
    static SoFileLoader sSoFileLoader;
    @C5952h
    @C5966a("sSoSourcesLock")
    private static SoSource[] sSoSources = null;
    private static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    private static int sSoSourcesVersion = 0;
    @C5952h
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;

    @DoNotOptimize
    @TargetApi(14)
    private static class Api14Utils {
        private Api14Utils() {
        }

        public static String getClassLoaderLdLoadLibrary() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        SYSTRACE_LIBRARY_LOADING = z;
    }

    public static boolean areSoSourcesAbisSupported() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                for (SoSource soSourceAbis : sSoSources) {
                    String[] soSourceAbis2 = soSourceAbis.getSoSourceAbis();
                    int i = 0;
                    while (i < soSourceAbis2.length) {
                        boolean z = false;
                        for (int i2 = 0; i2 < supportedAbis.length && !z; i2++) {
                            z = soSourceAbis2[i].equals(supportedAbis[i2]);
                        }
                        if (z) {
                            i++;
                        }
                    }
                }
                sSoSourcesLock.readLock().unlock();
                return true;
            }
            return false;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    private static void assertInitialized() {
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    public static void deinitForTest() {
        setSoSources(null);
    }

    /* JADX INFO: finally extract failed */
    private static void doLoadLibraryBySoName(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        sSoSourcesLock.readLock().lock();
        try {
            String str2 = "couldn't find DSO to load: ";
            if (sSoSources != null) {
                sSoSourcesLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (SYSTRACE_LIBRARY_LOADING) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Api18TraceUtils.beginTraceSection(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        sSoSourcesLock.readLock().lock();
                        int i3 = sSoSourcesVersion;
                        int i4 = 0;
                        while (true) {
                            if (i2 == 0) {
                                if (i4 >= sSoSources.length) {
                                    break;
                                }
                                i2 = sSoSources[i4].loadLibrary(str, i, threadPolicy);
                                if (i2 == 3 && sBackupSoSource != null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Trying backup SoSource for ");
                                    sb2.append(str);
                                    sb2.toString();
                                    sBackupSoSource.prepare(str);
                                    i2 = sBackupSoSource.loadLibrary(str, i, threadPolicy);
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                        sSoSourcesLock.readLock().unlock();
                        if (i2 == 0) {
                            sSoSourcesLock.writeLock().lock();
                            if (sApplicationSoSource != null && sApplicationSoSource.checkAndMaybeUpdate()) {
                                sSoSourcesVersion++;
                            }
                            z2 = sSoSourcesVersion != i3;
                            sSoSourcesLock.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th) {
                        if (SYSTRACE_LIBRARY_LOADING) {
                            Api18TraceUtils.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(str);
                            String sb4 = sb3.toString();
                            String message = th.getMessage();
                            if (message == null) {
                                message = th.toString();
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb4);
                            sb5.append(" caused by: ");
                            sb5.append(message);
                            throw new UnsatisfiedLinkError(sb5.toString());
                        }
                        return;
                    }
                } while (z2);
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    sb6.append(str);
                    throw new UnsatisfiedLinkError(sb6.toString());
                }
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Could not load: ");
            sb7.append(str);
            sb7.append(" because no SO source exists");
            sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str2);
            sb8.append(str);
            throw new UnsatisfiedLinkError(sb8.toString());
        } catch (Throwable th2) {
            sSoSourcesLock.readLock().unlock();
            throw th2;
        }
    }

    public static Set<String> getLoadedLibraries() {
        HashSet hashSet;
        synchronized (SoLoader.class) {
            hashSet = (HashSet) sLoadedLibraries.clone();
        }
        return hashSet;
    }

    @C5952h
    private static Method getNativeLoadRuntimeMethod() {
        Method method;
        int i = VERSION.SDK_INT;
        if (i < 23) {
            return null;
        }
        String str = "nativeLoad";
        if (i <= 27) {
            try {
                method = Runtime.class.getDeclaredMethod(str, new Class[]{String.class, ClassLoader.class, String.class});
            } catch (NoSuchMethodException | SecurityException unused) {
                return null;
            }
        } else {
            method = Runtime.class.getDeclaredMethod(str, new Class[]{String.class, ClassLoader.class});
        }
        method.setAccessible(true);
        return method;
    }

    public static void init(Context context, int i) throws IOException {
        init(context, i, null);
    }

    private static synchronized void initSoLoader(@C5952h SoFileLoader soFileLoader) {
        synchronized (SoLoader.class) {
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method nativeLoadRuntimeMethod = getNativeLoadRuntimeMethod();
            final boolean z = nativeLoadRuntimeMethod != null;
            final String classLoaderLdLoadLibrary = z ? Api14Utils.getClassLoaderLdLoadLibrary() : null;
            final String makeNonZipPath = makeNonZipPath(classLoaderLdLoadLibrary);
            C37821 r1 = new SoFileLoader() {
                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
                    r7 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                    r1.close();
                 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private java.lang.String getLibHash(java.lang.String r7) {
                    /*
                        r6 = this;
                        java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        r0.<init>(r7)     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        java.lang.String r7 = "MD5"
                        java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        r1.<init>(r0)     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        r0 = 4096(0x1000, float:5.74E-42)
                        byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
                    L_0x0014:
                        int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                        r3 = 0
                        if (r2 <= 0) goto L_0x001f
                        r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                        goto L_0x0014
                    L_0x001f:
                        java.lang.String r0 = "%32x"
                        r2 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                        java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                        byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                        r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                        r4[r3] = r5     // Catch:{ all -> 0x0037 }
                        java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                        r1.close()     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                        goto L_0x0049
                    L_0x0037:
                        r7 = move-exception
                        throw r7     // Catch:{ all -> 0x0039 }
                    L_0x0039:
                        r7 = move-exception
                        r1.close()     // Catch:{ all -> 0x003d }
                    L_0x003d:
                        throw r7     // Catch:{ IOException -> 0x0044, NoSuchAlgorithmException -> 0x003e }
                    L_0x003e:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                        goto L_0x0049
                    L_0x0044:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                    L_0x0049:
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C37821.getLibHash(java.lang.String):java.lang.String");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
                    if (r0 == null) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
                    r1 = new java.lang.StringBuilder();
                    r1.append("Error when loading lib: ");
                    r1.append(r0);
                    r1.append(" lib hash: ");
                    r1.append(getLibHash(r11));
                    r1.append(" search path is ");
                    r1.append(r12);
                    r1.toString();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void load(java.lang.String r11, int r12) {
                    /*
                        r10 = this;
                        java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
                        boolean r1 = r2
                        if (r1 == 0) goto L_0x00ca
                        r1 = 4
                        r12 = r12 & r1
                        r2 = 1
                        r3 = 0
                        if (r12 != r1) goto L_0x000e
                        r12 = 1
                        goto L_0x000f
                    L_0x000e:
                        r12 = 0
                    L_0x000f:
                        if (r12 == 0) goto L_0x0014
                        java.lang.String r12 = r3
                        goto L_0x0016
                    L_0x0014:
                        java.lang.String r12 = r4
                    L_0x0016:
                        r1 = 0
                        java.lang.Runtime r4 = r5     // Catch:{ IllegalAccessException -> 0x008b, IllegalArgumentException -> 0x0089, InvocationTargetException -> 0x0087 }
                        monitor-enter(r4)     // Catch:{ IllegalAccessException -> 0x008b, IllegalArgumentException -> 0x0089, InvocationTargetException -> 0x0087 }
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0082 }
                        r6 = 27
                        r7 = 2
                        if (r5 > r6) goto L_0x0039
                        java.lang.reflect.Method r5 = r6     // Catch:{ all -> 0x0082 }
                        java.lang.Runtime r6 = r5     // Catch:{ all -> 0x0082 }
                        r8 = 3
                        java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0082 }
                        r8[r3] = r11     // Catch:{ all -> 0x0082 }
                        java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x0082 }
                        r8[r2] = r0     // Catch:{ all -> 0x0082 }
                        r8[r7] = r12     // Catch:{ all -> 0x0082 }
                        java.lang.Object r0 = r5.invoke(r6, r8)     // Catch:{ all -> 0x0082 }
                        java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0082 }
                        goto L_0x004d
                    L_0x0039:
                        java.lang.reflect.Method r5 = r6     // Catch:{ all -> 0x0082 }
                        java.lang.Runtime r6 = r5     // Catch:{ all -> 0x0082 }
                        java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0082 }
                        r7[r3] = r11     // Catch:{ all -> 0x0082 }
                        java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x0082 }
                        r7[r2] = r0     // Catch:{ all -> 0x0082 }
                        java.lang.Object r0 = r5.invoke(r6, r7)     // Catch:{ all -> 0x0082 }
                        java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0082 }
                    L_0x004d:
                        if (r0 != 0) goto L_0x007c
                        monitor-exit(r4)     // Catch:{ all -> 0x0077 }
                        if (r0 == 0) goto L_0x00cd
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Error when loading lib: "
                        r1.append(r2)
                        r1.append(r0)
                        java.lang.String r0 = " lib hash: "
                        r1.append(r0)
                        java.lang.String r11 = r10.getLibHash(r11)
                        r1.append(r11)
                        java.lang.String r11 = " search path is "
                        r1.append(r11)
                        r1.append(r12)
                        r1.toString()
                        goto L_0x00cd
                    L_0x0077:
                        r1 = move-exception
                        r9 = r1
                        r1 = r0
                        r0 = r9
                        goto L_0x0083
                    L_0x007c:
                        java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0077 }
                        r1.<init>(r0)     // Catch:{ all -> 0x0077 }
                        throw r1     // Catch:{ all -> 0x0077 }
                    L_0x0082:
                        r0 = move-exception
                    L_0x0083:
                        monitor-exit(r4)     // Catch:{ all -> 0x0082 }
                        throw r0     // Catch:{ IllegalAccessException -> 0x008b, IllegalArgumentException -> 0x0089, InvocationTargetException -> 0x0087 }
                    L_0x0085:
                        r0 = move-exception
                        goto L_0x00a3
                    L_0x0087:
                        r0 = move-exception
                        goto L_0x008c
                    L_0x0089:
                        r0 = move-exception
                        goto L_0x008c
                    L_0x008b:
                        r0 = move-exception
                    L_0x008c:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
                        r2.<init>()     // Catch:{ all -> 0x0085 }
                        java.lang.String r3 = "Error: Cannot load "
                        r2.append(r3)     // Catch:{ all -> 0x0085 }
                        r2.append(r11)     // Catch:{ all -> 0x0085 }
                        java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0085 }
                        java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0085 }
                        r2.<init>(r1, r0)     // Catch:{ all -> 0x0085 }
                        throw r2     // Catch:{ all -> 0x0085 }
                    L_0x00a3:
                        if (r1 == 0) goto L_0x00c9
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Error when loading lib: "
                        r2.append(r3)
                        r2.append(r1)
                        java.lang.String r1 = " lib hash: "
                        r2.append(r1)
                        java.lang.String r11 = r10.getLibHash(r11)
                        r2.append(r11)
                        java.lang.String r11 = " search path is "
                        r2.append(r11)
                        r2.append(r12)
                        r2.toString()
                    L_0x00c9:
                        throw r0
                    L_0x00ca:
                        java.lang.System.load(r11)
                    L_0x00cd:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C37821.load(java.lang.String, int):void");
                }
            };
            sSoFileLoader = r1;
        }
    }

    private static void initSoSources(Context context, int i, @C5952h SoFileLoader soFileLoader) throws IOException {
        int i2;
        sSoSourcesLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                sFlags = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (int i3 = 0; i3 < split.length; i3++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adding system library source: ");
                    sb.append(split[i3]);
                    sb.toString();
                    arrayList.add(new DirectorySoSource(new File(split[i3]), 2));
                }
                if (context != null) {
                    int i4 = i & 1;
                    String str2 = SO_STORE_NAME_MAIN;
                    if (i4 != 0) {
                        sBackupSoSource = null;
                        arrayList.add(0, new ExoSoSource(context, str2));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            sApplicationSoSource = new ApplicationSoSource(context, VERSION.SDK_INT <= 17 ? 1 : 0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("adding application source: ");
                            sb2.append(sApplicationSoSource.toString());
                            sb2.toString();
                            arrayList.add(0, sApplicationSoSource);
                            i2 = 1;
                        }
                        sBackupSoSource = new ApkSoSource(context, str2, i2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("adding backup  source: ");
                        sb3.append(sBackupSoSource.toString());
                        sb3.toString();
                        arrayList.add(0, sBackupSoSource);
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int makePrepareFlags = makePrepareFlags();
                int length = soSourceArr.length;
                while (true) {
                    int i5 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Preparing SO source: ");
                    sb4.append(soSourceArr[i5]);
                    sb4.toString();
                    soSourceArr[i5].prepare(makePrepareFlags);
                    length = i5;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion++;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("init finish: ");
                sb5.append(sSoSources.length);
                sb5.append(" SO sources prepared");
                sb5.toString();
            }
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    static void loadLibraryBySoName(String str, int i, ThreadPolicy threadPolicy) {
        loadLibraryBySoName(str, null, null, i, threadPolicy);
    }

    public static String makeLdLibraryPath() {
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            ArrayList arrayList = new ArrayList();
            SoSource[] soSourceArr = sSoSources;
            for (SoSource addToLdLibraryPath : soSourceArr) {
                addToLdLibraryPath.addToLdLibraryPath(arrayList);
            }
            String join = TextUtils.join(":", arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append("makeLdLibraryPath final path: ");
            sb.append(join);
            sb.toString();
            return join;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    @C5952h
    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String str2 = ":";
        String[] split = str.split(str2);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            if (!str3.contains("!")) {
                arrayList.add(str3);
            }
        }
        return TextUtils.join(str2, arrayList);
    }

    private static int makePrepareFlags() {
        sSoSourcesLock.writeLock().lock();
        try {
            return (sFlags & 2) != 0 ? 1 : 0;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        sSoSourcesLock.writeLock().lock();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Prepending to SO sources: ");
            sb.append(soSource);
            sb.toString();
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = new SoSource[(sSoSources.length + 1)];
            soSourceArr[0] = soSource;
            System.arraycopy(sSoSources, 0, soSourceArr, 1, sSoSources.length);
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Prepended to SO sources: ");
            sb2.append(soSource);
            sb2.toString();
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    static void resetStatus() {
        synchronized (SoLoader.class) {
            sLoadedLibraries.clear();
            sLoadingLibraries.clear();
            sSoFileLoader = null;
        }
        setSoSources(null);
    }

    public static void setInTestMode() {
        setSoSources(new SoSource[]{new NoopSoSource()});
    }

    static void setSoFileLoader(SoFileLoader soFileLoader) {
        sSoFileLoader = soFileLoader;
    }

    static void setSoSources(SoSource[] soSourceArr) {
        sSoSourcesLock.writeLock().lock();
        try {
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
        } finally {
            sSoSourcesLock.writeLock().unlock();
        }
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        int i = 0;
        while (i < sSoSources.length) {
            try {
                File unpackLibrary = sSoSources[i].unpackLibrary(str);
                if (unpackLibrary != null) {
                    return unpackLibrary;
                }
                i++;
            } finally {
                sSoSourcesLock.readLock().unlock();
            }
        }
        sSoSourcesLock.readLock().unlock();
        throw new FileNotFoundException(str);
    }

    private static void init(Context context, int i, @C5952h SoFileLoader soFileLoader) throws IOException {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            initSoLoader(soFileLoader);
            initSoSources(context, i, soFileLoader);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static boolean loadLibrary(String str, int i) throws UnsatisfiedLinkError {
        boolean z;
        sSoSourcesLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    assertInitialized();
                } else {
                    synchronized (SoLoader.class) {
                        z = !sLoadedLibraries.contains(str);
                        if (z) {
                            if (sSystemLoadLibraryWrapper != null) {
                                sSystemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    sSoSourcesLock.readLock().unlock();
                    return z;
                }
            }
            sSoSourcesLock.readLock().unlock();
            String mapLibName = MergedSoMapping.mapLibName(str);
            return loadLibraryBySoName(System.mapLibraryName(mapLibName != null ? mapLibName : str), str, mapLibName, i, null);
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (sLoadedLibraries.contains(r7) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r9 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("About to load: ");
        r5.append(r7);
        r5.toString();
        doLoadLibraryBySoName(r7, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("Loaded: ");
        r10.append(r7);
        r10.toString();
        sLoadedLibraries.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0081, code lost:
        r8 = r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        if (r8 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0094, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0095, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0096, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009c, code lost:
        throw new java.lang.RuntimeException(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a4, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ac, code lost:
        if (sLoadedAndMergedLibraries.contains(r8) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ae, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00af, code lost:
        if (r9 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b1, code lost:
        if (r2 != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b5, code lost:
        if (SYSTRACE_LIBRARY_LOADING == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b7, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("MergedSoMapping.invokeJniOnload[");
        r9.append(r8);
        r9.append("]");
        com.facebook.soloader.Api18TraceUtils.beginTraceSection(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("About to merge: ");
        r9.append(r8);
        r9.append(" / ");
        r9.append(r7);
        r9.toString();
        com.facebook.soloader.MergedSoMapping.invokeJniOnload(r8);
        sLoadedAndMergedLibraries.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f2, code lost:
        if (SYSTRACE_LIBRARY_LOADING == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f4, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f8, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fb, code lost:
        if (SYSTRACE_LIBRARY_LOADING != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00fd, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0100, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0101, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0104, code lost:
        return !r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean loadLibraryBySoName(java.lang.String r7, @p201f.p202a.C5952h java.lang.String r8, @p201f.p202a.C5952h java.lang.String r9, int r10, @p201f.p202a.C5952h android.os.StrictMode.ThreadPolicy r11) {
        /*
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = sLoadedAndMergedLibraries
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = sLoadedLibraries     // Catch:{ all -> 0x0108 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0108 }
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r9 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0108 }
            return r2
        L_0x0020:
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = sLoadingLibraries     // Catch:{ all -> 0x0108 }
            boolean r4 = r4.containsKey(r7)     // Catch:{ all -> 0x0108 }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = sLoadingLibraries     // Catch:{ all -> 0x0108 }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x0108 }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x0108 }
            r4.<init>()     // Catch:{ all -> 0x0108 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = sLoadingLibraries     // Catch:{ all -> 0x0108 }
            r5.put(r7, r4)     // Catch:{ all -> 0x0108 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0108 }
            monitor-enter(r4)
            if (r1 != 0) goto L_0x00a0
            monitor-enter(r0)     // Catch:{ all -> 0x0105 }
            java.util.HashSet<java.lang.String> r5 = sLoadedLibraries     // Catch:{ all -> 0x009d }
            boolean r5 = r5.contains(r7)     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x004f
            if (r9 != 0) goto L_0x004e
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x0105 }
            return r2
        L_0x004e:
            r1 = 1
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x00a0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            r5.<init>()     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            java.lang.String r6 = "About to load: "
            r5.append(r6)     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            r5.append(r7)     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            r5.toString()     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            doLoadLibraryBySoName(r7, r10, r11)     // Catch:{ IOException -> 0x0096, UnsatisfiedLinkError -> 0x0080 }
            monitor-enter(r0)     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r10.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r11 = "Loaded: "
            r10.append(r11)     // Catch:{ all -> 0x007d }
            r10.append(r7)     // Catch:{ all -> 0x007d }
            r10.toString()     // Catch:{ all -> 0x007d }
            java.util.HashSet<java.lang.String> r10 = sLoadedLibraries     // Catch:{ all -> 0x007d }
            r10.add(r7)     // Catch:{ all -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            goto L_0x00a0
        L_0x007d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r7     // Catch:{ all -> 0x0105 }
        L_0x0080:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()     // Catch:{ all -> 0x0105 }
            if (r8 == 0) goto L_0x0095
            java.lang.String r9 = "unexpected e_machine:"
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x0105 }
            if (r8 == 0) goto L_0x0095
            com.facebook.soloader.SoLoader$WrongAbiError r8 = new com.facebook.soloader.SoLoader$WrongAbiError     // Catch:{ all -> 0x0105 }
            r8.<init>(r7)     // Catch:{ all -> 0x0105 }
            throw r8     // Catch:{ all -> 0x0105 }
        L_0x0095:
            throw r7     // Catch:{ all -> 0x0105 }
        L_0x0096:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0105 }
            r8.<init>(r7)     // Catch:{ all -> 0x0105 }
            throw r8     // Catch:{ all -> 0x0105 }
        L_0x009d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r7     // Catch:{ all -> 0x0105 }
        L_0x00a0:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0105 }
            if (r10 != 0) goto L_0x00af
            java.util.Set<java.lang.String> r10 = sLoadedAndMergedLibraries     // Catch:{ all -> 0x0105 }
            boolean r10 = r10.contains(r8)     // Catch:{ all -> 0x0105 }
            if (r10 == 0) goto L_0x00af
            r2 = 1
        L_0x00af:
            if (r9 == 0) goto L_0x0101
            if (r2 != 0) goto L_0x0101
            boolean r9 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0105 }
            if (r9 == 0) goto L_0x00d0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
            r9.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r10 = "MergedSoMapping.invokeJniOnload["
            r9.append(r10)     // Catch:{ all -> 0x0105 }
            r9.append(r8)     // Catch:{ all -> 0x0105 }
            java.lang.String r10 = "]"
            r9.append(r10)     // Catch:{ all -> 0x0105 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0105 }
            com.facebook.soloader.Api18TraceUtils.beginTraceSection(r9)     // Catch:{ all -> 0x0105 }
        L_0x00d0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r9.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = "About to merge: "
            r9.append(r10)     // Catch:{ all -> 0x00f8 }
            r9.append(r8)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = " / "
            r9.append(r10)     // Catch:{ all -> 0x00f8 }
            r9.append(r7)     // Catch:{ all -> 0x00f8 }
            r9.toString()     // Catch:{ all -> 0x00f8 }
            com.facebook.soloader.MergedSoMapping.invokeJniOnload(r8)     // Catch:{ all -> 0x00f8 }
            java.util.Set<java.lang.String> r7 = sLoadedAndMergedLibraries     // Catch:{ all -> 0x00f8 }
            r7.add(r8)     // Catch:{ all -> 0x00f8 }
            boolean r7 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0105 }
            if (r7 == 0) goto L_0x0101
            com.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x0105 }
            goto L_0x0101
        L_0x00f8:
            r7 = move-exception
            boolean r8 = SYSTRACE_LIBRARY_LOADING     // Catch:{ all -> 0x0105 }
            if (r8 == 0) goto L_0x0100
            com.facebook.soloader.Api18TraceUtils.endSection()     // Catch:{ all -> 0x0105 }
        L_0x0100:
            throw r7     // Catch:{ all -> 0x0105 }
        L_0x0101:
            monitor-exit(r4)     // Catch:{ all -> 0x0105 }
            r7 = r1 ^ 1
            return r7
        L_0x0105:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0105 }
            throw r7
        L_0x0108:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0108 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.loadLibraryBySoName(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    public static void init(Context context, boolean z) {
        try {
            init(context, z ? 1 : 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
