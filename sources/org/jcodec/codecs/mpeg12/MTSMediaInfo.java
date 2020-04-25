package org.jcodec.codecs.mpeg12;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcodec.codecs.mpeg12.MPSMediaInfo.MPEGTrackMetadata;
import org.jcodec.codecs.mpeg12.MPSMediaInfo.MediaInfoDone;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mps.MTSUtils;
import org.jcodec.containers.mps.MTSUtils.TSReader;
import org.jcodec.containers.mps.psi.PMTSection;
import org.jcodec.containers.mps.psi.PMTSection.PMTStream;

public class MTSMediaInfo {

    /* renamed from: org.jcodec.codecs.mpeg12.MTSMediaInfo$a */
    class C15531a extends TSReader {

        /* renamed from: a */
        private ByteBuffer f44764a;

        /* renamed from: b */
        private int f44765b = -1;

        /* renamed from: c */
        private boolean f44766c;

        /* renamed from: d */
        final /* synthetic */ List f44767d;

        /* renamed from: e */
        final /* synthetic */ Map f44768e;

        /* renamed from: f */
        final /* synthetic */ List f44769f;

        C15531a(List list, Map map, List list2) {
            this.f44767d = list;
            this.f44768e = map;
            this.f44769f = list2;
        }

        /* access modifiers changed from: protected */
        public boolean onPkt(int i, boolean z, ByteBuffer byteBuffer, long j) {
            PMTStream[] streams;
            if (i == 0) {
                this.f44765b = MTSUtils.parsePAT(byteBuffer);
            } else {
                boolean z2 = false;
                if (i == this.f44765b && !this.f44766c) {
                    ByteBuffer byteBuffer2 = this.f44764a;
                    if (byteBuffer2 == null) {
                        this.f44764a = ByteBuffer.allocate(((byteBuffer.duplicate().getInt() >> 8) & 1023) + 3);
                    } else if (byteBuffer2.hasRemaining()) {
                        ByteBuffer byteBuffer3 = this.f44764a;
                        NIOUtils.write(byteBuffer3, byteBuffer, Math.min(byteBuffer3.remaining(), byteBuffer.remaining()));
                    }
                    if (!this.f44764a.hasRemaining()) {
                        this.f44764a.flip();
                        PMTSection parsePMT = MTSUtils.parsePMT(this.f44764a);
                        this.f44767d.add(parsePMT);
                        for (PMTStream pMTStream : parsePMT.getStreams()) {
                            if (!this.f44768e.containsKey(Integer.valueOf(pMTStream.getPid()))) {
                                this.f44768e.put(Integer.valueOf(pMTStream.getPid()), new MPSMediaInfo());
                            }
                        }
                        if (parsePMT.getSectionNumber() == parsePMT.getLastSectionNumber()) {
                            z2 = true;
                        }
                        this.f44766c = z2;
                        this.f44764a = null;
                    }
                } else if (this.f44768e.containsKey(Integer.valueOf(i))) {
                    try {
                        ((MPSMediaInfo) this.f44768e.get(Integer.valueOf(i))).analyseBuffer(byteBuffer, j);
                    } catch (MediaInfoDone unused) {
                        this.f44769f.addAll(((MPSMediaInfo) this.f44768e.get(Integer.valueOf(i))).getInfos());
                        this.f44768e.remove(Integer.valueOf(i));
                        if (this.f44768e.size() == 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public static MTSMediaInfo extract(SeekableByteChannel seekableByteChannel) {
        return null;
    }

    public static void main(String[] strArr) throws IOException {
        for (MPEGTrackMetadata mPEGTrackMetadata : new MTSMediaInfo().getMediaInfo(new File(strArr[0]))) {
            System.out.println(mPEGTrackMetadata.codec);
        }
    }

    public List<MPEGTrackMetadata> getAudioTracks() {
        return null;
    }

    public List<MPEGTrackMetadata> getMediaInfo(File file) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                new C15531a(arrayList, hashMap, arrayList2).readTsFile(fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public MPEGTrackMetadata getVideoTrack() {
        return null;
    }
}
