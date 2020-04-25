package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class GenericPackage extends MXFInterchangeObject {
    private String name;
    private Date packageCreationDate;
    private Date packageModifiedDate;
    private C15568UL packageUID;
    private C15568UL[] tracks;

    public GenericPackage(C15568UL ul) {
        super(ul);
    }

    public String getName() {
        return this.name;
    }

    public Date getPackageCreationDate() {
        return this.packageCreationDate;
    }

    public Date getPackageModifiedDate() {
        return this.packageModifiedDate;
    }

    public C15568UL getPackageUID() {
        return this.packageUID;
    }

    public C15568UL[] getTracks() {
        return this.tracks;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 17409:
                    this.packageUID = C15568UL.read(byteBuffer);
                    break;
                case 17410:
                    this.name = readUtf16String(byteBuffer);
                    break;
                case 17411:
                    this.tracks = MXFMetadata.readULBatch(byteBuffer);
                    break;
                case 17412:
                    this.packageModifiedDate = MXFMetadata.readDate(byteBuffer);
                    break;
                case 17413:
                    this.packageCreationDate = MXFMetadata.readDate(byteBuffer);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown tag [ ");
                    sb.append(this.f44898ul);
                    sb.append("]: %04x");
                    Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                    continue;
            }
            it.remove();
        }
    }
}
