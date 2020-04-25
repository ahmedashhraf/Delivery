package com.google.android.play.core.internal;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.internal.NativeProtocol;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: com.google.android.play.core.internal.a0 */
public class C5732a0 {
    /* renamed from: a */
    public static Bundle m25194a(List<String> list, List<String> list2) {
        Bundle bundle = new Bundle();
        bundle.putInt(SessionEntry.COLUMN_ID, 0);
        bundle.putInt("status", 5);
        bundle.putInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE, 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(list));
        }
        if (!list2.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(list2));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        return bundle;
    }

    /* renamed from: a */
    public static <T> C5737c0<T> m25195a(Object obj, String str, Class<T> cls) {
        return new C5737c0<>(obj, m25202a(obj, str), cls);
    }

    /* renamed from: a */
    public static <R, P0> R m25196a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m25203a(cls, str, (Class<?>[]) new Class[]{cls3}).invoke(null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1> R m25197a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m25203a(cls, str, (Class<?>[]) new Class[]{cls3, cls4}).invoke(null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <T> T m25198a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static <R, P0> R m25199a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m25204a(obj, str, (Class<?>[]) new Class[]{cls2}).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1, P2> R m25200a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m25204a(obj, str, (Class<?>[]) new Class[]{cls2, cls3, cls4}).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C5736bb(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    public static String m25201a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(C14248i.f42026i);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static Field m25202a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C5736bb(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: a */
    private static Method m25203a(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C5736bb(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: a */
    private static Method m25204a(Object obj, String str, Class<?>... clsArr) {
        return m25203a(obj.getClass(), str, clsArr);
    }

    /* renamed from: a */
    public static void m25205a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static X509Certificate[][] m25206a(String str) throws C7127c, IOException {
        return C5762t0.m25293a(str);
    }

    /* renamed from: b */
    public static <T> C5737c0 m25207b(Object obj, String str, Class<T> cls) {
        return new C5737c0(obj, m25202a(obj, str), cls, 0);
    }
}
