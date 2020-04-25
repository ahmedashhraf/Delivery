package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.p476w.C13962a;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13983r;

/* renamed from: i.b.a.a.c.j.c.e.a */
/* compiled from: ClassProbesAdapter */
public class C14002a extends C13945f implements C14008e {

    /* renamed from: g */
    private static final C14013j f41153g = new C14003a();

    /* renamed from: c */
    private final C14005b f41154c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f41155d;

    /* renamed from: e */
    private int f41156e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f41157f;

    /* renamed from: i.b.a.a.c.j.c.e.a$a */
    /* compiled from: ClassProbesAdapter */
    static class C14003a extends C14013j {
        C14003a() {
        }
    }

    /* renamed from: i.b.a.a.c.j.c.e.a$b */
    /* compiled from: ClassProbesAdapter */
    class C14004b extends C14014k {

        /* renamed from: L3 */
        final /* synthetic */ C14013j f41158L3;

        C14004b(C13957r rVar, int i, String str, String str2, String str3, String[] strArr, C14013j jVar) {
            this.f41158L3 = jVar;
            super(rVar, i, str, str2, str3, strArr);
        }

        /* renamed from: c */
        public void mo44195c() {
            super.mo44195c();
            C14010g.m60398a((C13983r) this);
            C14012i iVar = new C14012i(this.f41158L3, C14002a.this);
            if (C14002a.this.f41155d) {
                C13962a aVar = new C13962a(C14002a.this.f41157f, this.f41102l3, this.f41103m3, this.f41104n3, iVar);
                iVar.mo44305a(aVar);
                mo44274a((C13957r) aVar);
                return;
            }
            mo44274a((C13957r) iVar);
        }
    }

    public C14002a(C14005b bVar, boolean z) {
        super(327680, bVar);
        this.f41154c = bVar;
        this.f41155d = z;
    }

    /* renamed from: a */
    public void mo44098a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f41157f = str;
        super.mo44098a(i, i2, str, str2, str3, strArr);
    }

    /* renamed from: b */
    public void mo44103b() {
        this.f41154c.mo44297a(this.f41156e);
        super.mo44103b();
    }

    /* renamed from: a */
    public final C13957r mo44097a(int i, String str, String str2, String str3, String[] strArr) {
        C14013j a = this.f41154c.mo44097a(i, str, str2, str3, strArr);
        if (a == null) {
            a = f41153g;
        }
        C14004b bVar = new C14004b(null, i, str, str2, str3, strArr, a);
        return bVar;
    }

    /* renamed from: a */
    public int mo44296a() {
        int i = this.f41156e;
        this.f41156e = i + 1;
        return i;
    }
}
