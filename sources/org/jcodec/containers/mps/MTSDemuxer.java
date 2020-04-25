package org.jcodec.containers.mps;

import androidx.core.p034l.C0986h;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jcodec.common.Assert;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.IntObjectMap;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.MPEGDemuxer.MPEGDemuxerTrack;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSDemuxer implements MPEGDemuxer {
    private MPSDemuxer psDemuxer = new MPSDemuxer(this.tsChannel);
    private SeekableByteChannel tsChannel;

    public static class MTSPacket {
        public ByteBuffer payload;
        public boolean payloadStart;
        public int pid;

        public MTSPacket(int i, boolean z, ByteBuffer byteBuffer) {
            this.pid = i;
            this.payloadStart = z;
            this.payload = byteBuffer;
        }
    }

    /* renamed from: org.jcodec.containers.mps.MTSDemuxer$a */
    private static class C15551a implements SeekableByteChannel {

        /* renamed from: N */
        private int f44860N;

        /* renamed from: a */
        private SeekableByteChannel f44861a;

        /* renamed from: b */
        private ByteBuffer f44862b;

        public C15551a(SeekableByteChannel seekableByteChannel, int i) {
            this.f44861a = seekableByteChannel;
            this.f44860N = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public MTSPacket mo49108a(ReadableByteChannel readableByteChannel) throws IOException {
            while (true) {
                MTSPacket readPacket = MTSDemuxer.readPacket(readableByteChannel);
                if (readPacket == null) {
                    return null;
                }
                int i = readPacket.pid;
                if (i > 15 && i != 8191 && readPacket.payload != null) {
                    while (readPacket.pid != this.f44860N) {
                        readPacket = MTSDemuxer.readPacket(readableByteChannel);
                        if (readPacket == null) {
                            return null;
                        }
                    }
                    return readPacket;
                }
            }
        }

        public void close() throws IOException {
            this.f44861a.close();
        }

        public boolean isOpen() {
            return this.f44861a.isOpen();
        }

        public long position() throws IOException {
            return this.f44861a.position();
        }

        public int read(ByteBuffer byteBuffer) throws IOException {
            while (true) {
                ByteBuffer byteBuffer2 = this.f44862b;
                if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                    MTSPacket a = mo49108a(this.f44861a);
                    if (a == null) {
                        return -1;
                    }
                    this.f44862b = a.payload;
                } else {
                    int min = Math.min(byteBuffer.remaining(), this.f44862b.remaining());
                    byteBuffer.put(NIOUtils.read(this.f44862b, min));
                    return min;
                }
            }
        }

        public long size() throws IOException {
            return this.f44861a.size();
        }

        public SeekableByteChannel truncate(long j) throws IOException {
            return this.f44861a.truncate(j);
        }

        public int write(ByteBuffer byteBuffer) throws IOException {
            throw new UnsupportedOperationException();
        }

        public SeekableByteChannel position(long j) throws IOException {
            this.f44861a.position(j);
            this.f44862b = null;
            return this;
        }
    }

    public MTSDemuxer(SeekableByteChannel seekableByteChannel, int i) throws IOException {
        this.tsChannel = new C15551a(seekableByteChannel, i);
    }

    public static Set<Integer> getPrograms(SeekableByteChannel seekableByteChannel) throws IOException {
        long position = seekableByteChannel.position();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            if (hashSet.size() != 0 && i >= hashSet.size() * 500) {
                break;
            }
            MTSPacket readPacket = readPacket(seekableByteChannel);
            if (readPacket == null) {
                break;
            }
            ByteBuffer byteBuffer = readPacket.payload;
            if (byteBuffer != null && !hashSet.contains(Integer.valueOf(readPacket.pid)) && (byteBuffer.duplicate().getInt() & C0986h.f4419u) == 256) {
                hashSet.add(Integer.valueOf(readPacket.pid));
            }
            i++;
        }
        seekableByteChannel.position(position);
        return hashSet;
    }

    public static MTSPacket parsePacket(ByteBuffer byteBuffer) {
        Assert.assertEquals(71, (int) byteBuffer.get() & 255);
        short s = byteBuffer.getShort();
        short s2 = s & 8191;
        boolean z = true;
        int i = (s >> 14) & 1;
        byte b = byteBuffer.get() & 255;
        if ((b & 32) != 0) {
            NIOUtils.skip(byteBuffer, ((byteBuffer.get() & 255) + 1) - 1);
        }
        if (i != 1) {
            z = false;
        }
        if ((b & 16) == 0) {
            byteBuffer = null;
        }
        return new MTSPacket(s2, z, byteBuffer);
    }

    public static int probe(ByteBuffer byteBuffer) {
        IntObjectMap intObjectMap = new IntObjectMap();
        while (true) {
            try {
                ByteBuffer read = NIOUtils.read(byteBuffer, (int) C13959t.f40864Y2);
                if (read.remaining() < 188) {
                    break;
                }
                MTSPacket parsePacket = parsePacket(read);
                if (parsePacket == null) {
                    break;
                }
                List list = (List) intObjectMap.get(parsePacket.pid);
                if (list == null) {
                    list = new ArrayList();
                    intObjectMap.put(parsePacket.pid, list);
                }
                if (parsePacket.payload != null) {
                    list.add(parsePacket.payload);
                }
            } catch (Throwable unused) {
            }
        }
        int i = 0;
        for (int i2 : intObjectMap.keys()) {
            int probe = MPSDemuxer.probe(NIOUtils.combine((Iterable) intObjectMap.get(i2)));
            if (probe > i) {
                i = probe;
            }
        }
        return i;
    }

    public static MTSPacket readPacket(ReadableByteChannel readableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(C13959t.f40864Y2);
        if (NIOUtils.read(readableByteChannel, allocate) != 188) {
            return null;
        }
        allocate.flip();
        return parsePacket(allocate);
    }

    public List<? extends MPEGDemuxerTrack> getAudioTracks() {
        return this.psDemuxer.getAudioTracks();
    }

    public List<? extends MPEGDemuxerTrack> getTracks() {
        return this.psDemuxer.getTracks();
    }

    public List<? extends MPEGDemuxerTrack> getVideoTracks() {
        return this.psDemuxer.getVideoTracks();
    }

    public void seekByte(long j) throws IOException {
        this.tsChannel.position(j - (j % 188));
        this.psDemuxer.reset();
    }

    public static Set<Integer> getPrograms(File file) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                Set<Integer> programs = getPrograms((SeekableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return programs;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }
}
