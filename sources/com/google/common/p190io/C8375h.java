package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: com.google.common.io.h */
/* compiled from: CharSequenceReader */
final class C8375h extends Reader {

    /* renamed from: N */
    private int f22270N;

    /* renamed from: a */
    private CharSequence f22271a;

    /* renamed from: b */
    private int f22272b;

    public C8375h(CharSequence charSequence) {
        this.f22271a = (CharSequence) C7397x.m35664a(charSequence);
    }

    /* renamed from: a */
    private void m39825a() throws IOException {
        if (this.f22271a == null) {
            throw new IOException("reader closed");
        }
    }

    /* renamed from: d */
    private boolean m39826d() {
        return m39827e() > 0;
    }

    /* renamed from: e */
    private int m39827e() {
        return this.f22271a.length() - this.f22272b;
    }

    public synchronized void close() throws IOException {
        this.f22271a = null;
    }

    public synchronized void mark(int i) throws IOException {
        C7397x.m35672a(i >= 0, "readAheadLimit (%s) may not be negative", Integer.valueOf(i));
        m39825a();
        this.f22270N = this.f22272b;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized int read(CharBuffer charBuffer) throws IOException {
        C7397x.m35664a(charBuffer);
        m39825a();
        if (!m39826d()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), m39827e());
        for (int i = 0; i < min; i++) {
            CharSequence charSequence = this.f22271a;
            int i2 = this.f22272b;
            this.f22272b = i2 + 1;
            charBuffer.put(charSequence.charAt(i2));
        }
        return min;
    }

    public synchronized boolean ready() throws IOException {
        m39825a();
        return true;
    }

    public synchronized void reset() throws IOException {
        m39825a();
        this.f22272b = this.f22270N;
    }

    public synchronized long skip(long j) throws IOException {
        int min;
        C7397x.m35672a(j >= 0, "n (%s) may not be negative", Long.valueOf(j));
        m39825a();
        min = (int) Math.min((long) m39827e(), j);
        this.f22272b += min;
        return (long) min;
    }

    public synchronized int read() throws IOException {
        char c;
        m39825a();
        if (m39826d()) {
            CharSequence charSequence = this.f22271a;
            int i = this.f22272b;
            this.f22272b = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    public synchronized int read(char[] cArr, int i, int i2) throws IOException {
        C7397x.m35675b(i, i + i2, cArr.length);
        m39825a();
        if (!m39826d()) {
            return -1;
        }
        int min = Math.min(i2, m39827e());
        for (int i3 = 0; i3 < min; i3++) {
            int i4 = i + i3;
            CharSequence charSequence = this.f22271a;
            int i5 = this.f22272b;
            this.f22272b = i5 + 1;
            cArr[i4] = charSequence.charAt(i5);
        }
        return min;
    }
}
