package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: Q */
    private static final String f10487Q = "BufferedIs";

    /* renamed from: N */
    private int f10488N;

    /* renamed from: O */
    private int f10489O = -1;

    /* renamed from: P */
    private int f10490P;

    /* renamed from: a */
    private volatile byte[] f10491a;

    /* renamed from: b */
    private int f10492b;

    public static class InvalidMarkException extends RuntimeException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f10491a = bArr;
    }

    /* renamed from: d */
    private static IOException m14183d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo11750a() {
        this.f10488N = this.f10491a.length;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f10491a == null || inputStream == null) {
            throw m14183d();
        }
        return (this.f10492b - this.f10490P) + inputStream.available();
    }

    public void close() throws IOException {
        this.f10491a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f10488N = Math.max(this.f10488N, i);
        this.f10489O = this.f10490P;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x003b=Splitter:B:27:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f10491a     // Catch:{ all -> 0x0040 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r2 = r5.f10490P     // Catch:{ all -> 0x0040 }
            int r3 = r5.f10492b     // Catch:{ all -> 0x0040 }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m14182a(r1, r0)     // Catch:{ all -> 0x0040 }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f10491a     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f10491a     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m14183d()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0026:
            int r1 = r5.f10492b     // Catch:{ all -> 0x0040 }
            int r2 = r5.f10490P     // Catch:{ all -> 0x0040 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r5.f10490P     // Catch:{ all -> 0x0040 }
            int r2 = r1 + 1
            r5.f10490P = r2     // Catch:{ all -> 0x0040 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0040 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0039:
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.io.IOException r0 = m14183d()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f10491a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f10489O) {
            this.f10490P = this.f10489O;
        } else {
            throw new InvalidMarkException("Mark has been invalidated");
        }
    }

    public synchronized long skip(long j) throws IOException {
        byte[] bArr = this.f10491a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw m14183d();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw m14183d();
            } else if (((long) (this.f10492b - this.f10490P)) >= j) {
                this.f10490P = (int) (((long) this.f10490P) + j);
                return j;
            } else {
                long j2 = (long) (this.f10492b - this.f10490P);
                this.f10490P = this.f10492b;
                if (this.f10489O == -1 || j > ((long) this.f10488N)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m14182a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f10492b - this.f10490P)) >= j3) {
                        this.f10490P = (int) (((long) this.f10490P) + j3);
                        return j;
                    }
                    long j4 = (j2 + ((long) this.f10492b)) - ((long) this.f10490P);
                    this.f10490P = this.f10492b;
                    return j4;
                }
            }
        }
    }

    /* renamed from: a */
    private int m14182a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f10489O;
        if (i != -1) {
            int i2 = this.f10490P - i;
            int i3 = this.f10488N;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f10492b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > i3) {
                        length = i3;
                    }
                    if (Log.isLoggable(f10487Q, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("allocate buffer of length: ");
                        sb.append(length);
                        sb.toString();
                    }
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10491a = bArr2;
                    bArr = bArr2;
                } else {
                    int i4 = this.f10489O;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                this.f10490P -= this.f10489O;
                this.f10489O = 0;
                this.f10492b = 0;
                int i5 = this.f10490P;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f10490P;
                if (read > 0) {
                    i6 += read;
                }
                this.f10492b = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f10489O = -1;
            this.f10490P = 0;
            this.f10492b = read2;
        }
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f10491a     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0099
            if (r8 != 0) goto L_0x000a
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x000a:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0094
            int r2 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r3 = r5.f10492b     // Catch:{ all -> 0x009e }
            if (r2 >= r3) goto L_0x003b
            int r2 = r5.f10492b     // Catch:{ all -> 0x009e }
            int r3 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r2 = r2 - r3
            if (r2 < r8) goto L_0x001d
            r2 = r8
            goto L_0x0022
        L_0x001d:
            int r2 = r5.f10492b     // Catch:{ all -> 0x009e }
            int r3 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r2 = r2 - r3
        L_0x0022:
            int r3 = r5.f10490P     // Catch:{ all -> 0x009e }
            java.lang.System.arraycopy(r0, r3, r6, r7, r2)     // Catch:{ all -> 0x009e }
            int r3 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r3 = r3 + r2
            r5.f10490P = r3     // Catch:{ all -> 0x009e }
            if (r2 == r8) goto L_0x0039
            int r3 = r1.available()     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r7 = r7 + r2
            int r2 = r8 - r2
            goto L_0x003c
        L_0x0039:
            monitor-exit(r5)
            return r2
        L_0x003b:
            r2 = r8
        L_0x003c:
            int r3 = r5.f10489O     // Catch:{ all -> 0x009e }
            r4 = -1
            if (r3 != r4) goto L_0x0051
            int r3 = r0.length     // Catch:{ all -> 0x009e }
            if (r2 < r3) goto L_0x0051
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x009e }
            if (r3 != r4) goto L_0x0084
            if (r2 != r8) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            int r4 = r8 - r2
        L_0x004f:
            monitor-exit(r5)
            return r4
        L_0x0051:
            int r3 = r5.m14182a(r1, r0)     // Catch:{ all -> 0x009e }
            if (r3 != r4) goto L_0x005e
            if (r2 != r8) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            int r4 = r8 - r2
        L_0x005c:
            monitor-exit(r5)
            return r4
        L_0x005e:
            byte[] r3 = r5.f10491a     // Catch:{ all -> 0x009e }
            if (r0 == r3) goto L_0x006c
            byte[] r0 = r5.f10491a     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            java.io.IOException r6 = m14183d()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x006c:
            int r3 = r5.f10492b     // Catch:{ all -> 0x009e }
            int r4 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0075
            r3 = r2
            goto L_0x007a
        L_0x0075:
            int r3 = r5.f10492b     // Catch:{ all -> 0x009e }
            int r4 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r3 = r3 - r4
        L_0x007a:
            int r4 = r5.f10490P     // Catch:{ all -> 0x009e }
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x009e }
            int r4 = r5.f10490P     // Catch:{ all -> 0x009e }
            int r4 = r4 + r3
            r5.f10490P = r4     // Catch:{ all -> 0x009e }
        L_0x0084:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x0089
            monitor-exit(r5)
            return r8
        L_0x0089:
            int r4 = r1.available()     // Catch:{ all -> 0x009e }
            if (r4 != 0) goto L_0x0092
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0092:
            int r7 = r7 + r3
            goto L_0x003c
        L_0x0094:
            java.io.IOException r6 = m14183d()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x0099:
            java.io.IOException r6 = m14183d()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00a2
        L_0x00a1:
            throw r6
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }
}
