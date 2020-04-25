package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C14910b;
import p470h.C13883a0;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13896f;

/* renamed from: okhttp3.internal.http2.g */
/* compiled from: Http2Reader */
final class C14987g implements Closeable {

    /* renamed from: P */
    static final Logger f43546P = Logger.getLogger(C14969d.class.getName());

    /* renamed from: N */
    private final boolean f43547N;

    /* renamed from: O */
    final C14967a f43548O = new C14967a(4096, this.f43550b);

    /* renamed from: a */
    private final C13894e f43549a;

    /* renamed from: b */
    private final C14988a f43550b = new C14988a(this.f43549a);

    /* renamed from: okhttp3.internal.http2.g$a */
    /* compiled from: Http2Reader */
    static final class C14988a implements C13883a0 {

        /* renamed from: N */
        byte f43551N;

        /* renamed from: O */
        int f43552O;

        /* renamed from: P */
        int f43553P;

        /* renamed from: Q */
        short f43554Q;

        /* renamed from: a */
        private final C13894e f43555a;

        /* renamed from: b */
        int f43556b;

        C14988a(C13894e eVar) {
            this.f43555a = eVar;
        }

        /* renamed from: a */
        private void m66421a() throws IOException {
            int i = this.f43552O;
            int a = C14987g.m66407a(this.f43555a);
            this.f43553P = a;
            this.f43556b = a;
            byte readByte = (byte) (this.f43555a.readByte() & 255);
            this.f43551N = (byte) (this.f43555a.readByte() & 255);
            if (C14987g.f43546P.isLoggable(Level.FINE)) {
                C14987g.f43546P.fine(C14969d.m66329a(true, this.f43552O, this.f43556b, readByte, this.f43551N));
            }
            this.f43552O = this.f43555a.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                throw C14969d.m66330b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (this.f43552O != i) {
                throw C14969d.m66330b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }

        public long read(C13887c cVar, long j) throws IOException {
            while (true) {
                int i = this.f43553P;
                if (i == 0) {
                    this.f43555a.skip((long) this.f43554Q);
                    this.f43554Q = 0;
                    if ((this.f43551N & 4) != 0) {
                        return -1;
                    }
                    m66421a();
                } else {
                    long read = this.f43555a.read(cVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f43553P = (int) (((long) this.f43553P) - read);
                    return read;
                }
            }
        }

        public C13885b0 timeout() {
            return this.f43555a.timeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.g$b */
    /* compiled from: Http2Reader */
    interface C14989b {
        /* renamed from: a */
        void mo46530a();

        /* renamed from: a */
        void mo46531a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo46532a(int i, int i2, List<C14964b> list) throws IOException;

        /* renamed from: a */
        void mo46533a(int i, long j);

        /* renamed from: a */
        void mo46534a(int i, String str, C13896f fVar, String str2, int i2, long j);

        /* renamed from: a */
        void mo46535a(int i, C14963a aVar);

        /* renamed from: a */
        void mo46536a(int i, C14963a aVar, C13896f fVar);

        /* renamed from: a */
        void mo46537a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo46538a(boolean z, int i, int i2, List<C14964b> list);

        /* renamed from: a */
        void mo46539a(boolean z, int i, C13894e eVar, int i2) throws IOException;

        /* renamed from: a */
        void mo46540a(boolean z, C14999l lVar);
    }

    C14987g(C13894e eVar, boolean z) {
        this.f43549a = eVar;
        this.f43547N = z;
    }

    /* renamed from: b */
    private void m66411b(C14989b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw C14969d.m66330b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f43549a.readInt();
            int readInt2 = this.f43549a.readInt();
            int i3 = i - 8;
            C14963a a = C14963a.m66297a(readInt2);
            if (a != null) {
                C13896f fVar = C13896f.f40352P;
                if (i3 > 0) {
                    fVar = this.f43549a.mo43891h((long) i3);
                }
                bVar.mo46536a(readInt, a, fVar);
                return;
            }
            throw C14969d.m66330b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw C14969d.m66330b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: c */
    private void m66412c(C14989b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f43549a.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m66409a(bVar, i2);
                i -= 5;
            }
            bVar.mo46538a(z, i2, -1, m66408a(m66406a(i, b, s), s, b, i2));
            return;
        }
        throw C14969d.m66330b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: d */
    private void m66413d(C14989b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw C14969d.m66330b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f43549a.readInt();
            int readInt2 = this.f43549a.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo46537a(z, readInt, readInt2);
        } else {
            throw C14969d.m66330b("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: e */
    private void m66414e(C14989b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw C14969d.m66330b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            m66409a(bVar, i2);
        } else {
            throw C14969d.m66330b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: f */
    private void m66415f(C14989b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f43549a.readByte() & 255);
            }
            bVar.mo46532a(i2, this.f43549a.readInt() & Integer.MAX_VALUE, m66408a(m66406a(i - 4, b, s), s, b, i2));
            return;
        }
        throw C14969d.m66330b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: g */
    private void m66416g(C14989b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw C14969d.m66330b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.f43549a.readInt();
            C14963a a = C14963a.m66297a(readInt);
            if (a != null) {
                bVar.mo46535a(i2, a);
            } else {
                throw C14969d.m66330b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw C14969d.m66330b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: h */
    private void m66417h(C14989b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw C14969d.m66330b("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo46530a();
            } else {
                throw C14969d.m66330b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
        } else if (i % 6 == 0) {
            C14999l lVar = new C14999l();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f43549a.readShort() & 65535;
                int readInt = this.f43549a.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            throw C14969d.m66330b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            throw C14969d.m66330b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            throw C14969d.m66330b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                        break;
                }
                lVar.mo46594a(readShort, readInt);
            }
            bVar.mo46540a(false, lVar);
        } else {
            throw C14969d.m66330b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: i */
    private void m66418i(C14989b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f43549a.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo46533a(i2, readInt);
            } else {
                throw C14969d.m66330b("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw C14969d.m66330b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo46541a(C14989b bVar) throws IOException {
        if (!this.f43547N) {
            C13896f h = this.f43549a.mo43891h((long) C14969d.f43441a.mo43985r());
            if (f43546P.isLoggable(Level.FINE)) {
                f43546P.fine(C14910b.m66045a("<< CONNECTION %s", h.mo43977g()));
            }
            if (!C14969d.f43441a.equals(h)) {
                throw C14969d.m66330b("Expected a connection header but was %s", h.mo43990v());
            }
        } else if (!mo46542a(true, bVar)) {
            throw C14969d.m66330b("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public void close() throws IOException {
        this.f43549a.close();
    }

    /* renamed from: a */
    public boolean mo46542a(boolean z, C14989b bVar) throws IOException {
        try {
            this.f43549a.mo43899k(9);
            int a = m66407a(this.f43549a);
            if (a < 0 || a > 16384) {
                throw C14969d.m66330b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte readByte = (byte) (this.f43549a.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f43549a.readByte() & 255);
                int readInt = this.f43549a.readInt() & Integer.MAX_VALUE;
                if (f43546P.isLoggable(Level.FINE)) {
                    f43546P.fine(C14969d.m66329a(true, readInt, a, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m66410a(bVar, a, readByte2, readInt);
                        break;
                    case 1:
                        m66412c(bVar, a, readByte2, readInt);
                        break;
                    case 2:
                        m66414e(bVar, a, readByte2, readInt);
                        break;
                    case 3:
                        m66416g(bVar, a, readByte2, readInt);
                        break;
                    case 4:
                        m66417h(bVar, a, readByte2, readInt);
                        break;
                    case 5:
                        m66415f(bVar, a, readByte2, readInt);
                        break;
                    case 6:
                        m66413d(bVar, a, readByte2, readInt);
                        break;
                    case 7:
                        m66411b(bVar, a, readByte2, readInt);
                        break;
                    case 8:
                        m66418i(bVar, a, readByte2, readInt);
                        break;
                    default:
                        this.f43549a.skip((long) a);
                        break;
                }
                return true;
            }
            throw C14969d.m66330b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private List<C14964b> m66408a(int i, short s, byte b, int i2) throws IOException {
        C14988a aVar = this.f43550b;
        aVar.f43553P = i;
        aVar.f43556b = i;
        aVar.f43554Q = s;
        aVar.f43551N = b;
        aVar.f43552O = i2;
        this.f43548O.mo46490d();
        return this.f43548O.mo46487a();
    }

    /* renamed from: a */
    private void m66410a(C14989b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f43549a.readByte() & 255);
                }
                bVar.mo46539a(z2, i2, this.f43549a, m66406a(i, b, s));
                this.f43549a.skip((long) s);
                return;
            }
            throw C14969d.m66330b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw C14969d.m66330b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: a */
    private void m66409a(C14989b bVar, int i) throws IOException {
        int readInt = this.f43549a.readInt();
        bVar.mo46531a(i, readInt & Integer.MAX_VALUE, (this.f43549a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: a */
    static int m66407a(C13894e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: a */
    static int m66406a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C14969d.m66330b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
