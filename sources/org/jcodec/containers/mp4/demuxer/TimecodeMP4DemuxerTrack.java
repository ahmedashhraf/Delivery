package org.jcodec.containers.mp4.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.regex.Pattern;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.TapeTimecode;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.QTTimeUtil;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TimecodeSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class TimecodeMP4DemuxerTrack {
    private TrakBox box;
    private long[] chunkOffsets;
    private SeekableByteChannel input;
    private MovieBox movie;
    private int[] sampleCache;
    private SampleToChunkEntry[] sampleToChunks;
    private TimeToSampleEntry[] timeToSamples;
    private TimecodeSampleEntry tse;

    public TimecodeMP4DemuxerTrack(MovieBox movieBox, TrakBox trakBox, SeekableByteChannel seekableByteChannel) throws IOException {
        this.box = trakBox;
        this.input = seekableByteChannel;
        this.movie = movieBox;
        NodeBox stbl = trakBox.getMdia().getMinf().getStbl();
        TimeToSampleBox timeToSampleBox = (TimeToSampleBox) Box.findFirst(stbl, TimeToSampleBox.class, "stts");
        SampleToChunkBox sampleToChunkBox = (SampleToChunkBox) Box.findFirst(stbl, SampleToChunkBox.class, "stsc");
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(stbl, ChunkOffsetsBox.class, "stco");
        ChunkOffsets64Box chunkOffsets64Box = (ChunkOffsets64Box) Box.findFirst(stbl, ChunkOffsets64Box.class, "co64");
        this.timeToSamples = timeToSampleBox.getEntries();
        this.chunkOffsets = chunkOffsetsBox != null ? chunkOffsetsBox.getChunkOffsets() : chunkOffsets64Box.getChunkOffsets();
        this.sampleToChunks = sampleToChunkBox.getSampleToChunk();
        long[] jArr = this.chunkOffsets;
        if (jArr.length == 1) {
            cacheSamples(this.sampleToChunks, jArr);
        }
        this.tse = (TimecodeSampleEntry) this.box.getSampleEntries()[0];
    }

    private void cacheSamples(SampleToChunkEntry[] sampleToChunkEntryArr, long[] jArr) throws IOException {
        synchronized (this.input) {
            IntArrayList intArrayList = new IntArrayList();
            int i = 0;
            for (int i2 = 0; i2 < jArr.length; i2++) {
                int count = sampleToChunkEntryArr[i].getCount();
                if (i < sampleToChunkEntryArr.length - 1) {
                    int i3 = i + 1;
                    if (((long) (i2 + 1)) >= sampleToChunkEntryArr[i3].getFirst()) {
                        i = i3;
                    }
                }
                this.input.position(jArr[i2]);
                ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) this.input, count * 4);
                for (int i4 = 0; i4 < count; i4++) {
                    intArrayList.add(fetchFrom.getInt());
                }
            }
            this.sampleCache = intArrayList.toArray();
        }
    }

    private int dropFrameAdjust(int i, TimecodeSampleEntry timecodeSampleEntry) {
        if (!timecodeSampleEntry.isDropFrame()) {
            return i;
        }
        return (int) (((long) i) + (((long) (i / 17982)) * 18) + (((((long) (i % 17982)) - 2) / 1798) * 2));
    }

    private int getTimecodeSample(int i) throws IOException {
        int i2;
        int[] iArr = this.sampleCache;
        if (iArr != null) {
            return iArr[i];
        }
        synchronized (this.input) {
            int i3 = 0;
            while (i3 < this.sampleToChunks.length && i >= this.sampleToChunks[i3].getCount()) {
                i -= this.sampleToChunks[i3].getCount();
                i3++;
            }
            long min = this.chunkOffsets[i3] + ((long) (Math.min(i, this.sampleToChunks[i3].getCount() - 1) << 2));
            if (this.input.position() != min) {
                this.input.position(min);
            }
            i2 = NIOUtils.fetchFrom((ReadableByteChannel) this.input, 4).getInt();
        }
        return i2;
    }

    private static boolean isValidTimeCode(String str) {
        return str != null && !str.trim().equals("") && Pattern.compile("[0-9][0-9]:[0-5][0-9]:[0-5][0-9]:[0-2][0-9]").matcher(str).matches();
    }

    public TrakBox getBox() {
        return this.box;
    }

    public int getStartTimecode() throws IOException {
        return getTimecodeSample(0);
    }

    public MP4Packet getTimecode(MP4Packet mP4Packet) throws IOException {
        TrakBox trakBox = this.box;
        int i = 0;
        long editedToMedia = QTTimeUtil.editedToMedia(trakBox, trakBox.rescale(mP4Packet.getPts(), mP4Packet.getTimescale()), this.movie.getTimescale());
        int i2 = 0;
        int i3 = 0;
        while (i < this.sampleCache.length - 1) {
            long sampleDuration = (long) this.timeToSamples[i2].getSampleDuration();
            if (editedToMedia < sampleDuration) {
                break;
            }
            editedToMedia -= sampleDuration;
            i3++;
            TimeToSampleEntry[] timeToSampleEntryArr = this.timeToSamples;
            if (i2 < timeToSampleEntryArr.length - 1 && i3 >= timeToSampleEntryArr[i2].getSampleCount()) {
                i2++;
            }
            i++;
        }
        return new MP4Packet(mP4Packet, getTimecode(getTimecodeSample(i), ((int) (((((editedToMedia * 2) * ((long) this.tse.getTimescale())) / ((long) this.box.getTimescale())) / ((long) this.tse.getFrameDuration())) + 1)) / 2, this.tse));
    }

    public int parseTimecode(String str) {
        String[] split = str.split(":");
        byte numFrames = ((TimecodeSampleEntry) Box.findFirst(this.box, TimecodeSampleEntry.class, "mdia", "minf", "stbl", "stsd", "tmcd")).getNumFrames();
        return Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * numFrames) + (Integer.parseInt(split[1]) * 60 * numFrames) + (Integer.parseInt(split[0]) * 3600 * numFrames);
    }

    public int timeCodeToFrameNo(String str) throws Exception {
        if (!isValidTimeCode(str)) {
            return -1;
        }
        int parseTimecode = parseTimecode(str.trim()) - this.sampleCache[0];
        long numFrames = (long) this.tse.getNumFrames();
        return (int) ((QTTimeUtil.mediaToEdited(this.box, ((long) (parseTimecode * this.tse.getTimescale())) / numFrames, this.movie.getTimescale()) * numFrames) / ((long) this.box.getTimescale()));
    }

    private TapeTimecode getTimecode(int i, int i2, TimecodeSampleEntry timecodeSampleEntry) {
        int dropFrameAdjust = dropFrameAdjust(i2 + i, timecodeSampleEntry);
        int numFrames = dropFrameAdjust / timecodeSampleEntry.getNumFrames();
        TapeTimecode tapeTimecode = new TapeTimecode((short) (numFrames / 3600), (byte) ((numFrames / 60) % 60), (byte) (numFrames % 60), (byte) (dropFrameAdjust % timecodeSampleEntry.getNumFrames()), timecodeSampleEntry.isDropFrame());
        return tapeTimecode;
    }
}
