package androidx.core.p018c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.collection.C0649h;
import androidx.core.content.p020h.C0865d.C0868c;
import androidx.core.content.p020h.C0865d.C0869d;
import androidx.core.provider.C1074a.C1091h;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(24)
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.c.i */
/* compiled from: TypefaceCompatApi24Impl */
class C0830i extends C0833l {

    /* renamed from: d */
    private static final String f3932d = "TypefaceCompatApi24Impl";

    /* renamed from: e */
    private static final String f3933e = "android.graphics.FontFamily";

    /* renamed from: f */
    private static final String f3934f = "addFontWeightStyle";

    /* renamed from: g */
    private static final String f3935g = "createFromFamiliesWithDefault";

    /* renamed from: h */
    private static final Class f3936h;

    /* renamed from: i */
    private static final Constructor f3937i;

    /* renamed from: j */
    private static final Method f3938j;

    /* renamed from: k */
    private static final Method f3939k;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName(f3933e);
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod(f3934f, new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            Object newInstance = Array.newInstance(cls, 1);
            method2 = Typeface.class.getMethod(f3935g, new Class[]{newInstance.getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method2 = null;
            method = null;
        }
        f3937i = constructor;
        f3936h = cls;
        f3938j = method;
        f3939k = method2;
    }

    C0830i() {
    }

    /* renamed from: a */
    public static boolean m4851a() {
        Method method = f3938j;
        return f3938j != null;
    }

    /* renamed from: b */
    private static Object m4853b() {
        try {
            return f3937i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m4852a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3938j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Typeface m4850a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3936h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3939k.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4470a(Context context, @C0195i0 CancellationSignal cancellationSignal, @C0193h0 C1091h[] hVarArr, int i) {
        Object b = m4853b();
        if (b == null) {
            return null;
        }
        C0649h hVar = new C0649h();
        for (C1091h hVar2 : hVarArr) {
            Uri c = hVar2.mo5260c();
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C0837m.m4897a(context, cancellationSignal, c);
                hVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m4852a(b, byteBuffer, hVar2.mo5259b(), hVar2.mo5261d(), hVar2.mo5262e())) {
                return null;
            }
        }
        Typeface a = m4850a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4471a(Context context, C0868c cVar, Resources resources, int i) {
        C0869d[] a;
        Object b = m4853b();
        if (b == null) {
            return null;
        }
        for (C0869d dVar : cVar.mo4541a()) {
            ByteBuffer a2 = C0837m.m4896a(context, resources, dVar.mo4543b());
            if (a2 == null || !m4852a(b, a2, dVar.mo4544c(), dVar.mo4546e(), dVar.mo4547f())) {
                return null;
            }
        }
        return m4850a(b);
    }
}
