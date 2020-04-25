package org.jcodec.codecs.h264.p552io.model;

import androidx.core.p034l.C0986h;
import org.jcodec.codecs.h264.decode.CAVLCReader;
import org.jcodec.codecs.h264.p552io.write.CAVLCWriter;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

/* renamed from: org.jcodec.codecs.h264.io.model.ScalingList */
public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public static ScalingList read(BitReader bitReader, int i) {
        ScalingList scalingList2 = new ScalingList();
        scalingList2.scalingList = new int[i];
        int i2 = 0;
        int i3 = 8;
        int i4 = 8;
        while (i2 < i) {
            if (i3 != 0) {
                i3 = ((CAVLCReader.readSE(bitReader, "deltaScale") + i4) + 256) % 256;
                scalingList2.useDefaultScalingMatrixFlag = i2 == 0 && i3 == 0;
            }
            int[] iArr = scalingList2.scalingList;
            if (i3 != 0) {
                i4 = i3;
            }
            iArr[i2] = i4;
            i4 = scalingList2.scalingList[i2];
            i2++;
        }
        return scalingList2;
    }

    public void write(BitWriter bitWriter) {
        String str = "SPS: ";
        int i = 0;
        if (this.useDefaultScalingMatrixFlag) {
            CAVLCWriter.writeSE(bitWriter, 0, str);
            return;
        }
        int i2 = 8;
        while (true) {
            int[] iArr = this.scalingList;
            if (i < iArr.length) {
                CAVLCWriter.writeSE(bitWriter, (iArr[i] - i2) + C0986h.f4419u, str);
                i2 = this.scalingList[i];
                i++;
            } else {
                return;
            }
        }
    }
}
