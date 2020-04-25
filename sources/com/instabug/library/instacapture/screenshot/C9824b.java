package com.instabug.library.instacapture.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.instacapture.screenshot.b */
/* compiled from: ViewsBitmapObservable */
public final class C9824b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26046a;

    /* renamed from: com.instabug.library.instacapture.screenshot.b$a */
    /* compiled from: ViewsBitmapObservable */
    static class C9825a implements Callable<Bitmap> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26047N;

        /* renamed from: a */
        final /* synthetic */ Activity f26048a;

        /* renamed from: b */
        final /* synthetic */ int[] f26049b;

        C9825a(Activity activity, int[] iArr) {
            boolean[] b = m45821b();
            this.f26048a = activity;
            this.f26049b = iArr;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45821b() {
            boolean[] zArr = f26047N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6145672010230013605L, "com/instabug/library/instacapture/screenshot/ViewsBitmapObservable$1", 3);
            f26047N = a;
            return a;
        }

        /* renamed from: a */
        public Bitmap mo34952a() {
            boolean[] b = m45821b();
            Bitmap screenshotBitmap = ScreenshotTaker.getScreenshotBitmap(this.f26048a, this.f26049b);
            b[1] = true;
            return screenshotBitmap;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m45821b();
            Bitmap a = mo34952a();
            b[2] = true;
            return a;
        }
    }

    @C0193h0
    /* renamed from: a */
    public static C5923b0<Bitmap> m45819a(@C0193h0 Activity activity, @C0225w @C0195i0 int[] iArr) {
        boolean[] a = m45820a();
        C5923b0<Bitmap> f = C5923b0.m26194f((Callable<? extends T>) new C9825a<Object>(activity, iArr));
        a[1] = true;
        return f;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45820a() {
        boolean[] zArr = f26046a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3040828024107277255L, "com/instabug/library/instacapture/screenshot/ViewsBitmapObservable", 2);
        f26046a = a;
        return a;
    }
}
