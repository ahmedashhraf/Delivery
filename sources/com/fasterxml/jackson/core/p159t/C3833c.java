package com.fasterxml.jackson.core.p159t;

import com.fasterxml.jackson.core.C3791f;
import com.fasterxml.jackson.core.C3791f.C3792a;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.C3802m;
import com.fasterxml.jackson.core.C3804o;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p156q.C3806a;
import com.fasterxml.jackson.core.p158s.C3817b;
import com.fasterxml.jackson.core.p158s.C3818c;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p162w.C3858c;
import com.fasterxml.jackson.core.p162w.C3870k;
import java.io.IOException;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.fasterxml.jackson.core.t.c */
/* compiled from: JsonGeneratorImpl */
public abstract class C3833c extends C3806a {

    /* renamed from: W */
    protected static final int[] f12071W = C3817b.m16262c();

    /* renamed from: R */
    protected final C3819d f12072R;

    /* renamed from: S */
    protected int[] f12073S = f12071W;

    /* renamed from: T */
    protected int f12074T;

    /* renamed from: U */
    protected C3818c f12075U;

    /* renamed from: V */
    protected C3802m f12076V = C3858c.f12230Q;

    public C3833c(C3819d dVar, int i, C3800k kVar) {
        super(i, kVar);
        this.f12072R = dVar;
        if (mo16634c(C3792a.ESCAPE_NON_ASCII)) {
            mo16589a((int) C13959t.f40827P1);
        }
    }

    /* renamed from: a */
    public C3791f mo16589a(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f12074T = i;
        return this;
    }

    /* renamed from: e */
    public int mo16639e() {
        return this.f12074T;
    }

    public C3804o version() {
        return C3870k.m16928a(getClass());
    }

    /* renamed from: a */
    public C3791f mo16595a(C3818c cVar) {
        this.f12075U = cVar;
        if (cVar == null) {
            this.f12073S = f12071W;
        } else {
            this.f12073S = cVar.mo16874a();
        }
        return this;
    }

    /* renamed from: a */
    public C3818c mo16596a() {
        return this.f12075U;
    }

    /* renamed from: a */
    public C3791f mo16594a(C3802m mVar) {
        this.f12076V = mVar;
        return this;
    }

    /* renamed from: a */
    public final void mo16610a(String str, String str2) throws IOException, JsonGenerationException {
        mo16630c(str);
        mo16650i(str2);
    }
}
