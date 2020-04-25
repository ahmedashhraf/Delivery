package org.jcodec.containers.mkv;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.containers.mkv.boxes.EbmlBase;
import org.jcodec.containers.mkv.boxes.EbmlBin;
import org.jcodec.containers.mkv.boxes.EbmlMaster;
import org.jcodec.containers.mkv.boxes.EbmlUint;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class SeekHeadFactory {

    /* renamed from: a */
    List<SeekMock> f44836a = new ArrayList();
    long currentDataOffset = 0;

    public static class SeekMock {
        public long dataOffset;

        /* renamed from: id */
        byte[] f44837id;
        int seekPointerSize;
        int size;

        public static SeekMock make(EbmlBase ebmlBase) {
            SeekMock seekMock = new SeekMock();
            seekMock.f44837id = ebmlBase.f44838id;
            seekMock.size = (int) ebmlBase.size();
            return seekMock;
        }
    }

    public static int estimeteSeekSize(int i, int i2) {
        int length = MKVType.SeekID.f44835id.length + EbmlUtil.ebmlLength((long) i) + i;
        int length2 = MKVType.SeekPosition.f44835id.length + EbmlUtil.ebmlLength((long) i2) + i2;
        return MKVType.Seek.f44835id.length + EbmlUtil.ebmlLength((long) (length + length2)) + length + length2;
    }

    public void add(EbmlBase ebmlBase) {
        SeekMock make = SeekMock.make(ebmlBase);
        make.dataOffset = this.currentDataOffset;
        make.seekPointerSize = EbmlUint.calculatePayloadSize(make.dataOffset);
        this.currentDataOffset += (long) make.size;
        this.f44836a.add(make);
    }

    public int computeSeekHeadSize() {
        boolean z;
        int estimateSize = estimateSize();
        do {
            z = false;
            Iterator it = this.f44836a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SeekMock seekMock = (SeekMock) it.next();
                int calculatePayloadSize = EbmlUint.calculatePayloadSize(seekMock.dataOffset + ((long) estimateSize));
                int i = seekMock.seekPointerSize;
                if (calculatePayloadSize > i) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Size ");
                    sb.append(estimateSize);
                    sb.append(" seems too small for element ");
                    sb.append(EbmlUtil.toHexString(seekMock.f44837id));
                    sb.append(" increasing size by one.");
                    printStream.println(sb.toString());
                    seekMock.seekPointerSize++;
                    estimateSize++;
                    z = true;
                    continue;
                    break;
                } else if (calculatePayloadSize < i) {
                    throw new RuntimeException("Downsizing the index is not well thought through.");
                }
            }
        } while (z);
        return estimateSize;
    }

    /* access modifiers changed from: 0000 */
    public int estimateSize() {
        int length = MKVType.SeekHead.f44835id.length + 1 + estimeteSeekSize(((SeekMock) this.f44836a.get(0)).f44837id.length, 1);
        for (int i = 1; i < this.f44836a.size(); i++) {
            length += estimeteSeekSize(((SeekMock) this.f44836a.get(i)).f44837id.length, ((SeekMock) this.f44836a.get(i)).seekPointerSize);
        }
        return length;
    }

    public EbmlMaster indexSeekHead() {
        String str;
        int computeSeekHeadSize = computeSeekHeadSize();
        EbmlMaster ebmlMaster = (EbmlMaster) MKVType.createByType(MKVType.SeekHead);
        Iterator it = this.f44836a.iterator();
        while (true) {
            str = " vs ";
            if (!it.hasNext()) {
                break;
            }
            SeekMock seekMock = (SeekMock) it.next();
            EbmlMaster ebmlMaster2 = (EbmlMaster) MKVType.createByType(MKVType.Seek);
            EbmlBin ebmlBin = (EbmlBin) MKVType.createByType(MKVType.SeekID);
            ebmlBin.set(ByteBuffer.wrap(seekMock.f44837id));
            ebmlMaster2.add(ebmlBin);
            EbmlUint ebmlUint = (EbmlUint) MKVType.createByType(MKVType.SeekPosition);
            ebmlUint.set(seekMock.dataOffset + ((long) computeSeekHeadSize));
            if (ebmlUint.data.limit() != seekMock.seekPointerSize) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("estimated size of seekPosition differs from the one actually used. ElementId: ");
                sb.append(EbmlUtil.toHexString(seekMock.f44837id));
                sb.append(C3868i.f12248b);
                sb.append(ebmlUint.getData().limit());
                sb.append(str);
                sb.append(seekMock.seekPointerSize);
                printStream.println(sb.toString());
            }
            ebmlMaster2.add(ebmlUint);
            ebmlMaster.add(ebmlMaster2);
        }
        ByteBuffer data = ebmlMaster.getData();
        if (data.limit() != computeSeekHeadSize) {
            PrintStream printStream2 = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("estimated size of seekHead differs from the one actually used. ");
            sb2.append(data.limit());
            sb2.append(str);
            sb2.append(computeSeekHeadSize);
            printStream2.println(sb2.toString());
        }
        return ebmlMaster;
    }
}
