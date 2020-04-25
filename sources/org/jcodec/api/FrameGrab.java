package org.jcodec.api;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.api.specific.AVCMP4Adaptor;
import org.jcodec.api.specific.ContainerAdaptor;
import org.jcodec.codecs.h264.H264Decoder;
import org.jcodec.codecs.mpeg12.MPEGDecoder;
import org.jcodec.codecs.prores.ProresDecoder;
import org.jcodec.common.DemuxerTrack;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.JCodecUtil.Format;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.demuxer.AbstractMP4DemuxerTrack;
import org.jcodec.containers.mp4.demuxer.MP4Demuxer;

public class FrameGrab {
    private ThreadLocal<int[][]> buffers = new ThreadLocal<>();
    private ContainerAdaptor decoder;
    private DemuxerTrack videoTrack;

    public static class MediaInfo {
        private Size dim;

        public MediaInfo(Size size) {
            this.dim = size;
        }

        public Size getDim() {
            return this.dim;
        }

        public void setDim(Size size) {
            this.dim = size;
        }
    }

    /* renamed from: org.jcodec.api.FrameGrab$a */
    static /* synthetic */ class C15482a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44712a = new int[Format.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.jcodec.common.JCodecUtil$Format[] r0 = org.jcodec.common.JCodecUtil.Format.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44712a = r0
                int[] r0 = f44712a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.common.JCodecUtil$Format r1 = org.jcodec.common.JCodecUtil.Format.MOV     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44712a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.common.JCodecUtil$Format r1 = org.jcodec.common.JCodecUtil.Format.MPEG_PS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44712a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.common.JCodecUtil$Format r1 = org.jcodec.common.JCodecUtil.Format.MPEG_TS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.api.FrameGrab.C15482a.<clinit>():void");
        }
    }

    public FrameGrab(SeekableByteChannel seekableByteChannel) throws IOException, JCodecException {
        ByteBuffer allocate = ByteBuffer.allocate(65536);
        seekableByteChannel.read(allocate);
        allocate.flip();
        int i = C15482a.f44712a[JCodecUtil.detectFormat(allocate).ordinal()];
        if (i == 1) {
            this.videoTrack = new MP4Demuxer(seekableByteChannel).getVideoTrack();
            decodeLeadingFrames();
        } else if (i == 2) {
            throw new UnsupportedFormatException("MPEG PS is temporarily unsupported.");
        } else if (i != 3) {
            throw new UnsupportedFormatException("Container format is not supported by JCodec");
        } else {
            throw new UnsupportedFormatException("MPEG TS is temporarily unsupported.");
        }
    }

    private VideoDecoder byFourcc(String str) {
        if (str.equals("avc1")) {
            return new H264Decoder();
        }
        if (str.equals("m1v1") || str.equals("m2v1")) {
            return new MPEGDecoder();
        }
        if (str.equals("apco") || str.equals("apcs") || str.equals("apcn") || str.equals("apch") || str.equals("ap4h")) {
            return new ProresDecoder();
        }
        return null;
    }

    private void decodeLeadingFrames() throws IOException, JCodecException {
        SeekableDemuxerTrack sdt = sdt();
        int curFrame = (int) sdt.getCurFrame();
        sdt.gotoFrame((long) detectKeyFrame(curFrame));
        Packet nextFrame = sdt.nextFrame();
        this.decoder = detectDecoder(sdt, nextFrame);
        while (true) {
            long j = (long) curFrame;
            if (nextFrame.getFrameNo() < j) {
                this.decoder.decodeFrame(nextFrame, getBuffer());
                nextFrame = sdt.nextFrame();
            } else {
                sdt.gotoFrame(j);
                return;
            }
        }
    }

    private ContainerAdaptor detectDecoder(SeekableDemuxerTrack seekableDemuxerTrack, Packet packet) throws JCodecException {
        if (seekableDemuxerTrack instanceof AbstractMP4DemuxerTrack) {
            AbstractMP4DemuxerTrack abstractMP4DemuxerTrack = (AbstractMP4DemuxerTrack) seekableDemuxerTrack;
            if (byFourcc(abstractMP4DemuxerTrack.getSampleEntries()[((MP4Packet) packet).getEntryNo()].getHeader().getFourcc()) instanceof H264Decoder) {
                return new AVCMP4Adaptor(abstractMP4DemuxerTrack.getSampleEntries());
            }
        }
        throw new UnsupportedFormatException("Codec is not supported");
    }

    private int detectKeyFrame(int i) throws IOException {
        int[] seekFrames = this.videoTrack.getMeta().getSeekFrames();
        if (seekFrames == null) {
            return i;
        }
        int i2 = seekFrames[0];
        int i3 = 1;
        while (i3 < seekFrames.length && seekFrames[i3] <= i) {
            i2 = seekFrames[i3];
            i3++;
        }
        return i2;
    }

    private int[][] getBuffer() {
        int[][] iArr = (int[][]) this.buffers.get();
        if (iArr != null) {
            return iArr;
        }
        int[][] allocatePicture = this.decoder.allocatePicture();
        this.buffers.set(allocatePicture);
        return allocatePicture;
    }

    public static Picture getNativeFrameSloppy(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, int i) throws IOException, JCodecException {
        return new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToFrameSloppy(i).getNativeFrame();
    }

    private void goToPrevKeyframe() throws IOException, JCodecException {
        sdt().gotoFrame((long) detectKeyFrame((int) sdt().getCurFrame()));
    }

    private SeekableDemuxerTrack sdt() throws JCodecException {
        DemuxerTrack demuxerTrack = this.videoTrack;
        if (demuxerTrack instanceof SeekableDemuxerTrack) {
            return (SeekableDemuxerTrack) demuxerTrack;
        }
        throw new JCodecException("Not a seekable track");
    }

    public MediaInfo getMediaInfo() {
        return this.decoder.getMediaInfo();
    }

    public Picture getNativeFrame() throws IOException {
        Packet nextFrame = this.videoTrack.nextFrame();
        if (nextFrame == null) {
            return null;
        }
        return this.decoder.decodeFrame(nextFrame, getBuffer());
    }

    public FrameGrab seekToFramePrecise(int i) throws IOException, JCodecException {
        sdt().gotoFrame((long) i);
        decodeLeadingFrames();
        return this;
    }

    public FrameGrab seekToFrameSloppy(int i) throws IOException, JCodecException {
        sdt().gotoFrame((long) i);
        goToPrevKeyframe();
        return this;
    }

    public FrameGrab seekToSecondPrecise(double d) throws IOException, JCodecException {
        sdt().seek(d);
        decodeLeadingFrames();
        return this;
    }

    public FrameGrab seekToSecondSloppy(double d) throws IOException, JCodecException {
        sdt().seek(d);
        goToPrevKeyframe();
        return this;
    }

    public static Picture getNativeFrameSloppy(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, double d) throws IOException, JCodecException {
        return new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToSecondSloppy(d).getNativeFrame();
    }

    public static Picture getNativeFrame(File file, double d) throws IOException, JCodecException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                Picture nativeFrame = new FrameGrab(fileChannelWrapper).seekToSecondPrecise(d).getNativeFrame();
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return nativeFrame;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public static Picture getNativeFrame(SeekableByteChannel seekableByteChannel, double d) throws JCodecException, IOException {
        return new FrameGrab(seekableByteChannel).seekToSecondPrecise(d).getNativeFrame();
    }

    public static Picture getNativeFrame(File file, int i) throws IOException, JCodecException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                Picture nativeFrame = new FrameGrab(fileChannelWrapper).seekToFramePrecise(i).getNativeFrame();
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return nativeFrame;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public static Picture getNativeFrame(SeekableByteChannel seekableByteChannel, int i) throws JCodecException, IOException {
        return new FrameGrab(seekableByteChannel).seekToFramePrecise(i).getNativeFrame();
    }

    public static Picture getNativeFrame(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, int i) throws IOException, JCodecException {
        return new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToFramePrecise(i).getNativeFrame();
    }

    public static Picture getNativeFrame(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor, double d) throws IOException, JCodecException {
        return new FrameGrab(seekableDemuxerTrack, containerAdaptor).seekToSecondPrecise(d).getNativeFrame();
    }

    public FrameGrab(SeekableDemuxerTrack seekableDemuxerTrack, ContainerAdaptor containerAdaptor) {
        this.videoTrack = seekableDemuxerTrack;
        this.decoder = containerAdaptor;
    }
}
