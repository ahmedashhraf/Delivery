package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

/* renamed from: i.b.a.a.c.j.c.e.f */
/* compiled from: Instruction */
public class C14009f {

    /* renamed from: a */
    private final int f41163a;

    /* renamed from: b */
    private int f41164b = 0;

    /* renamed from: c */
    private int f41165c = 0;

    /* renamed from: d */
    private C14009f f41166d;

    public C14009f(int i) {
        this.f41163a = i;
    }

    /* renamed from: a */
    public void mo44299a() {
        this.f41164b++;
    }

    /* renamed from: b */
    public int mo44301b() {
        return this.f41164b;
    }

    /* renamed from: c */
    public int mo44302c() {
        return this.f41165c;
    }

    /* renamed from: d */
    public int mo44303d() {
        return this.f41163a;
    }

    /* renamed from: e */
    public void mo44304e() {
        C14009f fVar = this;
        while (fVar != null) {
            int i = fVar.f41165c;
            fVar.f41165c = i + 1;
            if (i == 0) {
                fVar = fVar.f41166d;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo44300a(C14009f fVar) {
        this.f41166d = fVar;
        fVar.mo44299a();
    }
}
