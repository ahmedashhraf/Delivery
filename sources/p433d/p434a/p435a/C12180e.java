package p433d.p434a.p435a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p433d.p434a.p435a.C12181f.C12183b;
import p433d.p434a.p435a.C12181f.C12184c;
import p433d.p434a.p435a.p437h.C12194a;

/* renamed from: d.a.a.e */
/* compiled from: Question */
public class C12180e {

    /* renamed from: a */
    private final String f35148a;

    /* renamed from: b */
    private final C12184c f35149b;

    /* renamed from: c */
    private final C12183b f35150c;

    /* renamed from: d */
    private final boolean f35151d;

    /* renamed from: e */
    private byte[] f35152e;

    public C12180e(String str, C12184c cVar, C12183b bVar, boolean z) {
        this.f35148a = str;
        this.f35149b = cVar;
        this.f35150c = bVar;
        this.f35151d = z;
    }

    /* renamed from: a */
    public C12183b mo41701a() {
        return this.f35150c;
    }

    /* renamed from: b */
    public String mo41702b() {
        return this.f35148a;
    }

    /* renamed from: c */
    public C12184c mo41703c() {
        return this.f35149b;
    }

    /* renamed from: d */
    public byte[] mo41704d() {
        if (this.f35152e == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.write(C12194a.m54833b(this.f35148a));
                dataOutputStream.writeShort(this.f35149b.mo41716d());
                dataOutputStream.writeShort(this.f35150c.mo41715d() | (this.f35151d ? 32768 : 0));
                dataOutputStream.flush();
                this.f35152e = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return this.f35152e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12180e)) {
            return false;
        }
        return Arrays.equals(mo41704d(), ((C12180e) obj).mo41704d());
    }

    public int hashCode() {
        return Arrays.hashCode(mo41704d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question/");
        sb.append(this.f35150c);
        sb.append("/");
        sb.append(this.f35149b);
        sb.append(": ");
        sb.append(this.f35148a);
        return sb.toString();
    }

    /* renamed from: a */
    public static C12180e m54781a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new C12180e(C12194a.m54830a(dataInputStream, bArr), C12184c.m54794a(dataInputStream.readUnsignedShort()), C12183b.m54792a(dataInputStream.readUnsignedShort()));
    }

    public C12180e(String str, C12184c cVar, C12183b bVar) {
        this(str, cVar, bVar, false);
    }

    public C12180e(String str, C12184c cVar) {
        this(str, cVar, C12183b.IN);
    }
}
