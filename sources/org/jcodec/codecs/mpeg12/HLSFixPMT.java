package org.jcodec.codecs.mpeg12;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.jcodec.common.NIOUtils;
import org.jcodec.containers.mps.MTSUtils;

public class HLSFixPMT {

    /* renamed from: org.jcodec.codecs.mpeg12.HLSFixPMT$a */
    static class C15528a implements FilenameFilter {
        C15528a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".ts");
        }
    }

    private static void exit(String str) {
        System.err.println("Syntax: hls_fixpmt <hls package location>");
        System.err.println(str);
        System.exit(-1);
    }

    public static void fixPAT(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        MTSUtils.parseSection(byteBuffer);
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        while (byteBuffer.remaining() > 4) {
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            if (s != 0) {
                duplicate2.putShort(s);
                duplicate2.putShort(s2);
            }
        }
        if (duplicate2.position() != byteBuffer.position()) {
            ByteBuffer duplicate3 = duplicate.duplicate();
            duplicate3.get();
            duplicate3.putShort((short) ((((duplicate2.position() - duplicate.position()) + 1) & 4095) | 45056));
            CRC32 crc32 = new CRC32();
            duplicate.limit(duplicate2.position());
            crc32.update(NIOUtils.toArray(duplicate));
            duplicate2.putInt((int) crc32.getValue());
            while (duplicate2.hasRemaining()) {
                duplicate2.put(-1);
            }
        }
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 1) {
            exit("Please specify package location");
        }
        File file = new File(strArr[0]);
        if (!file.isDirectory()) {
            exit("Not an HLS package, expected a folder");
        }
        File[] listFiles = file.listFiles(new C15528a());
        HLSFixPMT hLSFixPMT = new HLSFixPMT();
        for (File file2 : listFiles) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("Processing: ");
            sb.append(file2.getName());
            printStream.println(sb.toString());
            hLSFixPMT.fix(file2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fix(java.io.File r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "rw"
            r1.<init>(r8, r2)     // Catch:{ all -> 0x0072 }
            r8 = 188(0xbc, float:2.63E-43)
            byte[] r0 = new byte[r8]     // Catch:{ all -> 0x0070 }
        L_0x000c:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x0070 }
            if (r2 != r8) goto L_0x006c
            r2 = 71
            r3 = 0
            byte r4 = r0[r3]     // Catch:{ all -> 0x0070 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            org.jcodec.common.Assert.assertEquals(r2, r4)     // Catch:{ all -> 0x0070 }
            r2 = 1
            byte r4 = r0[r2]     // Catch:{ all -> 0x0070 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r5 = 2
            byte r5 = r0[r5]     // Catch:{ all -> 0x0070 }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 >> 14
            r4 = r4 & r2
            r6 = 3
            byte r6 = r0[r6]     // Catch:{ all -> 0x0070 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 & 32
            if (r6 == 0) goto L_0x003d
            r3 = 4
            byte r3 = r0[r3]     // Catch:{ all -> 0x0070 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
        L_0x003d:
            if (r4 != r2) goto L_0x0047
            int r6 = r3 + 4
            byte r6 = r0[r6]     // Catch:{ all -> 0x0070 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r2
            int r3 = r3 + r6
        L_0x0047:
            if (r5 != 0) goto L_0x000c
            if (r4 == 0) goto L_0x0064
            int r2 = r3 + 4
            int r3 = 184 - r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r2, r3)     // Catch:{ all -> 0x0070 }
            fixPAT(r2)     // Catch:{ all -> 0x0070 }
            long r2 = r1.getFilePointer()     // Catch:{ all -> 0x0070 }
            r4 = 188(0xbc, double:9.3E-322)
            long r2 = r2 - r4
            r1.seek(r2)     // Catch:{ all -> 0x0070 }
            r1.write(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x000c
        L_0x0064:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "PAT spans multiple TS packets, not supported!!!!!!"
            r8.<init>(r0)     // Catch:{ all -> 0x0070 }
            throw r8     // Catch:{ all -> 0x0070 }
        L_0x006c:
            r1.close()
            return
        L_0x0070:
            r8 = move-exception
            goto L_0x0074
        L_0x0072:
            r8 = move-exception
            r1 = r0
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r1.close()
        L_0x0079:
            goto L_0x007b
        L_0x007a:
            throw r8
        L_0x007b:
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.mpeg12.HLSFixPMT.fix(java.io.File):void");
    }
}
