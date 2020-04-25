package org.apache.http.p547h0;

import org.apache.http.C15117a0;
import org.apache.http.C15463o;
import org.apache.http.C15473y;
import org.apache.http.p548i0.C15359k;

/* renamed from: org.apache.http.h0.i */
/* compiled from: BasicHttpRequest */
public class C15332i extends C15324a implements C15463o {

    /* renamed from: N */
    private final String f44385N;

    /* renamed from: O */
    private final String f44386O;

    /* renamed from: P */
    private C15117a0 f44387P;

    public C15332i(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Method name may not be null");
        } else if (str2 != null) {
            this.f44385N = str;
            this.f44386O = str2;
            this.f44387P = null;
        } else {
            throw new IllegalArgumentException("Request URI may not be null");
        }
    }

    /* renamed from: b */
    public C15473y mo46955b() {
        return mo46956h().mo46854b();
    }

    /* renamed from: h */
    public C15117a0 mo46956h() {
        if (this.f44387P == null) {
            this.f44387P = new C15338o(this.f44385N, this.f44386O, C15359k.m68046d(getParams()));
        }
        return this.f44387P;
    }

    public C15332i(String str, String str2, C15473y yVar) {
        this(new C15338o(str, str2, yVar));
    }

    public C15332i(C15117a0 a0Var) {
        if (a0Var != null) {
            this.f44387P = a0Var;
            this.f44385N = a0Var.mo46855e();
            this.f44386O = a0Var.mo46856f();
            return;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }
}
