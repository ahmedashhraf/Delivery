package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p546g0.C15322f;

/* renamed from: org.apache.http.f0.o.h */
/* compiled from: ContentLengthOutputStream */
public class C15306h extends OutputStream {

    /* renamed from: N */
    private long f44346N = 0;

    /* renamed from: O */
    private boolean f44347O = false;

    /* renamed from: a */
    private final C15322f f44348a;

    /* renamed from: b */
    private final long f44349b;

    public C15306h(C15322f fVar, long j) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (j >= 0) {
            this.f44348a = fVar;
            this.f44349b = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public void close() throws IOException {
        if (!this.f44347O) {
            this.f44347O = true;
            this.f44348a.flush();
        }
    }

    public void flush() throws IOException {
        this.f44348a.flush();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f44347O) {
            long j = this.f44346N;
            long j2 = this.f44349b;
            if (j < j2) {
                long j3 = j2 - j;
                if (((long) i2) > j3) {
                    i2 = (int) j3;
                }
                this.f44348a.write(bArr, i, i2);
                this.f44346N += (long) i2;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (this.f44347O) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f44346N < this.f44349b) {
            this.f44348a.write(i);
            this.f44346N++;
        }
    }
}
