package com.instabug.library.invocation.invocationdialog;

import android.net.Uri;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDialogListener {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InstabugDialogListener INSTANCE;
    InstabugDialogCallbacks callbacks;

    public interface InstabugDialogCallbacks {
        void onClick(int i, String str, Uri uri);
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1961746395488794804L, "com/instabug/library/invocation/invocationdialog/InstabugDialogListener", 9);
        $jacocoData = a;
        return a;
    }

    private InstabugDialogListener() {
        $jacocoInit()[0] = true;
    }

    public static InstabugDialogListener getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugDialogListener instabugDialogListener = INSTANCE;
        if (instabugDialogListener == null) {
            instabugDialogListener = new InstabugDialogListener();
            INSTANCE = instabugDialogListener;
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
        }
        $jacocoInit[3] = true;
        return instabugDialogListener;
    }

    public void onDialogItemClick(int i, String str, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugDialogCallbacks instabugDialogCallbacks = this.callbacks;
        if (instabugDialogCallbacks == null) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            instabugDialogCallbacks.onClick(i, str, uri);
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }

    public void setListener(InstabugDialogCallbacks instabugDialogCallbacks) {
        boolean[] $jacocoInit = $jacocoInit();
        this.callbacks = instabugDialogCallbacks;
        $jacocoInit[4] = true;
    }
}
