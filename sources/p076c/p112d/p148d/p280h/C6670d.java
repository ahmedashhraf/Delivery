package p076c.p112d.p148d.p280h;

import com.google.common.collect.C8220v1;
import com.google.common.collect.C8302z2;
import com.google.common.collect.C8302z2.C8303a;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: c.d.d.h.d */
/* compiled from: ImmutableTypeToInstanceMap */
public final class C6670d<B> extends C8220v1<C6693m<? extends B>, B> implements C6692l<B> {

    /* renamed from: a */
    private final C8302z2<C6693m<? extends B>, B> f18651a;

    @C2775a
    /* renamed from: c.d.d.h.d$b */
    /* compiled from: ImmutableTypeToInstanceMap */
    public static final class C6672b<B> {

        /* renamed from: a */
        private final C8303a<C6693m<? extends B>, B> f18652a;

        /* renamed from: a */
        public <T extends B> C6672b<B> mo26779a(Class<T> cls, T t) {
            this.f18652a.mo30687a(C6693m.m31985e(cls), t);
            return this;
        }

        private C6672b() {
            this.f18652a = C8302z2.m39628g();
        }

        /* renamed from: a */
        public <T extends B> C6672b<B> mo26778a(C6693m<T> mVar, T t) {
            this.f18652a.mo30687a(mVar.mo26853l(), t);
            return this;
        }

        /* renamed from: a */
        public C6670d<B> mo26780a() {
            return new C6670d<>(this.f18652a.mo30690a());
        }
    }

    /* renamed from: E */
    public static <B> C6672b<B> m31856E() {
        return new C6672b<>();
    }

    /* renamed from: F */
    public static <B> C6670d<B> m31857F() {
        return new C6670d<>(C8302z2.m39630i());
    }

    /* renamed from: b */
    private <T extends B> T m31858b(C6693m<T> mVar) {
        return this.f18651a.get(mVar);
    }

    /* renamed from: a */
    public <T extends B> T mo26773a(C6693m<T> mVar) {
        return m31858b(mVar.mo26853l());
    }

    private C6670d(C8302z2<C6693m<? extends B>, B> z2Var) {
        this.f18651a = z2Var;
    }

    /* renamed from: a */
    public <T extends B> T mo26774a(C6693m<T> mVar, T t) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Map<C6693m<? extends B>, B> m31864y() {
        return this.f18651a;
    }

    /* renamed from: a */
    public <T extends B> T mo26775a(Class<T> cls) {
        return m31858b(C6693m.m31985e(cls));
    }

    /* renamed from: a */
    public <T extends B> T mo26776a(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }
}
