package com.google.android.gms.common.api;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4246q;
import java.util.concurrent.TimeUnit;

@C4056a
/* renamed from: com.google.android.gms.common.api.l */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4237l<R extends C4246q> {

    @C4056a
    /* renamed from: com.google.android.gms.common.api.l$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4238a {
        @C4056a
        /* renamed from: a */
        void mo17820a(Status status);
    }

    @C0193h0
    /* renamed from: a */
    public abstract R mo17739a();

    @C0193h0
    /* renamed from: a */
    public abstract R mo17740a(long j, @C0193h0 TimeUnit timeUnit);

    @C4056a
    /* renamed from: a */
    public void mo17743a(@C0193h0 C4238a aVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo17745a(@C0193h0 C4247r<? super R> rVar);

    /* renamed from: a */
    public abstract void mo17746a(@C0193h0 C4247r<? super R> rVar, long j, @C0193h0 TimeUnit timeUnit);

    /* renamed from: b */
    public abstract void mo17653b();

    /* renamed from: c */
    public abstract boolean mo17749c();

    @C0195i0
    /* renamed from: d */
    public Integer mo17750d() {
        throw new UnsupportedOperationException();
    }

    @C0193h0
    /* renamed from: a */
    public <S extends C4246q> C4250u<S> mo17741a(@C0193h0 C4249t<? super R, ? extends S> tVar) {
        throw new UnsupportedOperationException();
    }
}
