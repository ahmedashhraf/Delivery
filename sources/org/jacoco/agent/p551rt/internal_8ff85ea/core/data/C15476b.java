package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

import java.io.IOException;
import java.io.InputStream;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d.C14000b;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.b */
/* compiled from: ExecutionDataReader */
public class C15476b {

    /* renamed from: a */
    protected final C14000b f44697a;

    /* renamed from: b */
    private C15480f f44698b = null;

    /* renamed from: c */
    private C15479e f44699c = null;

    /* renamed from: d */
    private boolean f44700d = true;

    public C15476b(InputStream inputStream) {
        this.f44697a = new C14000b(inputStream);
    }

    /* renamed from: b */
    private void m68579b() throws IOException {
        if (this.f44699c != null) {
            this.f44699c.mo47819a(new C15475a(this.f44697a.readLong(), this.f44697a.readUTF(), this.f44697a.mo44292a()));
            return;
        }
        throw new IOException("No execution data visitor.");
    }

    /* renamed from: c */
    private void m68580c() throws IOException {
        if (this.f44697a.readChar() == 49344) {
            char readChar = this.f44697a.readChar();
            if (readChar != C15478d.f44703b) {
                throw new IncompatibleExecDataVersionException(readChar);
            }
            return;
        }
        throw new IOException("Invalid execution data file.");
    }

    /* renamed from: d */
    private void m68581d() throws IOException {
        if (this.f44698b != null) {
            String readUTF = this.f44697a.readUTF();
            long readLong = this.f44697a.readLong();
            long readLong2 = this.f44697a.readLong();
            C15480f fVar = this.f44698b;
            C15481g gVar = new C15481g(readUTF, readLong, readLong2);
            fVar.mo47827a(gVar);
            return;
        }
        throw new IOException("No session info visitor.");
    }

    /* renamed from: a */
    public void mo47814a(C15480f fVar) {
        this.f44698b = fVar;
    }

    /* renamed from: a */
    public void mo47813a(C15479e eVar) {
        this.f44699c = eVar;
    }

    /* renamed from: a */
    public boolean mo47815a() throws IOException, IncompatibleExecDataVersionException {
        byte b;
        do {
            int read = this.f44697a.read();
            if (read == -1) {
                return false;
            }
            b = (byte) read;
            if (!this.f44700d || b == 1) {
                this.f44700d = false;
            } else {
                throw new IOException("Invalid execution data file.");
            }
        } while (mo44358a(b));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo44358a(byte b) throws IOException {
        if (b == 1) {
            m68580c();
            return true;
        } else if (b == 16) {
            m68581d();
            return true;
        } else if (b == 17) {
            m68579b();
            return true;
        } else {
            throw new IOException(String.format("Unknown block type %x.", new Object[]{Byte.valueOf(b)}));
        }
    }
}
