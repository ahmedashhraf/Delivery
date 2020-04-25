package org.jcodec.containers.mp4.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.DemuxerTrackMeta.Type;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.QTTimeUtil;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SyncSamplesBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class FramesMP4DemuxerTrack extends AbstractMP4DemuxerTrack {
    private Entry[] compOffsets;
    private int cttsInd;
    private int cttsSubInd;
    private SeekableByteChannel input;
    private MovieBox movie;
    private int noInChunk;
    private long offInChunk;
    private int[] partialSync;
    private int psOff;
    private int[] sizes;
    private int ssOff;
    private int[] syncSamples;

    public FramesMP4DemuxerTrack(MovieBox movieBox, TrakBox trakBox, SeekableByteChannel seekableByteChannel) {
        Entry[] entryArr;
        Class<SyncSamplesBox> cls = SyncSamplesBox.class;
        super(trakBox);
        this.input = seekableByteChannel;
        this.movie = movieBox;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        SampleSizesBox sampleSizesBox = (SampleSizesBox) Box.findFirst(trakBox, SampleSizesBox.class, str, str2, str3, "stsz");
        SyncSamplesBox syncSamplesBox = (SyncSamplesBox) Box.findFirst(trakBox, cls, str, str2, str3, "stss");
        SyncSamplesBox syncSamplesBox2 = (SyncSamplesBox) Box.findFirst(trakBox, cls, str, str2, str3, "stps");
        CompositionOffsetsBox compositionOffsetsBox = (CompositionOffsetsBox) Box.findFirst(trakBox, CompositionOffsetsBox.class, str, str2, str3, "ctts");
        if (compositionOffsetsBox == null) {
            entryArr = null;
        } else {
            entryArr = compositionOffsetsBox.getEntries();
        }
        this.compOffsets = entryArr;
        if (syncSamplesBox != null) {
            this.syncSamples = syncSamplesBox.getSyncSamples();
        }
        if (syncSamplesBox2 != null) {
            this.partialSync = syncSamplesBox2.getSyncSamples();
        }
        this.sizes = sampleSizesBox.getSizes();
    }

    public long getFrameCount() {
        return (long) this.sizes.length;
    }

    public DemuxerTrackMeta getMeta() {
        int[] iArr = this.syncSamples;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        for (int i = 0; i < copyOf.length; i++) {
            copyOf[i] = copyOf[i] - 1;
        }
        TrackType type = getType();
        Type type2 = type == TrackType.VIDEO ? Type.VIDEO : type == TrackType.SOUND ? Type.AUDIO : Type.OTHER;
        Type type3 = type2;
        int length = this.sizes.length;
        double d = (double) this.duration;
        double d2 = (double) this.timescale;
        Double.isNaN(d);
        Double.isNaN(d2);
        DemuxerTrackMeta demuxerTrackMeta = new DemuxerTrackMeta(type3, copyOf, length, d / d2, this.box.getCodedSize());
        return demuxerTrackMeta;
    }

    public boolean gotoSyncFrame(long j) {
        if (this.syncSamples == null) {
            return gotoFrame(j);
        }
        if (j >= 0) {
            int i = 0;
            if (j >= getFrameCount()) {
                return false;
            }
            if (j == this.curFrame) {
                return true;
            }
            while (true) {
                int[] iArr = this.syncSamples;
                if (i >= iArr.length) {
                    return gotoFrame((long) (iArr[iArr.length - 1] - 1));
                }
                if (((long) (iArr[i] - 1)) > j) {
                    return gotoFrame((long) (iArr[i - 1] - 1));
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("negative frame number");
        }
    }

    /* access modifiers changed from: protected */
    public void seekPointer(long j) {
        if (this.compOffsets != null) {
            this.cttsSubInd = (int) j;
            this.cttsInd = 0;
            while (this.cttsSubInd >= this.compOffsets[this.cttsInd].getCount()) {
                this.cttsSubInd -= this.compOffsets[this.cttsInd].getCount();
                this.cttsInd++;
            }
        }
        int i = (int) j;
        this.curFrame = (long) i;
        this.stcoInd = 0;
        this.stscInd = 0;
        this.noInChunk = i;
        this.offInChunk = 0;
        while (this.noInChunk >= this.sampleToChunks[this.stscInd].getCount()) {
            this.noInChunk -= this.sampleToChunks[this.stscInd].getCount();
            nextChunk();
        }
        int i2 = 0;
        while (true) {
            int i3 = this.noInChunk;
            if (i2 >= i3) {
                break;
            }
            this.offInChunk += (long) this.sizes[(i - i3) + i2];
            i2++;
        }
        if (this.syncSamples != null) {
            this.ssOff = 0;
            while (true) {
                int i4 = this.ssOff;
                int[] iArr = this.syncSamples;
                if (i4 >= iArr.length || ((long) iArr[i4]) >= this.curFrame + 1) {
                    break;
                }
                this.ssOff = i4 + 1;
            }
        }
        if (this.partialSync != null) {
            this.psOff = 0;
            while (true) {
                int i5 = this.psOff;
                int[] iArr2 = this.partialSync;
                if (i5 < iArr2.length && ((long) iArr2[i5]) < this.curFrame + 1) {
                    this.psOff = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public synchronized MP4Packet nextFrame() throws IOException {
        if (this.curFrame >= ((long) this.sizes.length)) {
            return null;
        }
        return nextFrame(ByteBuffer.allocate(this.sizes[(int) this.curFrame]));
    }

    public synchronized MP4Packet nextFrame(ByteBuffer byteBuffer) throws IOException {
        boolean z;
        boolean z2;
        synchronized (this) {
            if (this.curFrame >= ((long) this.sizes.length)) {
                return null;
            }
            int i = this.sizes[(int) this.curFrame];
            if (byteBuffer != null) {
                if (byteBuffer.remaining() < i) {
                    throw new IllegalArgumentException("Buffer size is not enough to fit a packet");
                }
            }
            long j = this.chunkOffsets[this.stcoInd] + this.offInChunk;
            ByteBuffer readPacketData = readPacketData(this.input, byteBuffer, j, i);
            if (readPacketData != null && readPacketData.remaining() < i) {
                return null;
            }
            int sampleDuration = this.timeToSamples[this.sttsInd].getSampleDuration();
            boolean z3 = this.syncSamples == null;
            if (this.syncSamples == null || this.ssOff >= this.syncSamples.length || this.curFrame + 1 != ((long) this.syncSamples[this.ssOff])) {
                z = z3;
            } else {
                this.ssOff++;
                z = true;
            }
            if (this.partialSync == null || this.psOff >= this.partialSync.length || this.curFrame + 1 != ((long) this.partialSync[this.psOff])) {
                z2 = false;
            } else {
                this.psOff++;
                z2 = true;
            }
            long j2 = this.pts;
            if (this.compOffsets != null) {
                j2 = this.pts + ((long) this.compOffsets[this.cttsInd].getOffset());
                this.cttsSubInd++;
                if (this.cttsInd < this.compOffsets.length - 1 && this.cttsSubInd == this.compOffsets[this.cttsInd].getCount()) {
                    this.cttsInd++;
                    this.cttsSubInd = 0;
                }
            }
            int i2 = i;
            MP4Packet mP4Packet = new MP4Packet(readPacketData, QTTimeUtil.mediaToEdited(this.box, j2, this.movie.getTimescale()), (long) this.timescale, (long) sampleDuration, this.curFrame, z, null, j2, this.sampleToChunks[this.stscInd].getEntry() - 1, j, i2, z2);
            this.offInChunk += (long) i2;
            this.curFrame++;
            this.noInChunk++;
            if (this.noInChunk >= this.sampleToChunks[this.stscInd].getCount()) {
                this.noInChunk = 0;
                this.offInChunk = 0;
                nextChunk();
            }
            shiftPts(1);
            return mP4Packet;
        }
    }
}
