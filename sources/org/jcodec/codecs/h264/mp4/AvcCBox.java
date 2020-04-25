package org.jcodec.codecs.h264.mp4;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.common.Assert;
import org.jcodec.common.NIOUtils;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Header;

public class AvcCBox extends Box {
    private int level;
    private int nalLengthSize;
    private List<ByteBuffer> ppsList;
    private int profile;
    private int profileCompat;
    private List<ByteBuffer> spsList;

    public AvcCBox(Box box) {
        super(box);
        this.spsList = new ArrayList();
        this.ppsList = new ArrayList();
    }

    public static String fourcc() {
        return "avcC";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(1);
        byteBuffer.put((byte) this.profile);
        byteBuffer.put((byte) this.profileCompat);
        byteBuffer.put((byte) this.level);
        byteBuffer.put(-1);
        byteBuffer.put((byte) (this.spsList.size() | JpegConst.APP0));
        for (ByteBuffer byteBuffer2 : this.spsList) {
            byteBuffer.putShort((short) (byteBuffer2.remaining() + 1));
            byteBuffer.put(103);
            NIOUtils.write(byteBuffer, byteBuffer2);
        }
        byteBuffer.put((byte) this.ppsList.size());
        for (ByteBuffer byteBuffer3 : this.ppsList) {
            byteBuffer.putShort((short) ((byte) (byteBuffer3.remaining() + 1)));
            byteBuffer.put(104);
            NIOUtils.write(byteBuffer, byteBuffer3);
        }
    }

    public int getLevel() {
        return this.level;
    }

    public int getNalLengthSize() {
        return this.nalLengthSize;
    }

    public List<ByteBuffer> getPpsList() {
        return this.ppsList;
    }

    public int getProfile() {
        return this.profile;
    }

    public int getProfileCompat() {
        return this.profileCompat;
    }

    public List<ByteBuffer> getSpsList() {
        return this.spsList;
    }

    public void parse(ByteBuffer byteBuffer) {
        NIOUtils.skip(byteBuffer, 1);
        this.profile = byteBuffer.get() & 255;
        this.profileCompat = byteBuffer.get() & 255;
        this.level = byteBuffer.get() & 255;
        this.nalLengthSize = (byteBuffer.get() & 255 & 3) + 1;
        byte b = byteBuffer.get() & C5785c.f16676I;
        for (int i = 0; i < b; i++) {
            short s = byteBuffer.getShort();
            Assert.assertEquals(39, (int) byteBuffer.get() & 63);
            this.spsList.add(NIOUtils.read(byteBuffer, s - 1));
        }
        byte b2 = byteBuffer.get() & 255;
        for (int i2 = 0; i2 < b2; i2++) {
            short s2 = byteBuffer.getShort();
            Assert.assertEquals(40, (int) byteBuffer.get() & 63);
            this.ppsList.add(NIOUtils.read(byteBuffer, s2 - 1));
        }
    }

    public AvcCBox() {
        super(new Header(fourcc()));
        this.spsList = new ArrayList();
        this.ppsList = new ArrayList();
    }

    public AvcCBox(Header header) {
        super(header);
        this.spsList = new ArrayList();
        this.ppsList = new ArrayList();
    }

    public AvcCBox(int i, int i2, int i3, int i4, List<ByteBuffer> list, List<ByteBuffer> list2) {
        this();
        this.profile = i;
        this.profileCompat = i2;
        this.level = i3;
        this.nalLengthSize = i4;
        this.spsList = list;
        this.ppsList = list2;
    }
}
