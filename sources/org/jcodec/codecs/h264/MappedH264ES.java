package org.jcodec.codecs.h264;

import java.nio.ByteBuffer;
import org.jcodec.codecs.h264.decode.SliceHeaderReader;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.Instruction;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.common.DemuxerTrack;
import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.IntObjectMap;
import org.jcodec.common.model.Packet;
import org.jcodec.common.p554io.BitReader;

public class MappedH264ES implements DemuxerTrack {

    /* renamed from: bb */
    private ByteBuffer f44738bb;
    private int frameNo;
    private IntObjectMap<PictureParameterSet> pps = new IntObjectMap<>();
    private int prevFrameNum;
    private int prevFrameNumOffset;
    private int prevPicOrderCntLsb;
    private int prevPicOrderCntMsb;
    private SliceHeaderReader shr;
    private IntObjectMap<SeqParameterSet> sps = new IntObjectMap<>();

    public MappedH264ES(ByteBuffer byteBuffer) {
        this.f44738bb = byteBuffer;
        this.shr = new SliceHeaderReader();
        this.frameNo = 0;
    }

    private int calcPOC0(NALUnit nALUnit, SliceHeader sliceHeader) {
        int i;
        int i2 = sliceHeader.pic_order_cnt_lsb;
        int i3 = 1 << (sliceHeader.sps.log2_max_pic_order_cnt_lsb_minus4 + 4);
        int i4 = this.prevPicOrderCntLsb;
        if (i2 >= i4 || i4 - i2 < i3 / 2) {
            int i5 = this.prevPicOrderCntLsb;
            if (i2 <= i5 || i2 - i5 <= i3 / 2) {
                i = this.prevPicOrderCntMsb;
            } else {
                i = this.prevPicOrderCntMsb - i3;
            }
        } else {
            i = this.prevPicOrderCntMsb + i3;
        }
        if (nALUnit.nal_ref_idc != 0) {
            this.prevPicOrderCntMsb = i;
            this.prevPicOrderCntLsb = i2;
        }
        return i + i2;
    }

    private int calcPOC1(int i, NALUnit nALUnit, SliceHeader sliceHeader) {
        int i2;
        int i3;
        if (sliceHeader.sps.num_ref_frames_in_pic_order_cnt_cycle == 0) {
            i = 0;
        }
        if (nALUnit.nal_ref_idc == 0 && i > 0) {
            i--;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            SeqParameterSet seqParameterSet = sliceHeader.sps;
            i2 = seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle;
            if (i4 >= i2) {
                break;
            }
            i5 += seqParameterSet.offsetForRefFrame[i4];
            i4++;
        }
        if (i > 0) {
            int i6 = i - 1;
            int i7 = i6 / i2;
            i3 = i7 * i5;
            for (int i8 = 0; i8 <= i6 % i2; i8++) {
                i3 += sliceHeader.sps.offsetForRefFrame[i8];
            }
        } else {
            i3 = 0;
        }
        if (nALUnit.nal_ref_idc == 0) {
            i3 += sliceHeader.sps.offset_for_non_ref_pic;
        }
        return i3 + sliceHeader.delta_pic_order_cnt[0];
    }

    private int calcPOC2(int i, NALUnit nALUnit, SliceHeader sliceHeader) {
        return nALUnit.nal_ref_idc == 0 ? (i * 2) - 1 : i * 2;
    }

    private int calcPoc(int i, NALUnit nALUnit, SliceHeader sliceHeader) {
        int i2 = sliceHeader.sps.pic_order_cnt_type;
        if (i2 == 0) {
            return calcPOC0(nALUnit, sliceHeader);
        }
        if (i2 == 1) {
            return calcPOC1(i, nALUnit, sliceHeader);
        }
        return calcPOC2(i, nALUnit, sliceHeader);
    }

    private boolean detectGap(SliceHeader sliceHeader, int i) {
        int i2 = sliceHeader.frame_num;
        int i3 = this.prevFrameNum;
        return (i2 == i3 || i2 == (i3 + 1) % i) ? false : true;
    }

    private boolean detectMMCO5(RefPicMarking refPicMarking) {
        if (refPicMarking == null) {
            return false;
        }
        for (Instruction type : refPicMarking.getInstructions()) {
            if (type.getType() == InstrType.CLEAR) {
                return true;
            }
        }
        return false;
    }

    private Packet detectPoc(ByteBuffer byteBuffer, NALUnit nALUnit, SliceHeader sliceHeader) {
        NALUnit nALUnit2 = nALUnit;
        SliceHeader sliceHeader2 = sliceHeader;
        int i = 1 << (sliceHeader2.sps.log2_max_frame_num_minus4 + 4);
        if (detectGap(sliceHeader2, i)) {
            issueNonExistingPic(sliceHeader2, i);
        }
        int updateFrameNumber = updateFrameNumber(sliceHeader2.frame_num, i, detectMMCO5(sliceHeader2.refPicMarkingNonIDR));
        int calcPoc = nALUnit2.type == NALUnitType.NON_IDR_SLICE ? calcPoc(updateFrameNumber, nALUnit2, sliceHeader2) : 0;
        long j = (long) updateFrameNumber;
        int i2 = this.frameNo;
        this.frameNo = i2 + 1;
        Packet packet = new Packet(byteBuffer, j, 1, 1, (long) i2, nALUnit2.type == NALUnitType.IDR_SLICE, null, calcPoc);
        return packet;
    }

    private void issueNonExistingPic(SliceHeader sliceHeader, int i) {
        this.prevFrameNum = (this.prevFrameNum + 1) % i;
    }

    private SliceHeader readSliceHeader(ByteBuffer byteBuffer, NALUnit nALUnit) {
        BitReader bitReader = new BitReader(byteBuffer);
        SliceHeader readPart1 = this.shr.readPart1(bitReader);
        PictureParameterSet pictureParameterSet = (PictureParameterSet) this.pps.get(readPart1.pic_parameter_set_id);
        this.shr.readPart2(readPart1, nALUnit, (SeqParameterSet) this.sps.get(pictureParameterSet.seq_parameter_set_id), pictureParameterSet, bitReader);
        return readPart1;
    }

    private boolean sameFrame(NALUnit nALUnit, NALUnit nALUnit2, SliceHeader sliceHeader, SliceHeader sliceHeader2) {
        if (sliceHeader.pic_parameter_set_id != sliceHeader2.pic_parameter_set_id || sliceHeader.frame_num != sliceHeader2.frame_num) {
            return false;
        }
        SeqParameterSet seqParameterSet = sliceHeader.sps;
        if (seqParameterSet.pic_order_cnt_type == 0 && sliceHeader.pic_order_cnt_lsb != sliceHeader2.pic_order_cnt_lsb) {
            return false;
        }
        if (seqParameterSet.pic_order_cnt_type == 1) {
            int[] iArr = sliceHeader.delta_pic_order_cnt;
            int i = iArr[0];
            int[] iArr2 = sliceHeader2.delta_pic_order_cnt;
            if (!(i == iArr2[0] && iArr[1] == iArr2[1])) {
                return false;
            }
        }
        if ((nALUnit.nal_ref_idc == 0 || nALUnit2.nal_ref_idc == 0) && nALUnit.nal_ref_idc != nALUnit2.nal_ref_idc) {
            return false;
        }
        if ((nALUnit.type == NALUnitType.IDR_SLICE) == (nALUnit2.type == NALUnitType.IDR_SLICE) && sliceHeader.idr_pic_id == sliceHeader2.idr_pic_id) {
            return true;
        }
        return false;
    }

    private int updateFrameNumber(int i, int i2, boolean z) {
        int i3;
        if (this.prevFrameNum > i) {
            i3 = this.prevFrameNumOffset + i2;
        } else {
            i3 = this.prevFrameNumOffset;
        }
        int i4 = i3 + i;
        if (z) {
            i = 0;
        }
        this.prevFrameNum = i;
        this.prevFrameNumOffset = i3;
        return i4;
    }

    public DemuxerTrackMeta getMeta() {
        throw new UnsupportedOperationException();
    }

    public PictureParameterSet[] getPps() {
        return (PictureParameterSet[]) this.pps.values(new PictureParameterSet[0]);
    }

    public SeqParameterSet[] getSps() {
        return (SeqParameterSet[]) this.sps.values(new SeqParameterSet[0]);
    }

    public Packet nextFrame() {
        ByteBuffer duplicate = this.f44738bb.duplicate();
        NALUnit nALUnit = null;
        SliceHeader sliceHeader = null;
        while (true) {
            this.f44738bb.mark();
            ByteBuffer nextNALUnit = H264Utils.nextNALUnit(this.f44738bb);
            if (nextNALUnit == null) {
                break;
            }
            NALUnit read = NALUnit.read(nextNALUnit);
            NALUnitType nALUnitType = read.type;
            if (nALUnitType == NALUnitType.IDR_SLICE || nALUnitType == NALUnitType.NON_IDR_SLICE) {
                SliceHeader readSliceHeader = readSliceHeader(nextNALUnit, read);
                if (nALUnit != null && sliceHeader != null && !sameFrame(nALUnit, read, sliceHeader, readSliceHeader)) {
                    this.f44738bb.reset();
                    break;
                }
                sliceHeader = readSliceHeader;
                nALUnit = read;
            } else if (nALUnitType == NALUnitType.PPS) {
                PictureParameterSet read2 = PictureParameterSet.read(nextNALUnit);
                this.pps.put(read2.pic_parameter_set_id, read2);
            } else if (nALUnitType == NALUnitType.SPS) {
                SeqParameterSet read3 = SeqParameterSet.read(nextNALUnit);
                this.sps.put(read3.seq_parameter_set_id, read3);
            }
        }
        duplicate.limit(this.f44738bb.position());
        if (sliceHeader == null) {
            return null;
        }
        return detectPoc(duplicate, nALUnit, sliceHeader);
    }
}
