package org.jcodec.containers.mxf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.DemuxerTrackMeta.Type;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.Size;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.containers.mxf.MXFConst.MXFCodecMapping;
import org.jcodec.containers.mxf.model.C15568UL;
import org.jcodec.containers.mxf.model.FileDescriptor;
import org.jcodec.containers.mxf.model.GenericDescriptor;
import org.jcodec.containers.mxf.model.GenericPictureEssenceDescriptor;
import org.jcodec.containers.mxf.model.GenericSoundEssenceDescriptor;
import org.jcodec.containers.mxf.model.IndexSegment;
import org.jcodec.containers.mxf.model.KLV;
import org.jcodec.containers.mxf.model.MXFMetadata;
import org.jcodec.containers.mxf.model.MXFPartition;
import org.jcodec.containers.mxf.model.MXFUtil;
import org.jcodec.containers.mxf.model.TimecodeComponent;
import org.jcodec.containers.mxf.model.TimelineTrack;
import org.jcodec.containers.mxf.model.WaveAudioDescriptor;

public class MXFDemuxer {

    /* renamed from: ch */
    protected SeekableByteChannel f44896ch;
    protected double duration;
    protected MXFPartition header;
    protected List<IndexSegment> indexSegments;
    protected List<MXFMetadata> metadata;
    protected List<MXFPartition> partitions;
    protected TimecodeComponent timecode = ((TimecodeComponent) MXFUtil.findMeta(this.metadata, TimecodeComponent.class));
    protected int totalFrames;
    protected MXFDemuxerTrack[] tracks = findTracks();

    public static class Fast extends MXFDemuxer {
        public Fast(SeekableByteChannel seekableByteChannel) throws IOException {
            super(seekableByteChannel);
        }

        public void parseHeader(SeekableByteChannel seekableByteChannel) throws IOException {
            this.partitions = new ArrayList();
            this.metadata = new ArrayList();
            this.header = MXFDemuxer.readHeaderPartition(seekableByteChannel);
            this.metadata.addAll(MXFDemuxer.readPartitionMeta(seekableByteChannel, this.header));
            this.partitions.add(this.header);
            seekableByteChannel.position(this.header.getPack().getFooterPartition());
            KLV readKL = KLV.readKL(seekableByteChannel);
            this.metadata.addAll(MXFDemuxer.readPartitionMeta(seekableByteChannel, MXFPartition.read(readKL.key, NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) readKL.len), seekableByteChannel.position() - readKL.offset, seekableByteChannel.size())));
        }
    }

    public class MXFDemuxerTrack implements SeekableDemuxerTrack {
        private boolean audio;
        private int audioFrameDuration;
        private int audioTimescale;
        private MXFCodecMapping codec;
        private int dataLen;
        private GenericDescriptor descriptor;
        private C15568UL essenceUL;
        private int frameNo;
        private int indexSegmentIdx;
        private int indexSegmentSubIdx;
        private long partEssenceOffset;
        private int partIdx;
        private long pts;
        private TimelineTrack track;
        private boolean video;

        public MXFDemuxerTrack(C15568UL ul, TimelineTrack timelineTrack, GenericDescriptor genericDescriptor) throws IOException {
            this.essenceUL = ul;
            this.track = timelineTrack;
            this.descriptor = genericDescriptor;
            if (genericDescriptor instanceof GenericPictureEssenceDescriptor) {
                this.video = true;
            } else if (genericDescriptor instanceof GenericSoundEssenceDescriptor) {
                this.audio = true;
            }
            this.codec = resolveCodec();
            if (this.codec != null || (genericDescriptor instanceof WaveAudioDescriptor)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Track type: ");
                sb.append(this.video);
                sb.append(", ");
                sb.append(this.audio);
                Logger.warn(sb.toString());
                if (this.audio && (genericDescriptor instanceof WaveAudioDescriptor)) {
                    WaveAudioDescriptor waveAudioDescriptor = (WaveAudioDescriptor) genericDescriptor;
                    cacheAudioFrameSizes(MXFDemuxer.this.f44896ch);
                    this.audioFrameDuration = this.dataLen / ((waveAudioDescriptor.getQuantizationBits() >> 3) * waveAudioDescriptor.getChannelCount());
                    this.audioTimescale = (int) waveAudioDescriptor.getAudioSamplingRate().scalar();
                }
            }
        }

        private void cacheAudioFrameSizes(SeekableByteChannel seekableByteChannel) throws IOException {
            KLV readKL;
            for (MXFPartition mXFPartition : MXFDemuxer.this.partitions) {
                if (mXFPartition.getEssenceLength() > 0) {
                    seekableByteChannel.position(mXFPartition.getEssenceFilePos());
                    do {
                        readKL = KLV.readKL(seekableByteChannel);
                        if (readKL == null) {
                            break;
                        }
                        seekableByteChannel.position(seekableByteChannel.position() + readKL.len);
                    } while (!this.essenceUL.equals(readKL.key));
                    if (this.essenceUL.equals(readKL.key)) {
                        this.dataLen = (int) readKL.len;
                        return;
                    }
                }
            }
        }

        private MXFCodecMapping resolveCodec() {
            C15568UL ul;
            if (this.video) {
                ul = ((GenericPictureEssenceDescriptor) this.descriptor).getPictureEssenceCoding();
            } else {
                if (this.audio) {
                    ul = ((GenericSoundEssenceDescriptor) this.descriptor).getSoundEssenceCompression();
                }
                return null;
            }
            Iterator it = EnumSet.allOf(MXFCodecMapping.class).iterator();
            while (it.hasNext()) {
                MXFCodecMapping mXFCodecMapping = (MXFCodecMapping) it.next();
                if (mXFCodecMapping.getUl().equals(ul, 65407)) {
                    return mXFCodecMapping;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown codec: ");
            sb.append(ul);
            Logger.warn(sb.toString());
            return null;
        }

        public MXFCodecMapping getCodec() {
            return this.codec;
        }

        public long getCurFrame() {
            return (long) this.frameNo;
        }

        public GenericDescriptor getDescriptor() {
            return this.descriptor;
        }

        public double getDuration() {
            return MXFDemuxer.this.duration;
        }

        public C15568UL getEssenceUL() {
            return this.essenceUL;
        }

        public DemuxerTrackMeta getMeta() {
            Size size;
            if (this.video) {
                GenericPictureEssenceDescriptor genericPictureEssenceDescriptor = (GenericPictureEssenceDescriptor) this.descriptor;
                size = new Size(genericPictureEssenceDescriptor.getStoredWidth(), genericPictureEssenceDescriptor.getStoredHeight());
            } else {
                size = null;
            }
            Size size2 = size;
            Type type = this.video ? Type.VIDEO : this.audio ? Type.AUDIO : Type.OTHER;
            Type type2 = type;
            MXFDemuxer mXFDemuxer = MXFDemuxer.this;
            DemuxerTrackMeta demuxerTrackMeta = new DemuxerTrackMeta(type2, null, mXFDemuxer.totalFrames, mXFDemuxer.duration, size2);
            return demuxerTrackMeta;
        }

        public String getName() {
            return this.track.getName();
        }

        public int getNumFrames() {
            return MXFDemuxer.this.totalFrames;
        }

        public int getTrackId() {
            return this.track.getTrackId();
        }

        public boolean gotoFrame(long j) {
            if (j == ((long) this.frameNo)) {
                return true;
            }
            this.indexSegmentSubIdx = (int) j;
            this.indexSegmentIdx = 0;
            while (this.indexSegmentIdx < MXFDemuxer.this.indexSegments.size() && ((long) this.indexSegmentSubIdx) >= ((IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx)).getIndexDuration()) {
                this.indexSegmentSubIdx = (int) (((long) this.indexSegmentSubIdx) - ((IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx)).getIndexDuration());
                this.indexSegmentIdx++;
            }
            this.indexSegmentSubIdx = Math.min(this.indexSegmentSubIdx, (int) ((IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx)).getIndexDuration());
            return true;
        }

        public boolean gotoSyncFrame(long j) {
            if (!gotoFrame(j)) {
                return false;
            }
            return gotoFrame(j + ((long) ((IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx)).getIe().getKeyFrameOff()[this.indexSegmentSubIdx]));
        }

        public boolean isAudio() {
            return this.audio;
        }

        public boolean isVideo() {
            return this.video;
        }

        public Packet nextFrame() throws IOException {
            MXFPacket mXFPacket;
            if (this.indexSegmentIdx >= MXFDemuxer.this.indexSegments.size()) {
                return null;
            }
            IndexSegment indexSegment = (IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx);
            long[] fileOff = indexSegment.getIe().getFileOff();
            int indexEditRateNum = indexSegment.getIndexEditRateNum();
            int indexEditRateDen = indexSegment.getIndexEditRateDen();
            long j = fileOff[this.indexSegmentSubIdx];
            byte b = indexSegment.getIe().getDisplayOff()[this.indexSegmentSubIdx];
            boolean z = indexSegment.getIe().getKeyFrameOff()[this.indexSegmentSubIdx] == 0;
            while (j >= this.partEssenceOffset + ((MXFPartition) MXFDemuxer.this.partitions.get(this.partIdx)).getEssenceLength() && this.partIdx < MXFDemuxer.this.partitions.size() - 1) {
                this.partEssenceOffset += ((MXFPartition) MXFDemuxer.this.partitions.get(this.partIdx)).getEssenceLength();
                this.partIdx++;
            }
            long essenceFilePos = (j - this.partEssenceOffset) + ((MXFPartition) MXFDemuxer.this.partitions.get(this.partIdx)).getEssenceFilePos();
            if (!this.audio) {
                int i = this.dataLen;
                long j2 = this.pts + ((long) (b * indexEditRateDen));
                int i2 = this.frameNo;
                this.frameNo = i2 + 1;
                mXFPacket = readPacket(essenceFilePos, i, j2, indexEditRateNum, indexEditRateDen, i2, z);
                this.pts += (long) indexEditRateDen;
            } else {
                int i3 = this.dataLen;
                long j3 = this.pts;
                int i4 = this.audioTimescale;
                int i5 = this.audioFrameDuration;
                int i6 = this.frameNo;
                this.frameNo = i6 + 1;
                mXFPacket = readPacket(essenceFilePos, i3, j3, i4, i5, i6, z);
                this.pts += (long) this.audioFrameDuration;
            }
            this.indexSegmentSubIdx++;
            if (this.indexSegmentSubIdx >= fileOff.length) {
                this.indexSegmentIdx++;
                this.indexSegmentSubIdx = 0;
                if (this.dataLen == 0 && this.indexSegmentIdx < MXFDemuxer.this.indexSegments.size()) {
                    this.pts = (this.pts * ((long) ((IndexSegment) MXFDemuxer.this.indexSegments.get(this.indexSegmentIdx)).getIndexEditRateNum())) / ((long) indexEditRateNum);
                }
            }
            return mXFPacket;
        }

        public MXFPacket readPacket(long j, int i, long j2, int i2, int i3, int i4, boolean z) throws IOException {
            MXFPacket mXFPacket;
            synchronized (MXFDemuxer.this.f44896ch) {
                MXFDemuxer.this.f44896ch.position(j);
                KLV readKL = KLV.readKL(MXFDemuxer.this.f44896ch);
                while (readKL != null && !this.essenceUL.equals(readKL.key)) {
                    MXFDemuxer.this.f44896ch.position(MXFDemuxer.this.f44896ch.position() + readKL.len);
                    readKL = KLV.readKL(MXFDemuxer.this.f44896ch);
                }
                if (readKL == null || !this.essenceUL.equals(readKL.key)) {
                    mXFPacket = null;
                } else {
                    mXFPacket = new MXFPacket(NIOUtils.fetchFrom((ReadableByteChannel) MXFDemuxer.this.f44896ch, (int) readKL.len), j2, (long) i2, (long) i3, (long) i4, z, null, j, i);
                }
            }
            return mXFPacket;
        }

        public void seek(double d) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MXFPacket extends Packet {
        private int len;
        private long offset;

        public MXFPacket(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, TapeTimecode tapeTimecode, long j5, int i) {
            super(byteBuffer, j, j2, j3, j4, z, tapeTimecode);
            this.offset = j5;
            this.len = i;
        }

        public int getLen() {
            return this.len;
        }

        public long getOffset() {
            return this.offset;
        }
    }

    /* renamed from: org.jcodec.containers.mxf.MXFDemuxer$OP */
    public enum C15567OP {
        OP1a(1, 1),
        OP1b(1, 2),
        OP1c(1, 3),
        OP2a(2, 1),
        OP2b(2, 2),
        OP2c(2, 3),
        OP3a(3, 1),
        OP3b(3, 2),
        OP3c(3, 3),
        OPAtom(16, 0);
        
        public int major;
        public int minor;

        private C15567OP(int i, int i2) {
            this.major = i;
            this.minor = i2;
        }
    }

    public MXFDemuxer(SeekableByteChannel seekableByteChannel) throws IOException {
        this.f44896ch = seekableByteChannel;
        seekableByteChannel.position(0);
        parseHeader(seekableByteChannel);
        findIndex();
    }

    public static FileDescriptor findDescriptor(List<FileDescriptor> list, int i) {
        for (FileDescriptor fileDescriptor : list) {
            if (fileDescriptor.getLinkedTrackId() == i) {
                return fileDescriptor;
            }
        }
        return null;
    }

    private void findIndex() {
        this.indexSegments = new ArrayList();
        for (MXFMetadata mXFMetadata : this.metadata) {
            if (mXFMetadata instanceof IndexSegment) {
                IndexSegment indexSegment = (IndexSegment) mXFMetadata;
                this.indexSegments.add(indexSegment);
                this.totalFrames = (int) (((long) this.totalFrames) + indexSegment.getIndexDuration());
                double d = this.duration;
                double indexEditRateDen = (double) indexSegment.getIndexEditRateDen();
                double indexDuration = (double) indexSegment.getIndexDuration();
                Double.isNaN(indexEditRateDen);
                Double.isNaN(indexDuration);
                double d2 = indexEditRateDen * indexDuration;
                double indexEditRateNum = (double) indexSegment.getIndexEditRateNum();
                Double.isNaN(indexEditRateNum);
                this.duration = d + (d2 / indexEditRateNum);
            }
        }
    }

    private MXFDemuxerTrack[] findTracks() throws IOException {
        ArrayList arrayList = new ArrayList();
        List<TimelineTrack> findAllMeta = MXFUtil.findAllMeta(this.metadata, TimelineTrack.class);
        List findAllMeta2 = MXFUtil.findAllMeta(this.metadata, FileDescriptor.class);
        for (TimelineTrack timelineTrack : findAllMeta) {
            if (timelineTrack.getTrackNumber() != 0) {
                int trackNumber = timelineTrack.getTrackNumber();
                FileDescriptor findDescriptor = findDescriptor(findAllMeta2, timelineTrack.getTrackId());
                if (findDescriptor == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No generic descriptor for track: ");
                    sb.append(timelineTrack.getTrackId());
                    Logger.warn(sb.toString());
                    if (findAllMeta2.size() == 1 && ((FileDescriptor) findAllMeta2.get(0)).getLinkedTrackId() == 0) {
                        findDescriptor = (FileDescriptor) findAllMeta2.get(0);
                    }
                }
                if (findDescriptor == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Track without descriptor: ");
                    sb2.append(timelineTrack.getTrackId());
                    Logger.warn(sb2.toString());
                } else {
                    MXFDemuxerTrack createTrack = createTrack(new C15568UL(6, 14, 43, 52, 1, 2, 1, 1, 13, 1, 3, 1, (trackNumber >>> 24) & 255, (trackNumber >>> 16) & 255, (trackNumber >>> 8) & 255, trackNumber & 255), timelineTrack, findDescriptor);
                    if (createTrack.getCodec() != null || (findDescriptor instanceof WaveAudioDescriptor)) {
                        arrayList.add(createTrack);
                    }
                }
            }
        }
        return (MXFDemuxerTrack[]) arrayList.toArray(new MXFDemuxerTrack[0]);
    }

    private static MXFMetadata parseMeta(C15568UL ul, ByteBuffer byteBuffer) {
        Class cls = (Class) MXFConst.klMetadataMapping.get(ul);
        String str = "Unknown metadata piece: ";
        if (cls == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ul);
            Logger.warn(sb.toString());
            return null;
        }
        try {
            MXFMetadata mXFMetadata = (MXFMetadata) cls.getConstructor(new Class[]{C15568UL.class}).newInstance(new Object[]{ul});
            mXFMetadata.read(byteBuffer);
            return mXFMetadata;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(ul);
            Logger.warn(sb2.toString());
            return null;
        }
    }

    public static MXFPartition readHeaderPartition(SeekableByteChannel seekableByteChannel) throws IOException {
        while (true) {
            KLV readKL = KLV.readKL(seekableByteChannel);
            if (readKL == null) {
                return null;
            }
            if (MXFConst.HEADER_PARTITION_KLV.equals(readKL.key)) {
                return MXFPartition.read(readKL.key, NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) readKL.len), seekableByteChannel.position() - readKL.offset, 0);
            }
            seekableByteChannel.position(seekableByteChannel.position() + readKL.len);
        }
    }

    public static List<MXFMetadata> readPartitionMeta(SeekableByteChannel seekableByteChannel, MXFPartition mXFPartition) throws IOException {
        long position = seekableByteChannel.position();
        ArrayList arrayList = new ArrayList();
        ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) Math.max(0, mXFPartition.getEssenceFilePos() - position));
        while (fetchFrom.hasRemaining()) {
            KLV readKL = KLV.readKL(fetchFrom, position);
            if (readKL == null) {
                break;
            }
            MXFMetadata parseMeta = parseMeta(readKL.key, NIOUtils.read(fetchFrom, (int) readKL.len));
            if (parseMeta != null) {
                arrayList.add(parseMeta);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public MXFDemuxerTrack createTrack(C15568UL ul, TimelineTrack timelineTrack, GenericDescriptor genericDescriptor) throws IOException {
        return new MXFDemuxerTrack(ul, timelineTrack, genericDescriptor);
    }

    public MXFDemuxerTrack[] getAudioTracks() {
        MXFDemuxerTrack[] mXFDemuxerTrackArr;
        ArrayList arrayList = new ArrayList();
        for (MXFDemuxerTrack mXFDemuxerTrack : this.tracks) {
            if (mXFDemuxerTrack.isAudio()) {
                arrayList.add(mXFDemuxerTrack);
            }
        }
        return (MXFDemuxerTrack[]) arrayList.toArray(new MXFDemuxerTrack[0]);
    }

    public List<MXFPartition> getEssencePartitions() {
        return this.partitions;
    }

    public List<IndexSegment> getIndexes() {
        return this.indexSegments;
    }

    public C15567OP getOp() {
        C15568UL op = this.header.getPack().getOp();
        Iterator it = EnumSet.allOf(C15567OP.class).iterator();
        while (it.hasNext()) {
            C15567OP op2 = (C15567OP) it.next();
            if (op.get(12) == op2.major && op.get(13) == op2.minor) {
                return op2;
            }
        }
        return C15567OP.OPAtom;
    }

    public TimecodeComponent getTimecode() {
        return this.timecode;
    }

    public MXFDemuxerTrack[] getTracks() {
        return this.tracks;
    }

    public MXFDemuxerTrack getVideoTrack() {
        MXFDemuxerTrack[] mXFDemuxerTrackArr;
        for (MXFDemuxerTrack mXFDemuxerTrack : this.tracks) {
            if (mXFDemuxerTrack.isVideo()) {
                return mXFDemuxerTrack;
            }
        }
        return null;
    }

    public void parseHeader(SeekableByteChannel seekableByteChannel) throws IOException {
        this.header = readHeaderPartition(seekableByteChannel);
        this.metadata = new ArrayList();
        this.partitions = new ArrayList();
        long size = seekableByteChannel.size();
        seekableByteChannel.position(this.header.getPack().getFooterPartition());
        do {
            long j = size;
            size = seekableByteChannel.position();
            KLV readKL = KLV.readKL(seekableByteChannel);
            this.header = MXFPartition.read(readKL.key, NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) readKL.len), seekableByteChannel.position() - readKL.offset, j);
            if (this.header.getPack().getNbEssenceContainers() > 0) {
                this.partitions.add(0, this.header);
            }
            this.metadata.addAll(0, readPartitionMeta(seekableByteChannel, this.header));
            seekableByteChannel.position(this.header.getPack().getPrevPartition());
        } while (this.header.getPack().getThisPartition() != 0);
    }
}
