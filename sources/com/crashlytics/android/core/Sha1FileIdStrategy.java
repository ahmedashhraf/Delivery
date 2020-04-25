package com.crashlytics.android.core;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

class Sha1FileIdStrategy implements FileIdStrategy {
    Sha1FileIdStrategy() {
    }

    private static String getFileSHA(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = C14248i.m61802a((InputStream) bufferedInputStream2);
                C14248i.m61814a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C14248i.m61814a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C14248i.m61814a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    public String createId(File file) throws IOException {
        return getFileSHA(file.getPath());
    }
}
