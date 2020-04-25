package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class Cut {

    public static class Slice {
        /* access modifiers changed from: private */
        public double inSec;
        /* access modifiers changed from: private */
        public double outSec;

        public Slice(double d, double d2) {
            this.inSec = d;
            this.outSec = d2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140 A[LOOP:2: B:40:0x013a->B:42:0x0140, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void main(java.lang.String[] r13) throws java.lang.Exception {
        /*
            int r0 = r13.length
            r1 = 1
            if (r0 >= r1) goto L_0x000f
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "Syntax: cut [-command arg]...[-command arg] [-self] <movie file>\n\tCreates a reference movie out of the file and applies a set of changes specified by the commands to it."
            r0.println(r2)
            r0 = -1
            java.lang.System.exit(r0)
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x001c:
            r6 = r13[r4]
            java.lang.String r7 = "-cut"
            boolean r6 = r7.equals(r6)
            r7 = 0
            if (r6 == 0) goto L_0x0057
            int r6 = r4 + 1
            r6 = r13[r6]
            java.lang.String r8 = ":"
            java.lang.String[] r6 = org.jcodec.common.StringUtils.split(r6, r8)
            org.jcodec.movtool.Cut$Slice r8 = new org.jcodec.movtool.Cut$Slice
            r9 = r6[r3]
            int r9 = java.lang.Integer.parseInt(r9)
            double r9 = (double) r9
            r11 = r6[r1]
            int r11 = java.lang.Integer.parseInt(r11)
            double r11 = (double) r11
            r8.<init>(r9, r11)
            r0.add(r8)
            int r8 = r6.length
            r9 = 2
            if (r8 <= r9) goto L_0x0051
            r6 = r6[r9]
            r2.add(r6)
            goto L_0x0054
        L_0x0051:
            r2.add(r7)
        L_0x0054:
            int r4 = r4 + 2
            goto L_0x001c
        L_0x0057:
            r6 = r13[r4]
            java.lang.String r8 = "-self"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0065
            int r4 = r4 + 1
            r5 = 1
            goto L_0x001c
        L_0x0065:
            java.io.File r1 = new java.io.File
            r13 = r13[r4]
            r1.<init>(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            org.jcodec.common.FileChannelWrapper r3 = org.jcodec.common.NIOUtils.readableFileChannel(r1)     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r4.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = "file://"
            r4.append(r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = r1.getCanonicalPath()     // Catch:{ all -> 0x0128 }
            r4.append(r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0128 }
            org.jcodec.containers.mp4.boxes.MovieBox r4 = org.jcodec.containers.mp4.MP4Util.createRefMovie(r3, r4)     // Catch:{ all -> 0x0128 }
            if (r5 != 0) goto L_0x00c3
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0128 }
            java.io.File r6 = r1.getParentFile()     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r8.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = r1.getName()     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = org.jcodec.common.JCodecUtil.removeExtension(r9)     // Catch:{ all -> 0x0128 }
            r8.append(r9)     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = ".ref.mov"
            r8.append(r9)     // Catch:{ all -> 0x0128 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0128 }
            r5.<init>(r6, r8)     // Catch:{ all -> 0x0128 }
            org.jcodec.common.FileChannelWrapper r7 = org.jcodec.common.NIOUtils.writableFileChannel(r5)     // Catch:{ all -> 0x0128 }
            org.jcodec.movtool.Cut r5 = new org.jcodec.movtool.Cut     // Catch:{ all -> 0x0128 }
            r5.<init>()     // Catch:{ all -> 0x0128 }
            java.util.List r0 = r5.cut(r4, r0)     // Catch:{ all -> 0x0128 }
            org.jcodec.containers.mp4.MP4Util.writeMovie(r7, r4)     // Catch:{ all -> 0x0128 }
            goto L_0x0102
        L_0x00c3:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0128 }
            java.io.File r6 = r1.getParentFile()     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r8.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = r1.getName()     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = org.jcodec.common.JCodecUtil.removeExtension(r9)     // Catch:{ all -> 0x0128 }
            r8.append(r9)     // Catch:{ all -> 0x0128 }
            java.lang.String r9 = ".self.mov"
            r8.append(r9)     // Catch:{ all -> 0x0128 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0128 }
            r5.<init>(r6, r8)     // Catch:{ all -> 0x0128 }
            org.jcodec.common.FileChannelWrapper r7 = org.jcodec.common.NIOUtils.writableFileChannel(r5)     // Catch:{ all -> 0x0128 }
            org.jcodec.movtool.Cut r5 = new org.jcodec.movtool.Cut     // Catch:{ all -> 0x0128 }
            r5.<init>()     // Catch:{ all -> 0x0128 }
            java.util.List r0 = r5.cut(r4, r0)     // Catch:{ all -> 0x0128 }
            org.jcodec.movtool.Strip r5 = new org.jcodec.movtool.Strip     // Catch:{ all -> 0x0128 }
            r5.<init>()     // Catch:{ all -> 0x0128 }
            r5.strip(r4)     // Catch:{ all -> 0x0128 }
            org.jcodec.movtool.Flattern r5 = new org.jcodec.movtool.Flattern     // Catch:{ all -> 0x0128 }
            r5.<init>()     // Catch:{ all -> 0x0128 }
            r5.flattern(r4, r7)     // Catch:{ all -> 0x0128 }
        L_0x0102:
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0128 }
            saveSlices(r0, r2, r1)     // Catch:{ all -> 0x0128 }
            if (r3 == 0) goto L_0x010e
            r3.close()
        L_0x010e:
            if (r7 == 0) goto L_0x0113
            r7.close()
        L_0x0113:
            java.util.Iterator r13 = r13.iterator()
        L_0x0117:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r13.next()
            org.jcodec.common.SeekableByteChannel r0 = (org.jcodec.common.SeekableByteChannel) r0
            r0.close()
            goto L_0x0117
        L_0x0127:
            return
        L_0x0128:
            r0 = move-exception
            goto L_0x012c
        L_0x012a:
            r0 = move-exception
            r3 = r7
        L_0x012c:
            if (r3 == 0) goto L_0x0131
            r3.close()
        L_0x0131:
            if (r7 == 0) goto L_0x0136
            r7.close()
        L_0x0136:
            java.util.Iterator r13 = r13.iterator()
        L_0x013a:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r13.next()
            org.jcodec.common.SeekableByteChannel r1 = (org.jcodec.common.SeekableByteChannel) r1
            r1.close()
            goto L_0x013a
        L_0x014a:
            goto L_0x014c
        L_0x014b:
            throw r0
        L_0x014c:
            goto L_0x014b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Cut.main(java.lang.String[]):void");
    }

    private static void saveSlices(List<MovieBox> list, List<String> list2, File file) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i) != null) {
                FileChannelWrapper fileChannelWrapper = null;
                try {
                    fileChannelWrapper = NIOUtils.writableFileChannel(new File(file, (String) list2.get(i)));
                    MP4Util.writeMovie((SeekableByteChannel) fileChannelWrapper, (MovieBox) list.get(i));
                } finally {
                    NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                }
            }
        }
    }

    private void selectInner(List<Edit> list, Slice slice, MovieBox movieBox, TrakBox trakBox) {
        double timescale = (double) movieBox.getTimescale();
        double access$000 = slice.inSec;
        Double.isNaN(timescale);
        long j = (long) (timescale * access$000);
        double timescale2 = (double) movieBox.getTimescale();
        double access$100 = slice.outSec;
        Double.isNaN(timescale2);
        long j2 = (long) (timescale2 * access$100);
        ListIterator listIterator = list.listIterator();
        long j3 = 0;
        while (listIterator.hasNext()) {
            Edit edit = (Edit) listIterator.next();
            if (edit.getDuration() + j3 <= j || j3 >= j2) {
                listIterator.remove();
            }
            j3 += edit.getDuration();
        }
    }

    private void selectOuter(List<Edit> list, List<Slice> list2, MovieBox movieBox, TrakBox trakBox) {
        long[] jArr = new long[list2.size()];
        long[] jArr2 = new long[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            double access$000 = ((Slice) list2.get(i)).inSec;
            double timescale = (double) movieBox.getTimescale();
            Double.isNaN(timescale);
            jArr[i] = (long) (access$000 * timescale);
            double access$100 = ((Slice) list2.get(i)).outSec;
            double timescale2 = (double) movieBox.getTimescale();
            Double.isNaN(timescale2);
            jArr2[i] = (long) (access$100 * timescale2);
        }
        long j = 0;
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Edit edit = (Edit) listIterator.next();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                if (edit.getDuration() + j > jArr[i2] && j < jArr2[i2]) {
                    listIterator.remove();
                }
            }
            j += edit.getDuration();
        }
    }

    private void split(List<Edit> list, double d, MovieBox movieBox, TrakBox trakBox) {
        double timescale = (double) movieBox.getTimescale();
        Double.isNaN(timescale);
        Util.split(movieBox, trakBox, (long) (d * timescale));
    }

    public List<MovieBox> cut(MovieBox movieBox, List<Slice> list) {
        TrakBox[] tracks;
        TrakBox[] tracks2;
        TrakBox[] tracks3;
        MovieBox movieBox2 = movieBox;
        TrakBox videoTrack = movieBox.getVideoTrack();
        if (!(videoTrack == null || videoTrack.getTimescale() == movieBox.getTimescale())) {
            movieBox2.fixTimescale(videoTrack.getTimescale());
        }
        for (TrakBox trakBox : movieBox.getTracks()) {
            Util.forceEditList(movieBox2, trakBox);
            List edits = trakBox.getEdits();
            for (Slice slice : list) {
                List list2 = edits;
                MovieBox movieBox3 = movieBox;
                TrakBox trakBox2 = trakBox;
                split(list2, slice.inSec, movieBox3, trakBox2);
                split(list2, slice.outSec, movieBox3, trakBox2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Slice slice2 : list) {
            MovieBox movieBox4 = (MovieBox) MP4Util.cloneBox(movieBox2, 16777216);
            for (TrakBox trakBox3 : movieBox4.getTracks()) {
                selectInner(trakBox3.getEdits(), slice2, movieBox2, trakBox3);
            }
            arrayList.add(movieBox4);
        }
        long j = 0;
        for (TrakBox trakBox4 : movieBox.getTracks()) {
            selectOuter(trakBox4.getEdits(), list, movieBox2, trakBox4);
            trakBox4.setEdits(trakBox4.getEdits());
            j = Math.max(j, trakBox4.getDuration());
        }
        movieBox2.setDuration(j);
        return arrayList;
    }
}
