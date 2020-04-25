package org.jcodec.containers.mp4;

import java.util.Arrays;
import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class ChunkReader {
    private long[] chunkOffsets;
    private long chunkTv = 0;
    private int curChunk;
    private int s2cIndex;
    private int sampleNo;
    private SampleToChunkEntry[] sampleToChunk;
    private SampleDescriptionBox stsd;
    private SampleSizesBox stsz;
    private TimeToSampleEntry[] tts;
    private int ttsInd = 0;
    private int ttsSubInd = 0;

    public ChunkReader(TrakBox trakBox) {
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        this.tts = ((TimeToSampleBox) Box.findFirst(trakBox, TimeToSampleBox.class, str, str2, str3, "stts")).getEntries();
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(trakBox, ChunkOffsetsBox.class, str, str2, str3, "stco");
        ChunkOffsets64Box chunkOffsets64Box = (ChunkOffsets64Box) Box.findFirst(trakBox, ChunkOffsets64Box.class, str, str2, str3, "co64");
        this.stsz = (SampleSizesBox) Box.findFirst(trakBox, SampleSizesBox.class, str, str2, str3, "stsz");
        SampleToChunkBox sampleToChunkBox = (SampleToChunkBox) Box.findFirst(trakBox, SampleToChunkBox.class, str, str2, str3, "stsc");
        if (chunkOffsetsBox != null) {
            this.chunkOffsets = chunkOffsetsBox.getChunkOffsets();
        } else {
            this.chunkOffsets = chunkOffsets64Box.getChunkOffsets();
        }
        this.sampleToChunk = sampleToChunkBox.getSampleToChunk();
        this.stsd = (SampleDescriptionBox) Box.findFirst(trakBox, SampleDescriptionBox.class, str, str2, str3, "stsd");
    }

    private int getFrameSize() {
        Box box = (Box) this.stsd.getBoxes().get(this.sampleToChunk[this.s2cIndex].getEntry() - 1);
        return box instanceof AudioSampleEntry ? ((AudioSampleEntry) box).calcFrameSize() : this.stsz.getDefaultSize();
    }

    public boolean hasNext() {
        return this.curChunk < this.chunkOffsets.length;
    }

    public Chunk next() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        int i3 = this.curChunk;
        if (i3 >= this.chunkOffsets.length) {
            return null;
        }
        int i4 = this.s2cIndex;
        int i5 = i4 + 1;
        SampleToChunkEntry[] sampleToChunkEntryArr = this.sampleToChunk;
        if (i5 < sampleToChunkEntryArr.length && ((long) (i3 + 1)) == sampleToChunkEntryArr[i4 + 1].getFirst()) {
            this.s2cIndex++;
        }
        int count = this.sampleToChunk[this.s2cIndex].getCount();
        if (this.ttsSubInd + count <= this.tts[this.ttsInd].getSampleCount()) {
            int sampleDuration = this.tts[this.ttsInd].getSampleDuration();
            this.ttsSubInd += count;
            i = sampleDuration;
            iArr = null;
        } else {
            int[] iArr3 = new int[count];
            for (int i6 = 0; i6 < count; i6++) {
                if (this.ttsSubInd >= this.tts[this.ttsInd].getSampleCount()) {
                    int i7 = this.ttsInd;
                    if (i7 < this.tts.length - 1) {
                        this.ttsSubInd = 0;
                        this.ttsInd = i7 + 1;
                    }
                }
                iArr3[i6] = this.tts[this.ttsInd].getSampleDuration();
                this.ttsSubInd++;
            }
            iArr = iArr3;
            i = 0;
        }
        if (this.stsz.getDefaultSize() > 0) {
            i2 = getFrameSize();
            iArr2 = null;
        } else {
            int[] sizes = this.stsz.getSizes();
            int i8 = this.sampleNo;
            iArr2 = Arrays.copyOfRange(sizes, i8, i8 + count);
            i2 = 0;
        }
        Chunk chunk = new Chunk(this.chunkOffsets[this.curChunk], this.chunkTv, count, i2, iArr2, i, iArr, this.sampleToChunk[this.s2cIndex].getEntry());
        this.chunkTv += (long) chunk.getDuration();
        this.sampleNo += count;
        this.curChunk++;
        return chunk;
    }

    public int size() {
        return this.chunkOffsets.length;
    }
}
