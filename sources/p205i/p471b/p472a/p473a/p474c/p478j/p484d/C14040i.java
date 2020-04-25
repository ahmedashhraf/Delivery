package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.io.IOException;
import java.io.OutputStream;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15478d;

/* renamed from: i.b.a.a.c.j.d.i */
/* compiled from: RemoteControlWriter */
public class C14040i extends C15478d implements C14034e {

    /* renamed from: g */
    public static final byte f41261g = 32;

    /* renamed from: h */
    public static final byte f41262h = 64;

    public C14040i(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo44354a(boolean z, boolean z2) throws IOException {
        this.f44708a.writeByte(64);
        this.f44708a.writeBoolean(z);
        this.f44708a.writeBoolean(z2);
    }

    /* renamed from: c */
    public void mo44359c() throws IOException {
        this.f44708a.writeByte(32);
    }
}
