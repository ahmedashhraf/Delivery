package androidx.core.p018c;

import android.graphics.Typeface;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.c.k */
/* compiled from: TypefaceCompatApi28Impl */
public class C0832k extends C0831j {

    /* renamed from: B */
    private static final String f3955B = "createFromFamiliesWithDefault";

    /* renamed from: C */
    private static final int f3956C = -1;

    /* renamed from: D */
    private static final String f3957D = "sans-serif";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4473a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3948m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3954s.invoke(null, new Object[]{newInstance, f3957D, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo4478d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(f3955B, new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
