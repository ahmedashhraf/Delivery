package org.jcodec.containers.mkv.boxes;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jcodec.containers.mkv.MKVType;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class MkvSegment extends EbmlMaster {
    int headerSize = 0;

    public MkvSegment(byte[] bArr) {
        super(bArr);
    }

    public ByteBuffer getHeader() {
        long headerSize2 = getHeaderSize();
        if (headerSize2 > 2147483647L) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("MkvSegment.getHeader: id.length ");
            sb.append(this.f44838id.length);
            sb.append("  Element.getEbmlSize(");
            sb.append(this.dataLen);
            sb.append("): ");
            sb.append(EbmlUtil.ebmlLength((long) this.dataLen));
            sb.append(" size: ");
            sb.append(this.dataLen);
            printStream.println(sb.toString());
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) headerSize2);
        allocate.put(this.f44838id);
        allocate.put(EbmlUtil.ebmlEncode(getDataLen()));
        ArrayList<EbmlBase> arrayList = this.children;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.children.iterator();
            while (it.hasNext()) {
                EbmlBase ebmlBase = (EbmlBase) it.next();
                if (!MKVType.Cluster.equals(ebmlBase.type)) {
                    allocate.put(ebmlBase.getData());
                }
            }
        }
        allocate.flip();
        return allocate;
    }

    public long getHeaderSize() {
        long length = ((long) this.f44838id.length) + ((long) EbmlUtil.ebmlLength(getDataLen()));
        ArrayList<EbmlBase> arrayList = this.children;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.children.iterator();
            while (it.hasNext()) {
                EbmlBase ebmlBase = (EbmlBase) it.next();
                if (!MKVType.Cluster.equals(ebmlBase.type)) {
                    length += ebmlBase.size();
                }
            }
        }
        return length;
    }

    public MkvSegment() {
        super(MKVType.Segment.f44835id);
    }
}
