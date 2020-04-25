package androidx.databinding;

import androidx.databinding.C1296v.C1297a;

/* renamed from: androidx.databinding.b */
/* compiled from: BaseObservableField */
abstract class C1173b extends C1170a {

    /* renamed from: androidx.databinding.b$a */
    /* compiled from: BaseObservableField */
    class C1174a extends C1297a {
        C1174a() {
        }

        /* renamed from: a */
        public void mo5559a(C1296v vVar, int i) {
            C1173b.this.mo5577a();
        }
    }

    public C1173b() {
    }

    public C1173b(C1296v... vVarArr) {
        if (vVarArr != null && vVarArr.length != 0) {
            C1174a aVar = new C1174a();
            for (C1296v a : vVarArr) {
                a.mo5579a(aVar);
            }
        }
    }
}
