package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4;
import com.google.android.gms.internal.measurement.C4801i4.C4802a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.i4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C4801i4<MessageType extends C4801i4<MessageType, BuilderType>, BuilderType extends C4802a<MessageType, BuilderType>> extends C4910p2<MessageType, BuilderType> {
    private static Map<Object, C4801i4<?, ?>> zzd = new ConcurrentHashMap();
    protected C4699b7 zzb = C4699b7.m19962d();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.measurement.i4$a */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static abstract class C4802a<MessageType extends C4801i4<MessageType, BuilderType>, BuilderType extends C4802a<MessageType, BuilderType>> extends C4942r2<MessageType, BuilderType> {

        /* renamed from: N */
        private boolean f14183N = false;

        /* renamed from: a */
        private final MessageType f14184a;

        /* renamed from: b */
        protected MessageType f14185b;

        protected C4802a(MessageType messagetype) {
            this.f14184a = messagetype;
            this.f14185b = (C4801i4) messagetype.mo19042a(C4805d.f14190d, (Object) null, (Object) null);
        }

        /* renamed from: b */
        private final BuilderType m20309b(byte[] bArr, int i, int i2, C5005u3 u3Var) throws zzfn {
            mo19065g();
            try {
                C4712c6.m19997a().mo18888a(this.f14185b).mo19032a(this.f14185b, bArr, 0, i2 + 0, new C5004u2(u3Var));
                return this;
            } catch (zzfn e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzfn.m22028a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: a */
        public final BuilderType mo19060a(MessageType messagetype) {
            mo19065g();
            m20307a(this.f14185b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C4802a aVar = (C4802a) this.f14184a.mo19042a(C4805d.f14191e, (Object) null, (Object) null);
            aVar.mo19060a((MessageType) (C4801i4) mo19057F());
            return aVar;
        }

        /* renamed from: f */
        public final /* synthetic */ C4942r2 mo19064f() {
            return (C4802a) clone();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo19065g() {
            if (this.f14183N) {
                MessageType messagetype = (C4801i4) this.f14185b.mo19042a(C4805d.f14190d, (Object) null, (Object) null);
                m20307a(messagetype, this.f14185b);
                this.f14185b = messagetype;
                this.f14183N = false;
            }
        }

        /* renamed from: h */
        public MessageType mo19057F() {
            if (this.f14183N) {
                return this.f14185b;
            }
            MessageType messagetype = this.f14185b;
            C4712c6.m19997a().mo18888a(messagetype).mo19036c(messagetype);
            this.f14183N = true;
            return this.f14185b;
        }

        /* renamed from: i */
        public final MessageType mo19056B() {
            MessageType messagetype = (C4801i4) mo19057F();
            if (messagetype.mo19054k()) {
                return messagetype;
            }
            throw new zzhv(messagetype);
        }

        /* renamed from: j */
        public final /* synthetic */ C4945r5 mo19053j() {
            return this.f14184a;
        }

        /* renamed from: k */
        public final boolean mo19054k() {
            return C4801i4.m20292a(this.f14185b, false);
        }

        /* renamed from: a */
        private static void m20307a(MessageType messagetype, MessageType messagetype2) {
            C4712c6.m19997a().mo18888a(messagetype).mo19034b(messagetype, messagetype2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType mo19059a(C4872m3 m3Var, C5005u3 u3Var) throws IOException {
            mo19065g();
            try {
                C4712c6.m19997a().mo18888a(this.f14185b).mo19030a(this.f14185b, C4885n3.m20748a(m3Var), u3Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final /* synthetic */ C4942r2 mo19062a(byte[] bArr, int i, int i2, C5005u3 u3Var) throws zzfn {
            return m20309b(bArr, 0, i2, u3Var);
        }

        /* renamed from: a */
        public final /* synthetic */ C4942r2 mo19061a(byte[] bArr, int i, int i2) throws zzfn {
            return m20309b(bArr, 0, i2, C5005u3.m21602a());
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.i4$b */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static abstract class C4803b<MessageType extends C4803b<MessageType, BuilderType>, BuilderType> extends C4801i4<MessageType, BuilderType> implements C4994t5 {
        protected C5045x3<Object> zzc = C5045x3.m21785g();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C5045x3<Object> mo19068a() {
            if (this.zzc.mo19741b()) {
                this.zzc = (C5045x3) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.i4$c */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static class C4804c<T extends C4801i4<T, ?>> extends C4929q2<T> {

        /* renamed from: b */
        private final T f14186b;

        public C4804c(T t) {
            this.f14186b = t;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.measurement.i4$d */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static final class C4805d {

        /* renamed from: a */
        public static final int f14187a = 1;

        /* renamed from: b */
        public static final int f14188b = 2;

        /* renamed from: c */
        public static final int f14189c = 3;

        /* renamed from: d */
        public static final int f14190d = 4;

        /* renamed from: e */
        public static final int f14191e = 5;

        /* renamed from: f */
        public static final int f14192f = 6;

        /* renamed from: g */
        public static final int f14193g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f14194h = {f14187a, f14188b, f14189c, f14190d, f14191e, f14192f, f14193g};

        /* renamed from: i */
        public static final int f14195i = 1;

        /* renamed from: j */
        public static final int f14196j = 2;

        /* renamed from: k */
        private static final /* synthetic */ int[] f14197k = {f14195i, f14196j};

        /* renamed from: l */
        public static final int f14198l = 1;

        /* renamed from: m */
        public static final int f14199m = 2;

        /* renamed from: n */
        private static final /* synthetic */ int[] f14200n = {f14198l, f14199m};

        /* renamed from: a */
        public static int[] m20324a() {
            return (int[]) f14194h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.i4$e */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    public static class C4806e<ContainingType extends C4945r5, Type> extends C4956s3<ContainingType, Type> {
    }

    /* renamed from: l */
    protected static C4886n4 m20293l() {
        return C4833k4.m20484c();
    }

    /* renamed from: m */
    protected static C4931q4 m20294m() {
        return C4757f5.m20131c();
    }

    /* renamed from: n */
    protected static <E> C4912p4<E> m20295n() {
        return C4776g6.m20237c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo19042a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19043a(int i) {
        this.zzc = i;
    }

    /* renamed from: b */
    public final int mo19045b() {
        if (this.zzc == -1) {
            this.zzc = C4712c6.m19997a().mo18888a(this).mo19037d(this);
        }
        return this.zzc;
    }

    /* renamed from: c */
    public final /* synthetic */ C4932q5 mo19046c() {
        return (C4802a) mo19042a(C4805d.f14191e, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final /* synthetic */ C4932q5 mo19047d() {
        C4802a aVar = (C4802a) mo19042a(C4805d.f14191e, (Object) null, (Object) null);
        aVar.mo19060a(this);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C4801i4) mo19042a(C4805d.f14192f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C4712c6.m19997a().mo18888a(this).mo19033a(this, (C4801i4) obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo19049g() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final <MessageType extends C4801i4<MessageType, BuilderType>, BuilderType extends C4802a<MessageType, BuilderType>> BuilderType mo19050h() {
        return (C4802a) mo19042a(C4805d.f14191e, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        this.zza = C4712c6.m19997a().mo18888a(this).mo19028a(this);
        return this.zza;
    }

    /* renamed from: i */
    public final BuilderType mo19052i() {
        BuilderType buildertype = (C4802a) mo19042a(C4805d.f14191e, (Object) null, (Object) null);
        buildertype.mo19060a(this);
        return buildertype;
    }

    /* renamed from: j */
    public final /* synthetic */ C4945r5 mo19053j() {
        return (C4801i4) mo19042a(C4805d.f14192f, (Object) null, (Object) null);
    }

    /* renamed from: k */
    public final boolean mo19054k() {
        return m20292a((T) this, Boolean.TRUE.booleanValue());
    }

    public String toString() {
        return C4958s5.m21103a(this, super.toString());
    }

    /* renamed from: a */
    public final void mo19044a(zzek zzek) throws IOException {
        C4712c6.m19997a().mo18888a(this).mo19031a(this, (C5036w7) C4943r3.m21040a(zzek));
    }

    /* renamed from: a */
    static <T extends C4801i4<?, ?>> T m20286a(Class<T> cls) {
        T t = (C4801i4) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4801i4) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4801i4) ((C4801i4) C4759f7.m20144a(cls)).mo19042a(C4805d.f14192f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C4801i4<?, ?>> void m20291a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m20289a(C4945r5 r5Var, String str, Object[] objArr) {
        return new C4758f6(r5Var, str, objArr);
    }

    /* renamed from: a */
    static Object m20290a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends C4801i4<T, ?>> boolean m20292a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo19042a(C4805d.f14187a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C4712c6.m19997a().mo18888a(t).mo19035b(t);
        if (z) {
            t.mo19042a(C4805d.f14188b, (Object) b ? t : null, (Object) null);
        }
        return b;
    }

    /* renamed from: a */
    protected static C4931q4 m20288a(C4931q4 q4Var) {
        int size = q4Var.size();
        return q4Var.mo18984f(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    protected static <E> C4912p4<E> m20287a(C4912p4<E> p4Var) {
        int size = p4Var.size();
        return p4Var.mo18907a(size == 0 ? 10 : size << 1);
    }
}
