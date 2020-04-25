package org.jcodec.audio;

public class SincLowPassFilter extends ConvolutionFilter {
    private double cutoffFreq;
    private int kernelSize;

    public SincLowPassFilter(int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        this(d / d2);
    }

    /* access modifiers changed from: protected */
    public double[] buildKernel() {
        double[] dArr = new double[this.kernelSize];
        double d = 0.0d;
        int i = 0;
        while (true) {
            int i2 = this.kernelSize;
            if (i >= i2) {
                break;
            }
            if (i - (i2 / 2) != 0) {
                double d2 = this.cutoffFreq * 6.283185307179586d;
                double d3 = (double) (i - (i2 / 2));
                Double.isNaN(d3);
                double sin = Math.sin(d2 * d3);
                int i3 = this.kernelSize;
                double d4 = (double) (i - (i3 / 2));
                Double.isNaN(d4);
                double d5 = sin / d4;
                double d6 = (double) i;
                Double.isNaN(d6);
                double d7 = d6 * 6.283185307179586d;
                double d8 = (double) i3;
                Double.isNaN(d8);
                dArr[i] = d5 * (0.54d - (Math.cos(d7 / d8) * 0.46d));
            } else {
                dArr[i] = this.cutoffFreq * 6.283185307179586d;
            }
            d += dArr[i];
            i++;
        }
        for (int i4 = 0; i4 < this.kernelSize; i4++) {
            dArr[i4] = dArr[i4] / d;
        }
        return dArr;
    }

    public SincLowPassFilter(double d) {
        this(40, d);
    }

    public SincLowPassFilter(int i, double d) {
        this.kernelSize = i;
        this.cutoffFreq = d;
    }
}
