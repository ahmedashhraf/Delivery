package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.io.a0 */
/* compiled from: MultiInputStream */
final class C8345a0 extends InputStream {

    /* renamed from: a */
    private Iterator<? extends C8358f> f22242a;

    /* renamed from: b */
    private InputStream f22243b;

    public C8345a0(Iterator<? extends C8358f> it) throws IOException {
        this.f22242a = (Iterator) C7397x.m35664a(it);
        m39714a();
    }

    /* renamed from: a */
    private void m39714a() throws IOException {
        close();
        if (this.f22242a.hasNext()) {
            this.f22243b = ((C8358f) this.f22242a.next()).mo23252d();
        }
    }

    public int available() throws IOException {
        InputStream inputStream = this.f22243b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public void close() throws IOException {
        InputStream inputStream = this.f22243b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f22243b = null;
            }
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        InputStream inputStream = this.f22243b;
        if (inputStream == null) {
            return -1;
        }
        int read = inputStream.read();
        if (read == -1) {
            m39714a();
            read = read();
        }
        return read;
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f22243b;
        if (inputStream == null || j <= 0) {
            return 0;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0;
        }
        return this.f22243b.skip(j - 1) + 1;
    }

    public int read(@C5952h byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f22243b;
        if (inputStream == null) {
            return -1;
        }
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        m39714a();
        return read(bArr, i, i2);
    }
}
