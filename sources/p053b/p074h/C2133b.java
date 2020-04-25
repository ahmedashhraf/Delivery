package p053b.p074h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import org.apache.http.cookie.C15222a;

/* renamed from: b.h.b */
/* compiled from: MultiDex */
public final class C2133b {

    /* renamed from: a */
    static final String f8497a = "MultiDex";

    /* renamed from: b */
    private static final String f8498b = "secondary-dexes";

    /* renamed from: c */
    private static final String f8499c = "code_cache";

    /* renamed from: d */
    private static final String f8500d = "secondary-dexes";

    /* renamed from: e */
    private static final int f8501e = 20;

    /* renamed from: f */
    private static final int f8502f = 4;

    /* renamed from: g */
    private static final int f8503g = 2;

    /* renamed from: h */
    private static final int f8504h = 1;

    /* renamed from: i */
    private static final String f8505i = "";

    /* renamed from: j */
    private static final Set<File> f8506j = new HashSet();

    /* renamed from: k */
    private static final boolean f8507k = m11104a(System.getProperty("java.vm.version"));

    /* renamed from: b.h.b$a */
    /* compiled from: MultiDex */
    private static final class C2134a {

        /* renamed from: b */
        private static final int f8508b = 4;

        /* renamed from: a */
        private final C2135a f8509a;

        /* renamed from: b.h.b$a$a */
        /* compiled from: MultiDex */
        private interface C2135a {
            /* renamed from: a */
            Object mo9223a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: b.h.b$a$b */
        /* compiled from: MultiDex */
        private static class C2136b implements C2135a {

            /* renamed from: a */
            private final Constructor<?> f8510a;

            C2136b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f8510a = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f8510a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo9223a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f8510a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: b.h.b$a$c */
        /* compiled from: MultiDex */
        private static class C2137c implements C2135a {

            /* renamed from: a */
            private final Constructor<?> f8511a;

            C2137c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f8511a = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f8511a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo9223a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f8511a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: b.h.b$a$d */
        /* compiled from: MultiDex */
        private static class C2138d implements C2135a {

            /* renamed from: a */
            private final Constructor<?> f8512a;

            C2138d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f8512a = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f8512a.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo9223a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f8512a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2134a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                b.h.b$a$b r1 = new b.h.b$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                b.h.b$a$c r1 = new b.h.b$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                b.h.b$a$d r1 = new b.h.b$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f8509a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p053b.p074h.C2133b.C2134a.<init>():void");
        }

        /* renamed from: a */
        static void m11112a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C2133b.m11106b(classLoader, "pathList").get(classLoader);
            Object[] a = new C2134a().m11113a(list);
            try {
                C2133b.m11108b(obj, "dexElements", a);
            } catch (NoSuchFieldException unused) {
                C2133b.m11108b(obj, "pathElements", a);
            }
        }

        /* renamed from: a */
        private Object[] m11113a(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            Object[] objArr = new Object[list.size()];
            for (int i = 0; i < objArr.length; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f8509a.mo9223a(file, DexFile.loadDex(file.getPath(), m11111a(file), 0));
            }
            return objArr;
        }

        /* renamed from: a */
        private static String m11111a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, name.length() - f8508b));
            sb.append(".dex");
            return new File(parentFile, sb.toString()).getPath();
        }
    }

    /* renamed from: b.h.b$b */
    /* compiled from: MultiDex */
    private static final class C2139b {
        private C2139b() {
        }

        /* renamed from: a */
        static void m11118a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C2133b.m11106b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C2133b.m11108b(obj, "dexElements", m11119a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field a = C2133b.m11106b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        /* renamed from: a */
        private static Object[] m11119a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C2133b.m11107b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: b.h.b$c */
    /* compiled from: MultiDex */
    private static final class C2140c {
        private C2140c() {
        }

        /* renamed from: a */
        static void m11120a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C2133b.m11106b(classLoader, C15222a.f44141w);
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            a.set(classLoader, sb.toString());
            C2133b.m11108b((Object) classLoader, "mPaths", (Object[]) strArr);
            C2133b.m11108b((Object) classLoader, "mFiles", (Object[]) fileArr);
            C2133b.m11108b((Object) classLoader, "mZips", (Object[]) zipFileArr);
            C2133b.m11108b((Object) classLoader, "mDexs", (Object[]) dexFileArr);
        }
    }

    private C2133b() {
    }

    /* renamed from: b */
    private static ApplicationInfo m11105b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static ClassLoader m11109c(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m11110d(Context context) {
        if (!f8507k) {
            if (VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo b = m11105b(context);
                    if (b != null) {
                        m11100a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MultiDex installation failed (");
                    sb.append(e.getMessage());
                    sb.append(").");
                    throw new RuntimeException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MultiDex installation failed. SDK ");
                sb2.append(VERSION.SDK_INT);
                sb2.append(" is unsupported. Min SDK version is ");
                sb2.append(4);
                sb2.append(".");
                throw new RuntimeException(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Field m11106b(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* renamed from: a */
    public static void m11099a(Context context, Context context2) {
        if (!f8507k) {
            String str = ".";
            if (VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo b = m11105b(context);
                    if (b != null) {
                        ApplicationInfo b2 = m11105b(context2);
                        if (b2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(context.getPackageName());
                            sb.append(str);
                            String sb2 = sb.toString();
                            File file = new File(b2.dataDir);
                            File file2 = new File(b.sourceDir);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("secondary-dexes");
                            m11100a(context2, file2, file, sb3.toString(), sb2, false);
                            m11100a(context2, new File(b2.sourceDir), file, "secondary-dexes", "", false);
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("MultiDex installation failed (");
                    sb4.append(e.getMessage());
                    sb4.append(").");
                    throw new RuntimeException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("MultiDex installation failed. SDK ");
                sb5.append(VERSION.SDK_INT);
                sb5.append(" is unsupported. Min SDK version is ");
                sb5.append(4);
                sb5.append(str);
                throw new RuntimeException(sb5.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Method m11107b(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC, Splitter:B:32:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11100a(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f8506j
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = f8506j     // Catch:{ all -> 0x0088 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = f8506j     // Catch:{ all -> 0x0088 }
            r1.add(r5)     // Catch:{ all -> 0x0088 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0088 }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0088 }
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = ": SDK version higher than "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = " should be backed by "
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "case here: java.vm.version=\""
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0088 }
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            r1.toString()     // Catch:{ all -> 0x0088 }
        L_0x004f:
            java.lang.ClassLoader r1 = m11109c(r4)     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x0057:
            m11098a(r4)     // Catch:{ all -> 0x005a }
        L_0x005a:
            java.io.File r6 = m11095a(r4, r6, r7)     // Catch:{ all -> 0x0088 }
            b.h.d r7 = new b.h.d     // Catch:{ all -> 0x0088 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0088 }
            r5 = 0
            r2 = 0
            java.util.List r2 = r7.mo9225a(r4, r8, r2)     // Catch:{ all -> 0x0083 }
            m11102a(r1, r6, r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0078
        L_0x006d:
            r2 = move-exception
            if (r9 == 0) goto L_0x0082
            r9 = 1
            java.util.List r4 = r7.mo9225a(r4, r8, r9)     // Catch:{ all -> 0x0083 }
            m11102a(r1, r6, r4)     // Catch:{ all -> 0x0083 }
        L_0x0078:
            r7.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r5 = move-exception
        L_0x007d:
            if (r5 != 0) goto L_0x0081
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x0081:
            throw r5     // Catch:{ all -> 0x0088 }
        L_0x0082:
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            throw r4     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p074h.C2133b.m11100a(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11108b(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field b = m11106b(obj, str);
        Object[] objArr2 = (Object[]) b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b.set(obj, objArr3);
    }

    /* renamed from: a */
    static boolean m11104a(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        sb.toString();
        return z;
    }

    /* renamed from: a */
    private static void m11102a(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            int i = VERSION.SDK_INT;
            if (i >= 19) {
                C2139b.m11118a(classLoader, list, file);
            } else if (i >= 14) {
                C2134a.m11112a(classLoader, list);
            } else {
                C2140c.m11120a(classLoader, list);
            }
        }
    }

    /* renamed from: a */
    private static void m11098a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            String str = ").";
            sb.append(str);
            sb.toString();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(str);
                sb2.toString();
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                sb3.toString();
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                    sb4.toString();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                    sb5.toString();
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                sb6.toString();
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Deleted old secondary dex dir ");
                sb7.append(file.getPath());
                sb7.toString();
            }
        }
    }

    /* renamed from: a */
    private static File m11095a(Context context, File file, String str) throws IOException {
        String str2 = f8499c;
        File file2 = new File(file, str2);
        try {
            m11101a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), str2);
            m11101a(file2);
        }
        File file3 = new File(file2, str);
        m11101a(file3);
        return file3;
    }

    /* renamed from: a */
    private static void m11101a(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            String str = "Failed to create dir ";
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to create directory ");
            sb3.append(file.getPath());
            throw new IOException(sb3.toString());
        }
    }
}
