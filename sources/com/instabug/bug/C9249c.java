package com.instabug.bug;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.bug.view.BugReportingActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.bug.c */
/* compiled from: BugReportingActivityLauncher */
public class C9249c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24463a;

    /* renamed from: a */
    public static Intent m43227a(Context context) {
        boolean[] a = m43229a();
        Intent intent = new Intent(context, BugReportingActivity.class);
        a[1] = true;
        intent.putExtra("com.instabug.library.process", C13959t.f40977y2);
        a[2] = true;
        intent.setFlags(268435456);
        a[3] = true;
        intent.addFlags(65536);
        a[4] = true;
        return intent;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43229a() {
        boolean[] zArr = f24463a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7505466835626971537L, "com/instabug/bug/BugReportingActivityLauncher", 18);
        f24463a = a;
        return a;
    }

    /* renamed from: b */
    public static Intent m43230b(Context context) {
        boolean[] a = m43229a();
        Intent intent = new Intent(context, BugReportingActivity.class);
        a[5] = true;
        intent.putExtra("com.instabug.library.process", C13959t.f40973x2);
        a[6] = true;
        intent.setFlags(268435456);
        a[7] = true;
        intent.addFlags(65536);
        a[8] = true;
        return intent;
    }

    /* renamed from: c */
    public static Intent m43231c(Context context) {
        boolean[] a = m43229a();
        Intent intent = new Intent(context, BugReportingActivity.class);
        a[9] = true;
        intent.putExtra("com.instabug.library.process", C13959t.f40780D2);
        a[10] = true;
        intent.addFlags(65536);
        a[11] = true;
        intent.addFlags(268435456);
        a[12] = true;
        return intent;
    }

    /* renamed from: d */
    static Intent m43232d(Context context) {
        boolean[] a = m43229a();
        Intent intent = new Intent(context, BugReportingActivity.class);
        a[15] = true;
        intent.putExtra("com.instabug.library.process", C13959t.f40788F2);
        a[16] = true;
        intent.addFlags(65536);
        a[17] = true;
        return intent;
    }

    /* renamed from: a */
    public static Intent m43228a(Context context, Uri uri) {
        boolean[] a = m43229a();
        Intent c = m43231c(context);
        a[13] = true;
        c.putExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI, uri);
        a[14] = true;
        return c;
    }
}
