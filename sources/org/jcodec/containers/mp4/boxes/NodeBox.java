package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.tools.ToJSON;

public class NodeBox extends Box {
    private static final int MAX_BOX_SIZE = 134217728;
    protected List<Box> boxes = new LinkedList();
    protected BoxFactory factory = WaveExtension.FACTORY;

    public NodeBox(Header header) {
        super(header);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return (org.jcodec.containers.mp4.boxes.Box) r5.newInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        throw new java.lang.RuntimeException(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jcodec.containers.mp4.boxes.Box newBox(org.jcodec.containers.mp4.boxes.Header r4, org.jcodec.containers.mp4.boxes.BoxFactory r5) {
        /*
            java.lang.String r0 = r4.getFourcc()
            java.lang.Class r5 = r5.toClass(r0)
            if (r5 != 0) goto L_0x0010
            org.jcodec.containers.mp4.boxes.LeafBox r5 = new org.jcodec.containers.mp4.boxes.LeafBox
            r5.<init>(r4)
            return r5
        L_0x0010:
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0029 }
            java.lang.Class<org.jcodec.containers.mp4.boxes.Header> r2 = org.jcodec.containers.mp4.boxes.Header.class
            r3 = 0
            r1[r3] = r2     // Catch:{ NoSuchMethodException -> 0x0029 }
            java.lang.reflect.Constructor r1 = r5.getConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0029 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0029 }
            r0[r3] = r4     // Catch:{ NoSuchMethodException -> 0x0029 }
            java.lang.Object r4 = r1.newInstance(r0)     // Catch:{ NoSuchMethodException -> 0x0029 }
            org.jcodec.containers.mp4.boxes.Box r4 = (org.jcodec.containers.mp4.boxes.Box) r4     // Catch:{ NoSuchMethodException -> 0x0029 }
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x0030
        L_0x0029:
            java.lang.Object r4 = r5.newInstance()     // Catch:{ Exception -> 0x0027 }
            org.jcodec.containers.mp4.boxes.Box r4 = (org.jcodec.containers.mp4.boxes.Box) r4     // Catch:{ Exception -> 0x0027 }
            return r4
        L_0x0030:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.boxes.NodeBox.newBox(org.jcodec.containers.mp4.boxes.Header, org.jcodec.containers.mp4.boxes.BoxFactory):org.jcodec.containers.mp4.boxes.Box");
    }

    public static Box parseBox(ByteBuffer byteBuffer, Header header, BoxFactory boxFactory) {
        Box newBox = newBox(header, boxFactory);
        if (header.getBodySize() >= 134217728) {
            return new LeafBox(new Header("free", 8));
        }
        newBox.parse(byteBuffer);
        return newBox;
    }

    public static Box parseChildBox(ByteBuffer byteBuffer, BoxFactory boxFactory) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (byteBuffer.remaining() >= 4 && duplicate.getInt() == 0) {
            byteBuffer.getInt();
        }
        if (byteBuffer.remaining() < 4) {
            return null;
        }
        Header read = Header.read(byteBuffer);
        if (read == null || ((long) byteBuffer.remaining()) < read.getBodySize()) {
            return null;
        }
        return parseBox(NIOUtils.read(byteBuffer, (int) read.getBodySize()), read, boxFactory);
    }

    public void add(Box box) {
        this.boxes.add(box);
    }

    public void addFirst(MovieHeaderBox movieHeaderBox) {
        this.boxes.add(0, movieHeaderBox);
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        for (Box write : this.boxes) {
            write.write(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void dump(StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"tag\":\"");
        sb2.append(this.header.getFourcc());
        sb2.append("\",");
        sb.append(sb2.toString());
        ArrayList arrayList = new ArrayList(0);
        collectModel(getClass(), arrayList);
        ToJSON.fieldsToJSON(this, sb, (String[]) arrayList.toArray(new String[0]));
        sb.append("\"boxes\": [");
        dumpBoxes(sb);
        sb.append("]");
        sb.append("}");
    }

    /* access modifiers changed from: protected */
    public void dumpBoxes(StringBuilder sb) {
        for (int i = 0; i < this.boxes.size(); i++) {
            ((Box) this.boxes.get(i)).dump(sb);
            if (i < this.boxes.size() - 1) {
                sb.append(",");
            }
        }
    }

    public List<Box> getBoxes() {
        return this.boxes;
    }

    /* access modifiers changed from: protected */
    public void getModelFields(List<String> list) {
    }

    public void parse(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 8) {
            Box parseChildBox = parseChildBox(byteBuffer, this.factory);
            if (parseChildBox != null) {
                this.boxes.add(parseChildBox);
            }
        }
    }

    public void removeChildren(String... strArr) {
        Iterator it = this.boxes.iterator();
        while (it.hasNext()) {
            String fourcc = ((Box) it.next()).getFourcc();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].equals(fourcc)) {
                    it.remove();
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void replace(String str, Box box) {
        removeChildren(str);
        add(box);
    }

    public void replace(Box box) {
        removeChildren(box.getFourcc());
        add(box);
    }

    public NodeBox(NodeBox nodeBox) {
        super((Box) nodeBox);
        this.boxes = nodeBox.boxes;
        this.factory = nodeBox.factory;
    }
}
