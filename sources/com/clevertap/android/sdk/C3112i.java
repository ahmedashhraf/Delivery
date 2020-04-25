package com.clevertap.android.sdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.clevertap.android.sdk.i */
/* compiled from: CTInAppBaseFullFragment */
public abstract class C3112i extends C3107h {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12292a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12296b() {
        Activity activity = this.f11148Q;
        if (activity instanceof InAppNotificationActivity) {
            mo12294a((C3109b) activity);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo12318d() {
        WindowManager windowManager = (WindowManager) getActivity().getBaseContext().getSystemService("window");
        if (windowManager == null) {
            C3111h1.m14938f("Screen size is null ");
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        float f = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        float f2 = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        double sqrt = Math.sqrt((double) ((f2 * f2) + (f * f)));
        String str = "Screen size is : ";
        if (sqrt >= 6.5d) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(sqrt);
            C3111h1.m14938f(sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(sqrt);
        C3111h1.m14938f(sb2.toString());
        return false;
    }
}
