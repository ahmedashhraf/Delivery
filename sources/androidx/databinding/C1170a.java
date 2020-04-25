package androidx.databinding;

import androidx.annotation.C0193h0;
import androidx.databinding.C1296v.C1297a;

/* renamed from: androidx.databinding.a */
/* compiled from: BaseObservable */
public class C1170a implements C1296v {

    /* renamed from: a */
    private transient C1177c0 f5062a;

    /* renamed from: a */
    public void mo5579a(@C0193h0 C1297a aVar) {
        synchronized (this) {
            if (this.f5062a == null) {
                this.f5062a = new C1177c0();
            }
        }
        this.f5062a.mo5665a(aVar);
    }

    /* renamed from: b */
    public void mo5580b(@C0193h0 C1297a aVar) {
        synchronized (this) {
            if (this.f5062a != null) {
                this.f5062a.mo5669b(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo5577a() {
        synchronized (this) {
            if (this.f5062a != null) {
                this.f5062a.mo5666a(this, 0, null);
            }
        }
    }

    /* renamed from: a */
    public void mo5578a(int i) {
        synchronized (this) {
            if (this.f5062a != null) {
                this.f5062a.mo5666a(this, i, null);
            }
        }
    }
}
