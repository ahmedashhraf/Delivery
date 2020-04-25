package com.google.zxing;

import com.google.zxing.p335u.C9043a;
import com.google.zxing.p335u.C9044b;

/* renamed from: com.google.zxing.c */
/* compiled from: BinaryBitmap */
public final class C8969c {

    /* renamed from: a */
    private final C8968b f23452a;

    /* renamed from: b */
    private C9044b f23453b;

    public C8969c(C8968b bVar) {
        if (bVar != null) {
            this.f23452a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C9043a mo32765a(int i, C9043a aVar) throws NotFoundException {
        return this.f23452a.mo32759a(i, aVar);
    }

    /* renamed from: b */
    public int mo32767b() {
        return this.f23452a.mo32761b();
    }

    /* renamed from: c */
    public int mo32768c() {
        return this.f23452a.mo32763d();
    }

    /* renamed from: d */
    public boolean mo32769d() {
        return this.f23452a.mo32762c().mo32807e();
    }

    /* renamed from: e */
    public boolean mo32770e() {
        return this.f23452a.mo32762c().mo32808f();
    }

    /* renamed from: f */
    public C8969c mo32771f() {
        return new C8969c(this.f23452a.mo32758a(this.f23452a.mo32762c().mo32809g()));
    }

    /* renamed from: g */
    public C8969c mo32772g() {
        return new C8969c(this.f23452a.mo32758a(this.f23452a.mo32762c().mo32810h()));
    }

    public String toString() {
        try {
            return mo32766a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public C9044b mo32766a() throws NotFoundException {
        if (this.f23453b == null) {
            this.f23453b = this.f23452a.mo32760a();
        }
        return this.f23453b;
    }

    /* renamed from: a */
    public C8969c mo32764a(int i, int i2, int i3, int i4) {
        return new C8969c(this.f23452a.mo32758a(this.f23452a.mo32762c().mo32803a(i, i2, i3, i4)));
    }
}
