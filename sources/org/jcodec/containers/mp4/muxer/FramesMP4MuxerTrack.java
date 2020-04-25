package org.jcodec.containers.mp4.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.LongArrayList;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.common.model.Unit;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox;
import org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.HandlerBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MediaBox;
import org.jcodec.containers.mp4.boxes.MediaHeaderBox;
import org.jcodec.containers.mp4.boxes.MediaInfoBox;
import org.jcodec.containers.mp4.boxes.MovieHeaderBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.SyncSamplesBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrackHeaderBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import p076c.p112d.p148d.p150g.C6637f;

public class FramesMP4MuxerTrack extends AbstractMP4MuxerTrack {
    private boolean allIframes = true;
    private LongArrayList chunkOffsets = new LongArrayList();
    private List<Entry> compositionOffsets = new ArrayList();
    private long curDuration = -1;
    private int curFrame;
    private IntArrayList iframes = new IntArrayList();
    private int lastCompositionOffset = 0;
    private int lastCompositionSamples = 0;
    private int lastEntry = -1;
    private SeekableByteChannel out;
    private long ptsEstimate = 0;
    private long sameDurCount = 0;
    private List<TimeToSampleEntry> sampleDurations = new ArrayList();
    private IntArrayList sampleSizes = new IntArrayList();
    private TimecodeMP4MuxerTrack timecodeTrack;
    private long trackTotalDuration;

    public FramesMP4MuxerTrack(SeekableByteChannel seekableByteChannel, int i, TrackType trackType, int i2) {
        super(i, trackType, i2);
        this.out = seekableByteChannel;
        setTgtChunkDuration(new Rational(1, 1), Unit.FRAME);
    }

    public static int minOffset(List<Entry> list) {
        int i = Integer.MAX_VALUE;
        for (Entry entry : list) {
            if (entry.getOffset() < i) {
                i = entry.getOffset();
            }
        }
        return i;
    }

    private void outChunkIfNeeded(int i) throws IOException {
        Unit unit = this.tgtChunkDurationUnit;
        Assert.assertTrue(unit == Unit.FRAME || unit == Unit.SEC);
        if (this.tgtChunkDurationUnit == Unit.FRAME && this.curChunk.size() * this.tgtChunkDuration.getDen() == this.tgtChunkDuration.getNum()) {
            outChunk(i);
        } else if (this.tgtChunkDurationUnit == Unit.SEC) {
            long j = this.chunkDuration;
            if (j > 0 && j * ((long) this.tgtChunkDuration.getDen()) >= ((long) (this.tgtChunkDuration.getNum() * this.timescale))) {
                outChunk(i);
            }
        }
    }

    private void processTimecode(MP4Packet mP4Packet) throws IOException {
        TimecodeMP4MuxerTrack timecodeMP4MuxerTrack = this.timecodeTrack;
        if (timecodeMP4MuxerTrack != null) {
            timecodeMP4MuxerTrack.addTimecode(mP4Packet);
        }
    }

    private void putCompositionOffsets(NodeBox nodeBox) {
        if (this.compositionOffsets.size() > 0) {
            this.compositionOffsets.add(new Entry(this.lastCompositionSamples, this.lastCompositionOffset));
            int minOffset = minOffset(this.compositionOffsets);
            if (minOffset > 0) {
                for (Entry entry : this.compositionOffsets) {
                    entry.offset -= minOffset;
                }
            }
            Entry entry2 = (Entry) this.compositionOffsets.get(0);
            if (entry2.getOffset() > 0) {
                List<Edit> list = this.edits;
                if (list == null) {
                    this.edits = new ArrayList();
                    List<Edit> list2 = this.edits;
                    Edit edit = new Edit(this.trackTotalDuration, (long) entry2.getOffset(), 1.0f);
                    list2.add(edit);
                } else {
                    for (Edit edit2 : list) {
                        edit2.setMediaTime(edit2.getMediaTime() + ((long) entry2.getOffset()));
                    }
                }
            }
            nodeBox.add(new CompositionOffsetsBox((Entry[]) this.compositionOffsets.toArray(new Entry[0])));
        }
    }

    public void addFrame(MP4Packet mP4Packet) throws IOException {
        if (!this.finished) {
            int entryNo = mP4Packet.getEntryNo() + 1;
            int pts = (int) (mP4Packet.getPts() - this.ptsEstimate);
            int i = this.lastCompositionOffset;
            if (pts != i) {
                int i2 = this.lastCompositionSamples;
                if (i2 > 0) {
                    this.compositionOffsets.add(new Entry(i2, i));
                }
                this.lastCompositionOffset = pts;
                this.lastCompositionSamples = 0;
            }
            this.lastCompositionSamples++;
            this.ptsEstimate += mP4Packet.getDuration();
            int i3 = this.lastEntry;
            if (!(i3 == -1 || i3 == entryNo)) {
                outChunk(i3);
                this.samplesInLastChunk = -1;
            }
            this.curChunk.add(mP4Packet.getData());
            if (mP4Packet.isKeyFrame()) {
                this.iframes.add(this.curFrame + 1);
            } else {
                this.allIframes = false;
            }
            this.curFrame++;
            this.chunkDuration += mP4Packet.getDuration();
            if (this.curDuration != -1) {
                long duration = mP4Packet.getDuration();
                long j = this.curDuration;
                if (duration != j) {
                    this.sampleDurations.add(new TimeToSampleEntry((int) this.sameDurCount, (int) j));
                    this.sameDurCount = 0;
                }
            }
            this.curDuration = mP4Packet.getDuration();
            this.sameDurCount++;
            this.trackTotalDuration += mP4Packet.getDuration();
            outChunkIfNeeded(entryNo);
            processTimecode(mP4Packet);
            this.lastEntry = entryNo;
            return;
        }
        throw new IllegalStateException("The muxer track has finished muxing");
    }

    public void addSampleEntries(SampleEntry[] sampleEntryArr) {
        for (SampleEntry addSampleEntry : sampleEntryArr) {
            addSampleEntry(addSampleEntry);
        }
    }

    /* access modifiers changed from: protected */
    public Box finish(MovieHeaderBox movieHeaderBox) throws IOException {
        if (!this.finished) {
            outChunk(this.lastEntry);
            long j = this.sameDurCount;
            if (j > 0) {
                this.sampleDurations.add(new TimeToSampleEntry((int) j, (int) this.curDuration));
            }
            this.finished = true;
            TrakBox trakBox = new TrakBox();
            Size displayDimensions = getDisplayDimensions();
            TrackHeaderBox trackHeaderBox = r3;
            TrackHeaderBox trackHeaderBox2 = new TrackHeaderBox(this.trackId, (((long) movieHeaderBox.getTimescale()) * this.trackTotalDuration) / ((long) this.timescale), (float) displayDimensions.getWidth(), (float) displayDimensions.getHeight(), new Date().getTime(), new Date().getTime(), 1.0f, 0, 0, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, C6637f.f18605b});
            TrackHeaderBox trackHeaderBox3 = trackHeaderBox;
            trackHeaderBox3.setFlags(15);
            trakBox.add(trackHeaderBox3);
            tapt(trakBox);
            MediaBox mediaBox = new MediaBox();
            trakBox.add(mediaBox);
            MediaHeaderBox mediaHeaderBox = new MediaHeaderBox(this.timescale, this.trackTotalDuration, 0, new Date().getTime(), new Date().getTime(), 0);
            mediaBox.add(mediaHeaderBox);
            HandlerBox handlerBox = new HandlerBox("mhlr", this.type.getHandler(), "appl", 0, 0);
            mediaBox.add(handlerBox);
            MediaInfoBox mediaInfoBox = new MediaInfoBox();
            mediaBox.add(mediaInfoBox);
            mediaHeader(mediaInfoBox, this.type);
            HandlerBox handlerBox2 = new HandlerBox("dhlr", "url ", "appl", 0, 0);
            mediaInfoBox.add(handlerBox2);
            addDref(mediaInfoBox);
            NodeBox nodeBox = new NodeBox(new Header("stbl"));
            mediaInfoBox.add(nodeBox);
            putCompositionOffsets(nodeBox);
            putEdits(trakBox);
            putName(trakBox);
            nodeBox.add(new SampleDescriptionBox((SampleEntry[]) this.sampleEntries.toArray(new SampleEntry[0])));
            nodeBox.add(new SampleToChunkBox((SampleToChunkEntry[]) this.samplesInChunks.toArray(new SampleToChunkEntry[0])));
            nodeBox.add(new SampleSizesBox(this.sampleSizes.toArray()));
            nodeBox.add(new TimeToSampleBox((TimeToSampleEntry[]) this.sampleDurations.toArray(new TimeToSampleEntry[0])));
            nodeBox.add(new ChunkOffsets64Box(this.chunkOffsets.toArray()));
            if (!this.allIframes && this.iframes.size() > 0) {
                nodeBox.add(new SyncSamplesBox(this.iframes.toArray()));
            }
            return trakBox;
        }
        throw new IllegalStateException("The muxer track has finished muxing");
    }

    public TimecodeMP4MuxerTrack getTimecodeTrack() {
        return this.timecodeTrack;
    }

    public long getTrackTotalDuration() {
        return this.trackTotalDuration;
    }

    /* access modifiers changed from: 0000 */
    public void outChunk(int i) throws IOException {
        if (this.curChunk.size() != 0) {
            this.chunkOffsets.add(this.out.position());
            for (ByteBuffer byteBuffer : this.curChunk) {
                this.sampleSizes.add(byteBuffer.remaining());
                this.out.write(byteBuffer);
            }
            int i2 = this.samplesInLastChunk;
            if (i2 == -1 || i2 != this.curChunk.size()) {
                this.samplesInChunks.add(new SampleToChunkEntry((long) (this.chunkNo + 1), this.curChunk.size(), i));
            }
            this.samplesInLastChunk = this.curChunk.size();
            this.chunkNo++;
            this.chunkDuration = 0;
            this.curChunk.clear();
        }
    }

    public void setTimecode(TimecodeMP4MuxerTrack timecodeMP4MuxerTrack) {
        this.timecodeTrack = timecodeMP4MuxerTrack;
    }
}
