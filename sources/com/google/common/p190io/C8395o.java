package com.google.common.p190io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.io.o */
/* compiled from: CountingOutputStream */
public final class C8395o extends FilterOutputStream {

    /* renamed from: a */
    private long f22295a;

    public C8395o(@C5952h OutputStream outputStream) {
        super(outputStream);
    }

    public void close() throws IOException {
        this.out.close();
    }

    public long getCount() {
        return this.f22295a;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f22295a += (long) i2;
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f22295a++;
    }
}
