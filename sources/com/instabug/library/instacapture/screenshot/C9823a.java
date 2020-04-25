package com.instabug.library.instacapture.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.C0193h0;
import androidx.annotation.C0225w;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.instacapture.screenshot.a */
/* compiled from: ScreenshotProvider */
public class C9823a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26045a;

    public C9823a() {
        m45817a()[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45817a() {
        boolean[] zArr = f26045a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2163323798075015424L, "com/instabug/library/instacapture/screenshot/ScreenshotProvider", 2);
        f26045a = a;
        return a;
    }

    /* renamed from: a */
    public C5923b0<Bitmap> mo34951a(@C0193h0 Activity activity, @C0225w int[] iArr) {
        boolean[] a = m45817a();
        C5923b0<Bitmap> a2 = C9824b.m45819a(activity, iArr);
        a[1] = true;
        return a2;
    }
}
