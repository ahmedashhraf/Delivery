package p212io.fabric.sdk.android.p493p.p495b;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.facebook.cache.disk.DefaultDiskStorage.FileType;
import com.google.common.base.C5785c;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.fabric.sdk.android.p.b.u */
/* compiled from: QueueFile */
public class C14269u implements Closeable {

    /* renamed from: R */
    private static final Logger f42098R = Logger.getLogger(C14269u.class.getName());

    /* renamed from: S */
    private static final int f42099S = 4096;

    /* renamed from: T */
    static final int f42100T = 16;

    /* renamed from: N */
    private int f42101N;

    /* renamed from: O */
    private C14271b f42102O;

    /* renamed from: P */
    private C14271b f42103P;

    /* renamed from: Q */
    private final byte[] f42104Q = new byte[16];
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RandomAccessFile f42105a;

    /* renamed from: b */
    int f42106b;

    /* renamed from: io.fabric.sdk.android.p.b.u$a */
    /* compiled from: QueueFile */
    class C14270a implements C14273d {

        /* renamed from: a */
        boolean f42107a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f42108b;

        C14270a(StringBuilder sb) {
            this.f42108b = sb;
        }

        public void read(InputStream inputStream, int i) throws IOException {
            if (this.f42107a) {
                this.f42107a = false;
            } else {
                this.f42108b.append(", ");
            }
            this.f42108b.append(i);
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.u$b */
    /* compiled from: QueueFile */
    static class C14271b {

        /* renamed from: c */
        static final int f42110c = 4;

        /* renamed from: d */
        static final C14271b f42111d = new C14271b(0, 0);

        /* renamed from: a */
        final int f42112a;

        /* renamed from: b */
        final int f42113b;

        C14271b(int i, int i2) {
            this.f42112a = i;
            this.f42113b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C14271b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f42112a);
            sb.append(", length = ");
            sb.append(this.f42113b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.u$c */
    /* compiled from: QueueFile */
    private final class C14272c extends InputStream {

        /* renamed from: a */
        private int f42115a;

        /* renamed from: b */
        private int f42116b;

        /* synthetic */ C14272c(C14269u uVar, C14271b bVar, C14270a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            C14269u.m61914b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f42116b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C14269u.this.m61909a(this.f42115a, bArr, i, i2);
            this.f42115a = C14269u.this.m61919g(this.f42115a + i2);
            this.f42116b -= i2;
            return i2;
        }

        private C14272c(C14271b bVar) {
            this.f42115a = C14269u.this.m61919g(bVar.f42112a + 4);
            this.f42116b = bVar.f42113b;
        }

        public int read() throws IOException {
            if (this.f42116b == 0) {
                return -1;
            }
            C14269u.this.f42105a.seek((long) this.f42115a);
            int read = C14269u.this.f42105a.read();
            this.f42115a = C14269u.this.m61919g(this.f42115a + 1);
            this.f42116b--;
            return read;
        }
    }

    /* renamed from: io.fabric.sdk.android.p.b.u$d */
    /* compiled from: QueueFile */
    public interface C14273d {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public C14269u(File file) throws IOException {
        if (!file.exists()) {
            m61911a(file);
        }
        this.f42105a = m61913b(file);
        m61920g();
    }

    /* renamed from: b */
    private static void m61916b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: e */
    private C14271b m61917e(int i) throws IOException {
        if (i == 0) {
            return C14271b.f42111d;
        }
        this.f42105a.seek((long) i);
        return new C14271b(i, this.f42105a.readInt());
    }

    /* renamed from: g */
    private void m61920g() throws IOException {
        this.f42105a.seek(0);
        this.f42105a.readFully(this.f42104Q);
        this.f42106b = m61904a(this.f42104Q, 0);
        if (((long) this.f42106b) <= this.f42105a.length()) {
            this.f42101N = m61904a(this.f42104Q, 4);
            int a = m61904a(this.f42104Q, 8);
            int a2 = m61904a(this.f42104Q, 12);
            this.f42102O = m61917e(a);
            this.f42103P = m61917e(a2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.f42106b);
        sb.append(", Actual length: ");
        sb.append(this.f42105a.length());
        throw new IOException(sb.toString());
    }

    /* renamed from: h */
    private int m61921h() {
        return this.f42106b - mo45188f();
    }

    public synchronized void close() throws IOException {
        this.f42105a.close();
    }

    /* renamed from: d */
    public synchronized boolean mo45186d() {
        return this.f42101N == 0;
    }

    /* renamed from: f */
    public int mo45188f() {
        if (this.f42101N == 0) {
            return 16;
        }
        C14271b bVar = this.f42103P;
        int i = bVar.f42112a;
        int i2 = this.f42102O.f42112a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f42113b + 16;
        }
        return (((i + 4) + bVar.f42113b) + this.f42106b) - i2;
    }

    public synchronized byte[] peek() throws IOException {
        if (mo45186d()) {
            return null;
        }
        int i = this.f42102O.f42113b;
        byte[] bArr = new byte[i];
        m61909a(this.f42102O.f42112a + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized int size() {
        return this.f42101N;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C14269u.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f42106b);
        sb.append(", size=");
        sb.append(this.f42101N);
        sb.append(", first=");
        sb.append(this.f42102O);
        sb.append(", last=");
        sb.append(this.f42103P);
        sb.append(", element lengths=[");
        try {
            mo45180a((C14273d) new C14270a(sb));
        } catch (IOException e) {
            f42098R.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: e */
    public synchronized void mo45187e() throws IOException {
        if (mo45186d()) {
            throw new NoSuchElementException();
        } else if (this.f42101N == 1) {
            mo45179a();
        } else {
            int g = m61919g(this.f42102O.f42112a + 4 + this.f42102O.f42113b);
            m61909a(g, this.f42104Q, 0, 4);
            int a = m61904a(this.f42104Q, 0);
            m61908a(this.f42106b, this.f42101N - 1, g, this.f42103P.f42112a);
            this.f42101N--;
            this.f42102O = new C14271b(g, a);
        }
    }

    /* renamed from: a */
    private static void m61912a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m61916b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: b */
    private static RandomAccessFile m61913b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: f */
    private void m61918f(int i) throws IOException {
        this.f42105a.setLength((long) i);
        this.f42105a.getChannel().force(true);
    }

    /* renamed from: b */
    private void m61915b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int g = m61919g(i);
        int i4 = g + i3;
        int i5 = this.f42106b;
        if (i4 <= i5) {
            this.f42105a.seek((long) g);
            this.f42105a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - g;
        this.f42105a.seek((long) g);
        this.f42105a.write(bArr, i2, i6);
        this.f42105a.seek(16);
        this.f42105a.write(bArr, i2 + i6, i3 - i6);
    }

    C14269u(RandomAccessFile randomAccessFile) throws IOException {
        this.f42105a = randomAccessFile;
        m61920g();
    }

    /* renamed from: a */
    private static int m61904a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << C5785c.f16669B) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private void m61908a(int i, int i2, int i3, int i4) throws IOException {
        m61912a(this.f42104Q, i, i2, i3, i4);
        this.f42105a.seek(0);
        this.f42105a.write(this.f42104Q);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m61911a(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(FileType.TEMP);
        File file2 = new File(sb.toString());
        RandomAccessFile b = m61913b(file2);
        try {
            b.setLength(PlaybackStateCompat.f475j0);
            b.seek(0);
            byte[] bArr = new byte[16];
            m61912a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m61919g(int i) {
        int i2 = this.f42106b;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: b */
    public synchronized void mo45184b(C14273d dVar) throws IOException {
        if (this.f42101N > 0) {
            dVar.read(new C14272c(this, this.f42102O, null), this.f42102O.f42113b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m61914b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61909a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int g = m61919g(i);
        int i4 = g + i3;
        int i5 = this.f42106b;
        if (i4 <= i5) {
            this.f42105a.seek((long) g);
            this.f42105a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - g;
        this.f42105a.seek((long) g);
        this.f42105a.readFully(bArr, i2, i6);
        this.f42105a.seek(16);
        this.f42105a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: a */
    public void mo45181a(byte[] bArr) throws IOException {
        mo45182a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo45182a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m61914b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m61907a(i2);
        boolean d = mo45186d();
        if (d) {
            i3 = 16;
        } else {
            i3 = m61919g(this.f42103P.f42112a + 4 + this.f42103P.f42113b);
        }
        C14271b bVar = new C14271b(i3, i2);
        m61916b(this.f42104Q, 0, i2);
        m61915b(bVar.f42112a, this.f42104Q, 0, 4);
        m61915b(bVar.f42112a + 4, bArr, i, i2);
        m61908a(this.f42106b, this.f42101N + 1, d ? bVar.f42112a : this.f42102O.f42112a, bVar.f42112a);
        this.f42103P = bVar;
        this.f42101N++;
        if (d) {
            this.f42102O = this.f42103P;
        }
    }

    /* renamed from: a */
    private void m61907a(int i) throws IOException {
        int i2 = i + 4;
        int h = m61921h();
        if (h < i2) {
            int i3 = this.f42106b;
            do {
                h += i3;
                i3 <<= 1;
            } while (h < i2);
            m61918f(i3);
            C14271b bVar = this.f42103P;
            int g = m61919g(bVar.f42112a + 4 + bVar.f42113b);
            if (g < this.f42102O.f42112a) {
                FileChannel channel = this.f42105a.getChannel();
                channel.position((long) this.f42106b);
                long j = (long) (g - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f42103P.f42112a;
            int i5 = this.f42102O.f42112a;
            if (i4 < i5) {
                int i6 = (this.f42106b + i4) - 16;
                m61908a(i3, this.f42101N, i5, i6);
                this.f42103P = new C14271b(i6, this.f42103P.f42113b);
            } else {
                m61908a(i3, this.f42101N, i5, i4);
            }
            this.f42106b = i3;
        }
    }

    /* renamed from: a */
    public synchronized void mo45180a(C14273d dVar) throws IOException {
        int i = this.f42102O.f42112a;
        for (int i2 = 0; i2 < this.f42101N; i2++) {
            C14271b e = m61917e(i);
            dVar.read(new C14272c(this, e, null), e.f42113b);
            i = m61919g(e.f42112a + 4 + e.f42113b);
        }
    }

    /* renamed from: a */
    public synchronized void mo45179a() throws IOException {
        m61908a(4096, 0, 0, 0);
        this.f42101N = 0;
        this.f42102O = C14271b.f42111d;
        this.f42103P = C14271b.f42111d;
        if (this.f42106b > 4096) {
            m61918f(4096);
        }
        this.f42106b = 4096;
    }

    /* renamed from: a */
    public boolean mo45183a(int i, int i2) {
        return (mo45188f() + 4) + i <= i2;
    }
}
