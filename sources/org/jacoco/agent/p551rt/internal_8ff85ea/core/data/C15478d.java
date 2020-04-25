package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d.C14001c;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.d */
/* compiled from: ExecutionDataWriter */
public class C15478d implements C15480f, C15479e {

    /* renamed from: b */
    public static final char f44703b = 'ဇ';

    /* renamed from: c */
    public static final char f44704c = '샀';

    /* renamed from: d */
    public static final byte f44705d = 1;

    /* renamed from: e */
    public static final byte f44706e = 16;

    /* renamed from: f */
    public static final byte f44707f = 17;

    /* renamed from: a */
    protected final C14001c f44708a;

    public C15478d(OutputStream outputStream) throws IOException {
        this.f44708a = new C14001c(outputStream);
        mo44359c();
    }

    /* renamed from: b */
    public static final byte[] m68596b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C15478d(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    private void mo44359c() throws IOException {
        this.f44708a.writeByte(1);
        this.f44708a.writeChar(49344);
        this.f44708a.writeChar(f44703b);
    }

    /* renamed from: a */
    public void mo47826a() throws IOException {
        this.f44708a.flush();
    }

    /* renamed from: a */
    public void mo47827a(C15481g gVar) {
        try {
            this.f44708a.writeByte(16);
            this.f44708a.writeUTF(gVar.mo47830c());
            this.f44708a.writeLong(gVar.mo47832d());
            this.f44708a.writeLong(gVar.mo47829b());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo47819a(C15475a aVar) {
        if (aVar.mo47810d()) {
            try {
                this.f44708a.writeByte(17);
                this.f44708a.writeLong(aVar.mo47804a());
                this.f44708a.writeUTF(aVar.mo47808b());
                this.f44708a.mo44295a(aVar.mo47809c());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
