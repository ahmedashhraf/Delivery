package org.apache.http;

import java.io.Serializable;

/* renamed from: org.apache.http.w */
/* compiled from: HttpVersion */
public final class C15471w extends C15473y implements Serializable {

    /* renamed from: O */
    public static final String f44686O = "HTTP";

    /* renamed from: P */
    public static final C15471w f44687P = new C15471w(0, 9);

    /* renamed from: Q */
    public static final C15471w f44688Q = new C15471w(1, 0);

    /* renamed from: R */
    public static final C15471w f44689R = new C15471w(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public C15471w(int i, int i2) {
        super(f44686O, i, i2);
    }

    /* renamed from: a */
    public C15473y mo47790a(int i, int i2) {
        if (i == this.f44692b && i2 == this.f44690N) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return f44688Q;
            }
            if (i2 == 1) {
                return f44689R;
            }
        }
        if (i == 0 && i2 == 9) {
            return f44687P;
        }
        return new C15471w(i, i2);
    }
}
