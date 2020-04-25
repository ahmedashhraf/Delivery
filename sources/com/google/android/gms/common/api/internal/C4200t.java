package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4475d;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.t */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4200t<A extends C4061b, L> {

    /* renamed from: a */
    public final C4195s<A, L> f13140a;

    /* renamed from: b */
    public final C4098b0<A, L> f13141b;

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.t$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4201a<A extends C4061b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4206u<A, C5562l<Void>> f13142a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4206u<A, C5562l<Boolean>> f13143b;

        /* renamed from: c */
        private C4167n<L> f13144c;

        /* renamed from: d */
        private Feature[] f13145d;

        /* renamed from: e */
        private boolean f13146e;

        private C4201a() {
            this.f13146e = true;
        }

        @C4056a
        @Deprecated
        /* renamed from: a */
        public C4201a<A, L> mo17963a(C4475d<A, C5562l<Void>> dVar) {
            this.f13142a = new C4106c2(dVar);
            return this;
        }

        @C4056a
        @Deprecated
        /* renamed from: b */
        public C4201a<A, L> mo17969b(C4475d<A, C5562l<Boolean>> dVar) {
            this.f13142a = new C4100b2(this);
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4201a<A, L> mo17962a(C4206u<A, C5562l<Void>> uVar) {
            this.f13142a = uVar;
            return this;
        }

        @C4056a
        /* renamed from: b */
        public C4201a<A, L> mo17968b(C4206u<A, C5562l<Boolean>> uVar) {
            this.f13143b = uVar;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4201a<A, L> mo17961a(C4167n<L> nVar) {
            this.f13144c = nVar;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4201a<A, L> mo17965a(Feature... featureArr) {
            this.f13145d = featureArr;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4201a<A, L> mo17964a(boolean z) {
            this.f13146e = z;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4200t<A, L> mo17966a() {
            boolean z = true;
            C4300a0.m18628a(this.f13142a != null, (Object) "Must set register function");
            C4300a0.m18628a(this.f13143b != null, (Object) "Must set unregister function");
            if (this.f13144c == null) {
                z = false;
            }
            C4300a0.m18628a(z, (Object) "Must set holder");
            return new C4200t<>(new C4125f2(this, this.f13144c, this.f13145d, this.f13146e), new C4113d2(this, this.f13144c.mo17932b()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo17967a(C4061b bVar, C5562l lVar) throws RemoteException {
            this.f13142a.mo17779a(bVar, lVar);
        }
    }

    private C4200t(C4195s<A, L> sVar, C4098b0<A, L> b0Var) {
        this.f13140a = sVar;
        this.f13141b = b0Var;
    }

    @C4056a
    /* renamed from: a */
    public static <A extends C4061b, L> C4201a<A, L> m18195a() {
        return new C4201a<>();
    }
}
