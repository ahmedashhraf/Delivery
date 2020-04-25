package com.instabug.library.tracking;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.view.MotionEvent;
import androidx.annotation.C0195i0;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.C10040d;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugInternalTrackingDelegate {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InstabugInternalTrackingDelegate INSTANCE;
    private Activity activityInstance;
    private WeakReference<Activity> currentActivity;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5344666374173614127L, "com/instabug/library/tracking/InstabugInternalTrackingDelegate", 320);
        $jacocoData = a;
        return a;
    }

    private InstabugInternalTrackingDelegate(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        if (application == null) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            registerActivityLifecycleListener(application);
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }

    public static InstabugInternalTrackingDelegate getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugInternalTrackingDelegate instabugInternalTrackingDelegate = INSTANCE;
        $jacocoInit[4] = true;
        return instabugInternalTrackingDelegate;
    }

    public static void init(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[0] = true;
        } else {
            $jacocoInit[1] = true;
            INSTANCE = new InstabugInternalTrackingDelegate(application);
            $jacocoInit[2] = true;
        }
        $jacocoInit[3] = true;
    }

    private boolean isNotInstabugActivity(Activity activity) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (!(activity instanceof _InstabugActivity)) {
            $jacocoInit[317] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[318] = true;
        }
        $jacocoInit[319] = true;
        return z;
    }

    private boolean isReproStepsEnable() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (C9780c.m45631b().mo34869b(Feature.REPRO_STEPS) == State.ENABLED) {
            $jacocoInit[314] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[315] = true;
        }
        $jacocoInit[316] = true;
        return z;
    }

    private boolean isUserTrackingStepsEnable() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (C9780c.m45631b().mo34869b(Feature.TRACK_USER_STEPS) == State.ENABLED) {
            $jacocoInit[311] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[312] = true;
        }
        $jacocoInit[313] = true;
        return z;
    }

    private void registerActivityLifecycleListener(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "Registering activity lifecycle listener");
        $jacocoInit[307] = true;
        C9991a aVar = new C9991a();
        $jacocoInit[308] = true;
        application.registerActivityLifecycleCallbacks(aVar);
        $jacocoInit[309] = true;
        application.registerComponentCallbacks(aVar);
        $jacocoInit[310] = true;
    }

    public Activity getCurrentActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        Activity activity = this.activityInstance;
        if (activity != null) {
            $jacocoInit[294] = true;
            return activity;
        }
        $jacocoInit[295] = true;
        return null;
    }

    @C0195i0
    public Activity getTargetActivity() {
        Activity activity;
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[296] = true;
        Activity activity2 = this.activityInstance;
        if (activity2 == null) {
            $jacocoInit[297] = true;
        } else if (activity2.getParent() == null) {
            $jacocoInit[298] = true;
        } else {
            $jacocoInit[299] = true;
            activity = this.activityInstance.getParent();
            $jacocoInit[300] = true;
            while (activity.getParent() != null) {
                $jacocoInit[302] = true;
                activity = activity.getParent();
                $jacocoInit[303] = true;
            }
            $jacocoInit[301] = true;
            $jacocoInit[306] = true;
            return activity;
        }
        activity = this.activityInstance;
        if (activity == null) {
            $jacocoInit[304] = true;
            activity = null;
        } else {
            $jacocoInit[305] = true;
        }
        $jacocoInit[306] = true;
        return activity;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityCreatedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[14] = true;
        } else {
            $jacocoInit[15] = true;
            if (!isUserTrackingStepsEnable()) {
                $jacocoInit[16] = true;
            } else {
                $jacocoInit[17] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getClass().getSimpleName());
                sb.append(" created");
                InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                $jacocoInit[18] = true;
                C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_CREATED);
                $jacocoInit[19] = true;
            }
            if (!isReproStepsEnable()) {
                $jacocoInit[20] = true;
            } else {
                $jacocoInit[21] = true;
                C10040d b = C10040d.m46740b();
                C9954a aVar = C9954a.ACTIVITY_CREATED;
                $jacocoInit[22] = true;
                String simpleName = activity.getClass().getSimpleName();
                $jacocoInit[23] = true;
                String name = activity.getClass().getName();
                $jacocoInit[24] = true;
                b.mo36088a(aVar, simpleName, name);
                $jacocoInit[25] = true;
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.CREATED);
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityDestroyedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[87] = true;
        } else {
            $jacocoInit[88] = true;
            if (!isUserTrackingStepsEnable()) {
                $jacocoInit[89] = true;
            } else {
                $jacocoInit[90] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getClass().getSimpleName());
                sb.append(" destroyed");
                InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                $jacocoInit[91] = true;
                C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_DESTROYED);
                $jacocoInit[92] = true;
            }
            if (!isReproStepsEnable()) {
                $jacocoInit[93] = true;
            } else {
                $jacocoInit[94] = true;
                C10040d b = C10040d.m46740b();
                C9954a aVar = C9954a.ACTIVITY_DESTROYED;
                $jacocoInit[95] = true;
                String simpleName = activity.getClass().getSimpleName();
                $jacocoInit[96] = true;
                String name = activity.getClass().getName();
                $jacocoInit[97] = true;
                b.mo36088a(aVar, simpleName, name);
                $jacocoInit[98] = true;
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.DESTROYED);
            $jacocoInit[99] = true;
        }
        $jacocoInit[100] = true;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityPausedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[57] = true;
        } else {
            Activity activity2 = this.activityInstance;
            if (activity2 == null) {
                $jacocoInit[58] = true;
                InstabugSDKLogger.m46627w(this, "No activity was set earlier than this call. Doing nothing");
                $jacocoInit[59] = true;
                return;
            } else if (!activity.equals(activity2)) {
                $jacocoInit[60] = true;
                InstabugSDKLogger.m46627w(this, "You're trying to pause an activity that is not the current activity! Please make sure you're calling onCurrentActivityPaused and onCurrentActivityResumed on every activity");
                $jacocoInit[61] = true;
                return;
            } else {
                if (!isUserTrackingStepsEnable()) {
                    $jacocoInit[62] = true;
                } else {
                    $jacocoInit[63] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(activity.getClass().getSimpleName());
                    sb.append(" paused");
                    InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                    $jacocoInit[64] = true;
                    C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_PAUSED);
                    $jacocoInit[65] = true;
                }
                if (!isReproStepsEnable()) {
                    $jacocoInit[66] = true;
                } else {
                    $jacocoInit[67] = true;
                    C10040d b = C10040d.m46740b();
                    C9954a aVar = C9954a.ACTIVITY_PAUSED;
                    $jacocoInit[68] = true;
                    String simpleName = activity.getClass().getSimpleName();
                    $jacocoInit[69] = true;
                    String name = activity.getClass().getName();
                    $jacocoInit[70] = true;
                    b.mo36088a(aVar, simpleName, name);
                    $jacocoInit[71] = true;
                }
                CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.PAUSED);
                $jacocoInit[72] = true;
            }
        }
        $jacocoInit[73] = true;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityResumedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[41] = true;
        } else {
            $jacocoInit[42] = true;
            this.currentActivity = new WeakReference<>(activity);
            $jacocoInit[43] = true;
            this.activityInstance = (Activity) this.currentActivity.get();
            $jacocoInit[44] = true;
            if (!isUserTrackingStepsEnable()) {
                $jacocoInit[45] = true;
            } else {
                $jacocoInit[46] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getClass().getSimpleName());
                sb.append(" resumed");
                InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                $jacocoInit[47] = true;
                C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_RESUMED);
                $jacocoInit[48] = true;
            }
            if (!isReproStepsEnable()) {
                $jacocoInit[49] = true;
            } else {
                $jacocoInit[50] = true;
                C10040d b = C10040d.m46740b();
                C9954a aVar = C9954a.ACTIVITY_RESUMED;
                $jacocoInit[51] = true;
                String simpleName = activity.getClass().getSimpleName();
                $jacocoInit[52] = true;
                String name = activity.getClass().getName();
                $jacocoInit[53] = true;
                b.mo36088a(aVar, simpleName, name);
                $jacocoInit[54] = true;
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.RESUMED);
            $jacocoInit[55] = true;
        }
        $jacocoInit[56] = true;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityStartedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            if (!isUserTrackingStepsEnable()) {
                $jacocoInit[30] = true;
            } else {
                $jacocoInit[31] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getClass().getSimpleName());
                sb.append(" started");
                InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                $jacocoInit[32] = true;
                C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_STARTED);
                $jacocoInit[33] = true;
            }
            if (!isReproStepsEnable()) {
                $jacocoInit[34] = true;
            } else {
                $jacocoInit[35] = true;
                C10040d b = C10040d.m46740b();
                C9954a aVar = C9954a.ACTIVITY_STARTED;
                $jacocoInit[36] = true;
                String simpleName = activity.getClass().getSimpleName();
                $jacocoInit[37] = true;
                String name = activity.getClass().getName();
                $jacocoInit[38] = true;
                b.mo36088a(aVar, simpleName, name);
                $jacocoInit[39] = true;
            }
        }
        CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.STARTED);
        $jacocoInit[40] = true;
    }

    /* access modifiers changed from: 0000 */
    public void handleActivityStoppedEvent(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isNotInstabugActivity(activity)) {
            $jacocoInit[74] = true;
        } else {
            $jacocoInit[75] = true;
            if (!isUserTrackingStepsEnable()) {
                $jacocoInit[76] = true;
            } else {
                $jacocoInit[77] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getClass().getSimpleName());
                sb.append(" stopped");
                InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
                $jacocoInit[78] = true;
                C9995d.m46539c().mo35846a(activity.getClass().getName(), C9954a.ACTIVITY_STOPPED);
                $jacocoInit[79] = true;
            }
            if (!isReproStepsEnable()) {
                $jacocoInit[80] = true;
            } else {
                $jacocoInit[81] = true;
                C10040d b = C10040d.m46740b();
                C9954a aVar = C9954a.ACTIVITY_STOPPED;
                $jacocoInit[82] = true;
                String simpleName = activity.getClass().getSimpleName();
                $jacocoInit[83] = true;
                String name = activity.getClass().getName();
                $jacocoInit[84] = true;
                b.mo36088a(aVar, simpleName, name);
                $jacocoInit[85] = true;
            }
        }
        CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.STOPPED);
        $jacocoInit[86] = true;
    }

    public void onApplicationCreated(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(application.getClass().getSimpleName());
            sb.append(" created");
            InstabugSDKLogger.m46626v(InstabugInternalTrackingDelegate.class, sb.toString());
            $jacocoInit[11] = true;
            C9995d.m46539c().mo35846a(application.getClass().getName(), C9954a.APPLICATION_CREATED);
            $jacocoInit[12] = true;
        }
        $jacocoInit[13] = true;
    }

    public void onFragmentAttached(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[101] = true;
        } else {
            $jacocoInit[102] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[103] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_ATTACHED;
            $jacocoInit[104] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[105] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[106] = true;
        } else {
            $jacocoInit[107] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_ATTACHED;
            $jacocoInit[108] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[109] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[110] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[111] = true;
        }
        $jacocoInit[112] = true;
    }

    public void onFragmentDetached(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[173] = true;
        } else {
            $jacocoInit[174] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[175] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_DETACHED;
            $jacocoInit[176] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[177] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[178] = true;
        } else {
            $jacocoInit[179] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_DETACHED;
            $jacocoInit[180] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[181] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[182] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[183] = true;
        }
        $jacocoInit[184] = true;
    }

    public void onFragmentPaused(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[149] = true;
        } else {
            $jacocoInit[150] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[151] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_PAUSED;
            $jacocoInit[152] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[153] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[154] = true;
        } else {
            $jacocoInit[155] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_PAUSED;
            $jacocoInit[156] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[157] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[158] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[159] = true;
        }
        $jacocoInit[160] = true;
    }

    public void onFragmentResumed(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[137] = true;
        } else {
            $jacocoInit[138] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[139] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_RESUMED;
            $jacocoInit[140] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[141] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[142] = true;
        } else {
            $jacocoInit[143] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_RESUMED;
            $jacocoInit[144] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[145] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[146] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[147] = true;
        }
        $jacocoInit[148] = true;
    }

    public void onFragmentStarted(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[125] = true;
        } else {
            $jacocoInit[126] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[127] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_STARTED;
            $jacocoInit[128] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[129] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[130] = true;
        } else {
            $jacocoInit[131] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_STARTED;
            $jacocoInit[132] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[133] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[134] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[135] = true;
        }
        $jacocoInit[136] = true;
    }

    public void onFragmentStopped(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[161] = true;
        } else {
            $jacocoInit[162] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[163] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_STOPPED;
            $jacocoInit[164] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[165] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[166] = true;
        } else {
            $jacocoInit[167] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_STOPPED;
            $jacocoInit[168] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[169] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[170] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[171] = true;
        }
        $jacocoInit[172] = true;
    }

    public void onFragmentViewCreated(Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[113] = true;
        } else {
            $jacocoInit[114] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[115] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_VIEW_CREATED;
            $jacocoInit[116] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[117] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[118] = true;
        } else {
            $jacocoInit[119] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_VIEW_CREATED;
            $jacocoInit[120] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[121] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[122] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[123] = true;
        }
        $jacocoInit[124] = true;
    }

    public void onFragmentVisibilityChanged(boolean z, Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[269] = true;
        } else {
            $jacocoInit[270] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[271] = true;
            String name2 = activity.getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment visibility: ");
            sb.append(z);
            String sb2 = sb.toString();
            C9954a aVar = C9954a.FRAGMENT_VISIBILITY_CHANGED;
            $jacocoInit[272] = true;
            c.mo35848a(name, name2, sb2, aVar);
            $jacocoInit[273] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[274] = true;
        } else {
            $jacocoInit[275] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_VISIBILITY_CHANGED;
            $jacocoInit[276] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[277] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[278] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[279] = true;
        }
        $jacocoInit[280] = true;
    }

    public void trackTouchEvent(MotionEvent motionEvent, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        C9994c.m46535a().mo35843a(activity, motionEvent);
        $jacocoInit[293] = true;
    }

    public void onFragmentAttached(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[185] = true;
        } else {
            $jacocoInit[186] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[187] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_ATTACHED;
            $jacocoInit[188] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[189] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[190] = true;
        } else {
            $jacocoInit[191] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_ATTACHED;
            $jacocoInit[192] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[193] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[194] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[195] = true;
        }
        $jacocoInit[196] = true;
    }

    public void onFragmentDetached(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[257] = true;
        } else {
            $jacocoInit[258] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[259] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_DETACHED;
            $jacocoInit[260] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[261] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[262] = true;
        } else {
            $jacocoInit[263] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_DETACHED;
            $jacocoInit[264] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[265] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[266] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[267] = true;
        }
        $jacocoInit[268] = true;
    }

    public void onFragmentPaused(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[233] = true;
        } else {
            $jacocoInit[234] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[235] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_PAUSED;
            $jacocoInit[236] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[237] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[238] = true;
        } else {
            $jacocoInit[239] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_PAUSED;
            $jacocoInit[240] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[241] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[242] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[243] = true;
        }
        $jacocoInit[244] = true;
    }

    public void onFragmentResumed(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[221] = true;
        } else {
            $jacocoInit[222] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[223] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_RESUMED;
            $jacocoInit[224] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[225] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[226] = true;
        } else {
            $jacocoInit[227] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_RESUMED;
            $jacocoInit[228] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[229] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[230] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[231] = true;
        }
        $jacocoInit[232] = true;
    }

    public void onFragmentStarted(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[209] = true;
        } else {
            $jacocoInit[210] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[211] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_STARTED;
            $jacocoInit[212] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[213] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[214] = true;
        } else {
            $jacocoInit[215] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_STARTED;
            $jacocoInit[216] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[217] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[218] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[219] = true;
        }
        $jacocoInit[220] = true;
    }

    public void onFragmentStopped(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[245] = true;
        } else {
            $jacocoInit[246] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[247] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_STOPPED;
            $jacocoInit[248] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[249] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[250] = true;
        } else {
            $jacocoInit[251] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_STOPPED;
            $jacocoInit[252] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[253] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[254] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[255] = true;
        }
        $jacocoInit[256] = true;
    }

    public void onFragmentViewCreated(androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[197] = true;
        } else {
            $jacocoInit[198] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[199] = true;
            String name2 = activity.getClass().getName();
            C9954a aVar = C9954a.FRAGMENT_VIEW_CREATED;
            $jacocoInit[200] = true;
            c.mo35847a(name, name2, aVar);
            $jacocoInit[201] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[202] = true;
        } else {
            $jacocoInit[203] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_VIEW_CREATED;
            $jacocoInit[204] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[205] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[206] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[207] = true;
        }
        $jacocoInit[208] = true;
    }

    public void onFragmentVisibilityChanged(boolean z, androidx.fragment.app.Fragment fragment, Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isUserTrackingStepsEnable()) {
            $jacocoInit[281] = true;
        } else {
            $jacocoInit[282] = true;
            C9995d c = C9995d.m46539c();
            String name = fragment.getClass().getName();
            $jacocoInit[283] = true;
            String name2 = activity.getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment visibility: ");
            sb.append(z);
            String sb2 = sb.toString();
            C9954a aVar = C9954a.FRAGMENT_VISIBILITY_CHANGED;
            $jacocoInit[284] = true;
            c.mo35848a(name, name2, sb2, aVar);
            $jacocoInit[285] = true;
        }
        if (!isReproStepsEnable()) {
            $jacocoInit[286] = true;
        } else {
            $jacocoInit[287] = true;
            C10040d b = C10040d.m46740b();
            C9954a aVar2 = C9954a.FRAGMENT_VISIBILITY_CHANGED;
            $jacocoInit[288] = true;
            String simpleName = fragment.getClass().getSimpleName();
            $jacocoInit[289] = true;
            String name3 = fragment.getClass().getName();
            $jacocoInit[290] = true;
            b.mo36088a(aVar2, simpleName, name3);
            $jacocoInit[291] = true;
        }
        $jacocoInit[292] = true;
    }
}
