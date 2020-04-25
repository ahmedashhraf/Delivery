package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.core.content.C0841b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p076c.p112d.p113a.p114a.p118d.p123e.C2632m;

/* renamed from: com.google.firebase.iid.v0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8726v0 {
    C8726v0() {
    }

    @C0195i0
    /* renamed from: c */
    private final C8730x0 m40911c(Context context, String str) throws C8732y0 {
        try {
            C8730x0 d = m40912d(context, str);
            if (d != null) {
                m40905a(context, str, d);
                return d;
            }
            e = null;
            try {
                C8730x0 a = m40900a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m40899a(context, str, a, false);
                    return a;
                }
            } catch (C8732y0 e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C8732y0 e2) {
            e = e2;
        }
    }

    @C0195i0
    /* renamed from: d */
    private final C8730x0 m40912d(Context context, String str) throws C8732y0 {
        File e = m40913e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m40901a(e);
        } catch (C8732y0 | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(valueOf);
                sb.toString();
            }
            try {
                return m40901a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                sb2.toString();
                throw new C8732y0((Exception) e3);
            }
        }
    }

    /* renamed from: e */
    private static File m40913e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m40910b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final C8730x0 mo32160a(Context context, String str) throws C8732y0 {
        C8730x0 c = m40911c(context, str);
        if (c != null) {
            return c;
        }
        return mo32161b(context, str);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final C8730x0 mo32161b(Context context, String str) {
        C8730x0 x0Var = new C8730x0(C8705l.m40848a(C8687d0.m40833a().getPublic()), System.currentTimeMillis());
        C8730x0 a = m40899a(context, str, x0Var, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(x0Var)) {
            boolean isLoggable = Log.isLoggable(str2, 3);
            m40905a(context, str, x0Var);
            return x0Var;
        }
        boolean isLoggable2 = Log.isLoggable(str2, 3);
        return a;
    }

    /* renamed from: a */
    static void m40904a(Context context) {
        File[] listFiles;
        for (File file : m40910b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static PublicKey m40903a(String str) throws C8732y0 {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                sb.toString();
                throw new C8732y0((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C8732y0((Exception) e2);
        }
    }

    /* renamed from: b */
    private static File m40910b(Context context) {
        File f = C0841b.m4932f(context);
        if (f == null || !f.isDirectory()) {
            return context.getFilesDir();
        }
        return f;
    }

    /* renamed from: b */
    private static long m40909b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C8727w.m40916a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r9 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        m40908a(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        m40907a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        throw r11;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0050=Splitter:B:16:0x0050, B:28:0x008a=Splitter:B:28:0x008a} */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C8730x0 m40899a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C8730x0 r11, boolean r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r11.mo32173a()
            java.lang.String r4 = "id"
            r2.setProperty(r4, r3)
            long r3 = r11.f22889b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m40913e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x009e }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x009e }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x009e }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x0097 }
            r9.lock()     // Catch:{ all -> 0x008e }
            r4 = 0
            if (r12 == 0) goto L_0x007b
            long r6 = r9.size()     // Catch:{ all -> 0x008e }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x007b
            r9.position(r4)     // Catch:{ IOException -> 0x0056, y0 -> 0x0054 }
            com.google.firebase.iid.x0 r11 = m40902a(r9)     // Catch:{ IOException -> 0x0056, y0 -> 0x0054 }
            if (r9 == 0) goto L_0x0050
            m40908a(r10, r9)     // Catch:{ all -> 0x0097 }
        L_0x0050:
            m40907a(r10, r3)     // Catch:{ IOException -> 0x009e }
            return r11
        L_0x0054:
            r12 = move-exception
            goto L_0x0057
        L_0x0056:
            r12 = move-exception
        L_0x0057:
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x007b
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x008e }
            int r0 = r0.length()     // Catch:{ all -> 0x008e }
            int r0 = r0 + 58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Tried reading ID before writing new one, but failed with: "
            r1.append(r0)     // Catch:{ all -> 0x008e }
            r1.append(r12)     // Catch:{ all -> 0x008e }
            r1.toString()     // Catch:{ all -> 0x008e }
        L_0x007b:
            r9.truncate(r4)     // Catch:{ all -> 0x008e }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x008e }
            r2.store(r12, r10)     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x008a
            m40908a(r10, r9)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            m40907a(r10, r3)     // Catch:{ IOException -> 0x009e }
            return r11
        L_0x008e:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r12 = move-exception
            if (r9 == 0) goto L_0x0096
            m40908a(r11, r9)     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r12     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r11 = move-exception
            m40907a(r9, r3)     // Catch:{ IOException -> 0x009e }
            throw r11     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            r12.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8726v0.m40899a(android.content.Context, java.lang.String, com.google.firebase.iid.x0, boolean):com.google.firebase.iid.x0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r8 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        m40908a(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        m40906a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C8730x0 m40901a(java.io.File r8) throws com.google.firebase.iid.C8732y0, java.io.IOException {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002c }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0023 }
            com.google.firebase.iid.x0 r1 = m40902a(r8)     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r8 == 0) goto L_0x001f
            m40908a(r2, r8)     // Catch:{ all -> 0x002c }
        L_0x001f:
            m40906a(r2, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            if (r8 == 0) goto L_0x002b
            m40908a(r1, r8)     // Catch:{ all -> 0x002c }
        L_0x002b:
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            m40906a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8726v0.m40901a(java.io.File):com.google.firebase.iid.x0");
    }

    /* renamed from: a */
    private static C8730x0 m40902a(FileChannel fileChannel) throws C8732y0, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C8705l.m40848a(m40903a(property2));
                } else {
                    throw new C8732y0("Invalid properties file");
                }
            }
            return new C8730x0(property, parseLong);
        } catch (NumberFormatException e) {
            throw new C8732y0((Exception) e);
        }
    }

    @C0195i0
    /* renamed from: a */
    private static C8730x0 m40900a(SharedPreferences sharedPreferences, String str) throws C8732y0 {
        long b = m40909b(sharedPreferences, str);
        String string = sharedPreferences.getString(C8727w.m40916a(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C8727w.m40916a(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = C8705l.m40848a(m40903a(string2));
        }
        return new C8730x0(string, b);
    }

    /* renamed from: a */
    private final void m40905a(Context context, String str, C8730x0 x0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (x0Var.equals(m40900a(sharedPreferences, str))) {
                return;
            }
        } catch (C8732y0 unused) {
        }
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        Editor edit = sharedPreferences.edit();
        edit.putString(C8727w.m40916a(str, "id"), x0Var.mo32173a());
        edit.putString(C8727w.m40916a(str, "cre"), String.valueOf(x0Var.f22889b));
        edit.commit();
    }

    /* renamed from: a */
    private static /* synthetic */ void m40908a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C2632m.m12742a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m40907a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C2632m.m12742a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m40906a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C2632m.m12742a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
