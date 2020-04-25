package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.g0 */
final class C4285g0 extends C4281e0 {

    /* renamed from: e */
    private final Callable<String> f13290e;

    private C4285g0(Callable<String> callable) {
        super(false, null, null);
        this.f13290e = callable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo18117a() {
        try {
            return (String) this.f13290e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
