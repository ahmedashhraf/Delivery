package p076c.p112d.p148d.p280h;

import com.google.common.base.C7397x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: c.d.d.h.i */
/* compiled from: TypeCapture */
abstract class C6683i<T> {
    C6683i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Type mo26814a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C7397x.m35672a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
