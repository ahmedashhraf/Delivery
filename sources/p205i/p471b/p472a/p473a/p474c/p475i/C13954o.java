package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.o */
/* compiled from: Handler */
class C13954o {

    /* renamed from: a */
    C13956q f40661a;

    /* renamed from: b */
    C13956q f40662b;

    /* renamed from: c */
    C13956q f40663c;

    /* renamed from: d */
    String f40664d;

    /* renamed from: e */
    int f40665e;

    /* renamed from: f */
    C13954o f40666f;

    C13954o() {
    }

    /* renamed from: a */
    static C13954o m60041a(C13954o oVar, C13956q qVar, C13956q qVar2) {
        int i;
        if (oVar == null) {
            return null;
        }
        oVar.f40666f = m60041a(oVar.f40666f, qVar, qVar2);
        int i2 = oVar.f40661a.f40691d;
        int i3 = oVar.f40662b.f40691d;
        int i4 = qVar.f40691d;
        if (qVar2 == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = qVar2.f40691d;
        }
        if (i4 < i3 && i > i2) {
            if (i4 <= i2) {
                if (i >= i3) {
                    oVar = oVar.f40666f;
                } else {
                    oVar.f40661a = qVar2;
                }
            } else if (i >= i3) {
                oVar.f40662b = qVar;
            } else {
                C13954o oVar2 = new C13954o();
                oVar2.f40661a = qVar2;
                oVar2.f40662b = oVar.f40662b;
                oVar2.f40663c = oVar.f40663c;
                oVar2.f40664d = oVar.f40664d;
                oVar2.f40665e = oVar.f40665e;
                oVar2.f40666f = oVar.f40666f;
                oVar.f40662b = qVar;
                oVar.f40666f = oVar2;
            }
        }
        return oVar;
    }
}
