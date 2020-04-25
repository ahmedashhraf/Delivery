package org.jcodec.containers.mkv;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.containers.mkv.CuesFactory.CuePointMock;
import org.jcodec.containers.mkv.boxes.EbmlBase;
import org.jcodec.containers.mkv.boxes.EbmlMaster;
import org.jcodec.containers.mkv.boxes.MkvBlock;
import org.jcodec.containers.mkv.boxes.MkvSegment;
import org.jcodec.containers.mkv.muxer.MKVMuxer;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.MovieSegment;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;

public class MKVStreamingMuxer {
    private static final int DEFAULT_TIMESCALE = 1000000000;
    private static final int MULTIPLIER = 1000;
    private static final int TIMESCALE = 1000000;
    private static final String VP80_FOURCC = "avc1";
    public MovieSegment headerChunk;
    private EbmlMaster mkvCues;
    private EbmlMaster mkvInfo;
    private EbmlMaster mkvSeekHead;
    private EbmlMaster mkvTracks;
    private EbmlMaster segmentElem;
    private LinkedList<WebmCluster> webmClusters;

    public static class HeaderSegment implements MovieSegment {
        private List<EbmlMaster> header;

        public HeaderSegment(List<EbmlMaster> list) {
            this.header = list;
        }

        public ByteBuffer getData() throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(getDataLen());
            for (EbmlMaster ebmlMaster : this.header) {
                if (MKVType.Segment.equals(ebmlMaster.type)) {
                    allocate.put(((MkvSegment) ebmlMaster).getHeader());
                } else {
                    allocate.put(ebmlMaster.getData());
                }
            }
            allocate.flip();
            return allocate;
        }

        public int getDataLen() throws IOException {
            long j;
            long j2;
            int i = 0;
            for (EbmlMaster ebmlMaster : this.header) {
                if (MKVType.Segment.equals(ebmlMaster.type)) {
                    j = (long) i;
                    j2 = ((MkvSegment) ebmlMaster).getHeaderSize();
                } else {
                    j = (long) i;
                    j2 = ebmlMaster.size();
                }
                i = (int) (j + j2);
            }
            return i;
        }

        public int getNo() {
            return 0;
        }

        public long getPos() {
            return 0;
        }
    }

    public class WebmCluster implements MovieSegment {

        /* renamed from: be */
        MkvBlock f44833be = ((MkvBlock) MKVType.createByType(MKVType.SimpleBlock));

        /* renamed from: c */
        EbmlMaster f44834c = ((EbmlMaster) MKVType.createByType(MKVType.Cluster));
        private int chunkNo;
        public VirtualPacket pkt;
        private long previousClustersSize;
        private int trackNo;

        public WebmCluster(VirtualTrack virtualTrack, VirtualPacket virtualPacket, int i, int i2, long j) {
            this.pkt = virtualPacket;
            this.chunkNo = i;
            this.trackNo = i2 + 1;
            this.previousClustersSize = j;
            MKVMuxer.createChild(this.f44834c, MKVType.Timecode, (long) (virtualPacket.getPts() * 1000.0d));
            try {
                int[] iArr = {this.pkt.getDataLen()};
                this.f44833be.frameSizes = iArr;
                MkvBlock mkvBlock = this.f44833be;
                mkvBlock.timecode = 0;
                mkvBlock.trackNumber = (long) this.trackNo;
                mkvBlock.discardable = false;
                mkvBlock.lacingPresent = false;
                mkvBlock.dataLen = mkvBlock.getDataSize();
                this.f44834c.add(this.f44833be);
            } catch (IOException e) {
                throw new RuntimeException("Failed to read size of the frame", e);
            }
        }

        public ByteBuffer getData() throws IOException {
            MkvBlock mkvBlock = this.f44833be;
            mkvBlock.frames = new ByteBuffer[1];
            mkvBlock.frames[0] = this.pkt.getData().duplicate();
            ByteBuffer data = this.f44834c.getData();
            Assert.assertEquals("computed and actuall cluster sizes MUST match", (int) this.f44834c.size(), data.remaining());
            return data;
        }

        public int getDataLen() throws IOException {
            return (int) this.f44834c.size();
        }

        public int getNo() {
            return this.chunkNo;
        }

        public long getPos() {
            try {
                return this.previousClustersSize + ((long) MKVStreamingMuxer.this.headerChunk.getDataLen());
            } catch (IOException e) {
                throw new RuntimeException("Couldn't compute header length", e);
            }
        }
    }

    private static int findFirstVP8TrackIndex(VirtualTrack[] virtualTrackArr) {
        for (int i = 0; i < virtualTrackArr.length; i++) {
            if (VP80_FOURCC.equalsIgnoreCase(virtualTrackArr[i].getCodecMeta().getFourcc())) {
                return i;
            }
        }
        return -1;
    }

    private void muxCues(VirtualTrack[] virtualTrackArr) {
        CuesFactory cuesFactory = new CuesFactory(this.mkvSeekHead.size() + this.mkvInfo.size() + this.mkvTracks.size(), (long) (findFirstVP8TrackIndex(virtualTrackArr) + 1));
        Iterator it = this.webmClusters.iterator();
        while (it.hasNext()) {
            cuesFactory.add(CuePointMock.make(((WebmCluster) it.next()).f44834c));
        }
        Iterator it2 = cuesFactory.createCues().children.iterator();
        while (it2.hasNext()) {
            this.mkvCues.add((EbmlBase) it2.next());
        }
    }

    private EbmlMaster muxEbmlHeader() {
        EbmlMaster ebmlMaster = (EbmlMaster) MKVType.createByType(MKVType.EBML);
        MKVMuxer.createChild(ebmlMaster, MKVType.EBMLVersion, 1);
        MKVMuxer.createChild(ebmlMaster, MKVType.EBMLReadVersion, 1);
        MKVMuxer.createChild(ebmlMaster, MKVType.EBMLMaxIDLength, 4);
        MKVMuxer.createChild(ebmlMaster, MKVType.EBMLMaxSizeLength, 8);
        MKVMuxer.createChild(ebmlMaster, MKVType.DocType, "webm");
        MKVMuxer.createChild(ebmlMaster, MKVType.DocTypeVersion, 2);
        MKVMuxer.createChild(ebmlMaster, MKVType.DocTypeReadVersion, 2);
        return ebmlMaster;
    }

    private EbmlMaster muxInfo(VirtualTrack[] virtualTrackArr) {
        EbmlMaster ebmlMaster = (EbmlMaster) MKVType.createByType(MKVType.Info);
        MKVMuxer.createChild(ebmlMaster, MKVType.TimecodeScale, 1000000);
        MKVMuxer.createChild(ebmlMaster, MKVType.WritingApp, "JCodec v0.1.7");
        MKVMuxer.createChild(ebmlMaster, MKVType.MuxingApp, "JCodec MKVStreamingMuxer v0.1.7");
        LinkedList<WebmCluster> linkedList = this.webmClusters;
        WebmCluster webmCluster = (WebmCluster) linkedList.get(linkedList.size() - 1);
        MKVMuxer.createChild(ebmlMaster, MKVType.Duration, (webmCluster.pkt.getPts() + webmCluster.pkt.getDuration()) * 1000.0d);
        MKVMuxer.createChild(ebmlMaster, MKVType.DateUTC, new Date());
        return ebmlMaster;
    }

    private EbmlMaster muxSeekHead() {
        SeekHeadFactory seekHeadFactory = new SeekHeadFactory();
        seekHeadFactory.add(this.mkvInfo);
        seekHeadFactory.add(this.mkvTracks);
        seekHeadFactory.add(this.mkvCues);
        return seekHeadFactory.indexSeekHead();
    }

    private EbmlMaster muxTracks(VirtualTrack[] virtualTrackArr) {
        EbmlMaster ebmlMaster = (EbmlMaster) MKVType.createByType(MKVType.Tracks);
        int i = 0;
        while (i < virtualTrackArr.length) {
            VirtualTrack virtualTrack = virtualTrackArr[i];
            EbmlMaster ebmlMaster2 = (EbmlMaster) MKVType.createByType(MKVType.TrackEntry);
            i++;
            long j = (long) i;
            MKVMuxer.createChild(ebmlMaster2, MKVType.TrackNumber, j);
            MKVMuxer.createChild(ebmlMaster2, MKVType.TrackUID, j);
            CodecMeta codecMeta = virtualTrack.getCodecMeta();
            String str = "Track ";
            if (VP80_FOURCC.equalsIgnoreCase(virtualTrack.getCodecMeta().getFourcc())) {
                MKVMuxer.createChild(ebmlMaster2, MKVType.TrackType, 1);
                MKVType mKVType = MKVType.Name;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(" Video");
                MKVMuxer.createChild(ebmlMaster2, mKVType, sb.toString());
                MKVMuxer.createChild(ebmlMaster2, MKVType.CodecID, "V_VP8");
                MKVMuxer.createChild(ebmlMaster2, MKVType.CodecPrivate, codecMeta.getCodecPrivate());
                if (codecMeta instanceof VideoCodecMeta) {
                    VideoCodecMeta videoCodecMeta = (VideoCodecMeta) codecMeta;
                    EbmlMaster ebmlMaster3 = (EbmlMaster) MKVType.createByType(MKVType.Video);
                    MKVMuxer.createChild(ebmlMaster3, MKVType.PixelWidth, (long) videoCodecMeta.getSize().getWidth());
                    MKVMuxer.createChild(ebmlMaster3, MKVType.PixelHeight, (long) videoCodecMeta.getSize().getHeight());
                    ebmlMaster2.add(ebmlMaster3);
                }
            } else {
                if ("vrbs".equalsIgnoreCase(virtualTrack.getCodecMeta().getFourcc())) {
                    MKVMuxer.createChild(ebmlMaster2, MKVType.TrackType, 2);
                    MKVType mKVType2 = MKVType.Name;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i);
                    sb2.append(" Audio");
                    MKVMuxer.createChild(ebmlMaster2, mKVType2, sb2.toString());
                    MKVMuxer.createChild(ebmlMaster2, MKVType.CodecID, "A_VORBIS");
                    MKVMuxer.createChild(ebmlMaster2, MKVType.CodecPrivate, codecMeta.getCodecPrivate());
                    if (codecMeta instanceof AudioCodecMeta) {
                        AudioCodecMeta audioCodecMeta = (AudioCodecMeta) codecMeta;
                        EbmlMaster ebmlMaster4 = (EbmlMaster) MKVType.createByType(MKVType.Audio);
                        MKVMuxer.createChild(ebmlMaster4, MKVType.Channels, (long) audioCodecMeta.getChannelCount());
                        MKVMuxer.createChild(ebmlMaster4, MKVType.BitDepth, (long) audioCodecMeta.getSampleSize());
                        MKVMuxer.createChild(ebmlMaster4, MKVType.SamplingFrequency, (long) audioCodecMeta.getSampleRate());
                        ebmlMaster2.add(ebmlMaster4);
                    }
                }
            }
            ebmlMaster.add(ebmlMaster2);
        }
        return ebmlMaster;
    }

    public MovieSegment prepareHeader(List<MovieSegment> list, VirtualTrack[] virtualTrackArr) throws IOException {
        EbmlMaster muxEbmlHeader = muxEbmlHeader();
        this.segmentElem = (EbmlMaster) MKVType.createByType(MKVType.Segment);
        this.mkvInfo = muxInfo(virtualTrackArr);
        this.mkvTracks = muxTracks(virtualTrackArr);
        this.mkvCues = (EbmlMaster) MKVType.createByType(MKVType.Cues);
        this.mkvSeekHead = muxSeekHead();
        muxCues(virtualTrackArr);
        this.segmentElem.add(this.mkvSeekHead);
        this.segmentElem.add(this.mkvInfo);
        this.segmentElem.add(this.mkvTracks);
        this.segmentElem.add(this.mkvCues);
        Iterator it = this.webmClusters.iterator();
        while (it.hasNext()) {
            this.segmentElem.add(((WebmCluster) it.next()).f44834c);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(muxEbmlHeader);
        arrayList.add(this.segmentElem);
        this.headerChunk = new HeaderSegment(arrayList);
        return this.headerChunk;
    }

    public MovieSegment preparePacket(VirtualTrack virtualTrack, VirtualPacket virtualPacket, int i, int i2, long j) {
        WebmCluster webmCluster = new WebmCluster(virtualTrack, virtualPacket, i, i2, j);
        if (this.webmClusters == null) {
            this.webmClusters = new LinkedList<>();
        }
        this.webmClusters.add(webmCluster);
        return webmCluster;
    }
}
