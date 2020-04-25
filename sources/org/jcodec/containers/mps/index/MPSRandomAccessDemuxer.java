package org.jcodec.containers.mps.index;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.SeekableDemuxerTrack;
import org.jcodec.common.model.Packet;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.containers.mps.index.MPSIndex.MPSStreamIndex;

public class MPSRandomAccessDemuxer {
    /* access modifiers changed from: private */
    public int[] pesStreamIds;
    /* access modifiers changed from: private */
    public long[] pesTokens;
    private Stream[] streams;

    public class Stream extends MPSStreamIndex implements SeekableDemuxerTrack {
        private static final int MPEG_TIMESCALE = 90000;
        private int curFrame;
        private int curPesIdx;
        private long[] foffs;
        private ByteBuffer pesBuf;
        private int seekToFrame = -1;
        protected SeekableByteChannel source;

        public Stream(MPSStreamIndex mPSStreamIndex, SeekableByteChannel seekableByteChannel) throws IOException {
            super(mPSStreamIndex);
            this.source = seekableByteChannel;
            this.foffs = new long[this.fsizes.length];
            long j = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.fsizes;
                if (i < iArr.length) {
                    this.foffs[i] = j;
                    j += (long) iArr[i];
                    i++;
                } else {
                    Arrays.sort(Arrays.copyOf(mPSStreamIndex.getFpts(), 100));
                    this.seekToFrame = 0;
                    seekToFrame();
                    return;
                }
            }
        }

        private void seekToFrame() throws IOException {
            int i = this.seekToFrame;
            if (i != -1) {
                this.curFrame = i;
                long j = this.foffs[this.curFrame];
                reset();
                this.curPesIdx = 0;
                long j2 = 0;
                while (true) {
                    if (MPSRandomAccessDemuxer.this.pesStreamIds[this.curPesIdx] == this.streamId) {
                        long payLoadSize = (long) MPSIndex.payLoadSize(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]);
                        if (j < payLoadSize) {
                            skip(j2 + ((long) MPSIndex.leadingSize(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx])));
                            this.pesBuf = fetch(MPSIndex.pesLen(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]));
                            MPSUtils.readPESHeader(this.pesBuf, 0);
                            NIOUtils.skip(this.pesBuf, (int) j);
                            this.seekToFrame = -1;
                            return;
                        }
                        j -= payLoadSize;
                    }
                    j2 += (long) (MPSIndex.pesLen(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]) + MPSIndex.leadingSize(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]));
                    this.curPesIdx++;
                }
            }
        }

        /* access modifiers changed from: protected */
        public ByteBuffer fetch(int i) throws IOException {
            return NIOUtils.fetchFrom((ReadableByteChannel) this.source, i);
        }

        public long getCurFrame() {
            return (long) this.curFrame;
        }

        public DemuxerTrackMeta getMeta() {
            return null;
        }

        public boolean gotoFrame(long j) {
            this.seekToFrame = (int) j;
            return true;
        }

        public boolean gotoSyncFrame(long j) {
            int i = 0;
            while (true) {
                int[] iArr = this.sync;
                if (i >= iArr.length) {
                    this.seekToFrame = iArr[iArr.length - 1];
                    return true;
                } else if (((long) iArr[i]) > j) {
                    this.seekToFrame = iArr[i - 1];
                    return true;
                } else {
                    i++;
                }
            }
        }

        public Packet nextFrame() throws IOException {
            seekToFrame();
            int i = this.curFrame;
            int[] iArr = this.fsizes;
            if (i >= iArr.length) {
                return null;
            }
            return nextFrame(ByteBuffer.allocate(iArr[i]));
        }

        /* access modifiers changed from: protected */
        public void reset() throws IOException {
            this.source.position(0);
        }

        public void seek(double d) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void skip(long j) throws IOException {
            SeekableByteChannel seekableByteChannel = this.source;
            seekableByteChannel.position(seekableByteChannel.position() + j);
        }

        public Packet nextFrame(ByteBuffer byteBuffer) throws IOException {
            seekToFrame();
            int i = this.curFrame;
            int[] iArr = this.fsizes;
            if (i >= iArr.length) {
                return null;
            }
            int i2 = iArr[i];
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(duplicate.position() + i2);
            while (duplicate.hasRemaining()) {
                if (this.pesBuf.hasRemaining()) {
                    ByteBuffer byteBuffer2 = this.pesBuf;
                    duplicate.put(NIOUtils.read(byteBuffer2, Math.min(byteBuffer2.remaining(), duplicate.remaining())));
                } else {
                    this.curPesIdx++;
                    long j = 0;
                    while (MPSRandomAccessDemuxer.this.pesStreamIds[this.curPesIdx] != this.streamId) {
                        j += (long) (MPSIndex.pesLen(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]) + MPSIndex.leadingSize(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]));
                        this.curPesIdx++;
                    }
                    skip(j + ((long) MPSIndex.leadingSize(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx])));
                    this.pesBuf = fetch(MPSIndex.pesLen(MPSRandomAccessDemuxer.this.pesTokens[this.curPesIdx]));
                    MPSUtils.readPESHeader(this.pesBuf, 0);
                }
            }
            duplicate.flip();
            int[] iArr2 = this.fpts;
            int i3 = this.curFrame;
            long j2 = (long) iArr2[i3];
            long j3 = (long) this.fdur[i3];
            long j4 = (long) i3;
            int[] iArr3 = this.sync;
            Packet packet = new Packet(duplicate, j2, 90000, j3, j4, iArr3.length == 0 || Arrays.binarySearch(iArr3, i3) >= 0, null);
            this.curFrame++;
            return packet;
        }
    }

    public MPSRandomAccessDemuxer(SeekableByteChannel seekableByteChannel, MPSIndex mPSIndex) throws IOException {
        this.pesTokens = mPSIndex.getPesTokens();
        this.pesStreamIds = mPSIndex.getPesStreamIds().flattern();
        MPSStreamIndex[] streams2 = mPSIndex.getStreams();
        this.streams = new Stream[streams2.length];
        for (int i = 0; i < streams2.length; i++) {
            this.streams[i] = newStream(seekableByteChannel, streams2[i]);
        }
    }

    public Stream[] getStreams() {
        return this.streams;
    }

    /* access modifiers changed from: protected */
    public Stream newStream(SeekableByteChannel seekableByteChannel, MPSStreamIndex mPSStreamIndex) throws IOException {
        return new Stream(mPSStreamIndex, seekableByteChannel);
    }
}
