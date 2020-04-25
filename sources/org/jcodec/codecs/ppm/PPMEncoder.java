package org.jcodec.codecs.ppm;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class PPMEncoder {
    public ByteBuffer encodeFrame(Picture picture) {
        if (picture.getColor() == ColorSpace.RGB) {
            ByteBuffer allocate = ByteBuffer.allocate((picture.getWidth() * picture.getHeight() * 3) + 200);
            StringBuilder sb = new StringBuilder();
            sb.append("P6 ");
            sb.append(picture.getWidth());
            sb.append(C3868i.f12248b);
            sb.append(picture.getHeight());
            sb.append(" 255\n");
            allocate.put(JCodecUtil.asciiString(sb.toString()));
            int[][] data = picture.getData();
            for (int i = 0; i < picture.getWidth() * picture.getHeight() * 3; i += 3) {
                allocate.put((byte) data[0][i + 2]);
                allocate.put((byte) data[0][i + 1]);
                allocate.put((byte) data[0][i]);
            }
            allocate.flip();
            return allocate;
        }
        throw new IllegalArgumentException("Only RGB image can be stored in PPM");
    }
}
