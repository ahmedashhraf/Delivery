package com.google.gson;

import com.google.gson.p321x.C8850k;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.gson.l */
/* compiled from: JsonElement */
public abstract class C8787l {
    /* renamed from: A */
    public boolean mo32391A() {
        return this instanceof C8788m;
    }

    /* renamed from: C */
    public boolean mo32392C() {
        return this instanceof C8789n;
    }

    /* renamed from: D */
    public boolean mo32393D() {
        return this instanceof C8791p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C8787l mo32368b();

    /* renamed from: c */
    public BigDecimal mo32370c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public BigInteger mo32372e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public boolean mo32374f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Boolean mo32394l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: m */
    public byte mo32378m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: n */
    public char mo32379n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: o */
    public double mo32380o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: p */
    public float mo32381p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: q */
    public int mo32382q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: r */
    public C8784i mo32395r() {
        if (mo32400z()) {
            return (C8784i) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: s */
    public C8788m mo32396s() {
        if (mo32391A()) {
            return (C8788m) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Null: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: t */
    public C8789n mo32397t() {
        if (mo32392C()) {
            return (C8789n) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8799d dVar = new C8799d(stringWriter);
            dVar.mo32464b(true);
            C8850k.m41446a(this, dVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: u */
    public C8791p mo32399u() {
        if (mo32393D()) {
            return (C8791p) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public long mo32385v() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: w */
    public Number mo32386w() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: x */
    public short mo32387x() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: y */
    public String mo32388y() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: z */
    public boolean mo32400z() {
        return this instanceof C8784i;
    }
}
