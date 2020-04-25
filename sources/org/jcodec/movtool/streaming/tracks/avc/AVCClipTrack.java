package org.jcodec.movtool.streaming.tracks.avc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.codecs.h264.H264Decoder;
import org.jcodec.codecs.h264.H264Encoder;
import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.H264Utils.SliceHeaderTweaker;
import org.jcodec.codecs.h264.encode.H264FixedRateControl;
import org.jcodec.codecs.h264.mp4.AvcCBox;
import org.jcodec.codecs.h264.p552io.model.Frame;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.tracks.ClipTrack;
import org.jcodec.movtool.streaming.tracks.VirtualPacketWrapper;

public class AVCClipTrack extends ClipTrack {
    /* access modifiers changed from: private */
    public AvcCBox avcC;
    /* access modifiers changed from: private */
    public PictureParameterSet encPPS;
    /* access modifiers changed from: private */
    public SeqParameterSet encSPS;
    /* access modifiers changed from: private */
    public int frameSize;
    /* access modifiers changed from: private */
    public int mbH;
    /* access modifiers changed from: private */
    public int mbW;
    /* access modifiers changed from: private */

    /* renamed from: rc */
    public H264FixedRateControl f44963rc;

    /* renamed from: se */
    private VideoCodecMeta f44964se;

    public class GopTranscoder {
        private List<VirtualPacket> head;
        private List<ByteBuffer> result;
        private List<VirtualPacket> tail;

        /* renamed from: org.jcodec.movtool.streaming.tracks.avc.AVCClipTrack$GopTranscoder$a */
        class C15590a extends SliceHeaderTweaker {
            C15590a() {
            }

            /* access modifiers changed from: protected */
            public void tweak(SliceHeader sliceHeader) {
                sliceHeader.pic_parameter_set_id = 1;
            }
        }

        public GopTranscoder(List<VirtualPacket> list, List<VirtualPacket> list2) {
            this.head = list;
            this.tail = list2;
        }

        private void processFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            C15590a aVar = new C15590a();
            ByteBuffer duplicate = byteBuffer.duplicate();
            while (duplicate.hasRemaining()) {
                ByteBuffer nextNALUnit = H264Utils.nextNALUnit(duplicate);
                if (nextNALUnit == null) {
                    break;
                }
                NALUnit read = NALUnit.read(nextNALUnit);
                if (read.type == NALUnitType.IDR_SLICE) {
                    ByteBuffer duplicate2 = byteBuffer2.duplicate();
                    byteBuffer2.putInt(0);
                    read.write(byteBuffer2);
                    aVar.run(nextNALUnit, byteBuffer2, read, AVCClipTrack.this.encSPS, AVCClipTrack.this.encPPS);
                    duplicate2.putInt((byteBuffer2.position() - duplicate2.position()) - 4);
                }
            }
            if (byteBuffer2.remaining() >= 5) {
                byteBuffer2.putInt(byteBuffer2.remaining() - 4);
                new NALUnit(NALUnitType.FILLER_DATA, 0).write(byteBuffer2);
            }
            byteBuffer2.clear();
        }

        public synchronized List<ByteBuffer> getResult() throws IOException {
            if (this.result == null) {
                this.result = transcode();
            }
            return this.result;
        }

        public List<ByteBuffer> transcode() throws IOException {
            H264Decoder h264Decoder = new H264Decoder();
            h264Decoder.addSps(AVCClipTrack.this.avcC.getSpsList());
            h264Decoder.addPps(AVCClipTrack.this.avcC.getPpsList());
            Picture create = Picture.create(AVCClipTrack.this.mbW << 4, AVCClipTrack.this.mbH << 4, ColorSpace.YUV420);
            for (VirtualPacket data : this.head) {
                h264Decoder.decodeFrame(H264Utils.splitMOVPacket(data.getData(), AVCClipTrack.this.avcC), create.getData());
            }
            H264Encoder h264Encoder = new H264Encoder(AVCClipTrack.this.f44963rc);
            ByteBuffer allocate = ByteBuffer.allocate(AVCClipTrack.this.frameSize);
            ArrayList arrayList = new ArrayList();
            for (VirtualPacket data2 : this.tail) {
                Frame decodeFrame = h264Decoder.decodeFrame(H264Utils.splitMOVPacket(data2.getData(), AVCClipTrack.this.avcC), create.getData());
                allocate.clear();
                ByteBuffer encodeFrame = h264Encoder.encodeFrame(decodeFrame, allocate);
                ByteBuffer allocate2 = ByteBuffer.allocate(AVCClipTrack.this.frameSize);
                processFrame(encodeFrame, allocate2);
                arrayList.add(allocate2);
            }
            return arrayList;
        }
    }

    public class TranscodePacket extends VirtualPacketWrapper {
        private int off;

        /* renamed from: tr */
        private GopTranscoder f44966tr;

        public TranscodePacket(VirtualPacket virtualPacket, GopTranscoder gopTranscoder, int i) {
            super(virtualPacket);
            this.f44966tr = gopTranscoder;
            this.off = i;
        }

        public ByteBuffer getData() throws IOException {
            return NIOUtils.duplicate((ByteBuffer) this.f44966tr.getResult().get(this.off));
        }

        public int getDataLen() throws IOException {
            return AVCClipTrack.this.frameSize;
        }

        public boolean isKeyframe() {
            return true;
        }
    }

    public AVCClipTrack(VirtualTrack virtualTrack, int i, int i2) {
        super(virtualTrack, i, i2);
        VideoCodecMeta videoCodecMeta = (VideoCodecMeta) virtualTrack.getCodecMeta();
        String str = "avc1";
        if (str.equals(videoCodecMeta.getFourcc())) {
            this.f44963rc = new H264FixedRateControl(1024);
            H264Encoder h264Encoder = new H264Encoder(this.f44963rc);
            this.avcC = H264Utils.parseAVCC(videoCodecMeta.getCodecPrivate());
            SeqParameterSet readSPS = H264Utils.readSPS(NIOUtils.duplicate((ByteBuffer) this.avcC.getSpsList().get(0)));
            this.mbW = readSPS.pic_width_in_mbs_minus1 + 1;
            this.mbH = H264Utils.getPicHeightInMbs(readSPS);
            this.encSPS = h264Encoder.initSPS(H264Utils.getPicSize(readSPS));
            this.encSPS.seq_parameter_set_id = 1;
            this.encPPS = h264Encoder.initPPS();
            PictureParameterSet pictureParameterSet = this.encPPS;
            pictureParameterSet.seq_parameter_set_id = 1;
            pictureParameterSet.pic_parameter_set_id = 1;
            SeqParameterSet seqParameterSet = this.encSPS;
            seqParameterSet.profile_idc = readSPS.profile_idc;
            seqParameterSet.level_idc = readSPS.level_idc;
            seqParameterSet.frame_mbs_only_flag = readSPS.frame_mbs_only_flag;
            seqParameterSet.frame_crop_bottom_offset = readSPS.frame_crop_bottom_offset;
            seqParameterSet.frame_crop_left_offset = readSPS.frame_crop_left_offset;
            seqParameterSet.frame_crop_right_offset = readSPS.frame_crop_right_offset;
            seqParameterSet.frame_crop_top_offset = readSPS.frame_crop_top_offset;
            seqParameterSet.vuiParams = readSPS.vuiParams;
            this.avcC.getSpsList().add(H264Utils.writeSPS(this.encSPS, 128));
            this.avcC.getPpsList().add(H264Utils.writePPS(this.encPPS, 20));
            this.f44964se = new VideoCodecMeta(str, H264Utils.getAvcCData(this.avcC), videoCodecMeta.getSize(), videoCodecMeta.getPasp());
            this.frameSize = this.f44963rc.calcFrameSize(this.mbW * this.mbH);
            int i3 = this.frameSize;
            this.frameSize = i3 + (i3 >> 4);
            return;
        }
        throw new RuntimeException("Not an AVC source track");
    }

    public CodecMeta getCodecMeta() {
        return this.f44964se;
    }

    /* access modifiers changed from: protected */
    public List<VirtualPacket> getGop(VirtualTrack virtualTrack, int i) throws IOException {
        VirtualPacket nextPacket = virtualTrack.nextPacket();
        ArrayList arrayList = new ArrayList();
        while (nextPacket != null && nextPacket.getFrameNo() < i) {
            if (nextPacket.isKeyframe()) {
                arrayList.clear();
            }
            arrayList.add(nextPacket);
            nextPacket = virtualTrack.nextPacket();
        }
        ArrayList arrayList2 = new ArrayList();
        while (nextPacket != null && !nextPacket.isKeyframe()) {
            arrayList2.add(nextPacket);
            nextPacket = virtualTrack.nextPacket();
        }
        ArrayList arrayList3 = new ArrayList();
        GopTranscoder gopTranscoder = new GopTranscoder(arrayList, arrayList2);
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            arrayList3.add(new TranscodePacket((VirtualPacket) arrayList2.get(i2), gopTranscoder, i2));
        }
        arrayList3.add(nextPacket);
        return arrayList3;
    }
}
