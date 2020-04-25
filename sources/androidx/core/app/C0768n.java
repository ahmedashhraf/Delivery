package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.app.n */
/* compiled from: NavUtils */
public final class C0768n {

    /* renamed from: a */
    private static final String f3483a = "NavUtils";

    /* renamed from: b */
    public static final String f3484b = "android.support.PARENT_ACTIVITY";

    private C0768n() {
    }

    /* renamed from: a */
    public static void m4359a(@C0193h0 Activity activity, @C0193h0 Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: b */
    public static boolean m4362b(@C0193h0 Activity activity, @C0193h0 Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: c */
    public static void m4363c(@C0193h0 Activity activity) {
        Intent a = m4356a(activity);
        if (a != null) {
            m4359a(activity, a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Activity ");
        sb.append(activity.getClass().getSimpleName());
        sb.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        throw new IllegalArgumentException(sb.toString());
    }

    @C0195i0
    /* renamed from: b */
    public static String m4360b(@C0193h0 Activity activity) {
        try {
            return m4361b((Context) activity, activity.getComponentName());
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C0195i0
    /* renamed from: a */
    public static Intent m4356a(@C0193h0 Activity activity) {
        Intent intent;
        if (VERSION.SDK_INT >= 16) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        String b = m4360b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            if (m4361b((Context) activity, componentName) == null) {
                intent = Intent.makeMainActivity(componentName);
            } else {
                intent = new Intent().setComponent(componentName);
            }
            return intent;
        } catch (NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(b);
            sb.append("' in manifest");
            sb.toString();
            return null;
        }
    }

    @C0195i0
    /* renamed from: b */
    public static String m4361b(@C0193h0 Context context, @C0193h0 ComponentName componentName) throws NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        int i = VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        if (VERSION.SDK_INT >= 16) {
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString(f3484b);
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string = sb.toString();
        }
        return string;
    }

    @C0195i0
    /* renamed from: a */
    public static Intent m4358a(@C0193h0 Context context, @C0193h0 Class<?> cls) throws NameNotFoundException {
        Intent intent;
        String b = m4361b(context, new ComponentName(context, cls));
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, b);
        if (m4361b(context, componentName) == null) {
            intent = Intent.makeMainActivity(componentName);
        } else {
            intent = new Intent().setComponent(componentName);
        }
        return intent;
    }

    @C0195i0
    /* renamed from: a */
    public static Intent m4357a(@C0193h0 Context context, @C0193h0 ComponentName componentName) throws NameNotFoundException {
        Intent intent;
        String b = m4361b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (m4361b(context, componentName2) == null) {
            intent = Intent.makeMainActivity(componentName2);
        } else {
            intent = new Intent().setComponent(componentName2);
        }
        return intent;
    }
}
