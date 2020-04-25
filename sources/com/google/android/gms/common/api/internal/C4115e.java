package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult.C4090a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4335g0;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4115e {

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4116a<R extends C4246q, A extends C4061b> extends BasePendingResult<R> implements C4117b<R> {
        @C4056a

        /* renamed from: q */
        private final C4062c<A> f12920q;
        @C4056a

        /* renamed from: r */
        private final C4059a<?> f12921r;

        @C4056a
        @Deprecated
        protected C4116a(@C0193h0 C4062c<A> cVar, @C0193h0 C4086i iVar) {
            super((C4086i) C4300a0.m18621a(iVar, (Object) "GoogleApiClient must not be null"));
            this.f12920q = (C4062c) C4300a0.m18620a(cVar);
            this.f12921r = null;
        }

        @C4056a
        /* renamed from: a */
        public final void mo17809a(@C0193h0 Status status) {
            C4300a0.m18628a(!status.mo17617T(), (Object) "Failed result must not be success");
            C4246q b = mo17536b(status);
            mo17744a(b);
            mo17812b((R) b);
        }

        /* access modifiers changed from: protected */
        @C4056a
        /* renamed from: a */
        public abstract void mo17535a(@C0193h0 A a) throws RemoteException;

        @C4056a
        /* renamed from: b */
        public final void mo17811b(@C0193h0 A a) throws DeadObjectException {
            if (a instanceof C4335g0) {
                a = ((C4335g0) a).mo17532E();
            }
            try {
                mo17535a(a);
            } catch (DeadObjectException e) {
                m17769a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m17769a(e2);
            }
        }

        /* access modifiers changed from: protected */
        @C4056a
        /* renamed from: b */
        public void mo17812b(@C0193h0 R r) {
        }

        @C4056a
        /* renamed from: h */
        public final C4059a<?> mo17813h() {
            return this.f12921r;
        }

        @C4056a
        /* renamed from: i */
        public final C4062c<A> mo17814i() {
            return this.f12920q;
        }

        @C4056a
        protected C4116a(@C0193h0 C4059a<?> aVar, @C0193h0 C4086i iVar) {
            super((C4086i) C4300a0.m18621a(iVar, (Object) "GoogleApiClient must not be null"));
            C4300a0.m18621a(aVar, (Object) "Api must not be null");
            this.f12920q = aVar.mo17625a();
            this.f12921r = aVar;
        }

        @C4056a
        /* renamed from: a */
        private void m17769a(@C0193h0 RemoteException remoteException) {
            mo17809a(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        @C4056a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo17810a(Object obj) {
            super.mo17744a((C4246q) obj);
        }

        @C4056a
        @C0224v0
        protected C4116a(@C0193h0 C4090a<R> aVar) {
            super(aVar);
            this.f12920q = null;
            this.f12921r = null;
        }
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4117b<R> {
        @C4056a
        /* renamed from: a */
        void mo17809a(Status status);

        @C4056a
        /* renamed from: a */
        void mo17810a(R r);
    }
}
