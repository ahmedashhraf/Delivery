package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.u */
/* compiled from: BoundType */
public enum C8209u {
    OPEN {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C8209u mo31098d() {
            return C8209u.CLOSED;
        }
    },
    CLOSED {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C8209u mo31098d() {
            return C8209u.OPEN;
        }
    };

    /* renamed from: a */
    static C8209u m39166a(boolean z) {
        return z ? CLOSED : OPEN;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract C8209u mo31098d();
}
