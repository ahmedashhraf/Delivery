package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.s0 */
/* compiled from: TimeLimiter */
public interface C8589s0 {
    /* renamed from: a */
    <T> T mo31883a(T t, Class<T> cls, long j, TimeUnit timeUnit);

    /* renamed from: a */
    <T> T mo31884a(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception;
}
