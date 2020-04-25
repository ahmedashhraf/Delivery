package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import p433d.p434a.p435a.C12181f.C12184c;

/* renamed from: d.a.a.g.b */
/* compiled from: AAAA */
public class C12186b implements C12188d {

    /* renamed from: a */
    private byte[] f35180a;

    /* renamed from: a */
    public byte[] mo41718a() {
        return this.f35180a;
    }

    public C12184c getType() {
        return C12184c.AAAA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f35180a.length; i += 2) {
            if (i != 0) {
                sb.append(':');
            }
            byte[] bArr = this.f35180a;
            sb.append(Integer.toHexString(((bArr[i] & 255) << 8) + (bArr[i + 1] & 255)));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35180a = new byte[16];
        dataInputStream.readFully(this.f35180a);
    }
}
