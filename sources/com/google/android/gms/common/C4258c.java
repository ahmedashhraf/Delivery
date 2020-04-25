package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4258c extends DialogFragment {

    /* renamed from: a */
    private Dialog f13233a = null;

    /* renamed from: b */
    private OnCancelListener f13234b = null;

    /* renamed from: a */
    public static C4258c m18391a(Dialog dialog) {
        return m18392a(dialog, null);
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f13234b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13233a == null) {
            setShowsDialog(false);
        }
        return this.f13233a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    /* renamed from: a */
    public static C4258c m18392a(Dialog dialog, OnCancelListener onCancelListener) {
        C4258c cVar = new C4258c();
        Dialog dialog2 = (Dialog) C4300a0.m18621a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f13233a = dialog2;
        if (onCancelListener != null) {
            cVar.f13234b = onCancelListener;
        }
        return cVar;
    }
}
