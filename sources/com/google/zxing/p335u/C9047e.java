package com.google.zxing.p335u;

import java.util.List;

/* renamed from: com.google.zxing.u.e */
/* compiled from: DecoderResult */
public final class C9047e {

    /* renamed from: a */
    private final byte[] f23670a;

    /* renamed from: b */
    private int f23671b;

    /* renamed from: c */
    private final String f23672c;

    /* renamed from: d */
    private final List<byte[]> f23673d;

    /* renamed from: e */
    private final String f23674e;

    /* renamed from: f */
    private Integer f23675f;

    /* renamed from: g */
    private Integer f23676g;

    /* renamed from: h */
    private Object f23677h;

    /* renamed from: i */
    private final int f23678i;

    /* renamed from: j */
    private final int f23679j;

    public C9047e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public void mo33015a(int i) {
        this.f23671b = i;
    }

    /* renamed from: b */
    public String mo33018b() {
        return this.f23674e;
    }

    /* renamed from: c */
    public Integer mo33020c() {
        return this.f23676g;
    }

    /* renamed from: d */
    public Integer mo33021d() {
        return this.f23675f;
    }

    /* renamed from: e */
    public int mo33022e() {
        return this.f23671b;
    }

    /* renamed from: f */
    public Object mo33023f() {
        return this.f23677h;
    }

    /* renamed from: g */
    public byte[] mo33024g() {
        return this.f23670a;
    }

    /* renamed from: h */
    public int mo33025h() {
        return this.f23678i;
    }

    /* renamed from: i */
    public int mo33026i() {
        return this.f23679j;
    }

    /* renamed from: j */
    public String mo33027j() {
        return this.f23672c;
    }

    /* renamed from: k */
    public boolean mo33028k() {
        return this.f23678i >= 0 && this.f23679j >= 0;
    }

    public C9047e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f23670a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f23671b = i3;
        this.f23672c = str;
        this.f23673d = list;
        this.f23674e = str2;
        this.f23678i = i2;
        this.f23679j = i;
    }

    /* renamed from: a */
    public List<byte[]> mo33014a() {
        return this.f23673d;
    }

    /* renamed from: b */
    public void mo33019b(Integer num) {
        this.f23675f = num;
    }

    /* renamed from: a */
    public void mo33016a(Integer num) {
        this.f23676g = num;
    }

    /* renamed from: a */
    public void mo33017a(Object obj) {
        this.f23677h = obj;
    }
}
