package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class Preface extends MXFInterchangeObject {
    private C15568UL[] dmSchemes;
    private C15568UL[] essenceContainers;
    private Date lastModifiedDate;
    private int objectModelVersion;

    /* renamed from: op */
    private C15568UL f44900op;

    public Preface(C15568UL ul) {
        super(ul);
    }

    public C15568UL[] getDmSchemes() {
        return this.dmSchemes;
    }

    public C15568UL[] getEssenceContainers() {
        return this.essenceContainers;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public int getObjectModelVersion() {
        return this.objectModelVersion;
    }

    public C15568UL getOp() {
        return this.f44900op;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 15106) {
                this.lastModifiedDate = MXFMetadata.readDate(byteBuffer);
            } else if (intValue != 15111) {
                switch (intValue) {
                    case 15113:
                        this.f44900op = C15568UL.read(byteBuffer);
                        break;
                    case 15114:
                        this.essenceContainers = MXFMetadata.readULBatch(byteBuffer);
                        break;
                    case 15115:
                        this.dmSchemes = MXFMetadata.readULBatch(byteBuffer);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown tag [ ");
                        sb.append(this.f44898ul);
                        sb.append("]: %04x");
                        Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                        continue;
                }
            } else {
                this.objectModelVersion = byteBuffer.getInt();
            }
            it.remove();
        }
    }
}
