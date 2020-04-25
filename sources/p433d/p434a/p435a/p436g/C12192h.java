package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import p433d.p434a.p435a.C12181f.C12184c;
import p433d.p434a.p435a.p437h.C12194a;

/* renamed from: d.a.a.g.h */
/* compiled from: SRV */
public class C12192h implements C12188d {

    /* renamed from: a */
    protected int f35184a;

    /* renamed from: b */
    protected int f35185b;

    /* renamed from: c */
    protected int f35186c;

    /* renamed from: d */
    protected String f35187d;

    /* renamed from: a */
    public void mo41730a(int i) {
        this.f35186c = i;
    }

    /* renamed from: b */
    public void mo41733b(int i) {
        this.f35184a = i;
    }

    /* renamed from: c */
    public void mo41735c(int i) {
        this.f35185b = i;
    }

    /* renamed from: d */
    public int mo41736d() {
        return this.f35184a;
    }

    /* renamed from: e */
    public int mo41737e() {
        return this.f35185b;
    }

    public C12184c getType() {
        return C12184c.SRV;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SRV ");
        sb.append(this.f35187d);
        sb.append(":");
        sb.append(this.f35186c);
        sb.append(" p:");
        sb.append(this.f35184a);
        sb.append(" w:");
        sb.append(this.f35185b);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41731a(String str) {
        this.f35187d = str;
    }

    /* renamed from: b */
    public String mo41732b() {
        return this.f35187d;
    }

    /* renamed from: c */
    public int mo41734c() {
        return this.f35186c;
    }

    /* renamed from: a */
    public byte[] mo41718a() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35184a = dataInputStream.readUnsignedShort();
        this.f35185b = dataInputStream.readUnsignedShort();
        this.f35186c = dataInputStream.readUnsignedShort();
        this.f35187d = C12194a.m54830a(dataInputStream, bArr);
    }
}
