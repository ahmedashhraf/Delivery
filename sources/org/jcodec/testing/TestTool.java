package org.jcodec.testing;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import org.jcodec.common.IOUtils;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.Picture;

public class TestTool {
    private File coded = File.createTempFile("seq", ".264");
    private File decoded = File.createTempFile("seq_dec", ".yuv");
    private File errs;

    /* renamed from: jm */
    private String f44970jm;
    private File jmconf = File.createTempFile("ldecod", ".conf");

    public TestTool(String str, String str2) throws IOException {
        this.f44970jm = str;
        this.errs = new File(str2);
        prepareJMConf();
    }

    private void diff(int i) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(": DIFF!!!");
        printStream.println(sb.toString());
        this.coded.renameTo(new File(this.errs, String.format("seq%08d.264", new Object[]{Integer.valueOf(i)})));
        this.decoded.renameTo(new File(this.errs, String.format("seq%08d_dec.yuv", new Object[]{Integer.valueOf(i)})));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doIt(java.lang.String r15) throws java.lang.Exception {
        /*
            r14 = this;
            r0 = 0
            org.jcodec.common.FileChannelWrapper r1 = new org.jcodec.common.FileChannelWrapper     // Catch:{ all -> 0x0112 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0112 }
            r2.<init>(r15)     // Catch:{ all -> 0x0112 }
            java.nio.channels.FileChannel r15 = r2.getChannel()     // Catch:{ all -> 0x0112 }
            r1.<init>(r15)     // Catch:{ all -> 0x0112 }
            org.jcodec.containers.mp4.demuxer.MP4Demuxer r15 = new org.jcodec.containers.mp4.demuxer.MP4Demuxer     // Catch:{ all -> 0x0110 }
            r15.<init>(r1)     // Catch:{ all -> 0x0110 }
            org.jcodec.codecs.h264.H264Decoder r2 = new org.jcodec.codecs.h264.H264Decoder     // Catch:{ all -> 0x0110 }
            r2.<init>()     // Catch:{ all -> 0x0110 }
            org.jcodec.containers.mp4.demuxer.AbstractMP4DemuxerTrack r15 = r15.getVideoTrack()     // Catch:{ all -> 0x0110 }
            org.jcodec.containers.mp4.boxes.SampleEntry[] r3 = r15.getSampleEntries()     // Catch:{ all -> 0x0110 }
            r4 = 0
            r3 = r3[r4]     // Catch:{ all -> 0x0110 }
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r3 = (org.jcodec.containers.mp4.boxes.VideoSampleEntry) r3     // Catch:{ all -> 0x0110 }
            java.lang.Class<org.jcodec.codecs.h264.mp4.AvcCBox> r5 = org.jcodec.codecs.h264.mp4.AvcCBox.class
            java.lang.Class<org.jcodec.containers.mp4.boxes.LeafBox> r6 = org.jcodec.containers.mp4.boxes.LeafBox.class
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0110 }
            java.lang.String r8 = "avcC"
            r7[r4] = r8     // Catch:{ all -> 0x0110 }
            java.lang.Object r6 = org.jcodec.containers.mp4.boxes.Box.findFirst(r3, r6, r7)     // Catch:{ all -> 0x0110 }
            org.jcodec.containers.mp4.boxes.LeafBox r6 = (org.jcodec.containers.mp4.boxes.LeafBox) r6     // Catch:{ all -> 0x0110 }
            org.jcodec.containers.mp4.boxes.Box r5 = org.jcodec.containers.mp4.boxes.Box.m68668as(r5, r6)     // Catch:{ all -> 0x0110 }
            org.jcodec.codecs.h264.mp4.AvcCBox r5 = (org.jcodec.codecs.h264.mp4.AvcCBox) r5     // Catch:{ all -> 0x0110 }
            r6 = 12533760(0xbf4000, float:1.7563539E-38)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x0110 }
            java.util.List r7 = r5.getSpsList()     // Catch:{ all -> 0x0110 }
            r2.addSps(r7)     // Catch:{ all -> 0x0110 }
            java.util.List r7 = r5.getPpsList()     // Catch:{ all -> 0x0110 }
            r2.addPps(r7)     // Catch:{ all -> 0x0110 }
            r7 = 2600(0xa28, float:3.643E-42)
            long r8 = (long) r7     // Catch:{ all -> 0x0110 }
            r15.gotoFrame(r8)     // Catch:{ all -> 0x0110 }
        L_0x0058:
            org.jcodec.common.model.Packet r8 = r15.nextFrame()     // Catch:{ all -> 0x0110 }
            if (r8 == 0) goto L_0x0065
            boolean r9 = r8.isKeyFrame()     // Catch:{ all -> 0x0110 }
            if (r9 != 0) goto L_0x0065
            goto L_0x0058
        L_0x0065:
            long r8 = r8.getFrameNo()     // Catch:{ all -> 0x0110 }
            r15.gotoFrame(r8)     // Catch:{ all -> 0x0110 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0110 }
            r8.<init>()     // Catch:{ all -> 0x0110 }
            long r9 = r15.getFrameCount()     // Catch:{ all -> 0x0110 }
            int r10 = (int) r9     // Catch:{ all -> 0x0110 }
        L_0x0076:
            org.jcodec.common.model.Packet r9 = r15.nextFrame()     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00fe
            java.nio.ByteBuffer r9 = r9.getData()     // Catch:{ all -> 0x0110 }
            java.util.List r9 = org.jcodec.codecs.h264.H264Utils.splitMOVPacket(r9, r5)     // Catch:{ all -> 0x0110 }
            r6.clear()     // Catch:{ all -> 0x0110 }
            org.jcodec.codecs.h264.H264Utils.joinNALUnits(r9, r6)     // Catch:{ all -> 0x0110 }
            r6.flip()     // Catch:{ all -> 0x0110 }
            boolean r11 = org.jcodec.codecs.h264.H264Utils.idrSlice(r6)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00a1
            r0.close()     // Catch:{ all -> 0x0110 }
            r14.runJMCompareResults(r8, r4)     // Catch:{ all -> 0x0110 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0110 }
            r8.<init>()     // Catch:{ all -> 0x0110 }
            r4 = r7
        L_0x00a1:
            org.jcodec.common.FileChannelWrapper r11 = new org.jcodec.common.FileChannelWrapper     // Catch:{ all -> 0x0110 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ all -> 0x0110 }
            java.io.File r13 = r14.coded     // Catch:{ all -> 0x0110 }
            r12.<init>(r13)     // Catch:{ all -> 0x0110 }
            java.nio.channels.FileChannel r12 = r12.getChannel()     // Catch:{ all -> 0x0110 }
            r11.<init>(r12)     // Catch:{ all -> 0x0110 }
            org.jcodec.codecs.h264.H264Utils.saveStreamParams(r5, r11)     // Catch:{ all -> 0x00b6 }
            r0 = r11
            goto L_0x00b9
        L_0x00b6:
            r15 = move-exception
            r0 = r11
            goto L_0x0114
        L_0x00b9:
            r0.write(r6)     // Catch:{ all -> 0x0110 }
            int r11 = r3.getWidth()     // Catch:{ all -> 0x0110 }
            int r11 = r11 + 15
            r11 = r11 & -16
            int r12 = r3.getHeight()     // Catch:{ all -> 0x0110 }
            int r12 = r12 + 15
            r12 = r12 & -16
            org.jcodec.common.model.ColorSpace r13 = org.jcodec.common.model.ColorSpace.YUV420     // Catch:{ all -> 0x0110 }
            org.jcodec.common.model.Picture r11 = org.jcodec.common.model.Picture.create(r11, r12, r13)     // Catch:{ all -> 0x0110 }
            int[][] r11 = r11.getData()     // Catch:{ all -> 0x0110 }
            org.jcodec.codecs.h264.io.model.Frame r9 = r2.decodeFrame(r9, r11)     // Catch:{ all -> 0x0110 }
            r8.add(r9)     // Catch:{ all -> 0x0110 }
            int r9 = r7 % 500
            if (r9 != 0) goto L_0x00fa
            java.io.PrintStream r9 = java.lang.System.out     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            int r12 = r7 * 100
            int r12 = r12 / r10
            r11.append(r12)     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = "%"
            r11.append(r12)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r9.println(r11)     // Catch:{ all -> 0x0110 }
        L_0x00fa:
            int r7 = r7 + 1
            goto L_0x0076
        L_0x00fe:
            int r15 = r8.size()     // Catch:{ all -> 0x0110 }
            if (r15 <= 0) goto L_0x0107
            r14.runJMCompareResults(r8, r4)     // Catch:{ all -> 0x0110 }
        L_0x0107:
            r1.close()
            if (r0 == 0) goto L_0x010f
            r0.close()
        L_0x010f:
            return
        L_0x0110:
            r15 = move-exception
            goto L_0x0114
        L_0x0112:
            r15 = move-exception
            r1 = r0
        L_0x0114:
            if (r1 == 0) goto L_0x0119
            r1.close()
        L_0x0119:
            if (r0 == 0) goto L_0x011e
            r0.close()
        L_0x011e:
            goto L_0x0120
        L_0x011f:
            throw r15
        L_0x0120:
            goto L_0x011f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.testing.TestTool.doIt(java.lang.String):void");
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length != 3) {
            System.out.println("JCodec h.264 test tool");
            System.out.println("Syntax: <path to ldecod> <movie file> <foder for errors>");
            return;
        }
        new TestTool(strArr[0], strArr[2]).doIt(strArr[1]);
    }

    private void prepareJMConf() throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = getClass().getClassLoader().getResourceAsStream("org/jcodec/testing/jm.conf");
            IOUtils.writeStringToFile(this.jmconf, IOUtils.toString(inputStream).replace("%input_file%", this.coded.getAbsolutePath()).replace("%output_file%", this.decoded.getAbsolutePath()));
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    private void runJMCompareResults(List<Picture> list, int i) throws Exception {
        boolean equals;
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44970jm);
            sb.append(" -d ");
            sb.append(this.jmconf.getAbsolutePath());
            runtime.exec(sb.toString()).waitFor();
            ByteBuffer fetchFrom = NIOUtils.fetchFrom(this.decoded);
            for (Picture cropped : list) {
                Picture cropped2 = cropped.cropped();
                if (!Arrays.equals(JCodecUtil.getAsIntArray(fetchFrom, cropped2.getPlaneWidth(2) * cropped2.getPlaneHeight(2)), cropped2.getPlaneData(2)) || !(Arrays.equals(JCodecUtil.getAsIntArray(fetchFrom, cropped2.getPlaneWidth(0) * cropped2.getPlaneHeight(0)), cropped2.getPlaneData(0)) & Arrays.equals(JCodecUtil.getAsIntArray(fetchFrom, cropped2.getPlaneWidth(1) * cropped2.getPlaneHeight(1)), cropped2.getPlaneData(1)))) {
                    diff(i);
                }
            }
        } catch (Exception unused) {
            diff(i);
        }
    }
}
