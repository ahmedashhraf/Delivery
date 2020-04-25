package org.jcodec.containers.mp4.demuxer;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.DemuxerTrackMeta.Type;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Packet;
import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class PCMMP4DemuxerTrack extends AbstractMP4DemuxerTrack {
    private int defaultSampleSize;
    private SeekableByteChannel input;
    private MovieBox movie;
    private int posShift;
    protected int totalFrames;

    public PCMMP4DemuxerTrack(MovieBox movieBox, TrakBox trakBox, SeekableByteChannel seekableByteChannel) {
        super(trakBox);
        this.movie = movieBox;
        this.input = seekableByteChannel;
        int i = 0;
        this.defaultSampleSize = ((SampleSizesBox) Box.findFirst(trakBox, SampleSizesBox.class, "mdia", "minf", "stbl", "stsz")).getDefaultSize();
        int i2 = 1;
        while (true) {
            SampleToChunkEntry[] sampleToChunkEntryArr = this.sampleToChunks;
            if (i2 < sampleToChunkEntryArr.length) {
                int i3 = i2 - 1;
                int first = (int) (sampleToChunkEntryArr[i2].getFirst() - this.sampleToChunks[i3].getFirst());
                this.totalFrames += this.sampleToChunks[i3].getCount() * first;
                i += first;
                i2++;
            } else {
                this.totalFrames += sampleToChunkEntryArr[sampleToChunkEntryArr.length - 1].getCount() * (this.chunkOffsets.length - i);
                return;
            }
        }
    }

    public long getFrameCount() {
        return (long) this.totalFrames;
    }

    public int getFrameSize() {
        SampleEntry sampleEntry = this.sampleEntries[this.sampleToChunks[this.stscInd].getEntry() - 1];
        if (sampleEntry instanceof AudioSampleEntry) {
            return ((AudioSampleEntry) sampleEntry).calcFrameSize();
        }
        return this.defaultSampleSize;
    }

    public DemuxerTrackMeta getMeta() {
        Type type = Type.AUDIO;
        int i = this.totalFrames;
        double d = (double) this.duration;
        double d2 = (double) this.timescale;
        Double.isNaN(d);
        Double.isNaN(d2);
        DemuxerTrackMeta demuxerTrackMeta = new DemuxerTrackMeta(type, null, i, d / d2, null);
        return demuxerTrackMeta;
    }

    public boolean gotoSyncFrame(long j) {
        return gotoFrame(j);
    }

    public Packet nextFrame() throws IOException {
        return nextFrame(ByteBuffer.allocate((this.sampleToChunks[this.stscInd].getCount() * getFrameSize()) - this.posShift));
    }

    /* access modifiers changed from: protected */
    public void seekPointer(long j) {
        this.stcoInd = 0;
        this.stscInd = 0;
        this.curFrame = 0;
        while (true) {
            long count = this.curFrame + ((long) this.sampleToChunks[this.stscInd].getCount());
            if (count > j) {
                this.posShift = (int) ((j - this.curFrame) * ((long) getFrameSize()));
                this.curFrame = j;
                return;
            }
            this.curFrame = count;
            nextChunk();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ab, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.jcodec.containers.mp4.MP4Packet nextFrame(java.nio.ByteBuffer r31) throws java.io.IOException {
        /*
            r30 = this;
            r7 = r30
            monitor-enter(r30)
            int r0 = r7.stcoInd     // Catch:{ all -> 0x00ac }
            long[] r1 = r7.chunkOffsets     // Catch:{ all -> 0x00ac }
            int r1 = r1.length     // Catch:{ all -> 0x00ac }
            if (r0 < r1) goto L_0x000d
            r0 = 0
            monitor-exit(r30)
            return r0
        L_0x000d:
            int r0 = r30.getFrameSize()     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r1 = r7.sampleToChunks     // Catch:{ all -> 0x00ac }
            int r2 = r7.stscInd     // Catch:{ all -> 0x00ac }
            r1 = r1[r2]     // Catch:{ all -> 0x00ac }
            int r8 = r1.getEntry()     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r1 = r7.sampleToChunks     // Catch:{ all -> 0x00ac }
            int r2 = r7.stscInd     // Catch:{ all -> 0x00ac }
            r1 = r1[r2]     // Catch:{ all -> 0x00ac }
            int r1 = r1.getCount()     // Catch:{ all -> 0x00ac }
            int r1 = r1 * r0
            long[] r2 = r7.chunkOffsets     // Catch:{ all -> 0x00ac }
            int r3 = r7.stcoInd     // Catch:{ all -> 0x00ac }
            r3 = r2[r3]     // Catch:{ all -> 0x00ac }
            int r2 = r7.posShift     // Catch:{ all -> 0x00ac }
            long r5 = (long) r2     // Catch:{ all -> 0x00ac }
            long r24 = r3 + r5
            int r2 = r7.posShift     // Catch:{ all -> 0x00ac }
            int r26 = r1 - r2
            org.jcodec.common.SeekableByteChannel r2 = r7.input     // Catch:{ all -> 0x00ac }
            r1 = r30
            r3 = r31
            r4 = r24
            r6 = r26
            java.nio.ByteBuffer r10 = r1.readPacketData(r2, r3, r4, r6)     // Catch:{ all -> 0x00ac }
            long r1 = r7.pts     // Catch:{ all -> 0x00ac }
            int r0 = r26 / r0
            long r3 = (long) r0     // Catch:{ all -> 0x00ac }
            r7.shiftPts(r3)     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.MP4Packet r0 = new org.jcodec.containers.mp4.MP4Packet     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.TrakBox r5 = r7.box     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.MovieBox r6 = r7.movie     // Catch:{ all -> 0x00ac }
            int r6 = r6.getTimescale()     // Catch:{ all -> 0x00ac }
            long r11 = org.jcodec.containers.mp4.QTTimeUtil.mediaToEdited(r5, r1, r6)     // Catch:{ all -> 0x00ac }
            int r5 = r7.timescale     // Catch:{ all -> 0x00ac }
            long r13 = (long) r5     // Catch:{ all -> 0x00ac }
            long r5 = r7.pts     // Catch:{ all -> 0x00ac }
            long r5 = r5 - r1
            int r6 = (int) r5     // Catch:{ all -> 0x00ac }
            long r5 = (long) r6     // Catch:{ all -> 0x00ac }
            r28 = r3
            long r3 = r7.curFrame     // Catch:{ all -> 0x00ac }
            r19 = 1
            r20 = 0
            int r23 = r8 + -1
            r27 = 1
            r9 = r0
            r15 = r5
            r17 = r3
            r21 = r1
            r9.<init>(r10, r11, r13, r15, r17, r19, r20, r21, r23, r24, r26, r27)     // Catch:{ all -> 0x00ac }
            long r1 = r7.curFrame     // Catch:{ all -> 0x00ac }
            long r1 = r1 + r28
            r7.curFrame = r1     // Catch:{ all -> 0x00ac }
            r1 = 0
            r7.posShift = r1     // Catch:{ all -> 0x00ac }
            int r1 = r7.stcoInd     // Catch:{ all -> 0x00ac }
            int r1 = r1 + 1
            r7.stcoInd = r1     // Catch:{ all -> 0x00ac }
            int r1 = r7.stscInd     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r2 = r7.sampleToChunks     // Catch:{ all -> 0x00ac }
            int r2 = r2.length     // Catch:{ all -> 0x00ac }
            int r2 = r2 + -1
            if (r1 >= r2) goto L_0x00aa
            int r1 = r7.stcoInd     // Catch:{ all -> 0x00ac }
            int r1 = r1 + 1
            long r1 = (long) r1     // Catch:{ all -> 0x00ac }
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r3 = r7.sampleToChunks     // Catch:{ all -> 0x00ac }
            int r4 = r7.stscInd     // Catch:{ all -> 0x00ac }
            int r4 = r4 + 1
            r3 = r3[r4]     // Catch:{ all -> 0x00ac }
            long r3 = r3.getFirst()     // Catch:{ all -> 0x00ac }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00aa
            int r1 = r7.stscInd     // Catch:{ all -> 0x00ac }
            int r1 = r1 + 1
            r7.stscInd = r1     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r30)
            return r0
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r30)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.demuxer.PCMMP4DemuxerTrack.nextFrame(java.nio.ByteBuffer):org.jcodec.containers.mp4.MP4Packet");
    }
}
