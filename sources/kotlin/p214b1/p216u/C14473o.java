package kotlin.p214b1.p216u;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.C6096e0;
import kotlin.p214b1.C14414m;
import kotlin.p505f1.C14538b;
import kotlin.p505f1.C14543e;
import kotlin.p505f1.C14554k;
import kotlin.p505f1.C14567p;
import kotlin.p505f1.C14569q;
import kotlin.p505f1.C14573t;

/* renamed from: kotlin.b1.u.o */
/* compiled from: CallableReference */
public abstract class C14473o implements C14538b, Serializable {
    @C6096e0(version = "1.1")

    /* renamed from: N */
    public static final Object f42594N = C14474a.f42597a;

    /* renamed from: a */
    private transient C14538b f42595a;
    @C6096e0(version = "1.1")

    /* renamed from: b */
    protected final Object f42596b;

    @C6096e0(version = "1.2")
    /* renamed from: kotlin.b1.u.o$a */
    /* compiled from: CallableReference */
    private static class C14474a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C14474a f42597a = new C14474a();

        private C14474a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f42597a;
        }
    }

    public C14473o() {
        this(f42594N);
    }

    /* renamed from: a */
    public Object mo45610a(Object... objArr) {
        return mo45547u().mo45610a(objArr);
    }

    @C6096e0(version = "1.1")
    /* renamed from: d */
    public boolean mo45612d() {
        return mo45547u().mo45612d();
    }

    @C6096e0(version = "1.1")
    /* renamed from: e */
    public boolean mo45613e() {
        return mo45547u().mo45613e();
    }

    /* renamed from: f */
    public C14567p mo45614f() {
        return mo45547u().mo45614f();
    }

    public List<Annotation> getAnnotations() {
        return mo45547u().getAnnotations();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public List<C14554k> getParameters() {
        return mo45547u().getParameters();
    }

    @C6096e0(version = "1.1")
    public List<C14569q> getTypeParameters() {
        return mo45547u().getTypeParameters();
    }

    @C6096e0(version = "1.1")
    public boolean isOpen() {
        return mo45547u().isOpen();
    }

    @C6096e0(version = "1.1")
    /* renamed from: q */
    public C14538b mo45619q() {
        C14538b bVar = this.f42595a;
        if (bVar != null) {
            return bVar;
        }
        C14538b r = mo45531r();
        this.f42595a = r;
        return r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C14538b mo45531r();

    @C6096e0(version = "1.1")
    /* renamed from: s */
    public Object mo45620s() {
        return this.f42596b;
    }

    /* renamed from: t */
    public C14543e mo45536t() {
        throw new AbstractMethodError();
    }

    /* access modifiers changed from: protected */
    @C6096e0(version = "1.1")
    /* renamed from: u */
    public C14538b mo45547u() {
        C14538b q = mo45619q();
        if (q != this) {
            return q;
        }
        throw new C14414m();
    }

    /* renamed from: v */
    public String mo45537v() {
        throw new AbstractMethodError();
    }

    @C6096e0(version = "1.1")
    protected C14473o(Object obj) {
        this.f42596b = obj;
    }

    /* renamed from: a */
    public Object mo45609a(Map map) {
        return mo45547u().mo45609a(map);
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public C14573t mo45611a() {
        return mo45547u().mo45611a();
    }
}
