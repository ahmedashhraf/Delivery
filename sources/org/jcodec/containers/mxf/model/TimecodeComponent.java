package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class TimecodeComponent extends MXFStructuralComponent {
    private int base;
    private int dropFrame;
    private long start;

    public TimecodeComponent(C15568UL ul) {
        super(ul);
    }

    public int getBase() {
        return this.base;
    }

    public int getDropFrame() {
        return this.dropFrame;
    }

    public long getStart() {
        return this.start;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 5377:
                    this.start = byteBuffer.getLong();
                    break;
                case 5378:
                    this.base = byteBuffer.getShort();
                    break;
                case 5379:
                    this.dropFrame = byteBuffer.get();
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
