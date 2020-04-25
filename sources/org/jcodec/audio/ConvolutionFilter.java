package org.jcodec.audio;

import java.nio.FloatBuffer;

public abstract class ConvolutionFilter implements AudioFilter {
    private double[] kernel;

    /* access modifiers changed from: protected */
    public abstract double[] buildKernel();

    public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
        if (floatBufferArr.length != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" filter is designed to work only on one input");
            throw new IllegalArgumentException(sb.toString());
        } else if (floatBufferArr2.length == 1) {
            FloatBuffer floatBuffer = floatBufferArr[0];
            FloatBuffer floatBuffer2 = floatBufferArr2[0];
            if (this.kernel == null) {
                this.kernel = buildKernel();
            }
            if (floatBuffer2.remaining() >= floatBuffer.remaining() - this.kernel.length) {
                int remaining = floatBuffer.remaining();
                double[] dArr = this.kernel;
                if (remaining > dArr.length) {
                    int length = dArr.length / 2;
                    int position = floatBuffer.position() + length;
                    while (position < floatBuffer.limit() - length) {
                        double d = 0.0d;
                        int i = 0;
                        while (true) {
                            double[] dArr2 = this.kernel;
                            if (i >= dArr2.length) {
                                break;
                            }
                            double d2 = dArr2[i];
                            double d3 = (double) floatBuffer.get((position + i) - length);
                            Double.isNaN(d3);
                            d += d2 * d3;
                            i++;
                        }
                        floatBuffer2.put((float) d);
                        position++;
                    }
                    floatBuffer.position(position - length);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Input buffer should contain > kernel lenght (");
                sb2.append(this.kernel.length);
                sb2.append(") samples.");
                throw new IllegalArgumentException(sb2.toString());
            }
            throw new IllegalArgumentException("Output buffer is too small");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getClass().getName());
            sb3.append(" filter is designed to work only on one output");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public int getDelay() {
        if (this.kernel == null) {
            this.kernel = buildKernel();
        }
        return this.kernel.length / 2;
    }

    public int getNInputs() {
        return 1;
    }

    public int getNOutputs() {
        return 1;
    }
}
