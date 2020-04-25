package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.core.content.C0841b;
import com.facebook.places.model.PlaceFields;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.i0 */
class C11861i0 {
    /* renamed from: a */
    static boolean m53328a(Context context) {
        return VERSION.SDK_INT >= 23 && !m53330c(context);
    }

    @SuppressLint({"all"})
    /* renamed from: b */
    static String m53329b(Context context) {
        if (m53330c(context)) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (telephonyManager != null) {
                return telephonyManager.getDeviceId();
            }
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m53330c(Context context) {
        return C0841b.m4916a(context, "android.permission.READ_PHONE_STATE") == 0;
    }
}
