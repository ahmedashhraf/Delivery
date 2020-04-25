package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.C4245p;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4416z {

    /* renamed from: a */
    private static final C4418b f13543a = new C4404t0();

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.z$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4417a<R extends C4246q, T> {
        @C4056a
        /* renamed from: a */
        T mo17498a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.z$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4418b {
        /* renamed from: a */
        ApiException mo18393a(Status status);
    }

    @C4056a
    /* renamed from: a */
    public static <R extends C4246q, T> C5560k<T> m19057a(C4237l<R> lVar, C4417a<R, T> aVar) {
        C4418b bVar = f13543a;
        C5562l lVar2 = new C5562l();
        lVar.mo17743a((C4238a) new C4408v0(lVar, lVar2, aVar, bVar));
        return lVar2.mo22017a();
    }

    @C4056a
    /* renamed from: a */
    public static <R extends C4246q, T extends C4245p<R>> C5560k<T> m19056a(C4237l<R> lVar, T t) {
        return m19057a(lVar, (C4417a<R, T>) new C4406u0<R,T>(t));
    }

    @C4056a
    /* renamed from: a */
    public static <R extends C4246q> C5560k<Void> m19055a(C4237l<R> lVar) {
        return m19057a(lVar, (C4417a<R, T>) new C4410w0<R,T>());
    }
}
