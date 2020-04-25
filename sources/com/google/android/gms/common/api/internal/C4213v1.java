package com.google.android.gms.common.api.internal;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.v1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface C4213v1 {
    /* renamed from: a */
    ConnectionResult mo17884a(long j, TimeUnit timeUnit);

    @C0195i0
    /* renamed from: a */
    ConnectionResult mo17885a(@C0193h0 C4059a<?> aVar);

    /* renamed from: a */
    <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17886a(@C0193h0 T t);

    /* renamed from: a */
    void mo17887a();

    /* renamed from: a */
    void mo17891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    boolean mo17892a(C4211v vVar);

    /* renamed from: b */
    <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17893b(@C0193h0 T t);

    /* renamed from: b */
    void mo17894b();

    /* renamed from: c */
    void mo17895c();

    /* renamed from: d */
    boolean mo17896d();

    /* renamed from: e */
    void mo17897e();

    /* renamed from: f */
    ConnectionResult mo17898f();

    boolean isConnected();
}
