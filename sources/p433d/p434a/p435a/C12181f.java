package p433d.p434a.p435a;

import androidx.recyclerview.widget.C1744m.C1750f;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jcodec.codecs.mjpeg.JpegConst;
import p433d.p434a.p435a.p436g.C12185a;
import p433d.p434a.p435a.p436g.C12186b;
import p433d.p434a.p435a.p436g.C12187c;
import p433d.p434a.p435a.p436g.C12188d;
import p433d.p434a.p435a.p436g.C12189e;
import p433d.p434a.p435a.p436g.C12190f;
import p433d.p434a.p435a.p436g.C12191g;
import p433d.p434a.p435a.p436g.C12192h;
import p433d.p434a.p435a.p436g.C12193i;
import p433d.p434a.p435a.p437h.C12194a;

/* renamed from: d.a.a.f */
/* compiled from: Record */
public class C12181f {

    /* renamed from: g */
    private static final Logger f35153g = Logger.getLogger(C12172a.class.getName());

    /* renamed from: a */
    protected String f35154a;

    /* renamed from: b */
    protected C12184c f35155b;

    /* renamed from: c */
    protected C12183b f35156c;

    /* renamed from: d */
    protected long f35157d;

    /* renamed from: e */
    protected C12188d f35158e;

    /* renamed from: f */
    protected boolean f35159f;

    /* renamed from: d.a.a.f$a */
    /* compiled from: Record */
    static /* synthetic */ class C12182a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35160a = new int[C12184c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                d.a.a.f$c[] r0 = p433d.p434a.p435a.C12181f.C12184c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35160a = r0
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x0014 }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.SRV     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x001f }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.MX     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x002a }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.AAAA     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x0035 }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.A     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x0040 }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.NS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x004b }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.CNAME     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x0056 }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.PTR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f35160a     // Catch:{ NoSuchFieldError -> 0x0062 }
                d.a.a.f$c r1 = p433d.p434a.p435a.C12181f.C12184c.TXT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p433d.p434a.p435a.C12181f.C12182a.<clinit>():void");
        }
    }

    /* renamed from: d.a.a.f$b */
    /* compiled from: Record */
    public enum C12183b {
        IN(1),
        CH(3),
        HS(4),
        NONE(JpegConst.COM),
        ANY(255);
        
        private static final HashMap<Integer, C12183b> INVERSE_LUT = null;
        private final int value;

        static {
            int i;
            C12183b[] values;
            INVERSE_LUT = new HashMap<>();
            for (C12183b bVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(bVar.mo41715d()), bVar);
            }
        }

        private C12183b(int i) {
            this.value = i;
        }

        /* renamed from: a */
        public static C12183b m54792a(int i) {
            return (C12183b) INVERSE_LUT.get(Integer.valueOf(i));
        }

        /* renamed from: d */
        public int mo41715d() {
            return this.value;
        }
    }

    /* renamed from: d.a.a.f$c */
    /* compiled from: Record */
    public enum C12184c {
        A(1),
        NS(2),
        MD(3),
        MF(4),
        CNAME(5),
        SOA(6),
        MB(7),
        MG(8),
        MR(9),
        NULL(10),
        WKS(11),
        PTR(12),
        HINFO(13),
        MINFO(14),
        MX(15),
        TXT(16),
        RP(17),
        AFSDB(18),
        X25(19),
        ISDN(20),
        RT(21),
        NSAP(22),
        NSAP_PTR(23),
        SIG(24),
        KEY(25),
        PX(26),
        GPOS(27),
        AAAA(28),
        LOC(29),
        NXT(30),
        EID(31),
        NIMLOC(32),
        SRV(33),
        ATMA(34),
        NAPTR(35),
        KX(36),
        CERT(37),
        A6(38),
        DNAME(39),
        SINK(40),
        OPT(41),
        APL(42),
        DS(43),
        SSHFP(44),
        IPSECKEY(45),
        RRSIG(46),
        NSEC(47),
        DNSKEY(48),
        DHCID(49),
        NSEC3(50),
        NSEC3PARAM(51),
        HIP(55),
        NINFO(56),
        RKEY(57),
        TALINK(58),
        SPF(99),
        UINFO(100),
        UID(101),
        GID(102),
        TKEY(249),
        TSIG(C1750f.f6813c),
        IXFR(251),
        AXFR(252),
        MAILB(253),
        MAILA(JpegConst.COM),
        ANY(255),
        TA(32768),
        DLV(32769);
        
        private static final HashMap<Integer, C12184c> INVERSE_LUT = null;
        private final int value;

        static {
            int i;
            C12184c[] values;
            INVERSE_LUT = new HashMap<>();
            for (C12184c cVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(cVar.mo41716d()), cVar);
            }
        }

        private C12184c(int i) {
            this.value = i;
        }

        /* renamed from: a */
        public static C12184c m54794a(int i) {
            return (C12184c) INVERSE_LUT.get(Integer.valueOf(i));
        }

        /* renamed from: d */
        public int mo41716d() {
            return this.value;
        }
    }

    /* renamed from: a */
    public void mo41709a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        this.f35154a = C12194a.m54830a(dataInputStream, bArr);
        this.f35155b = C12184c.m54794a(dataInputStream.readUnsignedShort());
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f35156c = C12183b.m54792a(readUnsignedShort & 32767);
        this.f35159f = (32768 & readUnsignedShort) > 0;
        if (this.f35156c == null) {
            Logger logger = f35153g;
            Level level = Level.FINE;
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown class ");
            sb.append(readUnsignedShort);
            logger.log(level, sb.toString());
        }
        this.f35157d = (((long) dataInputStream.readUnsignedShort()) << 32) + ((long) dataInputStream.readUnsignedShort());
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        switch (C12182a.f35160a[this.f35155b.ordinal()]) {
            case 1:
                this.f35158e = new C12192h();
                break;
            case 2:
                this.f35158e = new C12189e();
                break;
            case 3:
                this.f35158e = new C12186b();
                break;
            case 4:
                this.f35158e = new C12185a();
                break;
            case 5:
                this.f35158e = new C12190f();
                break;
            case 6:
                this.f35158e = new C12187c();
                break;
            case 7:
                this.f35158e = new C12191g();
                break;
            case 8:
                this.f35158e = new C12193i();
                break;
            default:
                Logger logger2 = f35153g;
                Level level2 = Level.FINE;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unparsed type ");
                sb2.append(this.f35155b);
                logger2.log(level2, sb2.toString());
                this.f35158e = null;
                for (int i = 0; i < readUnsignedShort2; i++) {
                    dataInputStream.readByte();
                }
                break;
        }
        C12188d dVar = this.f35158e;
        if (dVar != null) {
            dVar.mo41717a(dataInputStream, bArr, readUnsignedShort2);
        }
    }

    /* renamed from: b */
    public C12188d mo41711b() {
        return this.f35158e;
    }

    /* renamed from: c */
    public long mo41712c() {
        return this.f35157d;
    }

    /* renamed from: d */
    public boolean mo41713d() {
        return this.f35159f;
    }

    public String toString() {
        String str = "/";
        String str2 = "RR ";
        if (this.f35158e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f35155b);
            sb.append(str);
            sb.append(this.f35156c);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f35155b);
        sb2.append(str);
        sb2.append(this.f35156c);
        sb2.append(": ");
        sb2.append(this.f35158e.toString());
        return sb2.toString();
    }

    /* renamed from: a */
    public boolean mo41710a(C12180e eVar) {
        return (eVar.mo41703c() == this.f35155b || eVar.mo41703c() == C12184c.ANY) && (eVar.mo41701a() == this.f35156c || eVar.mo41701a() == C12183b.ANY) && eVar.mo41702b().equals(this.f35154a);
    }

    /* renamed from: a */
    public String mo41708a() {
        return this.f35154a;
    }
}
