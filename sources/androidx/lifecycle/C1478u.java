package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.u */
/* compiled from: ViewModelProvider */
public class C1478u {

    /* renamed from: c */
    private static final String f5736c = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* renamed from: a */
    private final C1480b f5737a;

    /* renamed from: b */
    private final C1483v f5738b;

    /* renamed from: androidx.lifecycle.u$a */
    /* compiled from: ViewModelProvider */
    public static class C1479a extends C1482d {

        /* renamed from: b */
        private static C1479a f5739b;

        /* renamed from: a */
        private Application f5740a;

        public C1479a(@C0193h0 Application application) {
            this.f5740a = application;
        }

        @C0193h0
        /* renamed from: a */
        public static C1479a m7745a(@C0193h0 Application application) {
            if (f5739b == null) {
                f5739b = new C1479a(application);
            }
            return f5739b;
        }

        @C0193h0
        /* renamed from: a */
        public <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls) {
            String str = "Cannot create an instance of ";
            if (!C1446a.class.isAssignableFrom(cls)) {
                return super.mo6379a(cls);
            }
            try {
                return (C1477t) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f5740a});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    /* compiled from: ViewModelProvider */
    public interface C1480b {
        @C0193h0
        /* renamed from: a */
        <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.u$c */
    /* compiled from: ViewModelProvider */
    static abstract class C1481c implements C1480b {
        C1481c() {
        }

        @C0193h0
        /* renamed from: a */
        public <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        @C0193h0
        /* renamed from: a */
        public abstract <T extends C1477t> T mo6538a(@C0193h0 String str, @C0193h0 Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.u$d */
    /* compiled from: ViewModelProvider */
    public static class C1482d implements C1480b {
        @C0193h0
        /* renamed from: a */
        public <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls) {
            String str = "Cannot create an instance of ";
            try {
                return (C1477t) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    public C1478u(@C0193h0 C1484w wVar, @C0193h0 C1480b bVar) {
        this(wVar.getViewModelStore(), bVar);
    }

    @C0193h0
    @C0187e0
    /* renamed from: a */
    public <T extends C1477t> T mo6536a(@C0193h0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo6537a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C1478u(@C0193h0 C1483v vVar, @C0193h0 C1480b bVar) {
        this.f5737a = bVar;
        this.f5738b = vVar;
    }

    @C0193h0
    @C0187e0
    /* renamed from: a */
    public <T extends C1477t> T mo6537a(@C0193h0 String str, @C0193h0 Class<T> cls) {
        T t;
        T a = this.f5738b.mo6539a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        C1480b bVar = this.f5737a;
        if (bVar instanceof C1481c) {
            t = ((C1481c) bVar).mo6538a(str, cls);
        } else {
            t = bVar.mo6379a(cls);
        }
        this.f5738b.mo6541a(str, t);
        return t;
    }
}
