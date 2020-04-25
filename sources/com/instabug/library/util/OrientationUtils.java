package com.instabug.library.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.C0195i0;
import com.instabug.library.Instabug;
import com.instabug.library.settings.SettingsManager;
import java.util.HashSet;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class OrientationUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static HashSet<String> lockedActivities = new HashSet<>();

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5170621756934685059L, "com/instabug/library/util/OrientationUtils", 64);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[63] = true;
    }

    private OrientationUtils() {
        $jacocoInit()[0] = true;
    }

    @C0195i0
    private static Activity getActivity(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (context == null) {
            $jacocoInit[57] = true;
        } else {
            $jacocoInit[58] = true;
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    $jacocoInit[60] = true;
                    return activity;
                }
                context = ((ContextWrapper) context).getBaseContext();
                $jacocoInit[61] = true;
            }
            $jacocoInit[59] = true;
        }
        $jacocoInit[62] = true;
        return null;
    }

    public static int getOrientation(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        switch (i) {
            case -1:
                $jacocoInit[36] = true;
                return -1;
            case 0:
                $jacocoInit[37] = true;
                return 0;
            case 1:
                $jacocoInit[38] = true;
                return 1;
            case 2:
                $jacocoInit[39] = true;
                return 2;
            case 3:
                $jacocoInit[40] = true;
                return 3;
            case 4:
                $jacocoInit[41] = true;
                return 4;
            case 5:
                $jacocoInit[42] = true;
                return 5;
            case 6:
                $jacocoInit[43] = true;
                return 6;
            case 8:
                $jacocoInit[44] = true;
                return 8;
            case 9:
                $jacocoInit[45] = true;
                return 9;
            case 10:
                $jacocoInit[46] = true;
                return 10;
            case 11:
                $jacocoInit[47] = true;
                return 11;
            case 12:
                $jacocoInit[48] = true;
                return 12;
            case 13:
                $jacocoInit[49] = true;
                return 13;
            case 14:
                $jacocoInit[50] = true;
                return 14;
            default:
                $jacocoInit[51] = true;
                return -1;
        }
    }

    public static void handelOrientation(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (SettingsManager.getInstance().getRequestedOrientation() == -2) {
            $jacocoInit[30] = true;
            lockScreenOrientation(context);
            $jacocoInit[31] = true;
        } else {
            Activity activity = getActivity(context);
            if (activity == null) {
                $jacocoInit[32] = true;
            } else {
                $jacocoInit[33] = true;
                activity.setRequestedOrientation(Instabug.getRequestedOrientation());
                $jacocoInit[34] = true;
            }
        }
        $jacocoInit[35] = true;
    }

    public static boolean isInLandscape(Context context) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (context == null) {
            $jacocoInit[52] = true;
        } else if (context.getResources().getConfiguration().orientation != 2) {
            $jacocoInit[53] = true;
        } else {
            $jacocoInit[54] = true;
            z = true;
            $jacocoInit[56] = true;
            return z;
        }
        z = false;
        $jacocoInit[55] = true;
        $jacocoInit[56] = true;
        return z;
    }

    public static void lockScreenOrientation(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Activity activity = getActivity(context);
        if (activity == null) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Locking orientation for activity ");
            sb.append(activity.toString());
            InstabugSDKLogger.m46622d(OrientationUtils.class, sb.toString());
            $jacocoInit[17] = true;
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            $jacocoInit[18] = true;
            int i = activity.getResources().getConfiguration().orientation;
            if (i == 1) {
                if (rotation == 1) {
                    $jacocoInit[20] = true;
                } else if (rotation == 2) {
                    $jacocoInit[21] = true;
                } else {
                    activity.setRequestedOrientation(1);
                    $jacocoInit[23] = true;
                }
                activity.setRequestedOrientation(9);
                $jacocoInit[22] = true;
            } else if (i != 2) {
                $jacocoInit[19] = true;
            } else {
                if (rotation == 0) {
                    $jacocoInit[24] = true;
                } else if (rotation == 1) {
                    $jacocoInit[25] = true;
                } else {
                    activity.setRequestedOrientation(8);
                    $jacocoInit[27] = true;
                }
                activity.setRequestedOrientation(0);
                $jacocoInit[26] = true;
            }
            lockedActivities.add(activity.getClass().getName());
            $jacocoInit[28] = true;
        }
        $jacocoInit[29] = true;
    }

    public static void unlockOrientation(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Activity activity = getActivity(context);
        if (activity == null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            if (!lockedActivities.contains(activity.getClass().getName())) {
                $jacocoInit[3] = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unlocking orientation for activity ");
            sb.append(activity.toString());
            InstabugSDKLogger.m46622d(OrientationUtils.class, sb.toString());
            $jacocoInit[4] = true;
            ComponentName componentName = new ComponentName(activity, activity.getClass());
            $jacocoInit[5] = true;
            PackageManager packageManager = activity.getPackageManager();
            try {
                $jacocoInit[6] = true;
                ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
                $jacocoInit[7] = true;
                activity.setRequestedOrientation(activityInfo.screenOrientation);
                $jacocoInit[8] = true;
            } catch (NameNotFoundException e) {
                $jacocoInit[9] = true;
                e.printStackTrace();
                $jacocoInit[10] = true;
                activity.setRequestedOrientation(-1);
                $jacocoInit[11] = true;
            } catch (Exception unused) {
                $jacocoInit[12] = true;
                activity.setRequestedOrientation(-1);
                $jacocoInit[13] = true;
            }
        }
        $jacocoInit[14] = true;
    }
}
