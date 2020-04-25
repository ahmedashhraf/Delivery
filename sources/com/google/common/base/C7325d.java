package com.google.common.base;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.d */
/* compiled from: CaseFormat */
public enum C7325d {
    LOWER_HYPHEN(C5799e.m25412b('-'), "-") {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo29196a(C7325d dVar, String str) {
            if (dVar == C7325d.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (dVar == C7325d.UPPER_UNDERSCORE) {
                return C5785c.m25359b(str.replace('-', '_'));
            }
            return C7325d.super.mo29196a(dVar, str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo29198b(String str) {
            return C5785c.m25356a(str);
        }
    },
    LOWER_UNDERSCORE(r3, r4) {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo29196a(C7325d dVar, String str) {
            if (dVar == C7325d.LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            if (dVar == C7325d.UPPER_UNDERSCORE) {
                return C5785c.m25359b(str);
            }
            return C7325d.super.mo29196a(dVar, str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo29198b(String str) {
            return C5785c.m25356a(str);
        }
    },
    LOWER_CAMEL(C5799e.m25406a('A', 'Z'), r8) {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo29198b(String str) {
            return C7325d.m35496d(str);
        }
    },
    UPPER_CAMEL(C5799e.m25406a('A', 'Z'), r8) {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo29198b(String str) {
            return C7325d.m35496d(str);
        }
    },
    UPPER_UNDERSCORE(C5799e.m25412b('_'), r4) {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo29196a(C7325d dVar, String str) {
            if (dVar == C7325d.LOWER_HYPHEN) {
                return C5785c.m25356a(str.replace('_', '-'));
            }
            if (dVar == C7325d.LOWER_UNDERSCORE) {
                return C5785c.m25356a(str);
            }
            return C7325d.super.mo29196a(dVar, str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo29198b(String str) {
            return C5785c.m25359b(str);
        }
    };
    
    private final C5799e wordBoundary;
    private final String wordSeparator;

    /* renamed from: com.google.common.base.d$f */
    /* compiled from: CaseFormat */
    private static final class C7331f extends C7337g<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final C7325d f20778N;

        /* renamed from: O */
        private final C7325d f20779O;

        C7331f(C7325d dVar, C7325d dVar2) {
            this.f20778N = (C7325d) C7397x.m35664a(dVar);
            this.f20779O = (C7325d) C7397x.m35664a(dVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo26637f(String str) {
            if (str == null) {
                return null;
            }
            return this.f20779O.mo29197b(this.f20778N, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo26638g(String str) {
            if (str == null) {
                return null;
            }
            return this.f20778N.mo29197b(this.f20779O, str);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C7331f)) {
                return false;
            }
            C7331f fVar = (C7331f) obj;
            if (!this.f20778N.equals(fVar.f20778N) || !this.f20779O.equals(fVar.f20779O)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f20778N.hashCode() ^ this.f20779O.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20778N);
            sb.append(".converterTo(");
            sb.append(this.f20779O);
            sb.append(")");
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m35496d(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(C5785c.m25363e(str.charAt(0)));
        sb.append(C5785c.m25356a(str.substring(1)));
        return sb.toString();
    }

    /* renamed from: e */
    private String m35497e(String str) {
        return this == LOWER_CAMEL ? C5785c.m25356a(str) : mo29198b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo29196a(C7325d dVar, String str) {
        int i = 0;
        StringBuilder sb = null;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.mo23086a((CharSequence) str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (this.wordSeparator.length() * 4));
                sb.append(dVar.m35497e(str.substring(i, i2)));
            } else {
                sb.append(dVar.mo29198b(str.substring(i, i2)));
            }
            sb.append(dVar.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return dVar.m35497e(str);
        }
        sb.append(dVar.mo29198b(str.substring(i)));
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo29197b(C7325d dVar, String str) {
        C7397x.m35664a(dVar);
        C7397x.m35664a(str);
        return dVar == this ? str : mo29196a(dVar, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract String mo29198b(String str);

    private C7325d(C5799e eVar, String str) {
        this.wordBoundary = eVar;
        this.wordSeparator = str;
    }

    @C2775a
    /* renamed from: a */
    public C7337g<String, String> mo29195a(C7325d dVar) {
        return new C7331f(this, dVar);
    }
}
