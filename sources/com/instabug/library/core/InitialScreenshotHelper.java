package com.instabug.library.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.screenshot.C9980a;
import com.instabug.library.screenshot.C9980a.C9984c;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapUtils.OnSaveBitmapCallback;
import com.instabug.library.util.InstabugMemoryUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InitialScreenshotHelper {
    private static transient /* synthetic */ boolean[] $jacocoData;

    public interface InitialScreenshotCapturingListener {
        void onScreenshotCapturedSuccessfully(Uri uri);

        void onScreenshotCapturingFailed(Throwable th);
    }

    /* renamed from: com.instabug.library.core.InitialScreenshotHelper$a */
    static class C9786a implements C9984c {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25965b;

        /* renamed from: a */
        final /* synthetic */ InitialScreenshotCapturingListener f25966a;

        /* renamed from: com.instabug.library.core.InitialScreenshotHelper$a$a */
        class C9787a implements OnSaveBitmapCallback {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25967b;

            /* renamed from: a */
            final /* synthetic */ C9786a f25968a;

            C9787a(C9786a aVar) {
                boolean[] a = m45654a();
                this.f25968a = aVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45654a() {
                boolean[] zArr = f25967b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6318122904640215874L, "com/instabug/library/core/InitialScreenshotHelper$1$1", 5);
                f25967b = a;
                return a;
            }

            public void onError(Throwable th) {
                boolean[] a = m45654a();
                StringBuilder sb = new StringBuilder();
                sb.append("initial screenshot capturing got error: ");
                sb.append(th.getMessage());
                sb.append(", time in MS: ");
                sb.append(System.currentTimeMillis());
                InstabugSDKLogger.m46624e(this, sb.toString(), th);
                a[3] = true;
                this.f25968a.f25966a.onScreenshotCapturingFailed(th);
                a[4] = true;
            }

            public void onSuccess(Uri uri) {
                boolean[] a = m45654a();
                InitialScreenshotCapturingListener initialScreenshotCapturingListener = this.f25968a.f25966a;
                a[1] = true;
                initialScreenshotCapturingListener.onScreenshotCapturedSuccessfully(uri);
                a[2] = true;
            }
        }

        C9786a(InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
            boolean[] a = m45651a();
            this.f25966a = initialScreenshotCapturingListener;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45651a() {
            boolean[] zArr = f25965b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5864017632556224551L, "com/instabug/library/core/InitialScreenshotHelper$1", 6);
            f25965b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34877a(Bitmap bitmap) {
            boolean[] a = m45651a();
            InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
            a[1] = true;
            Activity targetActivity = instance.getTargetActivity();
            C9787a aVar = new C9787a(this);
            a[2] = true;
            BitmapUtils.saveBitmap(bitmap, (Context) targetActivity, (OnSaveBitmapCallback) aVar);
            a[3] = true;
        }

        /* renamed from: a */
        public void mo34878a(Throwable th) {
            boolean[] a = m45651a();
            StringBuilder sb = new StringBuilder();
            sb.append("initial screenshot capturing got error: ");
            sb.append(th.getMessage());
            sb.append(", time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46624e(this, sb.toString(), th);
            a[4] = true;
            this.f25966a.onScreenshotCapturingFailed(th);
            a[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6280900620998802080L, "com/instabug/library/core/InitialScreenshotHelper", 12);
        $jacocoData = a;
        return a;
    }

    public InitialScreenshotHelper() {
        $jacocoInit()[0] = true;
    }

    public static void captureScreenshot(@C0193h0 InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugMemoryUtils.isLowMemory()) {
            $jacocoInit[1] = true;
            InstabugSDKLogger.m46623e(InitialScreenshotHelper.class, "Couldn't take initial screenshot due to low memory");
            $jacocoInit[2] = true;
            initialScreenshotCapturingListener.onScreenshotCapturingFailed(new Throwable("Your activity is currently in low memory"));
            $jacocoInit[3] = true;
            Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
            if (targetActivity == null) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(targetActivity), C9700R.string.instabug_str_capturing_screenshot_error, targetActivity);
                $jacocoInit[6] = true;
                Toast.makeText(targetActivity, localeStringResource, 0).show();
                $jacocoInit[7] = true;
            }
            $jacocoInit[8] = true;
            return;
        }
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        $jacocoInit[9] = true;
        Activity targetActivity2 = instance.getTargetActivity();
        C9786a aVar = new C9786a(initialScreenshotCapturingListener);
        $jacocoInit[10] = true;
        C9980a.m46396a(targetActivity2, (C9984c) aVar);
        $jacocoInit[11] = true;
    }
}
