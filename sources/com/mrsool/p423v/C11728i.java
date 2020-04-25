package com.mrsool.p423v;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C4279e;

/* renamed from: com.mrsool.v.i */
/* compiled from: PlayServicesUtils */
public class C11728i {

    /* renamed from: com.mrsool.v.i$a */
    /* compiled from: PlayServicesUtils */
    static class C11729a implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Activity f33938a;

        C11729a(Activity activity) {
            this.f33938a = activity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f33938a.finish();
        }
    }

    /* renamed from: a */
    public static boolean m52794a(Activity activity) {
        int d = C4279e.m18476a().mo18113d(activity);
        if (d == 0) {
            return true;
        }
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            Dialog a = C4279e.m18476a().mo18095a(activity, 0, 0);
            a.setOnCancelListener(new C11729a(activity));
            a.show();
        }
        return false;
    }
}
