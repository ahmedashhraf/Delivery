package org.apache.http.p541f0.p545o;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p546g0.C15321e;

/* renamed from: org.apache.http.f0.o.g */
/* compiled from: ContentLengthInputStream */
public class C15305g extends InputStream {

    /* renamed from: P */
    private static final int f44341P = 2048;

    /* renamed from: N */
    private boolean f44342N = false;

    /* renamed from: O */
    private C15321e f44343O = null;

    /* renamed from: a */
    private long f44344a;

    /* renamed from: b */
    private long f44345b = 0;

    public C15305g(C15321e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (j >= 0) {
            this.f44343O = eVar;
            this.f44344a = j;
        } else {
            throw new IllegalArgumentException("Content length may not be negative");
        }
    }

    public void close() throws IOException {
        if (!this.f44342N) {
            try {
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.f44342N = true;
            }
        }
    }

    public int read() throws IOException {
        if (!this.f44342N) {
            long j = this.f44345b;
            if (j >= this.f44344a) {
                return -1;
            }
            this.f44345b = j + 1;
            return this.f44343O.read();
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f44344a - this.f44345b);
        long j2 = 0;
        while (min > 0) {
            int read = read(bArr, 0, (int) Math.min(PlaybackStateCompat.f474i0, min));
            if (read == -1) {
                break;
            }
            long j3 = (long) read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f44342N) {
            long j = this.f44345b;
            long j2 = this.f44344a;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.f44343O.read(bArr, i, i2);
            this.f44345b += (long) read;
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
