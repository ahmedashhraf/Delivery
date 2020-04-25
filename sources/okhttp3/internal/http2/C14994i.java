package okhttp3.internal.http2;

import com.mrsool.utils.C11644i;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C14910b;
import p470h.C13887c;
import p470h.C13892d;

/* renamed from: okhttp3.internal.http2.i */
/* compiled from: Http2Writer */
final class C14994i implements Closeable {

    /* renamed from: R */
    private static final Logger f43584R = Logger.getLogger(C14969d.class.getName());

    /* renamed from: N */
    private final C13887c f43585N = new C13887c();

    /* renamed from: O */
    private int f43586O = 16384;

    /* renamed from: P */
    private boolean f43587P;

    /* renamed from: Q */
    final C14968b f43588Q = new C14968b(this.f43585N);

    /* renamed from: a */
    private final C13892d f43589a;

    /* renamed from: b */
    private final boolean f43590b;

    C14994i(C13892d dVar, boolean z) {
        this.f43589a = dVar;
        this.f43590b = z;
    }

    /* renamed from: a */
    public synchronized void mo46568a() throws IOException {
        if (this.f43587P) {
            throw new IOException(C11644i.f33433v3);
        } else if (this.f43590b) {
            if (f43584R.isLoggable(Level.FINE)) {
                f43584R.fine(C14910b.m66045a(">> CONNECTION %s", C14969d.f43441a.mo43977g()));
            }
            this.f43589a.write(C14969d.f43441a.mo43989u());
            this.f43589a.flush();
        }
    }

    /* renamed from: b */
    public synchronized void mo46582b(boolean z, int i, List<C14964b> list) throws IOException {
        if (!this.f43587P) {
            mo46580a(z, i, list);
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    public synchronized void close() throws IOException {
        this.f43587P = true;
        this.f43589a.close();
    }

    /* renamed from: d */
    public int mo46584d() {
        return this.f43586O;
    }

    public synchronized void flush() throws IOException {
        if (!this.f43587P) {
            this.f43589a.flush();
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: b */
    public synchronized void mo46581b(C14999l lVar) throws IOException {
        if (!this.f43587P) {
            int i = 0;
            mo46570a(0, lVar.mo46602d() * 6, 4, 0);
            while (i < 10) {
                if (lVar.mo46604e(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.f43589a.writeShort(i2);
                    this.f43589a.writeInt(lVar.mo46593a(i));
                }
                i++;
            }
            this.f43589a.flush();
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public synchronized void mo46576a(C14999l lVar) throws IOException {
        if (!this.f43587P) {
            this.f43586O = lVar.mo46601c(this.f43586O);
            if (lVar.mo46598b() != -1) {
                this.f43588Q.mo46491a(lVar.mo46598b());
            }
            mo46570a(0, 0, 4, 1);
            this.f43589a.flush();
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: b */
    private void m66466b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f43586O, j);
            long j2 = (long) min;
            j -= j2;
            mo46570a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.f43589a.mo43815b(this.f43585N, j2);
        }
    }

    /* renamed from: a */
    public synchronized void mo46571a(int i, int i2, List<C14964b> list) throws IOException {
        if (!this.f43587P) {
            this.f43588Q.mo46494a(list);
            long size = this.f43585N.size();
            int min = (int) Math.min((long) (this.f43586O - 4), size);
            long j = (long) min;
            mo46570a(i, min + 4, 5, size == j ? (byte) 4 : 0);
            this.f43589a.writeInt(i2 & Integer.MAX_VALUE);
            this.f43589a.mo43815b(this.f43585N, j);
            if (size > j) {
                m66466b(i, size - j);
            }
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public synchronized void mo46578a(boolean z, int i, int i2, List<C14964b> list) throws IOException {
        if (!this.f43587P) {
            mo46580a(z, i, list);
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public synchronized void mo46573a(int i, List<C14964b> list) throws IOException {
        if (!this.f43587P) {
            mo46580a(false, i, list);
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public synchronized void mo46574a(int i, C14963a aVar) throws IOException {
        if (this.f43587P) {
            throw new IOException(C11644i.f33433v3);
        } else if (aVar.httpCode != -1) {
            mo46570a(i, 4, 3, 0);
            this.f43589a.writeInt(aVar.httpCode);
            this.f43589a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public synchronized void mo46579a(boolean z, int i, C13887c cVar, int i2) throws IOException {
        if (!this.f43587P) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo46569a(i, b, cVar, i2);
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46569a(int i, byte b, C13887c cVar, int i2) throws IOException {
        mo46570a(i, i2, 0, b);
        if (i2 > 0) {
            this.f43589a.mo43815b(cVar, (long) i2);
        }
    }

    /* renamed from: a */
    public synchronized void mo46577a(boolean z, int i, int i2) throws IOException {
        if (!this.f43587P) {
            mo46570a(0, 8, 6, z ? (byte) 1 : 0);
            this.f43589a.writeInt(i);
            this.f43589a.writeInt(i2);
            this.f43589a.flush();
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: a */
    public synchronized void mo46575a(int i, C14963a aVar, byte[] bArr) throws IOException {
        if (this.f43587P) {
            throw new IOException(C11644i.f33433v3);
        } else if (aVar.httpCode != -1) {
            mo46570a(0, bArr.length + 8, 7, 0);
            this.f43589a.writeInt(i);
            this.f43589a.writeInt(aVar.httpCode);
            if (bArr.length > 0) {
                this.f43589a.write(bArr);
            }
            this.f43589a.flush();
        } else {
            throw C14969d.m66327a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    public synchronized void mo46572a(int i, long j) throws IOException {
        if (this.f43587P) {
            throw new IOException(C11644i.f33433v3);
        } else if (j == 0 || j > 2147483647L) {
            throw C14969d.m66327a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo46570a(i, 4, 8, 0);
            this.f43589a.writeInt((int) j);
            this.f43589a.flush();
        }
    }

    /* renamed from: a */
    public void mo46570a(int i, int i2, byte b, byte b2) throws IOException {
        if (f43584R.isLoggable(Level.FINE)) {
            f43584R.fine(C14969d.m66329a(false, i, i2, b, b2));
        }
        int i3 = this.f43586O;
        if (i2 > i3) {
            throw C14969d.m66327a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m66465a(this.f43589a, i2);
            this.f43589a.writeByte(b & 255);
            this.f43589a.writeByte(b2 & 255);
            this.f43589a.writeInt(i & Integer.MAX_VALUE);
        } else {
            throw C14969d.m66327a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private static void m66465a(C13892d dVar, int i) throws IOException {
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46580a(boolean z, int i, List<C14964b> list) throws IOException {
        if (!this.f43587P) {
            this.f43588Q.mo46494a(list);
            long size = this.f43585N.size();
            int min = (int) Math.min((long) this.f43586O, size);
            long j = (long) min;
            byte b = size == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo46570a(i, min, 1, b);
            this.f43589a.mo43815b(this.f43585N, j);
            if (size > j) {
                m66466b(i, size - j);
                return;
            }
            return;
        }
        throw new IOException(C11644i.f33433v3);
    }
}
