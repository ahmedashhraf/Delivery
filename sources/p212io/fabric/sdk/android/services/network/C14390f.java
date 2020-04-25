package p212io.fabric.sdk.android.services.network;

import java.io.InputStream;

/* renamed from: io.fabric.sdk.android.services.network.f */
/* compiled from: PinningInfoProvider */
public interface C14390f {

    /* renamed from: a */
    public static final long f42516a = -1;

    String getKeyStorePassword();

    InputStream getKeyStoreStream();

    long getPinCreationTimeInMillis();

    String[] getPins();
}
