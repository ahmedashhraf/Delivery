package org.jcodec.movtool;

import java.util.Arrays;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ClipRegionBox;
import org.jcodec.containers.mp4.boxes.LoadSettingsBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox;
import org.jcodec.containers.mp4.boxes.TrackHeaderBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox;

public class Paste {

    /* renamed from: tv */
    long[] f44905tv;

    private int[][] findMatches(TrakBox[] trakBoxArr, TrakBox[] trakBoxArr2) {
        int[] iArr = new int[trakBoxArr.length];
        int[] iArr2 = new int[trakBoxArr2.length];
        Arrays.fill(iArr, -1);
        Arrays.fill(iArr2, -1);
        for (int i = 0; i < trakBoxArr.length; i++) {
            if (iArr[i] == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= trakBoxArr2.length) {
                        break;
                    } else if (iArr2[i2] == -1 && matches(trakBoxArr[i], trakBoxArr2[i2])) {
                        iArr[i] = i2;
                        iArr2[i2] = i;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return new int[][]{iArr, iArr2};
    }

    private long getFrameTv(TrakBox trakBox, int i) {
        if (this.f44905tv == null) {
            this.f44905tv = Util.getTimevalues(trakBox);
        }
        return this.f44905tv[i];
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void main(java.lang.String[] r10) throws java.lang.Exception {
        /*
            java.lang.String r0 = "file://"
            int r1 = r10.length
            r2 = 2
            if (r1 >= r2) goto L_0x0011
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r3 = "Syntax: paste <to movie> <from movie> [second]"
            r1.println(r3)
            r1 = -1
            java.lang.System.exit(r1)
        L_0x0011:
            java.io.File r1 = new java.io.File
            r3 = 0
            r3 = r10[r3]
            r1.<init>(r3)
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r1.getParentFile()     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r6.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r1.getName()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "\\.mov$"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replaceAll(r8, r9)     // Catch:{ all -> 0x00bf }
            r6.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = ".paste.mov"
            r6.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00bf }
            r4.delete()     // Catch:{ all -> 0x00bf }
            org.jcodec.common.FileChannelWrapper r4 = org.jcodec.common.NIOUtils.writableFileChannel(r4)     // Catch:{ all -> 0x00bf }
            org.jcodec.common.FileChannelWrapper r5 = org.jcodec.common.NIOUtils.writableFileChannel(r1)     // Catch:{ all -> 0x00bc }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ba }
            r7 = 1
            r7 = r10[r7]     // Catch:{ all -> 0x00ba }
            r6.<init>(r7)     // Catch:{ all -> 0x00ba }
            org.jcodec.common.FileChannelWrapper r3 = org.jcodec.common.NIOUtils.readableFileChannel(r6)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ all -> 0x00ba }
            r7.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00ba }
            org.jcodec.containers.mp4.boxes.MovieBox r1 = org.jcodec.containers.mp4.MP4Util.createRefMovie(r5, r1)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            org.jcodec.containers.mp4.boxes.MovieBox r0 = org.jcodec.containers.mp4.MP4Util.createRefMovie(r3, r0)     // Catch:{ all -> 0x00ba }
            org.jcodec.movtool.Strip r6 = new org.jcodec.movtool.Strip     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.strip(r0)     // Catch:{ all -> 0x00ba }
            int r6 = r10.length     // Catch:{ all -> 0x00ba }
            if (r6 <= r2) goto L_0x009f
            org.jcodec.movtool.Paste r6 = new org.jcodec.movtool.Paste     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r10 = r10[r2]     // Catch:{ all -> 0x00ba }
            double r7 = java.lang.Double.parseDouble(r10)     // Catch:{ all -> 0x00ba }
            r6.paste(r1, r0, r7)     // Catch:{ all -> 0x00ba }
            goto L_0x00a7
        L_0x009f:
            org.jcodec.movtool.Paste r10 = new org.jcodec.movtool.Paste     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.addToMovie(r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x00a7:
            org.jcodec.containers.mp4.MP4Util.writeMovie(r4, r1)     // Catch:{ all -> 0x00ba }
            if (r5 == 0) goto L_0x00af
            r5.close()
        L_0x00af:
            if (r3 == 0) goto L_0x00b4
            r3.close()
        L_0x00b4:
            if (r4 == 0) goto L_0x00b9
            r4.close()
        L_0x00b9:
            return
        L_0x00ba:
            r10 = move-exception
            goto L_0x00c2
        L_0x00bc:
            r10 = move-exception
            r5 = r3
            goto L_0x00c2
        L_0x00bf:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x00c2:
            if (r5 == 0) goto L_0x00c7
            r5.close()
        L_0x00c7:
            if (r3 == 0) goto L_0x00cc
            r3.close()
        L_0x00cc:
            if (r4 == 0) goto L_0x00d1
            r4.close()
        L_0x00d1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Paste.main(java.lang.String[]):void");
    }

    private boolean matchClip(TrakBox trakBox, TrakBox trakBox2) {
        Class<ClipRegionBox> cls = ClipRegionBox.class;
        String str = "clip";
        boolean z = false;
        String str2 = "crgn";
        ClipRegionBox clipRegionBox = (ClipRegionBox) Box.findFirst(trakBox, cls, str, str2);
        ClipRegionBox clipRegionBox2 = (ClipRegionBox) Box.findFirst(trakBox2, cls, str, str2);
        if ((clipRegionBox == null && clipRegionBox2 != null) || (clipRegionBox != null && clipRegionBox2 == null)) {
            return false;
        }
        if (clipRegionBox == null && clipRegionBox2 == null) {
            return true;
        }
        if (clipRegionBox.getRgnSize() == clipRegionBox2.getRgnSize() && clipRegionBox.getX() == clipRegionBox2.getX() && clipRegionBox.getY() == clipRegionBox2.getY() && clipRegionBox.getWidth() == clipRegionBox2.getWidth() && clipRegionBox.getHeight() == clipRegionBox2.getHeight()) {
            z = true;
        }
        return z;
    }

    private boolean matchHeaders(TrakBox trakBox, TrakBox trakBox2) {
        TrackHeaderBox trackHeader = trakBox.getTrackHeader();
        TrackHeaderBox trackHeader2 = trakBox2.getTrackHeader();
        if (!("vide".equals(trakBox.getHandlerType()) && Arrays.equals(trackHeader.getMatrix(), trackHeader2.getMatrix()) && trackHeader.getLayer() == trackHeader2.getLayer() && trackHeader.getWidth() == trackHeader2.getWidth() && trackHeader.getHeight() == trackHeader2.getHeight())) {
            if (!"soun".equals(trakBox.getHandlerType()) || trackHeader.getVolume() != trackHeader2.getVolume()) {
                if (!"tmcd".equals(trakBox.getHandlerType())) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean matchLoad(TrakBox trakBox, TrakBox trakBox2) {
        Class<LoadSettingsBox> cls = LoadSettingsBox.class;
        boolean z = true;
        String str = "load";
        LoadSettingsBox loadSettingsBox = (LoadSettingsBox) Box.findFirst(trakBox, cls, str);
        LoadSettingsBox loadSettingsBox2 = (LoadSettingsBox) Box.findFirst(trakBox2, cls, str);
        if (loadSettingsBox == null && loadSettingsBox2 == null) {
            return true;
        }
        if ((loadSettingsBox == null && loadSettingsBox2 != null) || (loadSettingsBox != null && loadSettingsBox2 == null)) {
            return false;
        }
        if (!(loadSettingsBox.getPreloadStartTime() == loadSettingsBox2.getPreloadStartTime() && loadSettingsBox.getPreloadDuration() == loadSettingsBox2.getPreloadDuration() && loadSettingsBox.getPreloadFlags() == loadSettingsBox2.getPreloadFlags() && loadSettingsBox.getDefaultHints() == loadSettingsBox2.getDefaultHints())) {
            z = false;
        }
        return z;
    }

    private boolean matchMediaHeader(TrakBox trakBox, TrakBox trakBox2) {
        Class<SoundMediaHeaderBox> cls = SoundMediaHeaderBox.class;
        Class<VideoMediaHeaderBox> cls2 = VideoMediaHeaderBox.class;
        String str = "mdia";
        boolean z = false;
        String str2 = "minf";
        String str3 = "vmhd";
        VideoMediaHeaderBox videoMediaHeaderBox = (VideoMediaHeaderBox) Box.findFirst(trakBox, cls2, str, str2, str3);
        VideoMediaHeaderBox videoMediaHeaderBox2 = (VideoMediaHeaderBox) Box.findFirst(trakBox2, cls2, str, str2, str3);
        if ((videoMediaHeaderBox != null && videoMediaHeaderBox2 == null) || (videoMediaHeaderBox == null && videoMediaHeaderBox2 != null)) {
            return false;
        }
        if (videoMediaHeaderBox == null || videoMediaHeaderBox2 == null) {
            String str4 = "smhd";
            SoundMediaHeaderBox soundMediaHeaderBox = (SoundMediaHeaderBox) Box.findFirst(trakBox, cls, str, str2, str4);
            SoundMediaHeaderBox soundMediaHeaderBox2 = (SoundMediaHeaderBox) Box.findFirst(trakBox2, cls, str, str2, str4);
            if ((soundMediaHeaderBox == null && soundMediaHeaderBox2 != null) || (soundMediaHeaderBox != null && soundMediaHeaderBox2 == null)) {
                return false;
            }
            if (soundMediaHeaderBox == null || soundMediaHeaderBox2 == null) {
                return true;
            }
            if (soundMediaHeaderBox.getBalance() == soundMediaHeaderBox.getBalance()) {
                z = true;
            }
            return z;
        }
        if (videoMediaHeaderBox.getGraphicsMode() == videoMediaHeaderBox2.getGraphicsMode() && videoMediaHeaderBox.getbOpColor() == videoMediaHeaderBox2.getbOpColor() && videoMediaHeaderBox.getgOpColor() == videoMediaHeaderBox2.getgOpColor() && videoMediaHeaderBox.getrOpColor() == videoMediaHeaderBox2.getrOpColor()) {
            z = true;
        }
        return z;
    }

    private boolean matchSampleSizes(TrakBox trakBox, TrakBox trakBox2) {
        Class<SampleSizesBox> cls = SampleSizesBox.class;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stsz";
        if (((SampleSizesBox) Box.findFirst(trakBox, cls, str, str2, str3, str4)).getDefaultSize() == ((SampleSizesBox) Box.findFirst(trakBox, cls, str, str2, str3, str4)).getDefaultSize()) {
            return true;
        }
        return false;
    }

    private boolean matches(TrakBox trakBox, TrakBox trakBox2) {
        return trakBox.getHandlerType().equals(trakBox2.getHandlerType()) && matchHeaders(trakBox, trakBox2) && matchSampleSizes(trakBox, trakBox2) && matchMediaHeader(trakBox, trakBox2) && matchClip(trakBox, trakBox2) && matchLoad(trakBox, trakBox2);
    }

    public void addToMovie(MovieBox movieBox, MovieBox movieBox2) {
        for (TrakBox importTrack : movieBox2.getTracks()) {
            movieBox.appendTrack(movieBox.importTrack(movieBox2, importTrack));
        }
    }

    public void paste(MovieBox movieBox, MovieBox movieBox2, double d) {
        TrakBox videoTrack = movieBox.getVideoTrack();
        if (!(videoTrack == null || videoTrack.getTimescale() == movieBox.getTimescale())) {
            movieBox.fixTimescale(videoTrack.getTimescale());
        }
        double timescale = (double) movieBox.getTimescale();
        Double.isNaN(timescale);
        long j = (long) (timescale * d);
        Util.forceEditList(movieBox);
        Util.forceEditList(movieBox2);
        TrakBox[] tracks = movieBox2.getTracks();
        TrakBox[] tracks2 = movieBox.getTracks();
        int[][] findMatches = findMatches(tracks, tracks2);
        for (int i = 0; i < findMatches[0].length; i++) {
            TrakBox importTrack = movieBox.importTrack(movieBox2, tracks[i]);
            if (findMatches[0][i] != -1) {
                Util.insertTo(movieBox, tracks2[findMatches[0][i]], importTrack, j);
            } else {
                movieBox.appendTrack(importTrack);
                Util.shift(movieBox, importTrack, j);
            }
        }
        for (int i2 = 0; i2 < findMatches[1].length; i2++) {
            if (findMatches[1][i2] == -1) {
                Util.spread(movieBox, tracks2[i2], j, movieBox.rescale(movieBox2.getDuration(), (long) movieBox2.getTimescale()));
            }
        }
        movieBox.updateDuration();
    }
}
