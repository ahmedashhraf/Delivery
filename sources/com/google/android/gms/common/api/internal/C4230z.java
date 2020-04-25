package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4475d;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4230z<A extends C4061b, ResultT> {

    /* renamed from: a */
    private final Feature[] f13189a;

    /* renamed from: b */
    private final boolean f13190b;

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.z$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4231a<A extends C4061b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4206u<A, C5562l<ResultT>> f13191a;

        /* renamed from: b */
        private boolean f13192b;

        /* renamed from: c */
        private Feature[] f13193c;

        private C4231a() {
            this.f13192b = true;
        }

        @C4056a
        @Deprecated
        /* renamed from: a */
        public C4231a<A, ResultT> mo18000a(C4475d<A, C5562l<ResultT>> dVar) {
            this.f13191a = new C4173n2(dVar);
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4231a<A, ResultT> mo17999a(C4206u<A, C5562l<ResultT>> uVar) {
            this.f13191a = uVar;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4231a<A, ResultT> mo18002a(Feature... featureArr) {
            this.f13193c = featureArr;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4231a<A, ResultT> mo18001a(boolean z) {
            this.f13192b = z;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public C4230z<A, ResultT> mo18003a() {
            C4300a0.m18628a(this.f13191a != null, (Object) "execute parameter required");
            return new C4178o2(this, this.f13193c, this.f13192b);
        }
    }

    @C4056a
    @Deprecated
    public C4230z() {
        this.f13189a = null;
        this.f13190b = false;
    }

    @C4056a
    /* renamed from: c */
    public static <A extends C4061b, ResultT> C4231a<A, ResultT> m18288c() {
        return new C4231a<>();
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract void mo10089a(A a, C5562l<ResultT> lVar) throws RemoteException;

    @C4056a
    /* renamed from: a */
    public boolean mo17997a() {
        return this.f13190b;
    }

    @C0195i0
    /* renamed from: b */
    public final Feature[] mo17998b() {
        return this.f13189a;
    }

    @C4056a
    private C4230z(Feature[] featureArr, boolean z) {
        this.f13189a = featureArr;
        this.f13190b = z;
    }
}
