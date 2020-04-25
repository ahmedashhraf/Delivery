package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import androidx.annotation.C0193h0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.C4162m;

/* renamed from: com.google.android.gms.common.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4340i implements OnClickListener {
    /* renamed from: a */
    public static C4340i m18799a(Activity activity, Intent intent, int i) {
        return new C4373o0(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18326a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo18326a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static C4340i m18800a(@C0193h0 Fragment fragment, Intent intent, int i) {
        return new C4370n0(intent, fragment, i);
    }

    /* renamed from: a */
    public static C4340i m18801a(@C0193h0 C4162m mVar, Intent intent, int i) {
        return new C4378p0(intent, mVar, i);
    }
}
