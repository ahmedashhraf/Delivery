package com.instabug.library.screenshot;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import androidx.annotation.C0193h0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import com.instabug.library.C9700R;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.screenshot.C9980a.C9984c;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapUtils.OnSaveBitmapCallback;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ScreenUtility;
import com.instabug.library.view.ViewUtils;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ExtraScreenshotHelper {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private ImageButton captureButton;
    private C12314c currentActivityLifeCycleDisposable;
    private boolean isCaptureButtonShown = false;
    private OnCaptureListener onCaptureListener;

    public interface OnCaptureListener {
        void onExtraScreenshotCaptured(Uri uri);
    }

    /* renamed from: com.instabug.library.screenshot.ExtraScreenshotHelper$a */
    class C9975a implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26527N;

        /* renamed from: a */
        final /* synthetic */ Activity f26528a;

        /* renamed from: b */
        final /* synthetic */ ExtraScreenshotHelper f26529b;

        C9975a(ExtraScreenshotHelper extraScreenshotHelper, Activity activity) {
            boolean[] a = m46387a();
            this.f26529b = extraScreenshotHelper;
            this.f26528a = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46387a() {
            boolean[] zArr = f26527N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2918262416899769152L, "com/instabug/library/screenshot/ExtraScreenshotHelper$1", 3);
            f26527N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m46387a();
            ExtraScreenshotHelper.access$000(this.f26529b);
            a[1] = true;
            ExtraScreenshotHelper extraScreenshotHelper = this.f26529b;
            ExtraScreenshotHelper.access$200(extraScreenshotHelper, this.f26528a, ExtraScreenshotHelper.access$100(extraScreenshotHelper));
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.screenshot.ExtraScreenshotHelper$b */
    class C9976b implements C9984c {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26530d;

        /* renamed from: a */
        final /* synthetic */ Activity f26531a;

        /* renamed from: b */
        final /* synthetic */ OnCaptureListener f26532b;

        /* renamed from: c */
        final /* synthetic */ ExtraScreenshotHelper f26533c;

        /* renamed from: com.instabug.library.screenshot.ExtraScreenshotHelper$b$a */
        class C9977a implements OnSaveBitmapCallback {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26534b;

            /* renamed from: a */
            final /* synthetic */ C9976b f26535a;

            C9977a(C9976b bVar) {
                boolean[] a = m46391a();
                this.f26535a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46391a() {
                boolean[] zArr = f26534b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6966028193974826068L, "com/instabug/library/screenshot/ExtraScreenshotHelper$2$1", 5);
                f26534b = a;
                return a;
            }

            public void onError(Throwable th) {
                boolean[] a = m46391a();
                a[2] = true;
                String message = th.getMessage();
                a[3] = true;
                InstabugSDKLogger.m46624e(ExtraScreenshotHelper.class, message, th);
                a[4] = true;
            }

            public void onSuccess(Uri uri) {
                boolean[] a = m46391a();
                this.f26535a.f26532b.onExtraScreenshotCaptured(uri);
                a[1] = true;
            }
        }

        C9976b(ExtraScreenshotHelper extraScreenshotHelper, Activity activity, OnCaptureListener onCaptureListener) {
            boolean[] a = m46388a();
            this.f26533c = extraScreenshotHelper;
            this.f26531a = activity;
            this.f26532b = onCaptureListener;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46388a() {
            boolean[] zArr = f26530d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3661821244954545501L, "com/instabug/library/screenshot/ExtraScreenshotHelper$2", 3);
            f26530d = a;
            return a;
        }

        /* renamed from: a */
        public void mo34877a(Bitmap bitmap) {
            boolean[] a = m46388a();
            BitmapUtils.saveBitmap(bitmap, (Context) this.f26531a, (OnSaveBitmapCallback) new C9977a(this));
            a[1] = true;
        }

        /* renamed from: a */
        public void mo34878a(Throwable th) {
            boolean[] a = m46388a();
            InstabugSDKLogger.m46624e(ExtraScreenshotHelper.class, th.getMessage(), th);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.screenshot.ExtraScreenshotHelper$c */
    class C9978c implements C12331g<ActivityLifeCycleEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26536b;

        /* renamed from: a */
        final /* synthetic */ ExtraScreenshotHelper f26537a;

        C9978c(ExtraScreenshotHelper extraScreenshotHelper) {
            boolean[] a = m46392a();
            this.f26537a = extraScreenshotHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46392a() {
            boolean[] zArr = f26536b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5020605646171199091L, "com/instabug/library/screenshot/ExtraScreenshotHelper$3", 6);
            f26536b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35584a(ActivityLifeCycleEvent activityLifeCycleEvent) {
            boolean[] a = m46392a();
            int i = C9979d.f26538a[activityLifeCycleEvent.ordinal()];
            if (i == 1) {
                ExtraScreenshotHelper.access$300(this.f26537a);
                a[2] = true;
            } else if (i != 2) {
                a[1] = true;
            } else {
                ExtraScreenshotHelper.access$400(this.f26537a);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46392a();
            mo35584a((ActivityLifeCycleEvent) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.screenshot.ExtraScreenshotHelper$d */
    static /* synthetic */ class C9979d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26538a = new int[ActivityLifeCycleEvent.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26539b;

        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001f */
        static {
            /*
                boolean[] r0 = m46395a()
                com.instabug.library.tracking.ActivityLifeCycleEvent[] r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26538a = r1
                r1 = 0
                r2 = 2
                r3 = 1
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                int[] r1 = f26538a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                r0[r3] = r3
                goto L_0x0021
            L_0x001f:
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0021:
                int[] r1 = f26538a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x002f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002f }
                r1 = 3
                r0[r1] = r3
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r3
            L_0x0032:
                r1 = 5
                r0[r1] = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.screenshot.ExtraScreenshotHelper.C9979d.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46395a() {
            boolean[] zArr = f26539b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-307474600288276223L, "com/instabug/library/screenshot/ExtraScreenshotHelper$4", 6);
            f26539b = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-423242149590307257L, "com/instabug/library/screenshot/ExtraScreenshotHelper", 57);
        $jacocoData = a;
        return a;
    }

    public ExtraScreenshotHelper() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    static /* synthetic */ void access$000(ExtraScreenshotHelper extraScreenshotHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        extraScreenshotHelper.hide();
        $jacocoInit[52] = true;
    }

    static /* synthetic */ OnCaptureListener access$100(ExtraScreenshotHelper extraScreenshotHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        OnCaptureListener onCaptureListener2 = extraScreenshotHelper.onCaptureListener;
        $jacocoInit[53] = true;
        return onCaptureListener2;
    }

    static /* synthetic */ void access$200(ExtraScreenshotHelper extraScreenshotHelper, Activity activity, OnCaptureListener onCaptureListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        extraScreenshotHelper.captureExtraScreenshot(activity, onCaptureListener2);
        $jacocoInit[54] = true;
    }

    static /* synthetic */ void access$300(ExtraScreenshotHelper extraScreenshotHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        extraScreenshotHelper.handleCurrentActivityResumeEvent();
        $jacocoInit[55] = true;
    }

    static /* synthetic */ void access$400(ExtraScreenshotHelper extraScreenshotHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        extraScreenshotHelper.handleCurrentActivityPauseEvent();
        $jacocoInit[56] = true;
    }

    private void captureExtraScreenshot(Activity activity, OnCaptureListener onCaptureListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        C9980a.m46396a(activity, (C9984c) new C9976b(this, activity, onCaptureListener2));
        $jacocoInit[35] = true;
    }

    private ImageButton createCaptureButton(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        ImageButton imageButton = new ImageButton(activity);
        $jacocoInit[20] = true;
        imageButton.setId(C9700R.C9704id.instabug_extra_screenshot_button);
        $jacocoInit[21] = true;
        imageButton.setScaleType(ScaleType.CENTER);
        int i = C9700R.C9703drawable.instabug_bg_white_oval;
        $jacocoInit[22] = true;
        Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(C0841b.m4928c(activity, i));
        $jacocoInit[23] = true;
        imageButton.setBackgroundDrawable(primaryColorTintedDrawable);
        $jacocoInit[24] = true;
        imageButton.setImageDrawable(C0242a.m1109c(activity, C9700R.C9703drawable.ib_ic_core_screenshot));
        $jacocoInit[25] = true;
        return imageButton;
    }

    private LayoutParams createCaptureButtonContainer(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        LayoutParams layoutParams = new LayoutParams(-2, -2, 81);
        $jacocoInit[26] = true;
        layoutParams.setMargins(0, 0, 0, 20);
        $jacocoInit[27] = true;
        Resources resources = activity.getResources();
        if (VERSION.SDK_INT < 21) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            if (!ScreenUtility.hasNavBar(resources)) {
                $jacocoInit[30] = true;
            } else if (ScreenUtility.isLandscape(activity)) {
                $jacocoInit[31] = true;
            } else {
                $jacocoInit[32] = true;
                layoutParams.bottomMargin += ScreenUtility.getNavigationBarHeight(resources);
                $jacocoInit[33] = true;
            }
        }
        $jacocoInit[34] = true;
        return layoutParams;
    }

    private void handleCurrentActivityPauseEvent() {
        boolean[] $jacocoInit = $jacocoInit();
        hide();
        $jacocoInit[51] = true;
    }

    private void handleCurrentActivityResumeEvent() {
        boolean[] $jacocoInit = $jacocoInit();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            $jacocoInit[47] = true;
            show(currentActivity);
            $jacocoInit[48] = true;
        } else {
            InstabugSDKLogger.m46626v(ExtraScreenshotHelper.class, "current activity equal null");
            $jacocoInit[49] = true;
        }
        $jacocoInit[50] = true;
    }

    private void hide() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.isCaptureButtonShown) {
            $jacocoInit[36] = true;
        } else {
            ImageButton imageButton = this.captureButton;
            if (imageButton == null) {
                $jacocoInit[37] = true;
            } else if (imageButton.getParent() == null) {
                $jacocoInit[38] = true;
            } else {
                ImageButton imageButton2 = this.captureButton;
                $jacocoInit[39] = true;
                if (!(imageButton2.getParent() instanceof ViewGroup)) {
                    $jacocoInit[40] = true;
                } else {
                    $jacocoInit[41] = true;
                    ViewGroup viewGroup = (ViewGroup) this.captureButton.getParent();
                    $jacocoInit[42] = true;
                    viewGroup.removeView(this.captureButton);
                    this.isCaptureButtonShown = false;
                    $jacocoInit[43] = true;
                }
            }
        }
        $jacocoInit[44] = true;
    }

    private void show(@C0193h0 Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.isCaptureButtonShown) {
            $jacocoInit[12] = true;
            InstabugSDKLogger.m46626v(this, "bar already shown");
            $jacocoInit[13] = true;
            return;
        }
        this.captureButton = createCaptureButton(activity);
        $jacocoInit[14] = true;
        C0962e0.m5472b((View) this.captureButton, (float) ViewUtils.convertDpToPx(activity, 5.0f));
        $jacocoInit[15] = true;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ImageButton imageButton = this.captureButton;
        $jacocoInit[16] = true;
        LayoutParams createCaptureButtonContainer = createCaptureButtonContainer(activity);
        $jacocoInit[17] = true;
        viewGroup.addView(imageButton, createCaptureButtonContainer);
        this.isCaptureButtonShown = true;
        $jacocoInit[18] = true;
        this.captureButton.setOnClickListener(new C9975a(this, activity));
        $jacocoInit[19] = true;
    }

    private void subscribeToCurranActivityLifeCycle() {
        boolean[] $jacocoInit = $jacocoInit();
        CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
        C9978c cVar = new C9978c(this);
        $jacocoInit[45] = true;
        this.currentActivityLifeCycleDisposable = instance.subscribe(cVar);
        $jacocoInit[46] = true;
    }

    public void init(OnCaptureListener onCaptureListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.onCaptureListener = onCaptureListener2;
        $jacocoInit[1] = true;
        subscribeToCurranActivityLifeCycle();
        $jacocoInit[2] = true;
        InvocationManager.getInstance().switchOffInvocation();
        $jacocoInit[3] = true;
        PresentationManager.getInstance().setInInstabugContext(true);
        $jacocoInit[4] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        this.captureButton = null;
        this.onCaptureListener = null;
        C12314c cVar = this.currentActivityLifeCycleDisposable;
        if (cVar == null) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            if (cVar.mo41878d()) {
                $jacocoInit[7] = true;
            } else {
                $jacocoInit[8] = true;
                this.currentActivityLifeCycleDisposable.dispose();
                $jacocoInit[9] = true;
            }
        }
        PresentationManager.getInstance().setInInstabugContext(false);
        $jacocoInit[10] = true;
        InvocationManager.getInstance().switchOnInvocation();
        $jacocoInit[11] = true;
    }
}
