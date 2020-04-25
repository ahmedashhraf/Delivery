package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import p433d.p434a.p435a.C12181f.C12184c;
import p433d.p434a.p435a.p437h.C12194a;

/* renamed from: d.a.a.g.c */
/* compiled from: CNAME */
public class C12187c implements C12188d {

    /* renamed from: a */
    protected String f35181a;

    /* renamed from: a */
    public void mo41722a(String str) {
        this.f35181a = str;
    }

    /* renamed from: b */
    public String mo41723b() {
        return this.f35181a;
    }

    public C12184c getType() {
        return C12184c.CNAME;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("to \"");
        sb.append(this.f35181a);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: a */
    public byte[] mo41718a() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35181a = C12194a.m54830a(dataInputStream, bArr);
    }
}
