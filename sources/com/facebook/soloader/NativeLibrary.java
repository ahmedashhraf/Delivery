package com.facebook.soloader;

import java.util.List;
import p201f.p202a.C5952h;

public abstract class NativeLibrary {
    private static final String TAG = "com.facebook.soloader.NativeLibrary";
    private boolean mLibrariesLoaded = false;
    @C5952h
    private List<String> mLibraryNames;
    @C5952h
    private volatile UnsatisfiedLinkError mLinkError = null;
    private Boolean mLoadLibraries = Boolean.valueOf(true);
    private final Object mLock = new Object();

    protected NativeLibrary(List<String> list) {
        this.mLibraryNames = list;
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
        if (!loadLibraries()) {
            throw this.mLinkError;
        }
    }

    @C5952h
    public UnsatisfiedLinkError getError() {
        return this.mLinkError;
    }

    /* access modifiers changed from: protected */
    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }

    @C5952h
    public boolean loadLibraries() {
        synchronized (this.mLock) {
            if (!this.mLoadLibraries.booleanValue()) {
                boolean z = this.mLibrariesLoaded;
                return z;
            }
            try {
                if (this.mLibraryNames != null) {
                    for (String loadLibrary : this.mLibraryNames) {
                        SoLoader.loadLibrary(loadLibrary);
                    }
                }
                initialNativeCheck();
                this.mLibrariesLoaded = true;
                this.mLibraryNames = null;
            } catch (UnsatisfiedLinkError e) {
                this.mLinkError = e;
                this.mLibrariesLoaded = false;
            } catch (Throwable th) {
                this.mLinkError = new UnsatisfiedLinkError("Failed loading libraries");
                this.mLinkError.initCause(th);
                this.mLibrariesLoaded = false;
            }
            this.mLoadLibraries = Boolean.valueOf(false);
            boolean z2 = this.mLibrariesLoaded;
            return z2;
        }
    }
}
