package p076c.p082c.p083a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.UUID;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.p096s.C2418b;
import p076c.p082c.p083a.p088u.p095j.p097t.C2428c;
import p076c.p082c.p083a.p088u.p095j.p097t.C2429d;
import p076c.p082c.p083a.p088u.p095j.p097t.C2433f;
import p076c.p082c.p083a.p105v.C2496c;
import p076c.p082c.p083a.p105v.C2496c.C2497a;
import p076c.p082c.p083a.p105v.C2498d;
import p076c.p082c.p083a.p105v.C2502g;
import p076c.p082c.p083a.p105v.C2503h;
import p076c.p082c.p083a.p105v.C2509l;
import p076c.p082c.p083a.p105v.C2510m;
import p076c.p082c.p083a.p111z.C2565a;
import p076c.p082c.p083a.p111z.C2567c;
import p076c.p082c.p083a.p111z.C2568d;

/* renamed from: c.c.a.q */
/* compiled from: RequestManager */
public class C2245q implements C2503h {

    /* renamed from: N */
    private final C2509l f8869N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C2510m f8870O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C2232l f8871P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C2251e f8872Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C2247b f8873R;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8874a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2502g f8875b;

    /* renamed from: c.c.a.q$a */
    /* compiled from: RequestManager */
    class C2246a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2502g f8876a;

        C2246a(C2502g gVar) {
            this.f8876a = gVar;
        }

        public void run() {
            this.f8876a.mo9931a(C2245q.this);
        }
    }

    /* renamed from: c.c.a.q$b */
    /* compiled from: RequestManager */
    public interface C2247b {
        /* renamed from: a */
        <T> void mo9543a(C2226h<T, ?, ?, ?> hVar);
    }

    /* renamed from: c.c.a.q$c */
    /* compiled from: RequestManager */
    public final class C2248c<A, T> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2409l<A, T> f8878a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Class<T> f8879b;

        /* renamed from: c.c.a.q$c$a */
        /* compiled from: RequestManager */
        public final class C2249a {

            /* renamed from: a */
            private final A f8881a;

            /* renamed from: b */
            private final Class<A> f8882b;

            /* renamed from: c */
            private final boolean f8883c;

            C2249a(A a) {
                this.f8883c = true;
                this.f8881a = a;
                this.f8882b = C2245q.m11709c(a);
            }

            /* renamed from: a */
            public <Z> C2229i<A, T, Z> mo9546a(Class<Z> cls) {
                C2251e e = C2245q.this.f8872Q;
                C2229i iVar = new C2229i(C2245q.this.f8874a, C2245q.this.f8871P, this.f8882b, C2248c.this.f8878a, C2248c.this.f8879b, cls, C2245q.this.f8870O, C2245q.this.f8875b, C2245q.this.f8872Q);
                C2229i<A, T, Z> iVar2 = (C2229i) e.mo9549a(iVar);
                if (this.f8883c) {
                    iVar2.mo9420a(this.f8881a);
                }
                return iVar2;
            }

            C2249a(Class<A> cls) {
                this.f8883c = false;
                this.f8881a = null;
                this.f8882b = cls;
            }
        }

        C2248c(C2409l<A, T> lVar, Class<T> cls) {
            this.f8878a = lVar;
            this.f8879b = cls;
        }

        /* renamed from: a */
        public C2249a mo9544a(Class<A> cls) {
            return new C2249a<>(cls);
        }

        /* renamed from: a */
        public C2249a mo9545a(A a) {
            return new C2249a<>(a);
        }
    }

    /* renamed from: c.c.a.q$d */
    /* compiled from: RequestManager */
    public final class C2250d<T> {

        /* renamed from: a */
        private final C2409l<T, InputStream> f8885a;

        C2250d(C2409l<T, InputStream> lVar) {
            this.f8885a = lVar;
        }

        /* renamed from: a */
        public C2225g<T> mo9547a(Class<T> cls) {
            C2251e e = C2245q.this.f8872Q;
            C2225g gVar = new C2225g(cls, this.f8885a, null, C2245q.this.f8874a, C2245q.this.f8871P, C2245q.this.f8870O, C2245q.this.f8875b, C2245q.this.f8872Q);
            return (C2225g) e.mo9549a(gVar);
        }

        /* renamed from: a */
        public C2225g<T> mo9548a(T t) {
            return (C2225g) mo9547a(C2245q.m11709c(t)).m11470a(t);
        }
    }

    /* renamed from: c.c.a.q$e */
    /* compiled from: RequestManager */
    class C2251e {
        C2251e() {
        }

        /* renamed from: a */
        public <A, X extends C2226h<A, ?, ?, ?>> X mo9549a(X x) {
            if (C2245q.this.f8873R != null) {
                C2245q.this.f8873R.mo9543a(x);
            }
            return x;
        }
    }

    /* renamed from: c.c.a.q$f */
    /* compiled from: RequestManager */
    private static class C2252f implements C2497a {

        /* renamed from: a */
        private final C2510m f8888a;

        public C2252f(C2510m mVar) {
            this.f8888a = mVar;
        }

        /* renamed from: a */
        public void mo9550a(boolean z) {
            if (z) {
                this.f8888a.mo9965d();
            }
        }
    }

    /* renamed from: c.c.a.q$g */
    /* compiled from: RequestManager */
    public final class C2253g<T> {

        /* renamed from: a */
        private final C2409l<T, ParcelFileDescriptor> f8889a;

        C2253g(C2409l<T, ParcelFileDescriptor> lVar) {
            this.f8889a = lVar;
        }

        /* renamed from: a */
        public C2225g<T> mo9551a(T t) {
            C2251e e = C2245q.this.f8872Q;
            C2225g gVar = new C2225g(C2245q.m11709c(t), null, this.f8889a, C2245q.this.f8874a, C2245q.this.f8871P, C2245q.this.f8870O, C2245q.this.f8875b, C2245q.this.f8872Q);
            return (C2225g) ((C2225g) e.mo9549a(gVar)).m11470a(t);
        }
    }

    public C2245q(Context context, C2502g gVar, C2509l lVar) {
        this(context, gVar, lVar, new C2510m(), new C2498d());
    }

    /* renamed from: g */
    public C2225g<Uri> mo9531g() {
        return m11705b(Uri.class);
    }

    @Deprecated
    /* renamed from: h */
    public C2225g<URL> mo9532h() {
        return m11705b(URL.class);
    }

    /* renamed from: i */
    public boolean mo9533i() {
        C2216i.m11347b();
        return this.f8870O.mo9962b();
    }

    /* renamed from: j */
    public void mo9534j() {
        this.f8871P.mo9476b();
    }

    /* renamed from: k */
    public void mo9535k() {
        C2216i.m11347b();
        this.f8870O.mo9963c();
    }

    /* renamed from: l */
    public void mo9536l() {
        C2216i.m11347b();
        mo9535k();
        for (C2245q k : this.f8869N.mo9936a()) {
            k.mo9535k();
        }
    }

    /* renamed from: m */
    public void mo9537m() {
        C2216i.m11347b();
        this.f8870O.mo9966e();
    }

    /* renamed from: n */
    public void mo9538n() {
        C2216i.m11347b();
        mo9537m();
        for (C2245q m : this.f8869N.mo9936a()) {
            m.mo9537m();
        }
    }

    public void onDestroy() {
        this.f8870O.mo9959a();
    }

    public void onStart() {
        mo9537m();
    }

    public void onStop() {
        mo9535k();
    }

    C2245q(Context context, C2502g gVar, C2509l lVar, C2510m mVar, C2498d dVar) {
        this.f8874a = context.getApplicationContext();
        this.f8875b = gVar;
        this.f8869N = lVar;
        this.f8870O = mVar;
        this.f8871P = C2232l.m11632a(context);
        this.f8872Q = new C2251e();
        C2496c a = dVar.mo9934a(context, new C2252f(mVar));
        if (C2216i.m11349c()) {
            new Handler(Looper.getMainLooper()).post(new C2246a(gVar));
        } else {
            gVar.mo9931a(this);
        }
        gVar.mo9931a(a);
    }

    /* renamed from: a */
    public void mo9523a(int i) {
        this.f8871P.mo9471a(i);
    }

    /* renamed from: c */
    public C2225g<File> mo9527c() {
        return m11705b(File.class);
    }

    /* renamed from: d */
    public C2225g<Uri> mo9528d() {
        C2428c cVar = new C2428c(this.f8874a, C2232l.m11646b(Uri.class, this.f8874a));
        C2409l a = C2232l.m11637a(Uri.class, this.f8874a);
        C2251e eVar = this.f8872Q;
        C2225g gVar = new C2225g(Uri.class, cVar, a, this.f8874a, this.f8871P, this.f8870O, this.f8875b, eVar);
        return (C2225g) eVar.mo9549a(gVar);
    }

    /* renamed from: e */
    public C2225g<Integer> mo9529e() {
        return (C2225g) m11705b(Integer.class).m11463a(C2565a.m12662a(this.f8874a));
    }

    /* renamed from: f */
    public C2225g<String> mo9530f() {
        return m11705b(String.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <T> Class<T> m11709c(T t) {
        if (t != null) {
            return t.getClass();
        }
        return null;
    }

    /* renamed from: a */
    public void mo9524a(C2247b bVar) {
        this.f8873R = bVar;
    }

    /* renamed from: b */
    public C2225g<Uri> mo9526b(Uri uri) {
        return (C2225g) mo9528d().m11470a(uri);
    }

    /* renamed from: a */
    public <A, T> C2248c<A, T> mo9519a(C2409l<A, T> lVar, Class<T> cls) {
        return new C2248c<>(lVar, cls);
    }

    /* renamed from: b */
    public C2225g<byte[]> mo9525b() {
        return (C2225g) m11705b(byte[].class).m11463a((C2272c) new C2568d(UUID.randomUUID().toString())).m11466a(C2302c.NONE).m11471a(true);
    }

    /* renamed from: b */
    private <T> C2225g<T> m11705b(Class<T> cls) {
        C2409l b = C2232l.m11646b(cls, this.f8874a);
        C2409l a = C2232l.m11637a(cls, this.f8874a);
        if (cls != null && b == null && a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown type ");
            sb.append(cls);
            sb.append(". You must provide a Model of a type for");
            sb.append(" which there is a registered ModelLoader, if you are using a custom model, you must first call");
            sb.append(" Glide#register with a ModelLoaderFactory for your custom model class");
            throw new IllegalArgumentException(sb.toString());
        }
        C2251e eVar = this.f8872Q;
        C2225g gVar = new C2225g(cls, b, a, this.f8874a, this.f8871P, this.f8870O, this.f8875b, eVar);
        return (C2225g) eVar.mo9549a(gVar);
    }

    /* renamed from: a */
    public <T> C2250d<T> mo9521a(C2433f<T> fVar) {
        return new C2250d<>(fVar);
    }

    /* renamed from: a */
    public C2250d<byte[]> mo9520a(C2429d dVar) {
        return new C2250d<>(dVar);
    }

    /* renamed from: a */
    public <T> C2253g<T> mo9522a(C2418b<T> bVar) {
        return new C2253g<>(bVar);
    }

    /* renamed from: a */
    public C2225g<String> mo9515a(String str) {
        return (C2225g) mo9530f().m11470a(str);
    }

    /* renamed from: a */
    public C2225g<Uri> mo9509a(Uri uri) {
        return (C2225g) mo9531g().m11470a(uri);
    }

    @Deprecated
    /* renamed from: a */
    public C2225g<Uri> mo9510a(Uri uri, String str, long j, int i) {
        return (C2225g) mo9526b(uri).m11463a((C2272c) new C2567c(str, j, i));
    }

    /* renamed from: a */
    public C2225g<File> mo9511a(File file) {
        return (C2225g) mo9527c().m11470a(file);
    }

    /* renamed from: a */
    public C2225g<Integer> mo9513a(Integer num) {
        return (C2225g) mo9529e().m11470a(num);
    }

    @Deprecated
    /* renamed from: a */
    public C2225g<URL> mo9516a(URL url) {
        return (C2225g) mo9532h().m11470a(url);
    }

    @Deprecated
    /* renamed from: a */
    public C2225g<byte[]> mo9518a(byte[] bArr, String str) {
        return (C2225g) mo9517a(bArr).m11463a((C2272c) new C2568d(str));
    }

    /* renamed from: a */
    public C2225g<byte[]> mo9517a(byte[] bArr) {
        return (C2225g) mo9525b().m11470a(bArr);
    }

    /* renamed from: a */
    public <T> C2225g<T> mo9514a(T t) {
        return (C2225g) m11705b(m11709c(t)).m11470a(t);
    }

    /* renamed from: a */
    public <T> C2225g<T> mo9512a(Class<T> cls) {
        return m11705b(cls);
    }
}
