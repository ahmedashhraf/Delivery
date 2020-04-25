package org.jcodec.containers.mps;

import com.google.common.base.C5785c;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import java.util.HashSet;
import org.jcodec.common.Assert;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.tools.MainUtils;
import org.jcodec.common.tools.MainUtils.Cmd;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;
import org.jcodec.containers.mps.psi.PATSection;
import org.jcodec.containers.mps.psi.PMTSection;
import org.jcodec.containers.mps.psi.PMTSection.PMTStream;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class MTSDump extends MPSDump {
    private static final String DUMP_FROM = "dump-from";
    private static final String STOP_AT = "stop-at";
    private ByteBuffer buf = ByteBuffer.allocate(192512);
    private int globalPayload;
    private int guid;
    private int[] nums;
    private int[] payloads;
    private int[] prevNums;
    private int[] prevPayloads;
    private ByteBuffer tsBuf = ByteBuffer.allocate(C13959t.f40864Y2);
    private int tsNo;

    /* renamed from: org.jcodec.containers.mps.MTSDump$a */
    static class C15552a extends HashMap<String, String> {
        C15552a() {
            put(MTSDump.STOP_AT, "Stop reading at timestamp");
            put(MTSDump.DUMP_FROM, "Start dumping from timestamp");
        }
    }

    public MTSDump(ReadableByteChannel readableByteChannel, int i) {
        super(readableByteChannel);
        this.guid = i;
        ByteBuffer byteBuffer = this.buf;
        byteBuffer.position(byteBuffer.limit());
        ByteBuffer byteBuffer2 = this.tsBuf;
        byteBuffer2.position(byteBuffer2.limit());
    }

    private static void dumpProgramPids(ReadableByteChannel readableByteChannel) throws IOException {
        HashSet<Integer> hashSet = new HashSet<>();
        ByteBuffer allocate = ByteBuffer.allocate(192512);
        readableByteChannel.read(allocate);
        allocate.flip();
        allocate.limit(allocate.limit() - (allocate.limit() % C13959t.f40864Y2));
        int i = -1;
        while (allocate.hasRemaining()) {
            ByteBuffer read = NIOUtils.read(allocate, (int) C13959t.f40864Y2);
            Assert.assertEquals(71, (int) read.get() & 255);
            byte b = ((read.get() & 255) << 8) | (read.get() & 255);
            byte b2 = b & 8191;
            if (b2 != 0) {
                hashSet.add(Integer.valueOf(b2));
            }
            if (b2 == 0 || b2 == i) {
                int i2 = (b >> C5785c.f16697p) & 1;
                if ((read.get() & 255 & 32) != 0) {
                    NIOUtils.skip(read, read.get() & 255);
                }
                if (i2 == 1) {
                    NIOUtils.skip(read, read.get() & 255);
                }
                if (b2 == 0) {
                    i = PATSection.parse(read).getPrograms().values()[0];
                } else if (b2 == i) {
                    printPmt(PMTSection.parse(read));
                    return;
                }
            }
        }
        for (Integer println : hashSet) {
            System.out.println(println);
        }
    }

    public static void main(String[] strArr) throws IOException {
        FileChannelWrapper fileChannelWrapper = null;
        try {
            Cmd parseArguments = MainUtils.parseArguments(strArr);
            if (parseArguments.args.length < 1) {
                MainUtils.printHelp(new C15552a(), "file name", "guid");
            } else if (parseArguments.args.length == 1) {
                System.out.println("MTS programs:");
                dumpProgramPids(NIOUtils.readableFileChannel(new File(parseArguments.args[0])));
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            } else {
                fileChannelWrapper = NIOUtils.readableFileChannel(new File(parseArguments.args[0]));
                new MTSDump(fileChannelWrapper, Integer.parseInt(parseArguments.args[1])).dump(parseArguments.getLongFlag(DUMP_FROM), parseArguments.getLongFlag(STOP_AT));
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            }
        } finally {
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
        }
    }

    private int mapPos(long j) {
        int i = this.globalPayload;
        for (int length = this.payloads.length - 1; length >= 0; length--) {
            i -= this.payloads[length];
            if (((long) i) <= j) {
                return this.nums[length];
            }
        }
        int[] iArr = this.prevPayloads;
        if (iArr != null) {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                i -= this.prevPayloads[length2];
                if (((long) i) <= j) {
                    return this.prevNums[length2];
                }
            }
        }
        return -1;
    }

    private static void printPmt(PMTSection pMTSection) {
        PMTStream[] streams;
        for (PMTStream pMTStream : pMTSection.getStreams()) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append(pMTStream.getPid());
            sb.append(": ");
            sb.append(pMTStream.getStreamTypeTag());
            printStream.println(sb.toString());
        }
    }

    public int fillBuffer(ByteBuffer byteBuffer) throws IOException {
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.put(NIOUtils.read(this.tsBuf, Math.min(byteBuffer.remaining(), this.tsBuf.remaining())));
            while (byteBuffer.hasRemaining()) {
                if (!this.buf.hasRemaining()) {
                    ByteBuffer duplicate = this.buf.duplicate();
                    duplicate.clear();
                    int i = -1;
                    if (this.f44848ch.read(duplicate) == -1) {
                        if (byteBuffer.remaining() != remaining) {
                            i = remaining - byteBuffer.remaining();
                        }
                        return i;
                    }
                    duplicate.flip();
                    duplicate.limit(duplicate.limit() - (duplicate.limit() % C13959t.f40864Y2));
                    this.buf = duplicate;
                }
                this.tsBuf = NIOUtils.read(this.buf, (int) C13959t.f40864Y2);
                Assert.assertEquals(71, (int) this.tsBuf.get() & 255);
                this.tsNo++;
                if (((((this.tsBuf.get() & 255) << 8) | (this.tsBuf.get() & 255)) & 8191) == this.guid) {
                    if ((this.tsBuf.get() & 255 & 32) != 0) {
                        NIOUtils.skip(this.tsBuf, this.tsBuf.get() & 255);
                    }
                    this.globalPayload += this.tsBuf.remaining();
                    intArrayList.add(this.tsBuf.remaining());
                    intArrayList2.add(this.tsNo - 1);
                    byteBuffer.put(NIOUtils.read(this.tsBuf, Math.min(byteBuffer.remaining(), this.tsBuf.remaining())));
                }
            }
            this.prevPayloads = this.payloads;
            this.payloads = intArrayList.toArray();
            this.prevNums = this.nums;
            this.nums = intArrayList2.toArray();
            return remaining - byteBuffer.remaining();
        } finally {
            this.prevPayloads = this.payloads;
            this.payloads = intArrayList.toArray();
            this.prevNums = this.nums;
            this.nums = intArrayList2.toArray();
        }
    }

    /* access modifiers changed from: protected */
    public void logPes(PESPacket pESPacket, int i, ByteBuffer byteBuffer) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(pESPacket.streamId);
        sb.append("(");
        sb.append(pESPacket.streamId >= 224 ? "video" : "audio");
        sb.append(")");
        sb.append(" [ts#");
        sb.append(mapPos(pESPacket.pos));
        sb.append(", ");
        sb.append(byteBuffer.remaining() + i);
        sb.append("b], pts: ");
        sb.append(pESPacket.pts);
        sb.append(", dts: ");
        sb.append(pESPacket.dts);
        printStream.println(sb.toString());
    }
}
