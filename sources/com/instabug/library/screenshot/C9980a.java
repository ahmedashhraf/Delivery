package com.instabug.library.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.net.Uri;
import com.instabug.library.C9700R;
import com.instabug.library.C9794d.C9795a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.p384h.C9814b;
import com.instabug.library.p384h.C9814b.C9817c;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapUtils.OnSaveBitmapCallback;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import java.io.File;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.screenshot.a */
/* compiled from: ScreenshotProvider */
public class C9980a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26540a;

    /* renamed from: com.instabug.library.screenshot.a$a */
    /* compiled from: ScreenshotProvider */
    static class C9981a extends C9817c {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26541c;

        /* renamed from: b */
        final /* synthetic */ C9984c f26542b;

        C9981a(C9984c cVar) {
            boolean[] a = m46399a();
            this.f26542b = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46399a() {
            boolean[] zArr = f26541c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8344409619072877310L, "com/instabug/library/screenshot/ScreenshotProvider$1", 5);
            f26541c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34941a(Bitmap bitmap) {
            boolean[] a = m46399a();
            C9984c cVar = this.f26542b;
            a[1] = true;
            cVar.mo34877a(bitmap);
            a[2] = true;
        }

        /* renamed from: a */
        public void mo34942a(Throwable th) {
            boolean[] a = m46399a();
            C9984c cVar = this.f26542b;
            a[3] = true;
            cVar.mo34878a(th);
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.screenshot.a$b */
    /* compiled from: ScreenshotProvider */
    static class C9982b extends C9817c {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26543d;

        /* renamed from: b */
        final /* synthetic */ C9795a[] f26544b;

        /* renamed from: c */
        final /* synthetic */ Activity f26545c;

        /* renamed from: com.instabug.library.screenshot.a$b$a */
        /* compiled from: ScreenshotProvider */
        class C9983a implements OnSaveBitmapCallback {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26546b;

            /* renamed from: a */
            final /* synthetic */ C9982b f26547a;

            C9983a(C9982b bVar) {
                boolean[] a = m46405a();
                this.f26547a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46405a() {
                boolean[] zArr = f26546b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6597858448629102249L, "com/instabug/library/screenshot/ScreenshotProvider$2$1", 9);
                f26546b = a;
                return a;
            }

            public void onError(Throwable th) {
                boolean[] a = m46405a();
                StringBuilder sb = new StringBuilder();
                sb.append("capture screenshot as video frame got error: ");
                a[5] = true;
                sb.append(th.getMessage());
                sb.append(", time in MS: ");
                a[6] = true;
                sb.append(System.currentTimeMillis());
                String sb2 = sb.toString();
                a[7] = true;
                InstabugSDKLogger.m46624e(C9980a.class, sb2, th);
                a[8] = true;
            }

            public void onSuccess(Uri uri) {
                boolean[] a = m46405a();
                StringBuilder sb = new StringBuilder();
                sb.append("capture screenshot as video frame done successfully, videoFrameUri :");
                a[1] = true;
                sb.append(uri.getPath());
                sb.append(", time in MS: ");
                a[2] = true;
                sb.append(System.currentTimeMillis());
                String sb2 = sb.toString();
                a[3] = true;
                InstabugSDKLogger.m46626v(C9980a.class, sb2);
                a[4] = true;
            }
        }

        C9982b(C9795a[] aVarArr, Activity activity) {
            boolean[] a = m46402a();
            this.f26544b = aVarArr;
            this.f26545c = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46402a() {
            boolean[] zArr = f26543d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2106169265901425730L, "com/instabug/library/screenshot/ScreenshotProvider$2", 19);
            f26543d = a;
            return a;
        }

        /* renamed from: a */
        public void mo34941a(Bitmap bitmap) {
            boolean[] a = m46402a();
            if (this.f26544b == null) {
                a[1] = true;
            } else {
                a[2] = true;
                Paint paint = new Paint(1);
                a[3] = true;
                paint.setStyle(Style.FILL);
                a[4] = true;
                paint.setColor(-1711341568);
                a[5] = true;
                Canvas canvas = new Canvas(bitmap);
                C9795a[] aVarArr = this.f26544b;
                int length = aVarArr.length;
                int i = 0;
                a[6] = true;
                while (i < length) {
                    C9795a aVar = aVarArr[i];
                    a[8] = true;
                    float a2 = (float) aVar.mo34923a();
                    a[9] = true;
                    float b = (float) aVar.mo34924b();
                    a[10] = true;
                    canvas.drawCircle(a2, b, 30.0f, paint);
                    i++;
                    a[11] = true;
                }
                a[7] = true;
            }
            Activity activity = this.f26545c;
            a[12] = true;
            File videoRecordingFramesDirectory = AttachmentsUtility.getVideoRecordingFramesDirectory(activity);
            C9983a aVar2 = new C9983a(this);
            a[13] = true;
            BitmapUtils.saveBitmap(bitmap, videoRecordingFramesDirectory, (OnSaveBitmapCallback) aVar2);
            a[14] = true;
        }

        /* renamed from: a */
        public void mo34942a(Throwable th) {
            boolean[] a = m46402a();
            StringBuilder sb = new StringBuilder();
            sb.append("capture screenshot as video frame got error: ");
            a[15] = true;
            sb.append(th.getMessage());
            sb.append(", time in MS: ");
            a[16] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[17] = true;
            InstabugSDKLogger.m46624e(C9980a.class, sb2, th);
            a[18] = true;
        }
    }

    /* renamed from: com.instabug.library.screenshot.a$c */
    /* compiled from: ScreenshotProvider */
    public interface C9984c {
        /* renamed from: a */
        void mo34877a(Bitmap bitmap);

        /* renamed from: a */
        void mo34878a(Throwable th);
    }

    public C9980a() {
        m46398a()[0] = true;
    }

    /* renamed from: a */
    public static synchronized void m46396a(Activity activity, C9984c cVar) {
        Class<C9980a> cls = C9980a.class;
        synchronized (cls) {
            boolean[] a = m46398a();
            StringBuilder sb = new StringBuilder();
            sb.append("start capture screenshot, time in MS: ");
            a[1] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46626v(cls, sb2);
            a[3] = true;
            if (activity == null) {
                a[4] = true;
            } else if (activity.isFinishing()) {
                a[5] = true;
            } else {
                a[6] = true;
                C9814b a2 = C9814b.m45791a(activity);
                C9981a aVar = new C9981a(cVar);
                int[] iArr = {C9700R.C9704id.instabug_decor_view, C9700R.C9704id.instabug_extra_screenshot_button, C9700R.C9704id.instabug_floating_button, C9700R.C9704id.instabug_intro_dialog};
                a[7] = true;
                a2.mo34939a(aVar, iArr);
                a[8] = true;
            }
            a[9] = true;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46398a() {
        boolean[] zArr = f26540a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4904497641650122866L, "com/instabug/library/screenshot/ScreenshotProvider", 20);
        f26540a = a;
        return a;
    }

    /* renamed from: a */
    public static void m46397a(Activity activity, C9795a[] aVarArr) {
        boolean[] a = m46398a();
        StringBuilder sb = new StringBuilder();
        sb.append("start capture screenshot as video frame, time in MS: ");
        a[10] = true;
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        a[11] = true;
        InstabugSDKLogger.m46626v(C9980a.class, sb2);
        a[12] = true;
        if (activity == null) {
            a[13] = true;
        } else if (activity.isFinishing()) {
            a[14] = true;
        } else {
            a[15] = true;
            OrientationUtils.lockScreenOrientation(activity);
            a[16] = true;
            C9814b a2 = C9814b.m45791a(activity);
            C9982b bVar = new C9982b(aVarArr, activity);
            int[] iArr = {C9700R.C9704id.instabug_decor_view, C9700R.C9704id.instabug_extra_screenshot_button, C9700R.C9704id.instabug_floating_button, C9700R.C9704id.instabug_video_mute_button, C9700R.C9704id.instabug_video_stop_button};
            a[17] = true;
            a2.mo34939a(bVar, iArr);
            a[18] = true;
        }
        a[19] = true;
    }
}
