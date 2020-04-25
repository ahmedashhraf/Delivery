package com.instabug.library.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class VideoManipulationUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8935313308802481684L, "com/instabug/library/util/VideoManipulationUtils", 5);
        $jacocoData = a;
        return a;
    }

    public VideoManipulationUtils() {
        $jacocoInit()[0] = true;
    }

    public static Bitmap extractFirstVideoFrame(String str) throws IllegalArgumentException {
        boolean[] $jacocoInit = $jacocoInit();
        Bitmap extractVideoFrame = extractVideoFrame(str);
        $jacocoInit[4] = true;
        return extractVideoFrame;
    }

    public static Bitmap extractVideoFrame(String str) throws IllegalArgumentException {
        boolean[] $jacocoInit = $jacocoInit();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        $jacocoInit[1] = true;
        mediaMetadataRetriever.setDataSource(str);
        $jacocoInit[2] = true;
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        $jacocoInit[3] = true;
        return frameAtTime;
    }
}
