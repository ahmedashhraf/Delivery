package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedList;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;

public class SegmentTypeBox extends Box {
    private Collection<String> compBrands = new LinkedList();
    private String majorBrand;
    private int minorVersion;

    public SegmentTypeBox(String str, int i, Collection<String> collection) {
        super(new Header(fourcc()));
        this.majorBrand = str;
        this.minorVersion = i;
        this.compBrands = collection;
    }

    public static String fourcc() {
        return "styp";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(JCodecUtil.asciiString(this.majorBrand));
        byteBuffer.putInt(this.minorVersion);
        for (String asciiString : this.compBrands) {
            byteBuffer.put(JCodecUtil.asciiString(asciiString));
        }
    }

    public Collection<String> getCompBrands() {
        return this.compBrands;
    }

    public String getMajorBrand() {
        return this.majorBrand;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.majorBrand = NIOUtils.readString(byteBuffer, 4);
        this.minorVersion = byteBuffer.getInt();
        while (true) {
            String readString = NIOUtils.readString(byteBuffer, 4);
            if (readString != null) {
                this.compBrands.add(readString);
            } else {
                return;
            }
        }
    }

    public SegmentTypeBox() {
        super(new Header(fourcc()));
    }
}
