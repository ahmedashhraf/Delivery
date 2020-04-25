package com.instabug.library.internal.video;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class InstabugVideoUtils {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String TAG = "InstabugVideoUtils";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-606747487382759201L, "com/instabug/library/internal/video/InstabugVideoUtils", C13959t.f40859X1);
        $jacocoData = a;
        return a;
    }

    public InstabugVideoUtils() {
        $jacocoInit()[0] = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e2, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6[112(0x70)] = true;
        com.instabug.library.util.InstabugSDKLogger.m46622d(r5, "The current sample is over the trim end time.");
        r6[113(0x71)] = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026d  */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void genVideoUsingMuxer(java.lang.String r18, java.lang.String r19, int r20, int r21, boolean r22, boolean r23) throws java.io.IOException {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            java.lang.String r3 = "The muxer has been released!"
            java.lang.String r4 = "The muxer skip release/stop since it has no written frames"
            java.lang.String r5 = "InstabugVideoUtils"
            boolean[] r6 = $jacocoInit()
            android.media.MediaExtractor r7 = new android.media.MediaExtractor
            r7.<init>()
            r8 = 1
            r9 = 66
            r6[r9] = r8
            r7.setDataSource(r0)
            r9 = 67
            r6[r9] = r8
            int r9 = r7.getTrackCount()
            r10 = 68
            r6[r10] = r8
            android.media.MediaMuxer r10 = new android.media.MediaMuxer
            r11 = 0
            r12 = r19
            r10.<init>(r12, r11)
            r12 = 69
            r6[r12] = r8
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r9)
            r13 = 70
            r6[r13] = r8
            r13 = -1
            r13 = 0
            r14 = -1
        L_0x0041:
            if (r13 >= r9) goto L_0x00e7
            r15 = 71
            r6[r15] = r8
            android.media.MediaFormat r15 = r7.getTrackFormat(r13)
            r16 = 72
            r6[r16] = r8
            java.lang.String r11 = "mime"
            java.lang.String r11 = r15.getString(r11)
            r17 = 73
            r6[r17] = r8
            java.lang.String r8 = "audio/"
            boolean r8 = r11.startsWith(r8)
            if (r8 != 0) goto L_0x0068
            r8 = 74
            r17 = 1
            r6[r8] = r17
            goto L_0x0070
        L_0x0068:
            r17 = 1
            if (r22 != 0) goto L_0x008a
            r8 = 75
            r6[r8] = r17
        L_0x0070:
            java.lang.String r8 = "video/"
            boolean r8 = r11.startsWith(r8)
            if (r8 != 0) goto L_0x007d
            r8 = 77
            r6[r8] = r17
            goto L_0x0083
        L_0x007d:
            if (r23 != 0) goto L_0x0085
            r8 = 78
            r6[r8] = r17
        L_0x0083:
            r8 = 0
            goto L_0x008f
        L_0x0085:
            r8 = 79
            r6[r8] = r17
            goto L_0x008e
        L_0x008a:
            r8 = 76
            r6[r8] = r17
        L_0x008e:
            r8 = 1
        L_0x008f:
            if (r8 != 0) goto L_0x0096
            r8 = 80
            r6[r8] = r17
            goto L_0x00dd
        L_0x0096:
            r8 = 81
            r6[r8] = r17
            r7.selectTrack(r13)
            r8 = 82
            r6[r8] = r17
            int r8 = r10.addTrack(r15)
            r11 = 83
            r6[r11] = r17
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.put(r11, r8)
            r8 = 84
            r6[r8] = r17
            java.lang.String r8 = "max-input-size"
            boolean r11 = r15.containsKey(r8)
            if (r11 != 0) goto L_0x00c5
            r8 = 85
            r6[r8] = r17
            goto L_0x00dd
        L_0x00c5:
            r11 = 86
            r6[r11] = r17
            int r8 = r15.getInteger(r8)
            if (r8 <= r14) goto L_0x00d5
            r11 = 87
            r6[r11] = r17
            r14 = r8
            goto L_0x00d9
        L_0x00d5:
            r8 = 88
            r6[r8] = r17
        L_0x00d9:
            r8 = 89
            r6[r8] = r17
        L_0x00dd:
            int r13 = r13 + 1
            r8 = 90
            r6[r8] = r17
            r8 = 1
            r11 = 0
            goto L_0x0041
        L_0x00e7:
            r17 = 1
            if (r14 < 0) goto L_0x00f0
            r8 = 91
            r6[r8] = r17
            goto L_0x00f6
        L_0x00f0:
            r14 = 4096(0x1000, float:5.74E-42)
            r8 = 92
            r6[r8] = r17
        L_0x00f6:
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r9 = 93
            r6[r9] = r17
            r8.setDataSource(r0)
            r9 = 94
            r6[r9] = r17
            r9 = 24
            java.lang.String r8 = r8.extractMetadata(r9)
            if (r8 != 0) goto L_0x0113
            r8 = 95
            r6[r8] = r17
            goto L_0x012d
        L_0x0113:
            r9 = 96
            r6[r9] = r17
            int r8 = java.lang.Integer.parseInt(r8)
            if (r8 >= 0) goto L_0x0122
            r8 = 97
            r6[r8] = r17
            goto L_0x012d
        L_0x0122:
            r9 = 98
            r6[r9] = r17
            r10.setOrientationHint(r8)
            r8 = 99
            r6[r8] = r17
        L_0x012d:
            if (r1 > 0) goto L_0x0134
            r1 = 100
            r6[r1] = r17
            goto L_0x0143
        L_0x0134:
            r8 = 101(0x65, float:1.42E-43)
            r6[r8] = r17
            int r1 = r1 * 1000
            long r8 = (long) r1
            r1 = 2
            r7.seekTo(r8, r1)
            r1 = 102(0x66, float:1.43E-43)
            r6[r1] = r17
        L_0x0143:
            r1 = 103(0x67, float:1.44E-43)
            r6[r1] = r17
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r14)
            r8 = 104(0x68, float:1.46E-43)
            r6[r8] = r17
            android.media.MediaCodec$BufferInfo r8 = new android.media.MediaCodec$BufferInfo
            r8.<init>()
            r9 = 105(0x69, float:1.47E-43)
            r6[r9] = r17     // Catch:{ IllegalStateException -> 0x022a, all -> 0x0226 }
            r10.start()     // Catch:{ IllegalStateException -> 0x022a, all -> 0x0226 }
            r9 = 106(0x6a, float:1.49E-43)
            r6[r9] = r17     // Catch:{ IllegalStateException -> 0x022a, all -> 0x0226 }
            r9 = 0
            r11 = 0
        L_0x0161:
            r8.offset = r11     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r13 = 107(0x6b, float:1.5E-43)
            r6[r13] = r17     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r13 = r7.readSampleData(r1, r11)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r8.size = r13     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r11 = r8.size     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            if (r11 >= 0) goto L_0x0183
            r1 = 108(0x6c, float:1.51E-43)
            r6[r1] = r17     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            java.lang.String r1 = "Saw input EOS."
            com.instabug.library.util.InstabugSDKLogger.m46622d(r5, r1)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r11 = 0
            r8.size = r11     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r1 = 109(0x6d, float:1.53E-43)
            r6[r1] = r17     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r2 = 1
            goto L_0x01f0
        L_0x0183:
            r11 = 0
            long r13 = r7.getSampleTime()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r8.presentationTimeUs = r13     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            if (r2 > 0) goto L_0x0195
            r13 = 110(0x6e, float:1.54E-43)
            r14 = 1
            r6[r13] = r14     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r19 = r12
            r12 = 1
            goto L_0x01a5
        L_0x0195:
            long r13 = r8.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r15 = r2 * 1000
            r19 = r12
            long r11 = (long) r15     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x01e2
            r11 = 111(0x6f, float:1.56E-43)
            r12 = 1
            r6[r11] = r12     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
        L_0x01a5:
            int r11 = r7.getSampleFlags()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r8.flags = r11     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r11 = 114(0x72, float:1.6E-43)
            r6[r11] = r12     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r11 = r7.getSampleTrackIndex()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r13 = 115(0x73, float:1.61E-43)
            r6[r13] = r12     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r12 = r19
            java.lang.Object r11 = r12.get(r11)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            int r11 = r11.intValue()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r10.writeSampleData(r11, r1, r8)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r9 = 116(0x74, float:1.63E-43)
            r11 = 1
            r6[r9] = r11     // Catch:{ IllegalStateException -> 0x01e0, all -> 0x01db }
            r7.advance()     // Catch:{ IllegalStateException -> 0x01e0, all -> 0x01db }
            r9 = 117(0x75, float:1.64E-43)
            r6[r9] = r11     // Catch:{ IllegalStateException -> 0x01e0, all -> 0x01db }
            r9 = 1
            r11 = 0
            r17 = 1
            goto L_0x0161
        L_0x01db:
            r0 = move-exception
            r1 = 1
            r9 = 1
            goto L_0x0258
        L_0x01e0:
            r8 = 1
            goto L_0x022b
        L_0x01e2:
            r1 = 112(0x70, float:1.57E-43)
            r2 = 1
            r6[r1] = r2     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            java.lang.String r1 = "The current sample is over the trim end time."
            com.instabug.library.util.InstabugSDKLogger.m46622d(r5, r1)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r1 = 113(0x71, float:1.58E-43)
            r6[r1] = r2     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
        L_0x01f0:
            r10.stop()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r1 = 118(0x76, float:1.65E-43)
            r6[r1] = r2     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            java.io.File r1 = new java.io.File     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r0 = 119(0x77, float:1.67E-43)
            r6[r0] = r2     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            r1.delete()     // Catch:{ IllegalStateException -> 0x0224, all -> 0x0221 }
            if (r9 == 0) goto L_0x0218
            r0 = 120(0x78, float:1.68E-43)
            r6[r0] = r2
            r10.release()
            r0 = 121(0x79, float:1.7E-43)
            r6[r0] = r2
            com.instabug.library.util.InstabugSDKLogger.m46622d(r5, r3)
            r0 = 122(0x7a, float:1.71E-43)
            r6[r0] = r2
            goto L_0x021f
        L_0x0218:
            com.instabug.library.util.InstabugSDKLogger.m46627w(r5, r4)
            r0 = 123(0x7b, float:1.72E-43)
            r6[r0] = r2
        L_0x021f:
            r1 = 1
            goto L_0x0251
        L_0x0221:
            r0 = move-exception
            r1 = 1
            goto L_0x0258
        L_0x0224:
            r8 = r9
            goto L_0x022b
        L_0x0226:
            r0 = move-exception
            r1 = 1
            r9 = 0
            goto L_0x0258
        L_0x022a:
            r8 = 0
        L_0x022b:
            r0 = 124(0x7c, float:1.74E-43)
            r1 = 1
            r6[r0] = r1     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "The source video file is malformed"
            com.instabug.library.util.InstabugSDKLogger.m46627w(r5, r0)     // Catch:{ all -> 0x0256 }
            if (r8 == 0) goto L_0x024a
            r0 = 125(0x7d, float:1.75E-43)
            r6[r0] = r1
            r10.release()
            r0 = 126(0x7e, float:1.77E-43)
            r6[r0] = r1
            com.instabug.library.util.InstabugSDKLogger.m46622d(r5, r3)
            r0 = 127(0x7f, float:1.78E-43)
            r6[r0] = r1
            goto L_0x0251
        L_0x024a:
            com.instabug.library.util.InstabugSDKLogger.m46627w(r5, r4)
            r0 = 128(0x80, float:1.794E-43)
            r6[r0] = r1
        L_0x0251:
            r0 = 134(0x86, float:1.88E-43)
            r6[r0] = r1
            return
        L_0x0256:
            r0 = move-exception
            r9 = r8
        L_0x0258:
            if (r9 == 0) goto L_0x026d
            r2 = 129(0x81, float:1.81E-43)
            r6[r2] = r1
            r10.release()
            r2 = 130(0x82, float:1.82E-43)
            r6[r2] = r1
            com.instabug.library.util.InstabugSDKLogger.m46622d(r5, r3)
            r2 = 131(0x83, float:1.84E-43)
            r6[r2] = r1
            goto L_0x0274
        L_0x026d:
            com.instabug.library.util.InstabugSDKLogger.m46627w(r5, r4)
            r2 = 132(0x84, float:1.85E-43)
            r6[r2] = r1
        L_0x0274:
            r2 = 133(0x85, float:1.86E-43)
            r6[r2] = r1
            goto L_0x027a
        L_0x0279:
            throw r0
        L_0x027a:
            goto L_0x0279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.video.InstabugVideoUtils.genVideoUsingMuxer(java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public static int getVideoDuration(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        $jacocoInit[55] = true;
        mediaMetadataRetriever.setDataSource(str);
        $jacocoInit[56] = true;
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        $jacocoInit[57] = true;
        int parseInt = Integer.parseInt(extractMetadata);
        $jacocoInit[58] = true;
        return parseInt;
    }

    public static boolean isDurationMoreThanAutoRecMaxDuration(int i, int i2) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (i > i2) {
            $jacocoInit[59] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[60] = true;
        }
        $jacocoInit[61] = true;
        return z;
    }

    public static File startTrim(File file, File file2, int i) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        if (isDurationMoreThanAutoRecMaxDuration(getVideoDuration(file.getPath()), i)) {
            $jacocoInit[62] = true;
            int videoDuration = getVideoDuration(file.getPath());
            int i2 = videoDuration - i;
            $jacocoInit[63] = true;
            genVideoUsingMuxer(file.getPath(), file2.getPath(), i2, videoDuration, false, true);
            $jacocoInit[64] = true;
            return file2;
        }
        $jacocoInit[65] = true;
        return file;
    }

    @TargetApi(18)
    public String mux(String str, String str2) throws IOException {
        String str3;
        File file;
        String str4;
        int i;
        String str5;
        ByteBuffer byteBuffer;
        String str6;
        MediaExtractor mediaExtractor;
        String str7;
        String str8;
        int i2;
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        File videoFile = AttachmentManager.getVideoFile(Instabug.getApplicationContext());
        $jacocoInit[1] = true;
        String absolutePath = videoFile.getAbsolutePath();
        $jacocoInit[2] = true;
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        $jacocoInit[3] = true;
        mediaExtractor2.setDataSource(str2);
        $jacocoInit[4] = true;
        MediaExtractor mediaExtractor3 = new MediaExtractor();
        $jacocoInit[5] = true;
        mediaExtractor3.setDataSource(str);
        $jacocoInit[6] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Video Extractor Track Count ");
        sb.append(mediaExtractor2.getTrackCount());
        InstabugSDKLogger.m46625i(this, sb.toString());
        $jacocoInit[7] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Audio Extractor Track Count ");
        sb2.append(mediaExtractor3.getTrackCount());
        InstabugSDKLogger.m46625i(this, sb2.toString());
        $jacocoInit[8] = true;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Video Extractor Track duration ");
        $jacocoInit[9] = true;
        sb3.append(mediaExtractor2.getCachedDuration());
        String sb4 = sb3.toString();
        $jacocoInit[10] = true;
        InstabugSDKLogger.m46625i(this, sb4);
        $jacocoInit[11] = true;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Audio Extractor Track duration ");
        $jacocoInit[12] = true;
        sb5.append(mediaExtractor3.getCachedDuration());
        String sb6 = sb5.toString();
        $jacocoInit[13] = true;
        InstabugSDKLogger.m46625i(this, sb6);
        $jacocoInit[14] = true;
        MediaMuxer mediaMuxer = new MediaMuxer(absolutePath, 0);
        $jacocoInit[15] = true;
        mediaExtractor2.selectTrack(0);
        $jacocoInit[16] = true;
        MediaFormat trackFormat = mediaExtractor2.getTrackFormat(0);
        $jacocoInit[17] = true;
        int addTrack = mediaMuxer.addTrack(trackFormat);
        $jacocoInit[18] = true;
        mediaExtractor3.selectTrack(0);
        $jacocoInit[19] = true;
        MediaFormat trackFormat2 = mediaExtractor3.getTrackFormat(0);
        $jacocoInit[20] = true;
        int addTrack2 = mediaMuxer.addTrack(trackFormat2);
        $jacocoInit[21] = true;
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Video Format ");
        sb7.append(trackFormat.toString());
        InstabugSDKLogger.m46625i(this, sb7.toString());
        $jacocoInit[22] = true;
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Audio Format ");
        sb8.append(trackFormat2.toString());
        InstabugSDKLogger.m46625i(this, sb8.toString());
        $jacocoInit[23] = true;
        ByteBuffer allocate = ByteBuffer.allocate(262144);
        $jacocoInit[24] = true;
        ByteBuffer allocate2 = ByteBuffer.allocate(262144);
        $jacocoInit[25] = true;
        BufferInfo bufferInfo = new BufferInfo();
        $jacocoInit[26] = true;
        BufferInfo bufferInfo2 = new BufferInfo();
        $jacocoInit[27] = true;
        mediaExtractor2.seekTo(0, 0);
        $jacocoInit[28] = true;
        mediaExtractor3.seekTo(0, 1);
        $jacocoInit[29] = true;
        mediaMuxer.start();
        $jacocoInit[30] = true;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            str3 = "saw input EOS.";
            file = videoFile;
            str4 = ") Video PresentationTimeUs:";
            i = addTrack2;
            str5 = " Size(KB) ";
            byteBuffer = allocate2;
            str6 = " Flags:";
            mediaExtractor = mediaExtractor3;
            str7 = "Frame (";
            str8 = ") Audio PresentationTimeUs:";
            i2 = 100;
            if (z2) {
                break;
            }
            bufferInfo.offset = 100;
            $jacocoInit[31] = true;
            bufferInfo.size = mediaExtractor2.readSampleData(allocate, 100);
            if (bufferInfo.size < 0) {
                $jacocoInit[32] = true;
            } else if (bufferInfo2.size < 0) {
                $jacocoInit[33] = true;
            } else {
                BufferInfo bufferInfo3 = bufferInfo2;
                boolean z3 = z2;
                bufferInfo.presentationTimeUs = mediaExtractor2.getSampleTime();
                $jacocoInit[35] = true;
                bufferInfo.flags = mediaExtractor2.getSampleFlags();
                $jacocoInit[36] = true;
                mediaMuxer.writeSampleData(addTrack, allocate, bufferInfo);
                $jacocoInit[37] = true;
                mediaExtractor2.advance();
                i3++;
                $jacocoInit[38] = true;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str7);
                sb9.append(i3);
                sb9.append(str4);
                sb9.append(bufferInfo.presentationTimeUs);
                sb9.append(str6);
                sb9.append(bufferInfo.flags);
                sb9.append(str5);
                sb9.append(bufferInfo.size / 1024);
                InstabugSDKLogger.m46625i("ContentValues", sb9.toString());
                $jacocoInit[39] = true;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str7);
                sb10.append(i3);
                sb10.append(str8);
                MediaExtractor mediaExtractor4 = mediaExtractor2;
                BufferInfo bufferInfo4 = bufferInfo3;
                sb10.append(bufferInfo4.presentationTimeUs);
                sb10.append(str6);
                sb10.append(bufferInfo4.flags);
                sb10.append(str5);
                sb10.append(bufferInfo4.size / 1024);
                InstabugSDKLogger.m46625i(this, sb10.toString());
                $jacocoInit[40] = true;
                addTrack2 = i;
                bufferInfo2 = bufferInfo4;
                videoFile = file;
                allocate2 = byteBuffer;
                mediaExtractor3 = mediaExtractor;
                mediaExtractor2 = mediaExtractor4;
                z2 = z3;
            }
            InstabugSDKLogger.m46625i(this, str3);
            bufferInfo.size = 0;
            $jacocoInit[34] = true;
            addTrack2 = i;
            videoFile = file;
            allocate2 = byteBuffer;
            mediaExtractor3 = mediaExtractor;
            z2 = true;
        }
        BufferInfo bufferInfo5 = bufferInfo2;
        String str9 = str8;
        boolean z4 = true;
        $jacocoInit[41] = true;
        boolean z5 = false;
        while (!z5) {
            bufferInfo5.offset = i2;
            $jacocoInit[42] = z4;
            ByteBuffer byteBuffer2 = byteBuffer;
            MediaExtractor mediaExtractor5 = mediaExtractor;
            boolean z6 = z5;
            bufferInfo5.size = mediaExtractor5.readSampleData(byteBuffer2, i2);
            if (bufferInfo.size < 0) {
                z = true;
                $jacocoInit[43] = true;
            } else {
                z = true;
                if (bufferInfo5.size < 0) {
                    $jacocoInit[44] = true;
                } else {
                    String str10 = str6;
                    bufferInfo5.presentationTimeUs = mediaExtractor5.getSampleTime();
                    $jacocoInit[46] = true;
                    bufferInfo5.flags = mediaExtractor5.getSampleFlags();
                    $jacocoInit[47] = true;
                    int i4 = i;
                    mediaMuxer.writeSampleData(i4, byteBuffer2, bufferInfo5);
                    $jacocoInit[48] = true;
                    mediaExtractor5.advance();
                    $jacocoInit[49] = true;
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str7);
                    sb11.append(i3);
                    sb11.append(str4);
                    MediaExtractor mediaExtractor6 = mediaExtractor5;
                    sb11.append(bufferInfo.presentationTimeUs);
                    String str11 = str10;
                    sb11.append(str11);
                    sb11.append(bufferInfo.flags);
                    sb11.append(str5);
                    sb11.append(bufferInfo.size / 1024);
                    InstabugSDKLogger.m46625i(this, sb11.toString());
                    $jacocoInit[50] = true;
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(str7);
                    sb12.append(i3);
                    sb12.append(str9);
                    String str12 = str4;
                    int i5 = i4;
                    sb12.append(bufferInfo5.presentationTimeUs);
                    sb12.append(str11);
                    sb12.append(bufferInfo5.flags);
                    sb12.append(str5);
                    sb12.append(bufferInfo5.size / 1024);
                    InstabugSDKLogger.m46625i(this, sb12.toString());
                    $jacocoInit[51] = true;
                    str4 = str12;
                    str6 = str11;
                    i = i5;
                    z5 = z6;
                    mediaExtractor = mediaExtractor6;
                    i2 = 100;
                    byteBuffer = byteBuffer2;
                    z4 = true;
                }
            }
            InstabugSDKLogger.m46625i(this, str3);
            bufferInfo5.size = 0;
            $jacocoInit[45] = z;
            byteBuffer = byteBuffer2;
            mediaExtractor = mediaExtractor5;
            z4 = true;
            z5 = true;
        }
        mediaMuxer.stop();
        $jacocoInit[52] = true;
        mediaMuxer.release();
        $jacocoInit[53] = true;
        String absolutePath2 = file.getAbsolutePath();
        $jacocoInit[54] = true;
        return absolutePath2;
    }
}
