package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import java.util.Iterator;
import java.util.Map.Entry;
import p053b.p054a.p055a.p057c.C2083b;

/* renamed from: androidx.lifecycle.l */
/* compiled from: MediatorLiveData */
public class C1464l<T> extends C1467n<T> {

    /* renamed from: l */
    private C2083b<LiveData<?>, C1465a<?>> f5721l = new C2083b<>();

    /* renamed from: androidx.lifecycle.l$a */
    /* compiled from: MediatorLiveData */
    private static class C1465a<V> implements C1468o<V> {

        /* renamed from: a */
        final LiveData<V> f5722a;

        /* renamed from: b */
        final C1468o<? super V> f5723b;

        /* renamed from: c */
        int f5724c = -1;

        C1465a(LiveData<V> liveData, C1468o<? super V> oVar) {
            this.f5722a = liveData;
            this.f5723b = oVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6519a() {
            this.f5722a.mo6479a((C1468o<? super T>) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6520b() {
            this.f5722a.mo6482b((C1468o<? super T>) this);
        }

        /* renamed from: a */
        public void mo5554a(@C0195i0 V v) {
            if (this.f5724c != this.f5722a.mo6481b()) {
                this.f5724c = this.f5722a.mo6481b();
                this.f5723b.mo5554a(v);
            }
        }
    }

    @C0187e0
    /* renamed from: a */
    public <S> void mo6518a(@C0193h0 LiveData<S> liveData, @C0193h0 C1468o<? super S> oVar) {
        C1465a aVar = new C1465a(liveData, oVar);
        C1465a aVar2 = (C1465a) this.f5721l.mo9055b(liveData, aVar);
        if (aVar2 == null || aVar2.f5723b == oVar) {
            if (aVar2 == null && mo6484c()) {
                aVar.mo6519a();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    /* access modifiers changed from: protected */
    @C0194i
    /* renamed from: e */
    public void mo6486e() {
        Iterator it = this.f5721l.iterator();
        while (it.hasNext()) {
            ((C1465a) ((Entry) it.next()).getValue()).mo6519a();
        }
    }

    /* access modifiers changed from: protected */
    @C0194i
    /* renamed from: f */
    public void mo6487f() {
        Iterator it = this.f5721l.iterator();
        while (it.hasNext()) {
            ((C1465a) ((Entry) it.next()).getValue()).mo6520b();
        }
    }

    @C0187e0
    /* renamed from: a */
    public <S> void mo6517a(@C0193h0 LiveData<S> liveData) {
        C1465a aVar = (C1465a) this.f5721l.remove(liveData);
        if (aVar != null) {
            aVar.mo6520b();
        }
    }
}
