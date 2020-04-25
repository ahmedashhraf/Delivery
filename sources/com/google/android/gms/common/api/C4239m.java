package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C4185q;
import com.google.android.gms.common.api.internal.C4226y;
import com.google.android.gms.common.internal.C4300a0;

@C4056a
/* renamed from: com.google.android.gms.common.api.m */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4239m {

    /* renamed from: com.google.android.gms.common.api.m$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class C4240a<R extends C4246q> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f13224q;

        public C4240a(R r) {
            super(Looper.getMainLooper());
            this.f13224q = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final R mo17536b(Status status) {
            if (status.mo17612O() == this.f13224q.mo17504f().mo17612O()) {
                return this.f13224q;
            }
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* renamed from: com.google.android.gms.common.api.m$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class C4241b<R extends C4246q> extends BasePendingResult<R> {
        public C4241b(C4086i iVar) {
            super(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final R mo17536b(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* renamed from: com.google.android.gms.common.api.m$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class C4242c<R extends C4246q> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f13225q;

        public C4242c(C4086i iVar, R r) {
            super(iVar);
            this.f13225q = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final R mo17536b(Status status) {
            return this.f13225q;
        }
    }

    @C4056a
    private C4239m() {
    }

    @C4056a
    /* renamed from: a */
    public static C4237l<Status> m18365a(Status status) {
        C4300a0.m18621a(status, (Object) "Result must not be null");
        C4226y yVar = new C4226y(Looper.getMainLooper());
        yVar.mo17744a(status);
        return yVar;
    }

    @C4056a
    /* renamed from: b */
    public static <R extends C4246q> C4236k<R> m18369b(R r) {
        C4300a0.m18621a(r, (Object) "Result must not be null");
        C4241b bVar = new C4241b(null);
        bVar.mo17744a(r);
        return new C4185q(bVar);
    }

    @C4056a
    /* renamed from: a */
    public static C4237l<Status> m18366a(Status status, C4086i iVar) {
        C4300a0.m18621a(status, (Object) "Result must not be null");
        C4226y yVar = new C4226y(iVar);
        yVar.mo17744a(status);
        return yVar;
    }

    @C4056a
    /* renamed from: b */
    public static <R extends C4246q> C4236k<R> m18370b(R r, C4086i iVar) {
        C4300a0.m18621a(r, (Object) "Result must not be null");
        C4241b bVar = new C4241b(iVar);
        bVar.mo17744a(r);
        return new C4185q(bVar);
    }

    @C4056a
    /* renamed from: a */
    public static <R extends C4246q> C4237l<R> m18368a(R r, C4086i iVar) {
        C4300a0.m18621a(r, (Object) "Result must not be null");
        C4300a0.m18628a(!r.mo17504f().mo17617T(), (Object) "Status code must not be SUCCESS");
        C4242c cVar = new C4242c(iVar, r);
        cVar.mo17744a(r);
        return cVar;
    }

    /* renamed from: a */
    public static C4237l<Status> m18364a() {
        C4226y yVar = new C4226y(Looper.getMainLooper());
        yVar.mo17653b();
        return yVar;
    }

    /* renamed from: a */
    public static <R extends C4246q> C4237l<R> m18367a(R r) {
        C4300a0.m18621a(r, (Object) "Result must not be null");
        C4300a0.m18628a(r.mo17504f().mo17612O() == 16, (Object) "Status code must be CommonStatusCodes.CANCELED");
        C4240a aVar = new C4240a(r);
        aVar.mo17653b();
        return aVar;
    }
}
