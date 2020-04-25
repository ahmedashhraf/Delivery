package com.google.common.util.concurrent;

import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.o */
/* compiled from: CheckedFuture */
public interface C8564o<V, X extends Exception> extends C8473c0<V> {
    /* renamed from: a */
    V mo31614a(long j, TimeUnit timeUnit) throws TimeoutException, Exception;

    /* renamed from: l */
    V mo31615l() throws Exception;
}
