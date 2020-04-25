package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.bogdwellers.pinchtozoom.C2945d;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4340i;
import com.google.android.gms.common.internal.C4372o;
import com.google.android.gms.common.util.C4476d0;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class GooglePlayServicesUtil extends C4284g {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C4284g.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    @C4476d0
    public static String getErrorString(int i) {
        return C4284g.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C4284g.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C4284g.getRemoteResource(context);
    }

    @C4372o
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C4284g.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C4284g.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C4279e a = C4279e.m18476a();
        if (C4284g.isPlayServicesPossiblyUpdating(context, i) || C4284g.isPlayStorePossiblyUpdating(context, i)) {
            a.mo18114e(context);
        } else {
            a.mo18115e(context, i);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (C4284g.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C4279e.m18476a().mo18096a(activity, i, i2, onCancelListener);
    }

    @C4056a
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C4284g.isGooglePlayServicesAvailable(context, i);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (C4284g.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C4279e a = C4279e.m18476a();
        if (fragment == null) {
            return a.mo18110b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = C4279e.m18475a((Context) activity, i, C4340i.m18800a(fragment, C4279e.m18476a().mo18099a((Context) activity, i, C2945d.f10439h), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C4279e.m18478a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }
}
