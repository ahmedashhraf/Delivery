package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

public class LottieImageAsset {
    @C0195i0
    private Bitmap bitmap;
    private final String dirName;
    private final String fileName;
    private final int height;

    /* renamed from: id */
    private final String f9980id;
    private final int width;

    @C0207n0({C0208a.LIBRARY})
    public LottieImageAsset(int i, int i2, String str, String str2, String str3) {
        this.width = i;
        this.height = i2;
        this.f9980id = str;
        this.fileName = str2;
        this.dirName = str3;
    }

    @C0195i0
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDirName() {
        return this.dirName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f9980id;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(@C0195i0 Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }
}
