package org.jcodec.movtool.streaming;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import org.jcodec.containers.mp4.Brand;

public class VirtualMP4Movie extends VirtualMovie {
    private Brand brand;

    public class PacketChunk implements MovieSegment {
        private String fourcc;

        /* renamed from: no */
        private int f44913no;
        private VirtualPacket packet;
        private long pos;
        private int track;

        public PacketChunk(VirtualPacket virtualPacket, int i, int i2, long j, String str) {
            this.packet = virtualPacket;
            this.track = i;
            this.f44913no = i2;
            this.pos = j;
            this.fourcc = str;
        }

        public ByteBuffer getData() throws IOException {
            return this.packet.getData().duplicate();
        }

        public int getDataLen() throws IOException {
            return this.packet.getDataLen();
        }

        public int getNo() {
            return this.f44913no;
        }

        public VirtualPacket getPacket() {
            return this.packet;
        }

        public long getPos() {
            return this.pos;
        }

        public int getTrackNo() {
            return this.track;
        }

        public void offset(int i) {
            this.pos += (long) i;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.VirtualMP4Movie$a */
    class C15576a implements MovieSegment {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f44914a;

        C15576a(ByteBuffer byteBuffer) {
            this.f44914a = byteBuffer;
        }

        public ByteBuffer getData() {
            return this.f44914a.duplicate();
        }

        public int getDataLen() {
            return this.f44914a.remaining();
        }

        public int getNo() {
            return 0;
        }

        public long getPos() {
            return 0;
        }
    }

    public VirtualMP4Movie(VirtualTrack... virtualTrackArr) throws IOException {
        this(Brand.MP4, virtualTrackArr);
    }

    /* access modifiers changed from: protected */
    public MovieSegment headerChunk(List<MovieSegment> list, VirtualTrack[] virtualTrackArr, long j) throws IOException {
        PacketChunk[] packetChunkArr = (PacketChunk[]) list.toArray(new PacketChunk[0]);
        int remaining = MovieHelper.produceHeader(packetChunkArr, virtualTrackArr, j, this.brand).remaining();
        for (PacketChunk offset : packetChunkArr) {
            offset.offset(remaining);
        }
        return new C15576a(MovieHelper.produceHeader(packetChunkArr, virtualTrackArr, j, this.brand));
    }

    /* access modifiers changed from: protected */
    public MovieSegment packetChunk(VirtualTrack virtualTrack, VirtualPacket virtualPacket, int i, int i2, long j) {
        PacketChunk packetChunk = new PacketChunk(virtualPacket, i2, i, j, virtualTrack.getCodecMeta().getFourcc());
        return packetChunk;
    }

    public VirtualMP4Movie(Brand brand2, VirtualTrack... virtualTrackArr) throws IOException {
        super(virtualTrackArr);
        this.brand = brand2;
        muxTracks();
    }
}
