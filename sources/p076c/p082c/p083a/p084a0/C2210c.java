package p076c.p082c.p083a.p084a0;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: c.c.a.a0.c */
/* compiled from: ExceptionCatchingInputStream */
public class C2210c extends InputStream {

    /* renamed from: N */
    private static final Queue<C2210c> f8759N = C2216i.m11342a(0);

    /* renamed from: a */
    private InputStream f8760a;

    /* renamed from: b */
    private IOException f8761b;

    C2210c() {
    }

    /* renamed from: b */
    public static C2210c m11314b(InputStream inputStream) {
        C2210c cVar;
        synchronized (f8759N) {
            cVar = (C2210c) f8759N.poll();
        }
        if (cVar == null) {
            cVar = new C2210c();
        }
        cVar.mo9369a(inputStream);
        return cVar;
    }

    /* renamed from: d */
    static void m11315d() {
        while (!f8759N.isEmpty()) {
            f8759N.remove();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9369a(InputStream inputStream) {
        this.f8760a = inputStream;
    }

    public int available() throws IOException {
        return this.f8760a.available();
    }

    public void close() throws IOException {
        this.f8760a.close();
    }

    public void mark(int i) {
        this.f8760a.mark(i);
    }

    public boolean markSupported() {
        return this.f8760a.markSupported();
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f8760a.read(bArr);
        } catch (IOException e) {
            this.f8761b = e;
            return -1;
        }
    }

    public void release() {
        this.f8761b = null;
        this.f8760a = null;
        synchronized (f8759N) {
            f8759N.offer(this);
        }
    }

    public synchronized void reset() throws IOException {
        this.f8760a.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f8760a.skip(j);
        } catch (IOException e) {
            this.f8761b = e;
            return 0;
        }
    }

    /* renamed from: a */
    public IOException mo9368a() {
        return this.f8761b;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f8760a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f8761b = e;
            return -1;
        }
    }

    public int read() throws IOException {
        try {
            return this.f8760a.read();
        } catch (IOException e) {
            this.f8761b = e;
            return -1;
        }
    }
}
