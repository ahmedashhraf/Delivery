package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;

public class AES3PCMDescriptor extends WaveAudioDescriptor {
    private byte auxBitsMode;
    private short blockStartOffset;
    private ByteBuffer channelStatusMode;
    private byte emphasis;
    private ByteBuffer fixedChannelStatusData;
    private ByteBuffer fixedUserData;
    private ByteBuffer userDataMode;

    public AES3PCMDescriptor(C15568UL ul) {
        super(ul);
    }

    public byte getAuxBitsMode() {
        return this.auxBitsMode;
    }

    public short getBlockStartOffset() {
        return this.blockStartOffset;
    }

    public ByteBuffer getChannelStatusMode() {
        return this.channelStatusMode;
    }

    public byte getEmphasis() {
        return this.emphasis;
    }

    public ByteBuffer getFixedChannelStatusData() {
        return this.fixedChannelStatusData;
    }

    public ByteBuffer getFixedUserData() {
        return this.fixedUserData;
    }

    public ByteBuffer getUserDataMode() {
        return this.userDataMode;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 15624) {
                this.auxBitsMode = byteBuffer.get();
            } else if (intValue != 15629) {
                switch (intValue) {
                    case 15631:
                        this.blockStartOffset = byteBuffer.getShort();
                        break;
                    case 15632:
                        this.channelStatusMode = byteBuffer;
                        break;
                    case 15633:
                        this.fixedChannelStatusData = byteBuffer;
                        break;
                    case 15634:
                        this.userDataMode = byteBuffer;
                        break;
                    case 15635:
                        this.fixedUserData = byteBuffer;
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
                this.emphasis = byteBuffer.get();
            }
            it.remove();
        }
    }
}
