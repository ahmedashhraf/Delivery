package p212io.branch.referral;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0216r0;
import com.facebook.common.util.UriUtil;
import com.facebook.internal.ServerProtocol;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p489f.C14069f;
import p212io.branch.indexing.BranchUniversalObject;
import p212io.branch.indexing.BranchUniversalObject.C14090d;
import p212io.branch.indexing.C14094b;
import p212io.branch.referral.C14153p.C6033d;
import p212io.branch.referral.C14158p0.C14159a;
import p212io.branch.referral.C14164r.C14166b;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.network.BranchRemoteInterface;
import p212io.branch.referral.util.C14192a;
import p212io.branch.referral.util.C14194c;
import p212io.branch.referral.util.C14196d;
import p212io.branch.referral.util.LinkProperties;

/* renamed from: io.branch.referral.d */
/* compiled from: Branch */
public class C6009d implements C6033d, C6034a, C6008b {

    /* renamed from: A0 */
    private static final int f17196A0 = 1501;

    /* renamed from: B */
    private static final String f17197B = "BranchSDK";

    /* renamed from: B0 */
    private static final String f17198B0 = "io.branch.apiKey";

    /* renamed from: C */
    public static final String f17199C = "share";

    /* renamed from: C0 */
    private static String f17200C0 = "app.link";

    /* renamed from: D */
    public static final String f17201D = "referral";

    /* renamed from: D0 */
    private static int f17202D0 = 2500;

    /* renamed from: E */
    public static final String f17203E = "invite";

    /* renamed from: E0 */
    private static final String[] f17204E0 = {"extra_launch_uri", "branch_intent"};

    /* renamed from: F */
    public static final String f17205F = "deal";

    /* renamed from: F0 */
    private static boolean f17206F0 = true;

    /* renamed from: G */
    public static final String f17207G = "gift";

    /* renamed from: H */
    public static final String f17208H = "$redeem_code";

    /* renamed from: I */
    public static final String f17209I = "default";

    /* renamed from: J */
    public static final String f17210J = "credit";

    /* renamed from: K */
    public static final int f17211K = 2;

    /* renamed from: L */
    public static final String f17212L = "referral_code";

    /* renamed from: M */
    public static final String f17213M = "$desktop_url";

    /* renamed from: N */
    public static final String f17214N = "$android_url";

    /* renamed from: O */
    public static final String f17215O = "$ios_url";

    /* renamed from: P */
    public static final String f17216P = "$ipad_url";

    /* renamed from: Q */
    public static final String f17217Q = "$fire_url";

    /* renamed from: R */
    public static final String f17218R = "$blackberry_url";

    /* renamed from: S */
    public static final String f17219S = "$windows_phone_url";

    /* renamed from: T */
    public static final String f17220T = "$og_title";

    /* renamed from: U */
    public static final String f17221U = "$og_description";

    /* renamed from: V */
    public static final String f17222V = "$og_image_url";

    /* renamed from: W */
    public static final String f17223W = "$og_video";

    /* renamed from: X */
    public static final String f17224X = "$og_url";

    /* renamed from: Y */
    public static final String f17225Y = "$og_app_id";

    /* renamed from: Z */
    public static final String f17226Z = "$deeplink_path";

    /* renamed from: a0 */
    public static final String f17227a0 = "$always_deeplink";

    /* renamed from: b0 */
    public static final int f17228b0 = 0;

    /* renamed from: c0 */
    public static final int f17229c0 = 2;

    /* renamed from: d0 */
    public static final int f17230d0 = 3;

    /* renamed from: e0 */
    public static final int f17231e0 = 1;

    /* renamed from: f0 */
    public static final int f17232f0 = 0;

    /* renamed from: g0 */
    public static final int f17233g0 = 0;

    /* renamed from: h0 */
    public static final int f17234h0 = 1;

    /* renamed from: i0 */
    private static final int f17235i0 = 2000;

    /* renamed from: j0 */
    private static final int f17236j0 = 500;

    /* renamed from: k0 */
    private static boolean f17237k0 = false;

    /* renamed from: l0 */
    static boolean f17238l0 = false;

    /* renamed from: m0 */
    static Boolean f17239m0 = null;

    /* renamed from: n0 */
    static boolean f17240n0 = false;

    /* renamed from: o0 */
    static boolean f17241o0 = true;

    /* renamed from: p0 */
    private static long f17242p0 = 1500;

    /* renamed from: q0 */
    public static final long f17243q0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public static C6009d f17244r0 = null;

    /* renamed from: s0 */
    private static boolean f17245s0 = false;

    /* renamed from: t0 */
    private static boolean f17246t0 = false;

    /* renamed from: u0 */
    private static C6020k f17247u0 = C6020k.USE_DEFAULT;

    /* renamed from: v0 */
    private static final String f17248v0 = "io.branch.sdk.auto_linked";

    /* renamed from: w0 */
    private static final String f17249w0 = "io.branch.sdk.auto_link_keys";

    /* renamed from: x0 */
    private static final String f17250x0 = "io.branch.sdk.auto_link_path";

    /* renamed from: y0 */
    private static final String f17251y0 = "io.branch.sdk.auto_link_disable";

    /* renamed from: z0 */
    private static final String f17252z0 = "io.branch.sdk.auto_link_request_code";

    /* renamed from: A */
    private final C14167r0 f17253A;

    /* renamed from: a */
    private JSONObject f17254a;

    /* renamed from: b */
    private boolean f17255b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public BranchRemoteInterface f17256c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C14204x f17257d;

    /* renamed from: e */
    private final C14161q0 f17258e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f17259f;

    /* renamed from: g */
    final Object f17260g;

    /* renamed from: h */
    private Semaphore f17261h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C14131h0 f17262i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f17263j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f17264k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Map<C14133i, String> f17265l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6025p f17266m = C6025p.PENDING;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f17267n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C6027r f17268o = C6027r.UNINITIALISED;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ShareLinkManager f17269p;

    /* renamed from: q */
    WeakReference<Activity> f17270q;

    /* renamed from: r */
    boolean f17271r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ConcurrentHashMap<String, String> f17272s;

    /* renamed from: t */
    private boolean f17273t = false;

    /* renamed from: u */
    String f17274u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public CountDownLatch f17275v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public CountDownLatch f17276w = null;

    /* renamed from: x */
    private boolean f17277x = false;

    /* renamed from: y */
    boolean f17278y = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f17279z = false;

    /* renamed from: io.branch.referral.d$a */
    /* compiled from: Branch */
    class C6010a implements C14166b {
        C6010a() {
        }

        /* renamed from: a */
        public void mo24831a(String str) {
            C6009d.this.f17257d.mo44946a(Boolean.valueOf(true));
            if (str != null) {
                String queryParameter = Uri.parse(str).getQueryParameter(C14169a.LinkClickID.mo44764d());
                if (!TextUtils.isEmpty(queryParameter)) {
                    C6009d.this.f17257d.mo45006w(queryParameter);
                }
            }
            C6009d.this.f17262i.mo44651a(C14207b.FB_APP_LINK_WAIT_LOCK);
            C6009d.this.m27470Q();
        }
    }

    /* renamed from: io.branch.referral.d$b */
    /* compiled from: Branch */
    class C6011b implements C14144e {
        C6011b() {
        }

        /* renamed from: a */
        public void mo24832a() {
            C6009d.this.f17262i.mo44651a(C14207b.STRONG_MATCH_PENDING_WAIT_LOCK);
            C6009d.this.m27470Q();
        }
    }

    @TargetApi(14)
    /* renamed from: io.branch.referral.d$c */
    /* compiled from: Branch */
    private class C6012c implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        private int f17282a;

        private C6012c() {
            this.f17282a = 0;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6009d dVar = C6009d.this;
            dVar.f17266m = dVar.f17267n ? C6025p.PENDING : C6025p.READY;
            C6009d.this.f17279z = true;
            if (C14153p.m61241a().mo44725a(activity.getApplicationContext())) {
                C14153p.m61241a().mo44728b((Context) activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            WeakReference<Activity> weakReference = C6009d.this.f17270q;
            if (weakReference != null && weakReference.get() == activity) {
                C6009d.this.f17270q.clear();
            }
            C14153p.m61241a().mo44724a(activity);
        }

        public void onActivityPaused(Activity activity) {
            if (C6009d.this.f17269p != null) {
                C6009d.this.f17269p.mo44593a(true);
            }
        }

        public void onActivityResumed(Activity activity) {
            if (C6009d.this.m27499a(activity.getIntent())) {
                C6009d.this.f17268o = C6027r.UNINITIALISED;
                C6009d.this.m27526e(activity);
            }
            C6009d.this.f17270q = new WeakReference<>(activity);
            if (C6009d.this.f17267n) {
                C6009d.this.f17266m = C6025p.READY;
                C6009d.this.m27483a(activity, (activity.getIntent() == null || C6009d.this.f17268o == C6027r.INITIALISED) ? false : true);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C6009d dVar = C6009d.this;
            dVar.f17266m = dVar.f17267n ? C6025p.PENDING : C6025p.READY;
            if (C6009d.this.f17268o == C6027r.INITIALISED) {
                try {
                    C14094b.m60938a().mo44570a(activity, C6009d.this.f17274u);
                } catch (Exception unused) {
                }
            }
            if (this.f17282a < 1) {
                if (C6009d.this.f17268o == C6027r.INITIALISED) {
                    C6009d.this.f17268o = C6027r.UNINITIALISED;
                }
                if (C6031o.m27714c(C6009d.this.f17259f)) {
                    C6009d.this.f17257d.mo44938K();
                }
                C6009d.this.m27526e(activity);
            } else if (C6009d.this.m27499a(activity.getIntent())) {
                C6009d.this.f17268o = C6027r.UNINITIALISED;
                C6009d.this.m27526e(activity);
            }
            this.f17282a++;
            C6009d.this.f17279z = false;
        }

        public void onActivityStopped(Activity activity) {
            C14094b.m60938a().mo44569a(activity);
            this.f17282a--;
            if (this.f17282a < 1) {
                C6009d dVar = C6009d.this;
                dVar.f17278y = false;
                dVar.mo24809e();
            }
        }

        /* synthetic */ C6012c(C6009d dVar, C6010a aVar) {
            this();
        }
    }

    /* renamed from: io.branch.referral.d$d */
    /* compiled from: Branch */
    public interface C6013d {
        /* renamed from: a */
        void mo24840a(String str, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$e */
    /* compiled from: Branch */
    public interface C6014e {
        /* renamed from: a */
        void mo24841a();

        /* renamed from: a */
        void mo24842a(String str);

        /* renamed from: a */
        void mo24843a(String str, String str2, C14130h hVar);

        /* renamed from: b */
        void mo24844b();
    }

    /* renamed from: io.branch.referral.d$f */
    /* compiled from: Branch */
    public interface C6015f {
        /* renamed from: a */
        void mo24845a(JSONArray jSONArray, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$g */
    /* compiled from: Branch */
    private class C6016g extends C14126f<Void, Void, C14152o0> {

        /* renamed from: a */
        C14205y f17284a;

        public C6016g(C14205y yVar) {
            this.f17284a = yVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C14152o0 doInBackground(Void... voidArr) {
            C6009d dVar = C6009d.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17284a.mo45024h());
            sb.append("-");
            sb.append(C14169a.Queue_Wait_Time.mo44764d());
            dVar.mo24806d(sb.toString(), String.valueOf(this.f17284a.mo45023g()));
            this.f17284a.mo45018b();
            if (C6009d.this.mo24822p() && !this.f17284a.mo44640p()) {
                return new C14152o0(this.f17284a.mo45024h(), C14130h.f41564s);
            }
            if (this.f17284a.mo44621k()) {
                return C6009d.this.f17256c.mo44716a(this.f17284a.mo44632i(), this.f17284a.mo45021e(), this.f17284a.mo45024h(), C6009d.this.f17257d.mo44977i());
            }
            return C6009d.this.f17256c.mo44717a(this.f17284a.mo45013a(C6009d.this.f17272s), this.f17284a.mo44632i(), this.f17284a.mo45024h(), C6009d.this.f17257d.mo44977i());
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            this.f17284a.mo44639n();
            this.f17284a.mo45020c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C14152o0 o0Var) {
            boolean z;
            super.onPostExecute(o0Var);
            if (o0Var != null) {
                try {
                    int d = o0Var.mo44722d();
                    C6009d.this.f17264k = true;
                    if (o0Var.mo44722d() == -117) {
                        this.f17284a.mo45027q();
                        C6009d.this.f17262i.mo44657b(this.f17284a);
                    } else if (d != 200) {
                        if (this.f17284a instanceof C14125e0) {
                            C6009d.this.f17268o = C6027r.UNINITIALISED;
                        }
                        if (d != 400) {
                            if (d != 409) {
                                C6009d.this.f17264k = false;
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < C6009d.this.f17262i.mo44660e(); i++) {
                                    arrayList.add(C6009d.this.f17262i.mo44648a(i));
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C14205y yVar = (C14205y) it.next();
                                    if (yVar == null || !yVar.mo44634r()) {
                                        C6009d.this.f17262i.mo44657b(yVar);
                                    }
                                }
                                C6009d.this.f17263j = 0;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    C14205y yVar2 = (C14205y) it2.next();
                                    if (yVar2 != null) {
                                        yVar2.mo44616a(d, o0Var.mo44720b());
                                        if (yVar2.mo44634r()) {
                                            yVar2.mo44615a();
                                        }
                                    }
                                }
                            }
                        }
                        C6009d.this.f17262i.mo44657b(this.f17284a);
                        if (this.f17284a instanceof C14116a0) {
                            ((C14116a0) this.f17284a).mo44625w();
                        } else {
                            C6009d.this.m27481a(0, d);
                        }
                    } else {
                        C6009d.this.f17264k = true;
                        if (this.f17284a instanceof C14116a0) {
                            if (o0Var.mo44721c() != null) {
                                C6009d.this.f17265l.put(((C14116a0) this.f17284a).mo44623u(), o0Var.mo44721c().getString("url"));
                            }
                        } else if (this.f17284a instanceof C14127f0) {
                            C6009d.this.f17265l.clear();
                            C6009d.this.f17262i.mo44649a();
                        }
                        C6009d.this.f17262i.mo44659d();
                        if (!(this.f17284a instanceof C14125e0)) {
                            if (!(this.f17284a instanceof C14124d0)) {
                                this.f17284a.mo44617a(o0Var, C6009d.f17244r0);
                            }
                        }
                        JSONObject c = o0Var.mo44721c();
                        if (c != null) {
                            if (!C6009d.this.mo24822p()) {
                                if (c.has(C14169a.SessionID.mo44764d())) {
                                    C6009d.this.f17257d.mo45010y(c.getString(C14169a.SessionID.mo44764d()));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (c.has(C14169a.IdentityID.mo44764d())) {
                                    if (!C6009d.this.f17257d.mo44995r().equals(c.getString(C14169a.IdentityID.mo44764d()))) {
                                        C6009d.this.f17265l.clear();
                                        C6009d.this.f17257d.mo44998s(c.getString(C14169a.IdentityID.mo44764d()));
                                        z = true;
                                    }
                                }
                                if (c.has(C14169a.DeviceFingerprintID.mo44764d())) {
                                    C6009d.this.f17257d.mo44986m(c.getString(C14169a.DeviceFingerprintID.mo44764d()));
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            if (z) {
                                C6009d.this.m27471R();
                            }
                            if (this.f17284a instanceof C14125e0) {
                                C6009d.this.f17268o = C6027r.INITIALISED;
                                this.f17284a.mo44617a(o0Var, C6009d.f17244r0);
                                if (!C6009d.this.f17271r && !((C14125e0) this.f17284a).mo44636a(o0Var)) {
                                    C6009d.this.m27545z();
                                }
                                if (((C14125e0) this.f17284a).mo44624v()) {
                                    C6009d.this.f17271r = true;
                                }
                                if (C6009d.this.f17276w != null) {
                                    C6009d.this.f17276w.countDown();
                                }
                                if (C6009d.this.f17275v != null) {
                                    C6009d.this.f17275v.countDown();
                                }
                            } else {
                                this.f17284a.mo44617a(o0Var, C6009d.f17244r0);
                            }
                        }
                    }
                    C6009d.this.f17263j = 0;
                    if (C6009d.this.f17264k && C6009d.this.f17268o != C6027r.UNINITIALISED) {
                        C6009d.this.m27470Q();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: io.branch.referral.d$h */
    /* compiled from: Branch */
    public interface C6017h {
        /* renamed from: a */
        void mo24851a(JSONObject jSONObject, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$i */
    /* compiled from: Branch */
    public interface C6018i {
        /* renamed from: a */
        void mo24852a(boolean z, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$j */
    /* compiled from: Branch */
    public interface C6019j {
        /* renamed from: a */
        void mo24853a(BranchUniversalObject branchUniversalObject, LinkProperties linkProperties, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$k */
    /* compiled from: Branch */
    private enum C6020k {
        USE_DEFAULT,
        REFERRABLE,
        NON_REFERRABLE
    }

    /* renamed from: io.branch.referral.d$l */
    /* compiled from: Branch */
    public enum C6021l {
        kMostRecentFirst,
        kLeastRecentFirst
    }

    /* renamed from: io.branch.referral.d$m */
    /* compiled from: Branch */
    public interface C6022m extends C6014e {
        /* renamed from: a */
        boolean mo24854a(String str, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties);
    }

    /* renamed from: io.branch.referral.d$n */
    /* compiled from: Branch */
    public interface C6023n {
        /* renamed from: a */
        boolean mo24855a();
    }

    /* renamed from: io.branch.referral.d$o */
    /* compiled from: Branch */
    public interface C6024o {
        /* renamed from: a */
        String mo24856a(String str);

        /* renamed from: b */
        String mo24857b(String str);
    }

    /* renamed from: io.branch.referral.d$p */
    /* compiled from: Branch */
    private enum C6025p {
        PENDING,
        READY
    }

    /* renamed from: io.branch.referral.d$q */
    /* compiled from: Branch */
    public interface C6026q {
        /* renamed from: a */
        void mo24858a(boolean z, C14130h hVar);
    }

    /* renamed from: io.branch.referral.d$r */
    /* compiled from: Branch */
    private enum C6027r {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    /* renamed from: io.branch.referral.d$s */
    /* compiled from: Branch */
    public static class C6028s {

        /* renamed from: a */
        private final Activity f17286a;

        /* renamed from: b */
        private final C6009d f17287b;

        /* renamed from: c */
        private String f17288c;

        /* renamed from: d */
        private String f17289d;

        /* renamed from: e */
        private C6014e f17290e;

        /* renamed from: f */
        private C6024o f17291f;

        /* renamed from: g */
        private ArrayList<C14159a> f17292g;

        /* renamed from: h */
        private String f17293h;

        /* renamed from: i */
        private Drawable f17294i;

        /* renamed from: j */
        private String f17295j;

        /* renamed from: k */
        private Drawable f17296k;

        /* renamed from: l */
        private String f17297l;

        /* renamed from: m */
        private String f17298m;

        /* renamed from: n */
        private int f17299n;

        /* renamed from: o */
        private boolean f17300o;

        /* renamed from: p */
        private int f17301p;

        /* renamed from: q */
        private int f17302q;

        /* renamed from: r */
        private String f17303r;

        /* renamed from: s */
        private View f17304s;

        /* renamed from: t */
        private int f17305t;

        /* renamed from: u */
        C14137k f17306u;

        /* renamed from: v */
        private List<String> f17307v;

        /* renamed from: w */
        private List<String> f17308w;

        public C6028s(Activity activity, JSONObject jSONObject) {
            this.f17290e = null;
            this.f17291f = null;
            this.f17302q = -1;
            this.f17303r = null;
            this.f17304s = null;
            this.f17305t = 50;
            this.f17307v = new ArrayList();
            this.f17308w = new ArrayList();
            this.f17286a = activity;
            this.f17287b = C6009d.f17244r0;
            this.f17306u = new C14137k(activity);
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    this.f17306u.mo44708a(str, (Object) (String) jSONObject.get(str));
                }
            } catch (Exception unused) {
            }
            this.f17288c = "";
            this.f17290e = null;
            this.f17291f = null;
            this.f17292g = new ArrayList<>();
            this.f17293h = null;
            this.f17294i = C6031o.m27711b(activity.getApplicationContext(), 17301573);
            this.f17295j = "More...";
            this.f17296k = C6031o.m27711b(activity.getApplicationContext(), 17301582);
            this.f17297l = "Copy link";
            this.f17298m = "Copied link to clipboard!";
        }

        /* renamed from: a */
        public C6028s mo24869a(String str) {
            this.f17306u.mo44707a(str);
            return this;
        }

        /* renamed from: b */
        public C6028s mo24878b(ArrayList<String> arrayList) {
            this.f17306u.mo44709a((List<String>) arrayList);
            return this;
        }

        /* renamed from: c */
        public C6028s mo24883c(int i) {
            this.f17305t = i;
            return this;
        }

        /* renamed from: d */
        public C6028s mo24887d(String str) {
            this.f17306u.mo44690b(str);
            return this;
        }

        /* renamed from: e */
        public C6028s mo24888e(String str) {
            this.f17293h = str;
            return this;
        }

        /* renamed from: f */
        public C6028s mo24892f(String str) {
            this.f17306u.mo44696e(str);
            return this;
        }

        /* renamed from: g */
        public C6028s mo24893g(String str) {
            this.f17288c = str;
            return this;
        }

        /* renamed from: h */
        public C6028s mo24896h(String str) {
            this.f17303r = str;
            return this;
        }

        /* renamed from: i */
        public C6028s mo24898i(String str) {
            this.f17306u.mo44697f(str);
            return this;
        }

        /* renamed from: j */
        public C6028s mo24899j(String str) {
            this.f17289d = str;
            return this;
        }

        /* renamed from: k */
        public int mo24901k() {
            return this.f17305t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public List<String> mo24902l() {
            return this.f17307v;
        }

        /* renamed from: m */
        public boolean mo24903m() {
            return this.f17300o;
        }

        /* renamed from: n */
        public Drawable mo24904n() {
            return this.f17294i;
        }

        /* renamed from: o */
        public String mo24905o() {
            return this.f17295j;
        }

        /* renamed from: p */
        public ArrayList<C14159a> mo24906p() {
            return this.f17292g;
        }

        /* renamed from: q */
        public String mo24907q() {
            return this.f17288c;
        }

        /* renamed from: r */
        public String mo24908r() {
            return this.f17289d;
        }

        /* renamed from: s */
        public String mo24909s() {
            return this.f17303r;
        }

        /* renamed from: t */
        public View mo24910t() {
            return this.f17304s;
        }

        /* renamed from: u */
        public C14137k mo24911u() {
            return this.f17306u;
        }

        /* renamed from: v */
        public int mo24912v() {
            return this.f17299n;
        }

        /* renamed from: w */
        public String mo24913w() {
            return this.f17298m;
        }

        /* renamed from: x */
        public void mo24914x() {
            C6009d.f17244r0.m27488a(this);
        }

        /* renamed from: a */
        public C6028s mo24866a(C6014e eVar) {
            this.f17290e = eVar;
            return this;
        }

        /* renamed from: b */
        public C6028s mo24876b(int i) {
            this.f17302q = i;
            return this;
        }

        /* renamed from: c */
        public C6028s mo24884c(@C0193h0 String str) {
            this.f17307v.add(str);
            return this;
        }

        /* renamed from: d */
        public C6028s mo24886d(int i) {
            this.f17306u.mo44687a(i);
            return this;
        }

        /* renamed from: e */
        public void mo24890e(@C0216r0 int i) {
            this.f17299n = i;
        }

        /* renamed from: f */
        public Drawable mo24891f() {
            return this.f17296k;
        }

        /* renamed from: g */
        public String mo24894g() {
            return this.f17293h;
        }

        /* renamed from: h */
        public int mo24895h() {
            return this.f17301p;
        }

        /* renamed from: i */
        public int mo24897i() {
            return this.f17302q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public List<String> mo24900j() {
            return this.f17308w;
        }

        /* renamed from: a */
        public C6028s mo24867a(C6024o oVar) {
            this.f17291f = oVar;
            return this;
        }

        /* renamed from: b */
        public C6028s mo24877b(@C0193h0 String str) {
            this.f17308w.add(str);
            return this;
        }

        /* renamed from: c */
        public C6014e mo24882c() {
            return this.f17290e;
        }

        /* renamed from: d */
        public C6024o mo24885d() {
            return this.f17291f;
        }

        /* renamed from: e */
        public String mo24889e() {
            return this.f17297l;
        }

        /* renamed from: a */
        public C6028s mo24868a(C14159a aVar) {
            this.f17292g.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C6028s mo24880b(@C0193h0 String[] strArr) {
            this.f17307v.addAll(Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public C6028s mo24871a(ArrayList<C14159a> arrayList) {
            this.f17292g.addAll(arrayList);
            return this;
        }

        /* renamed from: b */
        public C6028s mo24879b(@C0193h0 List<String> list) {
            this.f17307v.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C6028s mo24870a(String str, String str2) {
            try {
                this.f17306u.mo44708a(str, (Object) str2);
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: b */
        public C6009d mo24881b() {
            return this.f17287b;
        }

        /* renamed from: a */
        public C6028s mo24863a(Drawable drawable, String str) {
            this.f17294i = drawable;
            this.f17295j = str;
            return this;
        }

        /* renamed from: a */
        public C6028s mo24861a(int i, int i2) {
            this.f17294i = C6031o.m27711b(this.f17286a.getApplicationContext(), i);
            this.f17295j = this.f17286a.getResources().getString(i2);
            return this;
        }

        /* renamed from: a */
        public C6028s mo24864a(Drawable drawable, String str, String str2) {
            this.f17296k = drawable;
            this.f17297l = str;
            this.f17298m = str2;
            return this;
        }

        /* renamed from: a */
        public C6028s mo24862a(int i, int i2, int i3) {
            this.f17296k = C6031o.m27711b(this.f17286a.getApplicationContext(), i);
            this.f17297l = this.f17286a.getResources().getString(i2);
            this.f17298m = this.f17286a.getResources().getString(i3);
            return this;
        }

        /* renamed from: a */
        public C6028s mo24873a(boolean z) {
            this.f17300o = z;
            return this;
        }

        /* renamed from: a */
        public C6028s mo24860a(@C0216r0 int i) {
            this.f17301p = i;
            return this;
        }

        /* renamed from: a */
        public C6028s mo24865a(View view) {
            this.f17304s = view;
            return this;
        }

        /* renamed from: a */
        public C6028s mo24874a(@C0193h0 String[] strArr) {
            this.f17308w.addAll(Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public C6028s mo24872a(@C0193h0 List<String> list) {
            this.f17308w.addAll(list);
            return this;
        }

        /* renamed from: a */
        public void mo24875a(C14137k kVar) {
            this.f17306u = kVar;
        }

        /* renamed from: a */
        public Activity mo24859a() {
            return this.f17286a;
        }

        public C6028s(Activity activity, C14137k kVar) {
            this(activity, new JSONObject());
            this.f17306u = kVar;
        }
    }

    /* renamed from: io.branch.referral.d$t */
    /* compiled from: Branch */
    private class C6029t extends AsyncTask<C14205y, Void, C14152o0> {
        private C6029t() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C14152o0 doInBackground(C14205y... yVarArr) {
            BranchRemoteInterface c = C6009d.this.f17256c;
            JSONObject f = yVarArr[0].mo45022f();
            StringBuilder sb = new StringBuilder();
            sb.append(C6009d.this.f17257d.mo44969e());
            sb.append("v1/url");
            return c.mo44717a(f, sb.toString(), C14171c.GetURL.mo44768d(), C6009d.this.f17257d.mo44977i());
        }

        /* synthetic */ C6029t(C6009d dVar, C6010a aVar) {
            this();
        }
    }

    private C6009d(@C0193h0 Context context) {
        this.f17257d = C14204x.m61505a(context);
        this.f17253A = new C14167r0(context);
        this.f17256c = BranchRemoteInterface.m61218a(context);
        this.f17258e = new C14161q0(context);
        this.f17262i = C14131h0.m61105a(context);
        this.f17261h = new Semaphore(1);
        this.f17260g = new Object();
        this.f17263j = 0;
        this.f17264k = true;
        this.f17265l = new HashMap();
        this.f17272s = new ConcurrentHashMap<>();
        if (!this.f17253A.mo44763a()) {
            this.f17273t = this.f17258e.mo44743a((C6034a) this);
        }
        if (VERSION.SDK_INT >= 15) {
            this.f17267n = true;
            this.f17266m = C6025p.PENDING;
            return;
        }
        this.f17267n = false;
        this.f17266m = C6025p.READY;
    }

    /* renamed from: A */
    public static void m27454A() {
        f17240n0 = false;
    }

    /* renamed from: B */
    public static void m27455B() {
        f17239m0 = Boolean.valueOf(false);
    }

    /* renamed from: C */
    public static void m27456C() {
        f17238l0 = false;
    }

    /* renamed from: D */
    public static void m27457D() {
        C6031o.f17310a = false;
    }

    /* renamed from: E */
    public static void m27458E() {
        f17240n0 = true;
    }

    /* renamed from: F */
    public static void m27459F() {
        f17239m0 = Boolean.valueOf(true);
    }

    /* renamed from: G */
    public static void m27460G() {
        f17238l0 = true;
    }

    /* renamed from: H */
    public static void m27461H() {
        C6031o.f17310a = true;
    }

    /* renamed from: I */
    private void m27462I() {
        if (this.f17268o != C6027r.UNINITIALISED) {
            if (!this.f17264k) {
                C14205y f = this.f17262i.mo44661f();
                if ((f != null && (f instanceof C14145l0)) || (f instanceof C14147m0)) {
                    this.f17262i.mo44659d();
                }
            } else if (!this.f17262i.mo44656b()) {
                mo24758a((C14205y) new C14138k0(this.f17259f));
            }
            this.f17268o = C6027r.UNINITIALISED;
        }
    }

    @TargetApi(14)
    /* renamed from: J */
    public static C6009d m27463J() {
        if (f17244r0 != null && f17245s0) {
            boolean z = f17246t0;
        }
        return f17244r0;
    }

    /* renamed from: K */
    private boolean m27464K() {
        return !this.f17257d.mo44981k().equals("bnc_no_value");
    }

    /* renamed from: L */
    private boolean m27465L() {
        return !this.f17257d.mo44932E().equals("bnc_no_value");
    }

    /* renamed from: M */
    private boolean m27466M() {
        return !this.f17257d.mo44995r().equals("bnc_no_value");
    }

    /* renamed from: N */
    public static boolean m27467N() {
        return f17237k0;
    }

    /* renamed from: O */
    public static boolean m27468O() {
        return f17240n0;
    }

    /* renamed from: P */
    private void m27469P() {
        if (!this.f17253A.mo44763a()) {
            C14175t a = C14175t.m61316a(this.f17257d.mo44983l(), this.f17258e, f17237k0);
            WeakReference<Activity> weakReference = this.f17270q;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            Context applicationContext = activity != null ? activity.getApplicationContext() : null;
            if (applicationContext != null) {
                this.f17262i.mo44662g();
                C14139l.m61177a().mo44699a(applicationContext, f17200C0, a, this.f17257d, this.f17258e, new C6011b());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m27470Q() {
        try {
            this.f17261h.acquire();
            if (this.f17263j != 0 || this.f17262i.mo44660e() <= 0) {
                this.f17261h.release();
                return;
            }
            this.f17263j = 1;
            C14205y f = this.f17262i.mo44661f();
            this.f17261h.release();
            if (f == null) {
                this.f17262i.mo44657b((C14205y) null);
            } else if (f.mo45025m()) {
                this.f17263j = 0;
            } else if (!(f instanceof C14145l0) && !m27466M()) {
                this.f17263j = 0;
                m27481a(this.f17262i.mo44660e() - 1, (int) C14130h.f41548c);
            } else if ((f instanceof C14125e0) || (m27465L() && m27464K())) {
                new C6016g(f).mo44642a(new Void[0]);
            } else {
                this.f17263j = 0;
                m27481a(this.f17262i.mo44660e() - 1, (int) C14130h.f41548c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m27471R() {
        int i = 0;
        while (i < this.f17262i.mo44660e()) {
            try {
                C14205y a = this.f17262i.mo44648a(i);
                if (a != null) {
                    JSONObject f = a.mo45022f();
                    if (f != null) {
                        if (f.has(C14169a.SessionID.mo44764d())) {
                            a.mo45022f().put(C14169a.SessionID.mo44764d(), this.f17257d.mo44932E());
                        }
                        if (f.has(C14169a.IdentityID.mo44764d())) {
                            a.mo45022f().put(C14169a.IdentityID.mo44764d(), this.f17257d.mo44995r());
                        }
                        if (f.has(C14169a.DeviceFingerprintID.mo44764d())) {
                            a.mo45022f().put(C14169a.DeviceFingerprintID.mo44764d(), this.f17257d.mo44981k());
                        }
                    }
                }
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m27545z() {
        ActivityInfo activityInfo;
        JSONObject m = mo24819m();
        String str = null;
        try {
            if (m.has(C14169a.Clicked_Branch_Link.mo44764d())) {
                if (m.getBoolean(C14169a.Clicked_Branch_Link.mo44764d())) {
                    if (m.length() > 0) {
                        ApplicationInfo applicationInfo = this.f17259f.getPackageManager().getApplicationInfo(this.f17259f.getPackageName(), 128);
                        int i = 0;
                        if (applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean(f17251y0, false)) {
                            ActivityInfo[] activityInfoArr = this.f17259f.getPackageManager().getPackageInfo(this.f17259f.getPackageName(), C13959t.f40835R1).activities;
                            int i2 = f17196A0;
                            if (activityInfoArr != null) {
                                int length = activityInfoArr.length;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    activityInfo = activityInfoArr[i];
                                    if (activityInfo == null || activityInfo.metaData == null || ((activityInfo.metaData.getString(f17249w0) == null && activityInfo.metaData.getString(f17250x0) == null) || (!m27502a(m, activityInfo) && !m27515b(m, activityInfo)))) {
                                        i++;
                                    }
                                }
                                str = activityInfo.name;
                                i2 = activityInfo.metaData.getInt(f17252z0, f17196A0);
                            }
                            if (!(str == null || this.f17270q == null)) {
                                Activity activity = (Activity) this.f17270q.get();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, Class.forName(str));
                                    intent.putExtra(f17248v0, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                                    intent.putExtra(C14169a.ReferringData.mo44764d(), m.toString());
                                    Iterator keys = m.keys();
                                    while (keys.hasNext()) {
                                        String str2 = (String) keys.next();
                                        intent.putExtra(str2, m.getString(str2));
                                    }
                                    activity.startActivityForResult(intent, i2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (NameNotFoundException | Exception unused) {
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Branch Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity ");
            sb.append(null);
            sb.toString();
        }
    }

    /* renamed from: c */
    public void mo24801c(String str, String str2) {
    }

    /* renamed from: d */
    public void mo24803d() {
    }

    /* renamed from: f */
    public void mo24811f() {
    }

    /* renamed from: p */
    public boolean mo24822p() {
        return this.f17253A.mo44763a();
    }

    /* renamed from: q */
    public boolean mo24823q() {
        return !this.f17257d.mo44993q().equals("bnc_no_value");
    }

    /* renamed from: r */
    public void mo24824r() {
        mo24753a((C6018i) null);
    }

    /* renamed from: s */
    public void mo24825s() {
        mo24754a((C6026q) null);
    }

    /* renamed from: t */
    public void mo24826t() {
        mo24758a((C14205y) new C14129g0(this.f17259f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo24827u() {
        if (!this.f17253A.mo44763a()) {
            this.f17273t = this.f17258e.mo44743a((C6034a) this);
        }
        if (this.f17263j != 0) {
            this.f17263j = 0;
            this.f17262i.mo44649a();
        }
        C14205y c = m27518c((C6017h) null);
        if (this.f17273t) {
            c.mo45015a(C14207b.GAID_FETCH_WAIT_LOCK);
        }
        m27494a(c, (C6017h) null);
    }

    /* renamed from: v */
    public void mo24828v() {
        this.f17268o = C6027r.UNINITIALISED;
    }

    /* renamed from: w */
    public void mo24829w() {
        m27461H();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo24830x() {
        C14172s0.m61307b(this.f17259f).mo44770a(this.f17259f);
    }

    /* renamed from: c */
    public static C6009d m27516c(@C0193h0 Context context) {
        return m27478a(context, true, (String) null);
    }

    /* renamed from: d */
    public static C6009d m27521d(@C0193h0 Context context) {
        return m27478a(context, false, (String) null);
    }

    /* renamed from: e */
    public static void m27527e(boolean z) {
        f17206F0 = z;
    }

    /* renamed from: f */
    public void mo24812f(@C0193h0 String str, @C0193h0 String str2) {
        this.f17257d.mo44956b(str, str2);
    }

    /* renamed from: g */
    public void mo24813g() {
        this.f17255b = true;
    }

    /* renamed from: h */
    public Context mo24814h() {
        return this.f17259f;
    }

    /* renamed from: i */
    public int mo24815i() {
        return this.f17257d.mo44979j();
    }

    /* renamed from: j */
    public JSONObject mo24816j() {
        JSONObject jSONObject = this.f17254a;
        if (jSONObject != null) {
            int length = jSONObject.length();
        }
        return this.f17254a;
    }

    /* renamed from: k */
    public JSONObject mo24817k() {
        return m27508b(m27531f(this.f17257d.mo44999t()));
    }

    /* renamed from: l */
    public JSONObject mo24818l() {
        this.f17275v = new CountDownLatch(1);
        if (this.f17257d.mo44999t().equals("bnc_no_value")) {
            try {
                this.f17275v.await((long) f17202D0, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        JSONObject b = m27508b(m27531f(this.f17257d.mo44999t()));
        this.f17275v = null;
        return b;
    }

    /* renamed from: m */
    public JSONObject mo24819m() {
        return m27508b(m27531f(this.f17257d.mo44933F()));
    }

    /* renamed from: n */
    public JSONObject mo24820n() {
        this.f17276w = new CountDownLatch(1);
        try {
            if (this.f17268o != C6027r.INITIALISED) {
                this.f17276w.await((long) f17202D0, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
        JSONObject b = m27508b(m27531f(this.f17257d.mo44933F()));
        this.f17276w = null;
        return b;
    }

    /* renamed from: o */
    public boolean mo24821o() {
        return mo24772a((Activity) null);
    }

    /* renamed from: e */
    private static C6009d m27525e(@C0193h0 Context context) {
        return new C6009d(context.getApplicationContext());
    }

    /* renamed from: f */
    private JSONObject m27531f(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(C14119c.m61049a(str.getBytes(), 2)));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    /* renamed from: g */
    public static void m27534g(String str) {
        f17200C0 = str;
    }

    /* renamed from: b */
    public void mo24796b(boolean z) {
        this.f17253A.mo44762a(this.f17259f, z);
    }

    /* renamed from: c */
    public void mo24800c(int i) {
        C14204x xVar = this.f17257d;
        if (xVar != null && i >= 0) {
            xVar.mo44954b(i);
        }
    }

    /* renamed from: d */
    public void mo24804d(int i) {
        C14204x xVar = this.f17257d;
        if (xVar != null && i > 0) {
            xVar.mo44959c(i);
        }
    }

    /* renamed from: b */
    public static void m27509b(long j) {
        f17241o0 = j > 0;
        f17242p0 = j;
    }

    /* renamed from: g */
    private boolean m27535g(String str, String str2) {
        String str3 = "\\?";
        boolean z = false;
        String str4 = "/";
        String[] split = str.split(str3)[0].split(str4);
        String[] split2 = str2.split(str3)[0].split(str4);
        if (split.length != split2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < split.length && i < split2.length) {
                String str5 = split[i];
                if (!str5.equals(split2[i]) && !str5.contains(C14069f.f41343G)) {
                    break;
                }
                i++;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public C6009d mo24808e(@C0193h0 String str, @C0193h0 String str2) {
        this.f17257d.mo44950a(str, str2);
        return this;
    }

    /* renamed from: e */
    private boolean m27528e(C6017h hVar) {
        if (hVar != null) {
            if (!f17245s0) {
                hVar.mo24851a(new JSONObject(), null);
            } else if (!this.f17271r) {
                hVar.mo24851a(mo24819m(), null);
                this.f17271r = true;
            } else {
                hVar.mo24851a(new JSONObject(), null);
            }
        }
        return this.f17271r;
    }

    /* renamed from: c */
    public boolean mo24802c(boolean z) {
        return mo24780a((C6017h) null, z, (Activity) null);
    }

    /* renamed from: d */
    public void mo24807d(boolean z) {
        this.f17257d.mo44962c(z);
    }

    /* renamed from: b */
    public static C6009d m27505b(@C0193h0 Context context, @C0193h0 String str) {
        if (f17244r0 == null) {
            f17244r0 = m27525e(context);
        }
        f17244r0.f17259f = context.getApplicationContext();
        if (str.startsWith("key_") && f17244r0.f17257d.mo44984l(str)) {
            f17244r0.f17265l.clear();
            f17244r0.f17262i.mo44649a();
        }
        return f17244r0;
    }

    /* renamed from: d */
    private boolean m27524d(Activity activity) {
        return (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(C14169a.BranchLinkUsed.mo44764d(), false)) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo24799c() {
        this.f17262i.mo44649a();
    }

    /* renamed from: c */
    public int mo24798c(String str) {
        return this.f17257d.mo44968e(str);
    }

    /* renamed from: d */
    public void mo24805d(@C0193h0 String str) {
        mo24763a(str, (C6017h) null);
    }

    /* renamed from: c */
    private void m27519c(C14205y yVar) {
        if (this.f17263j == 0) {
            this.f17262i.mo44653a(yVar, 0);
        } else {
            this.f17262i.mo44653a(yVar, 1);
        }
    }

    /* renamed from: d */
    private void m27523d(C6017h hVar) {
        if (this.f17257d.mo44977i() != null) {
            String str = "bnc_no_value";
            if (!this.f17257d.mo44977i().equalsIgnoreCase(str)) {
                if (this.f17257d.mo44977i() != null) {
                    boolean startsWith = this.f17257d.mo44977i().startsWith("key_test_");
                }
                if (!this.f17257d.mo44987n().equals(str) || !this.f17255b) {
                    m27486a(hVar, (C14207b) null);
                } else if (C14164r.m61295a(this.f17259f, new C6010a()).booleanValue()) {
                    m27486a(hVar, C14207b.FB_APP_LINK_WAIT_LOCK);
                } else {
                    m27486a(hVar, (C14207b) null);
                }
                return;
            }
        }
        this.f17268o = C6027r.UNINITIALISED;
        if (hVar != null) {
            hVar.mo24851a(null, new C14130h("Trouble initializing Branch.", C14130h.f41561p));
        }
    }

    /* renamed from: f */
    public static boolean m27532f(@C0193h0 Context context) {
        return C14201v.m61496a(context);
    }

    /* renamed from: c */
    private C14205y m27518c(C6017h hVar) {
        if (m27466M()) {
            return new C14147m0(this.f17259f, hVar, this.f17258e);
        }
        return new C14145l0(this.f17259f, hVar, this.f17258e, InstallListener.m60986c());
    }

    /* renamed from: a */
    public void mo24755a(BranchRemoteInterface branchRemoteInterface) {
        this.f17256c = branchRemoteInterface;
    }

    /* renamed from: a */
    public static void m27482a(long j) {
        m27509b(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo24809e() {
        m27462I();
        this.f17274u = null;
        this.f17253A.mo44761a(this.f17259f);
    }

    /* renamed from: a */
    private static C6009d m27478a(@C0193h0 Context context, boolean z, String str) {
        boolean z2;
        if (f17244r0 == null) {
            f17244r0 = m27525e(context);
            if (TextUtils.isEmpty(str)) {
                str = f17244r0.f17257d.mo44942a(z);
            }
            String str2 = "bnc_no_value";
            if (str == null || str.equalsIgnoreCase(str2)) {
                String str3 = null;
                try {
                    Resources resources = context.getResources();
                    str3 = resources.getString(resources.getIdentifier(f17198B0, "string", context.getPackageName()));
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(str3)) {
                    z2 = f17244r0.f17257d.mo44984l(str3);
                } else {
                    z2 = f17244r0.f17257d.mo44984l(str2);
                }
            } else {
                z2 = f17244r0.f17257d.mo44984l(str);
            }
            if (z2) {
                f17244r0.f17265l.clear();
                f17244r0.f17262i.mo44649a();
            }
            f17244r0.f17259f = context.getApplicationContext();
            if (context instanceof Application) {
                f17245s0 = true;
                f17244r0.m27484a((Application) context);
            }
        }
        return f17244r0;
    }

    @TargetApi(14)
    /* renamed from: b */
    public static C6009d m27504b(@C0193h0 Context context) {
        f17245s0 = true;
        f17247u0 = C6020k.USE_DEFAULT;
        m27478a(context, false, (String) null);
        return f17244r0;
    }

    /* renamed from: c */
    public static boolean m27520c(Activity activity) {
        return activity.getIntent().getStringExtra(f17248v0) != null;
    }

    /* renamed from: e */
    public void mo24810e(String str) {
        mo24768a(str, (JSONObject) null, (C6033d) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27526e(Activity activity) {
        Uri data = activity.getIntent() != null ? activity.getIntent().getData() : null;
        this.f17271r = false;
        mo24774a(data, activity);
    }

    /* renamed from: d */
    public void mo24806d(String str, String str2) {
        this.f17272s.put(str, str2);
    }

    @TargetApi(14)
    /* renamed from: b */
    public static C6009d m27506b(@C0193h0 Context context, boolean z) {
        f17245s0 = true;
        f17247u0 = z ? C6020k.REFERRABLE : C6020k.NON_REFERRABLE;
        m27478a(context, false, (String) null);
        return f17244r0;
    }

    /* renamed from: b */
    public void mo24794b(int i) {
        C14204x xVar = this.f17257d;
        if (xVar != null && i > 0) {
            xVar.mo44966d(i);
        }
    }

    /* renamed from: b */
    public boolean mo24797b(C6017h hVar) {
        m27458E();
        if (!mo24776a(hVar, (Activity) null)) {
            return false;
        }
        m27470Q();
        return true;
    }

    /* renamed from: b */
    public static void m27511b(String str, int i) {
        f17200C0 = str;
        C14139l.m61177a().mo44698a(i);
    }

    /* renamed from: b */
    private boolean m27513b(Uri uri, Activity activity) {
        String str;
        String[] strArr;
        if (!f17206F0 && !((this.f17266m != C6025p.READY && !this.f17279z) || activity == null || activity.getIntent() == null || this.f17268o == C6027r.INITIALISED || m27499a(activity.getIntent()))) {
            Intent intent = activity.getIntent();
            if (intent.getData() == null || (!this.f17279z && m27524d(activity))) {
                if (!this.f17257d.mo44999t().equals("bnc_no_value")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C14169a.Clicked_Branch_Link.mo44764d(), false);
                        jSONObject.put(C14169a.IsFirstSession.mo44764d(), false);
                        this.f17257d.mo45012z(jSONObject.toString());
                        this.f17278y = true;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (!TextUtils.isEmpty(intent.getStringExtra(C14169a.BranchData.mo44764d()))) {
                try {
                    JSONObject jSONObject2 = new JSONObject(intent.getStringExtra(C14169a.BranchData.mo44764d()));
                    jSONObject2.put(C14169a.Clicked_Branch_Link.mo44764d(), true);
                    this.f17257d.mo45012z(jSONObject2.toString());
                    this.f17278y = true;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                intent.removeExtra(C14169a.BranchData.mo44764d());
                activity.setIntent(intent);
            } else if (uri.getQueryParameterNames() != null && Boolean.valueOf(uri.getQueryParameter(C14169a.Instant.mo44764d())).booleanValue()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str2 : uri.getQueryParameterNames()) {
                        jSONObject3.put(str2, uri.getQueryParameter(str2));
                    }
                    jSONObject3.put(C14169a.Clicked_Branch_Link.mo44764d(), true);
                    this.f17257d.mo45012z(jSONObject3.toString());
                    this.f17278y = true;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        if (this.f17266m == C6025p.READY) {
            if (uri != null) {
                try {
                    if (!m27524d(activity)) {
                        String c = C14172s0.m61307b(this.f17259f).mo44774c(uri.toString());
                        this.f17274u = c;
                        this.f17257d.mo44990o(c);
                        if (!(c == null || !c.equals(uri.toString()) || activity == null || activity.getIntent() == null || activity.getIntent().getExtras() == null)) {
                            Bundle extras = activity.getIntent().getExtras();
                            Set keySet = extras.keySet();
                            if (keySet.size() > 0) {
                                JSONObject jSONObject4 = new JSONObject();
                                for (String str3 : f17204E0) {
                                    if (keySet.contains(str3)) {
                                        jSONObject4.put(str3, extras.get(str3));
                                    }
                                }
                                if (jSONObject4.length() > 0) {
                                    this.f17257d.mo44988n(jSONObject4.toString());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (activity != null) {
                try {
                    if (!(activity.getIntent() == null || activity.getIntent().getExtras() == null || m27524d(activity))) {
                        String string = activity.getIntent().getExtras().getString(C14169a.AndroidPushNotificationKey.mo44764d());
                        if (string != null && string.length() > 0) {
                            this.f17257d.mo45008x(string);
                            Intent intent2 = activity.getIntent();
                            intent2.putExtra(C14169a.BranchLinkUsed.mo44764d(), true);
                            activity.setIntent(intent2);
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (uri != null && uri.isHierarchical() && activity != null && !m27512b(activity)) {
                try {
                    if (uri.getQueryParameter(C14169a.LinkClickID.mo44764d()) != null) {
                        this.f17257d.mo45006w(uri.getQueryParameter(C14169a.LinkClickID.mo44764d()));
                        StringBuilder sb = new StringBuilder();
                        sb.append("link_click_id=");
                        sb.append(uri.getQueryParameter(C14169a.LinkClickID.mo44764d()));
                        String sb2 = sb.toString();
                        String str4 = null;
                        if (activity.getIntent() != null) {
                            str4 = activity.getIntent().getDataString();
                        }
                        if (uri.getQuery().length() == sb2.length()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("\\?");
                            sb3.append(sb2);
                            str = sb3.toString();
                        } else {
                            String str5 = "&";
                            if (str4 != null) {
                                if (str4.length() - sb2.length() == str4.indexOf(sb2)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str5);
                                    sb4.append(sb2);
                                    str = sb4.toString();
                                }
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb2);
                            sb5.append(str5);
                            str = sb5.toString();
                        }
                        if (str4 != null) {
                            activity.getIntent().setData(Uri.parse(str4.replaceFirst(str, "")));
                            activity.getIntent().putExtra(C14169a.BranchLinkUsed.mo44764d(), true);
                        }
                        return true;
                    }
                    String scheme = uri.getScheme();
                    Intent intent3 = activity.getIntent();
                    if (!(scheme == null || intent3 == null || ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) || uri.getHost() == null || uri.getHost().length() <= 0 || m27524d(activity)))) {
                        if (uri.toString().equalsIgnoreCase(C14172s0.m61307b(this.f17259f).mo44774c(uri.toString()))) {
                            this.f17257d.mo44980j(uri.toString());
                        }
                        intent3.putExtra(C14169a.BranchLinkUsed.mo44764d(), true);
                        activity.setIntent(intent3);
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return false;
    }

    @TargetApi(14)
    /* renamed from: a */
    public static C6009d m27475a(@C0193h0 Context context) {
        f17245s0 = true;
        f17247u0 = C6020k.USE_DEFAULT;
        m27478a(context, true ^ C6031o.m27714c(context), (String) null);
        return f17244r0;
    }

    @TargetApi(14)
    /* renamed from: a */
    public static C6009d m27477a(@C0193h0 Context context, boolean z) {
        f17245s0 = true;
        f17247u0 = z ? C6020k.REFERRABLE : C6020k.NON_REFERRABLE;
        m27478a(context, !C6031o.m27714c(context), (String) null);
        return f17244r0;
    }

    @TargetApi(14)
    /* renamed from: a */
    public static C6009d m27476a(@C0193h0 Context context, @C0193h0 String str) {
        f17245s0 = true;
        f17247u0 = C6020k.USE_DEFAULT;
        m27478a(context, true ^ C6031o.m27714c(context), str);
        if (str.startsWith("key_") && f17244r0.f17257d.mo44984l(str)) {
            f17244r0.f17265l.clear();
            f17244r0.f17262i.mo44649a();
        }
        return f17244r0;
    }

    /* renamed from: a */
    public static void m27495a(Boolean bool) {
        f17237k0 = bool.booleanValue();
    }

    /* renamed from: a */
    public void mo24770a(JSONObject jSONObject) {
        this.f17254a = jSONObject;
    }

    /* renamed from: a */
    public boolean mo24783a(C6019j jVar) {
        return mo24784a(jVar, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24775a(C6017h hVar) {
        return mo24776a(hVar, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24784a(C6019j jVar, Activity activity) {
        if (f17247u0 == C6020k.USE_DEFAULT) {
            m27487a(jVar, activity, true);
        } else {
            m27487a(jVar, activity, f17247u0 == C6020k.REFERRABLE);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo24776a(C6017h hVar, Activity activity) {
        if (f17247u0 == C6020k.USE_DEFAULT) {
            m27485a(hVar, activity, true);
        } else {
            m27485a(hVar, activity, f17247u0 == C6020k.REFERRABLE);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo24785a(C6019j jVar, Uri uri) {
        return mo24786a(jVar, uri, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24777a(C6017h hVar, Uri uri) {
        return mo24778a(hVar, uri, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24786a(C6019j jVar, Uri uri, Activity activity) {
        m27513b(uri, activity);
        mo24784a(jVar, activity);
        return true;
    }

    /* renamed from: a */
    public boolean mo24778a(C6017h hVar, Uri uri, Activity activity) {
        m27513b(uri, activity);
        return mo24776a(hVar, activity);
    }

    /* renamed from: a */
    public boolean mo24772a(Activity activity) {
        return mo24776a((C6017h) null, activity);
    }

    /* renamed from: a */
    public boolean mo24773a(Uri uri) {
        return mo24774a(uri, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24774a(Uri uri, Activity activity) {
        m27513b(uri, activity);
        return mo24776a((C6017h) null, activity);
    }

    /* renamed from: a */
    public boolean mo24791a(boolean z, @C0193h0 Activity activity) {
        return mo24780a((C6017h) null, z, activity);
    }

    /* renamed from: a */
    public boolean mo24789a(C6019j jVar, boolean z, Uri uri) {
        return mo24790a(jVar, z, uri, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24781a(C6017h hVar, boolean z, Uri uri) {
        return mo24782a(hVar, z, uri, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24790a(C6019j jVar, boolean z, Uri uri, Activity activity) {
        m27513b(uri, activity);
        return mo24788a(jVar, z, activity);
    }

    /* renamed from: a */
    public boolean mo24782a(C6017h hVar, boolean z, Uri uri, Activity activity) {
        m27513b(uri, activity);
        return mo24780a(hVar, z, activity);
    }

    /* renamed from: a */
    public boolean mo24787a(C6019j jVar, boolean z) {
        return mo24788a(jVar, z, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24779a(C6017h hVar, boolean z) {
        return mo24780a(hVar, z, (Activity) null);
    }

    /* renamed from: a */
    public boolean mo24788a(C6019j jVar, boolean z, Activity activity) {
        m27487a(jVar, activity, z);
        return true;
    }

    /* renamed from: a */
    public boolean mo24780a(C6017h hVar, boolean z, Activity activity) {
        m27485a(hVar, activity, z);
        return true;
    }

    /* renamed from: a */
    private void m27487a(C6019j jVar, Activity activity, boolean z) {
        m27485a((C6017h) new C14146m(jVar), activity, z);
    }

    /* renamed from: a */
    private void m27485a(C6017h hVar, Activity activity, boolean z) {
        if (activity != null) {
            this.f17270q = new WeakReference<>(activity);
        }
        if (!m27466M() || !m27465L() || this.f17268o != C6027r.INITIALISED) {
            if (this.f17278y && m27528e(hVar)) {
                mo24806d(C14169a.InstantDeepLinkSession.mo44764d(), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                this.f17278y = false;
                m27545z();
            }
            if (z) {
                this.f17257d.mo44939L();
            } else {
                this.f17257d.mo44953b();
            }
            C6027r rVar = this.f17268o;
            C6027r rVar2 = C6027r.INITIALISING;
            if (rVar != rVar2) {
                this.f17268o = rVar2;
                m27523d(hVar);
            } else if (hVar != null) {
                this.f17262i.mo44650a(hVar);
            }
        } else {
            m27528e(hVar);
            this.f17278y = false;
        }
    }

    /* renamed from: a */
    public void mo24744a() {
        this.f17262i.mo44651a(C14207b.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        m27470Q();
    }

    /* renamed from: a */
    public C6009d mo24746a(List<String> list) {
        if (list != null) {
            C14172s0.m61307b(this.f17259f).mo44772a(list);
        }
        return this;
    }

    /* renamed from: a */
    public C6009d mo24745a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C14172s0.m61307b(this.f17259f).mo44773b(str);
        }
        return this;
    }

    /* renamed from: b */
    private boolean m27512b(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) ? false : true;
    }

    /* renamed from: a */
    public void mo24763a(@C0193h0 String str, @C0195i0 C6017h hVar) {
        C14124d0 d0Var = new C14124d0(this.f17259f, hVar, str);
        if (!d0Var.f41897j && !d0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) d0Var);
        } else if (d0Var.mo44623u()) {
            d0Var.mo44633a(f17244r0);
        }
    }

    /* renamed from: b */
    public void mo24793b() {
        this.f17273t = false;
        this.f17262i.mo44651a(C14207b.GAID_FETCH_WAIT_LOCK);
        if (this.f17277x) {
            m27469P();
            this.f17277x = false;
            return;
        }
        m27470Q();
    }

    /* renamed from: a */
    public void mo24754a(C6026q qVar) {
        C14127f0 f0Var = new C14127f0(this.f17259f, qVar);
        if (!f0Var.f41897j && !f0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) f0Var);
        }
    }

    /* renamed from: b */
    public C6009d mo24792b(String str) {
        if (str != null) {
            C14172s0.m61307b(this.f17259f).mo44771a(str);
        }
        return this;
    }

    /* renamed from: b */
    private JSONObject m27508b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (this.f17254a != null) {
                    int length = this.f17254a.length();
                    Iterator keys = this.f17254a.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        jSONObject.put(str, this.f17254a.get(str));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo24753a(C6018i iVar) {
        C14123c0 c0Var = new C14123c0(this.f17259f, iVar);
        if (!c0Var.f41897j && !c0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) c0Var);
        }
    }

    /* renamed from: a */
    public void mo24748a(int i) {
        mo24760a(C14169a.DefaultBucket.mo44764d(), i, (C6018i) null);
    }

    /* renamed from: a */
    public void mo24749a(int i, C6018i iVar) {
        mo24760a(C14169a.DefaultBucket.mo44764d(), i, iVar);
    }

    /* renamed from: a */
    public void mo24759a(@C0193h0 String str, int i) {
        mo24760a(str, i, (C6018i) null);
    }

    /* renamed from: b */
    private String m27507b(C14116a0 a0Var) {
        C14152o0 o0Var;
        if (this.f17253A.mo44763a()) {
            return a0Var.mo44624v();
        }
        String str = null;
        if (this.f17268o == C6027r.INITIALISED) {
            try {
                int G = this.f17257d.mo44934G() + 2000;
                o0Var = (C14152o0) new C6029t(this, null).execute(new C14205y[]{a0Var}).get((long) G, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                o0Var = null;
            }
            if (a0Var.mo44627y()) {
                str = a0Var.mo44624v();
            }
            if (o0Var != null && o0Var.mo44722d() == 200) {
                try {
                    str = o0Var.mo44721c().getString("url");
                    if (a0Var.mo44623u() != null) {
                        this.f17265l.put(a0Var.mo44623u(), str);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public void mo24760a(@C0193h0 String str, int i, C6018i iVar) {
        C14136j0 j0Var = new C14136j0(this.f17259f, str, i, iVar);
        if (!j0Var.f41897j && !j0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) j0Var);
        }
    }

    /* renamed from: a */
    public void mo24752a(C6015f fVar) {
        mo24766a(null, null, 100, C6021l.kMostRecentFirst, fVar);
    }

    /* renamed from: a */
    public void mo24762a(@C0193h0 String str, C6015f fVar) {
        mo24766a(str, null, 100, C6021l.kMostRecentFirst, fVar);
    }

    /* renamed from: a */
    public void mo24761a(@C0193h0 String str, int i, @C0193h0 C6021l lVar, C6015f fVar) {
        mo24766a(null, str, i, lVar, fVar);
    }

    /* renamed from: a */
    public void mo24766a(String str, String str2, int i, @C0193h0 C6021l lVar, C6015f fVar) {
        C14118b0 b0Var = new C14118b0(this.f17259f, str, str2, i, lVar, fVar);
        if (!b0Var.f41897j && !b0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) b0Var);
        }
    }

    /* renamed from: a */
    public void mo24767a(@C0193h0 String str, JSONObject jSONObject) {
        mo24768a(str, jSONObject, (C6033d) null);
    }

    /* renamed from: a */
    public void mo24764a(String str, C6033d dVar) {
        mo24768a(str, (JSONObject) null, dVar);
    }

    /* renamed from: a */
    public void mo24768a(@C0193h0 String str, JSONObject jSONObject, C6033d dVar) {
        C14208z zVar = new C14208z(this.f17259f, str, jSONObject, dVar);
        if (!zVar.f41897j && !zVar.mo44620b(this.f17259f)) {
            mo24758a((C14205y) zVar);
        }
    }

    /* renamed from: b */
    private void m27510b(C14205y yVar) {
        mo24758a(yVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27515b(org.json.JSONObject r5, android.content.pm.ActivityInfo r6) {
        /*
            r4 = this;
            r0 = 0
            io.branch.referral.s$a r1 = p212io.branch.referral.C14168s.C14169a.AndroidDeepLinkPath     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r1.mo44764d()     // Catch:{ JSONException -> 0x0030 }
            boolean r1 = r5.has(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0019
            io.branch.referral.s$a r1 = p212io.branch.referral.C14168s.C14169a.AndroidDeepLinkPath     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r1.mo44764d()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r5 = r5.getString(r1)     // Catch:{ JSONException -> 0x0030 }
        L_0x0017:
            r0 = r5
            goto L_0x0031
        L_0x0019:
            io.branch.referral.s$a r1 = p212io.branch.referral.C14168s.C14169a.DeepLinkPath     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r1.mo44764d()     // Catch:{ JSONException -> 0x0030 }
            boolean r1 = r5.has(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0031
            io.branch.referral.s$a r1 = p212io.branch.referral.C14168s.C14169a.DeepLinkPath     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r1.mo44764d()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r5 = r5.getString(r1)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0017
        L_0x0030:
        L_0x0031:
            android.os.Bundle r5 = r6.metaData
            java.lang.String r1 = "io.branch.sdk.auto_link_path"
            java.lang.String r5 = r5.getString(r1)
            r2 = 0
            if (r5 == 0) goto L_0x005f
            if (r0 == 0) goto L_0x005f
            android.os.Bundle r5 = r6.metaData
            java.lang.String r5 = r5.getString(r1)
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r1 = 0
        L_0x004c:
            if (r1 >= r6) goto L_0x005f
            r3 = r5[r1]
            java.lang.String r3 = r3.trim()
            boolean r3 = r4.m27535g(r3, r0)
            if (r3 == 0) goto L_0x005c
            r5 = 1
            return r5
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C6009d.m27515b(org.json.JSONObject, android.content.pm.ActivityInfo):boolean");
    }

    /* renamed from: a */
    public void mo24757a(@C0193h0 C14196d dVar, JSONObject jSONObject, C6033d dVar2) {
        C14134i0 i0Var = new C14134i0(this.f17259f, dVar, jSONObject, dVar2);
        if (!i0Var.f41897j && !i0Var.mo44620b(this.f17259f)) {
            mo24758a((C14205y) i0Var);
        }
    }

    /* renamed from: a */
    public void mo24756a(@C0193h0 C14196d dVar) {
        mo24757a(dVar, (JSONObject) null, (C6033d) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo24747a(C14116a0 a0Var) {
        if (!a0Var.f41897j && !a0Var.mo44620b(this.f17259f)) {
            if (this.f17265l.containsKey(a0Var.mo44623u())) {
                String str = (String) this.f17265l.get(a0Var.mo44623u());
                a0Var.mo44618a(str);
                return str;
            } else if (!a0Var.mo44626x()) {
                return m27507b(a0Var);
            } else {
                m27510b((C14205y) a0Var);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo24795b(String str, String str2) {
        if (C14125e0.m61075a(str)) {
            m27545z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27488a(C6028s sVar) {
        ShareLinkManager shareLinkManager = this.f17269p;
        if (shareLinkManager != null) {
            shareLinkManager.mo44593a(true);
        }
        this.f17269p = new ShareLinkManager();
        this.f17269p.mo44592a(sVar);
    }

    /* renamed from: a */
    public void mo24771a(boolean z) {
        ShareLinkManager shareLinkManager = this.f17269p;
        if (shareLinkManager != null) {
            shareLinkManager.mo44593a(z);
        }
    }

    /* renamed from: a */
    private String m27480a(Date date) {
        return DateFormat.format("yyyy-MM-dd", date).toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27481a(int i, int i2) {
        C14205y yVar;
        if (i >= this.f17262i.mo44660e()) {
            C14131h0 h0Var = this.f17262i;
            yVar = h0Var.mo44648a(h0Var.mo44660e() - 1);
        } else {
            yVar = this.f17262i.mo44648a(i);
        }
        m27493a(yVar, i2);
    }

    /* renamed from: a */
    private void m27493a(C14205y yVar, int i) {
        if (yVar != null) {
            yVar.mo44616a(i, "");
        }
    }

    /* renamed from: a */
    private void m27494a(C14205y yVar, C6017h hVar) {
        if (!this.f17262i.mo44658c()) {
            m27519c(yVar);
        } else {
            if (hVar != null) {
                this.f17262i.mo44650a(hVar);
            }
            this.f17262i.mo44654a(yVar, this.f17263j, hVar);
        }
        m27470Q();
    }

    /* renamed from: a */
    private void m27486a(C6017h hVar, C14207b bVar) {
        C14205y c = m27518c(hVar);
        c.mo45015a(bVar);
        if (this.f17273t) {
            c.mo45015a(C14207b.GAID_FETCH_WAIT_LOCK);
        }
        if (this.f17266m != C6025p.READY && !m27468O()) {
            c.mo45015a(C14207b.INTENT_PENDING_WAIT_LOCK);
        }
        if (f17241o0 && (c instanceof C14145l0) && !InstallListener.f41461e) {
            c.mo45015a(C14207b.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            InstallListener.m60982a(this.f17259f, f17242p0, this);
        }
        m27494a(c, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27483a(Activity activity, boolean z) {
        this.f17262i.mo44651a(C14207b.INTENT_PENDING_WAIT_LOCK);
        if (z) {
            m27513b(activity.getIntent().getData(), activity);
            if (mo24822p() || f17200C0 == null || this.f17257d.mo44977i() == null || this.f17257d.mo44977i().equalsIgnoreCase("bnc_no_value")) {
                m27470Q();
            } else if (this.f17273t) {
                this.f17277x = true;
            } else {
                m27469P();
            }
        } else {
            m27470Q();
        }
    }

    /* renamed from: a */
    public void mo24758a(C14205y yVar) {
        if (this.f17253A.mo44763a()) {
            yVar.mo45027q();
            return;
        }
        if (this.f17268o != C6027r.INITIALISED && !(yVar instanceof C14125e0)) {
            if (yVar instanceof C14127f0) {
                yVar.mo44616a((int) C14130h.f41548c, "");
                return;
            } else if (!(yVar instanceof C14138k0)) {
                WeakReference<Activity> weakReference = this.f17270q;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                boolean z = true;
                if (f17247u0 == C6020k.USE_DEFAULT) {
                    m27485a((C6017h) null, activity, true);
                } else {
                    if (f17247u0 != C6020k.REFERRABLE) {
                        z = false;
                    }
                    m27485a((C6017h) null, activity, z);
                }
            } else {
                return;
            }
        }
        if (!(yVar instanceof C14129g0)) {
            this.f17262i.mo44652a(yVar);
            yVar.mo45026o();
        }
        m27470Q();
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m27484a(Application application) {
        try {
            C6012c cVar = new C6012c(this, null);
            application.unregisterActivityLifecycleCallbacks(cVar);
            application.registerActivityLifecycleCallbacks(cVar);
            f17246t0 = true;
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            f17246t0 = false;
            f17245s0 = false;
            new C14130h("", C14130h.f41555j).mo44646b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m27499a(Intent intent) {
        boolean z;
        if (intent == null) {
            return false;
        }
        try {
            z = intent.getBooleanExtra(C14169a.ForceNewBranchSession.mo44764d(), false);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            intent.putExtra(C14169a.ForceNewBranchSession.mo44764d(), false);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m27502a(JSONObject jSONObject, ActivityInfo activityInfo) {
        Bundle bundle = activityInfo.metaData;
        String str = f17249w0;
        if (bundle.getString(str) != null) {
            for (String has : activityInfo.metaData.getString(str).split(",")) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24751a(BranchUniversalObject branchUniversalObject, C14090d dVar) {
        if (this.f17259f != null) {
            new C14194c(C14192a.VIEW_ITEM).mo44843a(branchUniversalObject).mo44844a(this.f17259f);
        }
    }

    /* renamed from: a */
    public void mo24769a(HashMap<String, String> hashMap) {
        this.f17272s.putAll(hashMap);
    }

    /* renamed from: a */
    public void mo24765a(String str, String str2) {
        if (C14125e0.m61075a(str)) {
            m27545z();
        }
    }

    /* renamed from: a */
    public void mo24750a(int i, String str, String str2) {
        if (C14125e0.m61075a(str2)) {
            m27545z();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27496a(@androidx.annotation.C0193h0 android.app.Activity r4, int r5) {
        /*
            io.branch.referral.d r0 = m27463J()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0073
            io.branch.referral.d r0 = m27463J()
            org.json.JSONObject r0 = r0.mo24819m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "~"
            r2.append(r3)
            io.branch.referral.s$a r3 = p212io.branch.referral.C14168s.C14169a.ReferringLink
            java.lang.String r3 = r3.mo44764d()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            if (r0 == 0) goto L_0x0073
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L_0x0073
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0040, UnsupportedEncodingException -> 0x003e }
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ JSONException -> 0x003c, UnsupportedEncodingException -> 0x003a }
            goto L_0x0045
        L_0x003a:
            r2 = move-exception
            goto L_0x0042
        L_0x003c:
            r2 = move-exception
            goto L_0x0042
        L_0x003e:
            r2 = move-exception
            goto L_0x0041
        L_0x0040:
            r2 = move-exception
        L_0x0041:
            r0 = r1
        L_0x0042:
            r2.printStackTrace()
        L_0x0045:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.branch.referral.s$a r2 = p212io.branch.referral.C14168s.C14169a.IsFullAppConv
            java.lang.String r2 = r2.mo44764d()
            r1.append(r2)
            java.lang.String r2 = "=true&"
            r1.append(r2)
            io.branch.referral.s$a r2 = p212io.branch.referral.C14168s.C14169a.ReferringLink
            java.lang.String r2 = r2.mo44764d()
            r1.append(r2)
            java.lang.String r2 = "="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x0073:
            boolean r4 = p212io.branch.referral.C14201v.m61495a(r4, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C6009d.m27496a(android.app.Activity, int):boolean");
    }

    /* renamed from: a */
    public static boolean m27498a(@C0193h0 Activity activity, int i, @C0195i0 String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C14169a.IsFullAppConv.mo44764d());
        sb.append("=true&");
        sb.append(str);
        return C14201v.m61495a(activity, i, sb.toString());
    }

    /* renamed from: a */
    public static boolean m27497a(@C0193h0 Activity activity, int i, @C0193h0 BranchUniversalObject branchUniversalObject) {
        if (branchUniversalObject == null) {
            return false;
        }
        String a = branchUniversalObject.mo44522a((Context) activity, new LinkProperties());
        StringBuilder sb = new StringBuilder();
        sb.append(C14169a.ReferringLink.mo44764d());
        sb.append("=");
        sb.append(a);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(sb2)) {
            return m27498a(activity, i, sb2);
        }
        return m27498a(activity, i, "");
    }
}
