package org.jcodec.movtool.streaming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class VirtualMovie {
    public MovieSegment[] chunks;
    public MovieSegment headerChunk;
    protected long size;
    protected VirtualTrack[] tracks;

    public VirtualMovie(VirtualTrack... virtualTrackArr) throws IOException {
        this.tracks = virtualTrackArr;
    }

    public void close() throws IOException {
        for (VirtualTrack close : this.tracks) {
            close.close();
        }
    }

    public MovieSegment getPacketAt(long j) throws IOException {
        if (j >= 0 && j < ((long) this.headerChunk.getDataLen())) {
            return this.headerChunk;
        }
        int i = 0;
        while (true) {
            MovieSegment[] movieSegmentArr = this.chunks;
            if (i < movieSegmentArr.length - 1) {
                int i2 = i + 1;
                if (movieSegmentArr[i2].getPos() > j) {
                    return this.chunks[i];
                }
                i = i2;
            } else if (j < this.size) {
                return movieSegmentArr[movieSegmentArr.length - 1];
            } else {
                return null;
            }
        }
    }

    public MovieSegment getPacketByNo(int i) {
        MovieSegment[] movieSegmentArr = this.chunks;
        if (i > movieSegmentArr.length) {
            return null;
        }
        if (i == 0) {
            return this.headerChunk;
        }
        return movieSegmentArr[i - 1];
    }

    /* access modifiers changed from: protected */
    public abstract MovieSegment headerChunk(List<MovieSegment> list, VirtualTrack[] virtualTrackArr, long j) throws IOException;

    /* access modifiers changed from: protected */
    public void muxTracks() throws IOException {
        ArrayList arrayList = new ArrayList();
        VirtualTrack[] virtualTrackArr = this.tracks;
        VirtualPacket[] virtualPacketArr = new VirtualPacket[virtualTrackArr.length];
        VirtualPacket[] virtualPacketArr2 = new VirtualPacket[virtualTrackArr.length];
        int i = 1;
        while (true) {
            int i2 = 0;
            int i3 = -1;
            while (i2 < virtualPacketArr.length) {
                if (virtualPacketArr[i2] == null) {
                    virtualPacketArr[i2] = this.tracks[i2].nextPacket();
                    if (virtualPacketArr[i2] == null) {
                        i2++;
                    }
                }
                if (i3 == -1 || virtualPacketArr[i2].getPts() < virtualPacketArr[i3].getPts()) {
                    i3 = i2;
                    i2++;
                } else {
                    i2++;
                }
            }
            if (i3 == -1) {
                this.headerChunk = headerChunk(arrayList, this.tracks, this.size);
                this.size += (long) this.headerChunk.getDataLen();
                this.chunks = (MovieSegment[]) arrayList.toArray(new MovieSegment[0]);
                return;
            }
            arrayList.add(packetChunk(this.tracks[i3], virtualPacketArr[i3], i, i3, this.size));
            if (virtualPacketArr[i3].getDataLen() >= 0) {
                this.size += (long) virtualPacketArr[i3].getDataLen();
            } else {
                System.err.println("WARN: Negative frame data len!!!");
            }
            virtualPacketArr2[i3] = virtualPacketArr[i3];
            virtualPacketArr[i3] = this.tracks[i3].nextPacket();
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public abstract MovieSegment packetChunk(VirtualTrack virtualTrack, VirtualPacket virtualPacket, int i, int i2, long j);

    public long size() {
        return this.size;
    }
}
