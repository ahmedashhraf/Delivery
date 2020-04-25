package com.fasterxml.jackson.core.p158s;

import com.fasterxml.jackson.core.p162w.C3854a;
import com.fasterxml.jackson.core.p162w.C3869j;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.s.k */
/* compiled from: SegmentedStringWriter */
public final class C3826k extends Writer {

    /* renamed from: a */
    protected final C3869j f12036a;

    public C3826k(C3854a aVar) {
        this.f12036a = new C3869j(aVar);
    }

    /* renamed from: a */
    public String mo16909a() {
        String d = this.f12036a.mo17123d();
        this.f12036a.mo17133n();
        return d;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(char[] cArr) {
        this.f12036a.mo17117a(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i, int i2) {
        this.f12036a.mo17117a(cArr, i, i2);
    }

    public void write(int i) {
        this.f12036a.mo17113a((char) i);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public void write(String str) {
        this.f12036a.mo17116a(str, 0, str.length());
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.f12036a.mo17116a(charSequence2, 0, charSequence2.length());
        return this;
    }

    public void write(String str, int i, int i2) {
        this.f12036a.mo17116a(str, i, i2);
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.f12036a.mo17116a(charSequence2, 0, charSequence2.length());
        return this;
    }
}
