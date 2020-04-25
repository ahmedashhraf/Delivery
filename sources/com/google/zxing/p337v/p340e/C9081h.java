package com.google.zxing.p337v.p340e;

import com.google.zxing.C8975e;
import java.nio.charset.Charset;

/* renamed from: com.google.zxing.v.e.h */
/* compiled from: EncoderContext */
final class C9081h {

    /* renamed from: a */
    private final String f23757a;

    /* renamed from: b */
    private C9085l f23758b;

    /* renamed from: c */
    private C8975e f23759c;

    /* renamed from: d */
    private C8975e f23760d;

    /* renamed from: e */
    private final StringBuilder f23761e;

    /* renamed from: f */
    int f23762f;

    /* renamed from: g */
    private int f23763g;

    /* renamed from: h */
    private C9084k f23764h;

    /* renamed from: i */
    private int f23765i;

    C9081h(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f23757a = sb.toString();
        this.f23758b = C9085l.FORCE_NONE;
        this.f23761e = new StringBuilder(str.length());
        this.f23763g = -1;
    }

    /* renamed from: m */
    private int m42472m() {
        return this.f23757a.length() - this.f23765i;
    }

    /* renamed from: a */
    public void mo33079a(C9085l lVar) {
        this.f23758b = lVar;
    }

    /* renamed from: b */
    public StringBuilder mo33081b() {
        return this.f23761e;
    }

    /* renamed from: c */
    public char mo33083c() {
        return this.f23757a.charAt(this.f23762f);
    }

    /* renamed from: d */
    public char mo33085d() {
        return this.f23757a.charAt(this.f23762f);
    }

    /* renamed from: e */
    public String mo33086e() {
        return this.f23757a;
    }

    /* renamed from: f */
    public int mo33087f() {
        return this.f23763g;
    }

    /* renamed from: g */
    public int mo33088g() {
        return m42472m() - this.f23762f;
    }

    /* renamed from: h */
    public C9084k mo33089h() {
        return this.f23764h;
    }

    /* renamed from: i */
    public boolean mo33090i() {
        return this.f23762f < m42472m();
    }

    /* renamed from: j */
    public void mo33091j() {
        this.f23763g = -1;
    }

    /* renamed from: k */
    public void mo33092k() {
        this.f23764h = null;
    }

    /* renamed from: l */
    public void mo33093l() {
        mo33084c(mo33075a());
    }

    /* renamed from: a */
    public void mo33078a(C8975e eVar, C8975e eVar2) {
        this.f23759c = eVar;
        this.f23760d = eVar2;
    }

    /* renamed from: b */
    public void mo33082b(int i) {
        this.f23763g = i;
    }

    /* renamed from: c */
    public void mo33084c(int i) {
        C9084k kVar = this.f23764h;
        if (kVar == null || i > kVar.mo33095b()) {
            this.f23764h = C9084k.m42512a(i, this.f23758b, this.f23759c, this.f23760d, true);
        }
    }

    /* renamed from: a */
    public void mo33077a(int i) {
        this.f23765i = i;
    }

    /* renamed from: a */
    public void mo33080a(String str) {
        this.f23761e.append(str);
    }

    /* renamed from: a */
    public void mo33076a(char c) {
        this.f23761e.append(c);
    }

    /* renamed from: a */
    public int mo33075a() {
        return this.f23761e.length();
    }
}
