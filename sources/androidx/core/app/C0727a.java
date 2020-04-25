package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0225w;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0815z.C0816a;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0956d;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.a */
/* compiled from: ActivityCompat */
public class C0727a extends C0841b {

    /* renamed from: d */
    private static C0730c f3389d;

    /* renamed from: androidx.core.app.a$a */
    /* compiled from: ActivityCompat */
    static class C0728a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ int f3390N;

        /* renamed from: a */
        final /* synthetic */ String[] f3391a;

        /* renamed from: b */
        final /* synthetic */ Activity f3392b;

        C0728a(String[] strArr, Activity activity, int i) {
            this.f3391a = strArr;
            this.f3392b = activity;
            this.f3390N = i;
        }

        public void run() {
            int[] iArr = new int[this.f3391a.length];
            PackageManager packageManager = this.f3392b.getPackageManager();
            String packageName = this.f3392b.getPackageName();
            int length = this.f3391a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f3391a[i], packageName);
            }
            ((C0729b) this.f3392b).onRequestPermissionsResult(this.f3390N, this.f3391a, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* compiled from: ActivityCompat */
    public interface C0729b {
        void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0730c {
        /* renamed from: a */
        boolean mo4062a(@C0193h0 Activity activity, @C0237z(from = 0) int i, int i2, @C0195i0 Intent intent);

        /* renamed from: a */
        boolean mo4063a(@C0193h0 Activity activity, @C0193h0 String[] strArr, @C0237z(from = 0) int i);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.a$d */
    /* compiled from: ActivityCompat */
    public interface C0731d {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.app.a$e */
    /* compiled from: ActivityCompat */
    private static class C0732e extends SharedElementCallback {

        /* renamed from: a */
        private final C0815z f3393a;

        /* renamed from: androidx.core.app.a$e$a */
        /* compiled from: ActivityCompat */
        class C0733a implements C0816a {

            /* renamed from: a */
            final /* synthetic */ OnSharedElementsReadyListener f3394a;

            C0733a(OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f3394a = onSharedElementsReadyListener;
            }

            /* renamed from: a */
            public void mo4072a() {
                this.f3394a.onSharedElementsReady();
            }
        }

        C0732e(C0815z zVar) {
            this.f3393a = zVar;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3393a.mo4455a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3393a.mo4456a(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3393a.mo4460a(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f3393a.mo4457a(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3393a.mo4459a(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3393a.mo4461b(list, list2, list3);
        }

        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3393a.mo4458a(list, list2, (C0816a) new C0733a(onSharedElementsReadyListener));
        }
    }

    protected C0727a() {
    }

    /* renamed from: a */
    public static void m4244a(@C0195i0 C0730c cVar) {
        f3389d = cVar;
    }

    /* renamed from: b */
    public static void m4246b(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    @C0195i0
    /* renamed from: c */
    public static Uri m4248c(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m4249d(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    /* renamed from: e */
    public static void m4250e(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: f */
    public static void m4251f(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0739d.m4292a(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: g */
    public static void m4252g(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static C0730c m4237a() {
        return f3389d;
    }

    /* renamed from: a */
    public static void m4240a(@C0193h0 Activity activity, @C0193h0 Intent intent, int i, @C0195i0 Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: b */
    public static void m4247b(@C0193h0 Activity activity, @C0195i0 C0815z zVar) {
        if (VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(zVar != null ? new C0732e(zVar) : null);
        }
    }

    /* renamed from: a */
    public static void m4241a(@C0193h0 Activity activity, @C0193h0 IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, @C0195i0 Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m4239a(@C0193h0 Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    @C0193h0
    /* renamed from: a */
    public static <T extends View> T m4236a(@C0193h0 Activity activity, @C0225w int i) {
        if (VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i);
        }
        T findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    /* renamed from: a */
    public static void m4242a(@C0193h0 Activity activity, @C0195i0 C0815z zVar) {
        if (VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(zVar != null ? new C0732e(zVar) : null);
        }
    }

    /* renamed from: a */
    public static void m4243a(@C0193h0 Activity activity, @C0193h0 String[] strArr, @C0237z(from = 0) int i) {
        C0730c cVar = f3389d;
        if (cVar == null || !cVar.mo4063a(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0731d) {
                    ((C0731d) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0729b) {
                new Handler(Looper.getMainLooper()).post(new C0728a(strArr, activity, i));
            }
        }
    }

    /* renamed from: a */
    public static boolean m4245a(@C0193h0 Activity activity, @C0193h0 String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    @C0195i0
    /* renamed from: a */
    public static C0956d m4238a(Activity activity, DragEvent dragEvent) {
        return C0956d.m5387a(activity, dragEvent);
    }
}
