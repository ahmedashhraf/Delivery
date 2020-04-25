package com.google.common.p190io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;

@C2775a
/* renamed from: com.google.common.io.p */
/* compiled from: FileBackedOutputStream */
public final class C8396p extends OutputStream {

    /* renamed from: N */
    private final C8358f f22296N;

    /* renamed from: O */
    private OutputStream f22297O;

    /* renamed from: P */
    private C8399c f22298P;

    /* renamed from: Q */
    private File f22299Q;

    /* renamed from: a */
    private final int f22300a;

    /* renamed from: b */
    private final boolean f22301b;

    /* renamed from: com.google.common.io.p$a */
    /* compiled from: FileBackedOutputStream */
    class C8397a extends C8358f {
        C8397a() {
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return C8396p.this.m39912f();
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                C8396p.this.mo31542e();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* renamed from: com.google.common.io.p$b */
    /* compiled from: FileBackedOutputStream */
    class C8398b extends C8358f {
        C8398b() {
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return C8396p.this.m39912f();
        }
    }

    /* renamed from: com.google.common.io.p$c */
    /* compiled from: FileBackedOutputStream */
    private static class C8399c extends ByteArrayOutputStream {
        private C8399c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public byte[] mo31548c() {
            return this.buf;
        }

        /* access modifiers changed from: 0000 */
        public int getCount() {
            return this.count;
        }

        /* synthetic */ C8399c(C8397a aVar) {
            this();
        }
    }

    public C8396p(int i) {
        this(i, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized InputStream m39912f() throws IOException {
        if (this.f22299Q != null) {
            return new FileInputStream(this.f22299Q);
        }
        return new ByteArrayInputStream(this.f22298P.mo31548c(), 0, this.f22298P.getCount());
    }

    public synchronized void close() throws IOException {
        this.f22297O.close();
    }

    /* access modifiers changed from: 0000 */
    @C2778d
    /* renamed from: d */
    public synchronized File mo31541d() {
        return this.f22299Q;
    }

    /* renamed from: e */
    public synchronized void mo31542e() throws IOException {
        try {
            close();
            if (this.f22298P == null) {
                this.f22298P = new C8399c(null);
            } else {
                this.f22298P.reset();
            }
            this.f22297O = this.f22298P;
            if (this.f22299Q != null) {
                File file = this.f22299Q;
                this.f22299Q = null;
                if (!file.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not delete: ");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
            }
        } catch (Throwable th) {
            if (this.f22298P == null) {
                this.f22298P = new C8399c(null);
            } else {
                this.f22298P.reset();
            }
            this.f22297O = this.f22298P;
            if (this.f22299Q != null) {
                File file2 = this.f22299Q;
                this.f22299Q = null;
                if (!file2.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not delete: ");
                    sb2.append(file2);
                    throw new IOException(sb2.toString());
                }
            }
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        this.f22297O.flush();
    }

    public synchronized void write(int i) throws IOException {
        m39911a(1);
        this.f22297O.write(i);
    }

    public C8396p(int i, boolean z) {
        this.f22300a = i;
        this.f22301b = z;
        this.f22298P = new C8399c(null);
        this.f22297O = this.f22298P;
        if (z) {
            this.f22296N = new C8397a();
        } else {
            this.f22296N = new C8398b();
        }
    }

    /* renamed from: a */
    public C8358f mo31539a() {
        return this.f22296N;
    }

    /* renamed from: a */
    private void m39911a(int i) throws IOException {
        if (this.f22299Q == null && this.f22298P.getCount() + i > this.f22300a) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", null);
            if (this.f22301b) {
                createTempFile.deleteOnExit();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(this.f22298P.mo31548c(), 0, this.f22298P.getCount());
            fileOutputStream.flush();
            this.f22297O = fileOutputStream;
            this.f22299Q = createTempFile;
            this.f22298P = null;
        }
    }

    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m39911a(i2);
        this.f22297O.write(bArr, i, i2);
    }
}
