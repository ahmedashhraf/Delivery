package org.jcodec.containers.mps;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcodec.codecs.mpeg12.MPEGES;
import org.jcodec.codecs.mpeg12.SegmentReader;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.DemuxerTrackMeta.Type;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.containers.mps.MPEGDemuxer.MPEGDemuxerTrack;

public class MPSDemuxer extends SegmentReader implements MPEGDemuxer {
    private static final int BUFFER_SIZE = 1048576;
    private List<ByteBuffer> bufPool = new ArrayList();
    private SeekableByteChannel channel;
    private Map<Integer, BaseTrack> streams = new HashMap();

    public abstract class BaseTrack implements MPEGDemuxerTrack {
        protected List<PESPacket> pending = new ArrayList();
        protected int streamId;

        public BaseTrack(int i, PESPacket pESPacket) throws IOException {
            this.streamId = i;
            this.pending.add(pESPacket);
        }

        public List<PESPacket> getPending() {
            return this.pending;
        }

        public int getSid() {
            return this.streamId;
        }

        public void ignore() {
            List<PESPacket> list = this.pending;
            if (list != null) {
                for (PESPacket pESPacket : list) {
                    MPSDemuxer.this.putBack(pESPacket.data);
                }
                this.pending = null;
            }
        }

        public void pending(PESPacket pESPacket) {
            List<PESPacket> list = this.pending;
            if (list != null) {
                list.add(pESPacket);
            } else {
                MPSDemuxer.this.putBack(pESPacket.data);
            }
        }
    }

    public static class MPEGPacket extends Packet {
        private int gop;
        private long offset;
        private ByteBuffer seq;
        private int timecode;

        public MPEGPacket(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, TapeTimecode tapeTimecode) {
            super(byteBuffer, j, j2, j3, j4, z, tapeTimecode);
        }

        public int getGOP() {
            return this.gop;
        }

        public long getOffset() {
            return this.offset;
        }

        public ByteBuffer getSeq() {
            return this.seq;
        }

        public int getTimecode() {
            return this.timecode;
        }
    }

    public class MPEGTrack extends BaseTrack implements ReadableByteChannel {

        /* renamed from: es */
        private MPEGES f44847es = new MPEGES(this);

        public MPEGTrack(int i, PESPacket pESPacket) throws IOException {
            super(i, pESPacket);
        }

        private PESPacket getPacket() throws IOException {
            if (this.pending.size() > 0) {
                return (PESPacket) this.pending.remove(0);
            }
            while (true) {
                MPSDemuxer mPSDemuxer = MPSDemuxer.this;
                PESPacket nextPacket = mPSDemuxer.nextPacket(mPSDemuxer.getBuffer());
                if (nextPacket == null) {
                    return null;
                }
                if (nextPacket.streamId == this.streamId) {
                    long j = nextPacket.pts;
                    if (j != -1) {
                        this.f44847es.curPts = j;
                    }
                    return nextPacket;
                }
                MPSDemuxer.this.addToStream(nextPacket);
            }
        }

        public void close() throws IOException {
        }

        public MPEGES getES() {
            return this.f44847es;
        }

        public DemuxerTrackMeta getMeta() {
            Type type = MPSUtils.videoStream(this.streamId) ? Type.VIDEO : MPSUtils.audioStream(this.streamId) ? Type.AUDIO : Type.OTHER;
            DemuxerTrackMeta demuxerTrackMeta = new DemuxerTrackMeta(type, null, 0, 0.0d, null);
            return demuxerTrackMeta;
        }

        public boolean isOpen() {
            return true;
        }

        public Packet nextFrame(ByteBuffer byteBuffer) throws IOException {
            return this.f44847es.getFrame(byteBuffer);
        }

        public int read(ByteBuffer byteBuffer) throws IOException {
            PESPacket packet = this.pending.size() > 0 ? (PESPacket) this.pending.remove(0) : getPacket();
            if (packet == null || !packet.data.hasRemaining()) {
                return -1;
            }
            int min = Math.min(byteBuffer.remaining(), packet.data.remaining());
            byteBuffer.put(NIOUtils.read(packet.data, min));
            if (packet.data.hasRemaining()) {
                this.pending.add(0, packet);
            } else {
                MPSDemuxer.this.putBack(packet.data);
            }
            return min;
        }
    }

    public static class PESPacket {
        public ByteBuffer data;
        public long dts;
        public int length;
        public long pos;
        public long pts;
        public int streamId;

        public PESPacket(ByteBuffer byteBuffer, long j, int i, int i2, long j2, long j3) {
            this.data = byteBuffer;
            this.pts = j;
            this.streamId = i;
            this.length = i2;
            this.pos = j2;
            this.dts = j3;
        }
    }

    public class PlainTrack extends BaseTrack {
        private int frameNo;

        public PlainTrack(int i, PESPacket pESPacket) throws IOException {
            super(i, pESPacket);
        }

        public void close() throws IOException {
        }

        public DemuxerTrackMeta getMeta() {
            Type type = MPSUtils.videoStream(this.streamId) ? Type.VIDEO : MPSUtils.audioStream(this.streamId) ? Type.AUDIO : Type.OTHER;
            DemuxerTrackMeta demuxerTrackMeta = new DemuxerTrackMeta(type, null, 0, 0.0d, null);
            return demuxerTrackMeta;
        }

        public boolean isOpen() {
            return true;
        }

        public Packet nextFrame(ByteBuffer byteBuffer) throws IOException {
            PESPacket pESPacket;
            if (this.pending.size() <= 0) {
                while (true) {
                    MPSDemuxer mPSDemuxer = MPSDemuxer.this;
                    pESPacket = mPSDemuxer.nextPacket(mPSDemuxer.getBuffer());
                    if (pESPacket == null || pESPacket.streamId == this.streamId) {
                        break;
                    }
                    MPSDemuxer.this.addToStream(pESPacket);
                }
            } else {
                pESPacket = (PESPacket) this.pending.remove(0);
            }
            if (pESPacket == null) {
                return null;
            }
            ByteBuffer byteBuffer2 = pESPacket.data;
            long j = pESPacket.pts;
            int i = this.frameNo;
            this.frameNo = i + 1;
            Packet packet = new Packet(byteBuffer2, j, 90000, 0, (long) i, true, null);
            return packet;
        }
    }

    public MPSDemuxer(SeekableByteChannel seekableByteChannel) throws IOException {
        super(seekableByteChannel);
        this.channel = seekableByteChannel;
        findStreams();
    }

    /* access modifiers changed from: private */
    public void addToStream(PESPacket pESPacket) throws IOException {
        Object obj;
        BaseTrack baseTrack = (BaseTrack) this.streams.get(Integer.valueOf(pESPacket.streamId));
        if (baseTrack == null) {
            if (isMPEG(pESPacket.data)) {
                obj = new MPEGTrack(pESPacket.streamId, pESPacket);
            } else {
                obj = new PlainTrack(pESPacket.streamId, pESPacket);
            }
            this.streams.put(Integer.valueOf(pESPacket.streamId), obj);
            return;
        }
        baseTrack.pending(pESPacket);
    }

    private boolean isMPEG(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        byte b = -1;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (duplicate.hasRemaining()) {
            b = (b << 8) | (duplicate.get() & 255);
            if (b >= 256 && b <= 440) {
                if (b >= 432 && b <= 440) {
                    if ((z2 && b != 437 && b != 434) || z) {
                        break;
                    }
                    i += 5;
                } else if (b == 256) {
                    if (z) {
                        break;
                    }
                    z2 = true;
                } else if (b > 256 && b < 432) {
                    if (!z2) {
                        break;
                    }
                    if (!z) {
                        i += 50;
                        z = true;
                    }
                    i++;
                }
            }
        }
        if (i > 50) {
            return true;
        }
        return false;
    }

    public static int probe(ByteBuffer byteBuffer) {
        boolean z = false;
        byte b = -1;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            b = (b << 8) | (byteBuffer.get() & 255);
            if (b >= 256 && b <= 511) {
                if (!MPSUtils.videoMarker(b)) {
                    if (b >= 432 && b <= 440 && z) {
                        if ((z3 && b != 437 && b != 434) || z2) {
                            break;
                        }
                        i += 5;
                    } else if (b != 256 || !z) {
                        if (b > 256 && b < 432) {
                            if (!z3) {
                                break;
                            }
                            if (!z2) {
                                i += 50;
                                z2 = true;
                            }
                            i++;
                        }
                    } else if (z2) {
                        break;
                    } else {
                        z3 = true;
                    }
                } else if (z) {
                    break;
                } else {
                    z = true;
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void findStreams() throws IOException {
        int i = 0;
        while (true) {
            if (i == 0 || (i < this.streams.size() * 5 && this.streams.size() < 2)) {
                PESPacket nextPacket = nextPacket(getBuffer());
                if (nextPacket != null) {
                    addToStream(nextPacket);
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public List<MPEGDemuxerTrack> getAudioTracks() {
        ArrayList arrayList = new ArrayList();
        for (BaseTrack baseTrack : this.streams.values()) {
            if (MPSUtils.audioStream(baseTrack.streamId)) {
                arrayList.add(baseTrack);
            }
        }
        return arrayList;
    }

    public ByteBuffer getBuffer() {
        synchronized (this.bufPool) {
            if (this.bufPool.size() <= 0) {
                return ByteBuffer.allocate(1048576);
            }
            ByteBuffer byteBuffer = (ByteBuffer) this.bufPool.remove(0);
            return byteBuffer;
        }
    }

    public List<MPEGDemuxerTrack> getTracks() {
        return new ArrayList(this.streams.values());
    }

    public List<MPEGDemuxerTrack> getVideoTracks() {
        ArrayList arrayList = new ArrayList();
        for (BaseTrack baseTrack : this.streams.values()) {
            if (MPSUtils.videoStream(baseTrack.streamId)) {
                arrayList.add(baseTrack);
            }
        }
        return arrayList;
    }

    public PESPacket nextPacket(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (!MPSUtils.psMarker(this.curMarker)) {
            if (!skipToMarker()) {
                return null;
            }
        }
        ByteBuffer duplicate2 = duplicate.duplicate();
        readToNextMarker(duplicate);
        PESPacket readPESHeader = MPSUtils.readPESHeader(duplicate2, curPos());
        int i = readPESHeader.length;
        if (i == 0) {
            while (!MPSUtils.psMarker(this.curMarker)) {
                if (!readToNextMarker(duplicate)) {
                    break;
                }
            }
        } else {
            read(duplicate, (i - duplicate.position()) + 6);
        }
        duplicate2.limit(duplicate.position());
        readPESHeader.data = duplicate2;
        return readPESHeader;
    }

    public void putBack(ByteBuffer byteBuffer) {
        byteBuffer.clear();
        synchronized (this.bufPool) {
            this.bufPool.add(byteBuffer);
        }
    }

    public void reset() {
        for (BaseTrack baseTrack : this.streams.values()) {
            baseTrack.pending.clear();
        }
    }

    public void seekByte(long j) throws IOException {
        this.channel.position(j);
        reset();
    }
}
