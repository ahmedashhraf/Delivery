package com.fasterxml.jackson.core.p158s;

import com.fasterxml.jackson.core.C3788d;
import com.fasterxml.jackson.core.p162w.C3854a;
import com.fasterxml.jackson.core.p162w.C3854a.C3855a;
import com.fasterxml.jackson.core.p162w.C3854a.C3856b;
import com.fasterxml.jackson.core.p162w.C3869j;

/* renamed from: com.fasterxml.jackson.core.s.d */
/* compiled from: IOContext */
public final class C3819d {

    /* renamed from: a */
    protected final Object f11991a;

    /* renamed from: b */
    protected C3788d f11992b;

    /* renamed from: c */
    protected final boolean f11993c;

    /* renamed from: d */
    protected final C3854a f11994d;

    /* renamed from: e */
    protected byte[] f11995e = null;

    /* renamed from: f */
    protected byte[] f11996f = null;

    /* renamed from: g */
    protected byte[] f11997g = null;

    /* renamed from: h */
    protected char[] f11998h = null;

    /* renamed from: i */
    protected char[] f11999i = null;

    /* renamed from: j */
    protected char[] f12000j = null;

    public C3819d(C3854a aVar, Object obj, boolean z) {
        this.f11994d = aVar;
        this.f11991a = obj;
        this.f11993c = z;
    }

    /* renamed from: a */
    public void mo16875a(C3788d dVar) {
        this.f11992b = dVar;
    }

    /* renamed from: b */
    public char[] mo16882b() {
        if (this.f11999i == null) {
            this.f11999i = this.f11994d.mo17081a(C3856b.CONCAT_BUFFER);
            return this.f11999i;
        }
        throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
    }

    /* renamed from: c */
    public byte[] mo16885c() {
        if (this.f11995e == null) {
            this.f11995e = this.f11994d.mo17080a(C3855a.READ_IO_BUFFER);
            return this.f11995e;
        }
        throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
    }

    /* renamed from: d */
    public char[] mo16886d() {
        if (this.f11998h == null) {
            this.f11998h = this.f11994d.mo17081a(C3856b.TOKEN_BUFFER);
            return this.f11998h;
        }
        throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
    }

    /* renamed from: e */
    public byte[] mo16887e() {
        if (this.f11996f == null) {
            this.f11996f = this.f11994d.mo17080a(C3855a.WRITE_ENCODING_BUFFER);
            return this.f11996f;
        }
        throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
    }

    /* renamed from: f */
    public C3869j mo16888f() {
        return new C3869j(this.f11994d);
    }

    /* renamed from: g */
    public C3788d mo16889g() {
        return this.f11992b;
    }

    /* renamed from: h */
    public Object mo16890h() {
        return this.f11991a;
    }

    /* renamed from: i */
    public boolean mo16891i() {
        return this.f11993c;
    }

    /* renamed from: a */
    public byte[] mo16878a() {
        if (this.f11997g == null) {
            this.f11997g = this.f11994d.mo17080a(C3855a.BASE64_CODEC_BUFFER);
            return this.f11997g;
        }
        throw new IllegalStateException("Trying to call allocBase64Buffer() second time");
    }

    /* renamed from: b */
    public void mo16880b(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f11995e) {
            this.f11995e = null;
            this.f11994d.mo17078a(C3855a.READ_IO_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: c */
    public void mo16883c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f11996f) {
            this.f11996f = null;
            this.f11994d.mo17078a(C3855a.WRITE_ENCODING_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: a */
    public char[] mo16879a(int i) {
        if (this.f12000j == null) {
            this.f12000j = this.f11994d.mo17082a(C3856b.NAME_COPY_BUFFER, i);
            return this.f12000j;
        }
        throw new IllegalStateException("Trying to call allocNameCopyBuffer() second time");
    }

    /* renamed from: b */
    public void mo16881b(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f12000j) {
            this.f12000j = null;
            this.f11994d.mo17079a(C3856b.NAME_COPY_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: c */
    public void mo16884c(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f11998h) {
            this.f11998h = null;
            this.f11994d.mo17079a(C3856b.TOKEN_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: a */
    public void mo16876a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (bArr == this.f11997g) {
            this.f11997g = null;
            this.f11994d.mo17078a(C3855a.BASE64_CODEC_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    /* renamed from: a */
    public void mo16877a(char[] cArr) {
        if (cArr == null) {
            return;
        }
        if (cArr == this.f11999i) {
            this.f11999i = null;
            this.f11994d.mo17079a(C3856b.CONCAT_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }
}
