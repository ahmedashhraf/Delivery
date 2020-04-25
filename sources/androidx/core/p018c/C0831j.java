package androidx.core.p018c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.content.p020h.C0865d.C0868c;
import androidx.core.content.p020h.C0865d.C0869d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@RequiresApi(26)
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.c.j */
/* compiled from: TypefaceCompatApi26Impl */
public class C0831j extends C0829h {

    /* renamed from: A */
    private static final int f3940A = -1;

    /* renamed from: t */
    private static final String f3941t = "TypefaceCompatApi26Impl";

    /* renamed from: u */
    private static final String f3942u = "android.graphics.FontFamily";

    /* renamed from: v */
    private static final String f3943v = "addFontFromAssetManager";

    /* renamed from: w */
    private static final String f3944w = "addFontFromBuffer";

    /* renamed from: x */
    private static final String f3945x = "createFromFamiliesWithDefault";

    /* renamed from: y */
    private static final String f3946y = "freeze";

    /* renamed from: z */
    private static final String f3947z = "abortCreation";

    /* renamed from: m */
    protected final Class f3948m;

    /* renamed from: n */
    protected final Constructor f3949n;

    /* renamed from: o */
    protected final Method f3950o;

    /* renamed from: p */
    protected final Method f3951p;

    /* renamed from: q */
    protected final Method f3952q;

    /* renamed from: r */
    protected final Method f3953r;

    /* renamed from: s */
    protected final Method f3954s;

    public C0831j() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = mo4474a();
            constructor = mo4479e(a);
            method4 = mo4476b(a);
            method3 = mo4477c(a);
            method2 = mo4480f(a);
            method = mo4475a(a);
            Class cls2 = a;
            method5 = mo4478d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            sb.toString();
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3948m = cls;
        this.f3949n = constructor;
        this.f3950o = method4;
        this.f3951p = method3;
        this.f3952q = method2;
        this.f3953r = method;
        this.f3954s = method5;
    }

    /* renamed from: a */
    private boolean m4856a(Context context, Object obj, String str, int i, int i2, int i3, @C0195i0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3950o.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m4859b() {
        Method method = this.f3950o;
        return this.f3950o != null;
    }

    @C0195i0
    /* renamed from: c */
    private Object m4860c() {
        try {
            return this.f3949n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo4478d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f3945x, new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor mo4479e(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo4480f(Class cls) throws NoSuchMethodException {
        return cls.getMethod(f3946y, new Class[0]);
    }

    /* renamed from: c */
    private boolean m4861c(Object obj) {
        try {
            return ((Boolean) this.f3952q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m4858b(Object obj) {
        try {
            this.f3953r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo4477c(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f3944w, new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo4476b(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f3943v, new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: a */
    private boolean m4857a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3951p.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public Typeface mo4473a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3948m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3954s.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4471a(Context context, C0868c cVar, Resources resources, int i) {
        C0869d[] a;
        if (!m4859b()) {
            return super.mo4471a(context, cVar, resources, i);
        }
        Object c = m4860c();
        if (c == null) {
            return null;
        }
        for (C0869d dVar : cVar.mo4541a()) {
            if (!m4856a(context, c, dVar.mo4542a(), dVar.mo4544c(), dVar.mo4546e(), dVar.mo4547f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo4545d()))) {
                m4858b(c);
                return null;
            }
        }
        if (!m4861c(c)) {
            return null;
        }
        return mo4473a(c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0051 */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4470a(android.content.Context r11, @androidx.annotation.C0195i0 android.os.CancellationSignal r12, @androidx.annotation.C0193h0 androidx.core.provider.C1074a.C1091h[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m4859b()
            if (r0 != 0) goto L_0x0053
            androidx.core.provider.a$h r13 = r10.mo4483a(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.mo5260c()     // Catch:{ IOException -> 0x0052 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0052 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.mo5261d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.mo5262e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004b }
        L_0x004b:
            r12 = move-exception
            if (r11 == 0) goto L_0x0051
            r11.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r12     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r2
        L_0x0053:
            java.util.Map r11 = androidx.core.provider.C1074a.m6208a(r11, r13, r12)
            java.lang.Object r12 = r10.m4860c()
            if (r12 != 0) goto L_0x005e
            return r2
        L_0x005e:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0061:
            if (r9 >= r0) goto L_0x008e
            r4 = r13[r9]
            android.net.Uri r5 = r4.mo5260c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0072
            goto L_0x008b
        L_0x0072:
            int r6 = r4.mo5259b()
            int r7 = r4.mo5261d()
            boolean r8 = r4.mo5262e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m4857a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x008a
            r10.m4858b(r12)
            return r2
        L_0x008a:
            r3 = 1
        L_0x008b:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x008e:
            if (r3 != 0) goto L_0x0094
            r10.m4858b(r12)
            return r2
        L_0x0094:
            boolean r11 = r10.m4861c(r12)
            if (r11 != 0) goto L_0x009b
            return r2
        L_0x009b:
            android.graphics.Typeface r11 = r10.mo4473a(r12)
            if (r11 != 0) goto L_0x00a2
            return r2
        L_0x00a2:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p018c.C0831j.mo4470a(android.content.Context, android.os.CancellationSignal, androidx.core.provider.a$h[], int):android.graphics.Typeface");
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4472a(Context context, Resources resources, int i, String str, int i2) {
        if (!m4859b()) {
            return super.mo4472a(context, resources, i, str, i2);
        }
        Object c = m4860c();
        if (c == null) {
            return null;
        }
        if (!m4856a(context, c, str, 0, -1, -1, null)) {
            m4858b(c);
            return null;
        } else if (!m4861c(c)) {
            return null;
        } else {
            return mo4473a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo4474a() throws ClassNotFoundException {
        return Class.forName(f3942u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo4475a(Class cls) throws NoSuchMethodException {
        return cls.getMethod(f3947z, new Class[0]);
    }
}
