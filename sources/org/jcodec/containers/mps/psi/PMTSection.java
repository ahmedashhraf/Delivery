package org.jcodec.containers.mps.psi;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.logging.Logger;
import org.jcodec.containers.mps.MPSUtils;
import org.jcodec.containers.mps.MPSUtils.MPEGMediaDescriptor;
import org.jcodec.containers.mps.MTSUtils.StreamType;

public class PMTSection extends PSISection {
    private int pcrPid;
    private PMTStream[] streams;
    private Tag[] tags;

    public static class PMTStream {
        private List<MPEGMediaDescriptor> descriptors;
        private int pid;
        private StreamType streamType;
        private int streamTypeTag;

        public PMTStream(int i, int i2, List<MPEGMediaDescriptor> list) {
            this.streamTypeTag = i;
            this.pid = i2;
            this.descriptors = list;
            this.streamType = StreamType.fromTag(i);
        }

        public List<MPEGMediaDescriptor> getDesctiptors() {
            return this.descriptors;
        }

        public int getPid() {
            return this.pid;
        }

        public StreamType getStreamType() {
            return this.streamType;
        }

        public int getStreamTypeTag() {
            return this.streamTypeTag;
        }
    }

    public static class Tag {
        private ByteBuffer content;
        private int tag;

        public Tag(int i, ByteBuffer byteBuffer) {
            this.tag = i;
            this.content = byteBuffer;
        }

        public ByteBuffer getContent() {
            return this.content;
        }

        public int getTag() {
            return this.tag;
        }
    }

    public PMTSection(PSISection pSISection, int i, Tag[] tagArr, PMTStream[] pMTStreamArr) {
        super(pSISection);
        this.pcrPid = i;
        this.tags = tagArr;
        this.streams = pMTStreamArr;
    }

    public static PMTSection parse(ByteBuffer byteBuffer) {
        PSISection parse = PSISection.parse(byteBuffer);
        short s = byteBuffer.getShort() & 65535 & 8191;
        List parseTags = parseTags(NIOUtils.read(byteBuffer, (int) byteBuffer.getShort() & 65535 & 4095));
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.remaining() > 4) {
            byte b = byteBuffer.get() & 255;
            short s2 = byteBuffer.getShort() & 65535 & 8191;
            Logger.info(String.format("Elementary stream: [%d,%d]", new Object[]{Integer.valueOf(b), Integer.valueOf(s2)}));
            arrayList.add(new PMTStream(b, s2, MPSUtils.parseDescriptors(NIOUtils.read(byteBuffer, (int) byteBuffer.getShort() & 65535 & 4095))));
        }
        return new PMTSection(parse, s, (Tag[]) parseTags.toArray(new Tag[0]), (PMTStream[]) arrayList.toArray(new PMTStream[0]));
    }

    static List<Tag> parseTags(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            Logger.info(String.format("TAG: [0x%x, 0x%x]", new Object[]{Integer.valueOf(b), Integer.valueOf(b2)}));
            arrayList.add(new Tag(b, NIOUtils.read(byteBuffer, (int) b2)));
        }
        return arrayList;
    }

    public int getPcrPid() {
        return this.pcrPid;
    }

    public PMTStream[] getStreams() {
        return this.streams;
    }

    public Tag[] getTags() {
        return this.tags;
    }
}
