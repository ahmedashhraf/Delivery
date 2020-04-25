package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import p433d.p434a.p435a.C12181f.C12184c;
import p433d.p434a.p435a.p437h.C12194a;

/* renamed from: d.a.a.g.e */
/* compiled from: MX */
public class C12189e implements C12188d {

    /* renamed from: a */
    protected int f35182a;

    /* renamed from: b */
    protected String f35183b;

    /* renamed from: a */
    public void mo41725a(int i) {
        this.f35182a = i;
    }

    /* renamed from: b */
    public String mo41727b() {
        return this.f35183b;
    }

    /* renamed from: c */
    public int mo41728c() {
        return this.f35182a;
    }

    public C12184c getType() {
        return C12184c.MX;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MX ");
        sb.append(this.f35183b);
        sb.append(" p:");
        sb.append(this.f35182a);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41726a(String str) {
        this.f35183b = str;
    }

    /* renamed from: a */
    public byte[] mo41718a() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35182a = dataInputStream.readUnsignedShort();
        this.f35183b = C12194a.m54830a(dataInputStream, bArr);
    }
}
