package org.jcodec.common.model;

public class Picture {
    private ColorSpace color;
    private Rect crop;
    private int[][] data;
    private int height;
    private int width;

    public Picture(int i, int i2, int[][] iArr, ColorSpace colorSpace) {
        this(i, i2, iArr, colorSpace, new Rect(0, 0, i, i2));
    }

    public static Picture create(int i, int i2, ColorSpace colorSpace) {
        return create(i, i2, colorSpace, null);
    }

    private void cropSub(int[] iArr, int i, int i2, int i3, int i4, int i5, int[] iArr2) {
        int i6 = (i2 * i5) + i;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i3; i9++) {
                iArr2[i7 + i9] = iArr[i6 + i9];
            }
            i6 += i5;
            i7 += i3;
        }
    }

    public boolean compatible(Picture picture) {
        return picture.color == this.color && picture.width == this.width && picture.height == this.height;
    }

    public void copyFrom(Picture picture) {
        if (compatible(picture)) {
            int i = 0;
            while (true) {
                ColorSpace colorSpace = this.color;
                if (i < colorSpace.nComp) {
                    int[][] iArr = this.data;
                    if (iArr[i] != null) {
                        System.arraycopy(picture.data[i], 0, iArr[i], 0, (this.width >> colorSpace.compWidth[i]) * (this.height >> colorSpace.compHeight[i]));
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Can not copy to incompatible picture");
        }
    }

    public Picture createCompatible() {
        return create(this.width, this.height, this.color);
    }

    public Picture cropped() {
        Rect rect = this.crop;
        if (rect == null || (rect.getX() == 0 && this.crop.getY() == 0 && this.crop.getWidth() == this.width && this.crop.getHeight() == this.height)) {
            return this;
        }
        Picture create = create(this.crop.getWidth(), this.crop.getHeight(), this.color);
        for (int i = 0; i < this.color.nComp; i++) {
            int[][] iArr = this.data;
            if (iArr[i] != null) {
                int[] iArr2 = iArr[i];
                int x = this.crop.getX() >> this.color.compWidth[i];
                int y = this.crop.getY() >> this.color.compHeight[i];
                int width2 = this.crop.getWidth() >> this.color.compWidth[i];
                int height2 = this.crop.getHeight();
                ColorSpace colorSpace = this.color;
                cropSub(iArr2, x, y, width2, height2 >> colorSpace.compHeight[i], this.width >> colorSpace.compWidth[i], create.data[i]);
            }
        }
        return create;
    }

    public ColorSpace getColor() {
        return this.color;
    }

    public Rect getCrop() {
        return this.crop;
    }

    public int getCroppedHeight() {
        Rect rect = this.crop;
        return rect == null ? this.height : rect.getHeight();
    }

    public int getCroppedWidth() {
        Rect rect = this.crop;
        return rect == null ? this.width : rect.getWidth();
    }

    public int[][] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int[] getPlaneData(int i) {
        return this.data[i];
    }

    public int getPlaneHeight(int i) {
        return this.height >> this.color.compHeight[i];
    }

    public int getPlaneWidth(int i) {
        return this.width >> this.color.compWidth[i];
    }

    public int getWidth() {
        return this.width;
    }

    public void setCrop(Rect rect) {
        this.crop = rect;
    }

    public Picture(int i, int i2, int[][] iArr, ColorSpace colorSpace, Rect rect) {
        this.width = i;
        this.height = i2;
        this.data = iArr;
        this.color = colorSpace;
        this.crop = rect;
    }

    public static Picture create(int i, int i2, ColorSpace colorSpace, Rect rect) {
        int[] iArr = new int[4];
        for (int i3 = 0; i3 < colorSpace.nComp; i3++) {
            int i4 = colorSpace.compPlane[i3];
            iArr[i4] = iArr[i4] + ((i >> colorSpace.compWidth[i3]) * (i2 >> colorSpace.compHeight[i3]));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            i5 += iArr[i6] != 0 ? 1 : 0;
        }
        int[][] iArr2 = new int[i5][];
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            if (iArr[i8] != 0) {
                int i9 = i7 + 1;
                iArr2[i7] = new int[iArr[i8]];
                i7 = i9;
            }
        }
        Picture picture = new Picture(i, i2, iArr2, colorSpace, rect);
        return picture;
    }

    public Picture(Picture picture) {
        this(picture.width, picture.height, picture.data, picture.color, picture.crop);
    }
}
