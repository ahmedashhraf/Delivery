package androidx.core.p018c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.content.p020h.C0865d.C0868c;
import androidx.core.content.p020h.C0865d.C0869d;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.c.h */
/* compiled from: TypefaceCompatApi21Impl */
class C0829h extends C0833l {

    /* renamed from: d */
    private static final String f3923d = "TypefaceCompatApi21Impl";

    /* renamed from: e */
    private static final String f3924e = "android.graphics.FontFamily";

    /* renamed from: f */
    private static final String f3925f = "addFontWeightStyle";

    /* renamed from: g */
    private static final String f3926g = "createFromFamiliesWithDefault";

    /* renamed from: h */
    private static Class f3927h = null;

    /* renamed from: i */
    private static Constructor f3928i = null;

    /* renamed from: j */
    private static Method f3929j = null;

    /* renamed from: k */
    private static Method f3930k = null;

    /* renamed from: l */
    private static boolean f3931l = false;

    C0829h() {
    }

    /* renamed from: a */
    private static void mo4474a() {
        Method method;
        Class cls;
        Method method2;
        if (!f3931l) {
            f3931l = true;
            Constructor constructor = null;
            try {
                cls = Class.forName(f3924e);
                Constructor constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod(f3925f, new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                Object newInstance = Array.newInstance(cls, 1);
                method2 = Typeface.class.getMethod(f3926g, new Class[]{newInstance.getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.getClass().getName();
                method2 = null;
                cls = null;
                method = null;
            }
            f3928i = constructor;
            f3927h = cls;
            f3929j = method;
            f3930k = method2;
        }
    }

    /* renamed from: b */
    private static Object m4847b() {
        mo4474a();
        try {
            return f3928i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m4844a(@C0193h0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static Typeface mo4473a(Object obj) {
        mo4474a();
        try {
            Object newInstance = Array.newInstance(f3927h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3930k.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m4846a(Object obj, String str, int i, boolean z) {
        mo4474a();
        try {
            return ((Boolean) f3929j.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4470a(android.content.Context r4, android.os.CancellationSignal r5, @androidx.annotation.C0193h0 androidx.core.provider.C1074a.C1091h[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            androidx.core.provider.a$h r6 = r3.mo4483a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.mo5260c()     // Catch:{ IOException -> 0x005d }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x005d }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.m4844a(r5)     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0054 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0054 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0054 }
            r6.<init>(r7)     // Catch:{ all -> 0x0054 }
            android.graphics.Typeface r4 = super.mo4481a(r4, r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r4 = move-exception
            if (r5 == 0) goto L_0x005c
            r5.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r4     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p018c.C0829h.mo4470a(android.content.Context, android.os.CancellationSignal, androidx.core.provider.a$h[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo4471a(Context context, C0868c cVar, Resources resources, int i) {
        Object b = m4847b();
        C0869d[] a = cVar.mo4541a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0869d dVar = a[i2];
            File a2 = C0837m.m4895a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C0837m.m4900a(a2, resources, dVar.mo4543b())) {
                    a2.delete();
                    return null;
                } else if (!m4846a(b, a2.getPath(), dVar.mo4546e(), dVar.mo4547f())) {
                    return null;
                } else {
                    a2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo4473a(b);
    }
}
