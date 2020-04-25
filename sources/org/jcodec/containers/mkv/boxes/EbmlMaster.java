package org.jcodec.containers.mkv.boxes;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jcodec.containers.mkv.util.EbmlUtil;

public class EbmlMaster extends EbmlBase {
    public final ArrayList<EbmlBase> children = new ArrayList<>();
    protected long usedSize;

    public EbmlMaster(byte[] bArr) {
        this.f44838id = bArr;
    }

    public void add(EbmlBase ebmlBase) {
        if (ebmlBase != null) {
            ebmlBase.parent = this;
            this.children.add(ebmlBase);
        }
    }

    public ByteBuffer getData() {
        long dataLen = getDataLen();
        if (dataLen > 2147483647L) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("EbmlMaster.getData: id.length ");
            sb.append(this.f44838id.length);
            sb.append("  EbmlUtil.ebmlLength(");
            sb.append(dataLen);
            sb.append("): ");
            sb.append(EbmlUtil.ebmlLength(dataLen));
            sb.append(" size: ");
            sb.append(dataLen);
            printStream.println(sb.toString());
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) (((long) (this.f44838id.length + EbmlUtil.ebmlLength(dataLen))) + dataLen));
        allocate.put(this.f44838id);
        allocate.put(EbmlUtil.ebmlEncode(dataLen));
        for (int i = 0; i < this.children.size(); i++) {
            allocate.put(((EbmlBase) this.children.get(i)).getData());
        }
        allocate.flip();
        return allocate;
    }

    /* access modifiers changed from: protected */
    public long getDataLen() {
        ArrayList<EbmlBase> arrayList = this.children;
        if (arrayList == null || arrayList.isEmpty()) {
            return (long) this.dataLen;
        }
        long j = 0;
        Iterator it = this.children.iterator();
        while (it.hasNext()) {
            j += ((EbmlBase) it.next()).size();
        }
        return j;
    }

    public long size() {
        long dataLen = getDataLen();
        return dataLen + ((long) EbmlUtil.ebmlLength(dataLen)) + ((long) this.f44838id.length);
    }
}
