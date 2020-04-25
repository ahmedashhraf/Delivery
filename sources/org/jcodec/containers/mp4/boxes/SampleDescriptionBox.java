package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jivesoftware.smackx.time.packet.Time;

public class SampleDescriptionBox extends NodeBox {
    public static final MyFactory FACTORY = new MyFactory();

    public static class MyFactory extends BoxFactory {
        public MyFactory() {
            Class<TimecodeSampleEntry> cls = TimecodeSampleEntry.class;
            Class<SampleEntry> cls2 = SampleEntry.class;
            Class<VideoSampleEntry> cls3 = VideoSampleEntry.class;
            Class<AudioSampleEntry> cls4 = AudioSampleEntry.class;
            clear();
            override("ap4h", cls3);
            override("apch", cls3);
            override("apcn", cls3);
            override("apcs", cls3);
            override("apco", cls3);
            override("avc1", cls3);
            override("cvid", cls3);
            override("jpeg", cls3);
            override("smc ", cls3);
            override("rle ", cls3);
            override("rpza", cls3);
            override("kpcd", cls3);
            override("png ", cls3);
            override("mjpa", cls3);
            override("mjpb", cls3);
            override("SVQ1", cls3);
            override("SVQ3", cls3);
            override("mp4v", cls3);
            override("dvc ", cls3);
            override("dvcp", cls3);
            override("gif ", cls3);
            override("h263", cls3);
            override("tiff", cls3);
            String str = "raw ";
            override(str, cls3);
            override("2vuY", cls3);
            override("yuv2", cls3);
            override("v308", cls3);
            override("v408", cls3);
            override("v216", cls3);
            override("v410", cls3);
            override("v210", cls3);
            override("m2v1", cls3);
            override("m1v1", cls3);
            override("xd5b", cls3);
            override("dv5n", cls3);
            override("jp2h", cls3);
            override("mjp2", cls3);
            override("ac-3", cls4);
            override("cac3", cls4);
            String str2 = "ima4";
            override(str2, cls4);
            override("aac ", cls4);
            override("celp", cls4);
            override("hvxc", cls4);
            override("twvq", cls4);
            override(".mp1", cls4);
            override(".mp2", cls4);
            override("midi", cls4);
            override("apvs", cls4);
            override("alac", cls4);
            override("aach", cls4);
            override("aacl", cls4);
            override("aace", cls4);
            override("aacf", cls4);
            override("aacp", cls4);
            override("aacs", cls4);
            override("samr", cls4);
            override("AUDB", cls4);
            override("ilbc", cls4);
            override(new String("ms\u0000\u0011"), cls4);
            override(new String("ms\u00001"), cls4);
            override("aes3", cls4);
            override("NONE", cls4);
            override(str, cls4);
            override("twos", cls4);
            override("sowt", cls4);
            override("MAC3 ", cls4);
            override("MAC6 ", cls4);
            override(str2, cls4);
            override("fl32", cls4);
            override("fl64", cls4);
            override("in24", cls4);
            override("in32", cls4);
            override("ulaw", cls4);
            override("alaw", cls4);
            override("dvca", cls4);
            override("QDMC", cls4);
            override("QDM2", cls4);
            override("Qclp", cls4);
            override(".mp3", cls4);
            override("mp4a", cls4);
            override("lpcm", cls4);
            override("tmcd", cls);
            override(Time.ELEMENT, cls);
            override("c608", cls2);
            override("c708", cls2);
            override("text", cls2);
        }
    }

    public SampleDescriptionBox(Header header) {
        super(header);
        this.factory = FACTORY;
    }

    public static String fourcc() {
        return "stsd";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.boxes.size());
        super.doWrite(byteBuffer);
    }

    public void parse(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.getInt();
        super.parse(byteBuffer);
    }

    public SampleDescriptionBox() {
        this(new Header(fourcc()));
    }

    public SampleDescriptionBox(SampleEntry... sampleEntryArr) {
        this();
        for (SampleEntry add : sampleEntryArr) {
            this.boxes.add(add);
        }
    }
}
