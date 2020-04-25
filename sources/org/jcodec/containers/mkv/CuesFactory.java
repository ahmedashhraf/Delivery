package org.jcodec.containers.mkv;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.containers.mkv.boxes.EbmlBase;
import org.jcodec.containers.mkv.boxes.EbmlMaster;
import org.jcodec.containers.mkv.boxes.EbmlUint;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class CuesFactory {

    /* renamed from: a */
    List<CuePointMock> f44831a = new ArrayList();
    private long currentDataOffset = 0;
    private final long offsetBase;
    private long videoTrackNr;

    public static class CuePointMock {
        public int cueClusterPositionSize;
        public long elementOffset;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public byte[] f44832id;
        /* access modifiers changed from: private */
        public long size;
        /* access modifiers changed from: private */
        public long timecode;

        public static CuePointMock make(EbmlMaster ebmlMaster) {
            return make(ebmlMaster.f44838id, ((EbmlUint) MKVType.findFirst((EbmlBase) ebmlMaster, MKVType.Cluster, MKVType.Timecode)).get(), ebmlMaster.size());
        }

        public static CuePointMock make(byte[] bArr, long j, long j2) {
            CuePointMock cuePointMock = new CuePointMock();
            cuePointMock.f44832id = bArr;
            cuePointMock.timecode = j;
            cuePointMock.size = j2;
            return cuePointMock;
        }
    }

    public CuesFactory(long j, long j2) {
        this.offsetBase = j;
        this.videoTrackNr = j2;
        this.currentDataOffset += this.offsetBase;
    }

    public static int estimateCuePointSize(int i, int i2, int i3) {
        int length = MKVType.CueTime.f44835id.length + EbmlUtil.ebmlLength((long) i) + i;
        int length2 = MKVType.CueTrack.f44835id.length + EbmlUtil.ebmlLength((long) i2) + i2 + MKVType.CueClusterPosition.f44835id.length + EbmlUtil.ebmlLength((long) i3) + i3;
        int length3 = length2 + MKVType.CueTrackPositions.f44835id.length + EbmlUtil.ebmlLength((long) length2);
        return MKVType.CuePoint.f44835id.length + EbmlUtil.ebmlLength((long) (length + length3)) + length + length3;
    }

    public void add(CuePointMock cuePointMock) {
        cuePointMock.elementOffset = this.currentDataOffset;
        cuePointMock.cueClusterPositionSize = EbmlUint.calculatePayloadSize(cuePointMock.elementOffset);
        this.currentDataOffset += cuePointMock.size;
        this.f44831a.add(cuePointMock);
    }

    public void addFixedSize(CuePointMock cuePointMock) {
        long j = this.currentDataOffset;
        cuePointMock.elementOffset = j;
        cuePointMock.cueClusterPositionSize = 8;
        this.currentDataOffset = j + cuePointMock.size;
        this.f44831a.add(cuePointMock);
    }

    public int computeCuesSize() {
        boolean z;
        int estimateSize = estimateSize();
        do {
            z = false;
            Iterator it = this.f44831a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CuePointMock cuePointMock = (CuePointMock) it.next();
                int calculatePayloadSize = EbmlUint.calculatePayloadSize(cuePointMock.elementOffset + ((long) estimateSize));
                int i = cuePointMock.cueClusterPositionSize;
                if (calculatePayloadSize > i) {
                    PrintStream printStream = System.err;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Size ");
                    sb.append(estimateSize);
                    sb.append(" seems too small for element ");
                    sb.append(EbmlUtil.toHexString(cuePointMock.f44832id));
                    sb.append(" increasing size by one.");
                    printStream.println(sb.toString());
                    cuePointMock.cueClusterPositionSize++;
                    estimateSize++;
                    z = true;
                    continue;
                    break;
                } else if (calculatePayloadSize < i) {
                    throw new RuntimeException("Downsizing the index is not well thought through");
                }
            }
        } while (z);
        return estimateSize;
    }

    public EbmlMaster createCues() {
        int computeCuesSize = computeCuesSize();
        EbmlMaster ebmlMaster = (EbmlMaster) MKVType.createByType(MKVType.Cues);
        for (CuePointMock cuePointMock : this.f44831a) {
            EbmlMaster ebmlMaster2 = (EbmlMaster) MKVType.createByType(MKVType.CuePoint);
            EbmlUint ebmlUint = (EbmlUint) MKVType.createByType(MKVType.CueTime);
            ebmlUint.set(cuePointMock.timecode);
            ebmlMaster2.add(ebmlUint);
            EbmlMaster ebmlMaster3 = (EbmlMaster) MKVType.createByType(MKVType.CueTrackPositions);
            EbmlUint ebmlUint2 = (EbmlUint) MKVType.createByType(MKVType.CueTrack);
            ebmlUint2.set(this.videoTrackNr);
            ebmlMaster3.add(ebmlUint2);
            EbmlUint ebmlUint3 = (EbmlUint) MKVType.createByType(MKVType.CueClusterPosition);
            ebmlUint3.set(cuePointMock.elementOffset + ((long) computeCuesSize));
            if (ebmlUint3.data.limit() != cuePointMock.cueClusterPositionSize) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("estimated size of CueClusterPosition differs from the one actually used. ElementId: ");
                sb.append(EbmlUtil.toHexString(cuePointMock.f44832id));
                sb.append(C3868i.f12248b);
                sb.append(ebmlUint3.getData().limit());
                sb.append(" vs ");
                sb.append(cuePointMock.cueClusterPositionSize);
                printStream.println(sb.toString());
            }
            ebmlMaster3.add(ebmlUint3);
            ebmlMaster2.add(ebmlMaster3);
            ebmlMaster.add(ebmlMaster2);
        }
        return ebmlMaster;
    }

    public int estimateFixedSize(int i) {
        int i2 = i * 34;
        return i2 + MKVType.Cues.f44835id.length + EbmlUtil.ebmlLength((long) i2);
    }

    public int estimateSize() {
        int i = 0;
        for (CuePointMock cuePointMock : this.f44831a) {
            i += estimateCuePointSize(EbmlUint.calculatePayloadSize(cuePointMock.timecode), EbmlUint.calculatePayloadSize(this.videoTrackNr), EbmlUint.calculatePayloadSize(cuePointMock.elementOffset));
        }
        return i + MKVType.Cues.f44835id.length + EbmlUtil.ebmlLength((long) i);
    }
}
