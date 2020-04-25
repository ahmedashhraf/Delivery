package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0210o0;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4492k;
import com.google.android.gms.internal.measurement.C4746ec;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C5342n9;
import com.google.android.gms.measurement.internal.C5359p4;
import com.google.android.gms.measurement.internal.C5438w6;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5566n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public final class FirebaseAnalytics {

    /* renamed from: h */
    private static volatile FirebaseAnalytics f16855h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5359p4 f16856a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4746ec f16857b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f16858c;

    /* renamed from: d */
    private String f16859d;

    /* renamed from: e */
    private long f16860e;

    /* renamed from: f */
    private final Object f16861f;

    /* renamed from: g */
    private ExecutorService f16862g;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
    public static class C5853a {

        /* renamed from: A */
        public static final String f16863A = "view_search_results";

        /* renamed from: B */
        public static final String f16864B = "earn_virtual_currency";

        /* renamed from: C */
        public static final String f16865C = "remove_from_cart";

        /* renamed from: D */
        public static final String f16866D = "checkout_progress";

        /* renamed from: E */
        public static final String f16867E = "set_checkout_option";

        /* renamed from: a */
        public static final String f16868a = "add_payment_info";

        /* renamed from: b */
        public static final String f16869b = "add_to_cart";

        /* renamed from: c */
        public static final String f16870c = "add_to_wishlist";

        /* renamed from: d */
        public static final String f16871d = "app_open";

        /* renamed from: e */
        public static final String f16872e = "begin_checkout";

        /* renamed from: f */
        public static final String f16873f = "campaign_details";

        /* renamed from: g */
        public static final String f16874g = "ecommerce_purchase";

        /* renamed from: h */
        public static final String f16875h = "generate_lead";

        /* renamed from: i */
        public static final String f16876i = "join_group";

        /* renamed from: j */
        public static final String f16877j = "level_end";

        /* renamed from: k */
        public static final String f16878k = "level_start";

        /* renamed from: l */
        public static final String f16879l = "level_up";

        /* renamed from: m */
        public static final String f16880m = "login";

        /* renamed from: n */
        public static final String f16881n = "post_score";

        /* renamed from: o */
        public static final String f16882o = "present_offer";

        /* renamed from: p */
        public static final String f16883p = "purchase_refund";

        /* renamed from: q */
        public static final String f16884q = "search";

        /* renamed from: r */
        public static final String f16885r = "select_content";

        /* renamed from: s */
        public static final String f16886s = "share";

        /* renamed from: t */
        public static final String f16887t = "sign_up";

        /* renamed from: u */
        public static final String f16888u = "spend_virtual_currency";

        /* renamed from: v */
        public static final String f16889v = "tutorial_begin";

        /* renamed from: w */
        public static final String f16890w = "tutorial_complete";

        /* renamed from: x */
        public static final String f16891x = "unlock_achievement";

        /* renamed from: y */
        public static final String f16892y = "view_item";

        /* renamed from: z */
        public static final String f16893z = "view_item_list";

        protected C5853a() {
        }
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
    public static class C5854b {

        /* renamed from: A */
        public static final String f16894A = "quantity";

        /* renamed from: B */
        public static final String f16895B = "score";

        /* renamed from: C */
        public static final String f16896C = "shipping";

        /* renamed from: D */
        public static final String f16897D = "transaction_id";

        /* renamed from: E */
        public static final String f16898E = "search_term";

        /* renamed from: F */
        public static final String f16899F = "success";

        /* renamed from: G */
        public static final String f16900G = "tax";

        /* renamed from: H */
        public static final String f16901H = "value";

        /* renamed from: I */
        public static final String f16902I = "virtual_currency_name";

        /* renamed from: J */
        public static final String f16903J = "campaign";

        /* renamed from: K */
        public static final String f16904K = "source";

        /* renamed from: L */
        public static final String f16905L = "medium";

        /* renamed from: M */
        public static final String f16906M = "term";

        /* renamed from: N */
        public static final String f16907N = "content";

        /* renamed from: O */
        public static final String f16908O = "aclid";

        /* renamed from: P */
        public static final String f16909P = "cp1";

        /* renamed from: Q */
        public static final String f16910Q = "item_brand";

        /* renamed from: R */
        public static final String f16911R = "item_variant";

        /* renamed from: S */
        public static final String f16912S = "item_list";

        /* renamed from: T */
        public static final String f16913T = "checkout_step";

        /* renamed from: U */
        public static final String f16914U = "checkout_option";

        /* renamed from: V */
        public static final String f16915V = "creative_name";

        /* renamed from: W */
        public static final String f16916W = "creative_slot";

        /* renamed from: X */
        public static final String f16917X = "affiliation";

        /* renamed from: Y */
        public static final String f16918Y = "index";

        /* renamed from: a */
        public static final String f16919a = "achievement_id";

        /* renamed from: b */
        public static final String f16920b = "character";

        /* renamed from: c */
        public static final String f16921c = "travel_class";

        /* renamed from: d */
        public static final String f16922d = "content_type";

        /* renamed from: e */
        public static final String f16923e = "currency";

        /* renamed from: f */
        public static final String f16924f = "coupon";

        /* renamed from: g */
        public static final String f16925g = "start_date";

        /* renamed from: h */
        public static final String f16926h = "end_date";

        /* renamed from: i */
        public static final String f16927i = "extend_session";

        /* renamed from: j */
        public static final String f16928j = "flight_number";

        /* renamed from: k */
        public static final String f16929k = "group_id";

        /* renamed from: l */
        public static final String f16930l = "item_category";

        /* renamed from: m */
        public static final String f16931m = "item_id";

        /* renamed from: n */
        public static final String f16932n = "item_location_id";

        /* renamed from: o */
        public static final String f16933o = "item_name";

        /* renamed from: p */
        public static final String f16934p = "location";

        /* renamed from: q */
        public static final String f16935q = "level";

        /* renamed from: r */
        public static final String f16936r = "level_name";
        @Deprecated

        /* renamed from: s */
        public static final String f16937s = "sign_up_method";

        /* renamed from: t */
        public static final String f16938t = "method";

        /* renamed from: u */
        public static final String f16939u = "number_of_nights";

        /* renamed from: v */
        public static final String f16940v = "number_of_passengers";

        /* renamed from: w */
        public static final String f16941w = "number_of_rooms";

        /* renamed from: x */
        public static final String f16942x = "destination";

        /* renamed from: y */
        public static final String f16943y = "origin";

        /* renamed from: z */
        public static final String f16944z = "price";

        protected C5854b() {
        }
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$c */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
    public static class C5855c {

        /* renamed from: a */
        public static final String f16945a = "sign_up_method";

        /* renamed from: b */
        public static final String f16946b = "allow_personalized_ads";

        protected C5855c() {
        }
    }

    private FirebaseAnalytics(C5359p4 p4Var) {
        C4300a0.m18620a(p4Var);
        this.f16856a = p4Var;
        this.f16857b = null;
        this.f16858c = false;
        this.f16861f = new Object();
    }

    /* renamed from: c */
    private final ExecutorService m25720c() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f16862g == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                this.f16862g = threadPoolExecutor;
            }
            executorService = this.f16862g;
        }
        return executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m25722d() {
        long j;
        synchronized (this.f16861f) {
            if (this.f16858c) {
                j = C4492k.m19370e().mo18572d();
            } else {
                j = this.f16856a.mo21208g().mo18572d();
            }
            if (Math.abs(j - this.f16860e) >= 1000) {
                return null;
            }
            String str = this.f16859d;
            return str;
        }
    }

    @C0193h0
    @Keep
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@C0193h0 Context context) {
        if (f16855h == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f16855h == null) {
                    if (C4746ec.m20072b(context)) {
                        f16855h = new FirebaseAnalytics(C4746ec.m20058a(context));
                    } else {
                        f16855h = new FirebaseAnalytics(C5359p4.m23334a(context, (zzv) null));
                    }
                }
            }
        }
        return f16855h;
    }

    @Keep
    public static C5438w6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (!C4746ec.m20072b(context)) {
            return null;
        }
        C4746ec a = C4746ec.m20059a(context, (String) null, (String) null, (String) null, bundle);
        if (a == null) {
            return null;
        }
        return new C8626b(a);
    }

    /* renamed from: a */
    public final void mo23273a(@C0193h0 @C0210o0(max = 40, min = 1) String str, @C0195i0 Bundle bundle) {
        if (this.f16858c) {
            this.f16857b.mo18949a(str, bundle);
        } else {
            this.f16856a.mo21606t().mo21765a(C14330v.f42313b, str, bundle, true);
        }
    }

    /* renamed from: b */
    public final void mo23277b(long j) {
        if (this.f16858c) {
            this.f16857b.mo18957b(j);
        } else {
            this.f16856a.mo21606t().mo21772b(j);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m40758n().mo32071c();
    }

    @Keep
    @C0187e0
    public final void setCurrentScreen(@C0193h0 Activity activity, @C0210o0(max = 36, min = 1) @C0195i0 String str, @C0210o0(max = 36, min = 1) @C0195i0 String str2) {
        if (this.f16858c) {
            this.f16857b.mo18944a(activity, str, str2);
        } else if (!C5342n9.m23293a()) {
            this.f16856a.mo21205d().mo21536w().mo21549a("setCurrentScreen must be called from the main thread");
        } else {
            this.f16856a.mo21582D().mo21309a(activity, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo23274a(@C0193h0 @C0210o0(max = 24, min = 1) String str, @C0210o0(max = 36) @C0195i0 String str2) {
        if (this.f16858c) {
            this.f16857b.mo18950a(str, str2);
        } else {
            this.f16856a.mo21606t().mo21768a(C14330v.f42313b, str, (Object) str2, false);
        }
    }

    /* renamed from: b */
    public final void mo23276b() {
        m25717b((String) null);
        if (this.f16858c) {
            this.f16857b.mo18956b();
        } else {
            this.f16856a.mo21606t().mo21780d(this.f16856a.mo21208g().mo18569a());
        }
    }

    private FirebaseAnalytics(C4746ec ecVar) {
        C4300a0.m18620a(ecVar);
        this.f16856a = null;
        this.f16857b = ecVar;
        this.f16858c = true;
        this.f16861f = new Object();
    }

    /* renamed from: a */
    public final void mo23275a(boolean z) {
        if (this.f16858c) {
            this.f16857b.mo18954a(z);
        } else {
            this.f16856a.mo21606t().mo21771a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m25717b(String str) {
        synchronized (this.f16861f) {
            this.f16859d = str;
            if (this.f16858c) {
                this.f16860e = C4492k.m19370e().mo18572d();
            } else {
                this.f16860e = this.f16856a.mo21208g().mo18572d();
            }
        }
    }

    /* renamed from: a */
    public final void mo23272a(@C0195i0 String str) {
        if (this.f16858c) {
            this.f16857b.mo18948a(str);
        } else {
            this.f16856a.mo21606t().mo21768a(C14330v.f42313b, FeatureRequestEntry.COLUMN_ID, (Object) str, true);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo23271a(long j) {
        if (this.f16858c) {
            this.f16857b.mo18943a(j);
        } else {
            this.f16856a.mo21606t().mo21757a(j);
        }
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<String> mo23270a() {
        try {
            String d = m25722d();
            if (d != null) {
                return C5566n.m24211a(d);
            }
            return C5566n.m24214a((Executor) m25720c(), (Callable<TResult>) new C8627c<TResult>(this));
        } catch (Exception e) {
            if (this.f16858c) {
                this.f16857b.mo18942a(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            } else {
                this.f16856a.mo21205d().mo21536w().mo21549a("Failed to schedule task for getAppInstanceId");
            }
            return C5566n.m24210a(e);
        }
    }
}
