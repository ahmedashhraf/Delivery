package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4488i;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p201f.p202a.p203u.C5966a;

@C4056a
public final class DynamiteModule {
    @C5966a("DynamiteModule.class")

    /* renamed from: b */
    private static Boolean f13802b = null;
    @C5966a("DynamiteModule.class")

    /* renamed from: c */
    private static C4546i f13803c = null;
    @C5966a("DynamiteModule.class")

    /* renamed from: d */
    private static C4548k f13804d = null;
    @C5966a("DynamiteModule.class")

    /* renamed from: e */
    private static String f13805e = null;
    @C5966a("DynamiteModule.class")

    /* renamed from: f */
    private static int f13806f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C4536b> f13807g = new ThreadLocal<>();

    /* renamed from: h */
    private static final C4534a f13808h = new C4538a();
    @C4056a

    /* renamed from: i */
    public static final C4533a f13809i = new C4539b();
    @C4056a

    /* renamed from: j */
    public static final C4533a f13810j = new C4540c();
    @C4056a

    /* renamed from: k */
    public static final C4533a f13811k = new C4541d();
    @C4056a

    /* renamed from: l */
    public static final C4533a f13812l = new C4542e();
    @C4056a

    /* renamed from: m */
    public static final C4533a f13813m = new C4543f();

    /* renamed from: n */
    private static final C4533a f13814n = new C4544g();

    /* renamed from: a */
    private final Context f13815a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @C5966a("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @C4056a
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, C4538a aVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C4538a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C4533a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C4534a {
            /* renamed from: a */
            int mo18638a(Context context, String str);

            /* renamed from: a */
            int mo18639a(Context context, String str, boolean z) throws LoadingException;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C4535b {

            /* renamed from: a */
            public int f13816a = 0;

            /* renamed from: b */
            public int f13817b = 0;

            /* renamed from: c */
            public int f13818c = 0;
        }

        /* renamed from: a */
        C4535b mo18637a(Context context, String str, C4534a aVar) throws LoadingException;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    private static class C4536b {

        /* renamed from: a */
        public Cursor f13819a;

        private C4536b() {
        }

        /* synthetic */ C4536b(C4538a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C4537c implements C4534a {

        /* renamed from: a */
        private final int f13820a;

        /* renamed from: b */
        private final int f13821b = 0;

        public C4537c(int i, int i2) {
            this.f13820a = i;
        }

        /* renamed from: a */
        public final int mo18638a(Context context, String str) {
            return this.f13820a;
        }

        /* renamed from: a */
        public final int mo18639a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        this.f13815a = (Context) C4300a0.m18620a(context);
    }

    @C4056a
    /* renamed from: a */
    public static DynamiteModule m19544a(Context context, C4533a aVar, String str) throws LoadingException {
        C4535b a;
        String str2 = ":";
        C4536b bVar = (C4536b) f13807g.get();
        C4536b bVar2 = new C4536b(null);
        f13807g.set(bVar2);
        try {
            a = aVar.mo18637a(context, str, f13808h);
            int i = a.f13816a;
            int i2 = a.f13817b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(str2);
            sb.append(i2);
            sb.toString();
            if (a.f13818c == 0 || ((a.f13818c == -1 && a.f13816a == 0) || (a.f13818c == 1 && a.f13817b == 0))) {
                int i3 = a.f13816a;
                int i4 = a.f13817b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (C4538a) null);
            } else if (a.f13818c == -1) {
                DynamiteModule c = m19553c(context, str);
                Cursor cursor = bVar2.f13819a;
                if (cursor != null) {
                    cursor.close();
                }
                f13807g.set(bVar);
                return c;
            } else if (a.f13818c == 1) {
                DynamiteModule a2 = m19545a(context, str, a.f13817b);
                Cursor cursor2 = bVar2.f13819a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f13807g.set(bVar);
                return a2;
            } else {
                int i5 = a.f13818c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (C4538a) null);
            }
        } catch (LoadingException e) {
            String str3 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            if (a.f13816a == 0 || aVar.mo18637a(context, str, new C4537c(a.f13816a, 0)).f13818c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, null);
            }
            DynamiteModule c2 = m19553c(context, str);
            Cursor cursor3 = bVar2.f13819a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f13807g.set(bVar);
            return c2;
        } catch (Throwable th) {
            Cursor cursor4 = bVar2.f13819a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f13807g.set(bVar);
            throw th;
        }
    }

    /* renamed from: b */
    private static int m19549b(Context context, String str, boolean z) {
        C4546i a = m19546a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo18641B0() >= 2) {
                return a.mo18642a(C4523f.m19511a(context), str, z);
            }
            return a.mo18644b(C4523f.m19511a(context), str, z);
        } catch (RemoteException e) {
            String str2 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m19552c(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r8 == 0) goto L_0x008c
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 == 0) goto L_0x008c
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007a }
            f13805e = r1     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007a }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007a }
            f13806f = r1     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = f13807g     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            com.google.android.gms.dynamite.DynamiteModule$b r10 = (com.google.android.gms.dynamite.DynamiteModule.C4536b) r10     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r1 = r10.f13819a     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r1 != 0) goto L_0x007d
            r10.f13819a = r8     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a7
        L_0x0087:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0098
        L_0x008c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x0094:
            r8 = move-exception
            goto L_0x00a7
        L_0x0096:
            r8 = move-exception
            r9 = r0
        L_0x0098:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x009d
            throw r8     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a5 }
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m19552c(android.content.Context, java.lang.String, boolean):int");
    }

    @C4056a
    /* renamed from: b */
    public static int m19548b(Context context, String str) {
        return m19543a(context, str, false);
    }

    /* renamed from: b */
    private static DynamiteModule m19550b(Context context, String str, int i) throws LoadingException, RemoteException {
        C4548k kVar;
        C4519d dVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        sb.toString();
        synchronized (DynamiteModule.class) {
            kVar = f13804d;
        }
        if (kVar != null) {
            C4536b bVar = (C4536b) f13807g.get();
            if (bVar == null || bVar.f13819a == null) {
                throw new LoadingException("No result cursor", (C4538a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = bVar.f13819a;
            C4523f.m19511a(null);
            if (m19551b().booleanValue()) {
                dVar = kVar.mo18647b(C4523f.m19511a(applicationContext), str, i, C4523f.m19511a(cursor));
            } else {
                dVar = kVar.mo18646a(C4523f.m19511a(applicationContext), str, i, C4523f.m19511a(cursor));
            }
            Context context2 = (Context) C4523f.m19512d(dVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (C4538a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (C4538a) null);
    }

    /* renamed from: c */
    private static DynamiteModule m19553c(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: b */
    private static Boolean m19551b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f13806f >= 2);
        }
        return valueOf;
    }

    @C4056a
    /* renamed from: a */
    public static int m19542a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            sb2.toString();
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            sb3.toString();
            return 0;
        } catch (Exception e) {
            String str2 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2.concat(valueOf2);
            } else {
                new String(str2);
            }
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:40|41|42|43|51|52|53|54|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb A[SYNTHETIC, Splitter:B:56:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc A[Catch:{ LoadingException -> 0x00c0, all -> 0x00e4 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19543a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.Boolean r1 = f13802b     // Catch:{ all -> 0x00e1 }
            if (r1 != 0) goto L_0x00b4
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m19547a(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m19552c(r8, r9, r10)     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r5 = f13805e     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f13805e     // Catch:{ LoadingException -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r6 = f13805e     // Catch:{ LoadingException -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007e }
            m19547a(r5)     // Catch:{ LoadingException -> 0x007e }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007e }
            f13802b = r5     // Catch:{ LoadingException -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b2
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x0092
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e1 }
            int r2 = r2.length()     // Catch:{ all -> 0x00e1 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r3.<init>(r2)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "Failed to load module via V2: "
            r3.append(r2)     // Catch:{ all -> 0x00e1 }
            r3.append(r1)     // Catch:{ all -> 0x00e1 }
            r3.toString()     // Catch:{ all -> 0x00e1 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00e1 }
        L_0x00b2:
            f13802b = r1     // Catch:{ all -> 0x00e1 }
        L_0x00b4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00dc
            int r8 = m19552c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00c0 }
            return r8
        L_0x00c0:
            r9 = move-exception
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00e4 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e4 }
            int r0 = r9.length()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00d5
            r10.concat(r9)     // Catch:{ all -> 0x00e4 }
            goto L_0x00da
        L_0x00d5:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00e4 }
            r9.<init>(r10)     // Catch:{ all -> 0x00e4 }
        L_0x00da:
            r8 = 0
            return r8
        L_0x00dc:
            int r8 = m19549b(r8, r9, r10)     // Catch:{ all -> 0x00e4 }
            return r8
        L_0x00e1:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
            throw r9     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r9 = move-exception
            com.google.android.gms.common.util.C4488i.m19364a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m19543a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static DynamiteModule m19545a(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        C4519d dVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f13802b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (C4538a) null);
            } else if (bool.booleanValue()) {
                return m19550b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                sb.toString();
                C4546i a = m19546a(context);
                if (a != null) {
                    if (a.mo18641B0() >= 2) {
                        dVar = a.mo18645b(C4523f.m19511a(context), str, i);
                    } else {
                        dVar = a.mo18643a(C4523f.m19511a(context), str, i);
                    }
                    if (C4523f.m19512d(dVar) != null) {
                        return new DynamiteModule((Context) C4523f.m19512d(dVar));
                    }
                    throw new LoadingException("Failed to load remote module.", (C4538a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (C4538a) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            C4488i.m19364a(context, th);
            throw new LoadingException("Failed to load remote module.", th, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.C4546i m19546a(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.i r1 = f13803c     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.i r4 = f13803c     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x000b:
            com.google.android.gms.common.f r1 = com.google.android.gms.common.C4282f.m18511a()     // Catch:{ all -> 0x0069 }
            int r1 = r1.mo18113d(r4)     // Catch:{ all -> 0x0069 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004d }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x004d }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x004d }
            if (r4 != 0) goto L_0x0033
            r4 = r2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004d }
            boolean r3 = r1 instanceof com.google.android.gms.dynamite.C4546i     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0041
            r4 = r1
            com.google.android.gms.dynamite.i r4 = (com.google.android.gms.dynamite.C4546i) r4     // Catch:{ Exception -> 0x004d }
            goto L_0x0047
        L_0x0041:
            com.google.android.gms.dynamite.j r1 = new com.google.android.gms.dynamite.j     // Catch:{ Exception -> 0x004d }
            r1.<init>(r4)     // Catch:{ Exception -> 0x004d }
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x0067
            f13803c = r4     // Catch:{ Exception -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x004d:
            r4 = move-exception
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0069 }
            int r3 = r4.length()     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r1.concat(r4)     // Catch:{ all -> 0x0069 }
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0069 }
            r4.<init>(r1)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0069:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m19546a(android.content.Context):com.google.android.gms.dynamite.i");
    }

    @C4056a
    /* renamed from: a */
    public final Context mo18635a() {
        return this.f13815a;
    }

    @C5966a("DynamiteModule.class")
    /* renamed from: a */
    private static void m19547a(ClassLoader classLoader) throws LoadingException {
        C4548k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C4548k) {
                    kVar = (C4548k) queryLocalInterface;
                } else {
                    kVar = new C4549l(iBinder);
                }
            }
            f13804d = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    @C4056a
    /* renamed from: a */
    public final IBinder mo18636a(String str) throws LoadingException {
        try {
            return (IBinder) this.f13815a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }
}
