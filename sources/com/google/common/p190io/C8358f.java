package com.google.common.p190io;

import com.google.common.base.C5785c;
import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p276c.C6549j;
import p076c.p112d.p148d.p276c.C6558k;
import p076c.p112d.p148d.p276c.C6562l;
import p076c.p112d.p148d.p276c.C6563m;
import p076c.p112d.p148d.p276c.C6590t;

/* renamed from: com.google.common.io.f */
/* compiled from: ByteSource */
public abstract class C8358f implements C8421u<InputStream> {

    /* renamed from: a */
    private static final int f22251a = 4096;

    /* renamed from: b */
    private static final byte[] f22252b = new byte[4096];

    /* renamed from: com.google.common.io.f$b */
    /* compiled from: ByteSource */
    private final class C8360b extends C8377j {

        /* renamed from: a */
        private final Charset f22253a;

        /* renamed from: d */
        public Reader mo31462d() throws IOException {
            return new InputStreamReader(C8358f.this.mo23252d(), this.f22253a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C8358f.this.toString());
            sb.append(".asCharSource(");
            sb.append(this.f22253a);
            sb.append(")");
            return sb.toString();
        }

        private C8360b(Charset charset) {
            this.f22253a = (Charset) C7397x.m35664a(charset);
        }
    }

    /* renamed from: com.google.common.io.f$c */
    /* compiled from: ByteSource */
    private static class C8361c extends C8358f {

        /* renamed from: c */
        protected final byte[] f22255c;

        protected C8361c(byte[] bArr) {
            this.f22255c = (byte[]) C7397x.m35664a(bArr);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo31455a() throws IOException {
            return C8358f.super.m39753a();
        }

        /* renamed from: b */
        public boolean mo31458b() {
            return this.f22255c.length == 0;
        }

        /* renamed from: c */
        public InputStream mo31459c() throws IOException {
            return mo23252d();
        }

        /* renamed from: d */
        public InputStream mo23252d() {
            return new ByteArrayInputStream(this.f22255c);
        }

        /* renamed from: e */
        public byte[] mo31460e() {
            return (byte[]) this.f22255c.clone();
        }

        /* renamed from: f */
        public long mo31461f() {
            return (long) this.f22255c.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ByteSource.wrap(");
            sb.append(C5785c.m25355a(BaseEncoding.m25658e().mo23243a(this.f22255c), 30, "..."));
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public long mo31451a(OutputStream outputStream) throws IOException {
            outputStream.write(this.f22255c);
            return (long) this.f22255c.length;
        }

        /* renamed from: a */
        public <T> T mo31456a(C8350d<T> dVar) throws IOException {
            byte[] bArr = this.f22255c;
            dVar.mo31438a(bArr, 0, bArr.length);
            return dVar.getResult();
        }

        /* renamed from: a */
        public C6558k mo31452a(C6562l lVar) throws IOException {
            return lVar.mo26440a(this.f22255c);
        }
    }

    /* renamed from: com.google.common.io.f$d */
    /* compiled from: ByteSource */
    private static final class C8362d extends C8358f {

        /* renamed from: c */
        private final Iterable<? extends C8358f> f22256c;

        C8362d(Iterable<? extends C8358f> iterable) {
            this.f22256c = (Iterable) C7397x.m35664a(iterable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo31455a() throws IOException {
            return C8358f.super.m39753a();
        }

        /* renamed from: b */
        public boolean mo31458b() throws IOException {
            for (C8358f b : this.f22256c) {
                if (!b.mo31458b()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return new C8345a0(this.f22256c.iterator());
        }

        /* renamed from: f */
        public long mo31461f() throws IOException {
            long j = 0;
            for (C8358f f : this.f22256c) {
                j += f.mo31461f();
            }
            return j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ByteSource.concat(");
            sb.append(this.f22256c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.f$e */
    /* compiled from: ByteSource */
    private static final class C8363e extends C8361c {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final C8363e f22257d = new C8363e();

        private C8363e() {
            super(new byte[0]);
        }

        /* renamed from: a */
        public C8377j mo31454a(Charset charset) {
            C7397x.m35664a(charset);
            return C8377j.m39840h();
        }

        /* renamed from: e */
        public byte[] mo31460e() {
            return this.f22255c;
        }

        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* renamed from: com.google.common.io.f$f */
    /* compiled from: ByteSource */
    private final class C8364f extends C8358f {

        /* renamed from: c */
        private final long f22258c;

        /* renamed from: d */
        private final long f22259d;

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo31455a() throws IOException {
            return C8358f.super.m39753a();
        }

        /* renamed from: b */
        public boolean mo31458b() throws IOException {
            return this.f22259d == 0 || C8358f.super.mo31458b();
        }

        /* renamed from: c */
        public InputStream mo31459c() throws IOException {
            return m39778a(C8358f.this.mo31459c());
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return m39778a(C8358f.this.mo23252d());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C8358f.this.toString());
            sb.append(".slice(");
            sb.append(this.f22258c);
            sb.append(", ");
            sb.append(this.f22259d);
            sb.append(")");
            return sb.toString();
        }

        private C8364f(long j, long j2) {
            C7397x.m35672a(j >= 0, "offset (%s) may not be negative", Long.valueOf(j));
            C7397x.m35672a(j2 >= 0, "length (%s) may not be negative", Long.valueOf(j2));
            this.f22258c = j;
            this.f22259d = j2;
        }

        /* renamed from: a */
        private InputStream m39778a(InputStream inputStream) throws IOException {
            C8390m a;
            long j = this.f22258c;
            if (j > 0) {
                try {
                    C8366g.m39817b(inputStream, j);
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            return C8366g.m39804a(inputStream, this.f22259d);
        }

        /* renamed from: a */
        public C8358f mo31453a(long j, long j2) {
            C7397x.m35672a(j >= 0, "offset (%s) may not be negative", Long.valueOf(j));
            C7397x.m35672a(j2 >= 0, "length (%s) may not be negative", Long.valueOf(j2));
            return C8358f.this.mo31453a(this.f22258c + j, Math.min(j2, this.f22259d - j));
        }
    }

    protected C8358f() {
    }

    /* renamed from: g */
    public static C8358f m39746g() {
        return C8363e.f22257d;
    }

    /* renamed from: b */
    public boolean mo31458b() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            boolean z = ((InputStream) a.mo31523a(mo23252d())).read() == -1;
            a.close();
            return z;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: c */
    public InputStream mo31459c() throws IOException {
        InputStream d = mo23252d();
        return d instanceof BufferedInputStream ? (BufferedInputStream) d : new BufferedInputStream(d);
    }

    /* renamed from: d */
    public abstract InputStream mo23252d() throws IOException;

    /* renamed from: e */
    public byte[] mo31460e() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            byte[] a2 = C8366g.m39810a((InputStream) a.mo31523a(mo23252d()));
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: f */
    public long mo31461f() throws IOException {
        C8390m a;
        C8390m a2 = C8390m.m39900a();
        try {
            long b = m39745b((InputStream) a2.mo31523a(mo23252d()));
            a2.close();
            return b;
        } catch (IOException unused) {
            a2.close();
            a = C8390m.m39900a();
            long a3 = m39740a((InputStream) a.mo31523a(mo23252d()));
            a.close();
            return a3;
        } catch (Throwable th) {
            try {
                throw a.mo31524a(th);
            } catch (Throwable th2) {
                a.close();
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public C8377j mo31454a(Charset charset) {
        return new C8360b(charset);
    }

    @Deprecated
    /* renamed from: a */
    public final InputStream m39753a() throws IOException {
        return mo23252d();
    }

    /* renamed from: a */
    public C8358f mo31453a(long j, long j2) {
        C8364f fVar = new C8364f(j, j2);
        return fVar;
    }

    /* renamed from: a */
    private long m39740a(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long read = (long) inputStream.read(f22252b);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: a */
    public long mo31451a(OutputStream outputStream) throws IOException {
        C7397x.m35664a(outputStream);
        C8390m a = C8390m.m39900a();
        try {
            long a2 = C8366g.m39788a((InputStream) a.mo31523a(mo23252d()), outputStream);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    private long m39745b(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long skip = inputStream.skip((long) Math.min(inputStream.available(), Integer.MAX_VALUE));
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j;
                }
                if (j == 0 && inputStream.available() == 0) {
                    throw new IOException();
                }
                skip = 1;
            }
            j += skip;
        }
    }

    /* renamed from: a */
    public long mo31450a(C8352e eVar) throws IOException {
        C7397x.m35664a(eVar);
        C8390m a = C8390m.m39900a();
        try {
            long a2 = C8366g.m39788a((InputStream) a.mo31523a(mo23252d()), (OutputStream) a.mo31523a(eVar.mo23251c()));
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @C2775a
    /* renamed from: a */
    public <T> T mo31456a(C8350d<T> dVar) throws IOException {
        C7397x.m35664a(dVar);
        C8390m a = C8390m.m39900a();
        try {
            T a2 = C8366g.m39806a((InputStream) a.mo31523a(mo23252d()), dVar);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public C6558k mo31452a(C6562l lVar) throws IOException {
        C6563m a = lVar.mo26428a();
        mo31451a(C6549j.m31178a((C6590t) a));
        return a.mo26429a();
    }

    /* renamed from: a */
    public boolean mo31457a(C8358f fVar) throws IOException {
        int a;
        C7397x.m35664a(fVar);
        byte[] bArr = new byte[4096];
        byte[] bArr2 = new byte[4096];
        C8390m a2 = C8390m.m39900a();
        try {
            InputStream inputStream = (InputStream) a2.mo31523a(mo23252d());
            InputStream inputStream2 = (InputStream) a2.mo31523a(fVar.mo23252d());
            do {
                a = C8366g.m39784a(inputStream, bArr, 0, 4096);
                if (a != C8366g.m39784a(inputStream2, bArr2, 0, 4096) || !Arrays.equals(bArr, bArr2)) {
                    a2.close();
                    return false;
                }
            } while (a == 4096);
            a2.close();
            return true;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C8358f m39741a(Iterable<? extends C8358f> iterable) {
        return new C8362d(iterable);
    }

    /* renamed from: a */
    public static C8358f m39742a(Iterator<? extends C8358f> it) {
        return m39741a((Iterable<? extends C8358f>) C8257x2.m39406a(it));
    }

    /* renamed from: a */
    public static C8358f m39744a(C8358f... fVarArr) {
        return m39741a((Iterable<? extends C8358f>) C8257x2.m39410c(fVarArr));
    }

    /* renamed from: a */
    public static C8358f m39743a(byte[] bArr) {
        return new C8361c(bArr);
    }
}
