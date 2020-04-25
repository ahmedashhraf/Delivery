package com.instabug.library;

import com.instabug.library.bugreporting.model.Bug.Type;

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

    void onSdkDismissed(DismissType dismissType, Type type);
}
