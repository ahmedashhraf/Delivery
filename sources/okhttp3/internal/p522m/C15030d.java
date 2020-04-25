package okhttp3.internal.p522m;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.util.Random;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13887c.C13890c;
import p470h.C13892d;
import p470h.C13896f;
import p470h.C13924z;

/* renamed from: okhttp3.internal.m.d */
/* compiled from: WebSocketWriter */
final class C15030d {

    /* renamed from: a */
    final boolean f43728a;

    /* renamed from: b */
    final Random f43729b;

    /* renamed from: c */
    final C13892d f43730c;

    /* renamed from: d */
    final C13887c f43731d;

    /* renamed from: e */
    boolean f43732e;

    /* renamed from: f */
    final C13887c f43733f = new C13887c();

    /* renamed from: g */
    final C15031a f43734g = new C15031a();

    /* renamed from: h */
    boolean f43735h;

    /* renamed from: i */
    private final byte[] f43736i;

    /* renamed from: j */
    private final C13890c f43737j;

    /* renamed from: okhttp3.internal.m.d$a */
    /* compiled from: WebSocketWriter */
    final class C15031a implements C13924z {

        /* renamed from: N */
        boolean f43738N;

        /* renamed from: O */
        boolean f43739O;

        /* renamed from: a */
        int f43741a;

        /* renamed from: b */
        long f43742b;

        C15031a() {
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            if (!this.f43739O) {
                C15030d.this.f43733f.mo43815b(cVar, j);
                boolean z = this.f43738N && this.f43742b != -1 && C15030d.this.f43733f.size() > this.f43742b - PlaybackStateCompat.f476k0;
                long e = C15030d.this.f43733f.mo43880e();
                if (e > 0 && !z) {
                    C15030d.this.mo46678a(this.f43741a, e, this.f43738N, false);
                    this.f43738N = false;
                    return;
                }
                return;
            }
            throw new IOException(C11644i.f33433v3);
        }

        public void close() throws IOException {
            if (!this.f43739O) {
                C15030d dVar = C15030d.this;
                dVar.mo46678a(this.f43741a, dVar.f43733f.size(), this.f43738N, true);
                this.f43739O = true;
                C15030d.this.f43735h = false;
                return;
            }
            throw new IOException(C11644i.f33433v3);
        }

        public void flush() throws IOException {
            if (!this.f43739O) {
                C15030d dVar = C15030d.this;
                dVar.mo46678a(this.f43741a, dVar.f43733f.size(), this.f43738N, false);
                this.f43738N = false;
                return;
            }
            throw new IOException(C11644i.f33433v3);
        }

        public C13885b0 timeout() {
            return C15030d.this.f43730c.timeout();
        }
    }

    C15030d(boolean z, C13892d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f43728a = z;
            this.f43730c = dVar;
            this.f43731d = dVar.mo43867b();
            this.f43729b = random;
            C13890c cVar = null;
            this.f43736i = z ? new byte[4] : null;
            if (z) {
                cVar = new C13890c();
            }
            this.f43737j = cVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46680a(C13896f fVar) throws IOException {
        m66650b(9, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo46681b(C13896f fVar) throws IOException {
        m66650b(10, fVar);
    }

    /* renamed from: b */
    private void m66650b(int i, C13896f fVar) throws IOException {
        if (!this.f43732e) {
            int r = fVar.mo43985r();
            if (((long) r) <= 125) {
                this.f43731d.writeByte(i | 128);
                if (this.f43728a) {
                    this.f43731d.writeByte(r | 128);
                    this.f43729b.nextBytes(this.f43736i);
                    this.f43731d.write(this.f43736i);
                    if (r > 0) {
                        long size = this.f43731d.size();
                        this.f43731d.m59514a(fVar);
                        this.f43731d.mo43845a(this.f43737j);
                        this.f43737j.mo43947b(size);
                        C15027b.m66637a(this.f43737j, this.f43736i);
                        this.f43737j.close();
                    }
                } else {
                    this.f43731d.writeByte(r);
                    this.f43731d.m59514a(fVar);
                }
                this.f43730c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException(C11644i.f33433v3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46679a(int i, C13896f fVar) throws IOException {
        C13896f fVar2 = C13896f.f40352P;
        if (!(i == 0 && fVar == null)) {
            if (i != 0) {
                C15027b.m66638b(i);
            }
            C13887c cVar = new C13887c();
            cVar.writeShort(i);
            if (fVar != null) {
                cVar.m59514a(fVar);
            }
            fVar2 = cVar.mo43919t();
        }
        try {
            m66650b(8, fVar2);
        } finally {
            this.f43732e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13924z mo46677a(int i, long j) {
        if (!this.f43735h) {
            this.f43735h = true;
            C15031a aVar = this.f43734g;
            aVar.f43741a = i;
            aVar.f43742b = j;
            aVar.f43738N = true;
            aVar.f43739O = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46678a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.f43732e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f43731d.writeByte(i);
            if (this.f43728a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f43731d.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f43731d.writeByte(i2 | C13959t.f40823O1);
                this.f43731d.writeShort((int) j);
            } else {
                this.f43731d.writeByte(i2 | C13959t.f40827P1);
                this.f43731d.writeLong(j);
            }
            if (this.f43728a) {
                this.f43729b.nextBytes(this.f43736i);
                this.f43731d.write(this.f43736i);
                if (j > 0) {
                    long size = this.f43731d.size();
                    this.f43731d.mo43815b(this.f43733f, j);
                    this.f43731d.mo43845a(this.f43737j);
                    this.f43737j.mo43947b(size);
                    C15027b.m66637a(this.f43737j, this.f43736i);
                    this.f43737j.close();
                }
            } else {
                this.f43731d.mo43815b(this.f43733f, j);
            }
            this.f43730c.mo43900l();
            return;
        }
        throw new IOException(C11644i.f33433v3);
    }
}
