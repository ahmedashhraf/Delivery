package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.HashCodeUtil;
import p201f.p202a.C5952h;

public class ResizeOptions {
    public static final float DEFAULT_ROUNDUP_FRACTION = 0.6666667f;
    public final int height;
    public final float maxBitmapSize;
    public final float roundUpFraction;
    public final int width;

    public ResizeOptions(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    @C5952h
    public static ResizeOptions forDimensions(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new ResizeOptions(i, i2);
    }

    @C5952h
    public static ResizeOptions forSquareSize(int i) {
        if (i <= 0) {
            return null;
        }
        return new ResizeOptions(i, i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        if (!(this.width == resizeOptions.width && this.height == resizeOptions.height)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(this.width, this.height);
    }

    public String toString() {
        return String.format(null, "%dx%d", new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)});
    }

    public ResizeOptions(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public ResizeOptions(int i, int i2, float f, float f2) {
        boolean z = true;
        Preconditions.checkArgument(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.width = i;
        this.height = i2;
        this.maxBitmapSize = f;
        this.roundUpFraction = f2;
    }
}
