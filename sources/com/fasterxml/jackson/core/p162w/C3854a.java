package com.fasterxml.jackson.core.p162w;

/* renamed from: com.fasterxml.jackson.core.w.a */
/* compiled from: BufferRecycler */
public class C3854a {

    /* renamed from: c */
    public static final int f12218c = 2000;

    /* renamed from: a */
    protected final byte[][] f12219a = new byte[C3855a.values().length][];

    /* renamed from: b */
    protected final char[][] f12220b = new char[C3856b.values().length][];

    /* renamed from: com.fasterxml.jackson.core.w.a$a */
    /* compiled from: BufferRecycler */
    public enum C3855a {
        READ_IO_BUFFER(4000),
        WRITE_ENCODING_BUFFER(4000),
        WRITE_CONCAT_BUFFER(2000),
        BASE64_CODEC_BUFFER(2000);
        
        protected final int size;

        private C3855a(int i) {
            this.size = i;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.w.a$b */
    /* compiled from: BufferRecycler */
    public enum C3856b {
        TOKEN_BUFFER(2000),
        CONCAT_BUFFER(2000),
        TEXT_BUFFER(200),
        NAME_COPY_BUFFER(200);
        
        protected final int size;

        private C3856b(int i) {
            this.size = i;
        }
    }

    /* renamed from: b */
    private char[] m16736b(int i) {
        return new char[i];
    }

    /* renamed from: a */
    public final byte[] mo17080a(C3855a aVar) {
        int ordinal = aVar.ordinal();
        byte[][] bArr = this.f12219a;
        byte[] bArr2 = bArr[ordinal];
        if (bArr2 == null) {
            return m16735a(aVar.size);
        }
        bArr[ordinal] = null;
        return bArr2;
    }

    /* renamed from: a */
    public final void mo17078a(C3855a aVar, byte[] bArr) {
        this.f12219a[aVar.ordinal()] = bArr;
    }

    /* renamed from: a */
    public final char[] mo17081a(C3856b bVar) {
        return mo17082a(bVar, 0);
    }

    /* renamed from: a */
    public final char[] mo17082a(C3856b bVar, int i) {
        int i2 = bVar.size;
        if (i2 > i) {
            i = i2;
        }
        int ordinal = bVar.ordinal();
        char[][] cArr = this.f12220b;
        char[] cArr2 = cArr[ordinal];
        if (cArr2 == null || cArr2.length < i) {
            return m16736b(i);
        }
        cArr[ordinal] = null;
        return cArr2;
    }

    /* renamed from: a */
    public final void mo17079a(C3856b bVar, char[] cArr) {
        this.f12220b[bVar.ordinal()] = cArr;
    }

    /* renamed from: a */
    private byte[] m16735a(int i) {
        return new byte[i];
    }
}
