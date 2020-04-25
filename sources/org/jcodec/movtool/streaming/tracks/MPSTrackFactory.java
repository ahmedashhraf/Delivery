package org.jcodec.movtool.streaming.tracks;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.RunLength.Integer;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class MPSTrackFactory {
    /* access modifiers changed from: private */

    /* renamed from: fp */
    public FilePool f44923fp;
    /* access modifiers changed from: private */
    public long[] pesTokens;
    /* access modifiers changed from: private */
    public int[] streams;
    private Map<Integer, Stream> tracks = new HashMap();

    public class Stream implements VirtualTrack {
        private int curFrame;
        /* access modifiers changed from: private */
        public long duration;
        private long fileOff;
        /* access modifiers changed from: private */
        public long[] fpts;
        /* access modifiers changed from: private */
        public int[] fsizes;
        private int offInPayload;
        private int pesIdx;
        /* access modifiers changed from: private */

        /* renamed from: si */
        public ByteBuffer f44924si;
        /* access modifiers changed from: private */
        public int siLen;
        /* access modifiers changed from: private */
        public int streamId;
        /* access modifiers changed from: private */
        public int[] sync;

        protected class MPSPacket implements VirtualPacket {
            private int curFrame;
            private long fileOff;
            private int pesIdx;
            private int pesOff;

            public MPSPacket(int i, long j, int i2, int i3) {
                this.pesOff = i;
                this.fileOff = j;
                this.curFrame = i2;
                this.pesIdx = i3;
            }

            public ByteBuffer getData() throws IOException {
                ByteBuffer allocate = ByteBuffer.allocate(Stream.this.siLen + Stream.this.fsizes[this.curFrame]);
                allocate.put(Stream.this.f44924si.duplicate());
                SeekableByteChannel seekableByteChannel = null;
                try {
                    seekableByteChannel = MPSTrackFactory.this.f44923fp.getChannel();
                    long j = this.fileOff;
                    ByteBuffer readPes = Stream.this.readPes(seekableByteChannel, j, Stream.this.pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]), Stream.this.payloadLen(MPSTrackFactory.this.pesTokens[this.pesIdx]), this.pesIdx);
                    long access$600 = j + ((long) Stream.this.pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]));
                    NIOUtils.skip(readPes, this.pesOff);
                    allocate.put(NIOUtils.read(readPes, Math.min(readPes.remaining(), allocate.remaining())));
                    int i = this.pesIdx;
                    while (allocate.hasRemaining()) {
                        i++;
                        long j2 = 0;
                        while (MPSTrackFactory.this.streams[i] != Stream.this.streamId && i < MPSTrackFactory.this.pesTokens.length) {
                            j2 += (long) (Stream.this.pesLen(MPSTrackFactory.this.pesTokens[i]) + Stream.this.leadingSize(MPSTrackFactory.this.pesTokens[i]));
                            i++;
                        }
                        long j3 = access$600;
                        ByteBuffer readPes2 = Stream.this.readPes(seekableByteChannel, ((long) Stream.this.leadingSize(MPSTrackFactory.this.pesTokens[i])) + access$600 + j2, Stream.this.pesLen(MPSTrackFactory.this.pesTokens[i]), Stream.this.payloadLen(MPSTrackFactory.this.pesTokens[i]), i);
                        access$600 = j3 + j2 + ((long) Stream.this.leadingSize(MPSTrackFactory.this.pesTokens[i])) + ((long) Stream.this.pesLen(MPSTrackFactory.this.pesTokens[i]));
                        allocate.put(NIOUtils.read(readPes2, Math.min(readPes2.remaining(), allocate.remaining())));
                    }
                    allocate.flip();
                    return allocate;
                } finally {
                    NIOUtils.closeQuietly(seekableByteChannel);
                }
            }

            public int getDataLen() throws IOException {
                return Stream.this.siLen + Stream.this.fsizes[this.curFrame];
            }

            public double getDuration() {
                double access$1100 = (double) Stream.this.duration;
                Double.isNaN(access$1100);
                return access$1100 / 90000.0d;
            }

            public int getFrameNo() {
                return this.curFrame;
            }

            public double getPts() {
                double d = (double) (Stream.this.fpts[this.curFrame] - Stream.this.fpts[0]);
                Double.isNaN(d);
                return d / 90000.0d;
            }

            public boolean isKeyframe() {
                return Stream.this.sync.length == 0 || Arrays.binarySearch(Stream.this.sync, this.curFrame) >= 0;
            }
        }

        public Stream(int i) {
            this.streamId = i;
        }

        /* access modifiers changed from: private */
        public int leadingSize(long j) {
            return (int) ((j >>> 48) & 65535);
        }

        /* access modifiers changed from: private */
        public int payloadLen(long j) {
            return (int) (j & 16777215);
        }

        /* access modifiers changed from: private */
        public int pesLen(long j) {
            return (int) ((j >>> 24) & 16777215);
        }

        public void close() throws IOException {
            MPSTrackFactory.this.f44923fp.close();
        }

        public CodecMeta getCodecMeta() {
            return new VideoCodecMeta("m2v1", ByteBuffer.allocate(0), new Size(1920, 1080), new Rational(1, 1));
        }

        public VirtualEdit[] getEdits() {
            return null;
        }

        public int getPreferredTimescale() {
            return 90000;
        }

        public VirtualPacket nextPacket() throws IOException {
            int i = this.curFrame;
            if (i >= this.fsizes.length) {
                return null;
            }
            MPSPacket mPSPacket = new MPSPacket(this.offInPayload, this.fileOff, i, this.pesIdx);
            this.offInPayload += this.fsizes[this.curFrame];
            while (this.pesIdx < MPSTrackFactory.this.streams.length && this.offInPayload >= payloadLen(MPSTrackFactory.this.pesTokens[this.pesIdx])) {
                this.offInPayload -= payloadLen(MPSTrackFactory.this.pesTokens[this.pesIdx]);
                this.fileOff += (long) pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]);
                this.pesIdx++;
                if (this.pesIdx < MPSTrackFactory.this.streams.length) {
                    long j = 0;
                    while (MPSTrackFactory.this.streams[this.pesIdx] != this.streamId) {
                        j += (long) (pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]) + leadingSize(MPSTrackFactory.this.pesTokens[this.pesIdx]));
                        this.pesIdx++;
                    }
                    this.fileOff += j + ((long) leadingSize(MPSTrackFactory.this.pesTokens[this.pesIdx]));
                }
            }
            this.curFrame++;
            return mPSPacket;
        }

        public void parseIndex(ByteBuffer byteBuffer) throws IOException {
            this.siLen = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            this.fsizes = new int[i];
            this.fpts = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.fsizes[i2] = byteBuffer.getInt();
            }
            int i3 = byteBuffer.getInt();
            this.sync = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                this.sync[i4] = byteBuffer.getInt();
            }
            for (int i5 = 0; i5 < i; i5++) {
                this.fpts[i5] = ((long) byteBuffer.getInt()) & 4294967295L;
            }
            long[] copyOf = Arrays.copyOf(this.fpts, 10);
            Arrays.sort(copyOf);
            long[] jArr = new long[10];
            long[] jArr2 = this.fpts;
            System.arraycopy(jArr2, jArr2.length - 10, jArr, 0, 10);
            Arrays.sort(jArr);
            long j = jArr[9] - copyOf[0];
            long[] jArr3 = this.fpts;
            this.duration = (j + ((long) (jArr3.length >> 1))) / ((long) jArr3.length);
            this.offInPayload = this.siLen;
            this.fileOff = 0;
            while (MPSTrackFactory.this.streams[this.pesIdx] != this.streamId) {
                this.fileOff += (long) (pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]) + leadingSize(MPSTrackFactory.this.pesTokens[this.pesIdx]));
                this.pesIdx++;
            }
            this.fileOff += (long) leadingSize(MPSTrackFactory.this.pesTokens[this.pesIdx]);
            SeekableByteChannel seekableByteChannel = null;
            try {
                seekableByteChannel = MPSTrackFactory.this.f44923fp.getChannel();
                this.f44924si = NIOUtils.read(readPes(seekableByteChannel, this.fileOff, pesLen(MPSTrackFactory.this.pesTokens[this.pesIdx]), payloadLen(MPSTrackFactory.this.pesTokens[this.pesIdx]), this.pesIdx), this.siLen);
            } finally {
                NIOUtils.closeQuietly((ReadableByteChannel) seekableByteChannel);
            }
        }

        /* access modifiers changed from: protected */
        public ByteBuffer readPes(SeekableByteChannel seekableByteChannel, long j, int i, int i2, int i3) throws IOException {
            seekableByteChannel.position(j);
            ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, i);
            MPSUtils.readPESHeader(fetchFrom, 0);
            return fetchFrom;
        }
    }

    public MPSTrackFactory(ByteBuffer byteBuffer, FilePool filePool) throws IOException {
        this.f44923fp = filePool;
        readIndex(byteBuffer);
    }

    private Stream getStream(Map<Integer, Stream> map, int i) {
        Stream stream = (Stream) map.get(Integer.valueOf(i));
        if (stream != null) {
            return stream;
        }
        Stream createStream = createStream(i);
        map.put(Integer.valueOf(i), createStream);
        return createStream;
    }

    public static void main(String[] strArr) throws IOException {
        Stream stream = (Stream) new MPSTrackFactory(NIOUtils.fetchFrom(new File(strArr[1])), new FilePool(new File(strArr[0]), 10)).getVideoStreams().get(0);
        FileChannelWrapper writableFileChannel = NIOUtils.writableFileChannel(new File(strArr[2]));
        ArrayList<VirtualPacket> arrayList = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            arrayList.add(stream.nextPacket());
        }
        for (VirtualPacket data : arrayList) {
            writableFileChannel.write(data.getData());
        }
        writableFileChannel.close();
    }

    /* access modifiers changed from: protected */
    public Stream createStream(int i) {
        return new Stream(i);
    }

    public List<Stream> getAudioStreams() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.tracks.entrySet()) {
            if (MPSUtils.audioStream(((Integer) entry.getKey()).intValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public List<Stream> getStreams() {
        return new ArrayList(this.tracks.values());
    }

    public List<Stream> getVideoStreams() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.tracks.entrySet()) {
            if (MPSUtils.videoStream(((Integer) entry.getKey()).intValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void readIndex(ByteBuffer byteBuffer) throws IOException {
        this.pesTokens = new long[byteBuffer.getInt()];
        int i = 0;
        while (true) {
            long[] jArr = this.pesTokens;
            if (i >= jArr.length) {
                break;
            }
            jArr[i] = byteBuffer.getLong();
            i++;
        }
        this.streams = Integer.parse(byteBuffer).flattern();
        while (byteBuffer.hasRemaining()) {
            getStream(this.tracks, byteBuffer.get() & 255).parseIndex(byteBuffer);
        }
    }
}
