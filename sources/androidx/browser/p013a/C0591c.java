package androidx.browser.p013a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.RemoteViews;
import androidx.annotation.C0178a;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.core.app.C0737c;
import androidx.core.app.C0748i;
import androidx.core.content.C0841b;
import java.util.ArrayList;

/* renamed from: androidx.browser.a.c */
/* compiled from: CustomTabsIntent */
public final class C0591c {

    /* renamed from: A */
    public static final String f2338A = "android.support.customtabs.customaction.ID";

    /* renamed from: B */
    public static final int f2339B = 0;

    /* renamed from: C */
    private static final int f2340C = 5;

    /* renamed from: c */
    private static final String f2341c = "android.support.customtabs.extra.user_opt_out";

    /* renamed from: d */
    public static final String f2342d = "android.support.customtabs.extra.SESSION";

    /* renamed from: e */
    public static final String f2343e = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* renamed from: f */
    public static final String f2344f = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* renamed from: g */
    public static final String f2345g = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* renamed from: h */
    public static final String f2346h = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* renamed from: i */
    public static final int f2347i = 0;

    /* renamed from: j */
    public static final int f2348j = 1;

    /* renamed from: k */
    public static final String f2349k = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* renamed from: l */
    public static final String f2350l = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* renamed from: m */
    public static final String f2351m = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* renamed from: n */
    public static final String f2352n = "android.support.customtabs.customaction.ICON";

    /* renamed from: o */
    public static final String f2353o = "android.support.customtabs.customaction.DESCRIPTION";

    /* renamed from: p */
    public static final String f2354p = "android.support.customtabs.customaction.PENDING_INTENT";

    /* renamed from: q */
    public static final String f2355q = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* renamed from: r */
    public static final String f2356r = "android.support.customtabs.extra.MENU_ITEMS";

    /* renamed from: s */
    public static final String f2357s = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* renamed from: t */
    public static final String f2358t = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* renamed from: u */
    public static final String f2359u = "android.support.customtabs.extra.SHARE_MENU_ITEM";

    /* renamed from: v */
    public static final String f2360v = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";

    /* renamed from: w */
    public static final String f2361w = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";

    /* renamed from: x */
    public static final String f2362x = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";

    /* renamed from: y */
    public static final String f2363y = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";

    /* renamed from: z */
    public static final String f2364z = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    @C0193h0

    /* renamed from: a */
    public final Intent f2365a;
    @C0195i0

    /* renamed from: b */
    public final Bundle f2366b;

    /* renamed from: androidx.browser.a.c$a */
    /* compiled from: CustomTabsIntent */
    public static final class C0592a {

        /* renamed from: a */
        private final Intent f2367a;

        /* renamed from: b */
        private ArrayList<Bundle> f2368b;

        /* renamed from: c */
        private Bundle f2369c;

        /* renamed from: d */
        private ArrayList<Bundle> f2370d;

        /* renamed from: e */
        private boolean f2371e;

        public C0592a() {
            this(null);
        }

        /* renamed from: a */
        public C0592a mo3037a(@C0193h0 Bitmap bitmap) {
            this.f2367a.putExtra(C0591c.f2345g, bitmap);
            return this;
        }

        /* renamed from: b */
        public C0592a mo3043b(@C0198k int i) {
            this.f2367a.putExtra(C0591c.f2343e, i);
            return this;
        }

        /* renamed from: c */
        public C0592a mo3047c() {
            this.f2367a.putExtra(C0591c.f2344f, true);
            return this;
        }

        public C0592a(@C0195i0 C0600f fVar) {
            this.f2367a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f2368b = null;
            this.f2369c = null;
            this.f2370d = null;
            this.f2371e = true;
            if (fVar != null) {
                this.f2367a.setPackage(fVar.mo3068b().getPackageName());
            }
            Bundle bundle = new Bundle();
            if (fVar != null) {
                iBinder = fVar.mo3061a();
            }
            C0748i.m4316a(bundle, C0591c.f2342d, iBinder);
            this.f2367a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0592a mo3041a(@C0193h0 String str, @C0193h0 PendingIntent pendingIntent) {
            if (this.f2368b == null) {
                this.f2368b = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(C0591c.f2357s, str);
            bundle.putParcelable(C0591c.f2354p, pendingIntent);
            this.f2368b.add(bundle);
            return this;
        }

        /* renamed from: b */
        public C0592a mo3045b(boolean z) {
            this.f2367a.putExtra(C0591c.f2346h, z ? 1 : 0);
            return this;
        }

        /* renamed from: b */
        public C0592a mo3044b(@C0193h0 Context context, @C0178a int i, @C0178a int i2) {
            this.f2369c = C0737c.m4274a(context, i, i2).mo4091b();
            return this;
        }

        /* renamed from: b */
        public C0591c mo3046b() {
            ArrayList<Bundle> arrayList = this.f2368b;
            if (arrayList != null) {
                this.f2367a.putParcelableArrayListExtra(C0591c.f2356r, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2370d;
            if (arrayList2 != null) {
                this.f2367a.putParcelableArrayListExtra(C0591c.f2350l, arrayList2);
            }
            this.f2367a.putExtra(C0591c.f2364z, this.f2371e);
            return new C0591c(this.f2367a, this.f2369c);
        }

        /* renamed from: a */
        public C0592a mo3033a() {
            this.f2367a.putExtra(C0591c.f2359u, true);
            return this;
        }

        /* renamed from: a */
        public C0592a mo3039a(@C0193h0 Bitmap bitmap, @C0193h0 String str, @C0193h0 PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(C0591c.f2338A, 0);
            bundle.putParcelable(C0591c.f2352n, bitmap);
            bundle.putString(C0591c.f2353o, str);
            bundle.putParcelable(C0591c.f2354p, pendingIntent);
            this.f2367a.putExtra(C0591c.f2349k, bundle);
            this.f2367a.putExtra(C0591c.f2355q, z);
            return this;
        }

        /* renamed from: a */
        public C0592a mo3038a(@C0193h0 Bitmap bitmap, @C0193h0 String str, @C0193h0 PendingIntent pendingIntent) {
            return mo3039a(bitmap, str, pendingIntent, false);
        }

        @Deprecated
        /* renamed from: a */
        public C0592a mo3035a(int i, @C0193h0 Bitmap bitmap, @C0193h0 String str, PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f2370d == null) {
                this.f2370d = new ArrayList<>();
            }
            if (this.f2370d.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(C0591c.f2338A, i);
                bundle.putParcelable(C0591c.f2352n, bitmap);
                bundle.putString(C0591c.f2353o, str);
                bundle.putParcelable(C0591c.f2354p, pendingIntent);
                this.f2370d.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        /* renamed from: a */
        public C0592a mo3034a(@C0198k int i) {
            this.f2367a.putExtra(C0591c.f2351m, i);
            return this;
        }

        /* renamed from: a */
        public C0592a mo3040a(@C0193h0 RemoteViews remoteViews, @C0195i0 int[] iArr, @C0195i0 PendingIntent pendingIntent) {
            this.f2367a.putExtra(C0591c.f2360v, remoteViews);
            this.f2367a.putExtra(C0591c.f2361w, iArr);
            this.f2367a.putExtra(C0591c.f2362x, pendingIntent);
            return this;
        }

        /* renamed from: a */
        public C0592a mo3042a(boolean z) {
            this.f2371e = z;
            return this;
        }

        /* renamed from: a */
        public C0592a mo3036a(@C0193h0 Context context, @C0178a int i, @C0178a int i2) {
            this.f2367a.putExtra(C0591c.f2358t, C0737c.m4274a(context, i, i2).mo4091b());
            return this;
        }
    }

    C0591c(Intent intent, Bundle bundle) {
        this.f2365a = intent;
        this.f2366b = bundle;
    }

    /* renamed from: a */
    public static int m3168a() {
        return 5;
    }

    /* renamed from: b */
    public static boolean m3170b(Intent intent) {
        if (!intent.getBooleanExtra(f2341c, false) || (intent.getFlags() & 268435456) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3032a(Context context, Uri uri) {
        this.f2365a.setData(uri);
        C0841b.m4921a(context, this.f2365a, this.f2366b);
    }

    /* renamed from: a */
    public static Intent m3169a(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f2341c, true);
        return intent;
    }
}
