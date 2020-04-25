package com.instabug.library;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import com.instabug.library.tracking.C9992b;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public final class InstabugTrackingDelegate {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8938667089419659426L, "com/instabug/library/InstabugTrackingDelegate", 21);
        $jacocoData = a;
        return a;
    }

    public InstabugTrackingDelegate() {
        $jacocoInit()[0] = true;
    }

    public static void notifyActivityGotTouchEvent(MotionEvent motionEvent, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        C9992b.m46529a(motionEvent, activity);
        $jacocoInit[2] = true;
    }

    public static void notifyApplicationCreated(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onApplicationCreated(application);
        $jacocoInit[1] = true;
    }

    public static void notifyFragmentAttached(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentAttached(fragment, activity);
        $jacocoInit[3] = true;
    }

    public static void notifyFragmentDetached(Activity activity, Fragment fragment) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentDetached(fragment, activity);
        $jacocoInit[10] = true;
    }

    public static void notifyFragmentPaused(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentPaused(fragment, activity);
        $jacocoInit[8] = true;
    }

    public static void notifyFragmentResumed(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentResumed(fragment, activity);
        $jacocoInit[7] = true;
    }

    public static void notifyFragmentStarted(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentStarted(fragment, activity);
        $jacocoInit[6] = true;
    }

    public static void notifyFragmentStopped(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentStopped(fragment, activity);
        $jacocoInit[9] = true;
    }

    public static void notifyFragmentViewCreated(View view, Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentViewCreated(fragment, activity);
        $jacocoInit[4] = true;
        C9992b.m46530a(view, activity);
        $jacocoInit[5] = true;
    }

    public static void notifyFragmentVisibilityChanged(boolean z, Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentVisibilityChanged(z, fragment, activity);
        $jacocoInit[11] = true;
    }

    public static void notifyFragmentAttached(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentAttached(fragment, activity);
        $jacocoInit[12] = true;
    }

    public static void notifyFragmentDetached(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentDetached(fragment, activity);
        $jacocoInit[19] = true;
    }

    public static void notifyFragmentPaused(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentPaused(fragment, activity);
        $jacocoInit[17] = true;
    }

    public static void notifyFragmentResumed(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentResumed(fragment, activity);
        $jacocoInit[16] = true;
    }

    public static void notifyFragmentStarted(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentStarted(fragment, activity);
        $jacocoInit[15] = true;
    }

    public static void notifyFragmentStopped(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentStopped(fragment, activity);
        $jacocoInit[18] = true;
    }

    public static void notifyFragmentVisibilityChanged(boolean z, androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentVisibilityChanged(z, fragment, activity);
        $jacocoInit[20] = true;
    }

    public static void notifyFragmentViewCreated(View view, androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate.getInstance().onFragmentViewCreated(fragment, activity);
        $jacocoInit[13] = true;
        C9992b.m46530a(view, activity);
        $jacocoInit[14] = true;
    }
}
