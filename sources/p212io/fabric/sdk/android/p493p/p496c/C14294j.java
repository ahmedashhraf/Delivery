package p212io.fabric.sdk.android.p493p.p496c;

import java.io.IOException;

/* renamed from: io.fabric.sdk.android.p.c.j */
/* compiled from: FileRollOverManager */
public interface C14294j {
    void cancelTimeBasedFileRollOver();

    boolean rollFileOver() throws IOException;

    void scheduleTimeBasedRollOverIfNeeded();
}
