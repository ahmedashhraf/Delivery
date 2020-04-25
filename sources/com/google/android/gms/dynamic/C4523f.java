package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.dynamic.C4519d.C4520a;
import java.lang.reflect.Field;

@C4056a
/* renamed from: com.google.android.gms.dynamic.f */
public final class C4523f<T> extends C4520a {

    /* renamed from: b */
    private final T f13784b;

    private C4523f(T t) {
        this.f13784b = t;
    }

    @C4056a
    /* renamed from: a */
    public static <T> C4519d m19511a(T t) {
        return new C4523f(t);
    }

    @C4056a
    /* renamed from: d */
    public static <T> T m19512d(C4519d dVar) {
        if (dVar instanceof C4523f) {
            return ((C4523f) dVar).f13784b;
        }
        IBinder asBinder = dVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
