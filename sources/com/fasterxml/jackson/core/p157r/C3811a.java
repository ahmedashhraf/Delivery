package com.fasterxml.jackson.core.p157r;

import com.fasterxml.jackson.core.C3789e;
import com.fasterxml.jackson.core.p157r.C3813c.C3814a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/* renamed from: com.fasterxml.jackson.core.r.a */
/* compiled from: DataFormatDetector */
public class C3811a {

    /* renamed from: e */
    public static final int f11954e = 64;

    /* renamed from: a */
    protected final C3789e[] f11955a;

    /* renamed from: b */
    protected final C3815d f11956b;

    /* renamed from: c */
    protected final C3815d f11957c;

    /* renamed from: d */
    protected final int f11958d;

    public C3811a(C3789e... eVarArr) {
        this(eVarArr, C3815d.SOLID_MATCH, C3815d.WEAK_MATCH, 64);
    }

    /* renamed from: a */
    public C3811a mo16852a(C3815d dVar) {
        if (dVar == this.f11957c) {
            return this;
        }
        return new C3811a(this.f11955a, this.f11956b, dVar, this.f11958d);
    }

    /* renamed from: b */
    public C3811a mo16856b(C3815d dVar) {
        if (dVar == this.f11956b) {
            return this;
        }
        return new C3811a(this.f11955a, dVar, this.f11957c, this.f11958d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        C3789e[] eVarArr = this.f11955a;
        int length = eVarArr.length;
        if (length > 0) {
            sb.append(eVarArr[0].mo16571g());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.f11955a[i].mo16571g());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public C3811a(Collection<C3789e> collection) {
        this((C3789e[]) collection.toArray(new C3789e[collection.size()]));
    }

    private C3811a(C3789e[] eVarArr, C3815d dVar, C3815d dVar2, int i) {
        this.f11955a = eVarArr;
        this.f11956b = dVar;
        this.f11957c = dVar2;
        this.f11958d = i;
    }

    /* renamed from: a */
    public C3811a mo16851a(int i) {
        if (i == this.f11958d) {
            return this;
        }
        return new C3811a(this.f11955a, this.f11956b, this.f11957c, i);
    }

    /* renamed from: a */
    public C3812b mo16853a(InputStream inputStream) throws IOException {
        return m16237a(new C3814a(inputStream, new byte[this.f11958d]));
    }

    /* renamed from: a */
    public C3812b mo16854a(byte[] bArr) throws IOException {
        return m16237a(new C3814a(bArr));
    }

    /* renamed from: a */
    public C3812b mo16855a(byte[] bArr, int i, int i2) throws IOException {
        return m16237a(new C3814a(bArr, i, i2));
    }

    /* renamed from: a */
    private C3812b m16237a(C3814a aVar) throws IOException {
        C3789e[] eVarArr = this.f11955a;
        int length = eVarArr.length;
        C3789e eVar = null;
        int i = 0;
        C3815d dVar = null;
        while (true) {
            if (i >= length) {
                break;
            }
            C3789e eVar2 = eVarArr[i];
            aVar.reset();
            C3815d a = eVar2.mo16535a((C3813c) aVar);
            if (a != null && a.ordinal() >= this.f11957c.ordinal() && (eVar == null || dVar.ordinal() < a.ordinal())) {
                if (a.ordinal() >= this.f11956b.ordinal()) {
                    eVar = eVar2;
                    dVar = a;
                    break;
                }
                eVar = eVar2;
                dVar = a;
            }
            i++;
        }
        return aVar.mo16867a(eVar, dVar);
    }
}
