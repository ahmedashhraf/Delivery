package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import p201f.p202a.C5952h;

public final class FileLocker implements Closeable {
    @C5952h
    private final FileLock mLock;
    private final FileOutputStream mLockFileOutputStream;

    private FileLocker(File file) throws IOException {
        this.mLockFileOutputStream = new FileOutputStream(file);
        try {
            FileLock lock = this.mLockFileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.mLock = lock;
        } finally {
            this.mLockFileOutputStream.close();
        }
    }

    public static FileLocker lock(File file) throws IOException {
        return new FileLocker(file);
    }

    public void close() throws IOException {
        try {
            if (this.mLock != null) {
                this.mLock.release();
            }
        } finally {
            this.mLockFileOutputStream.close();
        }
    }
}
