package org.jcodec.audio;

import java.nio.FloatBuffer;
import org.jcodec.common.Assert;
import org.jcodec.common.AudioFormat;

public class ChannelMerge implements AudioFilter {
    private AudioFormat format;

    public ChannelMerge(AudioFormat audioFormat) {
        this.format = audioFormat;
    }

    public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
        if (floatBufferArr.length != this.format.getChannels()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Channel merge must be supplied with ");
            sb.append(this.format.getChannels());
            sb.append(" input buffers to hold the channels.");
            throw new IllegalArgumentException(sb.toString());
        } else if (floatBufferArr2.length == 1) {
            FloatBuffer floatBuffer = floatBufferArr2[0];
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < floatBufferArr.length; i2++) {
                if (floatBufferArr[i2].remaining() < i) {
                    i = floatBufferArr[i2].remaining();
                }
            }
            for (FloatBuffer remaining : floatBufferArr) {
                Assert.assertEquals(remaining.remaining(), i);
            }
            if (floatBuffer.remaining() >= floatBufferArr.length * i) {
                for (int i3 = 0; i3 < i; i3++) {
                    for (FloatBuffer floatBuffer2 : floatBufferArr) {
                        floatBuffer.put(floatBuffer2.get());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Supplied output buffer is not big enough to hold ");
            sb2.append(i);
            sb2.append(" * ");
            sb2.append(floatBufferArr.length);
            sb2.append(" = ");
            sb2.append(i * floatBufferArr.length);
            sb2.append(" output samples.");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new IllegalArgumentException("Channel merget invoked on more then one output");
        }
    }

    public int getDelay() {
        return 0;
    }

    public int getNInputs() {
        return this.format.getChannels();
    }

    public int getNOutputs() {
        return 1;
    }
}
