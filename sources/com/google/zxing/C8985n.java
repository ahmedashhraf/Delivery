package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.n */
/* compiled from: Result */
public final class C8985n {

    /* renamed from: a */
    private final String f23493a;

    /* renamed from: b */
    private final byte[] f23494b;

    /* renamed from: c */
    private final int f23495c;

    /* renamed from: d */
    private C8987p[] f23496d;

    /* renamed from: e */
    private final C8929a f23497e;

    /* renamed from: f */
    private Map<C8986o, Object> f23498f;

    /* renamed from: g */
    private final long f23499g;

    public C8985n(String str, byte[] bArr, C8987p[] pVarArr, C8929a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    /* renamed from: a */
    public C8929a mo32819a() {
        return this.f23497e;
    }

    /* renamed from: b */
    public int mo32823b() {
        return this.f23495c;
    }

    /* renamed from: c */
    public byte[] mo32824c() {
        return this.f23494b;
    }

    /* renamed from: d */
    public Map<C8986o, Object> mo32825d() {
        return this.f23498f;
    }

    /* renamed from: e */
    public C8987p[] mo32826e() {
        return this.f23496d;
    }

    /* renamed from: f */
    public String mo32827f() {
        return this.f23493a;
    }

    /* renamed from: g */
    public long mo32828g() {
        return this.f23499g;
    }

    public String toString() {
        return this.f23493a;
    }

    public C8985n(String str, byte[] bArr, C8987p[] pVarArr, C8929a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j);
    }

    /* renamed from: a */
    public void mo32820a(C8986o oVar, Object obj) {
        if (this.f23498f == null) {
            this.f23498f = new EnumMap(C8986o.class);
        }
        this.f23498f.put(oVar, obj);
    }

    public C8985n(String str, byte[] bArr, int i, C8987p[] pVarArr, C8929a aVar, long j) {
        this.f23493a = str;
        this.f23494b = bArr;
        this.f23495c = i;
        this.f23496d = pVarArr;
        this.f23497e = aVar;
        this.f23498f = null;
        this.f23499g = j;
    }

    /* renamed from: a */
    public void mo32821a(Map<C8986o, Object> map) {
        if (map != null) {
            Map<C8986o, Object> map2 = this.f23498f;
            if (map2 == null) {
                this.f23498f = map;
                return;
            }
            map2.putAll(map);
        }
    }

    /* renamed from: a */
    public void mo32822a(C8987p[] pVarArr) {
        C8987p[] pVarArr2 = this.f23496d;
        if (pVarArr2 == null) {
            this.f23496d = pVarArr;
            return;
        }
        if (pVarArr != null && pVarArr.length > 0) {
            C8987p[] pVarArr3 = new C8987p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f23496d = pVarArr3;
        }
    }
}
