package com.google.api.client.http;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

/* renamed from: com.google.api.client.http.e */
/* compiled from: ByteArrayContent */
public final class C7260e extends C7254b {

    /* renamed from: c */
    private final byte[] f20553c;

    /* renamed from: d */
    private final int f20554d;

    /* renamed from: e */
    private final int f20555e;

    public C7260e(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo25633a() {
        return true;
    }

    /* renamed from: b */
    public long mo25634b() {
        return (long) this.f20555e;
    }

    /* renamed from: d */
    public InputStream mo28864d() {
        return new ByteArrayInputStream(this.f20553c, this.f20554d, this.f20555e);
    }

    public C7260e(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.f20553c = (byte[]) C6381h0.m29663a(bArr);
        C6381h0.m29668a(i >= 0 && i2 >= 0 && i + i2 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.f20554d = i;
        this.f20555e = i2;
    }

    /* renamed from: a */
    public static C7260e m35013a(String str, String str2) {
        return new C7260e(str, C6399n0.m29727a(str2));
    }

    /* renamed from: a */
    public C7260e m35016a(String str) {
        return (C7260e) super.mo28861a(str);
    }

    /* renamed from: a */
    public C7260e m35017a(boolean z) {
        return (C7260e) super.mo28862a(z);
    }
}
