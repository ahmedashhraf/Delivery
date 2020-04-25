package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import p433d.p434a.p435a.C12181f.C12184c;

/* renamed from: d.a.a.g.a */
/* compiled from: A */
public class C12185a implements C12188d {

    /* renamed from: a */
    private byte[] f35179a;

    /* renamed from: a */
    public byte[] mo41718a() {
        return this.f35179a;
    }

    public C12184c getType() {
        return C12184c.A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f35179a[0] & 255));
        String str = ".";
        sb.append(str);
        sb.append(Integer.toString(this.f35179a[1] & 255));
        sb.append(str);
        sb.append(Integer.toString(this.f35179a[2] & 255));
        sb.append(str);
        sb.append(Integer.toString(this.f35179a[3] & 255));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35179a = new byte[4];
        dataInputStream.readFully(this.f35179a);
    }
}
