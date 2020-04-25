package p433d.p434a.p435a.p436g;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p433d.p434a.p435a.C12181f.C12184c;

/* renamed from: d.a.a.g.i */
/* compiled from: TXT */
public class C12193i implements C12188d {

    /* renamed from: a */
    protected byte[] f35188a;

    /* renamed from: a */
    public void mo41740a(byte[] bArr) {
        this.f35188a = bArr;
    }

    /* renamed from: b */
    public byte[] mo41741b() {
        return this.f35188a;
    }

    /* renamed from: c */
    public List<byte[]> mo41742c() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] bArr = this.f35188a;
            if (i >= bArr.length) {
                return arrayList;
            }
            int i2 = i + 1;
            int i3 = (bArr[i] & 255) + i2;
            arrayList.add(Arrays.copyOfRange(bArr, i2, i3));
            i = i3;
        }
    }

    /* renamed from: d */
    public String mo41743d() {
        List c = mo41742c();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < c.size() - 1) {
            sb.append(new String((byte[]) c.get(i)));
            sb.append(" / ");
            i++;
        }
        sb.append(new String((byte[]) c.get(i)));
        return sb.toString();
    }

    public C12184c getType() {
        return C12184c.TXT;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "\"";
        sb.append(str);
        sb.append(mo41743d());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41739a(String str) {
        try {
            this.f35188a = str.getBytes("UTF-8");
        } catch (Exception e) {
            throw new RuntimeException("UTF-8 not supported", e);
        }
    }

    /* renamed from: a */
    public byte[] mo41718a() {
        return this.f35188a;
    }

    /* renamed from: a */
    public void mo41717a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        this.f35188a = new byte[i];
        dataInputStream.readFully(this.f35188a);
    }
}
