package com.google.zxing.p325a0.p326c;

import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.a0.c.c */
/* compiled from: DataMask */
enum C8934c {
    DATA_MASK_000 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo32684a(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32683a(C9044b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo32684a(i2, i3)) {
                    bVar.mo32990a(i3, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo32684a(int i, int i2);
}
