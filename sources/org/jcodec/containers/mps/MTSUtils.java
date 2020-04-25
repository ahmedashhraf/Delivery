package org.jcodec.containers.mps;

import com.google.common.base.C5785c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.EnumSet;
import java.util.Iterator;
import org.jcodec.common.Assert;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.psi.PATSection;
import org.jcodec.containers.mps.psi.PMTSection;
import org.jcodec.containers.mps.psi.PMTSection.PMTStream;
import org.jcodec.containers.mps.psi.PSISection;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSUtils {

    public enum StreamType {
        RESERVED(0, false, false),
        VIDEO_MPEG1(1, true, false),
        VIDEO_MPEG2(2, true, false),
        AUDIO_MPEG1(3, false, true),
        AUDIO_MPEG2(4, false, true),
        PRIVATE_SECTION(5, false, false),
        PRIVATE_DATA(6, false, false),
        MHEG(7, false, false),
        DSM_CC(8, false, false),
        ATM_SYNC(9, false, false),
        DSM_CC_A(10, false, false),
        DSM_CC_B(11, false, false),
        DSM_CC_C(12, false, false),
        DSM_CC_D(13, false, false),
        MPEG_AUX(14, false, false),
        AUDIO_AAC_ADTS(15, false, true),
        VIDEO_MPEG4(16, true, false),
        AUDIO_AAC_LATM(17, false, true),
        FLEXMUX_PES(18, false, false),
        FLEXMUX_SEC(19, false, false),
        DSM_CC_SDP(20, false, false),
        META_PES(21, false, false),
        META_SEC(22, false, false),
        DSM_CC_DATA_CAROUSEL(23, false, false),
        DSM_CC_OBJ_CAROUSEL(24, false, false),
        DSM_CC_SDP1(25, false, false),
        IPMP(26, false, false),
        VIDEO_H264(27, true, false),
        AUDIO_AAC_RAW(28, false, true),
        SUBS(29, false, false),
        AUX_3D(30, false, false),
        VIDEO_AVC_SVC(31, true, false),
        VIDEO_AVC_MVC(32, true, false),
        VIDEO_J2K(33, true, false),
        VIDEO_MPEG2_3D(34, true, false),
        VIDEO_H264_3D(35, true, false),
        VIDEO_CAVS(66, false, true),
        IPMP_STREAM(C13959t.f40827P1, false, false),
        AUDIO_AC3(C13959t.f40835R1, false, true),
        AUDIO_DTS(C13959t.f40872a2, false, true);
        
        private static EnumSet<StreamType> typeEnum;
        private boolean audio;
        private int tag;
        private boolean video;

        static {
            typeEnum = EnumSet.allOf(StreamType.class);
        }

        private StreamType(int i, boolean z, boolean z2) {
            this.tag = i;
            this.video = z;
            this.audio = z2;
        }

        public static StreamType fromTag(int i) {
            Iterator it = typeEnum.iterator();
            while (it.hasNext()) {
                StreamType streamType = (StreamType) it.next();
                if (streamType.tag == i) {
                    return streamType;
                }
            }
            return null;
        }

        public int getTag() {
            return this.tag;
        }

        public boolean isAudio() {
            return this.audio;
        }

        public boolean isVideo() {
            return this.video;
        }
    }

    public static abstract class TSReader {
        public static final int BUFFER_SIZE = 96256;

        /* access modifiers changed from: protected */
        public abstract boolean onPkt(int i, boolean z, ByteBuffer byteBuffer, long j);

        public void readTsFile(SeekableByteChannel seekableByteChannel) throws IOException {
            seekableByteChannel.position(0);
            ByteBuffer allocate = ByteBuffer.allocate(96256);
            while (true) {
                long position = seekableByteChannel.position();
                if (seekableByteChannel.read(allocate) != -1) {
                    allocate.flip();
                    while (allocate.hasRemaining()) {
                        ByteBuffer read = NIOUtils.read(allocate, (int) C13959t.f40864Y2);
                        position += 188;
                        Assert.assertEquals(71, (int) read.get() & 255);
                        byte b = ((read.get() & 255) << 8) | (read.get() & 255);
                        byte b2 = b & 8191;
                        int i = (b >> C5785c.f16697p) & 1;
                        if ((read.get() & 255 & 32) != 0) {
                            NIOUtils.skip(read, read.get() & 255);
                        }
                        boolean z = false;
                        if (i == 1 && (NIOUtils.getRel(read, NIOUtils.getRel(read, 0) + 2) & 128) == 128) {
                            NIOUtils.skip(read, read.get() & 255);
                        }
                        if (i == 1) {
                            z = true;
                        }
                        if (!onPkt(b2, z, read, position - ((long) read.remaining()))) {
                            return;
                        }
                    }
                    allocate.flip();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: org.jcodec.containers.mps.MTSUtils$b */
    private static class C15554b extends TSReader {

        /* renamed from: a */
        private int f44863a;

        /* renamed from: b */
        private PMTSection f44864b;

        private C15554b() {
            this.f44863a = -1;
        }

        /* renamed from: a */
        public PMTSection mo49117a() {
            return this.f44864b;
        }

        /* access modifiers changed from: protected */
        public boolean onPkt(int i, boolean z, ByteBuffer byteBuffer, long j) {
            if (i == 0) {
                this.f44863a = MTSUtils.parsePAT(byteBuffer);
            } else {
                int i2 = this.f44863a;
                if (i2 != -1 && i == i2) {
                    this.f44864b = MTSUtils.parsePMT(byteBuffer);
                    return false;
                }
            }
            return true;
        }
    }

    private static int[] filterMediaPids(PMTStream[] pMTStreamArr) {
        IntArrayList intArrayList = new IntArrayList();
        for (PMTStream pMTStream : pMTStreamArr) {
            if (pMTStream.getStreamType().isVideo() || pMTStream.getStreamType().isAudio()) {
                intArrayList.add(pMTStream.getPid());
            }
        }
        return intArrayList.toArray();
    }

    public static int getAudioPid(File file) throws IOException {
        PMTStream[] programGuids;
        for (PMTStream pMTStream : getProgramGuids(file)) {
            if (pMTStream.getStreamType().isVideo()) {
                return pMTStream.getPid();
            }
        }
        throw new RuntimeException("No video stream");
    }

    public static int[] getMediaPids(SeekableByteChannel seekableByteChannel) throws IOException {
        return filterMediaPids(getProgramGuids(seekableByteChannel));
    }

    public static PMTStream[] getProgramGuids(File file) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                PMTStream[] programGuids = getProgramGuids((SeekableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return programGuids;
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

    public static int getVideoPid(File file) throws IOException {
        PMTStream[] programGuids;
        for (PMTStream pMTStream : getProgramGuids(file)) {
            if (pMTStream.getStreamType().isVideo()) {
                return pMTStream.getPid();
            }
        }
        throw new RuntimeException("No video stream");
    }

    private static void parseEsInfo(ByteBuffer byteBuffer) {
    }

    @Deprecated
    public static int parsePAT(ByteBuffer byteBuffer) {
        PATSection parse = PATSection.parse(byteBuffer);
        if (parse.getPrograms().size() > 0) {
            return parse.getPrograms().values()[0];
        }
        return -1;
    }

    @Deprecated
    public static PMTSection parsePMT(ByteBuffer byteBuffer) {
        return PMTSection.parse(byteBuffer);
    }

    @Deprecated
    public static PSISection parseSection(ByteBuffer byteBuffer) {
        return PSISection.parse(byteBuffer);
    }

    public static int[] getMediaPids(File file) throws IOException {
        return filterMediaPids(getProgramGuids(file));
    }

    public static PMTStream[] getProgramGuids(SeekableByteChannel seekableByteChannel) throws IOException {
        C15554b bVar = new C15554b();
        bVar.readTsFile(seekableByteChannel);
        return bVar.mo49117a().getStreams();
    }
}
