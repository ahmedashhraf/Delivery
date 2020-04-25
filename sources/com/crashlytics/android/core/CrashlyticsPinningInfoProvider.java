package com.crashlytics.android.core;

import java.io.InputStream;
import p212io.fabric.sdk.android.services.network.C14390f;

class CrashlyticsPinningInfoProvider implements C14390f {
    private final PinningInfoProvider pinningInfo;

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }

    public String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    public InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    public long getPinCreationTimeInMillis() {
        return -1;
    }

    public String[] getPins() {
        return this.pinningInfo.getPins();
    }
}
