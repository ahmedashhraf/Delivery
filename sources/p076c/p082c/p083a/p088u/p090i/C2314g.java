package p076c.p082c.p083a.p088u.p090i;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;

/* renamed from: c.c.a.u.i.g */
/* compiled from: EngineKey */
class C2314g implements C2272c {

    /* renamed from: o */
    private static final String f9192o = "";

    /* renamed from: b */
    private final String f9193b;

    /* renamed from: c */
    private final int f9194c;

    /* renamed from: d */
    private final int f9195d;

    /* renamed from: e */
    private final C2274e f9196e;

    /* renamed from: f */
    private final C2274e f9197f;

    /* renamed from: g */
    private final C2276g f9198g;

    /* renamed from: h */
    private final C2275f f9199h;

    /* renamed from: i */
    private final C2491f f9200i;

    /* renamed from: j */
    private final C2271b f9201j;

    /* renamed from: k */
    private final C2272c f9202k;

    /* renamed from: l */
    private String f9203l;

    /* renamed from: m */
    private int f9204m;

    /* renamed from: n */
    private C2272c f9205n;

    public C2314g(String str, C2272c cVar, int i, int i2, C2274e eVar, C2274e eVar2, C2276g gVar, C2275f fVar, C2491f fVar2, C2271b bVar) {
        this.f9193b = str;
        this.f9202k = cVar;
        this.f9194c = i;
        this.f9195d = i2;
        this.f9196e = eVar;
        this.f9197f = eVar2;
        this.f9198g = gVar;
        this.f9199h = fVar;
        this.f9200i = fVar2;
        this.f9201j = bVar;
    }

    /* renamed from: a */
    public C2272c mo9699a() {
        if (this.f9205n == null) {
            this.f9205n = new C2321k(this.f9193b, this.f9202k);
        }
        return this.f9205n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2314g.class != obj.getClass()) {
            return false;
        }
        C2314g gVar = (C2314g) obj;
        if (!this.f9193b.equals(gVar.f9193b) || !this.f9202k.equals(gVar.f9202k) || this.f9195d != gVar.f9195d || this.f9194c != gVar.f9194c) {
            return false;
        }
        if ((this.f9198g == null) ^ (gVar.f9198g == null)) {
            return false;
        }
        C2276g gVar2 = this.f9198g;
        if (gVar2 != null && !gVar2.getId().equals(gVar.f9198g.getId())) {
            return false;
        }
        if ((this.f9197f == null) ^ (gVar.f9197f == null)) {
            return false;
        }
        C2274e eVar = this.f9197f;
        if (eVar != null && !eVar.getId().equals(gVar.f9197f.getId())) {
            return false;
        }
        if ((this.f9196e == null) ^ (gVar.f9196e == null)) {
            return false;
        }
        C2274e eVar2 = this.f9196e;
        if (eVar2 != null && !eVar2.getId().equals(gVar.f9196e.getId())) {
            return false;
        }
        if ((this.f9199h == null) ^ (gVar.f9199h == null)) {
            return false;
        }
        C2275f fVar = this.f9199h;
        if (fVar != null && !fVar.getId().equals(gVar.f9199h.getId())) {
            return false;
        }
        if ((this.f9200i == null) ^ (gVar.f9200i == null)) {
            return false;
        }
        C2491f fVar2 = this.f9200i;
        if (fVar2 != null && !fVar2.getId().equals(gVar.f9200i.getId())) {
            return false;
        }
        if ((this.f9201j == null) ^ (gVar.f9201j == null)) {
            return false;
        }
        C2271b bVar = this.f9201j;
        return bVar == null || bVar.getId().equals(gVar.f9201j.getId());
    }

    public int hashCode() {
        if (this.f9204m == 0) {
            this.f9204m = this.f9193b.hashCode();
            this.f9204m = (this.f9204m * 31) + this.f9202k.hashCode();
            this.f9204m = (this.f9204m * 31) + this.f9194c;
            this.f9204m = (this.f9204m * 31) + this.f9195d;
            int i = this.f9204m * 31;
            C2274e eVar = this.f9196e;
            int i2 = 0;
            this.f9204m = i + (eVar != null ? eVar.getId().hashCode() : 0);
            int i3 = this.f9204m * 31;
            C2274e eVar2 = this.f9197f;
            this.f9204m = i3 + (eVar2 != null ? eVar2.getId().hashCode() : 0);
            int i4 = this.f9204m * 31;
            C2276g gVar = this.f9198g;
            this.f9204m = i4 + (gVar != null ? gVar.getId().hashCode() : 0);
            int i5 = this.f9204m * 31;
            C2275f fVar = this.f9199h;
            this.f9204m = i5 + (fVar != null ? fVar.getId().hashCode() : 0);
            int i6 = this.f9204m * 31;
            C2491f fVar2 = this.f9200i;
            this.f9204m = i6 + (fVar2 != null ? fVar2.getId().hashCode() : 0);
            int i7 = this.f9204m * 31;
            C2271b bVar = this.f9201j;
            if (bVar != null) {
                i2 = bVar.getId().hashCode();
            }
            this.f9204m = i7 + i2;
        }
        return this.f9204m;
    }

    public String toString() {
        if (this.f9203l == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.f9193b);
            sb.append('+');
            sb.append(this.f9202k);
            sb.append("+[");
            sb.append(this.f9194c);
            sb.append('x');
            sb.append(this.f9195d);
            sb.append("]+");
            sb.append('\'');
            C2274e eVar = this.f9196e;
            String str = "";
            sb.append(eVar != null ? eVar.getId() : str);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            C2274e eVar2 = this.f9197f;
            sb.append(eVar2 != null ? eVar2.getId() : str);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            C2276g gVar = this.f9198g;
            sb.append(gVar != null ? gVar.getId() : str);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            C2275f fVar = this.f9199h;
            sb.append(fVar != null ? fVar.getId() : str);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            C2491f fVar2 = this.f9200i;
            sb.append(fVar2 != null ? fVar2.getId() : str);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            C2271b bVar = this.f9201j;
            if (bVar != null) {
                str = bVar.getId();
            }
            sb.append(str);
            sb.append('\'');
            sb.append('}');
            this.f9203l = sb.toString();
        }
        return this.f9203l;
    }

    /* renamed from: a */
    public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f9194c).putInt(this.f9195d).array();
        this.f9202k.mo9636a(messageDigest);
        String str = "UTF-8";
        messageDigest.update(this.f9193b.getBytes(str));
        messageDigest.update(array);
        C2274e eVar = this.f9196e;
        String str2 = "";
        messageDigest.update((eVar != null ? eVar.getId() : str2).getBytes(str));
        C2274e eVar2 = this.f9197f;
        messageDigest.update((eVar2 != null ? eVar2.getId() : str2).getBytes(str));
        C2276g gVar = this.f9198g;
        messageDigest.update((gVar != null ? gVar.getId() : str2).getBytes(str));
        C2275f fVar = this.f9199h;
        messageDigest.update((fVar != null ? fVar.getId() : str2).getBytes(str));
        C2271b bVar = this.f9201j;
        if (bVar != null) {
            str2 = bVar.getId();
        }
        messageDigest.update(str2.getBytes(str));
    }
}
