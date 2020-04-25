package org.jcodec.movtool.streaming.tracks.avc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.H264Utils.SliceHeaderTweaker;
import org.jcodec.codecs.h264.mp4.AvcCBox;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Rational;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class AVCConcatTrack implements VirtualTrack {
    private List<PictureParameterSet> allPps;
    private List<SeqParameterSet> allSps;
    private AvcCBox[] avcCs;
    private int idx = 0;
    private VirtualPacket lastPacket;
    /* access modifiers changed from: private */
    public Map<Integer, Integer> map;
    private int offsetFn = 0;
    private double offsetPts = 0.0d;

    /* renamed from: se */
    private CodecMeta f44967se;
    private VirtualTrack[] tracks;
    private SliceHeaderTweaker[] tweakers;

    public class AVCConcatPacket implements VirtualPacket {
        private int fnOffset;
        private int idx;
        private VirtualPacket packet;
        private double ptsOffset;

        public AVCConcatPacket(VirtualPacket virtualPacket, double d, int i, int i2) {
            this.packet = virtualPacket;
            this.ptsOffset = d;
            this.fnOffset = i;
            this.idx = i2;
        }

        public ByteBuffer getData() throws IOException {
            return AVCConcatTrack.this.patchPacket(this.idx, this.packet.getData());
        }

        public int getDataLen() throws IOException {
            return this.packet.getDataLen() + 8;
        }

        public double getDuration() {
            return this.packet.getDuration();
        }

        public int getFrameNo() {
            return this.fnOffset + this.packet.getFrameNo();
        }

        public double getPts() {
            return this.ptsOffset + this.packet.getPts();
        }

        public boolean isKeyframe() {
            return this.packet.isKeyframe();
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.avc.AVCConcatTrack$a */
    class C15591a extends SliceHeaderTweaker {

        /* renamed from: a */
        final /* synthetic */ int f44968a;

        C15591a(List list, List list2, int i) {
            this.f44968a = i;
            super(list, list2);
        }

        /* access modifiers changed from: protected */
        public void tweak(SliceHeader sliceHeader) {
            sliceHeader.pic_parameter_set_id = ((Integer) AVCConcatTrack.this.map.get(Integer.valueOf((this.f44968a << 8) | sliceHeader.pic_parameter_set_id))).intValue();
        }
    }

    public AVCConcatTrack(VirtualTrack... virtualTrackArr) {
        this.tracks = virtualTrackArr;
        this.avcCs = new AvcCBox[virtualTrackArr.length];
        this.allPps = new ArrayList();
        this.allSps = new ArrayList();
        this.tweakers = new SliceHeaderTweaker[virtualTrackArr.length];
        Rational rational = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = "avc1";
            if (i < virtualTrackArr.length) {
                CodecMeta codecMeta = virtualTrackArr[i].getCodecMeta();
                if (!(codecMeta instanceof VideoCodecMeta)) {
                    throw new RuntimeException("Not a video track.");
                } else if (str.equals(codecMeta.getFourcc())) {
                    VideoCodecMeta videoCodecMeta = (VideoCodecMeta) codecMeta;
                    Rational pasp = videoCodecMeta.getPasp();
                    if (rational == null || pasp == null || rational.equals(pasp)) {
                        AvcCBox parseAVCC = H264Utils.parseAVCC(videoCodecMeta.getCodecPrivate());
                        if (i2 == 0) {
                            i2 = parseAVCC.getNalLengthSize();
                        } else if (i2 != parseAVCC.getNalLengthSize()) {
                            throw new RuntimeException("Unable to concat AVC tracks with different NAL length size in AvcC box");
                        }
                        for (ByteBuffer duplicate : parseAVCC.getPpsList()) {
                            PictureParameterSet readPPS = H264Utils.readPPS(NIOUtils.duplicate(duplicate));
                            int i3 = i << 8;
                            readPPS.pic_parameter_set_id |= i3;
                            readPPS.seq_parameter_set_id |= i3;
                            this.allPps.add(readPPS);
                        }
                        for (ByteBuffer duplicate2 : parseAVCC.getSpsList()) {
                            SeqParameterSet readSPS = H264Utils.readSPS(NIOUtils.duplicate(duplicate2));
                            readSPS.seq_parameter_set_id |= i << 8;
                            this.allSps.add(readSPS);
                        }
                        this.tweakers[i] = new C15591a(parseAVCC.getSpsList(), parseAVCC.getPpsList(), i);
                        this.avcCs[i] = parseAVCC;
                        i++;
                        rational = pasp;
                    } else {
                        throw new RuntimeException("Can not concat video tracks with different Pixel Aspect Ratio.");
                    }
                } else {
                    throw new RuntimeException("Not an AVC track.");
                }
            } else {
                this.map = mergePS(this.allSps, this.allPps);
                VideoCodecMeta videoCodecMeta2 = (VideoCodecMeta) virtualTrackArr[0].getCodecMeta();
                this.f44967se = new VideoCodecMeta(str, H264Utils.getAvcCData(H264Utils.createAvcC(this.allSps, this.allPps, i2)), videoCodecMeta2.getSize(), videoCodecMeta2.getPasp());
                return;
            }
        }
    }

    private Map<Integer, Integer> mergePS(List<SeqParameterSet> list, List<PictureParameterSet> list2) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SeqParameterSet seqParameterSet = (SeqParameterSet) it.next();
            int i2 = seqParameterSet.seq_parameter_set_id;
            seqParameterSet.seq_parameter_set_id = 0;
            ByteBuffer writeSPS = H264Utils.writeSPS(seqParameterSet, 32);
            int find = NIOUtils.find(arrayList, writeSPS);
            if (find == -1) {
                find = arrayList.size();
                arrayList.add(writeSPS);
            }
            for (PictureParameterSet pictureParameterSet : list2) {
                if (pictureParameterSet.seq_parameter_set_id == i2) {
                    pictureParameterSet.seq_parameter_set_id = find;
                }
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (PictureParameterSet pictureParameterSet2 : list2) {
            int i3 = pictureParameterSet2.pic_parameter_set_id;
            pictureParameterSet2.pic_parameter_set_id = 0;
            ByteBuffer writePPS = H264Utils.writePPS(pictureParameterSet2, 128);
            int find2 = NIOUtils.find(arrayList2, writePPS);
            if (find2 == -1) {
                find2 = arrayList2.size();
                arrayList2.add(writePPS);
            }
            hashMap.put(Integer.valueOf(i3), Integer.valueOf(find2));
        }
        list.clear();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            SeqParameterSet readSPS = H264Utils.readSPS((ByteBuffer) arrayList.get(i4));
            readSPS.seq_parameter_set_id = i4;
            list.add(readSPS);
        }
        list2.clear();
        for (i = 0; i < arrayList2.size(); i++) {
            PictureParameterSet readPPS = H264Utils.readPPS((ByteBuffer) arrayList2.get(i));
            readPPS.pic_parameter_set_id = i;
            list2.add(readPPS);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public ByteBuffer patchPacket(int i, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        for (ByteBuffer byteBuffer2 : H264Utils.splitMOVPacket(byteBuffer, this.avcCs[i])) {
            NALUnit read = NALUnit.read(byteBuffer2);
            NALUnitType nALUnitType = read.type;
            if (nALUnitType == NALUnitType.IDR_SLICE || nALUnitType == NALUnitType.NON_IDR_SLICE) {
                ByteBuffer duplicate = allocate.duplicate();
                allocate.putInt(0);
                read.write(allocate);
                this.tweakers[i].run(byteBuffer2, allocate, read);
                duplicate.putInt((allocate.position() - duplicate.position()) - 4);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping NAL unit: ");
                sb.append(read.type);
                Logger.warn(sb.toString());
            }
        }
        if (allocate.remaining() >= 5) {
            int nalLengthSize = this.avcCs[i].getNalLengthSize();
            int remaining = allocate.remaining() - nalLengthSize;
            if (nalLengthSize == 4) {
                allocate.putInt(remaining);
            } else if (nalLengthSize == 2) {
                allocate.putShort((short) remaining);
            } else if (nalLengthSize == 3) {
                allocate.put((byte) (remaining >> 16));
                allocate.putShort((short) (65535 & remaining));
            }
            new NALUnit(NALUnitType.FILLER_DATA, 0).write(allocate);
        }
        allocate.clear();
        return allocate;
    }

    public void close() throws IOException {
        int i = 0;
        while (true) {
            VirtualTrack[] virtualTrackArr = this.tracks;
            if (i < virtualTrackArr.length) {
                virtualTrackArr[i].close();
                i++;
            } else {
                return;
            }
        }
    }

    public CodecMeta getCodecMeta() {
        return this.f44967se;
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return this.tracks[0].getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        while (true) {
            int i = this.idx;
            VirtualTrack[] virtualTrackArr = this.tracks;
            if (i >= virtualTrackArr.length) {
                return null;
            }
            VirtualPacket nextPacket = virtualTrackArr[i].nextPacket();
            if (nextPacket == null) {
                this.idx++;
                this.offsetPts += this.lastPacket.getPts() + this.lastPacket.getDuration();
                this.offsetFn += this.lastPacket.getFrameNo() + 1;
            } else {
                this.lastPacket = nextPacket;
                AVCConcatPacket aVCConcatPacket = new AVCConcatPacket(nextPacket, this.offsetPts, this.offsetFn, this.idx);
                return aVCConcatPacket;
            }
        }
    }
}
