package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import p205i.p471b.p472a.p473a.p474c.p475i.C13944e;
import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13946g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.C13996b;

/* renamed from: i.b.a.a.c.j.d.g */
/* compiled from: ModifiedSystemClassRuntime */
public class C14036g extends C14029a {

    /* renamed from: f */
    private static final String f41253f = "Ljava/lang/Object;";

    /* renamed from: c */
    private final Class<?> f41254c;

    /* renamed from: d */
    private final String f41255d;

    /* renamed from: e */
    private final String f41256e;

    /* renamed from: i.b.a.a.c.j.d.g$a */
    /* compiled from: ModifiedSystemClassRuntime */
    static class C14037a implements ClassFileTransformer {

        /* renamed from: a */
        final /* synthetic */ String f41257a;

        /* renamed from: b */
        final /* synthetic */ String f41258b;

        C14037a(String str, String str2) {
            this.f41257a = str;
            this.f41258b = str2;
        }

        /* renamed from: a */
        public byte[] mo44356a(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) throws IllegalClassFormatException {
            if (str.equals(this.f41257a)) {
                return C14036g.m60575a(bArr, this.f41258b);
            }
            return null;
        }
    }

    /* renamed from: i.b.a.a.c.j.d.g$b */
    /* compiled from: ModifiedSystemClassRuntime */
    static class C14038b extends C13945f {

        /* renamed from: c */
        final /* synthetic */ String f41259c;

        C14038b(int i, C13945f fVar, String str) {
            this.f41259c = str;
            super(i, fVar);
        }

        /* renamed from: b */
        public void mo44103b() {
            C14036g.m60576b(this.f40502b, this.f41259c);
            super.mo44103b();
        }
    }

    public C14036g(Class<?> cls, String str) {
        this.f41254c = cls;
        this.f41255d = cls.getName().replace('.', '/');
        this.f41256e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m60576b(C13945f fVar, String str) {
        fVar.mo44096a(4233, str, f41253f, (String) null, (Object) null);
    }

    public void shutdown() {
    }

    /* renamed from: a */
    public void mo44319a(C14041j jVar) throws Exception {
        super.mo44319a(jVar);
        this.f41254c.getField(this.f41256e).set(null, jVar);
    }

    /* renamed from: a */
    public int mo44353a(long j, String str, int i, C13957r rVar) {
        rVar.mo44177a(178, this.f41255d, this.f41256e, f41253f);
        C14041j.m60586a(j, str, i, rVar);
        return 6;
    }

    /* renamed from: a */
    public static C14035f m60572a(Instrumentation instrumentation, String str) throws ClassNotFoundException {
        return m60573a(instrumentation, str, "$jacocoAccess");
    }

    /* renamed from: a */
    public static C14035f m60573a(Instrumentation instrumentation, String str, String str2) throws ClassNotFoundException {
        C14037a aVar = new C14037a(str, str2);
        instrumentation.addTransformer(aVar);
        Class cls = Class.forName(str.replace('/', '.'));
        instrumentation.removeTransformer(aVar);
        try {
            cls.getField(str2);
            return new C14036g(cls, str2);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(String.format("Class %s could not be instrumented.", new Object[]{str}), e);
        }
    }

    /* renamed from: a */
    public static byte[] m60575a(byte[] bArr, String str) {
        C13944e eVar = new C13944e(C13996b.m60366b(bArr));
        C13946g gVar = new C13946g(eVar, 0);
        eVar.mo44079a((C13945f) new C14038b(327680, gVar, str), 8);
        return gVar.mo44126c();
    }
}
