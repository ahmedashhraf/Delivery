package org.jcodec.codecs.mpeg12;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.Codec;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.NIOUtils.FileReader;
import org.jcodec.common.NIOUtils.FileReaderListener;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.ChannelLabel;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.containers.mps.MPSUtils.PESReader;

public class MPSMediaInfo extends PESReader {
    private Map<Integer, MPEGTrackMetadata> infos = new HashMap();
    private int pesTried;
    private PSM psm;

    public class MPEGTimecodeMetadata {
        public MPEGTimecodeMetadata() {
        }

        public String getNumFrames() {
            return null;
        }

        public String getStartCounter() {
            return null;
        }

        public String isDropFrame() {
            return null;
        }
    }

    public class MPEGTrackMetadata {
        Codec codec;
        ByteBuffer probeData;
        int streamId;

        public MPEGTrackMetadata(int i) {
            this.streamId = i;
        }

        public AudioFormat getAudioFormat() {
            return null;
        }

        public ChannelLabel[] getChannelLables() {
            return null;
        }

        public Size getCodedSize() {
            return null;
        }

        public Size getDisplaySize() {
            return null;
        }

        public float getDuration() {
            return 0.0f;
        }

        public String getFourcc() {
            return null;
        }

        public float getFps() {
            return 0.0f;
        }

        public Rational getFpsR() {
            return null;
        }

        public int getNumFrames() {
            return 0;
        }

        public MPEGTimecodeMetadata getTimecode() {
            return null;
        }
    }

    public class MediaInfoDone extends RuntimeException {
        public MediaInfoDone() {
        }
    }

    public static class PSM {
    }

    /* renamed from: org.jcodec.codecs.mpeg12.MPSMediaInfo$a */
    class C15530a extends FileReader {
        C15530a() {
        }

        /* access modifiers changed from: protected */
        public void data(ByteBuffer byteBuffer, long j) {
            MPSMediaInfo.this.analyseBuffer(byteBuffer, j);
        }

        /* access modifiers changed from: protected */
        public void done() {
        }
    }

    private void deriveMediaInfo() {
        for (MPEGTrackMetadata mPEGTrackMetadata : this.infos.values()) {
            int i = mPEGTrackMetadata.streamId | 256;
            if (i >= 448 && i <= 479) {
                mPEGTrackMetadata.codec = Codec.MP2;
            } else if (i == 445) {
                ByteBuffer duplicate = mPEGTrackMetadata.probeData.duplicate();
                MPSUtils.readPESHeader(duplicate, 0);
                byte b = duplicate.get() & 255;
                if (b >= 128 && b <= 135) {
                    mPEGTrackMetadata.codec = Codec.AC3;
                } else if ((b >= 136 && b <= 143) || (b >= 152 && b <= 159)) {
                    mPEGTrackMetadata.codec = Codec.DTS;
                } else if (b >= 160 && b <= 175) {
                    mPEGTrackMetadata.codec = Codec.PCM_DVD;
                } else if (b >= 176 && b <= 191) {
                    mPEGTrackMetadata.codec = Codec.TRUEHD;
                } else if (b >= 192 && b <= 207) {
                    mPEGTrackMetadata.codec = Codec.AC3;
                }
            } else if (i >= 480 && i <= 495) {
                mPEGTrackMetadata.codec = Codec.MPEG2;
            }
        }
    }

    public static MPSMediaInfo extract(SeekableByteChannel seekableByteChannel) {
        return null;
    }

    public static void main(String[] strArr) throws IOException {
        new MPSMediaInfo().getMediaInfo(new File(strArr[0]));
    }

    private void parseElStreams(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            byteBuffer.get();
            byteBuffer.get();
            NIOUtils.read(byteBuffer, (int) byteBuffer.getShort() & 65535);
        }
    }

    private PSM parsePSM(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        String str = "Invalid PSM";
        if (byteBuffer.getShort() <= 1018) {
            byteBuffer.get();
            if ((byteBuffer.get() & 1) == 1) {
                NIOUtils.read(byteBuffer, (int) byteBuffer.getShort() & 65535);
                parseElStreams(NIOUtils.read(byteBuffer, (int) byteBuffer.getShort() & 65535));
                byteBuffer.getInt();
                return new PSM();
            }
            throw new RuntimeException(str);
        }
        throw new RuntimeException(str);
    }

    private int[] parseSystem(ByteBuffer byteBuffer) {
        NIOUtils.skip(byteBuffer, 12);
        IntArrayList intArrayList = new IntArrayList();
        while (byteBuffer.remaining() >= 3 && (byteBuffer.get(byteBuffer.position()) & 128) == 128) {
            intArrayList.add(byteBuffer.get() & 255);
            byteBuffer.getShort();
        }
        return intArrayList.toArray();
    }

    public List<MPEGTrackMetadata> getAudioTracks() {
        return null;
    }

    public List<MPEGTrackMetadata> getInfos() {
        return new ArrayList(this.infos.values());
    }

    public List<MPEGTrackMetadata> getMediaInfo(File file) throws IOException {
        try {
            new C15530a().readFile(file, 65536, (FileReaderListener) null);
        } catch (MediaInfoDone unused) {
            Logger.info("Media info done");
        }
        return getInfos();
    }

    public MPEGTrackMetadata getVideoTrack() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void pes(ByteBuffer byteBuffer, long j, int i, int i2) {
        if (MPSUtils.mediaStream(i2)) {
            MPEGTrackMetadata mPEGTrackMetadata = (MPEGTrackMetadata) this.infos.get(Integer.valueOf(i2));
            if (mPEGTrackMetadata == null) {
                mPEGTrackMetadata = new MPEGTrackMetadata(i2);
                this.infos.put(Integer.valueOf(i2), mPEGTrackMetadata);
            }
            if (mPEGTrackMetadata.probeData == null) {
                mPEGTrackMetadata.probeData = NIOUtils.cloneBuffer(byteBuffer);
            }
            int i3 = this.pesTried + 1;
            this.pesTried = i3;
            if (i3 >= 100) {
                deriveMediaInfo();
                throw new MediaInfoDone();
            }
        }
    }
}
