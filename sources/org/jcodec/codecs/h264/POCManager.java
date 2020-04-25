package org.jcodec.codecs.h264;

import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.Instruction;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;

public class POCManager {
    private int prevPOCLsb;
    private int prevPOCMsb;

    private int calcPOC0(SliceHeader sliceHeader, NALUnit nALUnit) {
        int i;
        if (nALUnit.type == NALUnitType.IDR_SLICE) {
            this.prevPOCLsb = 0;
            this.prevPOCMsb = 0;
        }
        int i2 = 1 << (sliceHeader.sps.log2_max_pic_order_cnt_lsb_minus4 + 3);
        int i3 = i2 << 1;
        int i4 = sliceHeader.pic_order_cnt_lsb;
        int i5 = this.prevPOCLsb;
        if (i4 >= i5 || i5 - i4 < i2) {
            int i6 = this.prevPOCLsb;
            if (i4 <= i6 || i4 - i6 <= i2) {
                i = this.prevPOCMsb;
            } else {
                i = this.prevPOCMsb - i3;
            }
        } else {
            i = this.prevPOCMsb + i3;
        }
        int i7 = i + i4;
        if (nALUnit.nal_ref_idc > 0) {
            if (hasMMCO5(sliceHeader, nALUnit)) {
                this.prevPOCMsb = 0;
                this.prevPOCLsb = i7;
            } else {
                this.prevPOCMsb = i;
                this.prevPOCLsb = i4;
            }
        }
        return i7;
    }

    private int calcPOC1(SliceHeader sliceHeader, NALUnit nALUnit) {
        return sliceHeader.frame_num << 1;
    }

    private int calcPOC2(SliceHeader sliceHeader, NALUnit nALUnit) {
        return sliceHeader.frame_num << 1;
    }

    private boolean hasMMCO5(SliceHeader sliceHeader, NALUnit nALUnit) {
        if (nALUnit.type != NALUnitType.IDR_SLICE) {
            RefPicMarking refPicMarking = sliceHeader.refPicMarkingNonIDR;
            if (refPicMarking != null) {
                for (Instruction type : refPicMarking.getInstructions()) {
                    if (type.getType() == InstrType.CLEAR) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int calcPOC(SliceHeader sliceHeader, NALUnit nALUnit) {
        int i = sliceHeader.sps.pic_order_cnt_type;
        if (i == 0) {
            return calcPOC0(sliceHeader, nALUnit);
        }
        if (i == 1) {
            return calcPOC1(sliceHeader, nALUnit);
        }
        if (i == 2) {
            return calcPOC2(sliceHeader, nALUnit);
        }
        throw new RuntimeException("POC no!!!");
    }
}
