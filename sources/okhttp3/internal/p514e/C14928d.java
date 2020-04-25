package okhttp3.internal.p514e;

import com.facebook.cache.disk.DefaultDiskStorage.FileType;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.C14910b;
import okhttp3.internal.p518i.C15000a;
import okhttp3.internal.p519j.C15011f;
import p201f.p202a.C5952h;
import p470h.C13883a0;
import p470h.C13892d;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.e.d */
/* compiled from: DiskLruCache */
public final class C14928d implements Closeable, Flushable {

    /* renamed from: f0 */
    static final String f43251f0 = "journal";

    /* renamed from: g0 */
    static final String f43252g0 = "journal.tmp";

    /* renamed from: h0 */
    static final String f43253h0 = "journal.bkp";

    /* renamed from: i0 */
    static final String f43254i0 = "libcore.io.DiskLruCache";

    /* renamed from: j0 */
    static final String f43255j0 = "1";

    /* renamed from: k0 */
    static final long f43256k0 = -1;

    /* renamed from: l0 */
    static final Pattern f43257l0 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: m0 */
    private static final String f43258m0 = "CLEAN";

    /* renamed from: n0 */
    private static final String f43259n0 = "DIRTY";

    /* renamed from: o0 */
    private static final String f43260o0 = "REMOVE";

    /* renamed from: p0 */
    private static final String f43261p0 = "READ";

    /* renamed from: q0 */
    static final /* synthetic */ boolean f43262q0 = false;

    /* renamed from: N */
    private final File f43263N;

    /* renamed from: O */
    private final File f43264O;

    /* renamed from: P */
    private final File f43265P;

    /* renamed from: Q */
    private final int f43266Q;

    /* renamed from: R */
    private long f43267R;

    /* renamed from: S */
    final int f43268S;

    /* renamed from: T */
    private long f43269T = 0;

    /* renamed from: U */
    C13892d f43270U;

    /* renamed from: V */
    final LinkedHashMap<String, C14934e> f43271V = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: W */
    int f43272W;

    /* renamed from: X */
    boolean f43273X;

    /* renamed from: Y */
    boolean f43274Y;

    /* renamed from: Z */
    boolean f43275Z;

    /* renamed from: a */
    final C15000a f43276a;

    /* renamed from: a0 */
    boolean f43277a0;

    /* renamed from: b */
    final File f43278b;

    /* renamed from: b0 */
    boolean f43279b0;

    /* renamed from: c0 */
    private long f43280c0 = 0;

    /* renamed from: d0 */
    private final Executor f43281d0;

    /* renamed from: e0 */
    private final Runnable f43282e0 = new C14929a();

    /* renamed from: okhttp3.internal.e.d$a */
    /* compiled from: DiskLruCache */
    class C14929a implements Runnable {
        C14929a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f43283a.f43279b0 = true;
            r5.f43283a.f43270U = p470h.C13906p.m59738a(p470h.C13906p.m59740a());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                okhttp3.internal.e.d r0 = okhttp3.internal.p514e.C14928d.this
                monitor-enter(r0)
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f43274Y     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                okhttp3.internal.e.d r4 = okhttp3.internal.p514e.C14928d.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.f43275Z     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ IOException -> 0x001d }
                r1.mo46411F()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ all -> 0x0045 }
                r1.f43277a0 = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.mo46426h()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ IOException -> 0x0033 }
                r1.mo46427i()     // Catch:{ IOException -> 0x0033 }
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ IOException -> 0x0033 }
                r1.f43272W = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ all -> 0x0045 }
                r1.f43279b0 = r3     // Catch:{ all -> 0x0045 }
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ all -> 0x0045 }
                h.z r2 = p470h.C13906p.m59740a()     // Catch:{ all -> 0x0045 }
                h.d r2 = p470h.C13906p.m59738a(r2)     // Catch:{ all -> 0x0045 }
                r1.f43270U = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.C14929a.run():void");
        }
    }

    /* renamed from: okhttp3.internal.e.d$b */
    /* compiled from: DiskLruCache */
    class C14930b extends C14936e {

        /* renamed from: O */
        static final /* synthetic */ boolean f43284O = false;

        static {
            Class<C14928d> cls = C14928d.class;
        }

        C14930b(C13924z zVar) {
            super(zVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo46431a(IOException iOException) {
            C14928d.this.f43273X = true;
        }
    }

    /* renamed from: okhttp3.internal.e.d$c */
    /* compiled from: DiskLruCache */
    class C14931c implements Iterator<C14935f> {

        /* renamed from: N */
        C14935f f43286N;

        /* renamed from: a */
        final Iterator<C14934e> f43288a = new ArrayList(C14928d.this.f43271V.values()).iterator();

        /* renamed from: b */
        C14935f f43289b;

        C14931c() {
        }

        public boolean hasNext() {
            if (this.f43289b != null) {
                return true;
            }
            synchronized (C14928d.this) {
                if (C14928d.this.f43275Z) {
                    return false;
                }
                while (this.f43288a.hasNext()) {
                    C14935f a = ((C14934e) this.f43288a.next()).mo46441a();
                    if (a != null) {
                        this.f43289b = a;
                        return true;
                    }
                }
                return false;
            }
        }

        public void remove() {
            C14935f fVar = this.f43286N;
            if (fVar != null) {
                try {
                    C14928d.this.mo46421d(fVar.f43306a);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f43286N = null;
                    throw th;
                }
                this.f43286N = null;
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }

        public C14935f next() {
            if (hasNext()) {
                this.f43286N = this.f43289b;
                this.f43289b = null;
                return this.f43286N;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: okhttp3.internal.e.d$d */
    /* compiled from: DiskLruCache */
    public final class C14932d {

        /* renamed from: a */
        final C14934e f43290a;

        /* renamed from: b */
        final boolean[] f43291b;

        /* renamed from: c */
        private boolean f43292c;

        /* renamed from: okhttp3.internal.e.d$d$a */
        /* compiled from: DiskLruCache */
        class C14933a extends C14936e {
            C14933a(C13924z zVar) {
                super(zVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo46431a(IOException iOException) {
                synchronized (C14928d.this) {
                    C14932d.this.mo46440d();
                }
            }
        }

        C14932d(C14934e eVar) {
            this.f43290a = eVar;
            this.f43291b = eVar.f43299e ? null : new boolean[C14928d.this.f43268S];
        }

        /* renamed from: a */
        public C13924z mo46435a(int i) {
            synchronized (C14928d.this) {
                if (this.f43292c) {
                    throw new IllegalStateException();
                } else if (this.f43290a.f43300f != this) {
                    C13924z a = C13906p.m59740a();
                    return a;
                } else {
                    if (!this.f43290a.f43299e) {
                        this.f43291b[i] = true;
                    }
                    try {
                        C14933a aVar = new C14933a(C14928d.this.f43276a.mo46607b(this.f43290a.f43298d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C13906p.m59740a();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
            return null;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p470h.C13883a0 mo46437b(int r5) {
            /*
                r4 = this;
                okhttp3.internal.e.d r0 = okhttp3.internal.p514e.C14928d.this
                monitor-enter(r0)
                boolean r1 = r4.f43292c     // Catch:{ all -> 0x002f }
                if (r1 != 0) goto L_0x0029
                okhttp3.internal.e.d$e r1 = r4.f43290a     // Catch:{ all -> 0x002f }
                boolean r1 = r1.f43299e     // Catch:{ all -> 0x002f }
                r2 = 0
                if (r1 == 0) goto L_0x0027
                okhttp3.internal.e.d$e r1 = r4.f43290a     // Catch:{ all -> 0x002f }
                okhttp3.internal.e.d$d r1 = r1.f43300f     // Catch:{ all -> 0x002f }
                if (r1 == r4) goto L_0x0015
                goto L_0x0027
            L_0x0015:
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ FileNotFoundException -> 0x0025 }
                okhttp3.internal.i.a r1 = r1.f43276a     // Catch:{ FileNotFoundException -> 0x0025 }
                okhttp3.internal.e.d$e r3 = r4.f43290a     // Catch:{ FileNotFoundException -> 0x0025 }
                java.io.File[] r3 = r3.f43297c     // Catch:{ FileNotFoundException -> 0x0025 }
                r5 = r3[r5]     // Catch:{ FileNotFoundException -> 0x0025 }
                h.a0 r5 = r1.mo46605a(r5)     // Catch:{ FileNotFoundException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r5
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x0027:
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002f }
                r5.<init>()     // Catch:{ all -> 0x002f }
                throw r5     // Catch:{ all -> 0x002f }
            L_0x002f:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.C14932d.mo46437b(int):h.a0");
        }

        /* renamed from: c */
        public void mo46439c() throws IOException {
            synchronized (C14928d.this) {
                if (!this.f43292c) {
                    if (this.f43290a.f43300f == this) {
                        C14928d.this.mo46415a(this, true);
                    }
                    this.f43292c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo46440d() {
            if (this.f43290a.f43300f == this) {
                int i = 0;
                while (true) {
                    C14928d dVar = C14928d.this;
                    if (i < dVar.f43268S) {
                        try {
                            dVar.f43276a.mo46610e(this.f43290a.f43298d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f43290a.f43300f = null;
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo46438b() {
            /*
                r3 = this;
                okhttp3.internal.e.d r0 = okhttp3.internal.p514e.C14928d.this
                monitor-enter(r0)
                boolean r1 = r3.f43292c     // Catch:{ all -> 0x0015 }
                if (r1 != 0) goto L_0x0013
                okhttp3.internal.e.d$e r1 = r3.f43290a     // Catch:{ all -> 0x0015 }
                okhttp3.internal.e.d$d r1 = r1.f43300f     // Catch:{ all -> 0x0015 }
                if (r1 != r3) goto L_0x0013
                okhttp3.internal.e.d r1 = okhttp3.internal.p514e.C14928d.this     // Catch:{ IOException -> 0x0013 }
                r2 = 0
                r1.mo46415a(r3, r2)     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.C14932d.mo46438b():void");
        }

        /* renamed from: a */
        public void mo46436a() throws IOException {
            synchronized (C14928d.this) {
                if (!this.f43292c) {
                    if (this.f43290a.f43300f == this) {
                        C14928d.this.mo46415a(this, false);
                    }
                    this.f43292c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.e.d$e */
    /* compiled from: DiskLruCache */
    private final class C14934e {

        /* renamed from: a */
        final String f43295a;

        /* renamed from: b */
        final long[] f43296b;

        /* renamed from: c */
        final File[] f43297c;

        /* renamed from: d */
        final File[] f43298d;

        /* renamed from: e */
        boolean f43299e;

        /* renamed from: f */
        C14932d f43300f;

        /* renamed from: g */
        long f43301g;

        C14934e(String str) {
            this.f43295a = str;
            int i = C14928d.this.f43268S;
            this.f43296b = new long[i];
            this.f43297c = new File[i];
            this.f43298d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C14928d.this.f43268S; i2++) {
                sb.append(i2);
                this.f43297c[i2] = new File(C14928d.this.f43278b, sb.toString());
                sb.append(FileType.TEMP);
                this.f43298d[i2] = new File(C14928d.this.f43278b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: b */
        private IOException m66183b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46443a(String[] strArr) throws IOException {
            if (strArr.length == C14928d.this.f43268S) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f43296b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m66183b(strArr);
                    }
                }
                return;
            }
            throw m66183b(strArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46442a(C13892d dVar) throws IOException {
            for (long f : this.f43296b) {
                dVar.writeByte(32).mo43885f(f);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C14935f mo46441a() {
            if (Thread.holdsLock(C14928d.this)) {
                C13883a0[] a0VarArr = new C13883a0[C14928d.this.f43268S];
                long[] jArr = (long[]) this.f43296b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C14928d.this.f43268S) {
                    try {
                        a0VarArr[i2] = C14928d.this.f43276a.mo46605a(this.f43297c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C14928d.this.f43268S && a0VarArr[i] != null) {
                            C14910b.m66055a((Closeable) a0VarArr[i]);
                            i++;
                        }
                        try {
                            C14928d.this.mo46416a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                C14935f fVar = new C14935f(this.f43295a, this.f43301g, a0VarArr, jArr);
                return fVar;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: okhttp3.internal.e.d$f */
    /* compiled from: DiskLruCache */
    public final class C14935f implements Closeable {

        /* renamed from: N */
        private final C13883a0[] f43303N;

        /* renamed from: O */
        private final long[] f43304O;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f43306a;

        /* renamed from: b */
        private final long f43307b;

        C14935f(String str, long j, C13883a0[] a0VarArr, long[] jArr) {
            this.f43306a = str;
            this.f43307b = j;
            this.f43303N = a0VarArr;
            this.f43304O = jArr;
        }

        public void close() {
            for (C13883a0 a : this.f43303N) {
                C14910b.m66055a((Closeable) a);
            }
        }

        /* renamed from: d */
        public String mo46447d() {
            return this.f43306a;
        }

        /* renamed from: e */
        public C13883a0 mo46448e(int i) {
            return this.f43303N[i];
        }

        @C5952h
        /* renamed from: a */
        public C14932d mo46445a() throws IOException {
            return C14928d.this.mo46412a(this.f43306a, this.f43307b);
        }

        /* renamed from: a */
        public long mo46444a(int i) {
            return this.f43304O[i];
        }
    }

    static {
        Class<C14928d> cls = C14928d.class;
    }

    C14928d(C15000a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f43276a = aVar;
        this.f43278b = file;
        this.f43266Q = i;
        this.f43263N = new File(file, f43251f0);
        this.f43264O = new File(file, f43252g0);
        this.f43265P = new File(file, f43253h0);
        this.f43268S = i2;
        this.f43267R = j;
        this.f43281d0 = executor;
    }

    /* renamed from: G */
    private synchronized void m66152G() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: H */
    private C13892d m66153H() throws FileNotFoundException {
        return C13906p.m59738a((C13924z) new C14930b(this.f43276a.mo46611f(this.f43263N)));
    }

    /* renamed from: I */
    private void m66154I() throws IOException {
        this.f43276a.mo46610e(this.f43264O);
        Iterator it = this.f43271V.values().iterator();
        while (it.hasNext()) {
            C14934e eVar = (C14934e) it.next();
            int i = 0;
            if (eVar.f43300f == null) {
                while (i < this.f43268S) {
                    this.f43269T += eVar.f43296b[i];
                    i++;
                }
            } else {
                eVar.f43300f = null;
                while (i < this.f43268S) {
                    this.f43276a.mo46610e(eVar.f43297c[i]);
                    this.f43276a.mo46610e(eVar.f43298d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f43272W = r0 - r9.f43271V.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo43904p() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo46427i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f43270U = m66153H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66155J() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.i.a r1 = r9.f43276a
            java.io.File r2 = r9.f43263N
            h.a0 r1 = r1.mo46605a(r2)
            h.e r1 = p470h.C13906p.m59739a(r1)
            java.lang.String r2 = r1.mo43921u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.mo43921u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.mo43921u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.mo43921u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.mo43921u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.f43266Q     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f43268S     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo43921u()     // Catch:{ EOFException -> 0x005d }
            r9.m66157e(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r2 = r9.f43271V     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f43272W = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo43904p()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.mo46427i()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            h.d r0 = r9.m66153H()     // Catch:{ all -> 0x00a8 }
            r9.f43270U = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            okhttp3.internal.C14910b.m66055a(r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r7.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a8 }
            r7.append(r2)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r3)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r5)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a8 }
            throw r4     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            okhttp3.internal.C14910b.m66055a(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.m66155J():void");
    }

    /* renamed from: a */
    public static C14928d m66156a(C15000a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14910b.m66052a("OkHttp DiskLruCache", true));
            C14928d dVar = new C14928d(aVar, file, i, i2, j, threadPoolExecutor);
            return dVar;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: e */
    private void m66157e(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(f43260o0)) {
                    this.f43271V.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C14934e eVar = (C14934e) this.f43271V.get(str2);
            if (eVar == null) {
                eVar = new C14934e(str2);
                this.f43271V.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f43258m0)) {
                String[] split = str.substring(indexOf2 + 1).split(C3868i.f12248b);
                eVar.f43299e = true;
                eVar.f43300f = null;
                eVar.mo46443a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f43259n0)) {
                eVar.f43300f = new C14932d(eVar);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith(f43261p0))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* renamed from: B */
    public synchronized Iterator<C14935f> mo46410B() throws IOException {
        mo46425g();
        return new C14931c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo46411F() throws IOException {
        while (this.f43269T > this.f43267R) {
            mo46416a((C14934e) this.f43271V.values().iterator().next());
        }
        this.f43277a0 = false;
    }

    @C5952h
    /* renamed from: b */
    public C14932d mo46417b(String str) throws IOException {
        return mo46412a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.internal.p514e.C14928d.C14935f mo46418c(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo46425g()     // Catch:{ all -> 0x0050 }
            r3.m66152G()     // Catch:{ all -> 0x0050 }
            r3.m66158f(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r0 = r3.f43271V     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            okhttp3.internal.e.d$e r0 = (okhttp3.internal.p514e.C14928d.C14934e) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f43299e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.internal.e.d$f r0 = r0.mo46441a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f43272W     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f43272W = r1     // Catch:{ all -> 0x0050 }
            h.d r1 = r3.f43270U     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            h.d r1 = r1.mo43853a(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            h.d r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            h.d r4 = r1.mo43853a(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo46426h()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f43281d0     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f43282e0     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.mo46418c(java.lang.String):okhttp3.internal.e.d$f");
    }

    public synchronized void close() throws IOException {
        C14934e[] eVarArr;
        if (this.f43274Y) {
            if (!this.f43275Z) {
                for (C14934e eVar : (C14934e[]) this.f43271V.values().toArray(new C14934e[this.f43271V.size()])) {
                    if (eVar.f43300f != null) {
                        eVar.f43300f.mo46436a();
                    }
                }
                mo46411F();
                this.f43270U.close();
                this.f43270U = null;
                this.f43275Z = true;
                return;
            }
        }
        this.f43275Z = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo46421d(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo46425g()     // Catch:{ all -> 0x0029 }
            r6.m66152G()     // Catch:{ all -> 0x0029 }
            r6.m66158f(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r0 = r6.f43271V     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            okhttp3.internal.e.d$e r7 = (okhttp3.internal.p514e.C14928d.C14934e) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo46416a(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f43269T     // Catch:{ all -> 0x0029 }
            long r3 = r6.f43267R     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f43277a0 = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.mo46421d(java.lang.String):boolean");
    }

    /* renamed from: f */
    public synchronized long mo46423f() {
        return this.f43267R;
    }

    public synchronized void flush() throws IOException {
        if (this.f43274Y) {
            m66152G();
            mo46411F();
            this.f43270U.flush();
        }
    }

    /* renamed from: g */
    public synchronized void mo46425g() throws IOException {
        if (!this.f43274Y) {
            if (this.f43276a.mo46609d(this.f43265P)) {
                if (this.f43276a.mo46609d(this.f43263N)) {
                    this.f43276a.mo46610e(this.f43265P);
                } else {
                    this.f43276a.mo46606a(this.f43265P, this.f43263N);
                }
            }
            if (this.f43276a.mo46609d(this.f43263N)) {
                try {
                    m66155J();
                    m66154I();
                    this.f43274Y = true;
                    return;
                } catch (IOException e) {
                    C15011f d = C15011f.m66571d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(this.f43278b);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    d.mo46615a(5, sb.toString(), (Throwable) e);
                    mo46413a();
                    this.f43275Z = false;
                } catch (Throwable th) {
                    this.f43275Z = false;
                    throw th;
                }
            }
            mo46427i();
            this.f43274Y = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo46426h() {
        int i = this.f43272W;
        return i >= 2000 && i >= this.f43271V.size();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public synchronized void mo46427i() throws IOException {
        if (this.f43270U != null) {
            this.f43270U.close();
        }
        C13892d a = C13906p.m59738a(this.f43276a.mo46607b(this.f43264O));
        try {
            a.mo43853a(f43254i0).writeByte(10);
            a.mo43853a("1").writeByte(10);
            a.mo43885f((long) this.f43266Q).writeByte(10);
            a.mo43885f((long) this.f43268S).writeByte(10);
            a.writeByte(10);
            for (C14934e eVar : this.f43271V.values()) {
                if (eVar.f43300f != null) {
                    a.mo43853a(f43259n0).writeByte(32);
                    a.mo43853a(eVar.f43295a);
                    a.writeByte(10);
                } else {
                    a.mo43853a(f43258m0).writeByte(32);
                    a.mo43853a(eVar.f43295a);
                    eVar.mo46442a(a);
                    a.writeByte(10);
                }
            }
            a.close();
            if (this.f43276a.mo46609d(this.f43263N)) {
                this.f43276a.mo46606a(this.f43263N, this.f43265P);
            }
            this.f43276a.mo46606a(this.f43264O, this.f43263N);
            this.f43276a.mo46610e(this.f43265P);
            this.f43270U = m66153H();
            this.f43273X = false;
            this.f43279b0 = false;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    public synchronized boolean isClosed() {
        return this.f43275Z;
    }

    public synchronized long size() throws IOException {
        mo46425g();
        return this.f43269T;
    }

    /* renamed from: f */
    private void m66158f(String str) {
        if (!f43257l0.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.internal.p514e.C14928d.C14932d mo46412a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo46425g()     // Catch:{ all -> 0x0074 }
            r5.m66152G()     // Catch:{ all -> 0x0074 }
            r5.m66158f(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r0 = r5.f43271V     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.internal.e.d$e r0 = (okhttp3.internal.p514e.C14928d.C14934e) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f43301g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.internal.e.d$d r7 = r0.f43300f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f43277a0     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f43279b0     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            h.d r7 = r5.f43270U     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            h.d r7 = r7.mo43853a(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            h.d r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            h.d r7 = r7.mo43853a(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            h.d r7 = r5.f43270U     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f43273X     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            okhttp3.internal.e.d$e r0 = new okhttp3.internal.e.d$e     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r7 = r5.f43271V     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.internal.e.d$d r6 = new okhttp3.internal.e.d$d     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f43300f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f43281d0     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f43282e0     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.mo46412a(java.lang.String, long):okhttp3.internal.e.d$d");
    }

    /* renamed from: d */
    public synchronized void mo46420d() throws IOException {
        mo46425g();
        for (C14934e a : (C14934e[]) this.f43271V.values().toArray(new C14934e[this.f43271V.size()])) {
            mo46416a(a);
        }
        this.f43277a0 = false;
    }

    /* renamed from: e */
    public File mo46422e() {
        return this.f43278b;
    }

    /* renamed from: a */
    public synchronized void mo46414a(long j) {
        this.f43267R = j;
        if (this.f43274Y) {
            this.f43281d0.execute(this.f43282e0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo46415a(okhttp3.internal.p514e.C14928d.C14932d r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.internal.e.d$e r0 = r10.f43290a     // Catch:{ all -> 0x00fb }
            okhttp3.internal.e.d$d r1 = r0.f43300f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f43299e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f43268S     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f43291b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.i.a r3 = r9.f43276a     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f43298d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo46609d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo46436a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo46436a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f43268S     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f43298d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            okhttp3.internal.i.a r2 = r9.f43276a     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo46609d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f43297c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.internal.i.a r3 = r9.f43276a     // Catch:{ all -> 0x00fb }
            r3.mo46606a(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f43296b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.internal.i.a r10 = r9.f43276a     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo46612g(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f43296b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f43269T     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f43269T = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            okhttp3.internal.i.a r2 = r9.f43276a     // Catch:{ all -> 0x00fb }
            r2.mo46610e(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f43272W     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f43272W = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f43300f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f43299e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f43299e = r1     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            h.d r10 = r10.mo43853a(r1)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f43295a     // Catch:{ all -> 0x00fb }
            r10.mo43853a(r1)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            r0.mo46442a(r10)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f43280c0     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f43280c0 = r1     // Catch:{ all -> 0x00fb }
            r0.f43301g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.e.d$e> r10 = r9.f43271V     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f43295a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            h.d r10 = r10.mo43853a(r11)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f43295a     // Catch:{ all -> 0x00fb }
            r10.mo43853a(r11)     // Catch:{ all -> 0x00fb }
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            h.d r10 = r9.f43270U     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f43269T     // Catch:{ all -> 0x00fb }
            long r0 = r9.f43267R     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo46426h()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f43281d0     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f43282e0     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00ff
        L_0x00fe:
            throw r10
        L_0x00ff:
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14928d.mo46415a(okhttp3.internal.e.d$d, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo46416a(C14934e eVar) throws IOException {
        C14932d dVar = eVar.f43300f;
        if (dVar != null) {
            dVar.mo46440d();
        }
        for (int i = 0; i < this.f43268S; i++) {
            this.f43276a.mo46610e(eVar.f43297c[i]);
            long j = this.f43269T;
            long[] jArr = eVar.f43296b;
            this.f43269T = j - jArr[i];
            jArr[i] = 0;
        }
        this.f43272W++;
        this.f43270U.mo43853a(f43260o0).writeByte(32).mo43853a(eVar.f43295a).writeByte(10);
        this.f43271V.remove(eVar.f43295a);
        if (mo46426h()) {
            this.f43281d0.execute(this.f43282e0);
        }
        return true;
    }

    /* renamed from: a */
    public void mo46413a() throws IOException {
        close();
        this.f43276a.mo46608c(this.f43278b);
    }
}
