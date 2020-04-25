package androidx.databinding;

import androidx.annotation.C0193h0;
import androidx.core.p033k.C0940h.C0943c;
import androidx.databinding.C1269i.C1270a;
import androidx.databinding.C1301z.C1302a;

/* renamed from: androidx.databinding.s */
/* compiled from: ListChangeRegistry */
public class C1290s extends C1269i<C1302a, C1301z, C1292b> {

    /* renamed from: R */
    private static final C0943c<C1292b> f5162R = new C0943c<>(10);

    /* renamed from: S */
    private static final int f5163S = 0;

    /* renamed from: T */
    private static final int f5164T = 1;

    /* renamed from: U */
    private static final int f5165U = 2;

    /* renamed from: V */
    private static final int f5166V = 3;

    /* renamed from: W */
    private static final int f5167W = 4;

    /* renamed from: X */
    private static final C1270a<C1302a, C1301z, C1292b> f5168X = new C1291a();

    /* renamed from: androidx.databinding.s$a */
    /* compiled from: ListChangeRegistry */
    static class C1291a extends C1270a<C1302a, C1301z, C1292b> {
        C1291a() {
        }

        /* renamed from: a */
        public void mo5546a(C1302a aVar, C1301z zVar, int i, C1292b bVar) {
            if (i == 1) {
                aVar.mo5561a(zVar, bVar.f5169a, bVar.f5170b);
            } else if (i == 2) {
                aVar.mo5564b(zVar, bVar.f5169a, bVar.f5170b);
            } else if (i == 3) {
                aVar.mo5562a(zVar, bVar.f5169a, bVar.f5171c, bVar.f5170b);
            } else if (i != 4) {
                aVar.mo5560a(zVar);
            } else {
                aVar.mo5566c(zVar, bVar.f5169a, bVar.f5170b);
            }
        }
    }

    /* renamed from: androidx.databinding.s$b */
    /* compiled from: ListChangeRegistry */
    static class C1292b {

        /* renamed from: a */
        public int f5169a;

        /* renamed from: b */
        public int f5170b;

        /* renamed from: c */
        public int f5171c;

        C1292b() {
        }
    }

    public C1290s() {
        super(f5168X);
    }

    /* renamed from: b */
    public void mo5691b(@C0193h0 C1301z zVar, int i, int i2) {
        mo5666a(zVar, 2, m6879a(i, 0, i2));
    }

    /* renamed from: c */
    public void mo5692c(@C0193h0 C1301z zVar, int i, int i2) {
        mo5666a(zVar, 4, m6879a(i, 0, i2));
    }

    /* renamed from: a */
    public void mo5687a(@C0193h0 C1301z zVar) {
        mo5666a(zVar, 0, (C1292b) null);
    }

    /* renamed from: a */
    public void mo5688a(@C0193h0 C1301z zVar, int i, int i2) {
        mo5666a(zVar, 1, m6879a(i, 0, i2));
    }

    /* renamed from: a */
    public void mo5689a(@C0193h0 C1301z zVar, int i, int i2, int i3) {
        mo5666a(zVar, 3, m6879a(i, i2, i3));
    }

    /* renamed from: a */
    private static C1292b m6879a(int i, int i2, int i3) {
        C1292b bVar = (C1292b) f5162R.mo4743a();
        if (bVar == null) {
            bVar = new C1292b();
        }
        bVar.f5169a = i;
        bVar.f5171c = i2;
        bVar.f5170b = i3;
        return bVar;
    }

    /* renamed from: a */
    public synchronized void mo5666a(@C0193h0 C1301z zVar, int i, C1292b bVar) {
        super.mo5666a(zVar, i, bVar);
        if (bVar != null) {
            f5162R.release(bVar);
        }
    }
}
