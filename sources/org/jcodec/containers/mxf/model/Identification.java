package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class Identification extends MXFInterchangeObject {
    private String companyName;
    private Date modificationDate;
    private String platform;
    private String productName;
    private C15568UL productUID;
    private C15568UL thisGenerationUID;
    private short versionString;

    public Identification(C15568UL ul) {
        super(ul);
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public Date getModificationDate() {
        return this.modificationDate;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductName() {
        return this.productName;
    }

    public C15568UL getProductUID() {
        return this.productUID;
    }

    public C15568UL getThisGenerationUID() {
        return this.thisGenerationUID;
    }

    public short getVersionString() {
        return this.versionString;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 15361:
                    this.companyName = readUtf16String(byteBuffer);
                    break;
                case 15362:
                    this.productName = readUtf16String(byteBuffer);
                    break;
                case 15364:
                    this.versionString = byteBuffer.getShort();
                    break;
                case 15365:
                    this.productUID = C15568UL.read(byteBuffer);
                    break;
                case 15366:
                    this.modificationDate = MXFMetadata.readDate(byteBuffer);
                    break;
                case 15368:
                    this.platform = readUtf16String(byteBuffer);
                    break;
                case 15369:
                    this.thisGenerationUID = C15568UL.read(byteBuffer);
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
