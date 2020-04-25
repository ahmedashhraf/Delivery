package com.instabug.library.internal.layer;

import android.graphics.Bitmap;
import androidx.annotation.C0210o0;

public interface CapturableView {

    public interface SnapshotPreparationCallback {
        void onSnapshotFailed();

        void onSnapshotReady(Bitmap bitmap);
    }

    void getLocationOnScreen(@C0210o0(2) int[] iArr);

    boolean isVisible();

    void snapshot(SnapshotPreparationCallback snapshotPreparationCallback);
}
