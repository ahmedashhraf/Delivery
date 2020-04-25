package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Rational;

public class GenericSoundEssenceDescriptor extends FileDescriptor {
    private byte audioRefLevel;
    private Rational audioSamplingRate;
    private int channelCount;
    private byte dialNorm;
    private byte electroSpatialFormulation;
    private byte locked;
    private int quantizationBits;
    private C15568UL soundEssenceCompression;

    public GenericSoundEssenceDescriptor(C15568UL ul) {
        super(ul);
    }

    public byte getAudioRefLevel() {
        return this.audioRefLevel;
    }

    public Rational getAudioSamplingRate() {
        return this.audioSamplingRate;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public byte getDialNorm() {
        return this.dialNorm;
    }

    public byte getElectroSpatialFormulation() {
        return this.electroSpatialFormulation;
    }

    public byte getLocked() {
        return this.locked;
    }

    public int getQuantizationBits() {
        return this.quantizationBits;
    }

    public C15568UL getSoundEssenceCompression() {
        return this.soundEssenceCompression;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue != 15628) {
                switch (intValue) {
                    case 15617:
                        this.quantizationBits = byteBuffer.getInt();
                        break;
                    case 15618:
                        this.locked = byteBuffer.get();
                        break;
                    case 15619:
                        this.audioSamplingRate = new Rational(byteBuffer.getInt(), byteBuffer.getInt());
                        break;
                    case 15620:
                        this.audioRefLevel = byteBuffer.get();
                        break;
                    case 15621:
                        this.electroSpatialFormulation = byteBuffer.get();
                        break;
                    case 15622:
                        this.soundEssenceCompression = C15568UL.read(byteBuffer);
                        break;
                    case 15623:
                        this.channelCount = byteBuffer.getInt();
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
                this.dialNorm = byteBuffer.get();
            }
            it.remove();
        }
    }
}
