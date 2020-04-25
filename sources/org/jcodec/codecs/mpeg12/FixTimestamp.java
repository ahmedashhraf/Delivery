package org.jcodec.codecs.mpeg12;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

public abstract class FixTimestamp {
    /* access modifiers changed from: protected */
    public abstract long doWithTimestamp(int i, long j, boolean z);

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fix(java.io.File r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "rw"
            r1.<init>(r9, r2)     // Catch:{ all -> 0x00af }
            r9 = 188(0xbc, float:2.63E-43)
            byte[] r0 = new byte[r9]     // Catch:{ all -> 0x00ad }
        L_0x000c:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x00ad }
            if (r2 != r9) goto L_0x00a9
            r2 = 71
            r3 = 0
            byte r3 = r0[r3]     // Catch:{ all -> 0x00ad }
            r3 = r3 & 255(0xff, float:3.57E-43)
            org.jcodec.common.Assert.assertEquals(r2, r3)     // Catch:{ all -> 0x00ad }
            r2 = 1
            byte r3 = r0[r2]     // Catch:{ all -> 0x00ad }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r4 = 2
            byte r4 = r0[r4]     // Catch:{ all -> 0x00ad }
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r4 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 >> 14
            r3 = r3 & r2
            if (r3 == 0) goto L_0x000c
            if (r4 != 0) goto L_0x0033
            goto L_0x000c
        L_0x0033:
            r3 = 4
            r4 = 184(0xb8, float:2.58E-43)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r0, r3, r4)     // Catch:{ all -> 0x00ad }
            r4 = 3
            byte r4 = r0[r4]     // Catch:{ all -> 0x00ad }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x004a
            byte r4 = r3.get()     // Catch:{ all -> 0x00ad }
            r4 = r4 & 255(0xff, float:3.57E-43)
            org.jcodec.common.NIOUtils.skip(r3, r4)     // Catch:{ all -> 0x00ad }
        L_0x004a:
            int r4 = r3.remaining()     // Catch:{ all -> 0x00ad }
            r5 = 10
            if (r4 >= r5) goto L_0x0053
            goto L_0x000c
        L_0x0053:
            int r4 = r3.getInt()     // Catch:{ all -> 0x00ad }
            int r5 = r4 >> 8
            if (r5 == r2) goto L_0x005c
            goto L_0x000c
        L_0x005c:
            boolean r5 = r3.hasRemaining()     // Catch:{ all -> 0x00ad }
            r6 = 495(0x1ef, float:6.94E-43)
            r7 = 447(0x1bf, float:6.26E-43)
            if (r5 == 0) goto L_0x0074
            if (r4 < r7) goto L_0x006a
            if (r4 < r6) goto L_0x0074
        L_0x006a:
            int r4 = r4 << 8
            byte r5 = r3.get()     // Catch:{ all -> 0x00ad }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            goto L_0x005c
        L_0x0074:
            if (r4 < r7) goto L_0x000c
            if (r4 >= r6) goto L_0x000c
            r3.getShort()     // Catch:{ all -> 0x00ad }
            byte r5 = r3.get()     // Catch:{ all -> 0x00ad }
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r3.position()     // Catch:{ all -> 0x00ad }
            int r6 = r6 - r2
            r3.position(r6)     // Catch:{ all -> 0x00ad }
            r2 = r5 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r2 != r5) goto L_0x0095
            r2 = r4 & 255(0xff, float:3.57E-43)
            r8.fixMpeg2(r2, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x009a
        L_0x0095:
            r2 = r4 & 255(0xff, float:3.57E-43)
            r8.fixMpeg1(r2, r3)     // Catch:{ all -> 0x00ad }
        L_0x009a:
            long r2 = r1.getFilePointer()     // Catch:{ all -> 0x00ad }
            r4 = 188(0xbc, double:9.3E-322)
            long r2 = r2 - r4
            r1.seek(r2)     // Catch:{ all -> 0x00ad }
            r1.write(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x000c
        L_0x00a9:
            r1.close()
            return
        L_0x00ad:
            r9 = move-exception
            goto L_0x00b1
        L_0x00af:
            r9 = move-exception
            r1 = r0
        L_0x00b1:
            if (r1 == 0) goto L_0x00b6
            r1.close()
        L_0x00b6:
            goto L_0x00b8
        L_0x00b7:
            throw r9
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.mpeg12.FixTimestamp.fix(java.io.File):void");
    }

    public void fixMpeg1(int i, ByteBuffer byteBuffer) {
        byte b;
        int i2 = byteBuffer.getInt();
        while (true) {
            b = i2 & 255;
            if (b != 255) {
                break;
            }
            i2 = byteBuffer.get();
        }
        if ((b & 192) == 64) {
            byteBuffer.get();
            b = byteBuffer.get() & 255;
        }
        byte b2 = b & 240;
        if (b2 == 32) {
            byteBuffer.position(byteBuffer.position() - 1);
            fixTs(i, byteBuffer, true);
        } else if (b2 == 48) {
            byteBuffer.position(byteBuffer.position() - 1);
            fixTs(i, byteBuffer, true);
            fixTs(i, byteBuffer, false);
        } else if (b != 15) {
            throw new RuntimeException("Invalid data");
        }
    }

    public void fixMpeg2(int i, ByteBuffer byteBuffer) {
        byteBuffer.get();
        byte b = byteBuffer.get() & 255;
        byteBuffer.get();
        byte b2 = b & 192;
        if (b2 == 128) {
            fixTs(i, byteBuffer, true);
        } else if (b2 == 192) {
            fixTs(i, byteBuffer, true);
            fixTs(i, byteBuffer, false);
        }
    }

    public long fixTs(int i, ByteBuffer byteBuffer, boolean z) {
        byte b = byteBuffer.get();
        long doWithTimestamp = doWithTimestamp(i, ((((long) b) & 14) << 29) | ((long) ((byteBuffer.get() & 255) << C5785c.f16707z)) | ((long) (((byteBuffer.get() & 255) >> 1) << 15)) | ((long) ((byteBuffer.get() & 255) << 7)) | ((long) ((byteBuffer.get() & 255) >> 1)), z);
        byteBuffer.position(byteBuffer.position() - 5);
        byteBuffer.put((byte) ((int) (((long) (b & 240)) | (doWithTimestamp >>> 29) | 1)));
        byteBuffer.put((byte) ((int) (doWithTimestamp >>> 22)));
        byteBuffer.put((byte) ((int) ((doWithTimestamp >>> 14) | 1)));
        byteBuffer.put((byte) ((int) (doWithTimestamp >>> 7)));
        byteBuffer.put((byte) ((int) ((doWithTimestamp << 1) | 1)));
        return doWithTimestamp;
    }

    public boolean isAudio(int i) {
        return i >= 191 && i <= 223;
    }

    public boolean isVideo(int i) {
        return i >= 224 && i <= 239;
    }
}
