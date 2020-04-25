package com.instabug.bug;

import androidx.annotation.C0193h0;
import com.instabug.bug.model.C9278b;

public interface OnSdkDismissedCallback {

    public enum DismissType {
        SUBMIT,
        CANCEL,
        ADD_ATTACHMENT;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[5] = true;
        }
    }

    void onSdkDismissed(@C0193h0 DismissType dismissType, @C0193h0 C9278b bVar);
}
