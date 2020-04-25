package org.jcodec.codecs.mpeg12.bitstream;

import java.nio.ByteBuffer;
import org.jcodec.common.model.Point;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

public class PictureDisplayExtension implements MPEGHeader {
    public Point[] frame_centre_offsets;

    private static int numberOfFrameCentreOffsets(SequenceExtension sequenceExtension, PictureCodingExtension pictureCodingExtension) {
        if (sequenceExtension == null || pictureCodingExtension == null) {
            throw new IllegalArgumentException("PictureDisplayExtension requires SequenceExtension and PictureCodingExtension to be present");
        } else if (sequenceExtension.progressive_sequence == 1) {
            if (pictureCodingExtension.repeat_first_field == 1) {
                return pictureCodingExtension.top_field_first == 1 ? 3 : 2;
            }
            return 1;
        } else if (pictureCodingExtension.picture_structure != 3) {
            return 1;
        } else {
            return pictureCodingExtension.repeat_first_field == 1 ? 3 : 2;
        }
    }

    public static PictureDisplayExtension read(BitReader bitReader, SequenceExtension sequenceExtension, PictureCodingExtension pictureCodingExtension) {
        PictureDisplayExtension pictureDisplayExtension = new PictureDisplayExtension();
        pictureDisplayExtension.frame_centre_offsets = new Point[numberOfFrameCentreOffsets(sequenceExtension, pictureCodingExtension)];
        for (int i = 0; i < pictureDisplayExtension.frame_centre_offsets.length; i++) {
            int readNBit = bitReader.readNBit(16);
            bitReader.read1Bit();
            int readNBit2 = bitReader.readNBit(16);
            bitReader.read1Bit();
            pictureDisplayExtension.frame_centre_offsets[i] = new Point(readNBit, readNBit2);
        }
        return pictureDisplayExtension;
    }

    public void write(ByteBuffer byteBuffer) {
        Point[] pointArr;
        BitWriter bitWriter = new BitWriter(byteBuffer);
        bitWriter.writeNBit(7, 4);
        for (Point point : this.frame_centre_offsets) {
            bitWriter.writeNBit(point.getX(), 16);
            bitWriter.writeNBit(point.getY(), 16);
        }
        bitWriter.flush();
    }
}
