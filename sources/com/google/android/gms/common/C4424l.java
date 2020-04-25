package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import androidx.fragment.app.C1374b;
import androidx.fragment.app.C1382h;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.l */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4424l extends C1374b {

    /* renamed from: a */
    private Dialog f13588a = null;

    /* renamed from: b */
    private OnCancelListener f13589b = null;

    /* renamed from: a */
    public static C4424l m19062a(Dialog dialog) {
        return m19063a(dialog, null);
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f13589b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13588a == null) {
            setShowsDialog(false);
        }
        return this.f13588a;
    }

    public void show(C1382h hVar, String str) {
        super.show(hVar, str);
    }

    /* renamed from: a */
    public static C4424l m19063a(Dialog dialog, OnCancelListener onCancelListener) {
        C4424l lVar = new C4424l();
        Dialog dialog2 = (Dialog) C4300a0.m18621a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f13588a = dialog2;
        if (onCancelListener != null) {
            lVar.f13589b = onCancelListener;
        }
        return lVar;
    }
}
