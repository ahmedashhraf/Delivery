package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.LeafBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.demuxer.AbstractMP4DemuxerTrack;
import org.jcodec.containers.mp4.demuxer.FramesMP4DemuxerTrack;
import org.jcodec.containers.mp4.demuxer.PCMMP4DemuxerTrack;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class RealTrack implements VirtualTrack {
    private AbstractMP4DemuxerTrack demuxer;
    private MovieBox movie;
    /* access modifiers changed from: private */
    public ByteChannelPool pool;
    private TrakBox trak;

    public class RealPacket implements VirtualPacket {
        private MP4Packet packet;

        public RealPacket(MP4Packet mP4Packet) {
            this.packet = mP4Packet;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.nio.ByteBuffer getData() throws java.io.IOException {
            /*
                r8 = this;
                org.jcodec.containers.mp4.MP4Packet r0 = r8.packet
                int r0 = r0.getSize()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1 = 0
                org.jcodec.movtool.streaming.tracks.RealTrack r2 = org.jcodec.movtool.streaming.tracks.RealTrack.this     // Catch:{ all -> 0x0040 }
                org.jcodec.movtool.streaming.tracks.ByteChannelPool r2 = r2.pool     // Catch:{ all -> 0x0040 }
                org.jcodec.common.SeekableByteChannel r2 = r2.getChannel()     // Catch:{ all -> 0x0040 }
                org.jcodec.containers.mp4.MP4Packet r3 = r8.packet     // Catch:{ all -> 0x003e }
                long r3 = r3.getFileOff()     // Catch:{ all -> 0x003e }
                long r5 = r2.size()     // Catch:{ all -> 0x003e }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0029
                if (r2 == 0) goto L_0x0028
                r2.close()
            L_0x0028:
                return r1
            L_0x0029:
                org.jcodec.containers.mp4.MP4Packet r1 = r8.packet     // Catch:{ all -> 0x003e }
                long r3 = r1.getFileOff()     // Catch:{ all -> 0x003e }
                r2.position(r3)     // Catch:{ all -> 0x003e }
                r2.read(r0)     // Catch:{ all -> 0x003e }
                r0.flip()     // Catch:{ all -> 0x003e }
                if (r2 == 0) goto L_0x003d
                r2.close()
            L_0x003d:
                return r0
            L_0x003e:
                r0 = move-exception
                goto L_0x0042
            L_0x0040:
                r0 = move-exception
                r2 = r1
            L_0x0042:
                if (r2 == 0) goto L_0x0047
                r2.close()
            L_0x0047:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.RealTrack.RealPacket.getData():java.nio.ByteBuffer");
        }

        public int getDataLen() {
            return this.packet.getSize();
        }

        public double getDuration() {
            double duration = (double) this.packet.getDuration();
            double timescale = (double) this.packet.getTimescale();
            Double.isNaN(duration);
            Double.isNaN(timescale);
            return duration / timescale;
        }

        public int getFrameNo() {
            return (int) this.packet.getFrameNo();
        }

        public double getPts() {
            double mediaPts = (double) this.packet.getMediaPts();
            double timescale = (double) this.packet.getTimescale();
            Double.isNaN(mediaPts);
            Double.isNaN(timescale);
            return mediaPts / timescale;
        }

        public boolean isKeyframe() {
            return this.packet.isKeyFrame() || this.packet.isPsync();
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.RealTrack$a */
    class C15584a extends FramesMP4DemuxerTrack {
        C15584a(MovieBox movieBox, TrakBox trakBox, SeekableByteChannel seekableByteChannel) {
            super(movieBox, trakBox, seekableByteChannel);
        }

        /* access modifiers changed from: protected */
        public ByteBuffer readPacketData(SeekableByteChannel seekableByteChannel, ByteBuffer byteBuffer, long j, int i) throws IOException {
            return byteBuffer;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.RealTrack$b */
    class C15585b extends PCMMP4DemuxerTrack {
        C15585b(MovieBox movieBox, TrakBox trakBox, SeekableByteChannel seekableByteChannel) {
            super(movieBox, trakBox, seekableByteChannel);
        }

        /* access modifiers changed from: protected */
        public ByteBuffer readPacketData(SeekableByteChannel seekableByteChannel, ByteBuffer byteBuffer, long j, int i) throws IOException {
            return byteBuffer;
        }
    }

    public RealTrack(MovieBox movieBox, TrakBox trakBox, ByteChannelPool byteChannelPool) {
        this.movie = movieBox;
        if (((SampleSizesBox) Box.findFirst(trakBox, SampleSizesBox.class, "mdia", "minf", "stbl", "stsz")).getDefaultSize() == 0) {
            this.demuxer = new C15584a(movieBox, trakBox, null);
        } else {
            this.demuxer = new C15585b(movieBox, trakBox, null);
        }
        this.trak = trakBox;
        this.pool = byteChannelPool;
    }

    private ByteBuffer extractVideoCodecPrivate(SampleEntry sampleEntry) {
        if (!"avc1".equals(sampleEntry.getFourcc())) {
            return null;
        }
        return ((LeafBox) Box.findFirst(sampleEntry, LeafBox.class, "avcC")).getData();
    }

    public void close() {
        this.pool.close();
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.nio.ByteBuffer] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jcodec.movtool.streaming.CodecMeta getCodecMeta() {
        /*
            r14 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.LeafBox> r0 = org.jcodec.containers.mp4.boxes.LeafBox.class
            org.jcodec.containers.mp4.boxes.TrakBox r1 = r14.trak
            org.jcodec.containers.mp4.boxes.SampleEntry[] r1 = r1.getSampleEntries()
            r2 = 0
            r1 = r1[r2]
            boolean r3 = r1 instanceof org.jcodec.containers.mp4.boxes.VideoSampleEntry
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0062
            r0 = r1
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r0 = (org.jcodec.containers.mp4.boxes.VideoSampleEntry) r0
            java.lang.Class<org.jcodec.containers.mp4.boxes.PixelAspectExt> r3 = org.jcodec.containers.mp4.boxes.PixelAspectExt.class
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "pasp"
            r6[r2] = r7
            java.lang.Object r3 = org.jcodec.containers.mp4.boxes.Box.findFirst(r1, r3, r6)
            org.jcodec.containers.mp4.boxes.PixelAspectExt r3 = (org.jcodec.containers.mp4.boxes.PixelAspectExt) r3
            java.lang.Class<org.jcodec.containers.mp4.boxes.FielExtension> r6 = org.jcodec.containers.mp4.boxes.FielExtension.class
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r7 = "fiel"
            r5[r2] = r7
            java.lang.Object r5 = org.jcodec.containers.mp4.boxes.Box.findFirst(r1, r6, r5)
            org.jcodec.containers.mp4.boxes.FielExtension r5 = (org.jcodec.containers.mp4.boxes.FielExtension) r5
            if (r5 == 0) goto L_0x003d
            boolean r2 = r5.isInterlaced()
            boolean r5 = r5.topFieldFirst()
            r11 = r2
            r12 = r5
            goto L_0x003f
        L_0x003d:
            r11 = 0
            r12 = 0
        L_0x003f:
            org.jcodec.movtool.streaming.VideoCodecMeta r2 = new org.jcodec.movtool.streaming.VideoCodecMeta
            java.lang.String r7 = r1.getFourcc()
            java.nio.ByteBuffer r8 = r14.extractVideoCodecPrivate(r1)
            org.jcodec.common.model.Size r9 = new org.jcodec.common.model.Size
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r9.<init>(r1, r0)
            if (r3 == 0) goto L_0x005c
            org.jcodec.common.model.Rational r4 = r3.getRational()
        L_0x005c:
            r10 = r4
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r2
        L_0x0062:
            boolean r3 = r1 instanceof org.jcodec.containers.mp4.boxes.AudioSampleEntry
            if (r3 == 0) goto L_0x00ba
            r3 = r1
            org.jcodec.containers.mp4.boxes.AudioSampleEntry r3 = (org.jcodec.containers.mp4.boxes.AudioSampleEntry) r3
            java.lang.String r6 = r3.getFourcc()
            java.lang.String r7 = "mp4a"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0095
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "esds"
            r6[r2] = r7
            java.lang.Object r6 = org.jcodec.containers.mp4.boxes.Box.findFirst(r1, r0, r6)
            org.jcodec.containers.mp4.boxes.LeafBox r6 = (org.jcodec.containers.mp4.boxes.LeafBox) r6
            if (r6 != 0) goto L_0x0091
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r2] = r4
            r6[r5] = r7
            java.lang.Object r0 = org.jcodec.containers.mp4.boxes.Box.findFirst(r1, r0, r6)
            r6 = r0
            org.jcodec.containers.mp4.boxes.LeafBox r6 = (org.jcodec.containers.mp4.boxes.LeafBox) r6
        L_0x0091:
            java.nio.ByteBuffer r4 = r6.getData()
        L_0x0095:
            r13 = r4
            org.jcodec.movtool.streaming.AudioCodecMeta r0 = new org.jcodec.movtool.streaming.AudioCodecMeta
            java.lang.String r6 = r1.getFourcc()
            int r7 = r3.calcSampleSize()
            short r8 = r3.getChannelCount()
            float r1 = r3.getSampleRate()
            int r9 = (int) r1
            org.jcodec.containers.mp4.boxes.EndianBox$Endian r10 = r3.getEndian()
            boolean r11 = r3.isPCM()
            org.jcodec.containers.mp4.boxes.channel.Label[] r12 = org.jcodec.containers.mp4.boxes.channel.ChannelUtils.getLabels(r3)
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x00ba:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sample entry '"
            r2.append(r3)
            java.lang.String r1 = r1.getFourcc()
            r2.append(r1)
            java.lang.String r1 = "' is not supported."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.RealTrack.getCodecMeta():org.jcodec.movtool.streaming.CodecMeta");
    }

    public VirtualEdit[] getEdits() {
        List edits = this.demuxer.getEdits();
        if (edits == null) {
            return null;
        }
        VirtualEdit[] virtualEditArr = new VirtualEdit[edits.size()];
        for (int i = 0; i < edits.size(); i++) {
            Edit edit = (Edit) edits.get(i);
            double mediaTime = (double) edit.getMediaTime();
            double timescale = (double) this.trak.getTimescale();
            Double.isNaN(mediaTime);
            Double.isNaN(timescale);
            double d = mediaTime / timescale;
            double duration = (double) edit.getDuration();
            double timescale2 = (double) this.movie.getTimescale();
            Double.isNaN(duration);
            Double.isNaN(timescale2);
            virtualEditArr[i] = new VirtualEdit(d, duration / timescale2);
        }
        return virtualEditArr;
    }

    public int getPreferredTimescale() {
        return (int) this.demuxer.getTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        MP4Packet nextFrame = this.demuxer.nextFrame(null);
        if (nextFrame == null) {
            return null;
        }
        return new RealPacket(nextFrame);
    }
}
