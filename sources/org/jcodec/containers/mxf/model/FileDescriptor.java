package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Rational;

public class FileDescriptor extends GenericDescriptor {
    private C15568UL codec;
    private long containerDuration;
    private C15568UL essenceContainer;
    private int linkedTrackId;
    private Rational sampleRate;

    public FileDescriptor(C15568UL ul) {
        super(ul);
    }

    public C15568UL getCodec() {
        return this.codec;
    }

    public long getContainerDuration() {
        return this.containerDuration;
    }

    public C15568UL getEssenceContainer() {
        return this.essenceContainer;
    }

    public int getLinkedTrackId() {
        return this.linkedTrackId;
    }

    public Rational getSampleRate() {
        return this.sampleRate;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 12289:
                    this.sampleRate = new Rational(byteBuffer.getInt(), byteBuffer.getInt());
                    break;
                case 12290:
                    this.containerDuration = byteBuffer.getLong();
                    break;
                case 12292:
                    this.essenceContainer = C15568UL.read(byteBuffer);
                    break;
                case 12293:
                    this.codec = C15568UL.read(byteBuffer);
                    break;
                case 12294:
                    this.linkedTrackId = byteBuffer.getInt();
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
