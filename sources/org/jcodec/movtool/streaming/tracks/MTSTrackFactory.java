package org.jcodec.movtool.streaming.tracks;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.tracks.MPSTrackFactory.Stream;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSTrackFactory {
    private List<MTSProgram> programs = new ArrayList();

    public class MTSProgram extends MPSTrackFactory {
        /* access modifiers changed from: private */
        public int targetGuid;

        public class MTSStream extends Stream {
            public MTSStream(int i) {
                super(i);
            }

            /* access modifiers changed from: protected */
            public ByteBuffer readPes(SeekableByteChannel seekableByteChannel, long j, int i, int i2, int i3) throws IOException {
                seekableByteChannel.position(j * 188);
                ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, i * C13959t.f40864Y2);
                ByteBuffer duplicate = fetchFrom.duplicate();
                while (fetchFrom.hasRemaining()) {
                    ByteBuffer read = NIOUtils.read(fetchFrom, (int) C13959t.f40864Y2);
                    Assert.assertEquals(71, (int) read.get() & 255);
                    if (((((read.get() & 255) << 8) | (read.get() & 255)) & 8191) == MTSProgram.this.targetGuid) {
                        if ((read.get() & 255 & 32) != 0) {
                            NIOUtils.skip(read, read.get() & 255);
                        }
                        duplicate.put(read);
                    }
                }
                duplicate.flip();
                MPSUtils.readPESHeader(duplicate, 0);
                duplicate.limit(duplicate.position() + i2);
                return duplicate;
            }
        }

        public MTSProgram(ByteBuffer byteBuffer, FilePool filePool) throws IOException {
            super(byteBuffer, filePool);
        }

        /* access modifiers changed from: protected */
        public Stream createStream(int i) {
            return new MTSStream(i);
        }

        /* access modifiers changed from: protected */
        public void readIndex(ByteBuffer byteBuffer) throws IOException {
            this.targetGuid = byteBuffer.getShort() & 65535;
            super.readIndex(byteBuffer);
        }
    }

    public MTSTrackFactory(ByteBuffer byteBuffer, FilePool filePool) throws IOException {
        while (byteBuffer.remaining() >= 6) {
            this.programs.add(new MTSProgram(NIOUtils.read(byteBuffer, byteBuffer.getInt() - 4), filePool));
        }
    }

    public static void main(String[] strArr) throws IOException {
        Stream stream = (Stream) new MTSTrackFactory(NIOUtils.fetchFrom(new File(strArr[1])), new FilePool(new File(strArr[0]), 10)).getVideoStreams().get(0);
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

    public List<Stream> getAudioStreams() {
        ArrayList arrayList = new ArrayList();
        for (MTSProgram audioStreams : this.programs) {
            arrayList.addAll(audioStreams.getAudioStreams());
        }
        return arrayList;
    }

    public List<Stream> getStreams() {
        ArrayList arrayList = new ArrayList();
        for (MTSProgram streams : this.programs) {
            arrayList.addAll(streams.getStreams());
        }
        return arrayList;
    }

    public List<Stream> getVideoStreams() {
        ArrayList arrayList = new ArrayList();
        for (MTSProgram videoStreams : this.programs) {
            arrayList.addAll(videoStreams.getVideoStreams());
        }
        return arrayList;
    }
}
