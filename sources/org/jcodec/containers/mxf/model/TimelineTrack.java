package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Rational;

public class TimelineTrack extends GenericTrack {
    private Rational editRate;
    private long origin;

    public TimelineTrack(C15568UL ul) {
        super(ul);
    }

    public Rational getEditRate() {
        return this.editRate;
    }

    public long getOrigin() {
        return this.origin;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 19201) {
                this.editRate = new Rational(byteBuffer.getInt(), byteBuffer.getInt());
            } else if (intValue != 19202) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown tag [ ");
                sb.append(this.f44898ul);
                sb.append("]: %04x");
                Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
            } else {
                this.origin = byteBuffer.getLong();
            }
            it.remove();
        }
    }
}
