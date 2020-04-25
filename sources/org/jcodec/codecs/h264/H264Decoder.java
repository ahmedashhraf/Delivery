package org.jcodec.codecs.h264;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.codecs.h264.decode.SliceDecoder;
import org.jcodec.codecs.h264.decode.SliceHeaderReader;
import org.jcodec.codecs.h264.decode.deblock.DeblockingFilter;
import org.jcodec.codecs.h264.p552io.model.Frame;
import org.jcodec.codecs.h264.p552io.model.MBType;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.Instruction;
import org.jcodec.codecs.h264.p552io.model.RefPicMarkingIDR;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.common.IntObjectMap;
import org.jcodec.common.VideoDecoder;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Rect;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.MathUtil;

public class H264Decoder implements VideoDecoder {
    /* access modifiers changed from: private */
    public boolean debug;
    /* access modifiers changed from: private */
    public IntObjectMap<Frame> lRefs;
    /* access modifiers changed from: private */
    public List<Frame> pictureBuffer = new ArrayList();
    /* access modifiers changed from: private */
    public POCManager poc = new POCManager();
    /* access modifiers changed from: private */
    public IntObjectMap<PictureParameterSet> pps = new IntObjectMap<>();
    /* access modifiers changed from: private */
    public Frame[] sRefs;
    /* access modifiers changed from: private */
    public IntObjectMap<SeqParameterSet> sps = new IntObjectMap<>();

    /* renamed from: org.jcodec.codecs.h264.H264Decoder$a */
    static /* synthetic */ class C15489a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44726a = new int[NALUnitType.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f44727b = new int[InstrType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        static {
            /*
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType[] r0 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44727b = r0
                r0 = 1
                int[] r1 = f44727b     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r2 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.REMOVE_SHORT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f44727b     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r3 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.REMOVE_LONG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f44727b     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r4 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.CONVERT_INTO_LONG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f44727b     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r5 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.TRUNK_LONG     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = f44727b     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r5 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.CLEAR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = f44727b     // Catch:{ NoSuchFieldError -> 0x004b }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r5 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.MARK_LONG     // Catch:{ NoSuchFieldError -> 0x004b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                org.jcodec.codecs.h264.io.model.NALUnitType[] r4 = org.jcodec.codecs.h264.p552io.model.NALUnitType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f44726a = r4
                int[] r4 = f44726a     // Catch:{ NoSuchFieldError -> 0x005e }
                org.jcodec.codecs.h264.io.model.NALUnitType r5 = org.jcodec.codecs.h264.p552io.model.NALUnitType.NON_IDR_SLICE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f44726a     // Catch:{ NoSuchFieldError -> 0x0068 }
                org.jcodec.codecs.h264.io.model.NALUnitType r4 = org.jcodec.codecs.h264.p552io.model.NALUnitType.IDR_SLICE     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f44726a     // Catch:{ NoSuchFieldError -> 0x0072 }
                org.jcodec.codecs.h264.io.model.NALUnitType r1 = org.jcodec.codecs.h264.p552io.model.NALUnitType.SPS     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f44726a     // Catch:{ NoSuchFieldError -> 0x007c }
                org.jcodec.codecs.h264.io.model.NALUnitType r1 = org.jcodec.codecs.h264.p552io.model.NALUnitType.PPS     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.H264Decoder.C15489a.<clinit>():void");
        }
    }

    /* renamed from: org.jcodec.codecs.h264.H264Decoder$b */
    class C15490b {

        /* renamed from: a */
        private SliceHeaderReader f44728a;

        /* renamed from: b */
        private PictureParameterSet f44729b;

        /* renamed from: c */
        private SeqParameterSet f44730c;

        /* renamed from: d */
        private DeblockingFilter f44731d;

        /* renamed from: e */
        private SliceHeader f44732e;

        /* renamed from: f */
        private NALUnit f44733f;

        /* renamed from: g */
        private SliceDecoder f44734g;

        /* renamed from: h */
        private int[][][][] f44735h;

        C15490b() {
        }

        /* renamed from: a */
        private int m68608a(int i, int i2, int i3) {
            return i2 > i ? i2 - i3 : i2;
        }

        /* renamed from: b */
        private Frame m68614b(Frame frame) {
            Frame createFrame = H264Decoder.this.pictureBuffer.size() > 0 ? (Frame) H264Decoder.this.pictureBuffer.remove(0) : Frame.createFrame(frame);
            createFrame.copyFrom(frame);
            return createFrame;
        }

        /* renamed from: c */
        private void m68617c(Frame frame) {
            H264Decoder.this.sRefs[this.f44732e.frame_num] = frame;
        }

        /* renamed from: d */
        private void m68618d(Frame frame) {
            NALUnit nALUnit = this.f44733f;
            if (nALUnit.nal_ref_idc == 0) {
                return;
            }
            if (nALUnit.type == NALUnitType.IDR_SLICE) {
                mo47930a(this.f44732e.refPicMarkingIDR, frame);
            } else {
                mo47929a(this.f44732e.refPicMarkingNonIDR, frame);
            }
        }

        /* renamed from: a */
        public Frame mo47927a(List<ByteBuffer> list, int[][] iArr) {
            Frame frame = null;
            for (ByteBuffer byteBuffer : list) {
                NALUnit read = NALUnit.read(byteBuffer);
                H264Utils.unescapeNAL(byteBuffer);
                int i = C15489a.f44726a[read.type.ordinal()];
                if (i == 1 || i == 2) {
                    if (frame == null) {
                        frame = m68609a(iArr, byteBuffer, read);
                    }
                    this.f44734g.decode(byteBuffer, read);
                } else if (i == 3) {
                    SeqParameterSet read2 = SeqParameterSet.read(byteBuffer);
                    H264Decoder.this.sps.put(read2.seq_parameter_set_id, read2);
                } else if (i == 4) {
                    PictureParameterSet read3 = PictureParameterSet.read(byteBuffer);
                    H264Decoder.this.pps.put(read3.pic_parameter_set_id, read3);
                }
            }
            this.f44731d.deblockFrame(frame);
            m68618d(frame);
            return frame;
        }

        /* renamed from: c */
        private void m68616c(int i) {
            SliceHeader sliceHeader = this.f44732e;
            int wrap = MathUtil.wrap(sliceHeader.frame_num - i, 1 << (sliceHeader.sps.log2_max_frame_num_minus4 + 4));
            m68612a(H264Decoder.this.sRefs[wrap]);
            H264Decoder.this.sRefs[wrap] = null;
        }

        /* renamed from: b */
        private void m68615b(int i) {
            m68612a((Frame) H264Decoder.this.lRefs.get(i));
            H264Decoder.this.lRefs.remove(i);
        }

        /* renamed from: a */
        private Frame m68609a(int[][] iArr, ByteBuffer byteBuffer, NALUnit nALUnit) {
            Class<int> cls = int.class;
            NALUnit nALUnit2 = nALUnit;
            this.f44733f = nALUnit2;
            this.f44728a = new SliceHeaderReader();
            BitReader bitReader = new BitReader(byteBuffer.duplicate());
            this.f44732e = this.f44728a.readPart1(bitReader);
            this.f44729b = (PictureParameterSet) H264Decoder.this.pps.get(this.f44732e.pic_parameter_set_id);
            this.f44730c = (SeqParameterSet) H264Decoder.this.sps.get(this.f44729b.seq_parameter_set_id);
            this.f44728a.readPart2(this.f44732e, nALUnit2, this.f44730c, this.f44729b, bitReader);
            SeqParameterSet seqParameterSet = this.f44730c;
            int i = seqParameterSet.pic_width_in_mbs_minus1 + 1;
            int picHeightInMbs = H264Utils.getPicHeightInMbs(seqParameterSet);
            int i2 = picHeightInMbs << 2;
            int i3 = i << 2;
            int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{i2, i3});
            this.f44735h = (int[][][][]) Array.newInstance(cls, new int[]{2, i2, i3, 3});
            int i4 = picHeightInMbs * i;
            MBType[] mBTypeArr = new MBType[i4];
            boolean[] zArr = new boolean[i4];
            int[][] iArr3 = (int[][]) Array.newInstance(cls, new int[]{3, i4});
            SliceHeader[] sliceHeaderArr = new SliceHeader[i4];
            Frame[][][] frameArr = new Frame[i4][][];
            if (H264Decoder.this.sRefs == null) {
                H264Decoder.this.sRefs = new Frame[(1 << (this.f44732e.sps.log2_max_frame_num_minus4 + 4))];
                H264Decoder.this.lRefs = new IntObjectMap();
            }
            Frame createFrame = H264Decoder.createFrame(this.f44730c, iArr, this.f44732e.frame_num, this.f44735h, frameArr, H264Decoder.this.poc.calcPOC(this.f44732e, this.f44733f));
            int[][] iArr4 = iArr3;
            int[][] iArr5 = iArr3;
            SliceDecoder sliceDecoder = r8;
            SliceDecoder sliceDecoder2 = new SliceDecoder(this.f44730c, this.f44729b, iArr2, this.f44735h, mBTypeArr, iArr4, sliceHeaderArr, zArr, frameArr, createFrame, H264Decoder.this.sRefs, H264Decoder.this.lRefs);
            this.f44734g = sliceDecoder;
            this.f44734g.setDebug(H264Decoder.this.debug);
            SliceHeader[] sliceHeaderArr2 = sliceHeaderArr;
            DeblockingFilter deblockingFilter = new DeblockingFilter(i, this.f44730c.bit_depth_chroma_minus8 + 8, iArr2, this.f44735h, mBTypeArr, iArr5, sliceHeaderArr2, zArr, frameArr);
            this.f44731d = deblockingFilter;
            return createFrame;
        }

        /* renamed from: a */
        public void mo47930a(RefPicMarkingIDR refPicMarkingIDR, Frame frame) {
            mo47928a();
            H264Decoder.this.pictureBuffer.clear();
            Frame b = m68614b(frame);
            if (refPicMarkingIDR.isUseForlongTerm()) {
                H264Decoder.this.lRefs.put(0, b);
                b.setShortTerm(false);
                return;
            }
            H264Decoder.this.sRefs[this.f44732e.frame_num] = b;
        }

        /* renamed from: a */
        private void m68612a(Frame frame) {
            if (frame != null) {
                H264Decoder.this.pictureBuffer.add(frame);
            }
        }

        /* renamed from: a */
        public void mo47928a() {
            for (int i = 0; i < H264Decoder.this.sRefs.length; i++) {
                m68612a(H264Decoder.this.sRefs[i]);
                H264Decoder.this.sRefs[i] = null;
            }
            int[] keys = H264Decoder.this.lRefs.keys();
            for (int i2 : keys) {
                m68612a((Frame) H264Decoder.this.lRefs.get(i2));
            }
            H264Decoder.this.lRefs.clear();
        }

        /* renamed from: a */
        public void mo47929a(RefPicMarking refPicMarking, Frame frame) {
            Instruction[] instructions;
            Frame b = m68614b(frame);
            if (refPicMarking != null) {
                Frame frame2 = b;
                for (Instruction instruction : refPicMarking.getInstructions()) {
                    switch (C15489a.f44727b[instruction.getType().ordinal()]) {
                        case 1:
                            m68616c(instruction.getArg1());
                            break;
                        case 2:
                            m68615b(instruction.getArg1());
                            break;
                        case 3:
                            m68611a(instruction.getArg1(), instruction.getArg2());
                            break;
                        case 4:
                            m68610a(instruction.getArg1() - 1);
                            break;
                        case 5:
                            mo47928a();
                            break;
                        case 6:
                            m68613a(frame2, instruction.getArg1());
                            frame2 = null;
                            break;
                    }
                }
                b = frame2;
            }
            if (b != null) {
                m68617c(b);
            }
            SeqParameterSet seqParameterSet = this.f44730c;
            int i = 1 << (seqParameterSet.log2_max_frame_num_minus4 + 4);
            if (refPicMarking == null) {
                int max = Math.max(1, seqParameterSet.num_ref_frames - H264Decoder.this.lRefs.size());
                int i2 = 0;
                int i3 = 0;
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < H264Decoder.this.sRefs.length; i5++) {
                    if (H264Decoder.this.sRefs[i5] != null) {
                        int a = m68608a(this.f44732e.frame_num, H264Decoder.this.sRefs[i5].getFrameNo(), i);
                        if (a < i4) {
                            i3 = H264Decoder.this.sRefs[i5].getFrameNo();
                            i4 = a;
                        }
                        i2++;
                    }
                }
                if (i2 > max) {
                    m68612a(H264Decoder.this.sRefs[i3]);
                    H264Decoder.this.sRefs[i3] = null;
                }
            }
        }

        /* renamed from: a */
        private void m68613a(Frame frame, int i) {
            Frame frame2 = (Frame) H264Decoder.this.lRefs.get(i);
            if (frame2 != null) {
                m68612a(frame2);
            }
            frame.setShortTerm(false);
            H264Decoder.this.lRefs.put(i, frame);
        }

        /* renamed from: a */
        private void m68610a(int i) {
            int[] keys = H264Decoder.this.lRefs.keys();
            for (int i2 = 0; i2 < keys.length; i2++) {
                if (keys[i2] > i) {
                    m68612a((Frame) H264Decoder.this.lRefs.get(keys[i2]));
                    H264Decoder.this.lRefs.remove(keys[i2]);
                }
            }
        }

        /* renamed from: a */
        private void m68611a(int i, int i2) {
            SliceHeader sliceHeader = this.f44732e;
            int wrap = MathUtil.wrap(sliceHeader.frame_num - i, 1 << (sliceHeader.sps.log2_max_frame_num_minus4 + 4));
            m68612a((Frame) H264Decoder.this.lRefs.get(i2));
            H264Decoder.this.lRefs.put(i2, H264Decoder.this.sRefs[wrap]);
            H264Decoder.this.sRefs[wrap] = null;
            ((Frame) H264Decoder.this.lRefs.get(i2)).setShortTerm(false);
        }
    }

    public static Frame createFrame(SeqParameterSet seqParameterSet, int[][] iArr, int i, int[][][][] iArr2, Frame[][][] frameArr, int i2) {
        Rect rect;
        SeqParameterSet seqParameterSet2 = seqParameterSet;
        int i3 = (seqParameterSet2.pic_width_in_mbs_minus1 + 1) << 4;
        int picHeightInMbs = H264Utils.getPicHeightInMbs(seqParameterSet) << 4;
        if (seqParameterSet2.frame_cropping_flag) {
            int i4 = seqParameterSet2.frame_crop_left_offset << 1;
            int i5 = seqParameterSet2.frame_crop_top_offset << 1;
            rect = new Rect(i4, i5, (i3 - (seqParameterSet2.frame_crop_right_offset << 1)) - i4, (picHeightInMbs - (seqParameterSet2.frame_crop_bottom_offset << 1)) - i5);
        } else {
            rect = null;
        }
        Frame frame = new Frame(i3, picHeightInMbs, iArr, ColorSpace.YUV420, rect, i, iArr2, frameArr, i2);
        return frame;
    }

    private boolean validPps(PictureParameterSet pictureParameterSet) {
        return pictureParameterSet.pic_init_qp_minus26 <= 26 && pictureParameterSet.seq_parameter_set_id <= 2 && pictureParameterSet.pic_parameter_set_id <= 2;
    }

    private boolean validSh(SliceHeader sliceHeader) {
        return sliceHeader.first_mb_in_slice == 0 && sliceHeader.slice_type != null && sliceHeader.pic_parameter_set_id < 2;
    }

    private boolean validSps(SeqParameterSet seqParameterSet) {
        return seqParameterSet.bit_depth_chroma_minus8 < 4 && seqParameterSet.bit_depth_luma_minus8 < 4 && seqParameterSet.chroma_format_idc != null && seqParameterSet.seq_parameter_set_id < 2 && seqParameterSet.pic_order_cnt_type <= 2;
    }

    public void addPps(List<ByteBuffer> list) {
        for (ByteBuffer duplicate : list) {
            ByteBuffer duplicate2 = duplicate.duplicate();
            H264Utils.unescapeNAL(duplicate2);
            PictureParameterSet read = PictureParameterSet.read(duplicate2);
            this.pps.put(read.pic_parameter_set_id, read);
        }
    }

    public void addSps(List<ByteBuffer> list) {
        for (ByteBuffer duplicate : list) {
            ByteBuffer duplicate2 = duplicate.duplicate();
            H264Utils.unescapeNAL(duplicate2);
            SeqParameterSet read = SeqParameterSet.read(duplicate2);
            this.sps.put(read.seq_parameter_set_id, read);
        }
    }

    public int probe(ByteBuffer byteBuffer) {
        boolean z;
        Iterator it = H264Utils.splitFrame(byteBuffer.duplicate()).iterator();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
            NALUnitType nALUnitType = NALUnit.read(byteBuffer2).type;
            if (nALUnitType == NALUnitType.IDR_SLICE || nALUnitType == NALUnitType.NON_IDR_SLICE) {
                z = validSh(new SliceHeaderReader().readPart1(new BitReader(byteBuffer2)));
            } else if (nALUnitType == NALUnitType.SPS) {
                z2 = validSps(SeqParameterSet.read(byteBuffer2));
            } else if (nALUnitType == NALUnitType.PPS) {
                z3 = validPps(PictureParameterSet.read(byteBuffer2));
            }
        }
        int i2 = (z ? 60 : 0) + (z2 ? 20 : 0);
        if (z3) {
            i = 20;
        }
        return i2 + i;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public Frame decodeFrame(ByteBuffer byteBuffer, int[][] iArr) {
        return new C15490b().mo47927a(H264Utils.splitFrame(byteBuffer), iArr);
    }

    public Frame decodeFrame(List<ByteBuffer> list, int[][] iArr) {
        return new C15490b().mo47927a(list, iArr);
    }
}
