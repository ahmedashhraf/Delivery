package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import p053b.p054a.p055a.p058d.C2090a;

/* renamed from: androidx.lifecycle.s */
/* compiled from: Transformations */
public class C1473s {

    /* renamed from: androidx.lifecycle.s$a */
    /* compiled from: Transformations */
    static class C1474a implements C1468o<X> {

        /* renamed from: a */
        final /* synthetic */ C1464l f5728a;

        /* renamed from: b */
        final /* synthetic */ C2090a f5729b;

        C1474a(C1464l lVar, C2090a aVar) {
            this.f5728a = lVar;
            this.f5729b = aVar;
        }

        /* renamed from: a */
        public void mo5554a(@C0195i0 X x) {
            this.f5728a.mo6483b(this.f5729b.apply(x));
        }
    }

    /* renamed from: androidx.lifecycle.s$b */
    /* compiled from: Transformations */
    static class C1475b implements C1468o<X> {

        /* renamed from: a */
        LiveData<Y> f5730a;

        /* renamed from: b */
        final /* synthetic */ C2090a f5731b;

        /* renamed from: c */
        final /* synthetic */ C1464l f5732c;

        /* renamed from: androidx.lifecycle.s$b$a */
        /* compiled from: Transformations */
        class C1476a implements C1468o<Y> {
            C1476a() {
            }

            /* renamed from: a */
            public void mo5554a(@C0195i0 Y y) {
                C1475b.this.f5732c.mo6483b(y);
            }
        }

        C1475b(C2090a aVar, C1464l lVar) {
            this.f5731b = aVar;
            this.f5732c = lVar;
        }

        /* renamed from: a */
        public void mo5554a(@C0195i0 X x) {
            LiveData<Y> liveData = (LiveData) this.f5731b.apply(x);
            LiveData<Y> liveData2 = this.f5730a;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f5732c.mo6517a(liveData2);
                }
                this.f5730a = liveData;
                LiveData<Y> liveData3 = this.f5730a;
                if (liveData3 != null) {
                    this.f5732c.mo6518a(liveData3, new C1476a());
                }
            }
        }
    }

    private C1473s() {
    }

    @C0187e0
    /* renamed from: a */
    public static <X, Y> LiveData<Y> m7733a(@C0193h0 LiveData<X> liveData, @C0193h0 C2090a<X, Y> aVar) {
        C1464l lVar = new C1464l();
        lVar.mo6518a(liveData, new C1474a(lVar, aVar));
        return lVar;
    }

    @C0187e0
    /* renamed from: b */
    public static <X, Y> LiveData<Y> m7734b(@C0193h0 LiveData<X> liveData, @C0193h0 C2090a<X, LiveData<Y>> aVar) {
        C1464l lVar = new C1464l();
        lVar.mo6518a(liveData, new C1475b(aVar, lVar));
        return lVar;
    }
}
