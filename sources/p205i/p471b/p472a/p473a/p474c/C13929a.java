package p205i.p471b.p472a.p473a.p474c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15478d;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15479e;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15480f;
import p205i.p471b.p472a.p473a.C13927a;
import p205i.p471b.p472a.p473a.p474c.p478j.C13992a;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14029a;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14041j;
import p205i.p471b.p472a.p473a.p474c.p485k.C14043a;
import p205i.p471b.p472a.p473a.p474c.p485k.C14044b;
import p205i.p471b.p472a.p473a.p474c.p485k.C14045c;
import p205i.p471b.p472a.p473a.p474c.p485k.C14046d;
import p205i.p471b.p472a.p473a.p474c.p485k.C14049f;

/* renamed from: i.b.a.a.c.a */
/* compiled from: Agent */
public class C13929a implements C13927a {

    /* renamed from: f */
    private static C13929a f40445f;

    /* renamed from: a */
    private final C14030b f40446a;

    /* renamed from: b */
    private final C13935e f40447b;

    /* renamed from: c */
    private final C14041j f40448c = new C14041j();

    /* renamed from: d */
    private C14044b f40449d;

    /* renamed from: e */
    private Callable<Void> f40450e;

    /* renamed from: i.b.a.a.c.a$a */
    /* compiled from: Agent */
    static class C13930a extends Thread {

        /* renamed from: a */
        final /* synthetic */ C13929a f40451a;

        C13930a(C13929a aVar) {
            this.f40451a = aVar;
        }

        public void run() {
            this.f40451a.mo44043e();
        }
    }

    /* renamed from: i.b.a.a.c.a$b */
    /* compiled from: Agent */
    static /* synthetic */ class C13931b {

        /* renamed from: a */
        static final /* synthetic */ int[] f40452a = new int[C14031a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                i.b.a.a.c.j.d.b$a[] r0 = p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40452a = r0
                int[] r0 = f40452a     // Catch:{ NoSuchFieldError -> 0x0014 }
                i.b.a.a.c.j.d.b$a r1 = p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a.file     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f40452a     // Catch:{ NoSuchFieldError -> 0x001f }
                i.b.a.a.c.j.d.b$a r1 = p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a.tcpserver     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f40452a     // Catch:{ NoSuchFieldError -> 0x002a }
                i.b.a.a.c.j.d.b$a r1 = p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a.tcpclient     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f40452a     // Catch:{ NoSuchFieldError -> 0x0035 }
                i.b.a.a.c.j.d.b$a r1 = p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b.C14031a.none     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.C13929a.C13931b.<clinit>():void");
        }
    }

    C13929a(C14030b bVar, C13935e eVar) {
        this.f40446a = bVar;
        this.f40447b = eVar;
    }

    /* renamed from: a */
    public static synchronized C13929a m59862a(C14030b bVar) {
        C13929a aVar;
        synchronized (C13929a.class) {
            if (f40445f == null) {
                C13929a aVar2 = new C13929a(bVar, C13935e.f40465a);
                aVar2.mo44044f();
                Runtime.getRuntime().addShutdownHook(new C13930a(aVar2));
                f40445f = aVar2;
            }
            aVar = f40445f;
        }
        return aVar;
    }

    /* renamed from: g */
    private String m59863g() {
        String str;
        try {
            str = InetAddress.getLocalHost().getHostName();
        } catch (Exception unused) {
            str = "unknownhost";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(C14029a.m60523a());
        return sb.toString();
    }

    /* renamed from: h */
    public static synchronized C13929a m59864h() throws IllegalStateException {
        C13929a aVar;
        synchronized (C13929a.class) {
            if (f40445f != null) {
                aVar = f40445f;
            } else {
                throw new IllegalStateException("JaCoCo agent not started.");
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public String mo44038b() {
        return C13992a.f41136a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C14044b mo44041c() {
        C14031a l = this.f40446a.mo44349l();
        int i = C13931b.f40452a[l.ordinal()];
        if (i == 1) {
            return new C14043a();
        }
        if (i == 2) {
            return new C14049f(this.f40447b);
        }
        if (i == 3) {
            return new C14046d(this.f40447b);
        }
        if (i == 4) {
            return new C14045c();
        }
        throw new AssertionError(l);
    }

    /* renamed from: d */
    public C14041j mo44042d() {
        return this.f40448c;
    }

    /* renamed from: e */
    public void mo44043e() {
        try {
            if (this.f40446a.mo44339e()) {
                this.f40449d.mo44369a(false);
            }
            this.f40449d.shutdown();
            if (this.f40450e != null) {
                this.f40450e.call();
            }
        } catch (Exception e) {
            this.f40447b.mo44049a(e);
        }
    }

    /* renamed from: f */
    public void mo44044f() {
        try {
            String n = this.f40446a.mo44351n();
            if (n == null) {
                n = m59863g();
            }
            this.f40448c.mo44362a(n);
            this.f40449d = mo44041c();
            this.f40449d.mo44368a(this.f40446a, this.f40448c);
            if (this.f40446a.mo44348k()) {
                this.f40450e = new C13937f(this);
            }
        } catch (Exception e) {
            this.f40447b.mo44049a(e);
        }
    }

    public void reset() {
        this.f40448c.mo44365b();
    }

    /* renamed from: b */
    public void mo44039b(boolean z) throws IOException {
        this.f40449d.mo44369a(z);
    }

    /* renamed from: a */
    public String mo44035a() {
        return this.f40448c.mo44360a();
    }

    /* renamed from: a */
    public void mo44036a(String str) {
        this.f40448c.mo44362a(str);
    }

    /* renamed from: a */
    public byte[] mo44037a(boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C15478d dVar = new C15478d(byteArrayOutputStream);
            this.f40448c.mo44363a((C15479e) dVar, (C15480f) dVar, z);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
