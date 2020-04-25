package com.fasterxml.jackson.core.p157r;

import com.fasterxml.jackson.core.C3789e;
import com.fasterxml.jackson.core.C3794h;
import com.fasterxml.jackson.core.p158s.C3822g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.r.b */
/* compiled from: DataFormatMatcher */
public class C3812b {

    /* renamed from: a */
    protected final InputStream f11959a;

    /* renamed from: b */
    protected final byte[] f11960b;

    /* renamed from: c */
    protected final int f11961c;

    /* renamed from: d */
    protected final int f11962d;

    /* renamed from: e */
    protected final C3789e f11963e;

    /* renamed from: f */
    protected final C3815d f11964f;

    protected C3812b(InputStream inputStream, byte[] bArr, int i, int i2, C3789e eVar, C3815d dVar) {
        this.f11959a = inputStream;
        this.f11960b = bArr;
        this.f11961c = i;
        this.f11962d = i2;
        this.f11963e = eVar;
        this.f11964f = dVar;
    }

    /* renamed from: a */
    public C3794h mo16858a() throws IOException {
        C3789e eVar = this.f11963e;
        if (eVar == null) {
            return null;
        }
        if (this.f11959a == null) {
            return eVar.mo16533a(this.f11960b, this.f11961c, this.f11962d);
        }
        return eVar.mo16528a(mo16859b());
    }

    /* renamed from: b */
    public InputStream mo16859b() {
        InputStream inputStream = this.f11959a;
        if (inputStream == null) {
            return new ByteArrayInputStream(this.f11960b, this.f11961c, this.f11962d);
        }
        C3822g gVar = new C3822g(null, inputStream, this.f11960b, this.f11961c, this.f11962d);
        return gVar;
    }

    /* renamed from: c */
    public C3789e mo16860c() {
        return this.f11963e;
    }

    /* renamed from: d */
    public C3815d mo16861d() {
        C3815d dVar = this.f11964f;
        return dVar == null ? C3815d.INCONCLUSIVE : dVar;
    }

    /* renamed from: e */
    public String mo16862e() {
        return this.f11963e.mo16571g();
    }

    /* renamed from: f */
    public boolean mo16863f() {
        return this.f11963e != null;
    }
}
