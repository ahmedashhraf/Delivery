package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.browser.browseractions.e */
/* compiled from: BrowserActionsIntent */
public class C0617e {

    /* renamed from: b */
    private static final String f2425b = "BrowserActions";

    /* renamed from: c */
    private static final String f2426c = "https://www.example.com";

    /* renamed from: d */
    public static final String f2427d = "androidx.browser.browseractions.APP_ID";

    /* renamed from: e */
    public static final String f2428e = "androidx.browser.browseractions.browser_action_open";

    /* renamed from: f */
    public static final String f2429f = "androidx.browser.browseractions.ICON_ID";

    /* renamed from: g */
    public static final String f2430g = "androidx.browser.browseractions.TITLE";

    /* renamed from: h */
    public static final String f2431h = "androidx.browser.browseractions.ACTION";

    /* renamed from: i */
    public static final String f2432i = "androidx.browser.browseractions.extra.TYPE";

    /* renamed from: j */
    public static final String f2433j = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* renamed from: k */
    public static final String f2434k = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* renamed from: l */
    public static final int f2435l = 5;

    /* renamed from: m */
    public static final int f2436m = 0;

    /* renamed from: n */
    public static final int f2437n = 1;

    /* renamed from: o */
    public static final int f2438o = 2;

    /* renamed from: p */
    public static final int f2439p = 3;

    /* renamed from: q */
    public static final int f2440q = 4;

    /* renamed from: r */
    public static final int f2441r = 5;

    /* renamed from: s */
    public static final int f2442s = -1;

    /* renamed from: t */
    public static final int f2443t = 0;

    /* renamed from: u */
    public static final int f2444u = 1;

    /* renamed from: v */
    public static final int f2445v = 2;

    /* renamed from: w */
    public static final int f2446w = 3;

    /* renamed from: x */
    public static final int f2447x = 4;

    /* renamed from: y */
    private static C0618a f2448y;
    @C0193h0

    /* renamed from: a */
    private final Intent f2449a;

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: androidx.browser.browseractions.e$a */
    /* compiled from: BrowserActionsIntent */
    interface C0618a {
        /* renamed from: a */
        void mo3102a();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.browseractions.e$b */
    /* compiled from: BrowserActionsIntent */
    public @interface C0619b {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.browseractions.e$c */
    /* compiled from: BrowserActionsIntent */
    public @interface C0620c {
    }

    /* renamed from: androidx.browser.browseractions.e$d */
    /* compiled from: BrowserActionsIntent */
    public static final class C0621d {

        /* renamed from: a */
        private final Intent f2450a = new Intent(C0617e.f2428e);

        /* renamed from: b */
        private Context f2451b;

        /* renamed from: c */
        private Uri f2452c;

        /* renamed from: d */
        private int f2453d;

        /* renamed from: e */
        private ArrayList<Bundle> f2454e = null;

        /* renamed from: f */
        private PendingIntent f2455f = null;

        public C0621d(Context context, Uri uri) {
            this.f2451b = context;
            this.f2452c = uri;
            this.f2453d = 0;
            this.f2454e = new ArrayList<>();
        }

        /* renamed from: a */
        public C0621d mo3103a(int i) {
            this.f2453d = i;
            return this;
        }

        /* renamed from: a */
        public C0621d mo3105a(ArrayList<C0608a> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (TextUtils.isEmpty(((C0608a) arrayList.get(i)).mo3086c()) || ((C0608a) arrayList.get(i)).mo3084a() == null) {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                    this.f2454e.add(m3260a((C0608a) arrayList.get(i)));
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        /* renamed from: a */
        public C0621d mo3106a(C0608a... aVarArr) {
            return mo3105a(new ArrayList<>(Arrays.asList(aVarArr)));
        }

        /* renamed from: a */
        public C0621d mo3104a(PendingIntent pendingIntent) {
            this.f2455f = pendingIntent;
            return this;
        }

        /* renamed from: a */
        private Bundle m3260a(C0608a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString(C0617e.f2430g, aVar.mo3086c());
            bundle.putParcelable(C0617e.f2431h, aVar.mo3084a());
            if (aVar.mo3085b() != 0) {
                bundle.putInt(C0617e.f2429f, aVar.mo3085b());
            }
            return bundle;
        }

        /* renamed from: a */
        public C0617e mo3107a() {
            this.f2450a.setData(this.f2452c);
            this.f2450a.putExtra(C0617e.f2432i, this.f2453d);
            this.f2450a.putParcelableArrayListExtra(C0617e.f2433j, this.f2454e);
            this.f2450a.putExtra(C0617e.f2427d, PendingIntent.getActivity(this.f2451b, 0, new Intent(), 0));
            PendingIntent pendingIntent = this.f2455f;
            if (pendingIntent != null) {
                this.f2450a.putExtra(C0617e.f2434k, pendingIntent);
            }
            return new C0617e(this.f2450a);
        }
    }

    C0617e(@C0193h0 Intent intent) {
        this.f2449a = intent;
    }

    /* renamed from: b */
    private static void m3257b(Context context, Intent intent) {
        Uri data = intent.getData();
        int intExtra = intent.getIntExtra(f2432i, 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f2433j);
        m3255a(context, data, intExtra, parcelableArrayListExtra != null ? m3250a(parcelableArrayListExtra) : null);
    }

    @C0193h0
    /* renamed from: a */
    public Intent mo3101a() {
        return this.f2449a;
    }

    /* renamed from: a */
    public static void m3253a(Context context, Uri uri) {
        m3251a(context, new C0621d(context, uri).mo3107a().mo3101a());
    }

    /* renamed from: a */
    public static void m3254a(Context context, Uri uri, int i, ArrayList<C0608a> arrayList, PendingIntent pendingIntent) {
        m3251a(context, new C0621d(context, uri).mo3103a(i).mo3105a(arrayList).mo3104a(pendingIntent).mo3107a().mo3101a());
    }

    /* renamed from: a */
    public static void m3251a(Context context, Intent intent) {
        m3252a(context, intent, m3249a(context));
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: a */
    static void m3252a(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            m3257b(context, intent);
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            intent.setPackage(((ResolveInfo) list.get(0)).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f2426c)), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (str.equals(((ResolveInfo) list.get(i)).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        C0841b.m4921a(context, intent, (Bundle) null);
    }

    /* renamed from: a */
    private static List<ResolveInfo> m3249a(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f2428e, Uri.parse(f2426c)), 131072);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: a */
    static void m3256a(C0618a aVar) {
        f2448y = aVar;
    }

    /* renamed from: a */
    private static void m3255a(Context context, Uri uri, int i, List<C0608a> list) {
        new C0613d(context, uri, list).mo3095a();
        C0618a aVar = f2448y;
        if (aVar != null) {
            aVar.mo3102a();
        }
    }

    /* renamed from: a */
    public static List<C0608a> m3250a(ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            String string = bundle.getString(f2430g);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f2431h);
            int i2 = bundle.getInt(f2429f);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(new C0608a(string, pendingIntent, i2));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static String m3248a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f2427d);
        if (pendingIntent == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 17) {
            return pendingIntent.getCreatorPackage();
        }
        return pendingIntent.getTargetPackage();
    }
}
