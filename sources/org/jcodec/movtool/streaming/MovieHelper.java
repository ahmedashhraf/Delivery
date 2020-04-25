package org.jcodec.movtool.streaming;

import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.LongArrayList;
import org.jcodec.common.model.Rational;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.ChannelBox;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry;
import org.jcodec.containers.mp4.boxes.DataInfoBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.GenericMediaInfoBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.MediaInfoBox;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.PixelAspectExt;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox;
import org.jcodec.containers.mp4.boxes.SyncSamplesBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox;
import org.jcodec.containers.mp4.boxes.channel.ChannelUtils;
import org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack;
import org.jcodec.containers.mp4.muxer.MP4Muxer;
import org.jcodec.movtool.streaming.VirtualMP4Movie.PacketChunk;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;
import p076c.p112d.p148d.p150g.C6637f;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

public class MovieHelper {
    private static final int MEBABYTE = 1048576;
    private static int[] timescales = {C14236a.DEFAULT_TIMEOUT, 12000, 15000, 24000, 25000, HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT, 50000, 41000, 48000, 96000};

    /* renamed from: org.jcodec.movtool.streaming.MovieHelper$a */
    static /* synthetic */ class C15575a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44912a = new int[TrackType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.jcodec.containers.mp4.TrackType[] r0 = org.jcodec.containers.mp4.TrackType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44912a = r0
                int[] r0 = f44912a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44912a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.SOUND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44912a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.TIMECODE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.MovieHelper.C15575a.<clinit>():void");
        }
    }

    private static void addDref(NodeBox nodeBox) {
        DataInfoBox dataInfoBox = new DataInfoBox();
        nodeBox.add(dataInfoBox);
        DataRefBox dataRefBox = new DataRefBox();
        dataInfoBox.add(dataRefBox);
        dataRefBox.add(new LeafBox(new Header("alis", 0), ByteBuffer.wrap(new byte[]{0, 0, 0, 1})));
    }

    private static void addEdits(TrakBox trakBox, VirtualTrack virtualTrack, int i, int i2) {
        VirtualEdit[] edits = virtualTrack.getEdits();
        if (edits != null) {
            ArrayList arrayList = new ArrayList();
            for (VirtualEdit virtualEdit : edits) {
                double duration = virtualEdit.getDuration();
                double d = (double) i;
                Double.isNaN(d);
                long j = (long) ((int) (duration * d));
                double in = virtualEdit.getIn();
                double d2 = (double) i2;
                Double.isNaN(d2);
                Edit edit = new Edit(j, (long) ((int) (in * d2)), 1.0f);
                arrayList.add(edit);
            }
            trakBox.setEdits(arrayList);
        }
    }

    private static long calcMovieDuration(VirtualTrack[] virtualTrackArr, int i, double[] dArr) {
        long j = 0;
        for (int i2 = 0; i2 < virtualTrackArr.length; i2++) {
            double d = (double) i;
            double d2 = dArr[i2];
            Double.isNaN(d);
            j = Math.max(j, (long) (d * d2));
        }
        return j;
    }

    private static double[] calcTrackDurations(PacketChunk[] packetChunkArr, VirtualTrack[] virtualTrackArr) {
        double[] dArr = new double[virtualTrackArr.length];
        Arrays.fill(dArr, -1.0d);
        int i = 0;
        for (int length = packetChunkArr.length - 1; length >= 0 && i < dArr.length; length--) {
            PacketChunk packetChunk = packetChunkArr[length];
            int trackNo = packetChunk.getTrackNo();
            if (dArr[trackNo] == -1.0d) {
                dArr[trackNo] = packetChunk.getPacket().getPts() + packetChunk.getPacket().getDuration();
                i++;
            }
        }
        return dArr;
    }

    private static int chooseTimescale(PacketChunk[] packetChunkArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i3 < packetChunkArr.length) {
            if (packetChunkArr[i3].getTrackNo() == i) {
                double duration = packetChunkArr[i3].getPacket().getDuration();
                double d = Double.MAX_VALUE;
                int i4 = -1;
                while (true) {
                    int[] iArr = timescales;
                    if (i2 >= iArr.length) {
                        return iArr[i4];
                    }
                    double d2 = (double) iArr[i2];
                    Double.isNaN(d2);
                    double d3 = d2 * duration;
                    double d4 = (double) ((int) d3);
                    Double.isNaN(d4);
                    double d5 = d3 - d4;
                    if (d5 < d) {
                        i4 = i2;
                        d = d5;
                    }
                    i2++;
                }
            } else {
                i3++;
            }
        }
        return 0;
    }

    private static void compositionOffsets(List<Entry> list, NodeBox nodeBox) {
        if (list.size() > 0) {
            int minOffset = FramesMP4MuxerTrack.minOffset(list);
            for (Entry entry : list) {
                entry.offset -= minOffset;
            }
            nodeBox.add(new CompositionOffsetsBox((Entry[]) list.toArray(new Entry[0])));
        }
    }

    private static int getPCMTs(AudioCodecMeta audioCodecMeta, PacketChunk[] packetChunkArr, int i) throws IOException {
        for (int i2 = 0; i2 < packetChunkArr.length; i2++) {
            if (packetChunkArr[i2].getTrackNo() == i) {
                double dataLen = (double) packetChunkArr[i2].getDataLen();
                double frameSize = (double) audioCodecMeta.getFrameSize();
                double duration = packetChunkArr[i2].getPacket().getDuration();
                Double.isNaN(frameSize);
                double d = frameSize * duration;
                Double.isNaN(dataLen);
                return (int) Math.round(dataLen / d);
            }
        }
        throw new RuntimeException("Crap");
    }

    private static void mediaHeader(MediaInfoBox mediaInfoBox, TrackType trackType) {
        int i = C15575a.f44912a[trackType.ordinal()];
        if (i == 1) {
            VideoMediaHeaderBox videoMediaHeaderBox = new VideoMediaHeaderBox(0, 0, 0, 0);
            videoMediaHeaderBox.setFlags(1);
            mediaInfoBox.add(videoMediaHeaderBox);
        } else if (i == 2) {
            SoundMediaHeaderBox soundMediaHeaderBox = new SoundMediaHeaderBox();
            soundMediaHeaderBox.setFlags(1);
            mediaInfoBox.add(soundMediaHeaderBox);
        } else if (i == 3) {
            NodeBox nodeBox = new NodeBox(new Header("gmhd"));
            nodeBox.add(new GenericMediaInfoBox());
            NodeBox nodeBox2 = new NodeBox(new Header("tmcd"));
            nodeBox.add(nodeBox2);
            TimecodeMediaInfoBox timecodeMediaInfoBox = new TimecodeMediaInfoBox(0, 0, 12, new short[]{0, 0, 0}, new short[]{255, 255, 255}, "Lucida Grande");
            nodeBox2.add(timecodeMediaInfoBox);
            mediaInfoBox.add(nodeBox);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Handler ");
            sb.append(trackType.getHandler());
            sb.append(" not supported");
            throw new IllegalStateException(sb.toString());
        }
    }

    private static MovieHeaderBox movieHeader(NodeBox nodeBox, int i, long j, int i2) {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox(i2, j, 1.0f, 1.0f, new Date().getTime(), new Date().getTime(), new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, C6637f.f18605b}, i + 1);
        return movieHeaderBox;
    }

    private static void populateStblGeneric(NodeBox nodeBox, PacketChunk[] packetChunkArr, int i, CodecMeta codecMeta, int i2) throws IOException {
        NodeBox nodeBox2;
        int i3;
        int i4;
        int i5;
        NodeBox nodeBox3 = nodeBox;
        PacketChunk[] packetChunkArr2 = packetChunkArr;
        LongArrayList longArrayList = new LongArrayList(256000);
        IntArrayList intArrayList = new IntArrayList(256000);
        ArrayList arrayList = new ArrayList();
        IntArrayList intArrayList2 = new IntArrayList(4096);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        boolean z = true;
        while (i6 < packetChunkArr2.length) {
            PacketChunk packetChunk = packetChunkArr2[i6];
            if (packetChunk.getTrackNo() == i) {
                longArrayList.add(packetChunk.getPos());
                intArrayList.add(Math.max(0, packetChunk.getDataLen()));
                double duration = packetChunk.getPacket().getDuration();
                i3 = i6;
                double d = (double) i2;
                Double.isNaN(d);
                int round = (int) Math.round(duration * d);
                if (round != i10) {
                    if (i9 != -1) {
                        arrayList.add(new TimeToSampleEntry(i9, i10));
                    }
                    i10 = round;
                    i4 = 1;
                    i9 = 0;
                } else {
                    i4 = 1;
                }
                i9 += i4;
                boolean isKeyframe = packetChunk.getPacket().isKeyframe();
                z &= isKeyframe;
                if (isKeyframe) {
                    intArrayList2.add(packetChunk.getPacket().getFrameNo() + 1);
                }
                double pts = packetChunk.getPacket().getPts();
                Double.isNaN(d);
                int round2 = (int) (Math.round(pts * d) - j);
                if (round2 != i8) {
                    if (i7 > 0) {
                        arrayList2.add(new Entry(i7, i8));
                    }
                    i8 = round2;
                    i5 = 1;
                    i7 = 0;
                } else {
                    i5 = 1;
                }
                i7 += i5;
                j += (long) round;
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
            NodeBox nodeBox4 = nodeBox;
            packetChunkArr2 = packetChunkArr;
        }
        if (arrayList2.size() > 0) {
            arrayList2.add(new Entry(i7, i8));
        }
        if (i9 > 0) {
            arrayList.add(new TimeToSampleEntry(i9, i10));
        }
        if (!z) {
            nodeBox2 = nodeBox;
            nodeBox2.add(new SyncSamplesBox(intArrayList2.toArray()));
        } else {
            nodeBox2 = nodeBox;
        }
        nodeBox2.add(new ChunkOffsets64Box(longArrayList.toArray()));
        nodeBox2.add(new SampleToChunkBox(new SampleToChunkEntry[]{new SampleToChunkEntry(1, 1, 1)}));
        nodeBox2.add(new SampleSizesBox(intArrayList.toArray()));
        nodeBox2.add(new TimeToSampleBox((TimeToSampleEntry[]) arrayList.toArray(new TimeToSampleEntry[0])));
        compositionOffsets(arrayList2, nodeBox2);
    }

    private static void populateStblPCM(NodeBox nodeBox, PacketChunk[] packetChunkArr, int i, CodecMeta codecMeta) throws IOException {
        int i2;
        NodeBox nodeBox2 = nodeBox;
        PacketChunk[] packetChunkArr2 = packetChunkArr;
        AudioCodecMeta audioCodecMeta = (AudioCodecMeta) codecMeta;
        int frameSize = audioCodecMeta.getFrameSize();
        LongArrayList longArrayList = new LongArrayList(256000);
        ArrayList arrayList = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        int i8 = 1;
        while (i4 < packetChunkArr2.length) {
            PacketChunk packetChunk = packetChunkArr2[i4];
            int i9 = i4;
            if (packetChunk.getTrackNo() == i) {
                longArrayList.add(packetChunk.getPos());
                int dataLen = packetChunk.getDataLen() / frameSize;
                if (dataLen != i5) {
                    if (i5 != i3) {
                        i2 = dataLen;
                        arrayList.add(new SampleToChunkEntry((long) i6, i5, 1));
                    } else {
                        i2 = dataLen;
                    }
                    i6 = i8;
                    i5 = i2;
                } else {
                    i2 = dataLen;
                }
                i8++;
                i7 += i2;
            }
            i4 = i9 + 1;
            i3 = -1;
        }
        if (i5 != i3) {
            arrayList.add(new SampleToChunkEntry((long) i6, i5, 1));
        }
        nodeBox2.add(new ChunkOffsets64Box(longArrayList.toArray()));
        nodeBox2.add(new SampleToChunkBox((SampleToChunkEntry[]) arrayList.toArray(new SampleToChunkEntry[0])));
        nodeBox2.add(new SampleSizesBox(audioCodecMeta.getFrameSize(), i7));
        nodeBox2.add(new TimeToSampleBox(new TimeToSampleEntry[]{new TimeToSampleEntry(i7, 1)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer produceHeader(org.jcodec.movtool.streaming.VirtualMP4Movie.PacketChunk[] r45, org.jcodec.movtool.streaming.VirtualTrack[] r46, long r47, org.jcodec.containers.mp4.Brand r49) throws java.io.IOException {
        /*
            r0 = r45
            r1 = r46
            r2 = 6291456(0x600000, float:8.816208E-39)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            org.jcodec.containers.mp4.boxes.MovieBox r3 = new org.jcodec.containers.mp4.boxes.MovieBox
            r3.<init>()
            double[] r4 = calcTrackDurations(r45, r46)
            r5 = 1000(0x3e8, float:1.401E-42)
            long r14 = calcMovieDuration(r1, r5, r4)
            int r6 = r1.length
            org.jcodec.containers.mp4.boxes.MovieHeaderBox r6 = movieHeader(r3, r6, r14, r5)
            r3.add(r6)
            r13 = 0
        L_0x0022:
            int r6 = r1.length
            if (r13 >= r6) goto L_0x0212
            r11 = r1[r13]
            org.jcodec.movtool.streaming.CodecMeta r10 = r11.getCodecMeta()
            boolean r8 = r10 instanceof org.jcodec.movtool.streaming.AudioCodecMeta
            if (r8 == 0) goto L_0x003b
            r6 = r10
            org.jcodec.movtool.streaming.AudioCodecMeta r6 = (org.jcodec.movtool.streaming.AudioCodecMeta) r6
            boolean r6 = r6.isPCM()
            if (r6 == 0) goto L_0x003b
            r21 = 1
            goto L_0x003d
        L_0x003b:
            r21 = 0
        L_0x003d:
            int r6 = r11.getPreferredTimescale()
            if (r6 > 0) goto L_0x0052
            if (r21 == 0) goto L_0x004d
            r6 = r10
            org.jcodec.movtool.streaming.AudioCodecMeta r6 = (org.jcodec.movtool.streaming.AudioCodecMeta) r6
            int r6 = getPCMTs(r6, r0, r13)
            goto L_0x0058
        L_0x004d:
            int r6 = chooseTimescale(r0, r13)
            goto L_0x0058
        L_0x0052:
            r7 = 100
            if (r6 >= r7) goto L_0x005a
            int r6 = r6 * 1000
        L_0x0058:
            r7 = r6
            goto L_0x0066
        L_0x005a:
            if (r6 >= r5) goto L_0x005f
            int r6 = r6 * 100
            goto L_0x0058
        L_0x005f:
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r6 >= r7) goto L_0x0058
            int r6 = r6 * 10
            goto L_0x0058
        L_0x0066:
            double r5 = (double) r7
            r16 = r4[r13]
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r16
            long r5 = (long) r5
            org.jcodec.containers.mp4.boxes.TrakBox r12 = new org.jcodec.containers.mp4.boxes.TrakBox
            r12.<init>()
            org.jcodec.common.model.Size r9 = new org.jcodec.common.model.Size
            r1 = 0
            r9.<init>(r1, r1)
            r32 = r4
            org.jcodec.common.model.Size r4 = new org.jcodec.common.model.Size
            r4.<init>(r1, r1)
            boolean r1 = r10 instanceof org.jcodec.movtool.streaming.VideoCodecMeta
            if (r1 == 0) goto L_0x00b0
            r1 = r10
            org.jcodec.movtool.streaming.VideoCodecMeta r1 = (org.jcodec.movtool.streaming.VideoCodecMeta) r1
            org.jcodec.common.model.Rational r4 = r1.getPasp()
            if (r4 != 0) goto L_0x0097
            org.jcodec.common.model.Size r9 = r1.getSize()
            r18 = r5
            r1 = r9
            r4 = r1
            goto L_0x00b3
        L_0x0097:
            org.jcodec.common.model.Size r1 = r1.getSize()
            org.jcodec.common.model.Size r9 = new org.jcodec.common.model.Size
            r18 = r5
            int r5 = r1.getWidth()
            int r4 = r4.multiplyS(r5)
            int r5 = r1.getHeight()
            r9.<init>(r4, r5)
            r4 = r1
            goto L_0x00b2
        L_0x00b0:
            r18 = r5
        L_0x00b2:
            r1 = r9
        L_0x00b3:
            org.jcodec.containers.mp4.boxes.TrackHeaderBox r5 = new org.jcodec.containers.mp4.boxes.TrackHeaderBox
            int r33 = r13 + 1
            int r6 = r1.getWidth()
            float r9 = (float) r6
            int r6 = r1.getHeight()
            float r6 = (float) r6
            java.util.Date r20 = new java.util.Date
            r20.<init>()
            long r22 = r20.getTime()
            java.util.Date r20 = new java.util.Date
            r20.<init>()
            long r24 = r20.getTime()
            r20 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r27 = 0
            r29 = r6
            r6 = 9
            int[] r6 = new int[r6]
            r6 = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824} // fill-array
            r31 = r6
            r43 = r18
            r18 = r29
            r29 = r43
            r6 = r5
            r34 = r7
            r7 = r33
            r36 = r2
            r35 = r8
            r17 = r9
            r2 = 1
            r8 = r14
            r37 = r10
            r10 = r17
            r38 = r11
            r11 = r18
            r2 = r12
            r39 = r13
            r40 = 0
            r12 = r22
            r41 = r14
            r14 = r24
            r16 = r20
            r17 = r26
            r18 = r27
            r20 = r31
            r6.<init>(r7, r8, r10, r11, r12, r14, r16, r17, r18, r20)
            r6 = 15
            r5.setFlags(r6)
            r2.add(r5)
            org.jcodec.containers.mp4.boxes.MediaBox r5 = new org.jcodec.containers.mp4.boxes.MediaBox
            r5.<init>()
            r2.add(r5)
            org.jcodec.containers.mp4.boxes.MediaHeaderBox r6 = new org.jcodec.containers.mp4.boxes.MediaHeaderBox
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r27 = r7.getTime()
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r7 = r7.getTime()
            r31 = 0
            r22 = r6
            r23 = r34
            r24 = r29
            r29 = r7
            r22.<init>(r23, r24, r26, r27, r29, r31)
            r5.add(r6)
            if (r35 == 0) goto L_0x014e
            org.jcodec.containers.mp4.TrackType r6 = org.jcodec.containers.mp4.TrackType.SOUND
            goto L_0x0150
        L_0x014e:
            org.jcodec.containers.mp4.TrackType r6 = org.jcodec.containers.mp4.TrackType.VIDEO
        L_0x0150:
            org.jcodec.containers.mp4.TrackType r7 = org.jcodec.containers.mp4.TrackType.VIDEO
            if (r6 != r7) goto L_0x0193
            org.jcodec.containers.mp4.boxes.NodeBox r7 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r8 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r9 = "tapt"
            r8.<init>(r9)
            r7.<init>(r8)
            org.jcodec.containers.mp4.boxes.ClearApertureBox r8 = new org.jcodec.containers.mp4.boxes.ClearApertureBox
            int r9 = r1.getWidth()
            int r10 = r1.getHeight()
            r8.<init>(r9, r10)
            r7.add(r8)
            org.jcodec.containers.mp4.boxes.ProductionApertureBox r8 = new org.jcodec.containers.mp4.boxes.ProductionApertureBox
            int r9 = r1.getWidth()
            int r1 = r1.getHeight()
            r8.<init>(r9, r1)
            r7.add(r8)
            org.jcodec.containers.mp4.boxes.EncodedPixelBox r1 = new org.jcodec.containers.mp4.boxes.EncodedPixelBox
            int r8 = r4.getWidth()
            int r4 = r4.getHeight()
            r1.<init>(r8, r4)
            r7.add(r1)
            r2.add(r7)
        L_0x0193:
            org.jcodec.containers.mp4.boxes.HandlerBox r1 = new org.jcodec.containers.mp4.boxes.HandlerBox
            java.lang.String r11 = r6.getHandler()
            r13 = 0
            r14 = 0
            java.lang.String r10 = "mhlr"
            java.lang.String r12 = "appl"
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r5.add(r1)
            org.jcodec.containers.mp4.boxes.MediaInfoBox r1 = new org.jcodec.containers.mp4.boxes.MediaInfoBox
            r1.<init>()
            r5.add(r1)
            mediaHeader(r1, r6)
            org.jcodec.containers.mp4.boxes.HandlerBox r4 = new org.jcodec.containers.mp4.boxes.HandlerBox
            r11 = 0
            r12 = 0
            java.lang.String r8 = "dhlr"
            java.lang.String r9 = "url "
            java.lang.String r10 = "appl"
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r4)
            addDref(r1)
            org.jcodec.containers.mp4.boxes.NodeBox r4 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r5 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r6 = "stbl"
            r5.<init>(r6)
            r4.<init>(r5)
            r1.add(r4)
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox r1 = new org.jcodec.containers.mp4.boxes.SampleDescriptionBox
            r5 = 1
            org.jcodec.containers.mp4.boxes.SampleEntry[] r5 = new org.jcodec.containers.mp4.boxes.SampleEntry[r5]
            org.jcodec.containers.mp4.boxes.SampleEntry r6 = toSampleEntry(r37)
            r5[r40] = r6
            r1.<init>(r5)
            r4.add(r1)
            if (r21 == 0) goto L_0x01f1
            r1 = r37
            r12 = r39
            populateStblPCM(r4, r0, r12, r1)
            r6 = r34
            goto L_0x01fa
        L_0x01f1:
            r6 = r34
            r1 = r37
            r12 = r39
            populateStblGeneric(r4, r0, r12, r1, r6)
        L_0x01fa:
            r1 = r38
            r4 = 1000(0x3e8, float:1.401E-42)
            addEdits(r2, r1, r4, r6)
            r3.add(r2)
            r1 = r46
            r4 = r32
            r13 = r33
            r2 = r36
            r14 = r41
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0022
        L_0x0212:
            r36 = r2
            org.jcodec.containers.mp4.boxes.FileTypeBox r0 = r49.getFileTypeBox()
            r1 = r36
            r0.write(r1)
            r3.write(r1)
            org.jcodec.containers.mp4.boxes.Header r0 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "mdat"
            r3 = r47
            r0.<init>(r2, r3)
            r0.write(r1)
            r1.flip()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.MovieHelper.produceHeader(org.jcodec.movtool.streaming.VirtualMP4Movie$PacketChunk[], org.jcodec.movtool.streaming.VirtualTrack[], long, org.jcodec.containers.mp4.Brand):java.nio.ByteBuffer");
    }

    private static SampleEntry toSampleEntry(CodecMeta codecMeta) {
        Rational rational;
        SampleEntry sampleEntry;
        if ("avc1".equals(codecMeta.getFourcc())) {
            sampleEntry = H264Utils.createMOVSampleEntry(H264Utils.parseAVCC(codecMeta.getCodecPrivate().duplicate()));
            rational = ((VideoCodecMeta) codecMeta).getPasp();
        } else if (codecMeta instanceof VideoCodecMeta) {
            VideoCodecMeta videoCodecMeta = (VideoCodecMeta) codecMeta;
            Rational pasp = videoCodecMeta.getPasp();
            sampleEntry = MP4Muxer.videoSampleEntry(codecMeta.getFourcc(), videoCodecMeta.getSize(), "JCodec");
            rational = pasp;
        } else {
            AudioCodecMeta audioCodecMeta = (AudioCodecMeta) codecMeta;
            SampleEntry audioSampleEntry = MP4Muxer.audioSampleEntry(codecMeta.getFourcc(), 0, audioCodecMeta.getSampleSize(), audioCodecMeta.getChannelCount(), audioCodecMeta.getSampleRate(), audioCodecMeta.getEndian());
            ChannelBox channelBox = new ChannelBox();
            ChannelUtils.setLabels(audioCodecMeta.getChannelLabels(), channelBox);
            audioSampleEntry.add(channelBox);
            sampleEntry = audioSampleEntry;
            rational = null;
        }
        if (rational != null) {
            sampleEntry.add(new PixelAspectExt(rational));
        }
        return sampleEntry;
    }
}
