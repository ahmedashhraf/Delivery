package androidx.core.content.p019g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import androidx.core.content.p019g.C0856d.C0857a;
import androidx.core.content.p019g.C0858e.C0859a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.content.g.f */
/* compiled from: ShortcutManagerCompat */
public class C0860f {
    @C0224v0

    /* renamed from: a */
    static final String f4011a = "com.android.launcher.action.INSTALL_SHORTCUT";
    @C0224v0

    /* renamed from: b */
    static final String f4012b = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: c */
    public static final String f4013c = "android.intent.extra.shortcut.ID";

    /* renamed from: d */
    private static volatile C0858e<?> f4014d;

    /* renamed from: androidx.core.content.g.f$a */
    /* compiled from: ShortcutManagerCompat */
    static class C0861a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ IntentSender f4015a;

        C0861a(IntentSender intentSender) {
            this.f4015a = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.f4015a.sendIntent(context, 0, null, null, null);
            } catch (SendIntentException unused) {
            }
        }
    }

    private C0860f() {
    }

    /* renamed from: a */
    public static boolean m4990a(@C0193h0 Context context, @C0193h0 C0856d dVar, @C0195i0 IntentSender intentSender) {
        if (VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(dVar.mo4514j(), intentSender);
        }
        if (!m4995d(context)) {
            return false;
        }
        Intent a = dVar.mo4505a(new Intent(f4011a));
        if (intentSender == null) {
            context.sendBroadcast(a);
            return true;
        }
        context.sendOrderedBroadcast(a, null, new C0861a(intentSender), null, -1, null, null);
        return true;
    }

    /* renamed from: b */
    public static boolean m4992b(@C0193h0 Context context, @C0193h0 List<C0856d> list) {
        if (VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (C0856d j : list) {
                arrayList.add(j.mo4514j());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        m4993c(context).mo4528a(list);
        return true;
    }

    /* renamed from: c */
    public static boolean m4994c(@C0193h0 Context context, @C0193h0 List<C0856d> list) {
        if (VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (C0856d j : list) {
                arrayList.add(j.mo4514j());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        m4993c(context).mo4528a(list);
        return true;
    }

    /* renamed from: d */
    public static boolean m4995d(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        String str = f4012b;
        if (C0841b.m4916a(context, str) != 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent(f4011a), 0)) {
            String str2 = resolveInfo.activityInfo.permission;
            if (!TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m4996e(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        m4993c(context).mo4530b();
    }

    /* renamed from: b */
    public static int m4991b(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    /* renamed from: c */
    private static C0858e m4993c(Context context) {
        if (f4014d == null) {
            if (VERSION.SDK_INT >= 23) {
                try {
                    Class[] clsArr = {Context.class};
                    f4014d = (C0858e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C0860f.class.getClassLoader()).getMethod("getInstance", clsArr).invoke(null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (f4014d == null) {
                f4014d = new C0859a();
            }
        }
        return f4014d;
    }

    @C0193h0
    /* renamed from: a */
    public static Intent m4988a(@C0193h0 Context context, @C0193h0 C0856d dVar) {
        Intent createShortcutResultIntent = VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(dVar.mo4514j()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return dVar.mo4505a(createShortcutResultIntent);
    }

    @C0193h0
    /* renamed from: a */
    public static List<C0856d> m4989a(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo aVar : dynamicShortcuts) {
                arrayList.add(new C0857a(context, aVar).mo4523a());
            }
            return arrayList;
        }
        try {
            return m4993c(context).mo4529a();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public void mo4532a(@C0193h0 Context context, @C0193h0 List<String> list) {
        if (VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m4993c(context).mo4531b(list);
    }
}
