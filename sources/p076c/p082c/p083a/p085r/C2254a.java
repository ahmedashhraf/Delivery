package p076c.p082c.p083a.p085r;

import com.facebook.cache.disk.DefaultDiskStorage.FileType;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.c.a.r.a */
/* compiled from: DiskLruCache */
public final class C2254a implements Closeable {

    /* renamed from: Z */
    static final String f8891Z = "journal";

    /* renamed from: a0 */
    static final String f8892a0 = "journal.tmp";

    /* renamed from: b0 */
    static final String f8893b0 = "journal.bkp";

    /* renamed from: c0 */
    static final String f8894c0 = "libcore.io.DiskLruCache";

    /* renamed from: d0 */
    static final String f8895d0 = "1";

    /* renamed from: e0 */
    static final long f8896e0 = -1;

    /* renamed from: f0 */
    private static final String f8897f0 = "CLEAN";

    /* renamed from: g0 */
    private static final String f8898g0 = "DIRTY";

    /* renamed from: h0 */
    private static final String f8899h0 = "REMOVE";

    /* renamed from: i0 */
    private static final String f8900i0 = "READ";

    /* renamed from: N */
    private final File f8901N;

    /* renamed from: O */
    private final File f8902O;

    /* renamed from: P */
    private final int f8903P;

    /* renamed from: Q */
    private long f8904Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final int f8905R;

    /* renamed from: S */
    private long f8906S = 0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Writer f8907T;

    /* renamed from: U */
    private final LinkedHashMap<String, C2257c> f8908U = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f8909V;

    /* renamed from: W */
    private long f8910W = 0;

    /* renamed from: X */
    final ThreadPoolExecutor f8911X;

    /* renamed from: Y */
    private final Callable<Void> f8912Y;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f8913a;

    /* renamed from: b */
    private final File f8914b;

    /* renamed from: c.c.a.r.a$a */
    /* compiled from: DiskLruCache */
    class C2255a implements Callable<Void> {
        C2255a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                c.c.a.r.a r0 = p076c.p082c.p083a.p085r.C2254a.this
                monitor-enter(r0)
                c.c.a.r.a r1 = p076c.p082c.p083a.p085r.C2254a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f8907T     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                c.c.a.r.a r1 = p076c.p082c.p083a.p085r.C2254a.this     // Catch:{ all -> 0x0028 }
                r1.m11755F()     // Catch:{ all -> 0x0028 }
                c.c.a.r.a r1 = p076c.p082c.p083a.p085r.C2254a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m11774g()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                c.c.a.r.a r1 = p076c.p082c.p083a.p085r.C2254a.this     // Catch:{ all -> 0x0028 }
                r1.m11754B()     // Catch:{ all -> 0x0028 }
                c.c.a.r.a r1 = p076c.p082c.p083a.p085r.C2254a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f8909V = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p085r.C2254a.C2255a.call():java.lang.Void");
        }
    }

    /* renamed from: c.c.a.r.a$b */
    /* compiled from: DiskLruCache */
    public final class C2256b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2257c f8916a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f8917b;

        /* renamed from: c */
        private boolean f8918c;

        /* synthetic */ C2256b(C2254a aVar, C2257c cVar, C2255a aVar2) {
            this(cVar);
        }

        /* renamed from: c */
        private InputStream m11786c(int i) throws IOException {
            synchronized (C2254a.this) {
                if (this.f8916a.f8925f != this) {
                    throw new IllegalStateException();
                } else if (!this.f8916a.f8924e) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f8916a.mo9570a(i));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        private C2256b(C2257c cVar) {
            this.f8916a = cVar;
            this.f8917b = cVar.f8924e ? null : new boolean[C2254a.this.f8905R];
        }

        /* renamed from: a */
        public File mo9564a(int i) throws IOException {
            File b;
            synchronized (C2254a.this) {
                if (this.f8916a.f8925f == this) {
                    if (!this.f8916a.f8924e) {
                        this.f8917b[i] = true;
                    }
                    b = this.f8916a.mo9572b(i);
                    if (!C2254a.this.f8913a.exists()) {
                        C2254a.this.f8913a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: b */
        public String mo9567b(int i) throws IOException {
            InputStream c = m11786c(i);
            if (c != null) {
                return C2254a.m11766b(c);
            }
            return null;
        }

        /* renamed from: b */
        public void mo9568b() {
            if (!this.f8918c) {
                try {
                    mo9565a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo9569c() throws IOException {
            C2254a.this.m11762a(this, true);
            this.f8918c = true;
        }

        /* renamed from: a */
        public void mo9566a(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(mo9564a(i)), C2261c.f8942b);
                try {
                    outputStreamWriter2.write(str);
                    C2261c.m11816a((Closeable) outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    C2261c.m11816a((Closeable) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C2261c.m11816a((Closeable) outputStreamWriter);
                throw th;
            }
        }

        /* renamed from: a */
        public void mo9565a() throws IOException {
            C2254a.this.m11762a(this, false);
        }
    }

    /* renamed from: c.c.a.r.a$c */
    /* compiled from: DiskLruCache */
    private final class C2257c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f8920a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f8921b;

        /* renamed from: c */
        File[] f8922c;

        /* renamed from: d */
        File[] f8923d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f8924e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2256b f8925f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f8926g;

        /* synthetic */ C2257c(C2254a aVar, String str, C2255a aVar2) {
            this(str);
        }

        private C2257c(String str) {
            this.f8920a = str;
            this.f8921b = new long[C2254a.this.f8905R];
            this.f8922c = new File[C2254a.this.f8905R];
            this.f8923d = new File[C2254a.this.f8905R];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C2254a.this.f8905R; i++) {
                sb.append(i);
                this.f8922c[i] = new File(C2254a.this.f8913a, sb.toString());
                sb.append(FileType.TEMP);
                this.f8923d[i] = new File(C2254a.this.f8913a, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m11800b(String[] strArr) throws IOException {
            if (strArr.length == C2254a.this.f8905R) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f8921b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m11795a(strArr);
                    }
                }
                return;
            }
            throw m11795a(strArr);
        }

        /* renamed from: a */
        public String mo9571a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f8921b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo9572b(int i) {
            return this.f8923d[i];
        }

        /* renamed from: a */
        private IOException m11795a(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo9570a(int i) {
            return this.f8922c[i];
        }
    }

    /* renamed from: c.c.a.r.a$d */
    /* compiled from: DiskLruCache */
    public final class C2258d {

        /* renamed from: a */
        private final String f8928a;

        /* renamed from: b */
        private final long f8929b;

        /* renamed from: c */
        private final long[] f8930c;

        /* renamed from: d */
        private final File[] f8931d;

        /* synthetic */ C2258d(C2254a aVar, String str, long j, File[] fileArr, long[] jArr, C2255a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public C2256b mo9573a() throws IOException {
            return C2254a.this.m11758a(this.f8928a, this.f8929b);
        }

        /* renamed from: b */
        public long mo9575b(int i) {
            return this.f8930c[i];
        }

        /* renamed from: c */
        public String mo9576c(int i) throws IOException {
            return C2254a.m11766b((InputStream) new FileInputStream(this.f8931d[i]));
        }

        private C2258d(String str, long j, File[] fileArr, long[] jArr) {
            this.f8928a = str;
            this.f8929b = j;
            this.f8931d = fileArr;
            this.f8930c = jArr;
        }

        /* renamed from: a */
        public File mo9574a(int i) {
            return this.f8931d[i];
        }
    }

    private C2254a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f8911X = threadPoolExecutor;
        this.f8912Y = new C2255a();
        this.f8913a = file2;
        this.f8903P = i;
        this.f8914b = new File(file2, f8891Z);
        this.f8901N = new File(file2, f8892a0);
        this.f8902O = new File(file2, f8893b0);
        this.f8905R = i2;
        this.f8904Q = j;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: B */
    public synchronized void m11754B() throws IOException {
        if (this.f8907T != null) {
            this.f8907T.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8901N), C2261c.f8941a));
        try {
            bufferedWriter.write(f8894c0);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8903P));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8905R));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2257c cVar : this.f8908U.values()) {
                if (cVar.f8925f != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(cVar.f8920a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(cVar.f8920a);
                    sb2.append(cVar.mo9571a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f8914b.exists()) {
                m11765a(this.f8914b, this.f8902O, true);
            }
            m11765a(this.f8901N, this.f8914b, false);
            this.f8902O.delete();
            this.f8907T = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8914b, true), C2261c.f8941a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m11755F() throws IOException {
        while (this.f8906S > this.f8904Q) {
            mo9558d((String) ((Entry) this.f8908U.entrySet().iterator().next()).getKey());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m11774g() {
        int i = this.f8909V;
        return i >= 2000 && i >= this.f8908U.size();
    }

    /* renamed from: h */
    private void m11775h() throws IOException {
        m11764a(this.f8901N);
        Iterator it = this.f8908U.values().iterator();
        while (it.hasNext()) {
            C2257c cVar = (C2257c) it.next();
            int i = 0;
            if (cVar.f8925f == null) {
                while (i < this.f8905R) {
                    this.f8906S += cVar.f8921b[i];
                    i++;
                }
            } else {
                cVar.f8925f = null;
                while (i < this.f8905R) {
                    m11764a(cVar.mo9570a(i));
                    m11764a(cVar.mo9572b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f8909V = r0 - r9.f8908U.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo9577a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m11754B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f8907T = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f8914b, true), p076c.p082c.p083a.p085r.C2261c.f8941a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11776i() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            c.c.a.r.b r1 = new c.c.a.r.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f8914b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p076c.p082c.p083a.p085r.C2261c.f8941a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo9579d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo9579d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo9579d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo9579d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo9579d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f8903P     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f8905R     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo9579d()     // Catch:{ EOFException -> 0x005f }
            r9.m11770e(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r2 = r9.f8908U     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f8909V = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo9577a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m11754B()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f8914b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p076c.p082c.p083a.p085r.C2261c.f8941a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f8907T = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p076c.p082c.p083a.p085r.C2261c.m11816a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p076c.p082c.p083a.p085r.C2261c.m11816a(r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p085r.C2254a.m11776i():void");
    }

    public synchronized void close() throws IOException {
        if (this.f8907T != null) {
            Iterator it = new ArrayList(this.f8908U.values()).iterator();
            while (it.hasNext()) {
                C2257c cVar = (C2257c) it.next();
                if (cVar.f8925f != null) {
                    cVar.f8925f.mo9565a();
                }
            }
            m11755F();
            this.f8907T.close();
            this.f8907T = null;
        }
    }

    public synchronized void flush() throws IOException {
        m11772f();
        m11755F();
        this.f8907T.flush();
    }

    public synchronized boolean isClosed() {
        return this.f8907T == null;
    }

    public synchronized long size() {
        return this.f8906S;
    }

    /* renamed from: e */
    private void m11770e(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(f8899h0)) {
                    this.f8908U.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2257c cVar = (C2257c) this.f8908U.get(str2);
            if (cVar == null) {
                cVar = new C2257c(this, str2, null);
                this.f8908U.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f8897f0)) {
                String[] split = str.substring(indexOf2 + 1).split(C3868i.f12248b);
                cVar.f8924e = true;
                cVar.f8925f = null;
                cVar.m11800b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f8898g0)) {
                cVar.f8925f = new C2256b(this, cVar, null);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith(f8900i0))) {
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

    /* renamed from: f */
    private void m11772f() {
        if (this.f8907T == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public C2256b mo9554b(String str) throws IOException {
        return m11758a(str, -1);
    }

    /* renamed from: c */
    public synchronized C2258d mo9555c(String str) throws IOException {
        m11772f();
        C2257c cVar = (C2257c) this.f8908U.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f8924e) {
            return null;
        }
        for (File exists : cVar.f8922c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f8909V++;
        this.f8907T.append(f8900i0);
        this.f8907T.append(' ');
        this.f8907T.append(str);
        this.f8907T.append(10);
        if (m11774g()) {
            this.f8911X.submit(this.f8912Y);
        }
        C2258d dVar = new C2258d(this, str, cVar.f8926g, cVar.f8922c, cVar.f8921b, null);
        return dVar;
    }

    /* renamed from: d */
    public File mo9557d() {
        return this.f8913a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m11766b(InputStream inputStream) throws IOException {
        return C2261c.m11815a((Reader) new InputStreamReader(inputStream, C2261c.f8942b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo9558d(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m11772f()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r0 = r7.f8908U     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            c.c.a.r.a$c r0 = (p076c.p082c.p083a.p085r.C2254a.C2257c) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            c.c.a.r.a$b r2 = r0.f8925f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f8905R     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo9570a(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f8906S     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f8921b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f8906S = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f8921b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f8909V     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f8909V = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8907T     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8907T     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8907T     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f8907T     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r0 = r7.f8908U     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m11774g()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f8911X     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f8912Y     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p085r.C2254a.mo9558d(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C2254a m11759a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, f8893b0);
            if (file2.exists()) {
                File file3 = new File(file, f8891Z);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m11765a(file2, file3, false);
                }
            }
            C2254a aVar = new C2254a(file, i, i2, j);
            if (aVar.f8914b.exists()) {
                try {
                    aVar.m11776i();
                    aVar.m11775h();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo9552a();
                }
            }
            file.mkdirs();
            C2254a aVar2 = new C2254a(file, i, i2, j);
            aVar2.m11754B();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: e */
    public synchronized long mo9559e() {
        return this.f8904Q;
    }

    /* renamed from: a */
    private static void m11764a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m11765a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m11764a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p076c.p082c.p083a.p085r.C2254a.C2256b m11758a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m11772f()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r0 = r5.f8908U     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            c.c.a.r.a$c r0 = (p076c.p082c.p083a.p085r.C2254a.C2257c) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f8926g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            c.c.a.r.a$c r0 = new c.c.a.r.a$c     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r7 = r5.f8908U     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            c.c.a.r.a$b r7 = r0.f8925f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            c.c.a.r.a$b r7 = new c.c.a.r.a$b     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            r0.f8925f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8907T     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8907T     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f8907T     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f8907T     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f8907T     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p085r.C2254a.m11758a(java.lang.String, long):c.c.a.r.a$b");
    }

    /* renamed from: a */
    public synchronized void mo9553a(long j) {
        this.f8904Q = j;
        this.f8911X.submit(this.f8912Y);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11762a(p076c.p082c.p083a.p085r.C2254a.C2256b r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            c.c.a.r.a$c r0 = r10.f8916a     // Catch:{ all -> 0x010e }
            c.c.a.r.a$b r1 = r0.f8925f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f8924e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f8905R     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f8917b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo9572b(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo9565a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo9565a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f8905R     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo9572b(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo9570a(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f8921b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f8921b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f8906S     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f8906S = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m11764a(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f8909V     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f8909V = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            r0.f8925f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f8924e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            r0.f8924e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f8920a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo9571a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f8910W     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f8910W = r1     // Catch:{ all -> 0x010e }
            r0.f8926g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, c.c.a.r.a$c> r10 = r9.f8908U     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f8920a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f8920a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f8907T     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f8906S     // Catch:{ all -> 0x010e }
            long r0 = r9.f8904Q     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m11774g()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f8911X     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f8912Y     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p085r.C2254a.m11762a(c.c.a.r.a$b, boolean):void");
    }

    /* renamed from: a */
    public void mo9552a() throws IOException {
        close();
        C2261c.m11817a(this.f8913a);
    }
}
