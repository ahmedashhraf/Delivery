package org.jcodec.audio;

import java.nio.FloatBuffer;
import java.util.Arrays;

public class FilterSocket {
    private FloatBuffer[] buffers;
    private int[] delays;
    private AudioFilter[] filters;
    private long[] positions;
    private int totalInputs;
    private int totalOutputs;

    public FilterSocket(AudioFilter... audioFilterArr) {
        this.totalInputs = 0;
        this.totalOutputs = 0;
        for (int i = 0; i < audioFilterArr.length; i++) {
            this.totalInputs += audioFilterArr[i].getNInputs();
            this.totalOutputs += audioFilterArr[i].getNOutputs();
        }
        int i2 = this.totalInputs;
        this.buffers = new FloatBuffer[i2];
        this.positions = new long[i2];
        this.delays = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < audioFilterArr.length) {
            int i5 = i4;
            int i6 = 0;
            while (i6 < audioFilterArr[i3].getNInputs()) {
                this.delays[i5] = audioFilterArr[i3].getDelay();
                i6++;
                i5++;
            }
            i3++;
            i4 = i5;
        }
        this.filters = audioFilterArr;
    }

    public void allocateBuffers(int i) {
        for (int i2 = 0; i2 < this.totalInputs; i2++) {
            this.buffers[i2] = FloatBuffer.allocate((this.delays[i2] * 2) + i);
            this.buffers[i2].position(this.delays[i2]);
        }
    }

    public void filter(FloatBuffer[] floatBufferArr) {
        if (floatBufferArr.length == this.totalOutputs) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                AudioFilter[] audioFilterArr = this.filters;
                if (i < audioFilterArr.length) {
                    audioFilterArr[i].filter((FloatBuffer[]) Arrays.copyOfRange(this.buffers, i2, audioFilterArr[i].getNInputs() + i2), Arrays.copyOfRange(this.positions, i2, this.filters[i].getNInputs() + i2), (FloatBuffer[]) Arrays.copyOfRange(floatBufferArr, i3, this.filters[i].getNOutputs() + i3));
                    i2 += this.filters[i].getNInputs();
                    i3 += this.filters[i].getNOutputs();
                    i++;
                } else {
                    return;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not output to provided filter socket inputs != outputs (");
            sb.append(floatBufferArr.length);
            sb.append("!=");
            sb.append(this.totalOutputs);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public FloatBuffer[] getBuffers() {
        return this.buffers;
    }

    /* access modifiers changed from: 0000 */
    public AudioFilter[] getFilters() {
        return this.filters;
    }

    public long[] getPositions() {
        return this.positions;
    }

    public int getTotalInputs() {
        return this.totalInputs;
    }

    public int getTotalOutputs() {
        return this.totalOutputs;
    }

    public void rotate() {
        int i = 0;
        while (true) {
            FloatBuffer[] floatBufferArr = this.buffers;
            if (i < floatBufferArr.length) {
                long[] jArr = this.positions;
                jArr[i] = jArr[i] + ((long) floatBufferArr[i].position());
                Audio.rotate(this.buffers[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void setBuffers(FloatBuffer[] floatBufferArr, long[] jArr) {
        int length = floatBufferArr.length;
        int i = this.totalInputs;
        if (length != i) {
            throw new IllegalArgumentException("Number of input buffers provided is less then the number of filter inputs.");
        } else if (jArr.length == i) {
            this.buffers = floatBufferArr;
            this.positions = jArr;
        } else {
            throw new IllegalArgumentException("Number of input buffer positions provided is less then the number of filter inputs.");
        }
    }

    FilterSocket(AudioFilter audioFilter, FloatBuffer[] floatBufferArr, long[] jArr) {
        this.filters = new AudioFilter[]{audioFilter};
        this.buffers = floatBufferArr;
        this.positions = jArr;
        this.delays = new int[]{audioFilter.getDelay()};
        this.totalInputs = audioFilter.getNInputs();
        this.totalOutputs = audioFilter.getNOutputs();
    }
}
