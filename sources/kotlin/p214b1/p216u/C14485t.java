package kotlin.p214b1.p216u;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6055e(name = "CollectionToArray")
/* renamed from: kotlin.b1.u.t */
/* compiled from: CollectionToArray.kt */
public final class C14485t {

    /* renamed from: a */
    private static final Object[] f42613a = new Object[0];

    /* renamed from: b */
    private static final int f42614b = 2147483645;

    /* renamed from: a */
    private static final Object[] m62652a(Collection<?> collection, C6069a<Object[]> aVar, C6080l<? super Integer, Object[]> lVar, C6084p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return (Object[]) aVar.mo24947p();
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return (Object[]) aVar.mo24947p();
        }
        Object[] objArr = (Object[]) lVar.invoke(Integer.valueOf(size));
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it.next();
            if (i2 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 < f42614b) {
                        i3 = f42614b;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i3);
                C14445h0.m62453a((Object) objArr, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return (Object[]) pVar.mo24962d(objArr, Integer.valueOf(i2));
            }
            i = i2;
        }
    }

    @C6003d
    @C6055e(name = "toArray")
    /* renamed from: a */
    public static final Object[] m62651a(@C6003d Collection<?> collection) {
        C14445h0.m62478f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < f42614b) {
                                i3 = f42614b;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C14445h0.m62453a((Object) objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C14445h0.m62453a((Object) copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f42613a;
    }

    @C6003d
    @C6055e(name = "toArray")
    /* renamed from: a */
    public static final Object[] m62653a(@C6003d Collection<?> collection, @C6004e Object[] objArr) {
        Object[] objArr2;
        C14445h0.m62478f(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                Iterator it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArr2[i] = it.next();
                        if (i2 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < f42614b) {
                                    i3 = f42614b;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            C14445h0.m62453a((Object) objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            C14445h0.m62453a((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i = i2;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
