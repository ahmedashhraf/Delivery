package org.jcodec.containers.mp4.muxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;
import org.jcodec.common.Assert;
import org.jcodec.common.LongArrayList;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.common.model.Unit;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
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
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrackHeaderBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import p076c.p112d.p148d.p150g.C6637f;

public class PCMMP4MuxerTrack extends AbstractMP4MuxerTrack {
    private LongArrayList chunkOffsets = new LongArrayList();
    private int frameDuration;
    private int frameSize;
    private int framesInCurChunk;
    private SeekableByteChannel out;
    private int totalFrames;

    public PCMMP4MuxerTrack(SeekableByteChannel seekableByteChannel, int i, TrackType trackType, int i2, int i3, int i4, SampleEntry sampleEntry) {
        super(i, trackType, i2);
        this.out = seekableByteChannel;
        this.frameDuration = i3;
        this.frameSize = i4;
        addSampleEntry(sampleEntry);
        setTgtChunkDuration(new Rational(1, 2), Unit.SEC);
    }

    private void outChunk() throws IOException {
        if (this.framesInCurChunk != 0) {
            this.chunkOffsets.add(this.out.position());
            for (ByteBuffer write : this.curChunk) {
                this.out.write(write);
            }
            this.curChunk.clear();
            int i = this.samplesInLastChunk;
            if (i == -1 || this.framesInCurChunk != i) {
                this.samplesInChunks.add(new SampleToChunkEntry((long) (this.chunkNo + 1), this.framesInCurChunk, 1));
            }
            this.samplesInLastChunk = this.framesInCurChunk;
            this.chunkNo++;
            this.framesInCurChunk = 0;
            this.chunkDuration = 0;
        }
    }

    private void outChunkIfNeeded() throws IOException {
        Unit unit = this.tgtChunkDurationUnit;
        Assert.assertTrue(unit == Unit.FRAME || unit == Unit.SEC);
        if (this.tgtChunkDurationUnit == Unit.FRAME && this.framesInCurChunk * this.tgtChunkDuration.getDen() == this.tgtChunkDuration.getNum()) {
            outChunk();
        } else if (this.tgtChunkDurationUnit == Unit.SEC) {
            long j = this.chunkDuration;
            if (j > 0 && j * ((long) this.tgtChunkDuration.getDen()) >= ((long) (this.tgtChunkDuration.getNum() * this.timescale))) {
                outChunk();
            }
        }
    }

    public void addSamples(ByteBuffer byteBuffer) throws IOException {
        this.curChunk.add(byteBuffer);
        int remaining = byteBuffer.remaining() / this.frameSize;
        this.totalFrames += remaining;
        this.framesInCurChunk += remaining;
        this.chunkDuration += (long) (remaining * this.frameDuration);
        outChunkIfNeeded();
    }

    /* access modifiers changed from: protected */
    public Box finish(MovieHeaderBox movieHeaderBox) throws IOException {
        if (!this.finished) {
            outChunk();
            this.finished = true;
            TrakBox trakBox = new TrakBox();
            Size displayDimensions = getDisplayDimensions();
            TrackHeaderBox trackHeaderBox = r4;
            TrackHeaderBox trackHeaderBox2 = new TrackHeaderBox(this.trackId, ((((long) movieHeaderBox.getTimescale()) * ((long) this.totalFrames)) * ((long) this.frameDuration)) / ((long) this.timescale), (float) displayDimensions.getWidth(), (float) displayDimensions.getHeight(), new Date().getTime(), new Date().getTime(), 1.0f, 0, 0, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, C6637f.f18605b});
            trackHeaderBox.setFlags(15);
            trakBox.add(trackHeaderBox);
            tapt(trakBox);
            MediaBox mediaBox = new MediaBox();
            trakBox.add(mediaBox);
            MediaHeaderBox mediaHeaderBox = new MediaHeaderBox(this.timescale, (long) (this.totalFrames * this.frameDuration), 0, new Date().getTime(), new Date().getTime(), 0);
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
            putEdits(trakBox);
            putName(trakBox);
            nodeBox.add(new SampleDescriptionBox((SampleEntry[]) this.sampleEntries.toArray(new SampleEntry[0])));
            nodeBox.add(new SampleToChunkBox((SampleToChunkEntry[]) this.samplesInChunks.toArray(new SampleToChunkEntry[0])));
            nodeBox.add(new SampleSizesBox(this.frameSize, this.totalFrames));
            nodeBox.add(new TimeToSampleBox(new TimeToSampleEntry[]{new TimeToSampleEntry(this.totalFrames, this.frameDuration)}));
            nodeBox.add(new ChunkOffsets64Box(this.chunkOffsets.toArray()));
            return trakBox;
        }
        throw new IllegalStateException("The muxer track has finished muxing");
    }

    public long getTrackTotalDuration() {
        return (long) (this.totalFrames * this.frameDuration);
    }
}
