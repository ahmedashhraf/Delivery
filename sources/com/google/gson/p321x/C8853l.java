package com.google.gson.p321x;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.x.l */
/* compiled from: UnsafeAllocator */
public abstract class C8853l {

    /* renamed from: com.google.gson.x.l$a */
    /* compiled from: UnsafeAllocator */
    static class C8854a extends C8853l {

        /* renamed from: a */
        final /* synthetic */ Method f23210a;

        /* renamed from: b */
        final /* synthetic */ Object f23211b;

        C8854a(Method method, Object obj) {
            this.f23210a = method;
            this.f23211b = obj;
        }

        /* renamed from: a */
        public <T> T mo32608a(Class<T> cls) throws Exception {
            C8853l.m41448b(cls);
            return this.f23210a.invoke(this.f23211b, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.x.l$b */
    /* compiled from: UnsafeAllocator */
    static class C8855b extends C8853l {

        /* renamed from: a */
        final /* synthetic */ Method f23212a;

        /* renamed from: b */
        final /* synthetic */ int f23213b;

        C8855b(Method method, int i) {
            this.f23212a = method;
            this.f23213b = i;
        }

        /* renamed from: a */
        public <T> T mo32608a(Class<T> cls) throws Exception {
            C8853l.m41448b(cls);
            return this.f23212a.invoke(null, new Object[]{cls, Integer.valueOf(this.f23213b)});
        }
    }

    /* renamed from: com.google.gson.x.l$c */
    /* compiled from: UnsafeAllocator */
    static class C8856c extends C8853l {

        /* renamed from: a */
        final /* synthetic */ Method f23214a;

        C8856c(Method method) {
            this.f23214a = method;
        }

        /* renamed from: a */
        public <T> T mo32608a(Class<T> cls) throws Exception {
            C8853l.m41448b(cls);
            return this.f23214a.invoke(null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.x.l$d */
    /* compiled from: UnsafeAllocator */
    static class C8857d extends C8853l {
        C8857d() {
        }

        /* renamed from: a */
        public <T> T mo32608a(Class<T> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot allocate ");
            sb.append(cls);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C8853l m41447a() {
        String str = "newInstance";
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C8854a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C8855b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C8856c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C8857d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m41448b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo32608a(Class<T> cls) throws Exception;
}
