package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4076b extends BasePendingResult<C4078c> {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f12800q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f12801r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f12802s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C4237l<?>[] f12803t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final Object f12804u;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4077a {

        /* renamed from: a */
        private List<C4237l<?>> f12805a = new ArrayList();

        /* renamed from: b */
        private C4086i f12806b;

        public C4077a(C4086i iVar) {
            this.f12806b = iVar;
        }

        /* renamed from: a */
        public final <R extends C4246q> C4079d<R> mo17655a(C4237l<R> lVar) {
            C4079d<R> dVar = new C4079d<>(this.f12805a.size());
            this.f12805a.add(lVar);
            return dVar;
        }

        /* renamed from: a */
        public final C4076b mo17654a() {
            return new C4076b(this.f12805a, this.f12806b, null);
        }
    }

    private C4076b(List<C4237l<?>> list, C4086i iVar) {
        super(iVar);
        this.f12804u = new Object();
        this.f12800q = list.size();
        this.f12803t = new C4237l[this.f12800q];
        if (list.isEmpty()) {
            mo17744a(new C4078c(Status.f12780P, this.f12803t));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C4237l<?> lVar = (C4237l) list.get(i);
            this.f12803t[i] = lVar;
            lVar.mo17743a((C4238a) new C4251v(this));
        }
    }

    /* renamed from: b */
    public final void mo17653b() {
        super.mo17653b();
        for (C4237l<?> b : this.f12803t) {
            b.mo17653b();
        }
    }

    /* renamed from: b */
    public final C4078c m17584b(Status status) {
        return new C4078c(status, this.f12803t);
    }

    /* synthetic */ C4076b(List list, C4086i iVar, C4251v vVar) {
        this(list, iVar);
    }
}
