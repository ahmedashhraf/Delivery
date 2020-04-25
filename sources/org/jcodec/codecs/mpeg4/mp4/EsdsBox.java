package org.jcodec.codecs.mpeg4.mp4;

import java.nio.ByteBuffer;
import org.jcodec.codecs.aac.ADTSParser;
import org.jcodec.codecs.mpeg4.p553es.C15532ES;
import org.jcodec.codecs.mpeg4.p553es.C15533SL;
import org.jcodec.codecs.mpeg4.p553es.DecoderConfig;
import org.jcodec.codecs.mpeg4.p553es.DecoderSpecific;
import org.jcodec.codecs.mpeg4.p553es.Descriptor;
import org.jcodec.common.p554io.BitWriter;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public class EsdsBox extends FullBox {
    private int avgBitrate;
    private int bufSize;
    private int maxBitrate;
    private int objectType;
    private ByteBuffer streamInfo;
    private int trackId;

    public EsdsBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "esds";
    }

    public static Box fromADTS(ADTSParser.Header header) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        BitWriter bitWriter = new BitWriter(allocate);
        bitWriter.writeNBit(header.getObjectType(), 5);
        bitWriter.writeNBit(header.getSamplingIndex(), 4);
        bitWriter.writeNBit(header.getChanConfig(), 4);
        bitWriter.flush();
        allocate.clear();
        EsdsBox esdsBox = new EsdsBox(allocate, header.getObjectType() << 5, 0, 210750, 133350, 2);
        return esdsBox;
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        ByteBuffer byteBuffer2 = this.streamInfo;
        if (byteBuffer2 == null || byteBuffer2.remaining() <= 0) {
            int i = this.trackId;
            DecoderConfig decoderConfig = new DecoderConfig(this.objectType, this.bufSize, this.maxBitrate, this.avgBitrate, new Descriptor[0]);
            new C15532ES(i, decoderConfig, new C15533SL()).write(byteBuffer);
            return;
        }
        int i2 = this.trackId;
        DecoderConfig decoderConfig2 = new DecoderConfig(this.objectType, this.bufSize, this.maxBitrate, this.avgBitrate, new DecoderSpecific(this.streamInfo));
        new C15532ES(i2, decoderConfig2, new C15533SL()).write(byteBuffer);
    }

    public int getAvgBitrate() {
        return this.avgBitrate;
    }

    public int getBufSize() {
        return this.bufSize;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getObjectType() {
        return this.objectType;
    }

    public ByteBuffer getStreamInfo() {
        return this.streamInfo;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        C15532ES es = (C15532ES) Descriptor.read(byteBuffer);
        this.trackId = es.getTrackId();
        DecoderConfig decoderConfig = (DecoderConfig) Descriptor.find(es, DecoderConfig.class, DecoderConfig.tag());
        this.objectType = decoderConfig.getObjectType();
        this.bufSize = decoderConfig.getBufSize();
        this.maxBitrate = decoderConfig.getMaxBitrate();
        this.avgBitrate = decoderConfig.getAvgBitrate();
        this.streamInfo = ((DecoderSpecific) Descriptor.find(decoderConfig, DecoderSpecific.class, DecoderSpecific.tag())).getData();
    }

    public EsdsBox() {
        super(new Header(fourcc()));
    }

    public EsdsBox(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        super(new Header(fourcc()));
        this.objectType = i;
        this.bufSize = i2;
        this.maxBitrate = i3;
        this.avgBitrate = i4;
        this.trackId = i5;
        this.streamInfo = byteBuffer;
    }
}
