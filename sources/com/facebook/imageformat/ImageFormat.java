package com.facebook.imageformat;

import p201f.p202a.C5952h;

public class ImageFormat {
    public static final ImageFormat UNKNOWN = new ImageFormat("UNKNOWN", null);
    private final String mFileExtension;
    private final String mName;

    public interface FormatChecker {
        @C5952h
        ImageFormat determineFormat(byte[] bArr, int i);

        int getHeaderSize();
    }

    public ImageFormat(String str, @C5952h String str2) {
        this.mName = str;
        this.mFileExtension = str2;
    }

    @C5952h
    public String getFileExtension() {
        return this.mFileExtension;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return getName();
    }
}
