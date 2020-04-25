package org.jcodec.containers.mp4;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.boxes.AliasBox;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.DataInfoBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.MediaInfoBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class ChunkWriter {
    byte[] buf = new byte[8092];
    private int curChunk;
    private SampleEntry[] entries;
    private SeekableByteChannel[] inputs;
    private long[] offsets;
    private SeekableByteChannel out;
    private TrakBox trak;

    public ChunkWriter(TrakBox trakBox, SeekableByteChannel[] seekableByteChannelArr, SeekableByteChannel seekableByteChannel) {
        int i;
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        this.entries = (SampleEntry[]) Box.findAll(trakBox, SampleEntry.class, str, str2, str3, "stsd", null);
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(trakBox, ChunkOffsetsBox.class, str, str2, str3, "stco");
        ChunkOffsets64Box chunkOffsets64Box = (ChunkOffsets64Box) Box.findFirst(trakBox, ChunkOffsets64Box.class, str, str2, str3, "co64");
        if (chunkOffsetsBox != null) {
            i = chunkOffsetsBox.getChunkOffsets().length;
        } else {
            i = chunkOffsets64Box.getChunkOffsets().length;
        }
        this.inputs = seekableByteChannelArr;
        this.offsets = new long[i];
        this.out = seekableByteChannel;
        this.trak = trakBox;
    }

    private void cleanDrefs(TrakBox trakBox) {
        MediaInfoBox minf = trakBox.getMdia().getMinf();
        DataInfoBox dinf = trakBox.getMdia().getMinf().getDinf();
        if (dinf == null) {
            dinf = new DataInfoBox();
            minf.add(dinf);
        }
        DataRefBox dref = dinf.getDref();
        if (dref == null) {
            dref = new DataRefBox();
            dinf.add(dref);
        }
        dref.getBoxes().clear();
        dref.add(AliasBox.createSelfRef());
        for (SampleEntry drefInd : (SampleEntry[]) Box.findAll(trakBox, SampleEntry.class, "mdia", "minf", "stbl", "stsd", null)) {
            drefInd.setDrefInd(1);
        }
    }

    private SeekableByteChannel getInput(Chunk chunk) {
        return this.inputs[this.entries[chunk.getEntry() - 1].getDrefInd() - 1];
    }

    public void apply() {
        NodeBox nodeBox = (NodeBox) Box.findFirst(this.trak, NodeBox.class, "mdia", "minf", "stbl");
        nodeBox.removeChildren("stco", "co64");
        nodeBox.add(new ChunkOffsets64Box(this.offsets));
        cleanDrefs(this.trak);
    }

    public void write(Chunk chunk) throws IOException {
        SeekableByteChannel input = getInput(chunk);
        input.position(chunk.getOffset());
        long position = this.out.position();
        this.out.write(NIOUtils.fetchFrom((ReadableByteChannel) input, (int) chunk.getSize()));
        long[] jArr = this.offsets;
        int i = this.curChunk;
        this.curChunk = i + 1;
        jArr[i] = position;
    }
}
