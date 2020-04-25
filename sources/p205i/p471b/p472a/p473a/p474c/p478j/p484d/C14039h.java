package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15476b;

/* renamed from: i.b.a.a.c.j.d.h */
/* compiled from: RemoteControlReader */
public class C14039h extends C15476b {

    /* renamed from: e */
    private C14034e f41260e;

    public C14039h(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    /* renamed from: b */
    private void m60581b() throws IOException {
        if (this.f41260e != null) {
            this.f41260e.mo44354a(this.f44697a.readBoolean(), this.f44697a.readBoolean());
            return;
        }
        throw new IOException("No remote command visitor.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo44358a(byte b) throws IOException {
        if (b == 32) {
            return false;
        }
        if (b != 64) {
            return super.mo44358a(b);
        }
        m60581b();
        return true;
    }

    /* renamed from: a */
    public void mo44357a(C14034e eVar) {
        this.f41260e = eVar;
    }
}
