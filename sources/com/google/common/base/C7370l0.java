package com.google.common.base;

import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.base.l0 */
/* compiled from: Verify */
public final class C7370l0 {
    private C7370l0() {
    }

    /* renamed from: a */
    public static void m35617a(boolean z) {
        if (!z) {
            throw new VerifyException();
        }
    }

    /* renamed from: a */
    public static void m35618a(boolean z, @C5952h String str, @C5952h Object... objArr) {
        if (!z) {
            throw new VerifyException(C7397x.m35669a(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m35615a(@C5952h T t) {
        return m35616a(t, "expected a non-null reference", new Object[0]);
    }

    /* renamed from: a */
    public static <T> T m35616a(@C5952h T t, @C5952h String str, @C5952h Object... objArr) {
        m35618a(t != null, str, objArr);
        return t;
    }
}
