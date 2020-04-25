package kotlin.p219v0;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.v0.m */
/* compiled from: ArraysJVM.kt */
class C14791m {
    @C6041f
    /* renamed from: a */
    private static final String m64069a(@C6003d byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    /* renamed from: a */
    private static final <T> T[] m64070a(@C6003d Collection<? extends T> collection) {
        if (collection != null) {
            C14445h0.m62450a(0, "T?");
            T[] array = collection.toArray(new Object[0]);
            if (array != null) {
                return array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    @C6003d
    /* renamed from: a */
    public static final <T> T[] m64072a(@C6003d T[] tArr, int i) {
        C14445h0.m62478f(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        if (newInstance != null) {
            return (Object[]) newInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private static final <T> T[] m64071a(@C6004e T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        C14445h0.m62450a(0, "T?");
        return new Object[0];
    }
}
