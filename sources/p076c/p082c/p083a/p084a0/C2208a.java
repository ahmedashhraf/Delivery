package p076c.p082c.p083a.p084a0;

import android.util.Log;
import java.util.Queue;

/* renamed from: c.c.a.a0.a */
/* compiled from: ByteArrayPool */
public final class C2208a {

    /* renamed from: b */
    private static final String f8749b = "ByteArrayPool";

    /* renamed from: c */
    private static final int f8750c = 65536;

    /* renamed from: d */
    private static final int f8751d = 2146304;

    /* renamed from: e */
    private static final int f8752e = 32;

    /* renamed from: f */
    private static final C2208a f8753f = new C2208a();

    /* renamed from: a */
    private final Queue<byte[]> f8754a = C2216i.m11342a(0);

    private C2208a() {
    }

    /* renamed from: c */
    public static C2208a m11306c() {
        return f8753f;
    }

    /* renamed from: a */
    public void mo9361a() {
        synchronized (this.f8754a) {
            this.f8754a.clear();
        }
    }

    /* renamed from: b */
    public byte[] mo9363b() {
        byte[] bArr;
        synchronized (this.f8754a) {
            bArr = (byte[]) this.f8754a.poll();
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[65536];
        boolean isLoggable = Log.isLoggable(f8749b, 3);
        return bArr2;
    }

    /* renamed from: a */
    public boolean mo9362a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f8754a) {
            if (this.f8754a.size() < 32) {
                z = true;
                this.f8754a.offer(bArr);
            }
        }
        return z;
    }
}
