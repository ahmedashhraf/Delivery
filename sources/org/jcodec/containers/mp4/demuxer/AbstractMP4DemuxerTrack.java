package org.jcodec.containers.mp4.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.model.RationalLarge;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.EditListBox;
import org.jcodec.containers.mp4.boxes.NameBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public abstract class AbstractMP4DemuxerTrack implements SeekableDemuxerTrack {
    protected TrakBox box;
    protected long[] chunkOffsets;
    protected long curFrame;
    protected long duration;

    /* renamed from: no */
    private int f44844no;
    protected long pts;
    protected SampleEntry[] sampleEntries;
    protected SampleToChunkEntry[] sampleToChunks;
    protected int stcoInd;
    protected int stscInd;
    protected int sttsInd;
    protected int sttsSubInd;
    protected TimeToSampleEntry[] timeToSamples;
    protected int timescale;
    private TrackType type;

    public AbstractMP4DemuxerTrack(TrakBox trakBox) {
        this.f44844no = trakBox.getTrackHeader().getNo();
        this.type = MP4Demuxer.getTrackType(trakBox);
        this.sampleEntries = (SampleEntry[]) Box.findAll(trakBox, SampleEntry.class, "mdia", "minf", "stbl", "stsd", null);
        NodeBox stbl = trakBox.getMdia().getMinf().getStbl();
        TimeToSampleBox timeToSampleBox = (TimeToSampleBox) Box.findFirst(stbl, TimeToSampleBox.class, "stts");
        SampleToChunkBox sampleToChunkBox = (SampleToChunkBox) Box.findFirst(stbl, SampleToChunkBox.class, "stsc");
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(stbl, ChunkOffsetsBox.class, "stco");
        ChunkOffsets64Box chunkOffsets64Box = (ChunkOffsets64Box) Box.findFirst(stbl, ChunkOffsets64Box.class, "co64");
        this.timeToSamples = timeToSampleBox.getEntries();
        this.sampleToChunks = sampleToChunkBox.getSampleToChunk();
        this.chunkOffsets = chunkOffsetsBox != null ? chunkOffsetsBox.getChunkOffsets() : chunkOffsets64Box.getChunkOffsets();
        for (TimeToSampleEntry timeToSampleEntry : this.timeToSamples) {
            this.duration += (long) (timeToSampleEntry.getSampleCount() * timeToSampleEntry.getSampleDuration());
        }
        this.box = trakBox;
        this.timescale = trakBox.getTimescale();
    }

    private void seekPts(long j) {
        this.sttsSubInd = 0;
        this.sttsInd = 0;
        this.pts = (long) 0;
        shiftPts(j);
    }

    public boolean canSeek(long j) {
        return j >= 0 && j < this.duration;
    }

    public TrakBox getBox() {
        return this.box;
    }

    public long getCurFrame() {
        return this.curFrame;
    }

    public RationalLarge getDuration() {
        return new RationalLarge(this.box.getMediaDuration(), (long) this.box.getTimescale());
    }

    public List<Edit> getEdits() {
        EditListBox editListBox = (EditListBox) Box.findFirst(this.box, EditListBox.class, "edts", "elst");
        if (editListBox != null) {
            return editListBox.getEdits();
        }
        return null;
    }

    public String getFourcc() {
        return getSampleEntries()[0].getFourcc();
    }

    public abstract long getFrameCount();

    public String getName() {
        NameBox nameBox = (NameBox) Box.findFirst(this.box, NameBox.class, "udta", "name");
        if (nameBox != null) {
            return nameBox.getName();
        }
        return null;
    }

    public int getNo() {
        return this.f44844no;
    }

    public SampleEntry[] getSampleEntries() {
        return this.sampleEntries;
    }

    public long getTimescale() {
        return (long) this.timescale;
    }

    public TrackType getType() {
        return this.type;
    }

    public synchronized boolean gotoFrame(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("negative frame number");
        } else if (j >= getFrameCount()) {
            return false;
        } else {
            if (j == this.curFrame) {
                return true;
            }
            seekPointer(j);
            seekPts(j);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void nextChunk() {
        int i = this.stcoInd;
        if (i < this.chunkOffsets.length) {
            this.stcoInd = i + 1;
            int i2 = this.stscInd;
            int i3 = i2 + 1;
            SampleToChunkEntry[] sampleToChunkEntryArr = this.sampleToChunks;
            if (i3 < sampleToChunkEntryArr.length && ((long) (this.stcoInd + 1)) == sampleToChunkEntryArr[i2 + 1].getFirst()) {
                this.stscInd++;
            }
        }
    }

    public abstract MP4Packet nextFrame(ByteBuffer byteBuffer) throws IOException;

    public int pts2Sample(long j, int i) {
        long j2 = (j * ((long) this.timescale)) / ((long) i);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            TimeToSampleEntry[] timeToSampleEntryArr = this.timeToSamples;
            if (i2 >= timeToSampleEntryArr.length - 1) {
                break;
            }
            long sampleCount = (long) (timeToSampleEntryArr[i2].getSampleCount() * this.timeToSamples[i2].getSampleDuration());
            if (j2 < sampleCount) {
                break;
            }
            j2 -= sampleCount;
            i3 += this.timeToSamples[i2].getSampleCount();
            i2++;
        }
        return i3 + ((int) (j2 / ((long) this.timeToSamples[i2].getSampleDuration())));
    }

    /* access modifiers changed from: protected */
    public ByteBuffer readPacketData(SeekableByteChannel seekableByteChannel, ByteBuffer byteBuffer, long j, int i) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        synchronized (seekableByteChannel) {
            seekableByteChannel.position(j);
            NIOUtils.read(seekableByteChannel, duplicate, i);
        }
        duplicate.flip();
        return duplicate;
    }

    public synchronized boolean seek(long j) {
        long j2 = 0;
        if (j >= 0) {
            int i = 0;
            if (j >= this.duration) {
                return false;
            }
            this.sttsInd = 0;
            while (j > ((long) (this.timeToSamples[this.sttsInd].getSampleCount() * this.timeToSamples[this.sttsInd].getSampleDuration())) + j2 && this.sttsInd < this.timeToSamples.length - 1) {
                j2 += (long) (this.timeToSamples[this.sttsInd].getSampleCount() * this.timeToSamples[this.sttsInd].getSampleDuration());
                i += this.timeToSamples[this.sttsInd].getSampleCount();
                this.sttsInd++;
            }
            this.sttsSubInd = (int) ((j - j2) / ((long) this.timeToSamples[this.sttsInd].getSampleDuration()));
            int i2 = i + this.sttsSubInd;
            this.pts = j2 + ((long) (this.timeToSamples[this.sttsInd].getSampleDuration() * this.sttsSubInd));
            seekPointer((long) i2);
            return true;
        }
        throw new IllegalArgumentException("Seeking to negative pts");
    }

    /* access modifiers changed from: protected */
    public abstract void seekPointer(long j);

    /* access modifiers changed from: protected */
    public void shiftPts(long j) {
        this.pts -= (long) (this.sttsSubInd * this.timeToSamples[this.sttsInd].getSampleDuration());
        this.sttsSubInd = (int) (((long) this.sttsSubInd) + j);
        while (true) {
            int i = this.sttsInd;
            TimeToSampleEntry[] timeToSampleEntryArr = this.timeToSamples;
            if (i >= timeToSampleEntryArr.length - 1 || this.sttsSubInd < timeToSampleEntryArr[i].getSampleCount()) {
                this.pts += (long) (this.sttsSubInd * this.timeToSamples[this.sttsInd].getSampleDuration());
            } else {
                this.pts += this.timeToSamples[this.sttsInd].getSegmentDuration();
                this.sttsSubInd -= this.timeToSamples[this.sttsInd].getSampleCount();
                this.sttsInd++;
            }
        }
        this.pts += (long) (this.sttsSubInd * this.timeToSamples[this.sttsInd].getSampleDuration());
    }

    public void seek(double d) {
        double d2 = (double) this.timescale;
        Double.isNaN(d2);
        seek((long) (d * d2));
    }
}
