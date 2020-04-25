package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.soloader.SoLoader;

public class StaticWebpNativeLoader {
    private static boolean sInitialized;

    public static synchronized void ensure() {
        synchronized (StaticWebpNativeLoader.class) {
            if (!sInitialized) {
                if (VERSION.SDK_INT <= 16) {
                    try {
                        SoLoader.loadLibrary("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                SoLoader.loadLibrary("static-webp");
                sInitialized = true;
            }
        }
    }
}
