package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.r */
/* compiled from: FakeTimeLimiter */
public final class C8585r implements C8589s0 {
    /* renamed from: a */
    public <T> T mo31883a(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        C7397x.m35664a(t);
        C7397x.m35664a(cls);
        C7397x.m35664a(timeUnit);
        return t;
    }

    /* renamed from: a */
    public <T> T mo31884a(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        C7397x.m35664a(timeUnit);
        return callable.call();
    }
}
