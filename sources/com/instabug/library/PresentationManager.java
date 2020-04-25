package com.instabug.library;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class PresentationManager {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static PresentationManager INSTANCE;
    WeakReference<Activity> currentActivity;
    private boolean isInInstabugContext = false;
    private boolean isNotificationShowing = false;
    private String lastRunnableName;
    ArrayList<Runnable> screensList;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3875495396617205958L, "com/instabug/library/PresentationManager", 40);
        $jacocoData = a;
        return a;
    }

    private PresentationManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.screensList = new ArrayList<>();
        $jacocoInit[1] = true;
    }

    public static PresentationManager getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        PresentationManager presentationManager = INSTANCE;
        if (presentationManager != null) {
            $jacocoInit[2] = true;
        } else {
            presentationManager = new PresentationManager();
            INSTANCE = presentationManager;
            $jacocoInit[3] = true;
        }
        $jacocoInit[4] = true;
        return presentationManager;
    }

    private boolean hasPreviousRunnable(ArrayList<Runnable> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        Iterator it = arrayList.iterator();
        $jacocoInit[20] = true;
        while (it.hasNext()) {
            Runnable runnable = (Runnable) it.next();
            $jacocoInit[21] = true;
            if (runnable.getClass().getName().equals(this.lastRunnableName)) {
                $jacocoInit[22] = true;
                return true;
            }
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
        return false;
    }

    public String getCurrentActivityName() {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null) {
            $jacocoInit[32] = true;
        } else {
            $jacocoInit[33] = true;
            Activity activity = (Activity) weakReference.get();
            if (activity == null) {
                $jacocoInit[34] = true;
            } else {
                $jacocoInit[35] = true;
                String localClassName = activity.getLocalClassName();
                $jacocoInit[36] = true;
                return localClassName;
            }
        }
        $jacocoInit[37] = true;
        return "";
    }

    public void notifyActivityChanged() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.screensList.size() <= 0) {
            $jacocoInit[25] = true;
        } else {
            $jacocoInit[26] = true;
            this.lastRunnableName = ((Runnable) this.screensList.get(0)).getClass().getName();
            $jacocoInit[27] = true;
            ((Runnable) this.screensList.get(0)).run();
            $jacocoInit[28] = true;
            this.screensList.remove(0);
            $jacocoInit[29] = true;
        }
        $jacocoInit[30] = true;
    }

    public void setCurrentActivity(Activity activity) {
        boolean[] $jacocoInit = $jacocoInit();
        this.currentActivity = new WeakReference<>(activity);
        $jacocoInit[31] = true;
    }

    public void setInInstabugContext(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isInInstabugContext = z;
        $jacocoInit[39] = true;
    }

    public void setNotificationShowing(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isNotificationShowing = z;
        $jacocoInit[38] = true;
    }

    public void show(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        if (runnable == null) {
            $jacocoInit[5] = true;
        } else if (hasPreviousRunnable(this.screensList)) {
            $jacocoInit[6] = true;
        } else {
            this.screensList.add(runnable);
            $jacocoInit[8] = true;
            if (this.screensList.size() != 1) {
                $jacocoInit[9] = true;
            } else {
                WeakReference<Activity> weakReference = this.currentActivity;
                if (weakReference == null) {
                    $jacocoInit[10] = true;
                } else {
                    $jacocoInit[11] = true;
                    if (weakReference.get() == null) {
                        $jacocoInit[12] = true;
                    } else {
                        WeakReference<Activity> weakReference2 = this.currentActivity;
                        $jacocoInit[13] = true;
                        if (weakReference2.get() instanceof _InstabugActivity) {
                            $jacocoInit[14] = true;
                        } else if (this.isNotificationShowing) {
                            $jacocoInit[15] = true;
                        } else if (this.isInInstabugContext) {
                            $jacocoInit[16] = true;
                        } else {
                            $jacocoInit[17] = true;
                            notifyActivityChanged();
                            $jacocoInit[18] = true;
                        }
                    }
                }
            }
            $jacocoInit[19] = true;
            return;
        }
        $jacocoInit[7] = true;
    }
}
