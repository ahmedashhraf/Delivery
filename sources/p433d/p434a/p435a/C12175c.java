package p433d.p434a.p435a;

import com.google.common.base.C5785c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p053b.p063d.p064b.C2108a;

/* renamed from: d.a.a.c */
/* compiled from: DNSMessage */
public class C12175c {

    /* renamed from: a */
    protected int f35125a;

    /* renamed from: b */
    protected C12176a f35126b;

    /* renamed from: c */
    protected C12177b f35127c;

    /* renamed from: d */
    protected boolean f35128d;

    /* renamed from: e */
    protected boolean f35129e;

    /* renamed from: f */
    protected boolean f35130f;

    /* renamed from: g */
    protected boolean f35131g;

    /* renamed from: h */
    protected boolean f35132h;

    /* renamed from: i */
    protected boolean f35133i;

    /* renamed from: j */
    protected boolean f35134j;

    /* renamed from: k */
    protected C12180e[] f35135k;

    /* renamed from: l */
    protected C12181f[] f35136l;

    /* renamed from: m */
    protected C12181f[] f35137m;

    /* renamed from: n */
    protected C12181f[] f35138n;

    /* renamed from: o */
    protected long f35139o;

    /* renamed from: d.a.a.c$a */
    /* compiled from: DNSMessage */
    public enum C12176a {
        QUERY(0),
        INVERSE_QUERY(1),
        STATUS(2),
        NOTIFY(4),
        UPDATE(5);
        
        private static final C12176a[] INVERSE_LUT = null;
        private final byte value;

        static {
            C12176a aVar;
            C12176a aVar2;
            C12176a aVar3;
            C12176a aVar4;
            C12176a aVar5;
            INVERSE_LUT = new C12176a[]{aVar, aVar2, aVar3, null, aVar4, aVar5, null, null, null, null, null, null, null, null, null};
        }

        private C12176a(int i) {
            this.value = (byte) i;
        }

        /* renamed from: a */
        public static C12176a m54773a(int i) {
            if (i >= 0 && i <= 15) {
                return INVERSE_LUT[i];
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: d */
        public byte mo41694d() {
            return this.value;
        }
    }

    /* renamed from: d.a.a.c$b */
    /* compiled from: DNSMessage */
    public enum C12177b {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10);
        
        private static final C12177b[] INVERSE_LUT = null;
        private final byte value;

        static {
            C12177b bVar;
            C12177b bVar2;
            C12177b bVar3;
            C12177b bVar4;
            C12177b bVar5;
            C12177b bVar6;
            C12177b bVar7;
            C12177b bVar8;
            C12177b bVar9;
            C12177b bVar10;
            C12177b bVar11;
            INVERSE_LUT = new C12177b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, null, null, null, null, null};
        }

        private C12177b(int i) {
            this.value = (byte) i;
        }

        /* renamed from: a */
        public static C12177b m54775a(int i) {
            if (i >= 0 && i <= 15) {
                return INVERSE_LUT[i];
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: d */
        public byte mo41695d() {
            return this.value;
        }
    }

    /* renamed from: a */
    public void mo41668a(int i) {
        this.f35125a = i & 65535;
    }

    /* renamed from: b */
    public void mo41672b(boolean z) {
        this.f35129e = z;
    }

    /* renamed from: c */
    public int mo41674c() {
        return this.f35125a;
    }

    /* renamed from: d */
    public void mo41676d(boolean z) {
        this.f35128d = z;
    }

    /* renamed from: e */
    public void mo41679e(boolean z) {
        this.f35132h = z;
    }

    /* renamed from: f */
    public void mo41680f(boolean z) {
        this.f35131g = z;
    }

    /* renamed from: g */
    public long mo41682g() {
        return this.f35139o;
    }

    /* renamed from: h */
    public C12177b mo41684h() {
        return this.f35127c;
    }

    /* renamed from: i */
    public boolean mo41685i() {
        return this.f35133i;
    }

    /* renamed from: j */
    public boolean mo41686j() {
        return this.f35129e;
    }

    /* renamed from: k */
    public boolean mo41687k() {
        return this.f35134j;
    }

    /* renamed from: l */
    public boolean mo41688l() {
        return this.f35128d;
    }

    /* renamed from: m */
    public boolean mo41689m() {
        return this.f35132h;
    }

    /* renamed from: n */
    public boolean mo41690n() {
        return this.f35131g;
    }

    /* renamed from: o */
    public boolean mo41691o() {
        return this.f35130f;
    }

    /* renamed from: p */
    public byte[] mo41692p() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i = this.f35128d ? 32768 : 0;
        C12176a aVar = this.f35126b;
        if (aVar != null) {
            i += aVar.mo41694d() << C5785c.f16694m;
        }
        if (this.f35129e) {
            i += 1024;
        }
        if (this.f35130f) {
            i += 512;
        }
        if (this.f35131g) {
            i += 256;
        }
        if (this.f35132h) {
            i += 128;
        }
        if (this.f35133i) {
            i += 32;
        }
        if (this.f35134j) {
            i += 16;
        }
        C12177b bVar = this.f35127c;
        if (bVar != null) {
            i += bVar.mo41695d();
        }
        dataOutputStream.writeShort((short) this.f35125a);
        dataOutputStream.writeShort((short) i);
        C12180e[] eVarArr = this.f35135k;
        if (eVarArr == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort((short) eVarArr.length);
        }
        C12181f[] fVarArr = this.f35136l;
        if (fVarArr == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort((short) fVarArr.length);
        }
        C12181f[] fVarArr2 = this.f35137m;
        if (fVarArr2 == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort((short) fVarArr2.length);
        }
        C12181f[] fVarArr3 = this.f35138n;
        if (fVarArr3 == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort((short) fVarArr3.length);
        }
        for (C12180e d : this.f35135k) {
            dataOutputStream.write(d.mo41704d());
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-- DNSMessage ");
        sb.append(this.f35125a);
        sb.append(" --\n");
        sb.append("Q");
        sb.append(Arrays.toString(this.f35135k));
        sb.append("NS");
        sb.append(Arrays.toString(this.f35137m));
        sb.append(C2108a.f8127Q4);
        sb.append(Arrays.toString(this.f35136l));
        sb.append("ARR");
        sb.append(Arrays.toString(this.f35138n));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41669a(boolean z) {
        this.f35133i = z;
    }

    /* renamed from: b */
    public C12181f[] mo41673b() {
        return this.f35136l;
    }

    /* renamed from: c */
    public void mo41675c(boolean z) {
        this.f35134j = z;
    }

    /* renamed from: d */
    public C12181f[] mo41677d() {
        return this.f35137m;
    }

    /* renamed from: e */
    public C12176a mo41678e() {
        return this.f35126b;
    }

    /* renamed from: f */
    public C12180e[] mo41681f() {
        return this.f35135k;
    }

    /* renamed from: g */
    public void mo41683g(boolean z) {
        this.f35130f = z;
    }

    /* renamed from: a */
    public static C12175c m54747a(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        C12175c cVar = new C12175c();
        cVar.f35125a = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        boolean z = true;
        cVar.f35128d = ((readUnsignedShort >> 15) & 1) == 0;
        cVar.f35126b = C12176a.m54773a((readUnsignedShort >> 11) & 15);
        cVar.f35129e = ((readUnsignedShort >> 10) & 1) == 1;
        cVar.f35130f = ((readUnsignedShort >> 9) & 1) == 1;
        cVar.f35131g = ((readUnsignedShort >> 8) & 1) == 1;
        cVar.f35132h = ((readUnsignedShort >> 7) & 1) == 1;
        cVar.f35133i = ((readUnsignedShort >> 5) & 1) == 1;
        if (((readUnsignedShort >> 4) & 1) != 1) {
            z = false;
        }
        cVar.f35134j = z;
        cVar.f35127c = C12177b.m54775a(readUnsignedShort & 15);
        cVar.f35139o = System.currentTimeMillis();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        int readUnsignedShort5 = dataInputStream.readUnsignedShort();
        cVar.f35135k = new C12180e[readUnsignedShort2];
        while (true) {
            int i = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            cVar.f35135k[i] = C12180e.m54781a(dataInputStream, bArr);
            readUnsignedShort2 = i;
        }
        cVar.f35136l = new C12181f[readUnsignedShort3];
        while (true) {
            int i2 = readUnsignedShort3 - 1;
            if (readUnsignedShort3 <= 0) {
                break;
            }
            C12181f fVar = new C12181f();
            fVar.mo41709a(dataInputStream, bArr);
            cVar.f35136l[i2] = fVar;
            readUnsignedShort3 = i2;
        }
        cVar.f35137m = new C12181f[readUnsignedShort4];
        while (true) {
            int i3 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 <= 0) {
                break;
            }
            C12181f fVar2 = new C12181f();
            fVar2.mo41709a(dataInputStream, bArr);
            cVar.f35137m[i3] = fVar2;
            readUnsignedShort4 = i3;
        }
        cVar.f35138n = new C12181f[readUnsignedShort5];
        while (true) {
            int i4 = readUnsignedShort5 - 1;
            if (readUnsignedShort5 <= 0) {
                return cVar;
            }
            C12181f fVar3 = new C12181f();
            fVar3.mo41709a(dataInputStream, bArr);
            cVar.f35138n[i4] = fVar3;
            readUnsignedShort5 = i4;
        }
    }

    /* renamed from: a */
    public void mo41670a(C12180e... eVarArr) {
        this.f35135k = eVarArr;
    }

    /* renamed from: a */
    public C12181f[] mo41671a() {
        return this.f35138n;
    }
}
