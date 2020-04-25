package com.google.common.cache;

import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: com.google.common.cache.n */
/* compiled from: RemovalCause */
public enum C7511n {
    EXPLICIT {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29585d() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29585d() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29585d() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29585d() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo29585d() {
            return true;
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract boolean mo29585d();
}
