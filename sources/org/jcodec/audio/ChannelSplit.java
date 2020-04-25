package org.jcodec.audio;

import java.nio.FloatBuffer;
import org.jcodec.common.AudioFormat;

public class ChannelSplit implements AudioFilter {
    private AudioFormat format;

    public ChannelSplit(AudioFormat audioFormat) {
        this.format = audioFormat;
    }

    public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
        if (floatBufferArr.length != 1) {
            throw new IllegalArgumentException("Channel split invoked on more then one input");
        } else if (floatBufferArr2.length == this.format.getChannels()) {
            FloatBuffer floatBuffer = floatBufferArr[0];
            int remaining = floatBuffer.remaining() / floatBufferArr2.length;
            int i = 0;
            while (i < floatBufferArr2.length) {
                if (floatBufferArr2[i].remaining() >= remaining) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Supplied buffer for ");
                    sb.append(i);
                    sb.append("th channel doesn't have sufficient space to put the samples ( required: ");
                    sb.append(remaining);
                    sb.append(", actual: ");
                    sb.append(floatBufferArr2[i].remaining());
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            while (floatBuffer.remaining() >= this.format.getChannels()) {
                for (FloatBuffer put : floatBufferArr2) {
                    put.put(floatBuffer.get());
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Channel split must be supplied with ");
            sb2.append(this.format.getChannels());
            sb2.append(" output buffers to hold the channels.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int getDelay() {
        return 0;
    }

    public int getNInputs() {
        return 1;
    }

    public int getNOutputs() {
        return this.format.getChannels();
    }
}
