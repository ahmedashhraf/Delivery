package org.jcodec.audio;

import java.nio.FloatBuffer;

public class LanczosInterpolator implements AudioFilter {
    private double rateStep;

    public LanczosInterpolator(int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.rateStep = d / d2;
    }

    public static double lanczos(double d, int i) {
        if (d < ((double) (-i))) {
            return 0.0d;
        }
        double d2 = (double) i;
        if (d > d2) {
            return 0.0d;
        }
        double d3 = 3.141592653589793d * d;
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        double d4 = sin * d2;
        Double.isNaN(d2);
        return (d4 * Math.sin(d3 / d2)) / ((9.869604401089358d * d) * d);
    }

    public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
        int i;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        LanczosInterpolator lanczosInterpolator = this;
        FloatBuffer[] floatBufferArr3 = floatBufferArr;
        FloatBuffer[] floatBufferArr4 = floatBufferArr2;
        Class<LanczosInterpolator> cls = LanczosInterpolator.class;
        if (floatBufferArr3.length != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" filter is designed to work only on one input");
            throw new IllegalArgumentException(sb.toString());
        } else if (floatBufferArr4.length == 1) {
            char c = 0;
            FloatBuffer floatBuffer3 = floatBufferArr3[0];
            FloatBuffer floatBuffer4 = floatBufferArr4[0];
            double remaining = (double) floatBuffer4.remaining();
            double remaining2 = (double) (floatBuffer3.remaining() - 6);
            double d = lanczosInterpolator.rateStep;
            Double.isNaN(remaining2);
            if (remaining < remaining2 / d) {
                throw new IllegalArgumentException("Output buffer is too small");
            } else if (floatBuffer3.remaining() > 6) {
                int i2 = 0;
                while (true) {
                    double d2 = (double) i2;
                    double d3 = lanczosInterpolator.rateStep;
                    Double.isNaN(d2);
                    double d4 = (d2 * d3) + 3.0d;
                    double d5 = (double) jArr[c];
                    Double.isNaN(d5);
                    double ceil = d4 + (Math.ceil(d5 / d3) * lanczosInterpolator.rateStep);
                    double d6 = (double) jArr[c];
                    Double.isNaN(d6);
                    double d7 = ceil - d6;
                    int floor = (int) Math.floor(d7);
                    int ceil2 = (int) Math.ceil(d7);
                    if (floor >= floatBuffer3.limit() - 3) {
                        floatBuffer3.position(floor - 3);
                        return;
                    }
                    double d8 = (double) floor;
                    Double.isNaN(d8);
                    double d9 = d8 - d7;
                    if (d9 < -0.001d) {
                        double d10 = (double) ceil2;
                        Double.isNaN(d10);
                        double d11 = d10 - d7;
                        double lanczos = lanczos(d9, 3);
                        double lanczos2 = lanczos(d11, 3);
                        i = i2;
                        double lanczos3 = lanczos(d9 - 1.0d, 3);
                        FloatBuffer floatBuffer5 = floatBuffer3;
                        double lanczos4 = lanczos(d11 + 1.0d, 3);
                        double lanczos5 = lanczos(d9 - 2.0d, 3);
                        double lanczos6 = lanczos(d11 + 2.0d, 3);
                        double d12 = 1.0d / (((((lanczos + lanczos3) + lanczos5) + lanczos2) + lanczos4) + lanczos6);
                        floatBuffer = floatBuffer5;
                        double d13 = lanczos5;
                        double d14 = (double) floatBuffer.get(ceil2);
                        Double.isNaN(d14);
                        double d15 = d14 * lanczos2;
                        FloatBuffer floatBuffer6 = floatBuffer4;
                        double d16 = lanczos3;
                        double d17 = (double) floatBuffer.get(ceil2 + 1);
                        Double.isNaN(d17);
                        double d18 = d15 + (d17 * lanczos4);
                        double d19 = (double) floatBuffer.get(ceil2 + 2);
                        Double.isNaN(d19);
                        double d20 = d18 + (d19 * lanczos6);
                        double d21 = (double) floatBuffer.get(floor);
                        Double.isNaN(d21);
                        double d22 = d20 + (d21 * lanczos);
                        double d23 = (double) floatBuffer.get(floor - 1);
                        Double.isNaN(d23);
                        double d24 = d22 + (d23 * d16);
                        double d25 = (double) floatBuffer.get(floor - 2);
                        Double.isNaN(d25);
                        floatBuffer2 = floatBuffer6;
                        floatBuffer2.put((float) ((d24 + (d25 * d13)) * d12));
                    } else {
                        floatBuffer = floatBuffer3;
                        floatBuffer2 = floatBuffer4;
                        i = i2;
                        floatBuffer2.put(floatBuffer.get(floor));
                    }
                    i2 = i + 1;
                    lanczosInterpolator = this;
                    floatBuffer4 = floatBuffer2;
                    floatBuffer3 = floatBuffer;
                    c = 0;
                }
            } else {
                throw new IllegalArgumentException("Input buffer should contain > 6 samples.");
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" filter is designed to work only on one output");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int getDelay() {
        return 3;
    }

    public int getNInputs() {
        return 1;
    }

    public int getNOutputs() {
        return 1;
    }
}
