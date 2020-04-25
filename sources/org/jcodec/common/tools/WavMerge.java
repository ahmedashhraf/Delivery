package org.jcodec.common.tools;

import java.io.File;

public class WavMerge {
    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 3) {
            System.out.println("wavmerge <output wav> <input wav> .... <input wav>");
            System.exit(-1);
        }
        File file = new File(strArr[0]);
        File[] fileArr = new File[(strArr.length - 1)];
        for (int i = 1; i < strArr.length; i++) {
            fileArr[i - 1] = new File(strArr[i]);
        }
        merge(file, fileArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r12 = java.nio.ByteBuffer.allocate(r1[0].getFormat().framesToBytes(4096) * r12.length);
        r5 = org.jcodec.codecs.wav.WavHeader.multiChannelWav(r1);
        r11 = org.jcodec.common.NIOUtils.writableFileChannel(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.write(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        r5 = 0;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r5 >= r2.length) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r0[r5] == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r2[r5].clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r0[r5].read(r2[r5]) != -1) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        org.jcodec.common.NIOUtils.closeQuietly(r0[r5]);
        r0[r5] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r2[r5].flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r6 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        org.jcodec.common.IOUtils.closeQuietly(r11);
        r11 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (r4 >= r11) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        org.jcodec.common.IOUtils.closeQuietly(r0[r4]);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r12.clear();
        org.jcodec.common.AudioUtil.interleave(r1[0].getFormat(), r2, r12);
        r12.flip();
        r11.write(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r7 = r11;
        r11 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void merge(java.io.File r11, java.io.File... r12) throws java.io.IOException {
        /*
            int r0 = r12.length
            java.nio.channels.ReadableByteChannel[] r0 = new java.nio.channels.ReadableByteChannel[r0]
            int r1 = r12.length
            org.jcodec.codecs.wav.WavHeader[] r1 = new org.jcodec.codecs.wav.WavHeader[r1]
            int r2 = r12.length
            java.nio.ByteBuffer[] r2 = new java.nio.ByteBuffer[r2]
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = -1
        L_0x000d:
            r7 = 0
            int r8 = r12.length     // Catch:{ all -> 0x00b6 }
            r9 = 4096(0x1000, float:5.74E-42)
            if (r5 >= r8) goto L_0x0049
            r8 = r12[r5]     // Catch:{ all -> 0x00b6 }
            org.jcodec.common.FileChannelWrapper r8 = org.jcodec.common.NIOUtils.readableFileChannel(r8)     // Catch:{ all -> 0x00b6 }
            r0[r5] = r8     // Catch:{ all -> 0x00b6 }
            r8 = r0[r5]     // Catch:{ all -> 0x00b6 }
            org.jcodec.codecs.wav.WavHeader r8 = org.jcodec.codecs.wav.WavHeader.read(r8)     // Catch:{ all -> 0x00b6 }
            if (r6 == r3) goto L_0x0032
            org.jcodec.codecs.wav.WavHeader$FmtChunk r10 = r8.fmt     // Catch:{ all -> 0x00b6 }
            short r10 = r10.bitsPerSample     // Catch:{ all -> 0x00b6 }
            if (r6 != r10) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b6 }
            java.lang.String r12 = "Input files have different sample sizes"
            r11.<init>(r12)     // Catch:{ all -> 0x00b6 }
            throw r11     // Catch:{ all -> 0x00b6 }
        L_0x0032:
            org.jcodec.codecs.wav.WavHeader$FmtChunk r6 = r8.fmt     // Catch:{ all -> 0x00b6 }
            short r6 = r6.bitsPerSample     // Catch:{ all -> 0x00b6 }
            r1[r5] = r8     // Catch:{ all -> 0x00b6 }
            org.jcodec.common.AudioFormat r8 = r8.getFormat()     // Catch:{ all -> 0x00b6 }
            int r8 = r8.framesToBytes(r9)     // Catch:{ all -> 0x00b6 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ all -> 0x00b6 }
            r2[r5] = r8     // Catch:{ all -> 0x00b6 }
            int r5 = r5 + 1
            goto L_0x000d
        L_0x0049:
            r5 = r1[r4]     // Catch:{ all -> 0x00b6 }
            org.jcodec.common.AudioFormat r5 = r5.getFormat()     // Catch:{ all -> 0x00b6 }
            int r5 = r5.framesToBytes(r9)     // Catch:{ all -> 0x00b6 }
            int r12 = r12.length     // Catch:{ all -> 0x00b6 }
            int r5 = r5 * r12
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r5)     // Catch:{ all -> 0x00b6 }
            org.jcodec.codecs.wav.WavHeader r5 = org.jcodec.codecs.wav.WavHeader.multiChannelWav(r1)     // Catch:{ all -> 0x00b6 }
            org.jcodec.common.FileChannelWrapper r11 = org.jcodec.common.NIOUtils.writableFileChannel(r11)     // Catch:{ all -> 0x00b6 }
            r5.write(r11)     // Catch:{ all -> 0x00b2 }
        L_0x0065:
            r5 = 0
            r6 = 0
        L_0x0067:
            int r8 = r2.length     // Catch:{ all -> 0x00b2 }
            if (r5 >= r8) goto L_0x008e
            r8 = r0[r5]     // Catch:{ all -> 0x00b2 }
            if (r8 == 0) goto L_0x008b
            r8 = r2[r5]     // Catch:{ all -> 0x00b2 }
            r8.clear()     // Catch:{ all -> 0x00b2 }
            r8 = r0[r5]     // Catch:{ all -> 0x00b2 }
            r9 = r2[r5]     // Catch:{ all -> 0x00b2 }
            int r8 = r8.read(r9)     // Catch:{ all -> 0x00b2 }
            if (r8 != r3) goto L_0x0085
            r8 = r0[r5]     // Catch:{ all -> 0x00b2 }
            org.jcodec.common.NIOUtils.closeQuietly(r8)     // Catch:{ all -> 0x00b2 }
            r0[r5] = r7     // Catch:{ all -> 0x00b2 }
            goto L_0x0086
        L_0x0085:
            r6 = 1
        L_0x0086:
            r8 = r2[r5]     // Catch:{ all -> 0x00b2 }
            r8.flip()     // Catch:{ all -> 0x00b2 }
        L_0x008b:
            int r5 = r5 + 1
            goto L_0x0067
        L_0x008e:
            if (r6 != 0) goto L_0x009f
            org.jcodec.common.IOUtils.closeQuietly(r11)
            int r11 = r0.length
        L_0x0094:
            if (r4 >= r11) goto L_0x009e
            r12 = r0[r4]
            org.jcodec.common.IOUtils.closeQuietly(r12)
            int r4 = r4 + 1
            goto L_0x0094
        L_0x009e:
            return
        L_0x009f:
            r12.clear()     // Catch:{ all -> 0x00b2 }
            r5 = r1[r4]     // Catch:{ all -> 0x00b2 }
            org.jcodec.common.AudioFormat r5 = r5.getFormat()     // Catch:{ all -> 0x00b2 }
            org.jcodec.common.AudioUtil.interleave(r5, r2, r12)     // Catch:{ all -> 0x00b2 }
            r12.flip()     // Catch:{ all -> 0x00b2 }
            r11.write(r12)     // Catch:{ all -> 0x00b2 }
            goto L_0x0065
        L_0x00b2:
            r12 = move-exception
            r7 = r11
            r11 = r12
            goto L_0x00b7
        L_0x00b6:
            r11 = move-exception
        L_0x00b7:
            org.jcodec.common.IOUtils.closeQuietly(r7)
            int r12 = r0.length
        L_0x00bb:
            if (r4 >= r12) goto L_0x00c5
            r1 = r0[r4]
            org.jcodec.common.IOUtils.closeQuietly(r1)
            int r4 = r4 + 1
            goto L_0x00bb
        L_0x00c5:
            goto L_0x00c7
        L_0x00c6:
            throw r11
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.common.tools.WavMerge.merge(java.io.File, java.io.File[]):void");
    }
}
