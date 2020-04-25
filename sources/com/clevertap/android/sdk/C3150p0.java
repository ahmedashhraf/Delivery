package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioAttributes.Builder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0753l;
import androidx.core.app.C0770p;
import androidx.core.app.C0798u;
import com.amplitude.api.C2876e;
import com.bogdwellers.pinchtozoom.C2945d;
import com.clevertap.android.sdk.C3211r0.C3213b;
import com.clevertap.android.sdk.exceptions.CleverTapMetaDataNotFoundException;
import com.clevertap.android.sdk.exceptions.CleverTapPermissionsNotSatisfied;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.C4420j;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C8743a;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.mrsool.chat.C10526n;
import com.mrsool.p423v.C11718b;
import com.mrsool.utils.C11644i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.jcodec.codecs.common.biari.MQEncoder;
import org.jivesoftware.smackx.iqregister.packet.Registration.Feature;
import org.jivesoftware.smackx.ping.packet.Ping;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p063d.p064b.C2108a;
import p076c.p112d.p113a.p114a.p129i.C2685a;
import p205i.p489f.C14069f;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.clevertap.android.sdk.p0 */
/* compiled from: CleverTapAPI */
public class C3150p0 implements C3031c, C3057g, C3109b, C3040c {
    @Deprecated

    /* renamed from: R0 */
    public static final String f11230R0 = "Charged";

    /* renamed from: S0 */
    public static final String f11231S0 = "wzrk_pn";

    /* renamed from: T0 */
    private static int f11232T0 = C3205z0.INFO.mo12550d();

    /* renamed from: U0 */
    private static final Boolean f11233U0 = Boolean.valueOf(true);

    /* renamed from: V0 */
    private static CleverTapInstanceConfig f11234V0;

    /* renamed from: W0 */
    private static HashMap<String, C3150p0> f11235W0;

    /* renamed from: X0 */
    private static boolean f11236X0 = false;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public static int f11237Y0 = 0;

    /* renamed from: Z0 */
    private static ArrayList<CTInAppNotification> f11238Z0 = new ArrayList<>();

    /* renamed from: a1 */
    private static CTInAppNotification f11239a1 = null;

    /* renamed from: b1 */
    private static WeakReference<Activity> f11240b1;

    /* renamed from: c1 */
    private static int f11241c1 = 0;

    /* renamed from: d1 */
    private static SSLContext f11242d1;

    /* renamed from: e1 */
    private static SSLSocketFactory f11243e1;

    /* renamed from: f1 */
    private static String f11244f1;

    /* renamed from: g1 */
    static boolean f11245g1 = m15087C();

    /* renamed from: A0 */
    private final Object f11246A0 = new Object();

    /* renamed from: B0 */
    private final Object f11247B0 = new Object();

    /* renamed from: C0 */
    private boolean f11248C0 = false;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public String f11249D0 = null;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public final Boolean f11250E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public long f11251F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public long f11252G0;

    /* renamed from: H0 */
    private final Boolean f11253H0;

    /* renamed from: I0 */
    private boolean f11254I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public C3092f0 f11255J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public final Object f11256K0;

    /* renamed from: L0 */
    private C3110h0 f11257L0;

    /* renamed from: M0 */
    private boolean f11258M0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C3211r0 f11259N;
    @Deprecated

    /* renamed from: N0 */
    public final C3231v0 f11260N0;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Context f11261O;
    @Deprecated

    /* renamed from: O0 */
    public final C3137m1 f11262O0;

    /* renamed from: P */
    private C3103g1 f11263P;
    @Deprecated

    /* renamed from: P0 */
    public final C3216s0 f11264P0;

    /* renamed from: Q */
    private CleverTapInstanceConfig f11265Q;
    @Deprecated

    /* renamed from: Q0 */
    public final C3209q1 f11266Q0;

    /* renamed from: R */
    private int f11267R = 0;

    /* renamed from: S */
    private int f11268S = 0;

    /* renamed from: T */
    private Location f11269T = null;

    /* renamed from: U */
    private C3224t1 f11270U = null;

    /* renamed from: V */
    private ArrayList<C3145n1> f11271V = null;

    /* renamed from: W */
    private long f11272W = 0;

    /* renamed from: X */
    private int f11273X = 0;

    /* renamed from: Y */
    private boolean f11274Y = false;

    /* renamed from: Z */
    private int f11275Z = 0;

    /* renamed from: a */
    private String f11276a = "";

    /* renamed from: a0 */
    private String f11277a0 = null;

    /* renamed from: b */
    private Runnable f11278b = null;

    /* renamed from: b0 */
    private String f11279b0 = null;

    /* renamed from: c0 */
    private String f11280c0 = null;

    /* renamed from: d0 */
    private JSONObject f11281d0 = null;

    /* renamed from: e0 */
    private int f11282e0;

    /* renamed from: f0 */
    private final HashMap<String, Object> f11283f0 = new HashMap<>();

    /* renamed from: g0 */
    private final HashMap<String, Object> f11284g0 = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C3220t0 f11285h0;

    /* renamed from: i0 */
    private C3201x0 f11286i0;

    /* renamed from: j0 */
    private boolean f11287j0 = false;

    /* renamed from: k0 */
    private final Object f11288k0 = new Object();

    /* renamed from: l0 */
    private Handler f11289l0;

    /* renamed from: m0 */
    private ExecutorService f11290m0;

    /* renamed from: n0 */
    private ExecutorService f11291n0;

    /* renamed from: o0 */
    private Runnable f11292o0 = null;

    /* renamed from: p0 */
    private Runnable f11293p0 = null;

    /* renamed from: q0 */
    private C3248y1 f11294q0;

    /* renamed from: r0 */
    private final Object f11295r0 = new Object();

    /* renamed from: s0 */
    private boolean f11296s0 = false;

    /* renamed from: t0 */
    private final HashMap<String, Integer> f11297t0 = new HashMap<>(8);

    /* renamed from: u0 */
    private boolean f11298u0 = false;

    /* renamed from: v0 */
    private ArrayList<C3244x1> f11299v0 = new ArrayList<>();

    /* renamed from: w0 */
    private HashSet<String> f11300w0 = null;

    /* renamed from: x0 */
    private C3096f1 f11301x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C3088e1 f11302y0;

    /* renamed from: z0 */
    private int f11303z0 = 0;

    /* renamed from: com.clevertap.android.sdk.p0$a */
    /* compiled from: CleverTapAPI */
    class C3151a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Context f11304N;

        /* renamed from: a */
        final /* synthetic */ JSONObject f11306a;

        /* renamed from: b */
        final /* synthetic */ int f11307b;

        /* renamed from: com.clevertap.android.sdk.p0$a$a */
        /* compiled from: CleverTapAPI */
        class C3152a implements Runnable {

            /* renamed from: com.clevertap.android.sdk.p0$a$a$a */
            /* compiled from: CleverTapAPI */
            class C3153a implements Runnable {
                C3153a() {
                }

                public void run() {
                    C3151a aVar = C3151a.this;
                    C3150p0.this.m15350r(aVar.f11304N);
                    C3151a aVar2 = C3151a.this;
                    C3150p0.this.m15166a(aVar2.f11304N, aVar2.f11306a, aVar2.f11307b);
                }
            }

            C3152a() {
            }

            public void run() {
                C3150p0.this.m15188a("queueEventWithDelay", (Runnable) new C3153a());
            }
        }

        C3151a(JSONObject jSONObject, int i, Context context) {
            this.f11306a = jSONObject;
            this.f11307b = i;
            this.f11304N = context;
        }

        public void run() {
            if (C3150p0.this.m15361t0()) {
                JSONObject jSONObject = this.f11306a;
                String jSONObject2 = jSONObject == null ? "null" : jSONObject.toString();
                C3111h1 x = C3150p0.this.m15117U();
                String q = C3150p0.this.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Current user is opted out dropping event: ");
                sb.append(jSONObject2);
                x.mo12307a(q, sb.toString());
                return;
            }
            if (C3150p0.this.m15204a(this.f11306a, this.f11307b)) {
                C3111h1 x2 = C3150p0.this.m15117U();
                String q2 = C3150p0.this.m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("App Launched not yet processed, re-queuing event ");
                sb2.append(this.f11306a);
                sb2.append("after 2s");
                x2.mo12307a(q2, sb2.toString());
                C3150p0.this.m15205a0().postDelayed(new C3152a(), 2000);
            } else {
                C3150p0.this.m15350r(this.f11304N);
                C3150p0.this.m15166a(this.f11304N, this.f11306a, this.f11307b);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$a0 */
    /* compiled from: CleverTapAPI */
    class C3154a0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11311a;

        /* renamed from: b */
        final /* synthetic */ CTInAppNotification f11312b;

        C3154a0(Context context, CTInAppNotification cTInAppNotification) {
            this.f11311a = context;
            this.f11312b = cTInAppNotification;
        }

        public void run() {
            C3150p0.m15222b(this.f11311a, C3150p0.this.m15116T(), this.f11312b);
            C3150p0.this.m15215b(this.f11311a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$a1 */
    /* compiled from: CleverTapAPI */
    private final class C3155a1 implements Runnable {

        /* renamed from: N */
        private boolean f11313N = C3150p0.f11245g1;

        /* renamed from: a */
        private final WeakReference<C3150p0> f11315a;

        /* renamed from: b */
        private final JSONObject f11316b;

        C3155a1(C3150p0 p0Var, JSONObject jSONObject) {
            this.f11315a = new WeakReference<>(p0Var);
            this.f11316b = jSONObject;
        }

        public void run() {
            CTInAppNotification a = new CTInAppNotification().mo11929a(this.f11316b, this.f11313N);
            if (a.mo11942n() != null) {
                C3111h1 x = C3150p0.this.m15117U();
                String q = C3150p0.this.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse inapp notification ");
                sb.append(a.mo11942n());
                x.mo12307a(q, sb.toString());
                return;
            }
            a.f10795o0 = (C3031c) this.f11315a.get();
            a.mo11928O();
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$b */
    /* compiled from: CleverTapAPI */
    class C3156b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11317a;

        C3156b(Context context) {
            this.f11317a = context;
        }

        public void run() {
            C3150p0.this.m15117U().mo12315c(C3150p0.this.m15110N(), "Pushing Notification Viewed event onto queue flush async");
            C3150p0.this.m15223b(this.f11317a, C3203y0.PUSH_NOTIFICATION_VIEWED);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$b0 */
    /* compiled from: CleverTapAPI */
    class C3157b0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f11319a;

        C3157b0(Runnable runnable) {
            this.f11319a = runnable;
        }

        public void run() {
            C3150p0.this.f11252G0 = Thread.currentThread().getId();
            try {
                this.f11319a.run();
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "Notification executor service: Failed to complete the scheduled task", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$c */
    /* compiled from: CleverTapAPI */
    class C3158c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11321a;

        C3158c(Context context) {
            this.f11321a = context;
        }

        public void run() {
            C3150p0.this.m15223b(this.f11321a, C3203y0.REGULAR);
            C3150p0.this.m15223b(this.f11321a, C3203y0.PUSH_NOTIFICATION_VIEWED);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$c0 */
    /* compiled from: CleverTapAPI */
    class C3159c0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ int f11323N;

        /* renamed from: a */
        final /* synthetic */ Bundle f11325a;

        /* renamed from: b */
        final /* synthetic */ Context f11326b;

        C3159c0(Bundle bundle, Context context, int i) {
            this.f11325a = bundle;
            this.f11326b = context;
            this.f11323N = i;
        }

        public void run() {
            String str = "wzrk_pid";
            try {
                C3111h1 x = C3150p0.this.m15117U();
                String q = C3150p0.this.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Handling notification: ");
                sb.append(this.f11325a.toString());
                x.mo12307a(q, sb.toString());
                C3150p0.this.f11259N = C3150p0.this.m15354s(this.f11326b);
                if (this.f11325a.getString(str) == null || !C3150p0.this.f11259N.mo12566a(this.f11325a.getString(str))) {
                    String string = this.f11325a.getString("nm");
                    String str2 = "";
                    String str3 = string != null ? string : str2;
                    if (str3.isEmpty()) {
                        C3150p0.this.m15117U().mo12315c(C3150p0.this.m15110N(), "Push notification message is empty, not rendering");
                        C3150p0.this.m15354s(this.f11326b).mo12574d();
                        return;
                    }
                    String string2 = this.f11325a.getString("nt", str2);
                    if (string2.isEmpty()) {
                        string2 = this.f11326b.getApplicationInfo().name;
                    }
                    C3150p0.this.m15153a(this.f11326b, this.f11325a, str3, string2, this.f11323N);
                    return;
                }
                C3150p0.this.m15117U().mo12307a(C3150p0.this.m15110N(), "Push Notification already rendered, not showing again");
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12308a(C3150p0.this.m15110N(), "Couldn't render notification: ", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$d */
    /* compiled from: CleverTapAPI */
    class C3160d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11328a;

        /* renamed from: b */
        final /* synthetic */ C3203y0 f11329b;

        C3160d(Context context, C3203y0 y0Var) {
            this.f11328a = context;
            this.f11329b = y0Var;
        }

        public void run() {
            C3150p0.this.m15117U().mo12315c(C3150p0.this.m15110N(), "Pushing Notification Viewed event onto queue flush sync");
            C3150p0.this.m15254c(this.f11328a, this.f11329b);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$d0 */
    /* compiled from: CleverTapAPI */
    static class C3161d0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ CharSequence f11330N;

        /* renamed from: O */
        final /* synthetic */ int f11331O;

        /* renamed from: P */
        final /* synthetic */ String f11332P;

        /* renamed from: Q */
        final /* synthetic */ boolean f11333Q;

        /* renamed from: R */
        final /* synthetic */ C3150p0 f11334R;

        /* renamed from: a */
        final /* synthetic */ Context f11335a;

        /* renamed from: b */
        final /* synthetic */ String f11336b;

        C3161d0(Context context, String str, CharSequence charSequence, int i, String str2, boolean z, C3150p0 p0Var) {
            this.f11335a = context;
            this.f11336b = str;
            this.f11330N = charSequence;
            this.f11331O = i;
            this.f11332P = str2;
            this.f11333Q = z;
            this.f11334R = p0Var;
        }

        @RequiresApi(api = 26)
        public void run() {
            NotificationManager notificationManager = (NotificationManager) this.f11335a.getSystemService("notification");
            if (notificationManager != null) {
                NotificationChannel notificationChannel = new NotificationChannel(this.f11336b, this.f11330N, this.f11331O);
                notificationChannel.setDescription(this.f11332P);
                notificationChannel.setShowBadge(this.f11333Q);
                notificationManager.createNotificationChannel(notificationChannel);
                C3111h1 x = this.f11334R.m15117U();
                String q = this.f11334R.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Notification channel ");
                sb.append(this.f11330N.toString());
                sb.append(" has been created");
                x.mo12311b(q, sb.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$e */
    /* compiled from: CleverTapAPI */
    class C3162e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11338a;

        /* renamed from: b */
        final /* synthetic */ C3203y0 f11339b;

        C3162e(Context context, C3203y0 y0Var) {
            this.f11338a = context;
            this.f11339b = y0Var;
        }

        public void run() {
            C3150p0.this.m15157a(this.f11338a, this.f11339b);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$e0 */
    /* compiled from: CleverTapAPI */
    static class C3163e0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ CharSequence f11340N;

        /* renamed from: O */
        final /* synthetic */ int f11341O;

        /* renamed from: P */
        final /* synthetic */ String f11342P;

        /* renamed from: Q */
        final /* synthetic */ String f11343Q;

        /* renamed from: R */
        final /* synthetic */ boolean f11344R;

        /* renamed from: S */
        final /* synthetic */ C3150p0 f11345S;

        /* renamed from: a */
        final /* synthetic */ Context f11346a;

        /* renamed from: b */
        final /* synthetic */ String f11347b;

        C3163e0(Context context, String str, CharSequence charSequence, int i, String str2, String str3, boolean z, C3150p0 p0Var) {
            this.f11346a = context;
            this.f11347b = str;
            this.f11340N = charSequence;
            this.f11341O = i;
            this.f11342P = str2;
            this.f11343Q = str3;
            this.f11344R = z;
            this.f11345S = p0Var;
        }

        @RequiresApi(api = 26)
        public void run() {
            NotificationManager notificationManager = (NotificationManager) this.f11346a.getSystemService("notification");
            if (notificationManager != null) {
                NotificationChannel notificationChannel = new NotificationChannel(this.f11347b, this.f11340N, this.f11341O);
                notificationChannel.setDescription(this.f11342P);
                notificationChannel.setGroup(this.f11343Q);
                notificationChannel.setShowBadge(this.f11344R);
                notificationManager.createNotificationChannel(notificationChannel);
                C3111h1 x = this.f11345S.m15117U();
                String q = this.f11345S.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Notification channel ");
                sb.append(this.f11340N.toString());
                sb.append(" has been created");
                x.mo12311b(q, sb.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$f */
    /* compiled from: CleverTapAPI */
    class C3164f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11348a;

        C3164f(Context context) {
            this.f11348a = context;
        }

        public void run() {
            C3150p0.this.m15294f(this.f11348a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$f0 */
    /* compiled from: CleverTapAPI */
    static class C3165f0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C3150p0 f11350N;

        /* renamed from: O */
        final /* synthetic */ String f11351O;

        /* renamed from: P */
        final /* synthetic */ CharSequence f11352P;

        /* renamed from: Q */
        final /* synthetic */ int f11353Q;

        /* renamed from: R */
        final /* synthetic */ String f11354R;

        /* renamed from: S */
        final /* synthetic */ boolean f11355S;

        /* renamed from: a */
        final /* synthetic */ Context f11356a;

        /* renamed from: b */
        final /* synthetic */ String f11357b;

        C3165f0(Context context, String str, C3150p0 p0Var, String str2, CharSequence charSequence, int i, String str3, boolean z) {
            this.f11356a = context;
            this.f11357b = str;
            this.f11350N = p0Var;
            this.f11351O = str2;
            this.f11352P = charSequence;
            this.f11353Q = i;
            this.f11354R = str3;
            this.f11355S = z;
        }

        @RequiresApi(api = 26)
        public void run() {
            String str;
            NotificationManager notificationManager = (NotificationManager) this.f11356a.getSystemService("notification");
            if (notificationManager != null) {
                Uri uri = null;
                if (!this.f11357b.isEmpty()) {
                    if (this.f11357b.contains(".mp3") || this.f11357b.contains(".ogg") || this.f11357b.contains(C11718b.f33921m)) {
                        String str2 = this.f11357b;
                        str = str2.substring(0, str2.length() - 4);
                    } else {
                        this.f11350N.m15117U().mo12307a(this.f11350N.m15110N(), "Sound file name not supported");
                        str = "";
                    }
                    if (!str.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("android.resource://");
                        sb.append(this.f11356a.getPackageName());
                        sb.append("/raw/");
                        sb.append(str);
                        uri = Uri.parse(sb.toString());
                    }
                }
                NotificationChannel notificationChannel = new NotificationChannel(this.f11351O, this.f11352P, this.f11353Q);
                notificationChannel.setDescription(this.f11354R);
                notificationChannel.setShowBadge(this.f11355S);
                if (uri != null) {
                    notificationChannel.setSound(uri, new Builder().setUsage(5).build());
                } else {
                    this.f11350N.m15117U().mo12307a(this.f11350N.m15110N(), "Sound file not found, notification channel will be created without custom sound");
                }
                notificationManager.createNotificationChannel(notificationChannel);
                C3111h1 x = this.f11350N.m15117U();
                String q = this.f11350N.m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Notification channel ");
                sb2.append(this.f11352P.toString());
                sb2.append(" has been created");
                x.mo12311b(q, sb2.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$g */
    /* compiled from: CleverTapAPI */
    class C3166g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11358a;

        C3166g(Context context) {
            this.f11358a = context;
        }

        public void run() {
            if (VERSION.SDK_INT >= 21) {
                C3150p0.this.m15117U().mo12314c("Creating job");
                C3150p0.this.m15317i(this.f11358a);
                return;
            }
            C3150p0.this.m15117U().mo12314c("Resetting alarm");
            C3150p0.this.m15359t(this.f11358a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$g0 */
    /* compiled from: CleverTapAPI */
    class C3167g0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CleverTapInstanceConfig f11361a;

        /* renamed from: b */
        final /* synthetic */ Context f11362b;

        C3167g0(CleverTapInstanceConfig cleverTapInstanceConfig, Context context) {
            this.f11361a = cleverTapInstanceConfig;
            this.f11362b = context;
        }

        public void run() {
            String v = this.f11361a.mo12118v();
            if (v == null) {
                C3111h1.m14938f("Unable to save config to SharedPrefs, config Json is null");
            } else {
                C3217s1.m15534b(this.f11362b, C3150p0.this.m15089D("instance"), v);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$h */
    /* compiled from: CleverTapAPI */
    class C3168h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11363a;

        C3168h(Context context) {
            this.f11363a = context;
        }

        public void run() {
            C3150p0.this.m15215b(this.f11363a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$h0 */
    /* compiled from: CleverTapAPI */
    static class C3169h0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C3150p0 f11365N;

        /* renamed from: O */
        final /* synthetic */ String f11366O;

        /* renamed from: P */
        final /* synthetic */ CharSequence f11367P;

        /* renamed from: Q */
        final /* synthetic */ int f11368Q;

        /* renamed from: R */
        final /* synthetic */ String f11369R;

        /* renamed from: S */
        final /* synthetic */ String f11370S;

        /* renamed from: T */
        final /* synthetic */ boolean f11371T;

        /* renamed from: a */
        final /* synthetic */ Context f11372a;

        /* renamed from: b */
        final /* synthetic */ String f11373b;

        C3169h0(Context context, String str, C3150p0 p0Var, String str2, CharSequence charSequence, int i, String str3, String str4, boolean z) {
            this.f11372a = context;
            this.f11373b = str;
            this.f11365N = p0Var;
            this.f11366O = str2;
            this.f11367P = charSequence;
            this.f11368Q = i;
            this.f11369R = str3;
            this.f11370S = str4;
            this.f11371T = z;
        }

        @RequiresApi(api = 26)
        public void run() {
            String str;
            NotificationManager notificationManager = (NotificationManager) this.f11372a.getSystemService("notification");
            if (notificationManager != null) {
                Uri uri = null;
                if (!this.f11373b.isEmpty()) {
                    if (this.f11373b.contains(".mp3") || this.f11373b.contains(".ogg") || this.f11373b.contains(C11718b.f33921m)) {
                        String str2 = this.f11373b;
                        str = str2.substring(0, str2.length() - 4);
                    } else {
                        this.f11365N.m15117U().mo12307a(this.f11365N.m15110N(), "Sound file name not supported");
                        str = "";
                    }
                    if (!str.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("android.resource://");
                        sb.append(this.f11372a.getPackageName());
                        sb.append("/raw/");
                        sb.append(str);
                        uri = Uri.parse(sb.toString());
                    }
                }
                NotificationChannel notificationChannel = new NotificationChannel(this.f11366O, this.f11367P, this.f11368Q);
                notificationChannel.setDescription(this.f11369R);
                notificationChannel.setGroup(this.f11370S);
                notificationChannel.setShowBadge(this.f11371T);
                if (uri != null) {
                    notificationChannel.setSound(uri, new Builder().setUsage(5).build());
                } else {
                    this.f11365N.m15117U().mo12307a(this.f11365N.m15110N(), "Sound file not found, notification channel will be created without custom sound");
                }
                notificationManager.createNotificationChannel(notificationChannel);
                C3111h1 x = this.f11365N.m15117U();
                String q = this.f11365N.m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Notification channel ");
                sb2.append(this.f11367P.toString());
                sb2.append(" has been created");
                x.mo12311b(q, sb2.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$i */
    /* compiled from: CleverTapAPI */
    class C3170i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11374a;

        C3170i(Context context) {
            this.f11374a = context;
        }

        public void run() {
            C3150p0.this.m15215b(this.f11374a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$i0 */
    /* compiled from: CleverTapAPI */
    static class C3171i0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ CharSequence f11376N;

        /* renamed from: O */
        final /* synthetic */ C3150p0 f11377O;

        /* renamed from: a */
        final /* synthetic */ Context f11378a;

        /* renamed from: b */
        final /* synthetic */ String f11379b;

        C3171i0(Context context, String str, CharSequence charSequence, C3150p0 p0Var) {
            this.f11378a = context;
            this.f11379b = str;
            this.f11376N = charSequence;
            this.f11377O = p0Var;
        }

        @RequiresApi(api = 26)
        public void run() {
            NotificationManager notificationManager = (NotificationManager) this.f11378a.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(this.f11379b, this.f11376N));
                C3111h1 x = this.f11377O.m15117U();
                String q = this.f11377O.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Notification channel group ");
                sb.append(this.f11376N.toString());
                sb.append(" has been created");
                x.mo12311b(q, sb.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$j */
    /* compiled from: CleverTapAPI */
    class C3172j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CTInAppNotification f11380a;

        C3172j(CTInAppNotification cTInAppNotification) {
            this.f11380a = cTInAppNotification;
        }

        public void run() {
            C3150p0.this.mo11958a(this.f11380a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$j0 */
    /* compiled from: CleverTapAPI */
    static class C3173j0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C3150p0 f11382N;

        /* renamed from: a */
        final /* synthetic */ Context f11383a;

        /* renamed from: b */
        final /* synthetic */ String f11384b;

        C3173j0(Context context, String str, C3150p0 p0Var) {
            this.f11383a = context;
            this.f11384b = str;
            this.f11382N = p0Var;
        }

        @RequiresApi(api = 26)
        public void run() {
            NotificationManager notificationManager = (NotificationManager) this.f11383a.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.deleteNotificationChannel(this.f11384b);
                C3111h1 x = this.f11382N.m15117U();
                String q = this.f11382N.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Notification channel ");
                sb.append(this.f11384b);
                sb.append(" has been deleted");
                x.mo12311b(q, sb.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$k */
    /* compiled from: CleverTapAPI */
    class C3174k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CleverTapInstanceConfig f11385a;

        C3174k(CleverTapInstanceConfig cleverTapInstanceConfig) {
            this.f11385a = cleverTapInstanceConfig;
        }

        public void run() {
            if (this.f11385a.mo12112p()) {
                C3150p0.this.m15384y0();
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$k0 */
    /* compiled from: CleverTapAPI */
    static class C3175k0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C3150p0 f11387N;

        /* renamed from: a */
        final /* synthetic */ Context f11388a;

        /* renamed from: b */
        final /* synthetic */ String f11389b;

        C3175k0(Context context, String str, C3150p0 p0Var) {
            this.f11388a = context;
            this.f11389b = str;
            this.f11387N = p0Var;
        }

        @RequiresApi(api = 26)
        public void run() {
            NotificationManager notificationManager = (NotificationManager) this.f11388a.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.deleteNotificationChannelGroup(this.f11389b);
                C3111h1 x = this.f11387N.m15117U();
                String q = this.f11387N.m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Notification channel group ");
                sb.append(this.f11389b);
                sb.append(" has been deleted");
                x.mo12311b(q, sb.toString());
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$l */
    /* compiled from: CleverTapAPI */
    class C3176l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CTInAppNotification f11390a;

        C3176l(CTInAppNotification cTInAppNotification) {
            this.f11390a = cTInAppNotification;
        }

        public void run() {
            C3150p0.this.m15227b(this.f11390a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$l0 */
    /* compiled from: CleverTapAPI */
    class C3177l0 implements Runnable {
        C3177l0() {
        }

        public void run() {
            C3150p0.this.m15376x();
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$m */
    /* compiled from: CleverTapAPI */
    static class C3178m implements Runnable {

        /* renamed from: N */
        final /* synthetic */ CleverTapInstanceConfig f11393N;

        /* renamed from: a */
        final /* synthetic */ Context f11394a;

        /* renamed from: b */
        final /* synthetic */ CTInAppNotification f11395b;

        C3178m(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
            this.f11394a = context;
            this.f11395b = cTInAppNotification;
            this.f11393N = cleverTapInstanceConfig;
        }

        public void run() {
            C3150p0.m15221b(this.f11394a, this.f11395b, this.f11393N);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$m0 */
    /* compiled from: CleverTapAPI */
    class C3179m0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CTInboxMessage f11396a;

        C3179m0(CTInboxMessage cTInboxMessage) {
            this.f11396a = cTInboxMessage;
        }

        public void run() {
            synchronized (C3150p0.this.f11256K0) {
                if (C3150p0.this.f11255J0 == null) {
                    C3150p0.this.m15117U().mo12307a(C3150p0.this.m15110N(), "Notification Inbox not initialized");
                } else if (C3150p0.this.f11255J0.mo12252a(this.f11396a.mo12023q())) {
                    C3150p0.this.m15386z();
                }
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$n */
    /* compiled from: CleverTapAPI */
    class C3180n implements Runnable {
        C3180n() {
        }

        public void run() {
            C3150p0 p0Var = C3150p0.this;
            p0Var.m15215b(p0Var.f11261O);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$n0 */
    /* compiled from: CleverTapAPI */
    class C3181n0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CTInboxMessage f11399a;

        C3181n0(CTInboxMessage cTInboxMessage) {
            this.f11399a = cTInboxMessage;
        }

        public void run() {
            synchronized (C3150p0.this.f11256K0) {
                if (C3150p0.this.f11255J0 == null) {
                    C3150p0.this.m15117U().mo12307a(C3150p0.this.m15110N(), "Notification Inbox not initialized");
                } else if (C3150p0.this.f11255J0.mo12257c(this.f11399a.mo12023q())) {
                    C3150p0.this.m15386z();
                }
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$o */
    /* compiled from: CleverTapAPI */
    class C3182o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f11401a;

        C3182o(Map map) {
            this.f11401a = map;
        }

        public void run() {
            C3150p0.this.m15263c(this.f11401a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$o0 */
    /* compiled from: CleverTapAPI */
    class C3183o0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CTInboxMessage f11404a;

        /* renamed from: b */
        final /* synthetic */ Bundle f11405b;

        C3183o0(CTInboxMessage cTInboxMessage, Bundle bundle) {
            this.f11404a = cTInboxMessage;
            this.f11405b = bundle;
        }

        public void run() {
            if (!C3150p0.this.mo12474e(this.f11404a.mo12023q()).mo12029w()) {
                C3150p0.this.mo12461b(this.f11404a);
                C3150p0.this.mo12456a(false, this.f11404a, this.f11405b);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$p */
    /* compiled from: CleverTapAPI */
    class C3184p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f11407a;

        /* renamed from: b */
        final /* synthetic */ String f11408b;

        C3184p(ArrayList arrayList, String str) {
            this.f11407a = arrayList;
            this.f11408b = str;
        }

        public void run() {
            C3150p0.this.m15191a(this.f11407a, this.f11408b, C2876e.f10098G);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$p0 */
    /* compiled from: CleverTapAPI */
    class C3185p0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11410a;

        /* renamed from: b */
        final /* synthetic */ JobParameters f11411b;

        C3185p0(Context context, JobParameters jobParameters) {
            this.f11410a = context;
            this.f11411b = jobParameters;
        }

        public void run() {
            String str = CTBackgroundIntentService.f10763a;
            if (C3150p0.this.m15112P() == null && C3150p0.this.m15113Q() == null) {
                C3111h1.m14939f(C3150p0.this.m15110N(), "Token is not present, not running the Job");
                return;
            }
            Calendar instance = Calendar.getInstance();
            int i = instance.get(11);
            int i2 = instance.get(12);
            C3150p0 p0Var = C3150p0.this;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            Date i3 = p0Var.m15385z(sb.toString());
            if (C3150p0.this.m15203a(C3150p0.this.m15385z("22:00"), C3150p0.this.m15385z("06:00"), i3)) {
                C3111h1.m14939f(C3150p0.this.m15110N(), "Job Service won't run in default DND hours");
                return;
            }
            long c = C3150p0.this.m15354s(this.f11410a).mo12572c();
            if (c == 0 || c > System.currentTimeMillis() - 86400000) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bk", 1);
                    C3150p0.this.m15257c(this.f11410a, jSONObject, 2);
                    if (this.f11411b == null) {
                        int h = C3150p0.this.m15342p(this.f11410a);
                        AlarmManager alarmManager = (AlarmManager) this.f11410a.getSystemService(C0770p.f3528i0);
                        Intent intent = new Intent(str);
                        intent.setPackage(this.f11410a.getPackageName());
                        PendingIntent service = PendingIntent.getService(this.f11410a, C3150p0.this.m15110N().hashCode(), intent, MQEncoder.CARRY_MASK);
                        if (alarmManager != null) {
                            alarmManager.cancel(service);
                        }
                        Intent intent2 = new Intent(str);
                        intent2.setPackage(this.f11410a.getPackageName());
                        PendingIntent service2 = PendingIntent.getService(this.f11410a, C3150p0.this.m15110N().hashCode(), intent2, MQEncoder.CARRY_MASK);
                        if (!(alarmManager == null || h == -1)) {
                            long j = 60000 * ((long) h);
                            alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + j, j, service2);
                        }
                    }
                } catch (JSONException unused) {
                    C3111h1.m14938f("Unable to raise background Ping event");
                }
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$q */
    /* compiled from: CleverTapAPI */
    class C3186q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11413a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f11414b;

        C3186q(String str, ArrayList arrayList) {
            this.f11413a = str;
            this.f11414b = arrayList;
        }

        public void run() {
            C3150p0.this.m15191a(this.f11414b, this.f11413a, C3150p0.this.m15300f0().mo12286c(this.f11413a) != null ? C2876e.f10094C : C2876e.f10098G);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$q0 */
    /* compiled from: CleverTapAPI */
    static /* synthetic */ class C3187q0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11415a = new int[C3145n1.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f11416b = new int[C3071b0.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.clevertap.android.sdk.b0[] r0 = com.clevertap.android.sdk.C3071b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11416b = r0
                r0 = 1
                int[] r1 = f11416b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.clevertap.android.sdk.b0 r2 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCoverHTML     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitialHTML     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitialHTML     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCover     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitial     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitial     // Catch:{ NoSuchFieldError -> 0x004b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeAlert     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHalfInterstitialImageOnly     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x007a }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeCoverImageOnly     // Catch:{ NoSuchFieldError -> 0x007a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeFooterHTML     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r4 = 11
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHeaderHTML     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r4 = 12
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x009e }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeFooter     // Catch:{ NoSuchFieldError -> 0x009e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r4 = 13
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r2 = f11416b     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.clevertap.android.sdk.b0 r3 = com.clevertap.android.sdk.C3071b0.CTInAppTypeHeader     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r4 = 14
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                com.clevertap.android.sdk.n1[] r2 = com.clevertap.android.sdk.C3145n1.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11415a = r2
                int[] r2 = f11415a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.clevertap.android.sdk.n1 r3 = com.clevertap.android.sdk.C3145n1.GCM     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f11415a     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.clevertap.android.sdk.n1 r2 = com.clevertap.android.sdk.C3145n1.FCM     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.C3187q0.<clinit>():void");
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$r */
    /* compiled from: CleverTapAPI */
    class C3188r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f11418a;

        /* renamed from: b */
        final /* synthetic */ String f11419b;

        C3188r(ArrayList arrayList, String str) {
            this.f11418a = arrayList;
            this.f11419b = str;
        }

        public void run() {
            C3150p0.this.m15191a(this.f11418a, this.f11419b, "$remove");
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$r0 */
    /* compiled from: CleverTapAPI */
    class C3189r0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11420a;

        C3189r0(Context context) {
            this.f11420a = context;
        }

        public void run() {
            if (VERSION.SDK_INT >= 21) {
                C3150p0.this.m15317i(this.f11420a);
            } else {
                C3150p0.this.m15312h(this.f11420a);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$s */
    /* compiled from: CleverTapAPI */
    class C3190s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11422a;

        C3190s(String str) {
            this.f11422a = str;
        }

        public void run() {
            C3150p0.this.m15344p(this.f11422a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$s0 */
    /* compiled from: CleverTapAPI */
    class C3191s0 implements Runnable {
        C3191s0() {
        }

        public void run() {
            try {
                C3150p0.this.m15117U().mo12315c(C3150p0.this.m15110N(), "Queuing daily events");
                C3150p0.this.m15288e((JSONObject) null);
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "Daily profile sync failed", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$t */
    /* compiled from: CleverTapAPI */
    class C3192t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11425a;

        C3192t(JSONObject jSONObject) {
            this.f11425a = jSONObject;
        }

        public void run() {
            C3150p0.this.m15242b(this.f11425a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$t0 */
    /* compiled from: CleverTapAPI */
    class C3193t0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3220t0 f11427a;

        C3193t0(C3220t0 t0Var) {
            this.f11427a = t0Var;
        }

        public void run() {
            try {
                if (C3150p0.this.m15116T().mo12109m()) {
                    C3150p0.this.m15117U().mo12307a(C3150p0.this.m15110N(), "Instance is set for Analytics only, not refreshing token");
                    return;
                }
                String a = C3150p0.this.m15322k(this.f11427a.mo12598j());
                if (a != null) {
                    C3150p0.this.m15360t(a);
                    C3150p0.this.m15190a(a, true, true);
                    try {
                        C3150p0.this.m15187a(a, C3145n1.FCM);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "FcmManager: FCM Token error", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$u */
    /* compiled from: CleverTapAPI */
    class C3194u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5495a f11429a;

        C3194u(C5495a aVar) {
            this.f11429a = aVar;
        }

        public void run() {
            C3150p0.this.m15237b(this.f11429a);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$u0 */
    /* compiled from: CleverTapAPI */
    class C3195u0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3220t0 f11431a;

        C3195u0(C3220t0 t0Var) {
            this.f11431a = t0Var;
        }

        public void run() {
            try {
                if (C3150p0.this.m15116T().mo12109m()) {
                    C3150p0.this.m15117U().mo12307a(C3150p0.this.m15110N(), "Instance is set for Analytics only, will not request push token");
                    return;
                }
                String c = C3150p0.this.m15327l(this.f11431a.mo12599k());
                if (c != null) {
                    C3150p0.this.m15364u(c);
                    C3150p0.this.m15239b(c, true, true);
                    try {
                        C3150p0.this.m15187a(c, C3145n1.GCM);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "GcmManager: GCM Token error", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$v */
    /* compiled from: CleverTapAPI */
    class C3196v implements Runnable {
        C3196v() {
        }

        public void run() {
            C3150p0.this.m15103J0();
            C3150p0.this.m15101I0();
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$v0 */
    /* compiled from: CleverTapAPI */
    class C3197v0 implements Runnable {
        C3197v0() {
        }

        public void run() {
            C3120j1.m14990b(C3150p0.this.f11261O, C3150p0.this.f11285h0);
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$w */
    /* compiled from: CleverTapAPI */
    class C3198w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bundle f11435a;

        C3198w(Bundle bundle) {
            this.f11435a = bundle;
        }

        public void run() {
            String str = "wzrk_inapp";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Received in-app via push payload: ");
                sb.append(this.f11435a.getString(str));
                C3111h1.m14938f(sb.toString());
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("inapp_notifs", jSONArray);
                jSONArray.put(new JSONObject(this.f11435a.getString(str)));
                C3150p0.this.m15243b(jSONObject, C3150p0.this.f11261O);
            } catch (Throwable th) {
                C3111h1.m14941f("Failed to display inapp notification from push notification payload", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$w0 */
    /* compiled from: CleverTapAPI */
    class C3199w0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f11437a;

        C3199w0(boolean z) {
            this.f11437a = z;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("ct_optout", Boolean.valueOf(this.f11437a));
            if (this.f11437a) {
                C3150p0.this.mo12465b((Map<String, Object>) hashMap);
                C3150p0.this.m15306g(true);
            } else {
                C3150p0.this.m15306g(false);
                C3150p0.this.mo12465b((Map<String, Object>) hashMap);
            }
            String f = C3150p0.this.m15088C0();
            if (f == null) {
                C3150p0.this.m15117U().mo12315c(C3150p0.this.m15110N(), "Unable to persist user OptOut state, storage key is null");
                return;
            }
            C3217s1.m15535b(C3150p0.this.f11261O, C3150p0.this.m15089D(f), this.f11437a);
            C3111h1 x = C3150p0.this.m15117U();
            String q = C3150p0.this.m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Set current user OptOut state to: ");
            sb.append(this.f11437a);
            x.mo12315c(q, sb.toString());
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$x */
    /* compiled from: CleverTapAPI */
    class C3200x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bundle f11439a;

        C3200x(Bundle bundle) {
            this.f11439a = bundle;
        }

        public void run() {
            String str = "wzrk_inbox";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Received inbox via push payload: ");
                sb.append(this.f11439a.getString(str));
                C3111h1.m14938f(sb.toString());
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("inbox_notifs", jSONArray);
                JSONObject jSONObject2 = new JSONObject(this.f11439a.getString(str));
                jSONObject2.put(FeatureRequestEntry.COLUMN_ID, String.valueOf(System.currentTimeMillis() / 1000));
                jSONArray.put(jSONObject2);
                C3150p0.this.m15276d(jSONObject);
            } catch (Throwable th) {
                C3111h1.m14941f("Failed to process inbox message from push notification payload", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$x0 */
    /* compiled from: CleverTapAPI */
    public interface C3201x0 {
        /* renamed from: a */
        void mo12547a(String str, C3145n1 n1Var);
    }

    /* renamed from: com.clevertap.android.sdk.p0$y */
    /* compiled from: CleverTapAPI */
    class C3202y implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Map f11441N;

        /* renamed from: a */
        final /* synthetic */ String f11443a;

        /* renamed from: b */
        final /* synthetic */ String f11444b;

        C3202y(String str, String str2, Map map) {
            this.f11443a = str;
            this.f11444b = str2;
            this.f11441N = map;
        }

        public void run() {
            try {
                C3150p0.this.m15306g(false);
                C3150p0.this.m15277d(false);
                C3150p0.this.m15254c(C3150p0.this.f11261O, C3203y0.REGULAR);
                C3150p0.this.m15254c(C3150p0.this.f11261O, C3203y0.PUSH_NOTIFICATION_VIEWED);
                C3150p0.this.m15294f(C3150p0.this.f11261O);
                C3150p0.this.m15300f0().mo12278a();
                C3150p0.this.f11302y0.mo12241a(C3150p0.this.f11261O);
                C3150p0.f11237Y0 = 1;
                C3150p0.this.m15100I();
                if (this.f11443a != null) {
                    C3150p0.this.f11285h0.mo12590b(this.f11443a);
                    C3150p0.this.m15383y(this.f11443a);
                } else if (C3150p0.this.m15116T().mo12106j()) {
                    C3150p0.this.f11285h0.mo12587a(this.f11444b);
                } else {
                    C3150p0.this.f11285h0.mo12586a();
                }
                C3150p0.this.m15383y(C3150p0.this.mo12479g());
                C3150p0.this.m15101I0();
                C3150p0.this.m15108M();
                if (this.f11441N != null) {
                    C3150p0.this.mo12465b(this.f11441N);
                }
                C3150p0.this.m15277d(true);
                synchronized (C3150p0.this.f11250E0) {
                    C3150p0.this.f11249D0 = null;
                }
                C3150p0.this.m15099H0();
                C3150p0.this.m15097G0();
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "Reset Profile error", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$y0 */
    /* compiled from: CleverTapAPI */
    private enum C3203y0 {
        REGULAR(""),
        PUSH_NOTIFICATION_VIEWED("-spiky");
        
        /* access modifiers changed from: private */
        public final String httpResource;

        private C3203y0(String str) {
            this.httpResource = str;
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$z */
    /* compiled from: CleverTapAPI */
    class C3204z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f11445a;

        C3204z(Runnable runnable) {
            this.f11445a = runnable;
        }

        public void run() {
            C3150p0.this.f11251F0 = Thread.currentThread().getId();
            try {
                this.f11445a.run();
            } catch (Throwable th) {
                C3150p0.this.m15117U().mo12316c(C3150p0.this.m15110N(), "Executor service: Failed to complete the scheduled task", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.p0$z0 */
    /* compiled from: CleverTapAPI */
    public enum C3205z0 {
        OFF(-1),
        INFO(0),
        DEBUG(2);
        
        private final int value;

        private C3205z0(int i) {
            this.value = i;
        }

        /* renamed from: d */
        public int mo12550d() {
            return this.value;
        }
    }

    private C3150p0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        Boolean valueOf = Boolean.valueOf(true);
        this.f11250E0 = valueOf;
        this.f11251F0 = 0;
        this.f11252G0 = 0;
        this.f11253H0 = valueOf;
        this.f11254I0 = false;
        this.f11256K0 = new Object();
        this.f11258M0 = false;
        this.f11265Q = new CleverTapInstanceConfig(cleverTapInstanceConfig);
        this.f11261O = context;
        this.f11289l0 = new Handler(Looper.getMainLooper());
        this.f11290m0 = Executors.newFixedThreadPool(1);
        this.f11291n0 = Executors.newFixedThreadPool(1);
        this.f11263P = new C3103g1(context, cleverTapInstanceConfig);
        this.f11285h0 = new C3220t0(context, cleverTapInstanceConfig, str);
        this.f11294q0 = new C3248y1();
        this.f11302y0 = new C3088e1(context, cleverTapInstanceConfig);
        m15188a("CleverTapAPI#initializeDeviceInfo", (Runnable) new C3174k(cleverTapInstanceConfig));
        if ((((int) System.currentTimeMillis()) / 1000) - f11241c1 > 5) {
            this.f11265Q.mo12117u();
        }
        this.f11260N0 = new C3231v0(this);
        this.f11262O0 = new C3137m1(this);
        this.f11264P0 = new C3216s0(this);
        this.f11266Q0 = new C3209q1(this);
        m15105K0();
        m15188a("setStatesAsync", (Runnable) new C3196v());
        m15188a("saveConfigtoSharedPrefs", (Runnable) new C3167g0(cleverTapInstanceConfig, context));
        if (this.f11265Q.mo12110n() && !this.f11265Q.mo12109m()) {
            m15188a("createOrResetJobScheduler", (Runnable) new C3189r0(context));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CleverTap SDK initialized with accountId: ");
        sb.append(cleverTapInstanceConfig.mo12093a());
        sb.append(" accountToken: ");
        sb.append(cleverTapInstanceConfig.mo12099c());
        sb.append(" accountRegion: ");
        sb.append(cleverTapInstanceConfig.mo12097b());
        C3111h1.m14934e(sb.toString());
    }

    /* renamed from: A */
    private void m15080A() {
        m15289e(false);
        this.f11272W = System.currentTimeMillis();
        m15117U().mo12315c(m15110N(), "App in background");
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (m15341o0()) {
            try {
                C3217s1.m15532b(this.f11261O, m15089D("sexe"), currentTimeMillis);
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Updated session time: ");
                sb.append(currentTimeMillis);
                U.mo12315c(N, sb.toString());
            } catch (Throwable th) {
                C3111h1 U2 = m15117U();
                String N2 = m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to update session time time: ");
                sb2.append(th.getMessage());
                U2.mo12315c(N2, sb2.toString());
            }
        }
    }

    /* renamed from: A0 */
    public static void m15082A0() {
        HashMap<String, C3150p0> hashMap = f11235W0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                C3150p0 p0Var = (C3150p0) f11235W0.get(str);
                if (p0Var != null) {
                    try {
                        p0Var.m15080A();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private boolean m15084B() {
        m15109M0();
        Iterator it = this.f11300w0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String W = m15119W();
            if (W != null && W.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B0 */
    private void m15085B0() {
        if (this.f11271V == null) {
            this.f11271V = this.f11285h0.mo12597i();
        }
        ArrayList<C3145n1> arrayList = this.f11271V;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i = C3187q0.f11415a[((C3145n1) it.next()).ordinal()];
                if (i == 1) {
                    m15106L();
                } else if (i == 2) {
                    m15104K();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m15087C() {
        /*
            java.lang.String r0 = "com.google.android.exoplayer2.ExoPlayerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = "com.google.android.exoplayer2.source.hls.HlsMediaSource"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0019 }
            java.lang.String r1 = "com.google.android.exoplayer2.ui.PlayerView"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0019 }
            java.lang.String r1 = "ExoPlayer is present"
            com.clevertap.android.sdk.C3111h1.m14930d(r1)     // Catch:{ all -> 0x0019 }
            r0 = 1
            goto L_0x0047
        L_0x0019:
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.String r1 = "ExoPlayer library files are missing!!!"
            com.clevertap.android.sdk.C3111h1.m14930d(r1)
            java.lang.String r1 = "Please add ExoPlayer dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation."
            com.clevertap.android.sdk.C3111h1.m14930d(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ExoPlayer classes not found "
            r1.append(r2)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.clevertap.android.sdk.C3111h1.m14930d(r0)
            goto L_0x0046
        L_0x0041:
            java.lang.String r0 = "ExoPlayer classes not found"
            com.clevertap.android.sdk.C3111h1.m14930d(r0)
        L_0x0046:
            r0 = 0
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15087C():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public String m15088C0() {
        String g = mo12479g();
        if (g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("OptOut:");
        sb.append(g);
        return sb.toString();
    }

    /* renamed from: D */
    private void m15090D() {
        if (this.f11272W > 0 && System.currentTimeMillis() - this.f11272W > 1200000) {
            m15117U().mo12315c(m15110N(), "Session Timed Out");
            m15100I();
            m15293f((Activity) null);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0019 */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.clevertap.android.sdk.C3244x1 m15091D0() {
        /*
            r4 = this;
            java.lang.Boolean r0 = f11233U0
            monitor-enter(r0)
            r1 = 0
            java.util.ArrayList<com.clevertap.android.sdk.x1> r2 = r4.f11299v0     // Catch:{ Exception -> 0x0019 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0019 }
            if (r2 != 0) goto L_0x0019
            java.util.ArrayList<com.clevertap.android.sdk.x1> r2 = r4.f11299v0     // Catch:{ Exception -> 0x0019 }
            r3 = 0
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ Exception -> 0x0019 }
            com.clevertap.android.sdk.x1 r2 = (com.clevertap.android.sdk.C3244x1) r2     // Catch:{ Exception -> 0x0019 }
            r1 = r2
            goto L_0x0019
        L_0x0017:
            r1 = move-exception
            goto L_0x001b
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15091D0():com.clevertap.android.sdk.x1");
    }

    /* renamed from: E */
    private synchronized void m15092E() {
        this.f11280c0 = null;
    }

    /* renamed from: E0 */
    private void m15093E0() {
        if (m15357s0()) {
            m15299f(true);
            m15117U().mo12307a(m15110N(), "App Launched Events disabled in the Android Manifest file");
        } else if (m15353r0()) {
            m15117U().mo12315c(m15110N(), "App Launched has already been triggered. Will not trigger it ");
        } else {
            m15117U().mo12315c(m15110N(), "Firing App Launched event");
            m15299f(true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("evtName", "App Launched");
                jSONObject.put("evtData", m15111O());
            } catch (Throwable unused) {
            }
            m15257c(this.f11261O, jSONObject, 4);
        }
    }

    /* renamed from: F */
    private synchronized void m15094F() {
        this.f11279b0 = null;
    }

    /* renamed from: F0 */
    private void m15095F0() {
        m15188a("CleverTapAPI#pushInitialEventsAsync", (Runnable) new C3191s0());
    }

    /* renamed from: G */
    private synchronized void m15096G() {
        this.f11277a0 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m15097G0() {
        Iterator it = this.f11285h0.mo12609u().iterator();
        while (it.hasNext()) {
            m15236b((C3244x1) it.next());
        }
    }

    /* renamed from: H */
    private synchronized void m15098H() {
        this.f11281d0 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m15099H0() {
        synchronized (this.f11256K0) {
            this.f11255J0 = null;
        }
        m15376x();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m15100I() {
        this.f11273X = 0;
        m15299f(false);
        m15117U().mo12315c(m15110N(), "Session destroyed; Session ID is now 0");
        m15096G();
        m15094F();
        m15092E();
        m15098H();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m15101I0() {
        String C0 = m15088C0();
        if (C0 == null) {
            m15117U().mo12315c(m15110N(), "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean v = m15368v(C0);
        m15306g(v);
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Set current user OptOut state from storage to: ");
        sb.append(v);
        sb.append(" for key: ");
        sb.append(C0);
        U.mo12315c(N, sb.toString());
    }

    /* renamed from: J */
    private boolean m15102J() {
        return m15114R().length() > 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m15103J0() {
        boolean v = m15368v("NetworkInfo");
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Setting device network info reporting state from storage to ");
        sb.append(v);
        U.mo12315c(N, sb.toString());
        this.f11298u0 = v;
    }

    /* renamed from: K */
    private void m15104K() {
        m15188a("FcmManager#doFCMRefresh", (Runnable) new C3193t0(this.f11285h0));
    }

    /* renamed from: K0 */
    private void m15105K0() {
        C3227u0 a = m15300f0().mo12276a("App Launched");
        if (a == null) {
            this.f11282e0 = -1;
        } else {
            this.f11282e0 = a.mo12623c();
        }
    }

    /* renamed from: L */
    private void m15106L() {
        m15188a("GcmManager#doGCMRefresh", (Runnable) new C3195u0(this.f11285h0));
    }

    /* renamed from: L0 */
    private void m15107L0() {
        if (!this.f11265Q.mo12109m()) {
            m15186a((Runnable) new C3180n());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m15108M() {
        m15299f(false);
        m15093E0();
    }

    /* renamed from: M0 */
    private void m15109M0() {
        if (this.f11300w0 == null) {
            this.f11300w0 = new HashSet<>();
            try {
                String d = C3115i1.m14962a(this.f11261O).mo12322d();
                if (d != null) {
                    for (String trim : d.split(",")) {
                        this.f11300w0.add(trim.trim());
                    }
                }
            } catch (Throwable unused) {
            }
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("In-app notifications will not be shown on ");
            sb.append(Arrays.toString(this.f11300w0.toArray()));
            U.mo12307a(N, sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public String m15110N() {
        return this.f11265Q.mo12093a();
    }

    /* renamed from: O */
    private JSONObject m15111O() {
        String str = "";
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11285h0.mo12592d());
            sb.append(str);
            jSONObject.put("Build", sb.toString());
            jSONObject.put("Version", this.f11285h0.mo12610v());
            jSONObject.put("OS Version", this.f11285h0.mo12607s());
            jSONObject.put("SDK Version", this.f11285h0.mo12608t());
            if (this.f11269T != null) {
                jSONObject.put("Latitude", this.f11269T.getLatitude());
                jSONObject.put("Longitude", this.f11269T.getLongitude());
            }
            if (this.f11285h0.mo12600l() != null) {
                String str2 = "GoogleAdID";
                if (m15102J()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mt_");
                    sb2.append(str2);
                    str2 = sb2.toString();
                }
                jSONObject.put(str2, this.f11285h0.mo12600l());
                jSONObject.put("GoogleAdIDLimit", this.f11285h0.mo12614z());
            }
            try {
                jSONObject.put(C2108a.f8138S, this.f11285h0.mo12602n());
                jSONObject.put(C2108a.f8146T, this.f11285h0.mo12603o());
                jSONObject.put("Carrier", this.f11285h0.mo12593e());
                jSONObject.put("useIP", this.f11298u0);
                jSONObject.put("OS", this.f11285h0.mo12606r());
                jSONObject.put("wdt", this.f11285h0.mo12611w());
                jSONObject.put("hgt", this.f11285h0.mo12601m());
                jSONObject.put("dpi", this.f11285h0.mo12595g());
                String f = this.f11285h0.mo12594f();
                if (f != null && !f.equals(str)) {
                    jSONObject.put("cc", f);
                }
                if (this.f11298u0) {
                    Boolean A = this.f11285h0.mo12585A();
                    if (A != null) {
                        jSONObject.put("wifi", A);
                    }
                    Boolean x = this.f11285h0.mo12612x();
                    if (x != null) {
                        jSONObject.put("BluetoothEnabled", x);
                    }
                    String c = this.f11285h0.mo12591c();
                    if (c != null) {
                        jSONObject.put("BluetoothVersion", c);
                    }
                    String p = this.f11285h0.mo12604p();
                    if (p != null) {
                        jSONObject.put("Radio", p);
                    }
                }
            } catch (Throwable unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "Failed to construct App Launched event", th);
            return new JSONObject();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public String m15112P() {
        if (m15318i0() == null) {
            return null;
        }
        return m15292f("fcm_token", (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public String m15113Q() {
        if (m15318i0() == null) {
            return null;
        }
        return m15292f("registration_id", (String) null);
    }

    /* renamed from: R */
    private JSONObject m15114R() {
        JSONObject jSONObject = null;
        String f = m15292f("cachedGUIDsKey", (String) null);
        if (f != null) {
            try {
                jSONObject = new JSONObject(f);
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Error reading guid cache: ");
                sb.append(th.toString());
                U.mo12315c(N, sb.toString());
            }
        }
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    /* renamed from: S */
    private synchronized String m15115S() {
        return this.f11280c0;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public CleverTapInstanceConfig m15116T() {
        return this.f11265Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public C3111h1 m15117U() {
        return m15116T().mo12108l();
    }

    /* renamed from: V */
    private static Activity m15118V() {
        WeakReference<Activity> weakReference = f11240b1;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: W */
    private static String m15119W() {
        Activity V = m15118V();
        if (V != null) {
            return V.getLocalClassName();
        }
        return null;
    }

    /* renamed from: X */
    private int m15120X() {
        return this.f11273X;
    }

    /* renamed from: Y */
    public static int m15121Y() {
        return f11232T0;
    }

    /* renamed from: Z */
    private int m15122Z() {
        return m15206b("comms_first_ts", 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public Handler m15205a0() {
        return this.f11289l0;
    }

    /* renamed from: b0 */
    private long m15245b0() {
        return m15125a("comms_i", 0, "IJ");
    }

    /* renamed from: c0 */
    private long m15265c0() {
        return m15125a("comms_j", 0, "IJ");
    }

    /* renamed from: d0 */
    private int m15278d0() {
        return m15206b("comms_last_ts", 0);
    }

    /* renamed from: e0 */
    private int m15290e0() {
        return this.f11275Z;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public C3103g1 m15300f0() {
        return this.f11263P;
    }

    /* renamed from: g0 */
    private synchronized String m15308g0() {
        return this.f11279b0;
    }

    /* renamed from: h0 */
    private String m15314h0() {
        String N = m15110N();
        if (N == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ARP:");
        sb.append(N);
        return sb.toString();
    }

    /* renamed from: i0 */
    private SharedPreferences m15318i0() {
        try {
            if (this.f11261O == null) {
                return null;
            }
            return C3217s1.m15525a(this.f11261O);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j0 */
    private JSONArray m15321j0() {
        String[] b = this.f11259N.mo12571b();
        JSONArray jSONArray = new JSONArray();
        for (String str : b) {
            StringBuilder sb = new StringBuilder();
            sb.append("RTL IDs -");
            sb.append(str);
            C3111h1.m14938f(sb.toString());
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* renamed from: k0 */
    private static synchronized SSLContext m15325k0() {
        SSLContext sSLContext;
        synchronized (C3150p0.class) {
            if (f11242d1 == null) {
                f11242d1 = new C3206p1().mo12551a();
            }
            sSLContext = f11242d1;
        }
        return sSLContext;
    }

    /* renamed from: l0 */
    private String m15329l0() {
        if (this.f11276a.equals("")) {
            return null;
        }
        return this.f11276a;
    }

    /* renamed from: m0 */
    private synchronized String m15333m0() {
        return this.f11277a0;
    }

    /* renamed from: n0 */
    private synchronized JSONObject m15337n0() {
        return this.f11281d0;
    }

    /* renamed from: o0 */
    private boolean m15341o0() {
        return this.f11273X > 0;
    }

    /* renamed from: p0 */
    private boolean m15345p0() {
        return m15114R().length() <= 0;
    }

    /* renamed from: q0 */
    static boolean m15349q0() {
        return f11236X0;
    }

    /* renamed from: r0 */
    private boolean m15353r0() {
        boolean z;
        synchronized (this.f11288k0) {
            z = this.f11287j0;
        }
        return z;
    }

    /* renamed from: s0 */
    private boolean m15357s0() {
        return this.f11265Q.mo12113q();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public boolean m15361t0() {
        boolean z;
        synchronized (this.f11295r0) {
            z = this.f11296s0;
        }
        return z;
    }

    /* renamed from: u0 */
    private boolean m15365u0() {
        return this.f11285h0.mo12613y();
    }

    /* renamed from: v0 */
    private boolean m15369v0() {
        return this.f11274Y;
    }

    /* renamed from: w0 */
    private boolean m15374w0() {
        if (((int) (System.currentTimeMillis() / 1000)) - m15206b("comms_mtd", 0) < 86400) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    private boolean m15379x0() {
        return this.f11254I0;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m15384y0() {
        m15188a("Manifest Validation", (Runnable) new C3197v0());
    }

    /* renamed from: z */
    static void m15387z(Context context) {
        HashMap<String, C3150p0> hashMap = f11235W0;
        if (hashMap == null) {
            C3150p0 m = m15330m(context);
            if (m != null) {
                m.m15085B0();
            }
            return;
        }
        for (String str : hashMap.keySet()) {
            C3150p0 p0Var = (C3150p0) f11235W0.get(str);
            if (p0Var != null && p0Var.m15116T().mo12109m()) {
                C3111h1.m14931d(str, "Instance is Analytics Only not processing device token");
            } else if (p0Var != null) {
                p0Var.m15085B0();
            }
        }
    }

    /* renamed from: z0 */
    private void m15388z0() {
        m15383y(this.f11285h0.mo12596h());
    }

    /* renamed from: j */
    private void m15320j(Context context) {
        this.f11273X = (int) (System.currentTimeMillis() / 1000);
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Session created with ID: ");
        sb.append(this.f11273X);
        U.mo12315c(N, sb.toString());
        SharedPreferences a = C3217s1.m15525a(context);
        String str = "lastSessionId";
        int b = m15206b(str, 0);
        int b2 = m15206b("sexe", 0);
        if (b2 > 0) {
            this.f11275Z = b2 - b;
        }
        C3111h1 U2 = m15117U();
        String N2 = m15110N();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Last session length: ");
        sb2.append(this.f11275Z);
        sb2.append(" seconds");
        U2.mo12315c(N2, sb2.toString());
        if (b == 0) {
            this.f11274Y = true;
        }
        C3217s1.m15529a(a.edit().putInt(m15089D(str), this.f11273X));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public String m15322k(String str) {
        String str2;
        if (str != null) {
            try {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("FcmManager: Requesting a FCM token with Sender Id - ");
                sb.append(str);
                U.mo12315c(N, sb.toString());
                str2 = FirebaseInstanceId.m40758n().mo32068b(str, C8743a.f22949b);
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "FcmManager: Error requesting FCM token", th);
                return null;
            }
        } else {
            m15117U().mo12315c(m15110N(), "FcmManager: Requesting a FCM token");
            str2 = FirebaseInstanceId.m40758n().mo32074e();
        }
        String str3 = str2;
        C3111h1 U2 = m15117U();
        String N2 = m15110N();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FCM token: ");
        sb2.append(str3);
        U2.mo12311b(N2, sb2.toString());
        return str3;
    }

    /* renamed from: l */
    private static CleverTapInstanceConfig m15326l(Context context) {
        C3115i1 a = C3115i1.m14962a(context);
        String a2 = a.mo12319a();
        String c = a.mo12321c();
        String b = a.mo12320b();
        if (a2 == null || c == null) {
            C3111h1.m14934e("Account ID or Account token is missing from AndroidManifest.xml, unable to create default instance");
            return null;
        }
        if (b == null) {
            C3111h1.m14934e("Account Region not specified in the AndroidManifest - using default region");
        }
        return CleverTapInstanceConfig.m14636a(context, a2, c, b);
    }

    @C0195i0
    /* renamed from: m */
    public static C3150p0 m15330m(Context context) {
        return m15267d(context, (String) null);
    }

    @C0195i0
    /* renamed from: o */
    public static C3150p0 m15338o(Context context) throws CleverTapMetaDataNotFoundException, CleverTapPermissionsNotSatisfied {
        f11244f1 = C3073c.f10987g;
        return m15330m(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public int m15342p(Context context) {
        return C3217s1.m15522a(context, "pf", 240);
    }

    /* renamed from: q */
    private boolean m15348q(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String P = m15112P();
        if (P != null && P.equals(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: r */
    private boolean m15352r(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String Q = m15113Q();
        if (Q != null && Q.equals(str)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C3211r0 m15354s(Context context) {
        if (this.f11259N == null) {
            this.f11259N = new C3211r0(context, this.f11265Q);
            this.f11259N.mo12561a(C3213b.EVENTS);
            this.f11259N.mo12561a(C3213b.PROFILE_EVENTS);
            this.f11259N.mo12561a(C3213b.PUSH_NOTIFICATION_VIEWED);
            this.f11259N.mo12560a();
        }
        return this.f11259N;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m15360t(String str) {
        if (str != null) {
            try {
                if (!m15348q(str)) {
                    SharedPreferences i0 = m15318i0();
                    if (i0 != null) {
                        Editor edit = i0.edit();
                        edit.putString(m15089D("fcm_token"), str);
                        C3217s1.m15529a(edit);
                    }
                }
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "FcmManager: Unable to cache FCM Token", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m15364u(String str) {
        if (str != null) {
            try {
                if (!m15352r(str)) {
                    SharedPreferences i0 = m15318i0();
                    if (i0 != null) {
                        Editor edit = i0.edit();
                        edit.putString(m15089D("registration_id"), str);
                        C3217s1.m15529a(edit);
                    }
                }
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "GcmManager: Unable to cache GCM Token", th);
            }
        }
    }

    /* renamed from: v */
    private boolean m15368v(String str) {
        if (!this.f11265Q.mo12112p()) {
            return C3217s1.m15530a(this.f11261O, m15089D(str), false);
        }
        boolean a = C3217s1.m15530a(this.f11261O, m15089D(str), false);
        if (!a) {
            a = C3217s1.m15530a(this.f11261O, str, false);
        }
        return a;
    }

    /* renamed from: w */
    private void m15372w(Context context) {
        if (this.f11292o0 == null) {
            this.f11292o0 = new C3158c(context);
        }
        m15205a0().removeCallbacks(this.f11292o0);
        m15205a0().postDelayed(this.f11292o0, 1000);
        m15117U().mo12315c(m15110N(), "Scheduling delayed queue flush on main event loop");
    }

    /* renamed from: x */
    private void m15377x(Context context) {
        if (!this.f11265Q.mo12109m()) {
            m15186a((Runnable) new C3170i(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m15383y(String str) {
        if (str == null) {
            str = mo12479g();
        }
        if (str != null) {
            try {
                C3224t1 p = mo12491p();
                if (p != null) {
                    p.mo12617a(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: n */
    public int mo12489n() {
        return this.f11282e0;
    }

    /* renamed from: m */
    private void m15332m(String str) {
        C3244x1 x1Var = new C3244x1();
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid multi value for key ");
        sb.append(str);
        sb.append(", profile multi value operation aborted.");
        String sb2 = sb.toString();
        x1Var.mo12656a(512);
        x1Var.mo12658a(sb2);
        m15236b(x1Var);
        m15117U().mo12307a(m15110N(), sb2);
    }

    /* renamed from: n */
    private void m15336n(String str) {
        C3244x1 x1Var = new C3244x1();
        x1Var.mo12656a(523);
        StringBuilder sb = new StringBuilder();
        String str2 = "Invalid multi-value property key ";
        sb.append(str2);
        sb.append(str);
        x1Var.mo12658a(sb.toString());
        m15236b(x1Var);
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(" profile multi value operation aborted");
        U.mo12307a(N, sb2.toString());
    }

    /* renamed from: i */
    public void mo12483i(String str) {
        if (str == null) {
            return;
        }
        if (this.f11276a.isEmpty() || !this.f11276a.equals(str)) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Screen changed to ");
            sb.append(str);
            U.mo12307a(N, sb.toString());
            this.f11276a = str;
            m15298f((JSONObject) null);
        }
    }

    /* renamed from: p */
    public C3224t1 mo12491p() {
        return this.f11270U;
    }

    /* renamed from: d */
    static void m15269d(Activity activity) {
        m15145a(activity, (String) null);
    }

    /* renamed from: e */
    public static void m15282e(Activity activity) {
        m15214b(activity, (String) null);
    }

    /* renamed from: f */
    private void m15299f(boolean z) {
        synchronized (this.f11288k0) {
            this.f11287j0 = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m15306g(boolean z) {
        synchronized (this.f11295r0) {
            this.f11296s0 = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m15344p(String str) {
        if (str == null) {
            str = "";
        }
        try {
            C3244x1 d = this.f11294q0.mo12669d(str);
            String obj = d.mo12660c().toString();
            if (obj.isEmpty()) {
                C3244x1 x1Var = new C3244x1();
                x1Var.mo12656a(512);
                x1Var.mo12658a("Key is empty, profile removeValueForKey aborted.");
                m15236b(x1Var);
                m15117U().mo12307a(m15110N(), "Key is empty, profile removeValueForKey aborted");
                return;
            }
            if (d.mo12655a() != 0) {
                m15236b(d);
            }
            m15300f0().mo12287d(obj);
            m15288e(new JSONObject().put(obj, new JSONObject().put("$delete", true)));
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("removing value for key ");
            sb.append(obj);
            sb.append(" from user profile");
            U.mo12315c(N, sb.toString());
        } catch (Throwable th) {
            C3111h1 U2 = m15117U();
            String N2 = m15110N();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to remove profile value for key ");
            sb2.append(str);
            U2.mo12316c(N2, sb2.toString(), th);
        }
    }

    /* renamed from: q */
    private boolean m15347q(Context context) {
        boolean z = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m15350r(Context context) {
        if (!m15341o0()) {
            m15320j(context);
            m15095F0();
        }
    }

    /* renamed from: x */
    private boolean m15378x(String str) {
        boolean z;
        synchronized (this.f11250E0) {
            z = this.f11249D0 != null && this.f11249D0.equals(str);
        }
        return z;
    }

    /* renamed from: h */
    public C3201x0 mo12480h() {
        return this.f11286i0;
    }

    /* renamed from: o */
    public int mo12490o() {
        return f11237Y0;
    }

    /* renamed from: B */
    private synchronized void m15083B(String str) {
        if (this.f11279b0 == null) {
            this.f11279b0 = str;
        }
    }

    /* renamed from: d */
    public static C3150p0 m15267d(Context context, String str) {
        f11244f1 = C3073c.f10987g;
        CleverTapInstanceConfig cleverTapInstanceConfig = f11234V0;
        if (cleverTapInstanceConfig != null) {
            return m15131a(context, cleverTapInstanceConfig, str);
        }
        f11234V0 = m15326l(context);
        CleverTapInstanceConfig cleverTapInstanceConfig2 = f11234V0;
        if (cleverTapInstanceConfig2 != null) {
            return m15131a(context, cleverTapInstanceConfig2, str);
        }
        return null;
    }

    /* renamed from: e */
    public static void m15289e(boolean z) {
        f11236X0 = z;
    }

    /* renamed from: h */
    private synchronized void m15313h(JSONObject jSONObject) {
        if (this.f11281d0 == null) {
            this.f11281d0 = jSONObject;
        }
    }

    /* renamed from: o */
    private Object m15339o(String str) {
        return m15300f0().mo12286c(str);
    }

    /* renamed from: y */
    private void m15381y() {
        C3110h0 h0Var = this.f11257L0;
        if (h0Var != null) {
            h0Var.mo12305b();
        }
    }

    /* renamed from: c */
    private void m15251c(Activity activity) {
        if (!m15084B()) {
            StringBuilder sb = new StringBuilder();
            sb.append("In-app notifications will not be shown for this activity (");
            sb.append(activity != null ? activity.getLocalClassName() : "");
            sb.append(")");
            C3111h1.m14930d(sb.toString());
        } else if (this.f11278b != null) {
            m15117U().mo12315c(m15110N(), "Found a pending inapp runnable. Scheduling it");
            m15205a0().postDelayed(this.f11278b, 200);
            this.f11278b = null;
        } else {
            m15377x(this.f11261O);
        }
    }

    /* renamed from: e */
    private void m15285e(Context context, JSONObject jSONObject, int i) {
        if (i == 4) {
            m15300f0().mo12280a(context, jSONObject, i);
        }
    }

    /* renamed from: v */
    private void m15367v(Context context) {
        if (this.f11293p0 == null) {
            this.f11293p0 = new C3156b(context);
        }
        m15205a0().removeCallbacks(this.f11293p0);
        m15205a0().post(this.f11293p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public String m15089D(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(m15116T().mo12093a());
        return sb.toString();
    }

    /* renamed from: e */
    private void m15283e(Context context) {
        C3217s1.m15532b(context, m15089D("comms_last_ts"), 0);
    }

    /* renamed from: f */
    private static void m15293f(@C0195i0 Activity activity) {
        if (activity == null) {
            f11240b1 = null;
            return;
        }
        if (!activity.getLocalClassName().contains("InAppNotificationActivity")) {
            f11240b1 = new WeakReference<>(activity);
        }
    }

    /* renamed from: w */
    private boolean m15373w(String str) {
        return !str.equals(m15292f("comms_dmn", (String) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15376x() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11256K0
            monitor-enter(r0)
            com.clevertap.android.sdk.f0 r1 = r5.f11255J0     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x000c
            r5.m15381y()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            java.lang.String r1 = r5.mo12479g()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0029
            com.clevertap.android.sdk.f0 r1 = new com.clevertap.android.sdk.f0     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r5.mo12479g()     // Catch:{ all -> 0x0034 }
            android.content.Context r3 = r5.f11261O     // Catch:{ all -> 0x0034 }
            com.clevertap.android.sdk.r0 r3 = r5.m15354s(r3)     // Catch:{ all -> 0x0034 }
            boolean r4 = f11245g1     // Catch:{ all -> 0x0034 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0034 }
            r5.f11255J0 = r1     // Catch:{ all -> 0x0034 }
            r5.m15381y()     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0029:
            com.clevertap.android.sdk.h1 r1 = r5.m15117U()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "CRITICAL : No device ID found!"
            r1.mo12310b(r2)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15376x():void");
    }

    /* renamed from: y */
    private void m15382y(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C0770p.f3528i0);
        Intent intent = new Intent(CTBackgroundIntentService.f10763a);
        intent.setPackage(context.getPackageName());
        PendingIntent service = PendingIntent.getService(context, m15110N().hashCode(), intent, MQEncoder.CARRY_MASK);
        if (alarmManager != null && service != null) {
            alarmManager.cancel(service);
        }
    }

    /* renamed from: g */
    public String mo12479g() {
        return this.f11285h0.mo12596h();
    }

    /* renamed from: i */
    public Map<String, C3227u0> mo12482i() {
        return m15300f0().mo12277a(this.f11261O);
    }

    /* renamed from: q */
    public int mo12492q() {
        int X = m15120X();
        if (X == 0) {
            return -1;
        }
        return ((int) (System.currentTimeMillis() / 1000)) - X;
    }

    /* renamed from: r */
    public int mo12493r() {
        C3227u0 a = m15300f0().mo12276a("App Launched");
        if (a != null) {
            return a.mo12621a();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:(5:4|5|6|7|(1:9))|(3:13|14|(1:16))|(2:20|21)|(3:25|26|(2:28|(1:30)))|34|35|(1:37)|38|39|(1:41)|42|44|45|(2:47|(2:49|(3:52|53|50)))|54|55|(2:57|(1:59))|60|61|62|63|(2:65|66)|70|(3:72|73|(6:75|(1:77)|78|(3:80|81|(2:83|(1:87)))|91|(2:93|(6:95|(1:97)|107|(2:100|98)|106|101))))|104) */
    /* JADX WARNING: Can't wrap try/catch for region: R(29:(5:4|5|6|7|(1:9))|13|14|(1:16)|(2:20|21)|25|26|(2:28|(1:30))|34|35|(1:37)|38|39|(1:41)|42|44|45|(2:47|(2:49|(3:52|53|50)))|54|55|(2:57|(1:59))|60|61|62|63|(2:65|66)|70|(3:72|73|(6:75|(1:77)|78|(3:80|81|(2:83|(1:87)))|91|(2:93|(6:95|(1:97)|107|(2:100|98)|106|101))))|104) */
    /* JADX WARNING: Can't wrap try/catch for region: R(34:4|5|6|7|(1:9)|13|14|(1:16)|20|21|25|26|(2:28|(1:30))|34|35|(1:37)|38|39|(1:41)|42|44|45|(2:47|(2:49|(3:52|53|50)))|54|55|(2:57|(1:59))|60|61|62|63|(2:65|66)|70|(3:72|73|(6:75|(1:77)|78|(3:80|81|(2:83|(1:87)))|91|(2:93|(6:95|(1:97)|107|(2:100|98)|106|101))))|104) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x014b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0150 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4 A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[Catch:{ all -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a A[SYNTHETIC, Splitter:B:65:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0192 A[SYNTHETIC, Splitter:B:72:0x0192] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15284e(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "ack"
            java.lang.String r1 = "pf"
            java.lang.String r2 = "pushamp_notifs"
            java.lang.String r3 = "dbg_lvl"
            java.lang.String r4 = "console"
            java.lang.String r5 = "_j"
            java.lang.String r6 = "_i"
            java.lang.String r7 = "arp"
            java.lang.String r8 = "g"
            if (r15 != 0) goto L_0x0022
            com.clevertap.android.sdk.h1 r14 = r13.m15117U()
            java.lang.String r15 = r13.m15110N()
            java.lang.String r0 = "Problem processing queue response, response is null"
            r14.mo12315c(r15, r0)
            return
        L_0x0022:
            com.clevertap.android.sdk.h1 r9 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = r13.m15110N()     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0291 }
            r11.<init>()     // Catch:{ all -> 0x0291 }
            java.lang.String r12 = "Trying to process response: "
            r11.append(r12)     // Catch:{ all -> 0x0291 }
            r11.append(r15)     // Catch:{ all -> 0x0291 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0291 }
            r9.mo12315c(r10, r11)     // Catch:{ all -> 0x0291 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0291 }
            r9.<init>(r15)     // Catch:{ all -> 0x0291 }
            com.clevertap.android.sdk.CleverTapInstanceConfig r15 = r13.f11265Q     // Catch:{ all -> 0x004f }
            boolean r15 = r15.mo12109m()     // Catch:{ all -> 0x004f }
            if (r15 != 0) goto L_0x005d
            r13.m15243b(r9, r14)     // Catch:{ all -> 0x004f }
            goto L_0x005d
        L_0x004f:
            r15 = move-exception
            com.clevertap.android.sdk.h1 r10 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.String r11 = r13.m15110N()     // Catch:{ all -> 0x0291 }
            java.lang.String r12 = "Failed to process in-app notifications from the response!"
            r10.mo12316c(r11, r12, r15)     // Catch:{ all -> 0x0291 }
        L_0x005d:
            boolean r15 = r9.has(r8)     // Catch:{ all -> 0x0089 }
            if (r15 == 0) goto L_0x0097
            java.lang.String r15 = r9.getString(r8)     // Catch:{ all -> 0x0089 }
            com.clevertap.android.sdk.t0 r8 = r13.f11285h0     // Catch:{ all -> 0x0089 }
            r8.mo12590b(r15)     // Catch:{ all -> 0x0089 }
            com.clevertap.android.sdk.h1 r8 = r13.m15117U()     // Catch:{ all -> 0x0089 }
            java.lang.String r10 = r13.m15110N()     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r11.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r12 = "Got a new device ID: "
            r11.append(r12)     // Catch:{ all -> 0x0089 }
            r11.append(r15)     // Catch:{ all -> 0x0089 }
            java.lang.String r15 = r11.toString()     // Catch:{ all -> 0x0089 }
            r8.mo12315c(r10, r15)     // Catch:{ all -> 0x0089 }
            goto L_0x0097
        L_0x0089:
            r15 = move-exception
            com.clevertap.android.sdk.h1 r8 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = r13.m15110N()     // Catch:{ all -> 0x0291 }
            java.lang.String r11 = "Failed to update device ID!"
            r8.mo12316c(r10, r11, r15)     // Catch:{ all -> 0x0291 }
        L_0x0097:
            com.clevertap.android.sdk.g1 r15 = r13.m15300f0()     // Catch:{ all -> 0x009f }
            r15.mo12279a(r14, r9)     // Catch:{ all -> 0x009f }
            goto L_0x00ad
        L_0x009f:
            r15 = move-exception
            com.clevertap.android.sdk.h1 r8 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = r13.m15110N()     // Catch:{ all -> 0x0291 }
            java.lang.String r11 = "Failed to sync local cache with upstream"
            r8.mo12316c(r10, r11, r15)     // Catch:{ all -> 0x0291 }
        L_0x00ad:
            boolean r15 = r9.has(r7)     // Catch:{ all -> 0x00c3 }
            if (r15 == 0) goto L_0x00d1
            java.lang.Object r15 = r9.get(r7)     // Catch:{ all -> 0x00c3 }
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ all -> 0x00c3 }
            int r7 = r15.length()     // Catch:{ all -> 0x00c3 }
            if (r7 <= 0) goto L_0x00d1
            r13.m15225b(r14, r15)     // Catch:{ all -> 0x00c3 }
            goto L_0x00d1
        L_0x00c3:
            r15 = move-exception
            com.clevertap.android.sdk.h1 r7 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.String r8 = r13.m15110N()     // Catch:{ all -> 0x0291 }
            java.lang.String r10 = "Failed to process ARP"
            r7.mo12316c(r8, r10, r15)     // Catch:{ all -> 0x0291 }
        L_0x00d1:
            boolean r15 = r9.has(r6)     // Catch:{ all -> 0x00de }
            if (r15 == 0) goto L_0x00de
            long r6 = r9.getLong(r6)     // Catch:{ all -> 0x00de }
            r13.m15148a(r14, r6)     // Catch:{ all -> 0x00de }
        L_0x00de:
            boolean r15 = r9.has(r5)     // Catch:{ all -> 0x00eb }
            if (r15 == 0) goto L_0x00eb
            long r5 = r9.getLong(r5)     // Catch:{ all -> 0x00eb }
            r13.m15217b(r14, r5)     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r15 = 0
            boolean r5 = r9.has(r4)     // Catch:{ all -> 0x011b }
            if (r5 == 0) goto L_0x011b
            java.lang.Object r4 = r9.get(r4)     // Catch:{ all -> 0x011b }
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ all -> 0x011b }
            int r5 = r4.length()     // Catch:{ all -> 0x011b }
            if (r5 <= 0) goto L_0x011b
            r5 = 0
        L_0x00ff:
            int r6 = r4.length()     // Catch:{ all -> 0x011b }
            if (r5 >= r6) goto L_0x011b
            com.clevertap.android.sdk.h1 r6 = r13.m15117U()     // Catch:{ all -> 0x011b }
            java.lang.String r7 = r13.m15110N()     // Catch:{ all -> 0x011b }
            java.lang.Object r8 = r4.get(r5)     // Catch:{ all -> 0x011b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x011b }
            r6.mo12307a(r7, r8)     // Catch:{ all -> 0x011b }
            int r5 = r5 + 1
            goto L_0x00ff
        L_0x011b:
            boolean r4 = r9.has(r3)     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x014b
            int r3 = r9.getInt(r3)     // Catch:{ all -> 0x014b }
            if (r3 < 0) goto L_0x014b
            m15212b(r3)     // Catch:{ all -> 0x014b }
            com.clevertap.android.sdk.h1 r4 = r13.m15117U()     // Catch:{ all -> 0x014b }
            java.lang.String r5 = r13.m15110N()     // Catch:{ all -> 0x014b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r6.<init>()     // Catch:{ all -> 0x014b }
            java.lang.String r7 = "Set debug level to "
            r6.append(r7)     // Catch:{ all -> 0x014b }
            r6.append(r3)     // Catch:{ all -> 0x014b }
            java.lang.String r3 = " for this session (set by upstream)"
            r6.append(r3)     // Catch:{ all -> 0x014b }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x014b }
            r4.mo12315c(r5, r3)     // Catch:{ all -> 0x014b }
        L_0x014b:
            com.clevertap.android.sdk.e1 r3 = r13.f11302y0     // Catch:{ all -> 0x0150 }
            r3.mo12246b(r14, r9)     // Catch:{ all -> 0x0150 }
        L_0x0150:
            com.clevertap.android.sdk.CleverTapInstanceConfig r3 = r13.m15116T()     // Catch:{ all -> 0x0291 }
            boolean r3 = r3.mo12109m()     // Catch:{ all -> 0x0291 }
            if (r3 != 0) goto L_0x0188
            com.clevertap.android.sdk.h1 r3 = r13.m15117U()     // Catch:{ all -> 0x016b }
            java.lang.String r4 = r13.m15110N()     // Catch:{ all -> 0x016b }
            java.lang.String r5 = "Processing inbox messages..."
            r3.mo12315c(r4, r5)     // Catch:{ all -> 0x016b }
            r13.m15276d(r9)     // Catch:{ all -> 0x016b }
            goto L_0x0188
        L_0x016b:
            r3 = move-exception
            com.clevertap.android.sdk.h1 r4 = r13.m15117U()     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0291 }
            r5.<init>()     // Catch:{ all -> 0x0291 }
            java.lang.String r6 = "Notification inbox exception: "
            r5.append(r6)     // Catch:{ all -> 0x0291 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0291 }
            r5.append(r3)     // Catch:{ all -> 0x0291 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0291 }
            r4.mo12314c(r3)     // Catch:{ all -> 0x0291 }
        L_0x0188:
            com.clevertap.android.sdk.CleverTapInstanceConfig r3 = r13.m15116T()     // Catch:{ all -> 0x0291 }
            boolean r3 = r3.mo12109m()     // Catch:{ all -> 0x0291 }
            if (r3 != 0) goto L_0x02a5
            boolean r3 = r9.has(r2)     // Catch:{ all -> 0x02a5 }
            if (r3 == 0) goto L_0x02a5
            com.clevertap.android.sdk.h1 r3 = r13.m15117U()     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = r13.m15110N()     // Catch:{ all -> 0x02a5 }
            java.lang.String r5 = "Processing pushamp messages..."
            r3.mo12315c(r4, r5)     // Catch:{ all -> 0x02a5 }
            org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch:{ all -> 0x02a5 }
            java.lang.String r3 = "list"
            org.json.JSONArray r3 = r2.getJSONArray(r3)     // Catch:{ all -> 0x02a5 }
            int r4 = r3.length()     // Catch:{ all -> 0x02a5 }
            if (r4 <= 0) goto L_0x01c5
            com.clevertap.android.sdk.h1 r4 = r13.m15117U()     // Catch:{ all -> 0x02a5 }
            java.lang.String r5 = r13.m15110N()     // Catch:{ all -> 0x02a5 }
            java.lang.String r6 = "Handling Push payload locally"
            r4.mo12315c(r5, r6)     // Catch:{ all -> 0x02a5 }
            r13.m15241b(r3)     // Catch:{ all -> 0x02a5 }
        L_0x01c5:
            boolean r3 = r2.has(r1)     // Catch:{ all -> 0x02a5 }
            if (r3 == 0) goto L_0x0244
            int r1 = r2.getInt(r1)     // Catch:{ all -> 0x0227 }
            com.clevertap.android.sdk.h1 r3 = r13.m15117U()     // Catch:{ all -> 0x0227 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0227 }
            r4.<init>()     // Catch:{ all -> 0x0227 }
            java.lang.String r5 = "Ping frequency received - "
            r4.append(r5)     // Catch:{ all -> 0x0227 }
            r4.append(r1)     // Catch:{ all -> 0x0227 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0227 }
            r3.mo12314c(r4)     // Catch:{ all -> 0x0227 }
            com.clevertap.android.sdk.h1 r3 = r13.m15117U()     // Catch:{ all -> 0x0227 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0227 }
            r4.<init>()     // Catch:{ all -> 0x0227 }
            java.lang.String r5 = "Stored Ping Frequency - "
            r4.append(r5)     // Catch:{ all -> 0x0227 }
            int r5 = r13.m15342p(r14)     // Catch:{ all -> 0x0227 }
            r4.append(r5)     // Catch:{ all -> 0x0227 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0227 }
            r3.mo12314c(r4)     // Catch:{ all -> 0x0227 }
            int r3 = r13.m15342p(r14)     // Catch:{ all -> 0x0227 }
            if (r1 == r3) goto L_0x0244
            r13.m15253c(r14, r1)     // Catch:{ all -> 0x0227 }
            com.clevertap.android.sdk.CleverTapInstanceConfig r1 = r13.f11265Q     // Catch:{ all -> 0x0227 }
            boolean r1 = r1.mo12110n()     // Catch:{ all -> 0x0227 }
            if (r1 == 0) goto L_0x0244
            com.clevertap.android.sdk.CleverTapInstanceConfig r1 = r13.f11265Q     // Catch:{ all -> 0x0227 }
            boolean r1 = r1.mo12109m()     // Catch:{ all -> 0x0227 }
            if (r1 != 0) goto L_0x0244
            java.lang.String r1 = "createOrResetJobScheduler"
            com.clevertap.android.sdk.p0$g r3 = new com.clevertap.android.sdk.p0$g     // Catch:{ all -> 0x0227 }
            r3.<init>(r14)     // Catch:{ all -> 0x0227 }
            r13.m15188a(r1, r3)     // Catch:{ all -> 0x0227 }
            goto L_0x0244
        L_0x0227:
            r14 = move-exception
            com.clevertap.android.sdk.h1 r1 = r13.m15117U()     // Catch:{ all -> 0x02a5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a5 }
            r3.<init>()     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = "Error handling ping frequency in response : "
            r3.append(r4)     // Catch:{ all -> 0x02a5 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x02a5 }
            r3.append(r14)     // Catch:{ all -> 0x02a5 }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x02a5 }
            r1.mo12314c(r14)     // Catch:{ all -> 0x02a5 }
        L_0x0244:
            boolean r14 = r2.has(r0)     // Catch:{ all -> 0x02a5 }
            if (r14 == 0) goto L_0x02a5
            boolean r14 = r2.getBoolean(r0)     // Catch:{ all -> 0x02a5 }
            com.clevertap.android.sdk.h1 r0 = r13.m15117U()     // Catch:{ all -> 0x02a5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a5 }
            r1.<init>()     // Catch:{ all -> 0x02a5 }
            java.lang.String r2 = "Received ACK -"
            r1.append(r2)     // Catch:{ all -> 0x02a5 }
            r1.append(r14)     // Catch:{ all -> 0x02a5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02a5 }
            r0.mo12314c(r1)     // Catch:{ all -> 0x02a5 }
            if (r14 == 0) goto L_0x02a5
            org.json.JSONArray r14 = r13.m15321j0()     // Catch:{ all -> 0x02a5 }
            java.lang.String[] r0 = new java.lang.String[r15]     // Catch:{ all -> 0x02a5 }
            if (r14 == 0) goto L_0x0276
            int r0 = r14.length()     // Catch:{ all -> 0x02a5 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x02a5 }
        L_0x0276:
            int r1 = r0.length     // Catch:{ all -> 0x02a5 }
            if (r15 >= r1) goto L_0x0282
            java.lang.String r1 = r14.getString(r15)     // Catch:{ all -> 0x02a5 }
            r0[r15] = r1     // Catch:{ all -> 0x02a5 }
            int r15 = r15 + 1
            goto L_0x0276
        L_0x0282:
            com.clevertap.android.sdk.h1 r14 = r13.m15117U()     // Catch:{ all -> 0x02a5 }
            java.lang.String r15 = "Updating RTL values..."
            r14.mo12314c(r15)     // Catch:{ all -> 0x02a5 }
            com.clevertap.android.sdk.r0 r14 = r13.f11259N     // Catch:{ all -> 0x02a5 }
            r14.mo12565a(r0)     // Catch:{ all -> 0x02a5 }
            goto L_0x02a5
        L_0x0291:
            r14 = move-exception
            int r15 = r13.f11267R
            int r15 = r15 + 1
            r13.f11267R = r15
            com.clevertap.android.sdk.h1 r15 = r13.m15117U()
            java.lang.String r0 = r13.m15110N()
            java.lang.String r1 = "Problem process send queue response"
            r15.mo12316c(r0, r1, r14)
        L_0x02a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15284e(android.content.Context, java.lang.String):void");
    }

    /* renamed from: g */
    private void m15303g(Context context, String str) {
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Setting spiky domain to ");
        sb.append(str);
        U.mo12315c(N, sb.toString());
        C3217s1.m15534b(context, m15089D("comms_dmn_spiky"), str);
    }

    /* access modifiers changed from: private */
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public void m15317i(Context context) {
        boolean z;
        Context context2 = context;
        JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            int p = m15342p(context);
            String str = "pfjobid";
            int a = C3217s1.m15522a(context2, str, -1);
            if (a < 0 && p < 0) {
                return;
            }
            if (p < 0) {
                jobScheduler.cancel(a);
                C3217s1.m15532b(context2, str, -1);
                return;
            }
            ComponentName componentName = new ComponentName(context2, CTBackgroundJobService.class);
            boolean z2 = a < 0 && p > 0;
            JobInfo a2 = m15126a(a, jobScheduler);
            if (!(a2 == null || a2.getIntervalMillis() == ((long) p) * 60000)) {
                jobScheduler.cancel(a);
                C3217s1.m15532b(context2, str, -1);
                z2 = true;
            }
            if (z2) {
                int hashCode = m15110N().hashCode();
                JobInfo.Builder builder = new JobInfo.Builder(hashCode, componentName);
                builder.setRequiredNetworkType(1);
                builder.setRequiresCharging(false);
                if (VERSION.SDK_INT >= 24) {
                    builder.setPeriodic(((long) p) * 60000, C2876e.f10138o);
                } else {
                    builder.setPeriodic((long) (p * 60 * 1000));
                }
                if (VERSION.SDK_INT >= 26) {
                    z = true;
                    builder.setRequiresBatteryNotLow(true);
                } else {
                    z = true;
                }
                if (this.f11285h0.mo12588a(context2, "android.permission.RECEIVE_BOOT_COMPLETED")) {
                    builder.setPersisted(z);
                }
                if (jobScheduler.schedule(builder.build()) == z) {
                    String N = m15110N();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Job scheduled - ");
                    sb.append(hashCode);
                    C3111h1.m14931d(N, sb.toString());
                    C3217s1.m15532b(context2, str, hashCode);
                } else {
                    String N2 = m15110N();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Job not scheduled - ");
                    sb2.append(hashCode);
                    C3111h1.m14931d(N2, sb2.toString());
                }
            }
        }
    }

    /* renamed from: k */
    private JSONObject m15323k(Context context) {
        try {
            String h0 = m15314h0();
            if (h0 == null) {
                return null;
            }
            Map all = C3217s1.m15526a(context, h0).getAll();
            Iterator it = all.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Entry) it.next()).getValue();
                if ((value instanceof Number) && ((Number) value).intValue() == -1) {
                    it.remove();
                }
            }
            JSONObject jSONObject = new JSONObject(all);
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Fetched ARP for namespace key: ");
            sb.append(h0);
            sb.append(" values: ");
            sb.append(all.toString());
            U.mo12315c(N, sb.toString());
            return jSONObject;
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "Failed to construct ARP object", th);
            return null;
        }
    }

    @C0195i0
    /* renamed from: n */
    private static C3150p0 m15334n(Context context) {
        C3150p0 m = m15330m(context);
        if (m == null) {
            HashMap<String, C3150p0> hashMap = f11235W0;
            if (hashMap != null && !hashMap.isEmpty()) {
                for (String str : f11235W0.keySet()) {
                    m = (C3150p0) f11235W0.get(str);
                    if (m != null) {
                        break;
                    }
                }
            }
        }
        return m;
    }

    /* renamed from: h */
    public void mo12481h(String str) {
        if (str != null && !str.trim().equals("")) {
            mo12448a(str, null);
        }
    }

    /* renamed from: t */
    public ArrayList<CTInboxMessage> mo12495t() {
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.f11256K0) {
            if (this.f11255J0 != null) {
                Iterator it = this.f11255J0.mo12256c().iterator();
                while (it.hasNext()) {
                    arrayList.add(new CTInboxMessage(((C3129l0) it.next()).mo12377k()));
                }
                return arrayList;
            }
            m15117U().mo12307a(m15110N(), "Notification Inbox not initialized");
            return null;
        }
    }

    /* renamed from: u */
    public void mo12496u() {
        if (m15116T().mo12109m()) {
            m15117U().mo12307a(m15110N(), "Instance is analytics only, not initializing Notification Inbox");
            return;
        }
        m15188a("initializeInbox", (Runnable) new C3177l0());
    }

    /* renamed from: A */
    private synchronized void m15081A(String str) {
        if (this.f11280c0 == null) {
            this.f11280c0 = str;
        }
    }

    /* renamed from: C */
    private synchronized void m15086C(String str) {
        if (this.f11277a0 == null) {
            this.f11277a0 = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public String m15327l(String str) {
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("GcmManager: Requesting a GCM token for Sender ID - ");
        sb.append(str);
        U.mo12315c(N, sb.toString());
        String str2 = null;
        try {
            str2 = InstanceID.getInstance(this.f11261O).getToken(str, C2685a.f9782s, null);
            C3111h1 U2 = m15117U();
            String N2 = m15110N();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GCM token : ");
            sb2.append(str2);
            U2.mo12311b(N2, sb2.toString());
            return str2;
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "GcmManager: Error requesting GCM token", th);
            return str2;
        }
    }

    /* renamed from: s */
    private HttpsURLConnection m15356s(String str) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(C14236a.DEFAULT_TIMEOUT);
        httpsURLConnection.setReadTimeout(C14236a.DEFAULT_TIMEOUT);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpsURLConnection.setRequestProperty("X-CleverTap-Account-ID", m15110N());
        httpsURLConnection.setRequestProperty("X-CleverTap-Token", this.f11265Q.mo12099c());
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.f11265Q.mo12115s()) {
            SSLContext k0 = m15325k0();
            if (k0 != null) {
                httpsURLConnection.setSSLSocketFactory(m15141a(k0));
            }
        }
        return httpsURLConnection;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: w */
    private Location m15370w() {
        try {
            LocationManager locationManager = (LocationManager) this.f11261O.getSystemService("location");
            if (locationManager == null) {
                C3111h1.m14930d("Location Manager is null.");
                return null;
            }
            Location location = null;
            Location location2 = null;
            for (String lastKnownLocation : locationManager.getProviders(true)) {
                location2 = locationManager.getLastKnownLocation(lastKnownLocation);
                if (location2 != null) {
                    if (location == null || location2.getAccuracy() < location.getAccuracy()) {
                        location = location2;
                    }
                }
            }
            return location;
        } catch (SecurityException e) {
            C3111h1.m14941f("Location security exception", (Throwable) e);
        } catch (Throwable th) {
            C3111h1.m14941f("Couldn't get user's location", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m15386z() {
        C3110h0 h0Var = this.f11257L0;
        if (h0Var != null) {
            h0Var.mo12304a();
        }
    }

    /* renamed from: m */
    public Location mo12488m() {
        return m15370w();
    }

    /* renamed from: b */
    public static void m15214b(Activity activity, String str) {
        if (f11235W0 == null) {
            m15133a((Context) activity, (String) null, str);
        }
        m15289e(true);
        if (f11235W0 == null) {
            C3111h1.m14938f("Instances is null in onActivityResumed!");
            return;
        }
        String W = m15119W();
        m15293f(activity);
        if (W == null || !W.equals(activity.getLocalClassName())) {
            f11237Y0++;
        }
        if (f11241c1 <= 0) {
            f11241c1 = ((int) System.currentTimeMillis()) / 1000;
        }
        for (String str2 : f11235W0.keySet()) {
            C3150p0 p0Var = (C3150p0) f11235W0.get(str2);
            if (p0Var != null) {
                try {
                    p0Var.m15144a(activity);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: f */
    private String m15292f(String str, String str2) {
        if (!this.f11265Q.mo12112p()) {
            return C3217s1.m15527a(this.f11261O, m15089D(str), str2);
        }
        String a = C3217s1.m15527a(this.f11261O, m15089D(str), str2);
        if (a == null) {
            a = C3217s1.m15527a(this.f11261O, str, str2);
        }
        return a;
    }

    /* renamed from: g */
    private void m15302g(Context context) {
        m15270d(context);
        m15146a(context);
        m15252c(context);
        m15283e(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m15312h(Context context) {
        int p = m15342p(context);
        if (p > 0) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(C0770p.f3528i0);
            Intent intent = new Intent(CTBackgroundIntentService.f10763a);
            intent.setPackage(context.getPackageName());
            PendingIntent service = PendingIntent.getService(context, m15110N().hashCode(), intent, MQEncoder.CARRY_MASK);
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime(), 60000 * ((long) p), service);
            }
        }
    }

    /* renamed from: v */
    public void mo12497v() {
        mo12437a(new CTInboxStyleConfig());
    }

    /* renamed from: d */
    private void m15272d(Context context, JSONObject jSONObject, int i) {
        m15167a(context, jSONObject, i == 3 ? C3213b.PROFILE_EVENTS : C3213b.EVENTS);
    }

    /* renamed from: u */
    static void m15362u(Context context) {
        HashMap<String, C3150p0> hashMap = f11235W0;
        String str = "Instance doesn't allow Background sync, not running the Job";
        if (hashMap == null) {
            C3150p0 m = m15330m(context);
            if (m != null) {
                if (m.m15116T().mo12110n()) {
                    m.m15149a(context, (JobParameters) null);
                } else {
                    C3111h1.m14930d(str);
                }
            }
            return;
        }
        for (String str2 : hashMap.keySet()) {
            C3150p0 p0Var = (C3150p0) f11235W0.get(str2);
            if (p0Var != null) {
                if (p0Var.m15116T().mo12109m()) {
                    C3111h1.m14931d(str2, "Instance is Analytics Only not processing device token");
                } else if (!p0Var.m15116T().mo12110n()) {
                    C3111h1.m14931d(str2, str);
                } else {
                    p0Var.m15149a(context, (JobParameters) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public Date m15385z(String str) {
        try {
            return new SimpleDateFormat("HH:mm", Locale.US).parse(str);
        } catch (ParseException unused) {
            return new Date(0);
        }
    }

    /* renamed from: j */
    public C3096f1 mo12484j() {
        return this.f11301x0;
    }

    /* renamed from: d */
    private void m15271d(Context context, JSONObject jSONObject) {
        m15167a(context, jSONObject, C3213b.PUSH_NOTIFICATION_VIEWED);
    }

    /* renamed from: j */
    public void mo12485j(String str) {
        m15188a("removeValueForKey", (Runnable) new C3190s(str));
    }

    /* renamed from: d */
    private void m15270d(Context context) {
        Editor edit = C3217s1.m15526a(context, "IJ").edit();
        edit.clear();
        C3217s1.m15529a(edit);
    }

    /* renamed from: g */
    private void m15305g(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C3217s1.m15534b(this.f11261O, m15089D("cachedGUIDsKey"), jSONObject.toString());
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Error persisting guid cache: ");
                sb.append(th.toString());
                U.mo12315c(N, sb.toString());
            }
        }
    }

    /* renamed from: f */
    public String mo12477f() {
        return this.f11285h0.mo12589b();
    }

    /* renamed from: l */
    public int mo12487l() {
        synchronized (this.f11256K0) {
            if (this.f11255J0 != null) {
                int d = this.f11255J0.mo12258d();
                return d;
            }
            m15117U().mo12307a(m15110N(), "Notification Inbox not initialized");
            return -1;
        }
    }

    /* renamed from: f */
    private void m15298f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String str = (String) keys.next();
                        jSONObject2.put(str, jSONObject.getString(str));
                    } catch (ClassCastException unused) {
                    }
                }
            }
            m15257c(this.f11261O, jSONObject2, 1);
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: c */
    public void mo12471c(boolean z) {
        m15188a("setOptOut", (Runnable) new C3199w0(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15257c(Context context, JSONObject jSONObject, int i) {
        m15188a("queueEvent", (Runnable) new C3151a(jSONObject, i, context));
    }

    /* renamed from: g */
    public Object mo12478g(String str) {
        if (!this.f11265Q.mo12114r()) {
            return null;
        }
        return m15300f0().mo12284b(str);
    }

    /* renamed from: c */
    private void m15256c(Context context, JSONObject jSONObject) {
        synchronized (this.f11253H0) {
            try {
                jSONObject.put("s", m15120X());
                jSONObject.put("type", C0770p.f3524g0);
                jSONObject.put("ep", System.currentTimeMillis() / 1000);
                C3244x1 D0 = m15091D0();
                if (D0 != null) {
                    jSONObject.put("wzrk_error", m15143a(D0));
                }
                m15117U().mo12315c(m15110N(), "Pushing Notification Viewed event onto DB");
                m15271d(context, jSONObject);
                m15117U().mo12315c(m15110N(), "Pushing Notification Viewed event onto queue flush");
                m15367v(context);
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to queue notification viewed event: ");
                sb.append(jSONObject.toString());
                U.mo12316c(N, sb.toString(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m15359t(Context context) {
        if (m15342p(context) <= 0) {
            m15382y(context);
            return;
        }
        m15382y(context);
        m15312h(context);
    }

    /* renamed from: d */
    public int mo12472d(String str) {
        C3227u0 a = m15300f0().mo12276a(str);
        if (a != null) {
            return a.mo12622b();
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m15277d(boolean z) {
        m15196a(z, true);
    }

    /* renamed from: k */
    public int mo12486k() {
        synchronized (this.f11256K0) {
            if (this.f11255J0 != null) {
                int a = this.f11255J0.mo12251a();
                return a;
            }
            m15117U().mo12307a(m15110N(), "Notification Inbox not initialized");
            return -1;
        }
    }

    /* renamed from: s */
    public C3228u1 mo12494s() {
        C3228u1 u1Var = new C3228u1();
        u1Var.mo12630c(this.f11277a0);
        u1Var.mo12628b(this.f11279b0);
        u1Var.mo12626a(this.f11280c0);
        return u1Var;
    }

    /* renamed from: d */
    public static C3130l1 m15266d(Bundle bundle) {
        boolean z = false;
        if (bundle == null) {
            return new C3130l1(false, false);
        }
        boolean containsKey = bundle.containsKey(f11231S0);
        if (containsKey && bundle.containsKey("nm")) {
            z = true;
        }
        return new C3130l1(containsKey, z);
    }

    /* renamed from: f */
    private void m15295f(Context context, String str) {
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Setting domain to ");
        sb.append(str);
        U.mo12315c(N, sb.toString());
        C3217s1.m15534b(context, m15089D("comms_dmn"), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC, Splitter:B:30:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df A[EDGE_INSN: B:69:0x00df->B:66:0x00df ?: BREAK  
    EDGE_INSN: B:69:0x00df->B:66:0x00df ?: BREAK  
    EDGE_INSN: B:69:0x00df->B:66:0x00df ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df A[EDGE_INSN: B:69:0x00df->B:66:0x00df ?: BREAK  
    EDGE_INSN: B:69:0x00df->B:66:0x00df ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m15145a(android.app.Activity r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "wzrk_from"
            java.lang.String r1 = "wzrk_acct_id"
            java.util.HashMap<java.lang.String, com.clevertap.android.sdk.p0> r2 = f11235W0
            r3 = 0
            if (r2 != 0) goto L_0x000c
            m15133a(r7, r3, r8)
        L_0x000c:
            java.util.HashMap<java.lang.String, com.clevertap.android.sdk.p0> r8 = f11235W0
            if (r8 != 0) goto L_0x0016
            java.lang.String r7 = "Instances is null in onActivityCreated!"
            com.clevertap.android.sdk.C3111h1.m14938f(r7)
            return
        L_0x0016:
            r8 = 1
            android.content.Intent r2 = r7.getIntent()     // Catch:{ all -> 0x002e }
            android.net.Uri r2 = r2.getData()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x002f
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x002f }
            android.os.Bundle r4 = com.clevertap.android.sdk.C3232v1.m15645a(r4, r8)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r4.getString(r1)     // Catch:{ all -> 0x002f }
            goto L_0x0030
        L_0x002e:
            r2 = r3
        L_0x002f:
            r4 = r3
        L_0x0030:
            r5 = 0
            android.content.Intent r7 = r7.getIntent()     // Catch:{ all -> 0x0088 }
            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0088
            boolean r7 = r3.isEmpty()     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0088
            boolean r7 = r3.containsKey(r0)     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x0055
            java.lang.String r7 = "CTPushNotificationReceiver"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x0088 }
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x0078
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r0.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = "ActivityLifecycleCallback: Notification Clicked already processed for "
            r0.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0076 }
            r0.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = ", dropping duplicate."
            r0.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0076 }
            com.clevertap.android.sdk.C3111h1.m14938f(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            goto L_0x0089
        L_0x0078:
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0076 }
            goto L_0x0086
        L_0x0085:
            r0 = r4
        L_0x0086:
            r4 = r0
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            if (r7 == 0) goto L_0x008e
            if (r2 != 0) goto L_0x008e
            return
        L_0x008e:
            java.util.HashMap<java.lang.String, com.clevertap.android.sdk.p0> r7 = f11235W0
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0098:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap<java.lang.String, com.clevertap.android.sdk.p0> r1 = f11235W0
            java.lang.Object r0 = r1.get(r0)
            com.clevertap.android.sdk.p0 r0 = (com.clevertap.android.sdk.C3150p0) r0
            if (r0 == 0) goto L_0x00c4
            if (r4 != 0) goto L_0x00b8
            com.clevertap.android.sdk.CleverTapInstanceConfig r1 = r0.f11265Q
            boolean r1 = r1.mo12112p()
            if (r1 != 0) goto L_0x00c2
        L_0x00b8:
            java.lang.String r1 = r0.m15110N()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c4
        L_0x00c2:
            r1 = 1
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x0098
            if (r3 == 0) goto L_0x00da
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x00da
            java.lang.String r7 = "wzrk_pn"
            boolean r7 = r3.containsKey(r7)
            if (r7 == 0) goto L_0x00da
            r0.mo12435a(r3)
        L_0x00da:
            if (r2 == 0) goto L_0x00df
            r0.mo12434a(r2)     // Catch:{ all -> 0x00df }
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15145a(android.app.Activity, java.lang.String):void");
    }

    /* renamed from: b */
    static void m15219b(Context context, Bundle bundle) {
        if (bundle != null) {
            String str = null;
            try {
                str = bundle.getString("wzrk_acct_id");
            } catch (Throwable unused) {
            }
            HashMap<String, C3150p0> hashMap = f11235W0;
            if (hashMap == null) {
                C3150p0 a = m15132a(context, str);
                if (a != null) {
                    a.mo12435a(bundle);
                }
                return;
            }
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3150p0 p0Var = (C3150p0) f11235W0.get((String) it.next());
                boolean z = false;
                if (p0Var != null && ((str == null && p0Var.f11265Q.mo12112p()) || p0Var.m15110N().equals(str))) {
                    z = true;
                    continue;
                }
                if (z) {
                    p0Var.mo12435a(bundle);
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15294f(Context context) {
        synchronized (this.f11253H0) {
            C3211r0 s = m15354s(context);
            s.mo12569b(C3213b.EVENTS);
            s.mo12569b(C3213b.PROFILE_EVENTS);
            m15302g(context);
        }
    }

    /* renamed from: d */
    public static void m15275d(String str, String str2) {
        m15262c(str, str2, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m15276d(JSONObject jSONObject) {
        if (m15116T().mo12109m()) {
            m15117U().mo12315c(m15110N(), "CleverTap instance is configured to analytics only, not processing inbox messages");
            return;
        }
        m15117U().mo12315c(m15110N(), "Inbox: Processing response");
        String str = "inbox_notifs";
        if (!jSONObject.has(str)) {
            m15117U().mo12315c(m15110N(), "Inbox: Response JSON object doesn't contain the inbox key");
            return;
        }
        try {
            m15193a(jSONObject.getJSONArray(str));
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "InboxResponse: Failed to parse response", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15254c(Context context, C3203y0 y0Var) {
        if (!m15347q(context)) {
            m15117U().mo12315c(m15110N(), "Network connectivity unavailable. Will retry later");
        } else if (m15379x0()) {
            m15117U().mo12307a(m15110N(), "CleverTap Instance has been set to offline, won't send events queue");
        } else {
            if (m15244b(y0Var)) {
                this.f11267R = 0;
                m15295f(context, (String) null);
                m15158a(context, y0Var, (Runnable) new C3162e(context, y0Var));
            } else {
                m15117U().mo12315c(m15110N(), "Pushing Notification Viewed event onto queue DB flush");
                m15157a(context, y0Var);
            }
        }
    }

    /* renamed from: b */
    public static C3150p0 m15209b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return m15131a(context, cleverTapInstanceConfig, (String) null);
    }

    /* renamed from: f */
    public int mo12476f(String str) {
        C3227u0 a = m15300f0().mo12276a(str);
        if (a != null) {
            return a.mo12623c();
        }
        return -1;
    }

    /* renamed from: b */
    private void m15213b(Activity activity) {
        if (m15084B() && f11239a1 != null) {
            Fragment fragment = activity.getFragmentManager().getFragment(new Bundle(), f11239a1.mo11917D());
            if (m15118V() != null) {
                FragmentTransaction beginTransaction = m15118V().getFragmentManager().beginTransaction();
                Bundle bundle = new Bundle();
                bundle.putParcelable("inApp", f11239a1);
                bundle.putParcelable("config", this.f11265Q);
                fragment.setArguments(bundle);
                beginTransaction.setCustomAnimations(17498112, 17498113);
                beginTransaction.add(16908290, fragment, f11239a1.mo11917D());
                String a = this.f11265Q.mo12093a();
                StringBuilder sb = new StringBuilder();
                sb.append("calling InAppFragment ");
                sb.append(f11239a1.mo11939k());
                C3111h1.m14939f(a, sb.toString());
                beginTransaction.commit();
            }
        }
    }

    /* renamed from: d */
    public ArrayList<CTInboxMessage> mo12473d() {
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.f11256K0) {
            if (this.f11255J0 != null) {
                Iterator it = this.f11255J0.mo12255b().iterator();
                while (it.hasNext()) {
                    C3129l0 l0Var = (C3129l0) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("CTMessage Dao - ");
                    sb.append(l0Var.mo12377k().toString());
                    C3111h1.m14938f(sb.toString());
                    arrayList.add(new CTInboxMessage(l0Var.mo12377k()));
                }
                return arrayList;
            }
            m15117U().mo12307a(m15110N(), "Notification Inbox not initialized");
            return null;
        }
    }

    /* renamed from: c */
    private void m15252c(Context context) {
        C3217s1.m15532b(context, m15089D("comms_first_ts"), 0);
    }

    /* renamed from: c */
    private void m15253c(Context context, int i) {
        C3217s1.m15532b(context, "pf", i);
    }

    /* renamed from: c */
    private void m15264c(JSONObject jSONObject) {
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Preparing In-App for display: ");
        sb.append(jSONObject.toString());
        U.mo12307a(N, sb.toString());
        m15186a((Runnable) new C3155a1(this, jSONObject));
    }

    /* renamed from: a */
    public static C3150p0 m15131a(Context context, @C0193h0 CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            C3111h1.m14938f("CleverTapInstanceConfig cannot be null");
            return null;
        }
        if (f11235W0 == null) {
            f11235W0 = new HashMap<>();
        }
        C3150p0 p0Var = (C3150p0) f11235W0.get(cleverTapInstanceConfig.mo12093a());
        if (p0Var == null) {
            p0Var = new C3150p0(context, cleverTapInstanceConfig, str);
            f11235W0.put(cleverTapInstanceConfig.mo12093a(), p0Var);
            if (p0Var.mo12479g() != null) {
                p0Var.m15388z0();
                p0Var.m15097G0();
            }
        } else if (p0Var.m15365u0() && p0Var.m15116T().mo12106j() && C3238w1.m15666c(str)) {
            p0Var.m15192a(null, (String) null, str);
        }
        return p0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15263c(Map<String, Object> map) {
        String str = "Profile push key is empty";
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (String str2 : map.keySet()) {
                    Object obj = map.get(str2);
                    C3244x1 d = this.f11294q0.mo12669d(str2);
                    String obj2 = d.mo12660c().toString();
                    if (d.mo12655a() != 0) {
                        m15236b(d);
                    }
                    if (obj2 == null || obj2.isEmpty()) {
                        C3244x1 x1Var = new C3244x1();
                        x1Var.mo12656a(512);
                        x1Var.mo12658a(str);
                        m15236b(x1Var);
                        m15117U().mo12307a(m15110N(), str);
                    } else {
                        try {
                            C3244x1 a = this.f11294q0.mo12664a(obj, C3250b.Profile);
                            Object c = a.mo12660c();
                            if (a.mo12655a() != 0) {
                                m15236b(a);
                            }
                            if (obj2.equalsIgnoreCase("Phone")) {
                                String obj3 = c.toString();
                                String f = this.f11285h0.mo12594f();
                                if ((f == null || f.isEmpty()) && !obj3.startsWith(C14069f.f41344H)) {
                                    C3244x1 x1Var2 = new C3244x1();
                                    x1Var2.mo12656a(512);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Device country code not available and profile phone: ");
                                    sb.append(obj3);
                                    sb.append(" does not appear to start with country code");
                                    String sb2 = sb.toString();
                                    x1Var2.mo12658a(sb2);
                                    m15236b(x1Var2);
                                    m15117U().mo12307a(m15110N(), sb2);
                                }
                                C3111h1 U = m15117U();
                                String N = m15110N();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Profile phone is: ");
                                sb3.append(obj3);
                                sb3.append(" device country code is: ");
                                if (f == null) {
                                    f = "null";
                                }
                                sb3.append(f);
                                U.mo12315c(N, sb3.toString());
                                c = obj3;
                            }
                            jSONObject2.put(obj2, c);
                            jSONObject.put(obj2, c);
                        } catch (Throwable unused) {
                            C3244x1 x1Var3 = new C3244x1();
                            x1Var3.mo12656a(512);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Object value wasn't a primitive (");
                            sb4.append(obj);
                            sb4.append(") for profile field ");
                            sb4.append(obj2);
                            String sb5 = sb4.toString();
                            x1Var3.mo12658a(sb5);
                            m15236b(x1Var3);
                            m15117U().mo12307a(m15110N(), sb5);
                        }
                    }
                }
                C3111h1 U2 = m15117U();
                String N2 = m15110N();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Constructed custom profile: ");
                sb6.append(jSONObject.toString());
                U2.mo12315c(N2, sb6.toString());
                if (jSONObject2.length() > 0) {
                    m15300f0().mo12285b(jSONObject2);
                }
                m15288e(jSONObject);
            } catch (Exception e) {
                m15236b(new C3244x1(512, "Invalid phone number"));
                C3111h1 U3 = m15117U();
                String N3 = m15110N();
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Invalid phone number: ");
                sb7.append(e.getLocalizedMessage());
                U3.mo12307a(N3, sb7.toString());
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "Failed to push profile", th);
            }
        }
    }

    /* renamed from: b */
    private int m15206b(String str, int i) {
        if (!this.f11265Q.mo12112p()) {
            return C3217s1.m15522a(this.f11261O, m15089D(str), i);
        }
        int a = C3217s1.m15522a(this.f11261O, m15089D(str), (int) C0798u.f3805q);
        if (a == -1000) {
            a = C3217s1.m15522a(this.f11261O, str, i);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15239b(String str, boolean z, boolean z2) {
        synchronized (this.f11246A0) {
            if (!this.f11248C0 || z2) {
                if (str == null) {
                    try {
                        str = m15113Q();
                    } catch (Throwable th) {
                        m15117U().mo12316c(m15110N(), "GcmManager: pushing device token failed", th);
                    }
                }
                if (str != null) {
                    m15164a(this.f11261O, str, z, C3145n1.GCM);
                    this.f11248C0 = true;
                }
            } else {
                m15117U().mo12307a(m15110N(), "GcmManager: skipping device token push - already sent.");
            }
        }
    }

    /* renamed from: a */
    private void m15144a(Activity activity) {
        m15117U().mo12315c(m15110N(), "App in foreground");
        m15090D();
        if (!m15353r0()) {
            m15093E0();
            m15085B0();
        }
        if (!m15341o0()) {
            m15095F0();
        }
        m15213b(activity);
        m15251c(activity);
    }

    /* renamed from: b */
    public static void m15212b(int i) {
        f11232T0 = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15236b(com.clevertap.android.sdk.C3244x1 r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = f11233U0
            monitor-enter(r0)
            java.util.ArrayList<com.clevertap.android.sdk.x1> r1 = r5.f11299v0     // Catch:{ Exception -> 0x0030 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0030 }
            r2 = 50
            if (r1 <= r2) goto L_0x0028
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0030 }
            r2.<init>()     // Catch:{ Exception -> 0x0030 }
            r3 = 10
        L_0x0014:
            if (r3 >= r1) goto L_0x0022
            java.util.ArrayList<com.clevertap.android.sdk.x1> r4 = r5.f11299v0     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x0030 }
            r2.add(r4)     // Catch:{ Exception -> 0x0030 }
            int r3 = r3 + 1
            goto L_0x0014
        L_0x0022:
            r2.add(r6)     // Catch:{ Exception -> 0x0030 }
            r5.f11299v0 = r2     // Catch:{ Exception -> 0x0030 }
            goto L_0x0030
        L_0x0028:
            java.util.ArrayList<com.clevertap.android.sdk.x1> r1 = r5.f11299v0     // Catch:{ Exception -> 0x0030 }
            r1.add(r6)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0030
        L_0x002e:
            r6 = move-exception
            goto L_0x0032
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x0035
        L_0x0034:
            throw r6
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15236b(com.clevertap.android.sdk.x1):void");
    }

    /* renamed from: a */
    private long m15125a(String str, int i, String str2) {
        if (!this.f11265Q.mo12112p()) {
            return C3217s1.m15524a(this.f11261O, str2, m15089D(str), (long) i);
        }
        long a = C3217s1.m15524a(this.f11261O, str2, m15089D(str), -1000);
        if (a == -1000) {
            a = C3217s1.m15524a(this.f11261O, str2, str, (long) i);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15190a(String str, boolean z, boolean z2) {
        synchronized (this.f11246A0) {
            if (!this.f11248C0 || z2) {
                if (str == null) {
                    try {
                        str = m15112P();
                    } catch (Throwable th) {
                        m15117U().mo12316c(m15110N(), "FcmManager: pushing device token failed", th);
                    }
                }
                if (str != null) {
                    m15164a(this.f11261O, str, z, C3145n1.FCM);
                    this.f11248C0 = true;
                }
            } else {
                m15117U().mo12315c(m15110N(), "FcmManager: skipping device token push - already sent.");
            }
        }
    }

    /* renamed from: b */
    public void mo12466b(boolean z) {
        this.f11254I0 = z;
        if (this.f11254I0) {
            m15117U().mo12307a(m15110N(), "CleverTap Instance has been set to offline, won't send events queue");
            return;
        }
        m15117U().mo12307a(m15110N(), "CleverTap Instance has been set to online, sending events queue");
        mo12468c();
    }

    /* renamed from: b */
    private void m15226b(Context context, JSONObject jSONObject, int i) {
        String str;
        synchronized (this.f11253H0) {
            try {
                f11237Y0 = f11237Y0 == 0 ? 1 : f11237Y0;
                if (i == 1) {
                    str = "page";
                } else if (i == 2) {
                    str = Ping.ELEMENT;
                    m15195a(jSONObject, context);
                    if (jSONObject.has("bk")) {
                        this.f11258M0 = true;
                        jSONObject.remove("bk");
                    }
                } else {
                    str = i == 3 ? C4420j.f13552a : i == 5 ? "data" : C0770p.f3524g0;
                }
                String l0 = m15329l0();
                if (l0 != null) {
                    jSONObject.put("n", l0);
                }
                jSONObject.put("s", m15120X());
                jSONObject.put("pg", f11237Y0);
                jSONObject.put("type", str);
                jSONObject.put("ep", System.currentTimeMillis() / 1000);
                jSONObject.put("f", m15369v0());
                jSONObject.put("lsl", m15290e0());
                m15165a(context, jSONObject);
                C3244x1 D0 = m15091D0();
                if (D0 != null) {
                    jSONObject.put("wzrk_error", m15143a(D0));
                }
                m15300f0().mo12283a(jSONObject);
                m15272d(context, jSONObject, i);
                m15285e(context, jSONObject, i);
                m15372w(context);
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to queue event: ");
                sb.append(jSONObject.toString());
                U.mo12316c(N, sb.toString(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = r7.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        m15117U().mo12315c(m15110N(), "FATAL: Creating basic profile update event failed!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008a */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15288e(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.mo12479g()     // Catch:{ all -> 0x0098 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0098 }
            r1.<init>()     // Catch:{ all -> 0x0098 }
            if (r7 == 0) goto L_0x0044
            int r2 = r7.length()     // Catch:{ all -> 0x0098 }
            if (r2 <= 0) goto L_0x0044
            java.util.Iterator r2 = r7.keys()     // Catch:{ all -> 0x0098 }
        L_0x0015:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0098 }
            r4 = 0
            org.json.JSONObject r4 = r7.getJSONObject(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            java.lang.Object r4 = r7.get(r3)     // Catch:{ JSONException -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            if (r4 == 0) goto L_0x0015
            r1.put(r3, r4)     // Catch:{ all -> 0x0098 }
            java.util.Set<java.lang.String> r5 = com.clevertap.android.sdk.C3208q0.f11600s2     // Catch:{ all -> 0x0098 }
            boolean r5 = r5.contains(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0015 }
            r6.m15238b(r0, r3, r4)     // Catch:{ all -> 0x0015 }
            goto L_0x0015
        L_0x0044:
            com.clevertap.android.sdk.t0 r7 = r6.f11285h0     // Catch:{ JSONException -> 0x008a }
            java.lang.String r7 = r7.mo12593e()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x0059
            boolean r2 = r7.equals(r0)     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "Carrier"
            r1.put(r2, r7)     // Catch:{ JSONException -> 0x008a }
        L_0x0059:
            com.clevertap.android.sdk.t0 r7 = r6.f11285h0     // Catch:{ JSONException -> 0x008a }
            java.lang.String r7 = r7.mo12594f()     // Catch:{ JSONException -> 0x008a }
            if (r7 == 0) goto L_0x006c
            boolean r0 = r7.equals(r0)     // Catch:{ JSONException -> 0x008a }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "cc"
            r1.put(r0, r7)     // Catch:{ JSONException -> 0x008a }
        L_0x006c:
            java.lang.String r7 = "tz"
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = r0.getID()     // Catch:{ JSONException -> 0x008a }
            r1.put(r7, r0)     // Catch:{ JSONException -> 0x008a }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008a }
            r7.<init>()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = "profile"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x008a }
            android.content.Context r0 = r6.f11261O     // Catch:{ JSONException -> 0x008a }
            r1 = 3
            r6.m15257c(r0, r7, r1)     // Catch:{ JSONException -> 0x008a }
            goto L_0x00a6
        L_0x008a:
            com.clevertap.android.sdk.h1 r7 = r6.m15117U()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r6.m15110N()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "FATAL: Creating basic profile update event failed!"
            r7.mo12315c(r0, r1)     // Catch:{ all -> 0x0098 }
            goto L_0x00a6
        L_0x0098:
            r7 = move-exception
            com.clevertap.android.sdk.h1 r0 = r6.m15117U()
            java.lang.String r1 = r6.m15110N()
            java.lang.String r2 = "Basic profile sync"
            r0.mo12316c(r1, r2, r7)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15288e(org.json.JSONObject):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15187a(String str, C3145n1 n1Var) {
        if (this.f11286i0 != null) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Notifying devicePushTokenDidRefresh: ");
            sb.append(str);
            U.mo12307a(N, sb.toString());
            this.f11286i0.mo12547a(str, n1Var);
        }
    }

    /* renamed from: a */
    public static void m15170a(C3205z0 z0Var) {
        f11232T0 = z0Var.mo12550d();
    }

    /* renamed from: a */
    public void mo12454a(boolean z) {
        this.f11298u0 = z;
        C3217s1.m15535b(this.f11261O, m15089D("NetworkInfo"), this.f11298u0);
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("Device Network Information reporting set to ");
        sb.append(this.f11298u0);
        U.mo12315c(N, sb.toString());
    }

    /* renamed from: a */
    public String mo12430a(C3145n1 n1Var) {
        int i = C3187q0.f11415a[n1Var.ordinal()];
        if (i == 1) {
            return m15113Q();
        }
        if (i != 2) {
            return null;
        }
        return m15112P();
    }

    /* renamed from: a */
    public void mo12434a(Uri uri) {
        m15169a(uri, false);
    }

    /* renamed from: a */
    private synchronized void m15169a(Uri uri, boolean z) {
        if (uri != null) {
            try {
                JSONObject a = C3232v1.m15648a(uri);
                if (a.has("us")) {
                    m15086C(a.get("us").toString());
                }
                if (a.has("um")) {
                    m15083B(a.get("um").toString());
                }
                if (a.has("uc")) {
                    m15081A(a.get("uc").toString());
                }
                a.put("referrer", uri.toString());
                if (z) {
                    a.put("install", true);
                }
                m15298f(a);
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "Failed to push deep link", th);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: c */
    public void mo12470c(String str, ArrayList<String> arrayList) {
        m15188a("setMultiValuesForKey", (Runnable) new C3184p(arrayList, str));
    }

    /* renamed from: c */
    private JSONArray m15248c(String str, String str2) {
        boolean equals = str2.equals("$remove");
        boolean equals2 = str2.equals(C2876e.f10094C);
        if (!equals && !equals2) {
            return new JSONArray();
        }
        Object o = m15339o(str);
        JSONArray jSONArray = null;
        if (o == null) {
            if (equals) {
                return null;
            }
            return new JSONArray();
        } else if (o instanceof JSONArray) {
            return (JSONArray) o;
        } else {
            if (equals2) {
                jSONArray = new JSONArray();
            }
            String a = m15138a(o);
            if (a != null) {
                jSONArray = new JSONArray().put(a);
            }
            return jSONArray;
        }
    }

    /* renamed from: e */
    private JSONObject m15281e(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                JSONObject e = m15281e((Bundle) obj);
                Iterator keys = e.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    jSONObject.put(str2, e.get(str2));
                }
            } else if (str.startsWith("wzrk_")) {
                jSONObject.put(str, bundle.get(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo12458b() {
        this.f11265Q.mo12096a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15223b(Context context, C3203y0 y0Var) {
        m15188a("CommsManager#flushQueueAsync", (Runnable) new C3160d(context, y0Var));
    }

    /* renamed from: b */
    private boolean m15244b(C3203y0 y0Var) {
        return m15136a(y0Var) == null || this.f11267R > 5;
    }

    /* renamed from: c */
    private JSONObject m15249c(CTInAppNotification cTInAppNotification) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject t = cTInAppNotification.mo11948t();
        Iterator keys = t.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (str.startsWith("wzrk_")) {
                jSONObject.put(str, t.get(str));
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15204a(JSONObject jSONObject, int i) {
        boolean z = false;
        if (m15116T().mo12111o()) {
            return false;
        }
        String str = "evtName";
        if (jSONObject.has(str)) {
            try {
                if (Arrays.asList(C3208q0.f11505T0).contains(jSONObject.getString(str))) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        if (i == 4 && !m15353r0()) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private String m15211b(boolean z, C3203y0 y0Var) {
        String a = m15140a(z, y0Var);
        if (a == null) {
            m15117U().mo12315c(m15110N(), "Unable to configure endpoint, domain is null");
            return null;
        }
        String N = m15110N();
        if (N == null) {
            m15117U().mo12315c(m15110N(), "Unable to configure endpoint, accountID is null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(a);
        sb.append("?os=Android&t=");
        sb.append(this.f11285h0.mo12608t());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("&z=");
        sb3.append(N);
        String sb4 = sb3.toString();
        if (m15244b(y0Var)) {
            return sb4;
        }
        this.f11268S = (int) (System.currentTimeMillis() / 1000);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("&ts=");
        sb5.append(this.f11268S);
        return sb5.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15166a(Context context, JSONObject jSONObject, int i) {
        if (!m15374w0()) {
            if (i == 6) {
                m15117U().mo12315c(m15110N(), "Pushing Notification Viewed event onto separate queue");
                m15256c(context, jSONObject);
            } else {
                m15226b(context, jSONObject, i);
            }
        }
    }

    /* renamed from: c */
    private JSONObject m15250c(CTInboxMessage cTInboxMessage) {
        return cTInboxMessage.mo12028v();
    }

    /* renamed from: e */
    private String m15280e(String str, String str2) {
        if (!(str == null || str2 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str2);
            try {
                return m15114R().getString(sb.toString());
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error reading guid cache: ");
                sb2.append(th.toString());
                U.mo12315c(N, sb2.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo12469c(Bundle bundle) {
        if (bundle == null || bundle.isEmpty() || bundle.get(f11231S0) == null) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Push notification: ");
            sb.append(bundle == null ? "NULL" : bundle.toString());
            sb.append(" not from CleverTap - will not process Notification Viewed event.");
            U.mo12307a(N, sb.toString());
            return;
        }
        String str = "wzrk_id";
        if (!bundle.containsKey(str) || bundle.getString(str) == null) {
            C3111h1 U2 = m15117U();
            String N2 = m15110N();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Push notification ID Tag is null, not processing Notification Viewed event for:  ");
            sb2.append(bundle.toString());
            U2.mo12307a(N2, sb2.toString());
        } else if (m15200a(bundle, this.f11284g0, 2000)) {
            C3111h1 U3 = m15117U();
            String N3 = m15110N();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Already processed Notification Viewed event for ");
            sb3.append(bundle.toString());
            sb3.append(", dropping duplicate.");
            U3.mo12307a(N3, sb3.toString());
        } else {
            C3111h1 U4 = m15117U();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Recording Notification Viewed event for notification:  ");
            sb4.append(bundle.toString());
            U4.mo12306a(sb4.toString());
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject e = m15281e(bundle);
                jSONObject.put("evtName", "Notification Viewed");
                jSONObject.put("evtData", e);
            } catch (Throwable unused) {
            }
            m15257c(this.f11261O, jSONObject, 6);
        }
    }

    /* renamed from: a */
    private void m15165a(Context context, JSONObject jSONObject) {
        try {
            if (C0770p.f3524g0.equals(jSONObject.getString("type")) && "App Launched".equals(jSONObject.getString("evtName"))) {
                jSONObject.put("pai", context.getPackageName());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private C3148o1 m15208b(Context context, int i, C3148o1 o1Var) {
        C3148o1 a;
        synchronized (this.f11253H0) {
            a = m15129a(context, C3213b.EVENTS, i, o1Var);
            if (a.mo12428d().booleanValue() && a.mo12427c().equals(C3213b.EVENTS)) {
                a = m15129a(context, C3213b.PROFILE_EVENTS, i, (C3148o1) null);
            }
            if (a.mo12428d().booleanValue()) {
                a = null;
            }
        }
        return a;
    }

    /* renamed from: e */
    public C3110h0 mo12475e() {
        return this.f11257L0;
    }

    /* renamed from: a */
    private void m15195a(JSONObject jSONObject, Context context) {
        try {
            jSONObject.put("mc", C3238w1.m15656a());
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("nt", C3238w1.m15664b(context));
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.clevertap.android.sdk.CTInboxMessage mo12474e(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f11256K0
            monitor-enter(r0)
            com.clevertap.android.sdk.f0 r1 = r4.f11255J0     // Catch:{ all -> 0x002a }
            r2 = 0
            if (r1 == 0) goto L_0x001b
            com.clevertap.android.sdk.f0 r1 = r4.f11255J0     // Catch:{ all -> 0x002a }
            com.clevertap.android.sdk.l0 r5 = r1.mo12254b(r5)     // Catch:{ all -> 0x002a }
            if (r5 == 0) goto L_0x0019
            com.clevertap.android.sdk.CTInboxMessage r2 = new com.clevertap.android.sdk.CTInboxMessage     // Catch:{ all -> 0x002a }
            org.json.JSONObject r5 = r5.mo12377k()     // Catch:{ all -> 0x002a }
            r2.<init>(r5)     // Catch:{ all -> 0x002a }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r2
        L_0x001b:
            com.clevertap.android.sdk.h1 r5 = r4.m15117U()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = r4.m15110N()     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Notification Inbox not initialized"
            r5.mo12307a(r1, r3)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r2
        L_0x002a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.mo12474e(java.lang.String):com.clevertap.android.sdk.CTInboxMessage");
    }

    /* renamed from: a */
    private JSONObject m15143a(C3244x1 x1Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", x1Var.mo12655a());
            jSONObject.put(C2945d.f10439h, x1Var.mo12659b());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15243b(JSONObject jSONObject, Context context) {
        String str = "inApp";
        String str2 = "inapp_notifs";
        String str3 = "imp";
        String str4 = "imc";
        try {
            m15117U().mo12315c(m15110N(), "InApp: Processing response");
            if (!jSONObject.has(str2)) {
                m15117U().mo12315c(m15110N(), "InApp: Response JSON object doesn't contain the inapp key, bailing");
                return;
            }
            int i = 10;
            int i2 = (!jSONObject.has(str4) || !(jSONObject.get(str4) instanceof Integer)) ? 10 : jSONObject.getInt(str4);
            if (jSONObject.has(str3) && (jSONObject.get(str3) instanceof Integer)) {
                i = jSONObject.getInt(str3);
            }
            this.f11302y0.mo12242a(context, i, i2);
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            Editor edit = C3217s1.m15525a(context).edit();
            try {
                JSONArray jSONArray2 = new JSONArray(m15292f(str, "[]"));
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        jSONArray2.put(jSONArray.getJSONObject(i3));
                    }
                }
                edit.putString(m15089D(str), jSONArray2.toString());
                C3217s1.m15529a(edit);
            } catch (JSONException unused) {
                C3111h1.m14938f("InAppManager: Malformed inapp notification");
            } catch (Throwable th) {
                m15117U().mo12315c(m15110N(), "InApp: Failed to parse the in-app notifications properly");
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("InAppManager: Reason: ");
                sb.append(th.getMessage());
                U.mo12316c(N, sb.toString(), th);
            }
            m15186a((Runnable) new C3168h(context));
        } catch (JSONException unused2) {
            m15117U().mo12307a(m15110N(), "InApp: In-app key didn't contain a valid JSON array");
        } catch (Throwable th2) {
            C3111h1.m14941f("InAppManager: Failed to parse response", th2);
        }
    }

    /* renamed from: a */
    public void mo12431a() {
        this.f11265Q.mo12096a(false);
    }

    /* renamed from: a */
    private void m15167a(Context context, JSONObject jSONObject, C3213b bVar) {
        synchronized (this.f11253H0) {
            if (m15354s(context).mo12557a(jSONObject, bVar) > 0) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Queued event: ");
                sb.append(jSONObject.toString());
                U.mo12307a(N, sb.toString());
                C3111h1 U2 = m15117U();
                String N2 = m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Queued event to DB table ");
                sb2.append(bVar);
                sb2.append(": ");
                sb2.append(jSONObject.toString());
                U2.mo12315c(N2, sb2.toString());
            }
        }
    }

    /* renamed from: c */
    public C3227u0 mo12467c(String str) {
        return m15300f0().mo12276a(str);
    }

    /* renamed from: c */
    public void mo12468c() {
        m15223b(this.f11261O, C3203y0.REGULAR);
    }

    /* renamed from: c */
    public void mo12167c(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        mo12455a(true, cTInAppNotification, bundle);
    }

    /* renamed from: c */
    public static void m15255c(Context context, String str) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#deleteNotificationChannelGroup");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                n.m15188a("deletingNotificationChannelGroup", (Runnable) new C3175k0(context, str, n));
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure deleting Notification Channel Group", th);
        }
    }

    /* renamed from: a */
    private String m15136a(C3203y0 y0Var) {
        try {
            String b = this.f11265Q.mo12097b();
            if (b != null && b.trim().length() > 0) {
                this.f11267R = 0;
                String str = "wzrkt.com";
                String str2 = ".";
                if (y0Var.equals(C3203y0.PUSH_NOTIFICATION_VIEWED)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.trim().toLowerCase());
                    sb.append(y0Var.httpResource);
                    sb.append(str2);
                    sb.append(str);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b.trim().toLowerCase());
                sb2.append(str2);
                sb2.append(str);
                return sb2.toString();
            }
        } catch (Throwable unused) {
        }
        if (y0Var.equals(C3203y0.PUSH_NOTIFICATION_VIEWED)) {
            return m15292f("comms_dmn_spiky", (String) null);
        }
        return m15292f("comms_dmn", (String) null);
    }

    /* renamed from: c */
    public static void m15262c(String str, String str2, String str3) {
        if (f11234V0 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("CleverTap SDK already initialized with accountID:");
            sb.append(f11234V0.mo12093a());
            sb.append(" and token:");
            sb.append(f11234V0.mo12099c());
            sb.append(". Cannot change credentials to ");
            sb.append(str);
            sb.append(" and ");
            sb.append(str2);
            C3111h1.m14934e(sb.toString());
            return;
        }
        C3115i1.m14964a(str, str2, str3);
    }

    /* renamed from: c */
    private void m15258c(Location location) {
        if (location != null) {
            this.f11269T = location;
            StringBuilder sb = new StringBuilder();
            sb.append("Location updated (");
            sb.append(location.getLatitude());
            String str = ", ";
            sb.append(str);
            sb.append(location.getLongitude());
            String str2 = ")";
            sb.append(str2);
            C3111h1.m14938f(sb.toString());
            if (m15349q0()) {
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (currentTimeMillis > this.f11303z0 + 10) {
                    m15257c(this.f11261O, new JSONObject(), 2);
                    this.f11303z0 = currentTimeMillis;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Queuing location ping event for location (");
                    sb2.append(location.getLatitude());
                    sb2.append(str);
                    sb2.append(location.getLongitude());
                    sb2.append(str2);
                    C3111h1.m14938f(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m15158a(Context context, C3203y0 y0Var, Runnable runnable) {
        InputStream inputStream;
        if (!m15374w0()) {
            String b = m15211b(true, y0Var);
            if (b == null) {
                m15117U().mo12315c(m15110N(), "Unable to perform handshake, endpoint is null");
            }
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Performing handshake with ");
            sb.append(b);
            U.mo12315c(N, sb.toString());
            HttpsURLConnection httpsURLConnection = null;
            try {
                httpsURLConnection = m15356s(b);
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode != 200) {
                    C3111h1 U2 = m15117U();
                    String N2 = m15110N();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid HTTP status code received for handshake - ");
                    sb2.append(responseCode);
                    U2.mo12315c(N2, sb2.toString());
                    if (httpsURLConnection != null) {
                        try {
                            httpsURLConnection.getInputStream().close();
                            httpsURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                }
                m15117U().mo12315c(m15110N(), "Received success from handshake :)");
                if (m15199a(context, httpsURLConnection)) {
                    m15117U().mo12315c(m15110N(), "We are not muted");
                    runnable.run();
                }
                if (httpsURLConnection != null) {
                    inputStream = httpsURLConnection.getInputStream();
                    inputStream.close();
                    httpsURLConnection.disconnect();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15215b(Context context) {
        String str = "inApp";
        SharedPreferences a = C3217s1.m15525a(context);
        try {
            if (!m15084B()) {
                C3111h1.m14938f("Not showing notification on blacklisted activity");
                return;
            }
            m15155a(context, this.f11265Q);
            JSONArray jSONArray = new JSONArray(m15292f(str, "[]"));
            if (jSONArray.length() >= 1) {
                m15264c(jSONArray.getJSONObject(0));
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                }
                C3217s1.m15529a(a.edit().putString(m15089D(str), jSONArray2.toString()));
            }
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "InApp: Couldn't parse JSON array string from prefs", th);
        }
    }

    /* renamed from: a */
    private static SSLSocketFactory m15141a(SSLContext sSLContext) {
        if (sSLContext == null) {
            return null;
        }
        if (f11243e1 == null) {
            try {
                f11243e1 = sSLContext.getSocketFactory();
                C3111h1.m14930d("Pinning SSL session to DigiCertGlobalRoot CA certificate");
            } catch (Throwable th) {
                C3111h1.m14933d("Issue in pinning SSL,", th);
            }
        }
        return f11243e1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15227b(CTInAppNotification cTInAppNotification) {
        boolean z;
        HashMap hashMap;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m15205a0().post(new C3176l(cTInAppNotification));
        } else if (!this.f11302y0.mo12245a(cTInAppNotification)) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("InApp has been rejected by FC, not showing ");
            sb.append(cTInAppNotification.mo11939k());
            U.mo12315c(N, sb.toString());
            m15107L0();
        } else {
            this.f11302y0.mo12243a(this.f11261O, cTInAppNotification);
            C3096f1 j = mo12484j();
            if (j != null) {
                if (cTInAppNotification.mo11940l() != null) {
                    hashMap = C3238w1.m15663a(cTInAppNotification.mo11940l());
                } else {
                    hashMap = new HashMap();
                }
                z = j.mo12263a(hashMap);
            } else {
                z = true;
            }
            if (!z) {
                C3111h1 U2 = m15117U();
                String N2 = m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Application has decided to not show this in-app notification: ");
                sb2.append(cTInAppNotification.mo11939k());
                U2.mo12315c(N2, sb2.toString());
                m15107L0();
                return;
            }
            m15221b(this.f11261O, cTInAppNotification, this.f11265Q);
        }
    }

    /* renamed from: a */
    private String m15140a(boolean z, C3203y0 y0Var) {
        String str;
        String a = m15136a(y0Var);
        boolean z2 = a == null || a.trim().length() == 0;
        if (z2 && !z) {
            return null;
        }
        if (z2) {
            str = "wzrkt.com/hello";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("/a1");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    private boolean m15199a(Context context, HttpsURLConnection httpsURLConnection) {
        String headerField = httpsURLConnection.getHeaderField("X-WZRK-MUTE");
        if (headerField != null && headerField.trim().length() > 0) {
            if (headerField.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                m15168a(context, true);
                return false;
            }
            m15168a(context, false);
        }
        String headerField2 = httpsURLConnection.getHeaderField("X-WZRK-RD");
        StringBuilder sb = new StringBuilder();
        sb.append("Getting domain from header - ");
        sb.append(headerField2);
        C3111h1.m14938f(sb.toString());
        if (!(headerField2 == null || headerField2.trim().length() == 0)) {
            String headerField3 = httpsURLConnection.getHeaderField("X-WZRK-SPIKY-RD");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Getting spiky domain from header - ");
            sb2.append(headerField3);
            C3111h1.m14938f(sb2.toString());
            m15168a(context, false);
            m15295f(context, headerField2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting spiky domain from header as -");
            sb3.append(headerField3);
            C3111h1.m14938f(sb3.toString());
            if (headerField3 == null) {
                m15303g(context, headerField2);
            } else {
                m15303g(context, headerField3);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m15222b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CTInAppNotification cTInAppNotification) {
        C3111h1.m14939f(cleverTapInstanceConfig.mo12093a(), "Running inAppDidDismiss");
        CTInAppNotification cTInAppNotification2 = f11239a1;
        if (cTInAppNotification2 != null && cTInAppNotification2.mo11939k().equals(cTInAppNotification.mo11939k())) {
            f11239a1 = null;
            m15155a(context, cleverTapInstanceConfig);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m15221b(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
        C3111h1.m14939f(cleverTapInstanceConfig.mo12093a(), "Attempting to show next In-App");
        if (!f11236X0) {
            f11238Z0.add(cTInAppNotification);
            C3111h1.m14939f(cleverTapInstanceConfig.mo12093a(), "Not in foreground, queueing this In App");
        } else if (f11239a1 != null) {
            f11238Z0.add(cTInAppNotification);
            C3111h1.m14939f(cleverTapInstanceConfig.mo12093a(), "In App already displaying, queueing this In App");
        } else {
            f11239a1 = cTInAppNotification;
            C3071b0 s = cTInAppNotification.mo11947s();
            String str = "Displaying In-App: ";
            String str2 = "config";
            String str3 = "inApp";
            Fragment fragment = null;
            switch (C3187q0.f11416b[s.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    Intent intent = new Intent(context, InAppNotificationActivity.class);
                    intent.putExtra(str3, cTInAppNotification);
                    intent.putExtra(str2, cleverTapInstanceConfig);
                    try {
                        Activity V = m15118V();
                        if (V != null) {
                            C3111h1 l = cleverTapInstanceConfig.mo12108l();
                            String a = cleverTapInstanceConfig.mo12093a();
                            StringBuilder sb = new StringBuilder();
                            sb.append("calling InAppActivity for notification: ");
                            sb.append(cTInAppNotification.mo11948t());
                            l.mo12315c(a, sb.toString());
                            V.startActivity(intent);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(cTInAppNotification.mo11948t());
                            C3111h1.m14930d(sb2.toString());
                            break;
                        } else {
                            throw new IllegalStateException("Current activity reference not found");
                        }
                    } catch (Throwable th) {
                        C3111h1.m14941f("Please verify the integration of your app. It is not setup to support in-app notifications yet.", th);
                        break;
                    }
                case 11:
                    fragment = new C3149p();
                    break;
                case 12:
                    fragment = new C3210r();
                    break;
                case 13:
                    fragment = new C3229v();
                    break;
                case 14:
                    fragment = new C3245y();
                    break;
                default:
                    String a2 = cleverTapInstanceConfig.mo12093a();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown InApp Type found: ");
                    sb3.append(s);
                    C3111h1.m14931d(a2, sb3.toString());
                    f11239a1 = null;
                    return;
            }
            if (fragment != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(cTInAppNotification.mo11948t());
                C3111h1.m14930d(sb4.toString());
                try {
                    FragmentTransaction beginTransaction = m15118V().getFragmentManager().beginTransaction();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(str3, cTInAppNotification);
                    bundle.putParcelable(str2, cleverTapInstanceConfig);
                    fragment.setArguments(bundle);
                    beginTransaction.setCustomAnimations(17498112, 17498113);
                    beginTransaction.add(16908290, fragment, cTInAppNotification.mo11917D());
                    String a3 = cleverTapInstanceConfig.mo12093a();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("calling InAppFragment ");
                    sb5.append(cTInAppNotification.mo11939k());
                    C3111h1.m14939f(a3, sb5.toString());
                    beginTransaction.commit();
                } catch (Throwable th2) {
                    C3111h1.m14940f(cleverTapInstanceConfig.mo12093a(), "Fragment not able to render", th2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m15168a(Context context, boolean z) {
        String str = "comms_mtd";
        if (z) {
            C3217s1.m15532b(context, m15089D(str), (int) (System.currentTimeMillis() / 1000));
            m15295f(context, (String) null);
            m15188a("CommsManager#setMuted", (Runnable) new C3164f(context));
            return;
        }
        C3217s1.m15532b(context, m15089D(str), 0);
    }

    /* renamed from: a */
    private void m15146a(Context context) {
        String h0 = m15314h0();
        if (h0 != null) {
            Editor edit = C3217s1.m15526a(context, h0).edit();
            edit.clear();
            C3217s1.m15529a(edit);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15157a(Context context, C3203y0 y0Var) {
        m15117U().mo12315c(m15110N(), "Somebody has invoked me to send the queue to CleverTap servers");
        C3148o1 o1Var = null;
        boolean z = true;
        while (z) {
            o1Var = m15128a(context, 50, o1Var, y0Var);
            String str = "No events in the queue, bailing";
            if (o1Var == null || o1Var.mo12428d().booleanValue()) {
                m15117U().mo12315c(m15110N(), str);
                return;
            }
            JSONArray a = o1Var.mo12422a();
            if (a == null || a.length() <= 0) {
                m15117U().mo12315c(m15110N(), str);
                return;
            }
            z = m15197a(context, y0Var, a);
        }
    }

    /* renamed from: a */
    private C3148o1 m15128a(Context context, int i, C3148o1 o1Var, C3203y0 y0Var) {
        if (y0Var == C3203y0.PUSH_NOTIFICATION_VIEWED) {
            m15117U().mo12315c(m15110N(), "Returning Queued Notification Viewed events");
            return m15127a(context, i, o1Var);
        }
        m15117U().mo12315c(m15110N(), "Returning Queued events");
        return m15208b(context, i, o1Var);
    }

    /* renamed from: a */
    private C3148o1 m15130a(JSONObject jSONObject, C3148o1 o1Var) {
        if (jSONObject == null) {
            return o1Var;
        }
        Iterator keys = jSONObject.keys();
        if (keys.hasNext()) {
            String str = (String) keys.next();
            o1Var.mo12424a(str);
            try {
                o1Var.mo12425a(jSONObject.getJSONArray(str));
            } catch (JSONException unused) {
                o1Var.mo12424a((String) null);
                o1Var.mo12425a((JSONArray) null);
            }
        }
        return o1Var;
    }

    /* renamed from: a */
    private C3148o1 m15129a(Context context, C3213b bVar, int i, C3148o1 o1Var) {
        C3148o1 a;
        synchronized (this.f11253H0) {
            C3211r0 s = m15354s(context);
            if (o1Var != null) {
                bVar = o1Var.mo12427c();
            }
            if (o1Var != null) {
                s.mo12563a(o1Var.mo12426b(), o1Var.mo12427c());
            }
            C3148o1 o1Var2 = new C3148o1();
            o1Var2.mo12423a(bVar);
            a = m15130a(s.mo12559a(bVar, i), o1Var2);
        }
        return a;
    }

    /* renamed from: b */
    private void m15216b(Context context, int i) {
        C3217s1.m15532b(context, m15089D("comms_last_ts"), i);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private void m15217b(Context context, long j) {
        Editor edit = C3217s1.m15526a(context, "IJ").edit();
        edit.putLong(m15089D("comms_j"), j);
        C3217s1.m15529a(edit);
    }

    /* renamed from: b */
    private void m15225b(Context context, JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            String h0 = m15314h0();
            if (h0 != null) {
                Editor edit = C3217s1.m15526a(context, h0).edit();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    try {
                        Object obj = jSONObject.get(str);
                        if (obj instanceof Number) {
                            edit.putInt(str, ((Number) obj).intValue());
                        } else {
                            String str2 = "ARP update for key ";
                            if (obj instanceof String) {
                                if (((String) obj).length() < 100) {
                                    edit.putString(str, (String) obj);
                                } else {
                                    C3111h1 U = m15117U();
                                    String N = m15110N();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append(str);
                                    sb.append(" rejected (string value too long)");
                                    U.mo12315c(N, sb.toString());
                                }
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(str, ((Boolean) obj).booleanValue());
                            } else {
                                C3111h1 U2 = m15117U();
                                String N2 = m15110N();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str2);
                                sb2.append(str);
                                sb2.append(" rejected (invalid data type)");
                                U2.mo12315c(N2, sb2.toString());
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                C3111h1 U3 = m15117U();
                String N3 = m15110N();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Completed ARP update for namespace key: ");
                sb3.append(h0);
                sb3.append("");
                U3.mo12315c(N3, sb3.toString());
                C3217s1.m15529a(edit);
            }
        }
    }

    /* renamed from: a */
    private C3148o1 m15127a(Context context, int i, C3148o1 o1Var) {
        return m15129a(context, C3213b.PUSH_NOTIFICATION_VIEWED, i, o1Var);
    }

    /* renamed from: a */
    private boolean m15197a(Context context, C3203y0 y0Var, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return false;
        }
        if (mo12479g() == null) {
            m15117U().mo12307a(m15110N(), "CleverTap Id not finalized, unable to send queue");
            return false;
        }
        HttpsURLConnection httpsURLConnection = null;
        try {
            String b = m15211b(false, y0Var);
            if (b == null) {
                m15117U().mo12307a(m15110N(), "Problem configuring queue endpoint, unable to send queue");
                return false;
            }
            httpsURLConnection = m15356s(b);
            String a = m15135a(context, jSONArray);
            if (a == null) {
                m15117U().mo12307a(m15110N(), "Problem configuring queue request, unable to send queue");
                if (httpsURLConnection != null) {
                    try {
                        httpsURLConnection.getInputStream().close();
                        httpsURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                }
                return false;
            }
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Send queue contains ");
            sb.append(jSONArray.length());
            sb.append(" items: ");
            sb.append(a);
            U.mo12307a(N, sb.toString());
            C3111h1 U2 = m15117U();
            String N2 = m15110N();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Sending queue to: ");
            sb2.append(b);
            U2.mo12307a(N2, sb2.toString());
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.getOutputStream().write(a.getBytes("UTF-8"));
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpsURLConnection.getHeaderField("X-WZRK-RD");
                if (headerField == null || headerField.trim().length() <= 0 || !m15373w(headerField)) {
                    if (m15199a(context, httpsURLConnection)) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream(), "utf-8"));
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb3.append(readLine);
                        }
                        m15284e(context, sb3.toString());
                    }
                    m15216b(context, this.f11268S);
                    m15147a(context, this.f11268S);
                    m15117U().mo12307a(m15110N(), "Queue sent successfully");
                    this.f11267R = 0;
                    if (httpsURLConnection != null) {
                        try {
                            httpsURLConnection.getInputStream().close();
                            httpsURLConnection.disconnect();
                        } catch (Throwable unused2) {
                        }
                    }
                    return true;
                }
                m15295f(context, headerField);
                C3111h1 U3 = m15117U();
                String N3 = m15110N();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("The domain has changed to ");
                sb4.append(headerField);
                sb4.append(". The request will be retried shortly.");
                U3.mo12307a(N3, sb4.toString());
                if (httpsURLConnection != null) {
                    try {
                        httpsURLConnection.getInputStream().close();
                        httpsURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                }
                return false;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Response code is not 200. It is ");
            sb5.append(responseCode);
            throw new IOException(sb5.toString());
        } catch (Throwable unused4) {
        }
        return false;
    }

    /* renamed from: b */
    private void m15238b(String str, String str2, String str3) {
        if (!m15365u0() && str != null && str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str3);
            String sb2 = sb.toString();
            JSONObject R = m15114R();
            try {
                R.put(sb2, str);
                m15305g(R);
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error caching guid: ");
                sb3.append(th.toString());
                U.mo12315c(N, sb3.toString());
            }
        }
    }

    /* renamed from: b */
    public void mo12465b(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            m15188a("profilePush", (Runnable) new C3182o(map));
        }
    }

    /* renamed from: b */
    public void mo12462b(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            m15332m(str);
        } else {
            mo12463b(str, new ArrayList<>(Collections.singletonList(str2)));
        }
    }

    /* renamed from: b */
    public void mo12463b(String str, ArrayList<String> arrayList) {
        m15188a("removeMultiValuesForKey", (Runnable) new C3188r(arrayList, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15242b(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4 = "Y";
        String str5 = "N";
        String str6 = "";
        if (jSONObject != null) {
            try {
                try {
                    C3244x1 a = this.f11294q0.mo12664a(m15139a(jSONObject, "name", str6), C3250b.Profile);
                    str = a.mo12660c().toString();
                    if (a.mo12655a() != 0) {
                        m15236b(a);
                    }
                } catch (IllegalArgumentException unused) {
                    str = str6;
                }
                String a2 = m15139a(jSONObject, C11644i.f33451x5, (String) null);
                String str7 = a2 != null ? a2.toLowerCase().startsWith("m") ? "M" : a2.toLowerCase().startsWith("f") ? "F" : str6 : null;
                String a3 = m15139a(jSONObject, "email", str6);
                String a4 = m15139a(jSONObject, "birthday", (String) null);
                if (a4 != null) {
                    if (!a4.matches("^../..")) {
                        try {
                            Date parse = C3208q0.f11597s.parse(a4);
                            StringBuilder sb = new StringBuilder();
                            sb.append("$D_");
                            sb.append((int) (parse.getTime() / 1000));
                            a4 = sb.toString();
                        } catch (ParseException unused2) {
                        }
                    }
                    a4 = str6;
                }
                try {
                    str2 = jSONObject.getJSONArray("work").length() > 0 ? str4 : str5;
                } catch (Throwable unused3) {
                    str2 = null;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("education");
                    String string = jSONArray.getJSONObject(jSONArray.length() - 1).getString("type");
                    str3 = string.toLowerCase().contains("high school") ? "School" : string.toLowerCase().contains("college") ? "College" : string.toLowerCase().contains("graduate school") ? "Graduate" : str6;
                } catch (Throwable unused4) {
                    str3 = null;
                }
                String a5 = m15139a(jSONObject, "id", str6);
                String a6 = m15139a(jSONObject, "relationship_status", (String) null);
                if (a6 != null) {
                    a6 = a6.equalsIgnoreCase("married") ? str4 : str5;
                }
                JSONObject jSONObject2 = new JSONObject();
                if (a5 != null && a5.length() > 3) {
                    jSONObject2.put("FBID", a5);
                }
                if (str != null && str.length() > 3) {
                    jSONObject2.put("Name", str);
                }
                if (a3 != null && a3.length() > 3) {
                    jSONObject2.put("Email", a3);
                }
                if (str7 != null && !str7.trim().equals(str6)) {
                    jSONObject2.put("Gender", str7);
                }
                if (str3 != null && !str3.trim().equals(str6)) {
                    jSONObject2.put("Education", str3);
                }
                if (str2 != null && !str2.trim().equals(str6)) {
                    jSONObject2.put("Employed", str2);
                }
                if (a4 != null && a4.length() > 3) {
                    jSONObject2.put("DOB", a4);
                }
                if (a6 != null && !a6.trim().equals(str6)) {
                    jSONObject2.put("Married", a6);
                }
                m15288e(jSONObject2);
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "Failed to parse graph user object successfully", th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1 A[Catch:{ all -> 0x00c3, all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd A[Catch:{ all -> 0x0103 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m15135a(android.content.Context r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x015c }
            r0.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r6.mo12479g()     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = ""
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x015c }
            if (r2 != 0) goto L_0x0019
            java.lang.String r2 = "g"
            r0.put(r2, r1)     // Catch:{ all -> 0x015c }
            goto L_0x0026
        L_0x0019:
            com.clevertap.android.sdk.h1 r1 = r6.m15117U()     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r6.m15110N()     // Catch:{ all -> 0x015c }
            java.lang.String r3 = "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!"
            r1.mo12315c(r2, r3)     // Catch:{ all -> 0x015c }
        L_0x0026:
            java.lang.String r1 = "type"
            java.lang.String r2 = "meta"
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            org.json.JSONObject r1 = r6.m15111O()     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "af"
            r0.put(r2, r1)     // Catch:{ all -> 0x015c }
            long r1 = r6.m15245b0()     // Catch:{ all -> 0x015c }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0045
            java.lang.String r5 = "_i"
            r0.put(r5, r1)     // Catch:{ all -> 0x015c }
        L_0x0045:
            long r1 = r6.m15265c0()     // Catch:{ all -> 0x015c }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
            java.lang.String r3 = "_j"
            r0.put(r3, r1)     // Catch:{ all -> 0x015c }
        L_0x0052:
            java.lang.String r1 = r6.m15110N()     // Catch:{ all -> 0x015c }
            com.clevertap.android.sdk.CleverTapInstanceConfig r2 = r6.f11265Q     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.mo12099c()     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x014d
            if (r2 != 0) goto L_0x0062
            goto L_0x014d
        L_0x0062:
            java.lang.String r3 = "id"
            r0.put(r3, r1)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "tk"
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "l_ts"
            int r2 = r6.m15278d0()     // Catch:{ all -> 0x015c }
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "f_ts"
            int r2 = r6.m15122Z()     // Catch:{ all -> 0x015c }
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "ddnd"
            com.clevertap.android.sdk.t0 r2 = r6.f11285h0     // Catch:{ all -> 0x015c }
            boolean r2 = r2.mo12605q()     // Catch:{ all -> 0x015c }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r6.m15113Q()     // Catch:{ all -> 0x015c }
            if (r2 != 0) goto L_0x0097
            java.lang.String r2 = r6.m15112P()     // Catch:{ all -> 0x015c }
            if (r2 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r2 = 0
            goto L_0x009a
        L_0x0099:
            r2 = 1
        L_0x009a:
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            boolean r1 = r6.f11258M0     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = "bk"
            r0.put(r1, r4)     // Catch:{ all -> 0x015c }
            r6.f11258M0 = r3     // Catch:{ all -> 0x015c }
        L_0x00a8:
            java.lang.String r1 = "rtl"
            org.json.JSONArray r2 = r6.m15321j0()     // Catch:{ all -> 0x015c }
            r0.put(r1, r2)     // Catch:{ all -> 0x015c }
            org.json.JSONObject r1 = r6.m15323k(r7)     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x00d1
            int r2 = r1.length()     // Catch:{ all -> 0x00c3 }
            if (r2 <= 0) goto L_0x00d1
            java.lang.String r2 = "arp"
            r0.put(r2, r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x00d1
        L_0x00c3:
            r1 = move-exception
            com.clevertap.android.sdk.h1 r2 = r6.m15117U()     // Catch:{ all -> 0x015c }
            java.lang.String r3 = r6.m15110N()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "Failed to attach ARP"
            r2.mo12316c(r3, r5, r1)     // Catch:{ all -> 0x015c }
        L_0x00d1:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x015c }
            r1.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r6.m15333m0()     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00e1
            java.lang.String r3 = "us"
            r1.put(r3, r2)     // Catch:{ all -> 0x0103 }
        L_0x00e1:
            java.lang.String r2 = r6.m15308g0()     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00ec
            java.lang.String r3 = "um"
            r1.put(r3, r2)     // Catch:{ all -> 0x0103 }
        L_0x00ec:
            java.lang.String r2 = r6.m15115S()     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r3 = "uc"
            r1.put(r3, r2)     // Catch:{ all -> 0x0103 }
        L_0x00f7:
            int r2 = r1.length()     // Catch:{ all -> 0x0103 }
            if (r2 <= 0) goto L_0x0111
            java.lang.String r2 = "ref"
            r0.put(r2, r1)     // Catch:{ all -> 0x0103 }
            goto L_0x0111
        L_0x0103:
            r1 = move-exception
            com.clevertap.android.sdk.h1 r2 = r6.m15117U()     // Catch:{ all -> 0x015c }
            java.lang.String r3 = r6.m15110N()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "Failed to attach ref"
            r2.mo12316c(r3, r5, r1)     // Catch:{ all -> 0x015c }
        L_0x0111:
            org.json.JSONObject r1 = r6.m15337n0()     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x0122
            int r2 = r1.length()     // Catch:{ all -> 0x015c }
            if (r2 <= 0) goto L_0x0122
            java.lang.String r2 = "wzrk_ref"
            r0.put(r2, r1)     // Catch:{ all -> 0x015c }
        L_0x0122:
            com.clevertap.android.sdk.e1 r1 = r6.f11302y0     // Catch:{ all -> 0x015c }
            r1.mo12244a(r7, r0)     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            r7.<init>()     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "["
            r7.append(r1)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x015c }
            r7.append(r0)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = ", "
            r7.append(r0)     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r0.substring(r4)     // Catch:{ all -> 0x015c }
            r7.append(r0)     // Catch:{ all -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x015c }
            return r7
        L_0x014d:
            com.clevertap.android.sdk.h1 r7 = r6.m15117U()     // Catch:{ all -> 0x015c }
            java.lang.String r0 = r6.m15110N()     // Catch:{ all -> 0x015c }
            java.lang.String r1 = "Account ID/token not found, unable to configure queue request"
            r7.mo12307a(r0, r1)     // Catch:{ all -> 0x015c }
            r7 = 0
            return r7
        L_0x015c:
            r7 = move-exception
            com.clevertap.android.sdk.h1 r0 = r6.m15117U()
            java.lang.String r1 = r6.m15110N()
            java.lang.String r2 = "CommsManager: Failed to attach header"
            r0.mo12316c(r1, r2, r7)
            java.lang.String r7 = r8.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15135a(android.content.Context, org.json.JSONArray):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ all -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b A[SYNTHETIC, Splitter:B:24:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[SYNTHETIC, Splitter:B:32:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b A[Catch:{ all -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5 A[Catch:{ all -> 0x0120 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15237b(com.google.android.gms.plus.p177g.p178a.C5495a r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r11.mo19867x()     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r11.mo19862s()     // Catch:{ all -> 0x0029 }
            com.clevertap.android.sdk.y1 r2 = r10.f11294q0     // Catch:{ all -> 0x0029 }
            com.clevertap.android.sdk.y1$b r3 = com.clevertap.android.sdk.C3248y1.C3250b.Profile     // Catch:{ all -> 0x0029 }
            com.clevertap.android.sdk.x1 r0 = r2.mo12664a(r0, r3)     // Catch:{ all -> 0x0029 }
            java.lang.Object r2 = r0.mo12660c()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0029 }
            int r3 = r0.mo12655a()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x002a
            r10.m15236b(r0)     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            boolean r0 = r11.mo19864u()     // Catch:{ all -> 0x0120 }
            r3 = 0
            if (r0 == 0) goto L_0x0044
            int r0 = r11.mo19847Z()     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "M"
            goto L_0x0045
        L_0x003a:
            int r0 = r11.mo19847Z()     // Catch:{ all -> 0x0120 }
            r4 = 1
            if (r0 != r4) goto L_0x0044
            java.lang.String r0 = "F"
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            boolean r4 = r11.mo19868y()     // Catch:{ all -> 0x0120 }
            if (r4 == 0) goto L_0x006f
            java.text.SimpleDateFormat r4 = com.clevertap.android.sdk.C3208q0.f11601t     // Catch:{ all -> 0x006f }
            java.lang.String r5 = r11.mo19826E()     // Catch:{ all -> 0x006f }
            java.util.Date r4 = r4.parse(r5)     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r5.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r6 = "$D_"
            r5.append(r6)     // Catch:{ all -> 0x006f }
            long r6 = r4.getTime()     // Catch:{ all -> 0x006f }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r4 = (int) r6     // Catch:{ all -> 0x006f }
            r5.append(r4)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r4 = r3
        L_0x0070:
            boolean r5 = r11.mo19846Y()     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = "Y"
            if (r5 == 0) goto L_0x0094
            java.util.List r5 = r11.mo19825D()     // Catch:{ all -> 0x0120 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0120 }
        L_0x0080:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0120 }
            if (r7 == 0) goto L_0x0094
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0120 }
            com.google.android.gms.plus.g.a.a$g r7 = (com.google.android.gms.plus.p177g.p178a.C5495a.C5505g) r7     // Catch:{ all -> 0x0120 }
            int r7 = r7.getType()     // Catch:{ all -> 0x0120 }
            if (r7 != 0) goto L_0x0080
            r5 = r6
            goto L_0x0095
        L_0x0094:
            r5 = r3
        L_0x0095:
            boolean r7 = r11.mo19838Q()     // Catch:{ all -> 0x0120 }
            if (r7 == 0) goto L_0x009f
            java.lang.String r1 = r11.getId()     // Catch:{ all -> 0x0120 }
        L_0x009f:
            boolean r7 = r11.mo19824C()     // Catch:{ all -> 0x0120 }
            if (r7 == 0) goto L_0x00b0
            int r11 = r11.mo19831J()     // Catch:{ all -> 0x0120 }
            r3 = 3
            if (r11 != r3) goto L_0x00ae
            r3 = r6
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r3 = "N"
        L_0x00b0:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0120 }
            r11.<init>()     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r6 = r1.trim()     // Catch:{ all -> 0x0120 }
            int r6 = r6.length()     // Catch:{ all -> 0x0120 }
            if (r6 <= 0) goto L_0x00c6
            java.lang.String r6 = "GPID"
            r11.put(r6, r1)     // Catch:{ all -> 0x0120 }
        L_0x00c6:
            if (r2 == 0) goto L_0x00d7
            java.lang.String r1 = r2.trim()     // Catch:{ all -> 0x0120 }
            int r1 = r1.length()     // Catch:{ all -> 0x0120 }
            if (r1 <= 0) goto L_0x00d7
            java.lang.String r1 = "Name"
            r11.put(r1, r2)     // Catch:{ all -> 0x0120 }
        L_0x00d7:
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x0120 }
            int r1 = r1.length()     // Catch:{ all -> 0x0120 }
            if (r1 <= 0) goto L_0x00e8
            java.lang.String r1 = "Gender"
            r11.put(r1, r0)     // Catch:{ all -> 0x0120 }
        L_0x00e8:
            if (r5 == 0) goto L_0x00f9
            java.lang.String r0 = r5.trim()     // Catch:{ all -> 0x0120 }
            int r0 = r0.length()     // Catch:{ all -> 0x0120 }
            if (r0 <= 0) goto L_0x00f9
            java.lang.String r0 = "Employed"
            r11.put(r0, r5)     // Catch:{ all -> 0x0120 }
        L_0x00f9:
            if (r4 == 0) goto L_0x010b
            java.lang.String r0 = r4.trim()     // Catch:{ all -> 0x0120 }
            int r0 = r0.length()     // Catch:{ all -> 0x0120 }
            r1 = 4
            if (r0 <= r1) goto L_0x010b
            java.lang.String r0 = "DOB"
            r11.put(r0, r4)     // Catch:{ all -> 0x0120 }
        L_0x010b:
            if (r3 == 0) goto L_0x011c
            java.lang.String r0 = r3.trim()     // Catch:{ all -> 0x0120 }
            int r0 = r0.length()     // Catch:{ all -> 0x0120 }
            if (r0 <= 0) goto L_0x011c
            java.lang.String r0 = "Married"
            r11.put(r0, r3)     // Catch:{ all -> 0x0120 }
        L_0x011c:
            r10.m15288e(r11)     // Catch:{ all -> 0x0120 }
            goto L_0x012d
        L_0x0120:
            com.clevertap.android.sdk.h1 r11 = r10.m15117U()
            java.lang.String r0 = r10.m15110N()
            java.lang.String r1 = "FATAL: Creating G+ profile update event failed!"
            r11.mo12315c(r0, r1)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15237b(com.google.android.gms.plus.g.a.a):void");
    }

    /* renamed from: a */
    public void mo11958a(CTInAppNotification cTInAppNotification) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m15205a0().post(new C3172j(cTInAppNotification));
        } else if (cTInAppNotification.mo11942n() != null) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to process inapp notification ");
            sb.append(cTInAppNotification.mo11942n());
            U.mo12307a(N, sb.toString());
        } else {
            C3111h1 U2 = m15117U();
            String N2 = m15110N();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notification ready: ");
            sb2.append(cTInAppNotification.mo11948t());
            U2.mo12307a(N2, sb2.toString());
            m15227b(cTInAppNotification);
        }
    }

    /* renamed from: b */
    private String m15210b(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12460b(Bundle bundle) {
        mo12435a(bundle);
    }

    /* renamed from: b */
    public int mo12457b(String str) {
        C3227u0 a = m15300f0().mo12276a(str);
        if (a != null) {
            return a.mo12621a();
        }
        return -1;
    }

    /* renamed from: a */
    private static void m15155a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        C3111h1.m14939f(cleverTapInstanceConfig.mo12093a(), "checking Pending Notifications");
        ArrayList<CTInAppNotification> arrayList = f11238Z0;
        if (arrayList != null && !arrayList.isEmpty()) {
            try {
                CTInAppNotification cTInAppNotification = (CTInAppNotification) f11238Z0.get(0);
                f11238Z0.remove(0);
                new Handler(context.getMainLooper()).post(new C3178m(context, cTInAppNotification, cleverTapInstanceConfig));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m15240b(Map<String, Object> map, String str) {
        String str2;
        if (map != null) {
            try {
                String g = mo12479g();
                if (g != null) {
                    String str3 = null;
                    boolean z = false;
                    for (String str4 : map.keySet()) {
                        Object obj = map.get(str4);
                        if (C3208q0.f11600s2.contains(str4)) {
                            if (obj != null) {
                                try {
                                    str2 = obj.toString();
                                } catch (Throwable unused) {
                                    continue;
                                }
                            } else {
                                str2 = null;
                            }
                            if (str2 != null && str2.length() > 0) {
                                z = true;
                                str3 = m15280e(str4, str2);
                                if (str3 == null) {
                                }
                            }
                        }
                    }
                    if (!m15365u0() && (!z || m15345p0())) {
                        m15117U().mo12307a(m15110N(), "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile");
                        mo12465b(map);
                    } else if (str3 == null || !str3.equals(g)) {
                        String obj2 = map.toString();
                        if (m15378x(obj2)) {
                            C3111h1 U = m15117U();
                            String N = m15110N();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Already processing onUserLogin for ");
                            sb.append(obj2);
                            U.mo12307a(N, sb.toString());
                            return;
                        }
                        synchronized (this.f11250E0) {
                            this.f11249D0 = obj2;
                        }
                        C3111h1 U2 = m15117U();
                        String N2 = m15110N();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onUserLogin: queuing reset profile for ");
                        sb2.append(obj2);
                        sb2.append(" with Cached GUID ");
                        sb2.append(str3 != null ? str3 : "NULL");
                        U2.mo12315c(N2, sb2.toString());
                        m15192a(map, str3, str);
                    } else {
                        C3111h1 U3 = m15117U();
                        String N3 = m15110N();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("onUserLogin: ");
                        sb3.append(map.toString());
                        sb3.append(" maps to current device id ");
                        sb3.append(g);
                        sb3.append(" pushing on current profile");
                        U3.mo12307a(N3, sb3.toString());
                        mo12465b(map);
                    }
                }
            } catch (Throwable th) {
                m15117U().mo12316c(m15110N(), "onUserLogin failed", th);
            }
        }
    }

    /* renamed from: a */
    public void mo12438a(C3096f1 f1Var) {
        this.f11301x0 = f1Var;
    }

    /* renamed from: a */
    private void m15147a(Context context, int i) {
        if (m15122Z() <= 0) {
            C3217s1.m15532b(context, m15089D("comms_first_ts"), i);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m15148a(Context context, long j) {
        Editor edit = C3217s1.m15526a(context, "IJ").edit();
        edit.putLong(m15089D("comms_i"), j);
        C3217s1.m15529a(edit);
    }

    /* renamed from: a */
    public void mo12441a(C3224t1 t1Var) {
        this.f11270U = t1Var;
    }

    /* renamed from: a */
    public void mo12440a(C3201x0 x0Var) {
        this.f11286i0 = x0Var;
    }

    /* renamed from: a */
    public void mo12445a(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            m15332m(str);
        } else {
            mo12447a(str, new ArrayList<>(Collections.singletonList(str2)));
        }
    }

    /* renamed from: a */
    public void mo12447a(String str, ArrayList<String> arrayList) {
        m15188a("addMultiValuesForKey", (Runnable) new C3186q(str, arrayList));
    }

    /* renamed from: a */
    private String m15139a(JSONObject jSONObject, String str, String str2) {
        try {
            String str3 = (String) jSONObject.get(str);
            return str3 != null ? str3 : str2;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo12453a(JSONObject jSONObject) {
        m15188a("pushFacebookUser", (Runnable) new C3192t(jSONObject));
    }

    /* renamed from: a */
    public void mo12442a(C5495a aVar) {
        m15188a("pushGooglePlusPerson", (Runnable) new C3194u(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15191a(ArrayList<String> arrayList, String str, String str2) {
        if (str != null) {
            if (arrayList == null || arrayList.isEmpty()) {
                m15332m(str);
                return;
            }
            C3244x1 b = this.f11294q0.mo12667b(str);
            if (b.mo12655a() != 0) {
                m15236b(b);
            }
            String obj = b.mo12660c() != null ? b.mo12660c().toString() : null;
            if (obj == null || obj.isEmpty()) {
                m15336n(str);
                return;
            }
            try {
                m15194a(m15248c(obj, str2), m15142a(arrayList, obj), arrayList, obj, str2);
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Error handling multi value operation for key ");
                sb.append(obj);
                U.mo12316c(N, sb.toString(), th);
            }
        }
    }

    /* renamed from: b */
    public void mo12464b(String str, boolean z) {
        m15189a(str, z, C3145n1.GCM);
    }

    /* renamed from: b */
    public void mo12166b(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        HashMap hashMap;
        cTInAppNotification.mo11931a();
        this.f11302y0.mo12247b(cTInAppNotification);
        C3111h1 U = m15117U();
        String N = m15110N();
        StringBuilder sb = new StringBuilder();
        sb.append("InApp Dismissed: ");
        sb.append(cTInAppNotification.mo11939k());
        U.mo12315c(N, sb.toString());
        try {
            C3096f1 j = mo12484j();
            if (j != null) {
                if (cTInAppNotification.mo11940l() != null) {
                    hashMap = C3238w1.m15663a(cTInAppNotification.mo11940l());
                } else {
                    hashMap = new HashMap();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling the in-app listener on behalf of ");
                sb2.append(this.f11277a0);
                C3111h1.m14938f(sb2.toString());
                if (bundle != null) {
                    j.mo12262a(hashMap, C3238w1.m15662a(bundle));
                } else {
                    j.mo12262a(hashMap, null);
                }
            }
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "Failed to call the in-app notification listener", th);
        }
        m15186a((Runnable) new C3154a0(context, cTInAppNotification));
    }

    /* renamed from: a */
    private String m15138a(Object obj) {
        String b = m15210b(obj);
        if (b == null) {
            return b;
        }
        C3244x1 c = this.f11294q0.mo12668c(b);
        if (c.mo12655a() != 0) {
            m15236b(c);
        }
        if (c.mo12660c() != null) {
            return c.mo12660c().toString();
        }
        return null;
    }

    /* renamed from: b */
    private void m15241b(JSONArray jSONArray) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5 = "ico";
        String str6 = f11231S0;
        String str7 = "wzrk_id";
        String str8 = "wzrk_bi";
        String str9 = "wzrk_bc";
        String str10 = "wzrk_cid";
        String str11 = "wzrk_sound";
        String str12 = "wzrk_pivot";
        String str13 = "pr";
        String str14 = "wzrk_bp";
        String str15 = "nt";
        String str16 = "nm";
        String str17 = "wzrk_acts";
        String str18 = "wzrk_acct_id";
        String str19 = "wzrk_pid";
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            try {
                Bundle bundle = new Bundle();
                String str20 = str5;
                String str21 = str6;
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject.has(str18)) {
                    i = i3;
                    bundle.putString(str18, jSONObject.getString(str18));
                } else {
                    i = i3;
                }
                if (jSONObject.has(str17)) {
                    bundle.putString(str17, jSONObject.getString(str17));
                }
                if (jSONObject.has(str16)) {
                    bundle.putString(str16, jSONObject.getString(str16));
                }
                if (jSONObject.has(str15)) {
                    bundle.putString(str15, jSONObject.getString(str15));
                }
                if (jSONObject.has(str14)) {
                    bundle.putString(str14, jSONObject.getString(str14));
                }
                if (jSONObject.has(str13)) {
                    bundle.putString(str13, jSONObject.getString(str13));
                }
                if (jSONObject.has(str12)) {
                    bundle.putString(str12, jSONObject.getString(str12));
                }
                if (jSONObject.has(str11)) {
                    bundle.putString(str11, jSONObject.getString(str11));
                }
                if (jSONObject.has(str10)) {
                    bundle.putString(str10, jSONObject.getString(str10));
                }
                if (jSONObject.has(str9)) {
                    bundle.putString(str9, jSONObject.getString(str9));
                }
                if (jSONObject.has(str8)) {
                    bundle.putString(str8, jSONObject.getString(str8));
                }
                if (jSONObject.has(str7)) {
                    bundle.putString(str7, jSONObject.getString(str7));
                }
                String str22 = str21;
                if (jSONObject.has(str22)) {
                    bundle.putString(str22, jSONObject.getString(str22));
                }
                String str23 = str20;
                String str24 = str22;
                if (jSONObject.has(str23)) {
                    bundle.putString(str23, jSONObject.getString(str23));
                }
                if (jSONObject.has("wzrk_ck")) {
                    str = str23;
                    bundle.putString("wzrk_ck", jSONObject.getString("wzrk_ck"));
                } else {
                    str = str23;
                }
                if (jSONObject.has("wzrk_dl")) {
                    bundle.putString("wzrk_dl", jSONObject.getString("wzrk_dl"));
                }
                String str25 = str19;
                if (jSONObject.has(str25)) {
                    bundle.putString(str25, jSONObject.getString(str25));
                }
                if (jSONObject.has("wzrk_ttl")) {
                    str3 = str7;
                    str2 = str8;
                    bundle.putLong("wzrk_ttl", jSONObject.getLong("wzrk_ttl"));
                } else {
                    str3 = str7;
                    str2 = str8;
                }
                if (jSONObject.has("wzrk_rnv")) {
                    bundle.putString("wzrk_rnv", jSONObject.getString("wzrk_rnv"));
                }
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String obj = keys.next().toString();
                    bundle.putString(obj, jSONObject.getString(obj));
                }
                if (!bundle.isEmpty()) {
                    i2 = i;
                    str4 = str9;
                    if (!this.f11259N.mo12566a(jSONObject.getString(str25))) {
                        m15117U().mo12314c("Creating Push Notification locally");
                        m15151a(this.f11261O, bundle);
                        int i4 = i2 + 1;
                        str7 = str3;
                        str6 = str24;
                        str9 = str4;
                        str8 = str2;
                        str19 = str25;
                        i3 = i4;
                        str5 = str;
                    }
                } else {
                    i2 = i;
                    str4 = str9;
                }
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Push Notification already shown, ignoring local notification :");
                sb.append(jSONObject.getString(str25));
                U.mo12315c(N, sb.toString());
                int i42 = i2 + 1;
                str7 = str3;
                str6 = str24;
                str9 = str4;
                str8 = str2;
                str19 = str25;
                i3 = i42;
                str5 = str;
            } catch (JSONException unused) {
                m15117U().mo12315c(m15110N(), "Error parsing push notification JSON");
                return;
            }
        }
    }

    /* renamed from: a */
    private JSONArray m15142a(ArrayList<String> arrayList, String str) {
        if (!(arrayList == null || str == null)) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2 == null) {
                        str2 = "";
                    }
                    C3244x1 c = this.f11294q0.mo12668c(str2);
                    if (c.mo12655a() != 0) {
                        m15236b(c);
                    }
                    String obj = c.mo12660c() != null ? c.mo12660c().toString() : null;
                    if (obj != null) {
                        if (!obj.isEmpty()) {
                            jSONArray.put(obj);
                        }
                    }
                    m15332m(str);
                    return null;
                }
                return jSONArray;
            } catch (Throwable th) {
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("Error cleaning multi values for key ");
                sb.append(str);
                U.mo12316c(N, sb.toString(), th);
                m15332m(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m15194a(JSONArray jSONArray, JSONArray jSONArray2, ArrayList<String> arrayList, String str, String str2) {
        if (jSONArray != null && jSONArray2 != null && arrayList != null && str != null && str2 != null) {
            try {
                C3244x1 a = this.f11294q0.mo12666a(jSONArray, jSONArray2, str2.equals("$remove") ? "multiValuePropertyRemoveValues" : "multiValuePropertyAddValues", str);
                if (a.mo12655a() != 0) {
                    m15236b(a);
                }
                JSONArray jSONArray3 = (JSONArray) a.mo12660c();
                if (jSONArray3 != null) {
                    if (jSONArray3.length() > 0) {
                        m15300f0().mo12281a(str, (Object) jSONArray3);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(str2, new JSONArray(arrayList));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(str, jSONObject);
                        m15288e(jSONObject2);
                        C3111h1 U = m15117U();
                        String N = m15110N();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Constructed multi-value profile push: ");
                        sb.append(jSONObject2.toString());
                        U.mo12315c(N, sb.toString());
                    }
                }
                m15300f0().mo12287d(str);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(str2, new JSONArray(arrayList));
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put(str, jSONObject3);
                m15288e(jSONObject22);
                C3111h1 U2 = m15117U();
                String N2 = m15110N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Constructed multi-value profile push: ");
                sb2.append(jSONObject22.toString());
                U2.mo12315c(N2, sb2.toString());
            } catch (Throwable th) {
                C3111h1 U3 = m15117U();
                String N3 = m15110N();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error pushing multiValue for key ");
                sb3.append(str);
                U3.mo12316c(N3, sb3.toString(), th);
            }
        }
    }

    /* renamed from: a */
    public void mo12435a(Bundle bundle) {
        if (this.f11265Q.mo12109m()) {
            m15117U().mo12307a(m15110N(), "is Analytics Only - will not process Notification Clicked event.");
        } else if (bundle == null || bundle.isEmpty() || bundle.get(f11231S0) == null) {
            C3111h1 U = m15117U();
            String N = m15110N();
            StringBuilder sb = new StringBuilder();
            sb.append("Push notification: ");
            sb.append(bundle == null ? "NULL" : bundle.toString());
            sb.append(" not from CleverTap - will not process Notification Clicked event.");
            U.mo12307a(N, sb.toString());
        } else {
            String str = null;
            try {
                str = bundle.getString("wzrk_acct_id");
            } catch (Throwable unused) {
            }
            if (!((str == null && this.f11265Q.mo12112p()) || m15110N().equals(str))) {
                m15117U().mo12307a(m15110N(), "Push notification not targeted at this instance, not processing Notification Clicked Event");
            } else if (bundle.containsKey("wzrk_inapp")) {
                this.f11278b = new C3198w(bundle);
            } else if (bundle.containsKey("wzrk_inbox")) {
                this.f11278b = new C3200x(bundle);
            } else {
                String str2 = "wzrk_id";
                if (!bundle.containsKey(str2) || bundle.getString(str2) == null) {
                    C3111h1 U2 = m15117U();
                    String N2 = m15110N();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Push notification ID Tag is null, not processing Notification Clicked event for:  ");
                    sb2.append(bundle.toString());
                    U2.mo12307a(N2, sb2.toString());
                } else if (m15200a(bundle, this.f11283f0, (int) C10526n.f28536a)) {
                    C3111h1 U3 = m15117U();
                    String N3 = m15110N();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Already processed Notification Clicked event for ");
                    sb3.append(bundle.toString());
                    sb3.append(", dropping duplicate.");
                    U3.mo12307a(N3, sb3.toString());
                } else {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (String str3 : bundle.keySet()) {
                            if (str3.startsWith("wzrk_")) {
                                jSONObject2.put(str3, bundle.get(str3));
                            }
                        }
                        jSONObject.put("evtName", "Notification Clicked");
                        jSONObject.put("evtData", jSONObject2);
                        m15257c(this.f11261O, jSONObject, 4);
                        m15313h(m15281e(bundle));
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m15220b(Context context, Bundle bundle, int i) {
        String string = bundle.getString("wzrk_acct_id");
        HashMap<String, C3150p0> hashMap = f11235W0;
        if (hashMap == null) {
            C3150p0 a = m15132a(context, string);
            if (a != null) {
                a.m15152a(context, bundle, i);
            }
            return;
        }
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3150p0 p0Var = (C3150p0) f11235W0.get((String) it.next());
            boolean z = false;
            if (p0Var != null && ((string == null && p0Var.f11265Q.mo12112p()) || p0Var.m15110N().equals(string))) {
                z = true;
                continue;
            }
            if (z) {
                try {
                    p0Var.m15152a(context, bundle, i);
                    break;
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15200a(android.os.Bundle r9, java.util.HashMap<java.lang.String, java.lang.Object> r10, int r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f11247B0
            monitor-enter(r0)
            r1 = 0
            java.lang.String r2 = "wzrk_id"
            java.lang.String r9 = r9.getString(r2)     // Catch:{ all -> 0x002e }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002e }
            boolean r4 = r10.containsKey(r9)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r10.get(r9)     // Catch:{ all -> 0x002e }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x002e }
            long r4 = r4.longValue()     // Catch:{ all -> 0x002e }
            long r4 = r2 - r4
            long r6 = (long) r11     // Catch:{ all -> 0x002e }
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0027
            r11 = 1
            r1 = 1
        L_0x0027:
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x002e }
            r10.put(r9, r11)     // Catch:{ all -> 0x002e }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r1
        L_0x0030:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15200a(android.os.Bundle, java.util.HashMap, int):boolean");
    }

    /* renamed from: b */
    public static void m15224b(Context context, String str) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#deleteNotificationChannel");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                n.m15188a("deletingNotificationChannel", (Runnable) new C3173j0(context, str, n));
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure deleting Notification Channel", th);
        }
    }

    /* renamed from: a */
    public void mo12450a(HashMap<String, Object> hashMap, ArrayList<HashMap<String, Object>> arrayList) {
        String str;
        String str2;
        int i;
        String str3;
        Object obj;
        String obj2;
        HashMap<String, Object> hashMap2 = hashMap;
        if (hashMap2 == null || arrayList == null) {
            m15117U().mo12307a(m15110N(), "Invalid Charged event: details and or items is null");
            return;
        }
        if (arrayList.size() > 50) {
            C3244x1 x1Var = new C3244x1();
            x1Var.mo12656a(522);
            String str4 = "Charged event contained more than 50 items.";
            x1Var.mo12658a(str4);
            m15117U().mo12307a(m15110N(), str4);
            m15236b(x1Var);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = ")";
                str2 = " wasn't a primitive (";
                i = C0753l.f3451u;
                str3 = "wzrk_error";
                if (!hasNext) {
                    break;
                }
                String str5 = (String) it.next();
                obj = hashMap2.get(str5);
                C3244x1 d = this.f11294q0.mo12669d(str5);
                obj2 = d.mo12660c().toString();
                if (d.mo12655a() != 0) {
                    jSONObject2.put(str3, m15143a(d));
                }
                C3244x1 a = this.f11294q0.mo12664a(obj, C3250b.Event);
                Object c = a.mo12660c();
                if (a.mo12655a() != 0) {
                    jSONObject2.put(str3, m15143a(a));
                }
                jSONObject.put(obj2, c);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                HashMap hashMap3 = (HashMap) it2.next();
                JSONObject jSONObject3 = new JSONObject();
                for (String str6 : hashMap3.keySet()) {
                    Object obj3 = hashMap3.get(str6);
                    C3244x1 d2 = this.f11294q0.mo12669d(str6);
                    String obj4 = d2.mo12660c().toString();
                    if (d2.mo12655a() != 0) {
                        jSONObject2.put(str3, m15143a(d2));
                    }
                    try {
                        C3244x1 a2 = this.f11294q0.mo12664a(obj3, C3250b.Event);
                        Object c2 = a2.mo12660c();
                        if (a2.mo12655a() != 0) {
                            jSONObject2.put(str3, m15143a(a2));
                        }
                        jSONObject3.put(obj4, c2);
                    } catch (IllegalArgumentException unused) {
                        C3244x1 x1Var2 = new C3244x1();
                        x1Var2.mo12656a(i);
                        StringBuilder sb = new StringBuilder();
                        sb.append("An item's object value for key ");
                        sb.append(obj4);
                        sb.append(str2);
                        sb.append(obj3);
                        sb.append(str);
                        String sb2 = sb.toString();
                        x1Var2.mo12658a(sb2);
                        m15117U().mo12307a(m15110N(), sb2);
                        m15236b(x1Var2);
                        i = C0753l.f3451u;
                    }
                }
                jSONArray.put(jSONObject3);
                i = C0753l.f3451u;
            }
            jSONObject.put("Items", jSONArray);
            jSONObject2.put("evtName", f11230R0);
            jSONObject2.put("evtData", jSONObject);
            m15257c(this.f11261O, jSONObject2, 4);
        } catch (IllegalArgumentException unused2) {
            C3244x1 x1Var3 = new C3244x1();
            x1Var3.mo12656a((int) C0753l.f3451u);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("For event Charged: Property value for property ");
            sb3.append(obj2);
            sb3.append(str2);
            sb3.append(obj);
            sb3.append(str);
            String sb4 = sb3.toString();
            x1Var3.mo12658a(sb4);
            m15236b(x1Var3);
            m15117U().mo12307a(m15110N(), sb4);
        } catch (Throwable unused3) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12459b(Location location) {
        m15258c(location);
    }

    /* renamed from: b */
    public void mo12461b(CTInboxMessage cTInboxMessage) {
        m15188a("markReadInboxMessage", (Runnable) new C3181n0(cTInboxMessage));
    }

    /* renamed from: b */
    public void mo12009b(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle) {
        mo12456a(true, cTInboxMessage, bundle);
    }

    /* renamed from: b */
    static void m15218b(Context context, JobParameters jobParameters) {
        HashMap<String, C3150p0> hashMap = f11235W0;
        String str = "Instance doesn't allow Background sync, not running the Job";
        if (hashMap == null) {
            C3150p0 m = m15330m(context);
            if (m != null) {
                if (m.m15116T().mo12110n()) {
                    m.m15149a(context, jobParameters);
                } else {
                    C3111h1.m14930d(str);
                }
            }
            return;
        }
        for (String str2 : hashMap.keySet()) {
            C3150p0 p0Var = (C3150p0) f11235W0.get(str2);
            if (p0Var != null && p0Var.m15116T().mo12109m()) {
                C3111h1.m14931d(str2, "Instance is Analytics Only not running the Job");
            } else if (p0Var == null || !p0Var.m15116T().mo12110n()) {
                C3111h1.m14931d(str2, str);
            } else {
                p0Var.m15149a(context, jobParameters);
            }
        }
    }

    /* renamed from: a */
    public void mo12448a(String str, Map<String, Object> map) {
        String obj;
        Object obj2;
        String obj3;
        if (str != null && !str.equals("")) {
            C3244x1 e = this.f11294q0.mo12670e(str);
            if (e.mo12655a() > 0) {
                m15236b(e);
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                C3244x1 a = this.f11294q0.mo12665a(str);
                String str2 = "wzrk_error";
                if (a.mo12655a() != 0) {
                    jSONObject.put(str2, m15143a(a));
                }
                obj = a.mo12660c().toString();
                JSONObject jSONObject2 = new JSONObject();
                for (String str3 : map.keySet()) {
                    obj2 = map.get(str3);
                    C3244x1 d = this.f11294q0.mo12669d(str3);
                    obj3 = d.mo12660c().toString();
                    if (d.mo12655a() != 0) {
                        jSONObject.put(str2, m15143a(d));
                    }
                    C3244x1 a2 = this.f11294q0.mo12664a(obj2, C3250b.Event);
                    Object c = a2.mo12660c();
                    if (a2.mo12655a() != 0) {
                        jSONObject.put(str2, m15143a(a2));
                    }
                    jSONObject2.put(obj3, c);
                }
                jSONObject.put("evtName", obj);
                jSONObject.put("evtData", jSONObject2);
                m15257c(this.f11261O, jSONObject, 4);
            } catch (IllegalArgumentException unused) {
                C3244x1 x1Var = new C3244x1();
                x1Var.mo12656a(512);
                StringBuilder sb = new StringBuilder();
                sb.append("For event \"");
                sb.append(obj);
                sb.append("\": Property value for property ");
                sb.append(obj3);
                sb.append(" wasn't a primitive (");
                sb.append(obj2);
                sb.append(")");
                String sb2 = sb.toString();
                x1Var.mo12658a(sb2);
                m15117U().mo12307a(m15110N(), sb2);
                m15236b(x1Var);
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12455a(boolean z, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject c = m15249c(cTInAppNotification);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        c.put(str, obj);
                    }
                }
            }
            String str2 = "evtName";
            if (z) {
                try {
                    m15313h(c);
                } catch (Throwable unused) {
                }
                jSONObject.put(str2, "Notification Clicked");
            } else {
                jSONObject.put(str2, "Notification Viewed");
            }
            jSONObject.put("evtData", c);
            m15257c(this.f11261O, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12456a(boolean z, CTInboxMessage cTInboxMessage, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject c = m15250c(cTInboxMessage);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        c.put(str, obj);
                    }
                }
            }
            String str2 = "evtName";
            if (z) {
                try {
                    m15313h(c);
                } catch (Throwable unused) {
                }
                jSONObject.put(str2, "Notification Clicked");
            } else {
                jSONObject.put(str2, "Notification Viewed");
            }
            jSONObject.put("evtData", c);
            m15257c(this.f11261O, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void mo12444a(String str, int i) {
        String str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String str3 = "Location";
        HashMap hashMap = new HashMap();
        hashMap.put("Error Message", str);
        hashMap.put("Error Code", Integer.valueOf(i));
        try {
            String W = m15119W();
            if (W != null) {
                hashMap.put(str3, W);
            } else {
                hashMap.put(str3, str2);
            }
        } catch (Throwable unused) {
            hashMap.put(str3, str2);
        }
        mo12448a("Error Occurred", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public void mo12452a(Map<String, Object> map, String str) {
        if (m15116T().mo12106j()) {
            if (str == null) {
                C3111h1.m14934e("CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml Please call onUserlogin() and pass a custom CleverTap ID");
            }
        } else if (str != null) {
            C3111h1.m14934e("CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml Please call CleverTapAPI.defaultInstance() without a custom CleverTap ID");
        }
        m15240b(map, str);
    }

    /* renamed from: a */
    public void mo12451a(Map<String, Object> map) {
        mo12452a(map, (String) null);
    }

    /* renamed from: a */
    private void m15192a(Map<String, Object> map, String str, String str2) {
        m15188a("resetProfile", (Runnable) new C3202y(str, str2, map));
    }

    /* renamed from: a */
    private void m15196a(boolean z, boolean z2) {
        if (this.f11271V == null) {
            this.f11271V = this.f11285h0.mo12597i();
        }
        Iterator it = this.f11271V.iterator();
        while (it.hasNext()) {
            int i = C3187q0.f11415a[((C3145n1) it.next()).ordinal()];
            if (i == 1) {
                m15239b((String) null, z, z2);
            } else if (i == 2) {
                m15190a((String) null, z, z2);
            }
        }
    }

    /* renamed from: a */
    public void mo12449a(String str, boolean z) {
        m15189a(str, z, C3145n1.FCM);
    }

    /* renamed from: a */
    private void m15189a(String str, boolean z, C3145n1 n1Var) {
        m15164a(this.f11261O, str, z, n1Var);
    }

    /* renamed from: a */
    private void m15164a(Context context, String str, boolean z, C3145n1 n1Var) {
        if (str != null && n1Var != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = z ? Feature.ELEMENT : "unregister";
            try {
                jSONObject2.put("action", str2);
                jSONObject2.put("id", str);
                jSONObject2.put("type", n1Var.toString());
                jSONObject.put("data", jSONObject2);
                C3111h1 U = m15117U();
                String N = m15110N();
                StringBuilder sb = new StringBuilder();
                sb.append("DataHandler: pushing device token with action ");
                sb.append(str2);
                sb.append(" and type ");
                sb.append(n1Var.toString());
                U.mo12315c(N, sb.toString());
                m15257c(context, jSONObject, 5);
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15188a(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == this.f11251F0) {
                runnable.run();
            } else {
                this.f11290m0.submit(new C3204z(runnable));
            }
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "Failed to submit task to the executor service", th);
        }
    }

    /* renamed from: a */
    public void mo12165a(Context context, CTInAppNotification cTInAppNotification, Bundle bundle) {
        mo12455a(false, cTInAppNotification, bundle);
    }

    /* renamed from: a */
    private void m15186a(Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == this.f11252G0) {
                runnable.run();
            } else {
                this.f11291n0.submit(new C3157b0(runnable));
            }
        } catch (Throwable th) {
            m15117U().mo12316c(m15110N(), "Failed to submit task to the notification executor service", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12443a(String str) {
        m15117U().mo12314c("Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        m15383y(str);
    }

    /* renamed from: a */
    private static C3150p0 m15132a(Context context, String str) {
        return m15133a(context, str, (String) null);
    }

    @C0195i0
    /* renamed from: a */
    private static C3150p0 m15133a(Context context, String str, String str2) {
        String str3 = "Error creating shared Instance: ";
        C3150p0 p0Var = null;
        if (str == null) {
            try {
                return m15267d(context, str2);
            } catch (Throwable unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("instance:");
            sb.append(str);
            String a = C3217s1.m15527a(context, sb.toString(), "");
            if (!a.isEmpty()) {
                CleverTapInstanceConfig a2 = CleverTapInstanceConfig.m14637a(a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inflated Instance Config: ");
                sb2.append(a);
                C3111h1.m14938f(sb2.toString());
                if (a2 != null) {
                    p0Var = m15131a(context, a2, str2);
                }
                return p0Var;
            }
            try {
                C3150p0 m = m15330m(context);
                if (m == null || !m.f11265Q.mo12093a().equals(str)) {
                    m = null;
                }
                return m;
            } catch (Throwable th) {
                C3111h1.m14941f(str3, th.getCause());
                return null;
            }
        }
    }

    /* renamed from: a */
    public static void m15151a(Context context, Bundle bundle) {
        m15220b(context, bundle, (int) C0798u.f3805q);
    }

    /* renamed from: a */
    private void m15152a(Context context, Bundle bundle, int i) {
        if (!(bundle == null || bundle.get(f11231S0) == null)) {
            if (this.f11265Q.mo12109m()) {
                m15117U().mo12307a(m15110N(), "Instance is set for Analytics only, cannot create notification");
                return;
            }
            try {
                m15188a("CleverTapAPI#_createNotification", (Runnable) new C3159c0(bundle, context, i));
            } catch (Throwable th) {
                m15117U().mo12308a(m15110N(), "Failed to process push notification", th);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [org.json.JSONArray] */
    /* JADX WARNING: type inference failed for: r1v11, types: [org.json.JSONArray] */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r26v3 */
    /* JADX WARNING: type inference failed for: r26v4 */
    /* JADX WARNING: type inference failed for: r26v5 */
    /* JADX WARNING: type inference failed for: r26v6 */
    /* JADX WARNING: type inference failed for: r26v7 */
    /* JADX WARNING: type inference failed for: r26v8 */
    /* JADX WARNING: type inference failed for: r26v9 */
    /* JADX WARNING: type inference failed for: r26v10 */
    /* JADX WARNING: type inference failed for: r26v11 */
    /* JADX WARNING: type inference failed for: r26v12 */
    /* JADX WARNING: type inference failed for: r26v13 */
    /* JADX WARNING: type inference failed for: r26v14 */
    /* JADX WARNING: type inference failed for: r26v15 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v27, types: [org.json.JSONArray] */
    /* JADX WARNING: type inference failed for: r0v60, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r0v65, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r0v68, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r0v69 */
    /* JADX WARNING: type inference failed for: r0v70, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r26v16 */
    /* JADX WARNING: type inference failed for: r26v17 */
    /* JADX WARNING: type inference failed for: r26v18 */
    /* JADX WARNING: type inference failed for: r26v19 */
    /* JADX WARNING: type inference failed for: r26v20 */
    /* JADX WARNING: type inference failed for: r26v21 */
    /* JADX WARNING: type inference failed for: r26v22 */
    /* JADX WARNING: type inference failed for: r26v23 */
    /* JADX WARNING: type inference failed for: r26v24 */
    /* JADX WARNING: type inference failed for: r26v25 */
    /* JADX WARNING: type inference failed for: r26v26 */
    /* JADX WARNING: type inference failed for: r26v27 */
    /* JADX WARNING: type inference failed for: r26v28 */
    /* JADX WARNING: type inference failed for: r26v29 */
    /* JADX WARNING: type inference failed for: r26v30 */
    /* JADX WARNING: type inference failed for: r26v31 */
    /* JADX WARNING: type inference failed for: r26v32 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r0v85 */
    /* JADX WARNING: type inference failed for: r0v86 */
    /* JADX WARNING: type inference failed for: r0v87 */
    /* JADX WARNING: type inference failed for: r0v88 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01c6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r26v2
      assigns: []
      uses: []
      mth insns count: 541
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e7 A[Catch:{ all -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0367 A[Catch:{ all -> 0x036b }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0384 A[SYNTHETIC, Splitter:B:163:0x0384] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03c3 A[SYNTHETIC, Splitter:B:175:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x044a A[ADDED_TO_REGION, Catch:{ all -> 0x043b, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0451 A[Catch:{ all -> 0x043b, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0472 A[Catch:{ all -> 0x043b, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0492 A[Catch:{ all -> 0x043b, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04b2 A[Catch:{ all -> 0x04cd, all -> 0x04e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04c3 A[Catch:{ all -> 0x04cd, all -> 0x04e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0234  */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15153a(android.content.Context r24, android.os.Bundle r25, java.lang.String r26, java.lang.String r27, int r28) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            java.lang.String r6 = "drawable"
            java.lang.String r0 = "wzrk_nms"
            java.lang.String r7 = "notification"
            java.lang.Object r7 = r2.getSystemService(r7)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            if (r7 != 0) goto L_0x0026
            com.clevertap.android.sdk.h1 r0 = r23.m15117U()
            java.lang.String r2 = r23.m15110N()
            java.lang.String r3 = "Unable to render notification, Notification Manager is null."
            r0.mo12307a(r2, r3)
            return
        L_0x0026:
            java.lang.String r8 = ""
            java.lang.String r9 = "wzrk_cid"
            java.lang.String r9 = r3.getString(r9, r8)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            if (r10 < r11) goto L_0x0036
            r10 = 1
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 512(0x200, float:7.175E-43)
            if (r14 < r11) goto L_0x008d
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x0059
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Unable to render notification, channelId is required but not provided in the notification payload: "
            r11.append(r14)
            java.lang.String r14 = r25.toString()
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            goto L_0x0077
        L_0x0059:
            android.app.NotificationChannel r11 = r7.getNotificationChannel(r9)
            if (r11 != 0) goto L_0x0076
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Unable to render notification, channelId: "
            r11.append(r14)
            r11.append(r9)
            java.lang.String r14 = " not registered by the app."
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            if (r11 == 0) goto L_0x008d
            com.clevertap.android.sdk.h1 r0 = r23.m15117U()
            java.lang.String r2 = r23.m15110N()
            r0.mo12307a(r2, r11)
            com.clevertap.android.sdk.x1 r0 = new com.clevertap.android.sdk.x1
            r0.<init>(r15, r11)
            r1.m15236b(r0)
            return
        L_0x008d:
            java.lang.String r11 = "ico"
            java.lang.String r14 = r3.getString(r11)
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<com.clevertap.android.sdk.CTPushNotificationReceiver> r12 = com.clevertap.android.sdk.CTPushNotificationReceiver.class
            r15.<init>(r2, r12)
            r15.putExtras(r3)
            java.lang.String r12 = "wzrk_acts"
            r15.removeExtra(r12)
            r13 = 603979776(0x24000000, float:2.7755576E-17)
            r15.setFlags(r13)
            r16 = r14
            long r13 = java.lang.System.currentTimeMillis()
            int r14 = (int) r13
            r13 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r14 = android.app.PendingIntent.getBroadcast(r2, r14, r15, r13)
            java.lang.String r15 = "wzrk_bp"
            java.lang.String r15 = r3.getString(r15)
            if (r15 == 0) goto L_0x0115
            java.lang.String r13 = "http"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x0115
            r13 = 0
            android.graphics.Bitmap r15 = com.clevertap.android.sdk.C3238w1.m15660a(r15, r13, r2)     // Catch:{ all -> 0x00f9 }
            if (r15 == 0) goto L_0x00f1
            boolean r13 = r3.containsKey(r0)     // Catch:{ all -> 0x00f9 }
            if (r13 == 0) goto L_0x00e3
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x00f9 }
            androidx.core.app.p$c r13 = new androidx.core.app.p$c     // Catch:{ all -> 0x00f9 }
            r13.<init>()     // Catch:{ all -> 0x00f9 }
            androidx.core.app.p$c r0 = r13.mo4192b(r0)     // Catch:{ all -> 0x00f9 }
            androidx.core.app.p$c r0 = r0.mo4191b(r15)     // Catch:{ all -> 0x00f9 }
            goto L_0x011e
        L_0x00e3:
            androidx.core.app.p$c r0 = new androidx.core.app.p$c     // Catch:{ all -> 0x00f9 }
            r0.<init>()     // Catch:{ all -> 0x00f9 }
            androidx.core.app.p$c r0 = r0.mo4192b(r4)     // Catch:{ all -> 0x00f9 }
            androidx.core.app.p$c r0 = r0.mo4191b(r15)     // Catch:{ all -> 0x00f9 }
            goto L_0x011e
        L_0x00f1:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00f9 }
            java.lang.String r13 = "Failed to fetch big picture!"
            r0.<init>(r13)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            androidx.core.app.p$d r13 = new androidx.core.app.p$d
            r13.<init>()
            androidx.core.app.p$d r13 = r13.mo4193a(r4)
            com.clevertap.android.sdk.h1 r15 = r23.m15117U()
            r17 = r13
            java.lang.String r13 = r23.m15110N()
            java.lang.String r1 = "Falling back to big text notification, couldn't fetch big picture"
            r15.mo12316c(r13, r1, r0)
            r0 = r17
            goto L_0x011e
        L_0x0115:
            androidx.core.app.p$d r0 = new androidx.core.app.p$d
            r0.<init>()
            androidx.core.app.p$d r0 = r0.mo4193a(r4)
        L_0x011e:
            com.clevertap.android.sdk.i1 r1 = com.clevertap.android.sdk.C3115i1.m14962a(r24)     // Catch:{ all -> 0x0143 }
            java.lang.String r1 = r1.mo12325g()     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x013d
            android.content.res.Resources r13 = r24.getResources()     // Catch:{ all -> 0x0143 }
            java.lang.String r15 = r24.getPackageName()     // Catch:{ all -> 0x0143 }
            int r1 = r13.getIdentifier(r1, r6, r15)     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x0137
            goto L_0x0147
        L_0x0137:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0143 }
            r1.<init>()     // Catch:{ all -> 0x0143 }
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x013d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0143 }
            r1.<init>()     // Catch:{ all -> 0x0143 }
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x0143:
            int r1 = com.clevertap.android.sdk.C3220t0.m15550a(r24)
        L_0x0147:
            java.lang.String r13 = "pr"
            java.lang.String r13 = r3.getString(r13)
            if (r13 == 0) goto L_0x0164
            java.lang.String r15 = "high"
            boolean r15 = r13.equals(r15)
            r18 = r15
            java.lang.String r15 = "max"
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0161
            r13 = 2
            goto L_0x0165
        L_0x0161:
            r13 = r18
            goto L_0x0165
        L_0x0164:
            r13 = 0
        L_0x0165:
            r15 = -1000(0xfffffffffffffc18, float:NaN)
            if (r5 != r15) goto L_0x0207
            java.lang.String r15 = "wzrk_ck"
            java.lang.Object r15 = r3.get(r15)     // Catch:{ NumberFormatException -> 0x01ff }
            if (r15 == 0) goto L_0x01f8
            r19 = r8
            boolean r8 = r15 instanceof java.lang.Number     // Catch:{ NumberFormatException -> 0x01f3 }
            if (r8 == 0) goto L_0x0185
            java.lang.Number r15 = (java.lang.Number) r15     // Catch:{ NumberFormatException -> 0x01f3 }
            int r5 = r15.intValue()     // Catch:{ NumberFormatException -> 0x01f3 }
        L_0x017d:
            r21 = r6
            r20 = r7
        L_0x0181:
            r22 = r11
            goto L_0x0230
        L_0x0185:
            boolean r8 = r15 instanceof java.lang.String     // Catch:{ NumberFormatException -> 0x01f3 }
            if (r8 == 0) goto L_0x017d
            java.lang.String r8 = r15.toString()     // Catch:{ NumberFormatException -> 0x01c0 }
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c0 }
            com.clevertap.android.sdk.h1 r8 = r23.m15117U()     // Catch:{ NumberFormatException -> 0x01c0 }
            r20 = r7
            java.lang.String r7 = r23.m15110N()     // Catch:{ NumberFormatException -> 0x01bd }
            r21 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01c4 }
            r6.<init>()     // Catch:{ NumberFormatException -> 0x01c4 }
            r22 = r11
            java.lang.String r11 = "Converting collapse_key: "
            r6.append(r11)     // Catch:{ NumberFormatException -> 0x01c6 }
            r6.append(r15)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r11 = " to notificationId int: "
            r6.append(r11)     // Catch:{ NumberFormatException -> 0x01c6 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x01c6 }
            java.lang.String r6 = r6.toString()     // Catch:{ NumberFormatException -> 0x01c6 }
            r8.mo12307a(r7, r6)     // Catch:{ NumberFormatException -> 0x01c6 }
            goto L_0x0230
        L_0x01bd:
            r21 = r6
            goto L_0x01c4
        L_0x01c0:
            r21 = r6
            r20 = r7
        L_0x01c4:
            r22 = r11
        L_0x01c6:
            java.lang.String r6 = r15.toString()     // Catch:{ NumberFormatException -> 0x0230 }
            int r5 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x0230 }
            com.clevertap.android.sdk.h1 r6 = r23.m15117U()     // Catch:{ NumberFormatException -> 0x0230 }
            java.lang.String r7 = r23.m15110N()     // Catch:{ NumberFormatException -> 0x0230 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0230 }
            r8.<init>()     // Catch:{ NumberFormatException -> 0x0230 }
            java.lang.String r11 = "Converting collapse_key: "
            r8.append(r11)     // Catch:{ NumberFormatException -> 0x0230 }
            r8.append(r15)     // Catch:{ NumberFormatException -> 0x0230 }
            java.lang.String r11 = " to notificationId int: "
            r8.append(r11)     // Catch:{ NumberFormatException -> 0x0230 }
            r8.append(r5)     // Catch:{ NumberFormatException -> 0x0230 }
            java.lang.String r8 = r8.toString()     // Catch:{ NumberFormatException -> 0x0230 }
            r6.mo12307a(r7, r8)     // Catch:{ NumberFormatException -> 0x0230 }
            goto L_0x0230
        L_0x01f3:
            r21 = r6
            r20 = r7
            goto L_0x0181
        L_0x01f8:
            r21 = r6
            r20 = r7
            r19 = r8
            goto L_0x0181
        L_0x01ff:
            r21 = r6
            r20 = r7
            r19 = r8
            goto L_0x0181
        L_0x0207:
            r21 = r6
            r20 = r7
            r19 = r8
            r22 = r11
            com.clevertap.android.sdk.h1 r6 = r23.m15117U()
            java.lang.String r7 = r23.m15110N()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Have user provided notificationId: "
            r8.append(r11)
            r8.append(r5)
            java.lang.String r11 = " won't use collapse_key (if any) as basis for notificationId"
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r6.mo12307a(r7, r8)
        L_0x0230:
            r6 = -1000(0xfffffffffffffc18, float:NaN)
            if (r5 != r6) goto L_0x0259
            double r5 = java.lang.Math.random()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r7
            int r5 = (int) r5
            com.clevertap.android.sdk.h1 r6 = r23.m15117U()
            java.lang.String r7 = r23.m15110N()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Setting random notificationId: "
            r8.append(r11)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r6.mo12307a(r7, r8)
        L_0x0259:
            if (r10 == 0) goto L_0x029a
            androidx.core.app.p$e r6 = new androidx.core.app.p$e
            r6.<init>(r2, r9)
            java.lang.String r7 = "wzrk_bi"
            r8 = 0
            java.lang.String r7 = r3.getString(r7, r8)
            if (r7 == 0) goto L_0x0274
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x0273 }
            if (r7 < 0) goto L_0x0274
            r6.mo4197a(r7)     // Catch:{ all -> 0x0273 }
            goto L_0x0274
        L_0x0273:
        L_0x0274:
            java.lang.String r7 = "wzrk_bc"
            r8 = 0
            java.lang.String r7 = r3.getString(r7, r8)
            if (r7 == 0) goto L_0x0288
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x0287 }
            if (r7 < 0) goto L_0x0288
            r6.mo4244e(r7)     // Catch:{ all -> 0x0287 }
            goto L_0x0288
        L_0x0287:
        L_0x0288:
            java.lang.String r7 = "wzrk_st"
            boolean r7 = r3.containsKey(r7)
            if (r7 == 0) goto L_0x02a0
            java.lang.String r7 = "wzrk_st"
            java.lang.String r7 = r3.getString(r7)
            r6.mo4240d(r7)
            goto L_0x02a0
        L_0x029a:
            r8 = 0
            androidx.core.app.p$e r6 = new androidx.core.app.p$e
            r6.<init>(r2)
        L_0x02a0:
            java.lang.String r7 = "wzrk_clr"
            boolean r9 = r3.containsKey(r7)
            if (r9 == 0) goto L_0x02b8
            java.lang.String r7 = r3.getString(r7)
            int r7 = android.graphics.Color.parseColor(r7)
            r6.mo4221b(r7)
            r7 = 1
            r6.mo4230b(r7)
            goto L_0x02b9
        L_0x02b8:
            r7 = 1
        L_0x02b9:
            r9 = r27
            androidx.core.app.p$e r9 = r6.mo4234c(r9)
            androidx.core.app.p$e r4 = r9.mo4228b(r4)
            androidx.core.app.p$e r4 = r4.mo4204a(r14)
            androidx.core.app.p$e r4 = r4.mo4217a(r7)
            androidx.core.app.p$e r0 = r4.mo4213a(r0)
            androidx.core.app.p$e r0 = r0.mo4249f(r13)
            r0.mo4253g(r1)
            r1 = r16
            android.graphics.Bitmap r0 = com.clevertap.android.sdk.C3238w1.m15660a(r1, r7, r2)
            r6.mo4206a(r0)
            java.lang.String r0 = "wzrk_sound"
            boolean r0 = r3.containsKey(r0)     // Catch:{ all -> 0x036f }
            if (r0 == 0) goto L_0x036d
            java.lang.String r0 = "wzrk_sound"
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x036f }
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0301
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x036f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0301
            r1 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r1)     // Catch:{ all -> 0x036f }
        L_0x02ff:
            r13 = 0
            goto L_0x0365
        L_0x0301:
            boolean r1 = r0 instanceof java.lang.String     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0363
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x036f }
            java.lang.String r1 = "true"
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0315
            r1 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r1)     // Catch:{ all -> 0x036f }
            goto L_0x02ff
        L_0x0315:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x036f }
            if (r1 != 0) goto L_0x0363
            java.lang.String r1 = ".mp3"
            boolean r1 = r0.contains(r1)     // Catch:{ all -> 0x036f }
            if (r1 != 0) goto L_0x0336
            java.lang.String r1 = ".ogg"
            boolean r1 = r0.contains(r1)     // Catch:{ all -> 0x036f }
            if (r1 != 0) goto L_0x0336
            java.lang.String r1 = ".wav"
            boolean r1 = r0.contains(r1)     // Catch:{ all -> 0x036f }
            if (r1 == 0) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r13 = 0
            goto L_0x0341
        L_0x0336:
            int r1 = r0.length()     // Catch:{ all -> 0x036f }
            int r1 = r1 + -4
            r13 = 0
            java.lang.String r0 = r0.substring(r13, r1)     // Catch:{ all -> 0x036b }
        L_0x0341:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x036b }
            r1.<init>()     // Catch:{ all -> 0x036b }
            java.lang.String r4 = "android.resource://"
            r1.append(r4)     // Catch:{ all -> 0x036b }
            java.lang.String r4 = r24.getPackageName()     // Catch:{ all -> 0x036b }
            r1.append(r4)     // Catch:{ all -> 0x036b }
            java.lang.String r4 = "/raw/"
            r1.append(r4)     // Catch:{ all -> 0x036b }
            r1.append(r0)     // Catch:{ all -> 0x036b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x036b }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x036b }
            goto L_0x0365
        L_0x0363:
            r13 = 0
            r0 = r8
        L_0x0365:
            if (r0 == 0) goto L_0x037e
            r6.mo4207a(r0)     // Catch:{ all -> 0x036b }
            goto L_0x037e
        L_0x036b:
            r0 = move-exception
            goto L_0x0371
        L_0x036d:
            r13 = 0
            goto L_0x037e
        L_0x036f:
            r0 = move-exception
            r13 = 0
        L_0x0371:
            com.clevertap.android.sdk.h1 r1 = r23.m15117U()
            java.lang.String r4 = r23.m15110N()
            java.lang.String r7 = "Could not process sound parameter"
            r1.mo12308a(r4, r7, r0)
        L_0x037e:
            java.lang.String r0 = r3.getString(r12)
            if (r0 == 0) goto L_0x03ab
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x038a }
            r1.<init>(r0)     // Catch:{ all -> 0x038a }
            goto L_0x03ac
        L_0x038a:
            r0 = move-exception
            com.clevertap.android.sdk.h1 r1 = r23.m15117U()
            java.lang.String r4 = r23.m15110N()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "error parsing notification actions: "
            r7.append(r9)
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r1.mo12307a(r4, r0)
        L_0x03ab:
            r1 = r8
        L_0x03ac:
            java.lang.Class<com.clevertap.android.sdk.m0> r0 = com.clevertap.android.sdk.C3136m0.class
            java.lang.String r4 = "com.clevertap.PUSH_EVENT"
            boolean r4 = m15198a(r2, r4, r0)
            if (r1 == 0) goto L_0x051d
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x051d
            r7 = 0
        L_0x03bd:
            int r0 = r1.length()
            if (r7 >= r0) goto L_0x051d
            org.json.JSONObject r0 = r1.getJSONObject(r7)     // Catch:{ all -> 0x04ef }
            java.lang.String r8 = "l"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ all -> 0x04ef }
            java.lang.String r9 = "dl"
            java.lang.String r9 = r0.optString(r9)     // Catch:{ all -> 0x04ef }
            r10 = r22
            java.lang.String r11 = r0.optString(r10)     // Catch:{ all -> 0x04e9 }
            java.lang.String r14 = "id"
            java.lang.String r14 = r0.optString(r14)     // Catch:{ all -> 0x04e9 }
            java.lang.String r15 = "ac"
            r13 = 1
            boolean r15 = r0.optBoolean(r15, r13)     // Catch:{ all -> 0x04e9 }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x04e9 }
            if (r0 != 0) goto L_0x04d1
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x04e9 }
            if (r0 == 0) goto L_0x03f4
            goto L_0x04d1
        L_0x03f4:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x04e9 }
            if (r0 != 0) goto L_0x0443
            android.content.res.Resources r0 = r24.getResources()     // Catch:{ all -> 0x0411 }
            java.lang.String r13 = r24.getPackageName()     // Catch:{ all -> 0x0411 }
            r26 = r1
            r1 = r21
            int r13 = r0.getIdentifier(r11, r1, r13)     // Catch:{ all -> 0x040f }
            r21 = r1
            r22 = r10
            goto L_0x0448
        L_0x040f:
            r0 = move-exception
            goto L_0x0416
        L_0x0411:
            r0 = move-exception
            r26 = r1
            r1 = r21
        L_0x0416:
            com.clevertap.android.sdk.h1 r11 = r23.m15117U()     // Catch:{ all -> 0x043e }
            java.lang.String r13 = r23.m15110N()     // Catch:{ all -> 0x043e }
            r21 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x043b }
            r1.<init>()     // Catch:{ all -> 0x043b }
            r22 = r10
            java.lang.String r10 = "unable to add notification action icon: "
            r1.append(r10)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x04cf }
            r1.append(r0)     // Catch:{ all -> 0x04cf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04cf }
            r11.mo12307a(r13, r0)     // Catch:{ all -> 0x04cf }
            goto L_0x0447
        L_0x043b:
            r0 = move-exception
            goto L_0x04ec
        L_0x043e:
            r0 = move-exception
            r21 = r1
            goto L_0x04ec
        L_0x0443:
            r26 = r1
            r22 = r10
        L_0x0447:
            r13 = 0
        L_0x0448:
            if (r15 == 0) goto L_0x044e
            if (r4 == 0) goto L_0x044e
            r0 = 1
            goto L_0x044f
        L_0x044e:
            r0 = 0
        L_0x044f:
            if (r0 == 0) goto L_0x0472
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = "com.clevertap.PUSH_EVENT"
            r1.<init>(r10)     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = r24.getPackageName()     // Catch:{ all -> 0x04cf }
            r1.setPackage(r10)     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = "ct_type"
            java.lang.String r11 = "com.clevertap.ACTION_BUTTON_CLICK"
            r1.putExtra(r10, r11)     // Catch:{ all -> 0x04cf }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x04cf }
            if (r10 != 0) goto L_0x0490
            java.lang.String r10 = "dl"
            r1.putExtra(r10, r9)     // Catch:{ all -> 0x04cf }
            goto L_0x0490
        L_0x0472:
            boolean r1 = r9.isEmpty()     // Catch:{ all -> 0x04cf }
            if (r1 != 0) goto L_0x0484
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x04cf }
            java.lang.String r10 = "android.intent.action.VIEW"
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ all -> 0x04cf }
            r1.<init>(r10, r9)     // Catch:{ all -> 0x04cf }
            goto L_0x0490
        L_0x0484:
            android.content.pm.PackageManager r1 = r24.getPackageManager()     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = r24.getPackageName()     // Catch:{ all -> 0x04cf }
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r9)     // Catch:{ all -> 0x04cf }
        L_0x0490:
            if (r1 == 0) goto L_0x04b2
            r1.putExtras(r3)     // Catch:{ all -> 0x04cf }
            r1.removeExtra(r12)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = "actionId"
            r1.putExtra(r9, r14)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = "autoCancel"
            r1.putExtra(r9, r15)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = "wzrk_c2a"
            r1.putExtra(r9, r14)     // Catch:{ all -> 0x04cf }
            java.lang.String r9 = "notificationId"
            r1.putExtra(r9, r5)     // Catch:{ all -> 0x04cf }
            r9 = 603979776(0x24000000, float:2.7755576E-17)
            r1.setFlags(r9)     // Catch:{ all -> 0x04cd }
            goto L_0x04b4
        L_0x04b2:
            r9 = 603979776(0x24000000, float:2.7755576E-17)
        L_0x04b4:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04cd }
            int r11 = (int) r10
            int r11 = r11 + r7
            if (r0 == 0) goto L_0x04c3
            r10 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r2, r11, r1, r10)     // Catch:{ all -> 0x04e7 }
            goto L_0x04c9
        L_0x04c3:
            r10 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r11, r1, r10)     // Catch:{ all -> 0x04e7 }
        L_0x04c9:
            r6.mo4201a(r13, r8, r0)     // Catch:{ all -> 0x04e7 }
            goto L_0x0516
        L_0x04cd:
            r0 = move-exception
            goto L_0x04f4
        L_0x04cf:
            r0 = move-exception
            goto L_0x04f2
        L_0x04d1:
            r26 = r1
            r22 = r10
            r9 = 603979776(0x24000000, float:2.7755576E-17)
            r10 = 134217728(0x8000000, float:3.85186E-34)
            com.clevertap.android.sdk.h1 r0 = r23.m15117U()     // Catch:{ all -> 0x04e7 }
            java.lang.String r1 = r23.m15110N()     // Catch:{ all -> 0x04e7 }
            java.lang.String r8 = "not adding push notification action: action label or id missing"
            r0.mo12307a(r1, r8)     // Catch:{ all -> 0x04e7 }
            goto L_0x0516
        L_0x04e7:
            r0 = move-exception
            goto L_0x04f6
        L_0x04e9:
            r0 = move-exception
            r26 = r1
        L_0x04ec:
            r22 = r10
            goto L_0x04f2
        L_0x04ef:
            r0 = move-exception
            r26 = r1
        L_0x04f2:
            r9 = 603979776(0x24000000, float:2.7755576E-17)
        L_0x04f4:
            r10 = 134217728(0x8000000, float:3.85186E-34)
        L_0x04f6:
            com.clevertap.android.sdk.h1 r1 = r23.m15117U()
            java.lang.String r8 = r23.m15110N()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "error adding notification action : "
            r11.append(r13)
            java.lang.String r0 = r0.getLocalizedMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r1.mo12307a(r8, r0)
        L_0x0516:
            int r7 = r7 + 1
            r1 = r26
            r13 = 0
            goto L_0x03bd
        L_0x051d:
            android.app.Notification r0 = r6.mo4196a()
            r7 = r20
            r7.notify(r5, r0)
            com.clevertap.android.sdk.h1 r1 = r23.m15117U()
            java.lang.String r4 = r23.m15110N()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Rendered notification: "
            r5.append(r6)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.mo12307a(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 345600000(0x14997000, double:1.70749087E-315)
            long r4 = r4 + r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r0.append(r4)
            r1 = r19
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "wzrk_ttl"
            java.lang.String r0 = r3.getString(r4, r0)
            long r4 = java.lang.Long.parseLong(r0)
            java.lang.String r6 = "wzrk_pid"
            java.lang.String r6 = r3.getString(r6)
            com.clevertap.android.sdk.r0 r2 = r23.m15354s(r24)
            com.clevertap.android.sdk.h1 r7 = r23.m15117U()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Storing Push Notification..."
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = " - with ttl - "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7.mo12314c(r0)
            r2.mo12562a(r6, r4)
            java.lang.String r0 = "wzrk_rnv"
            java.lang.String r0 = r3.getString(r0, r1)
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x05d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Recording of Notification Viewed is disabled in the CleverTap Dashboard for notification payload: "
            r0.append(r1)
            java.lang.String r1 = r25.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.clevertap.android.sdk.h1 r1 = r23.m15117U()
            r1.mo12306a(r0)
            com.clevertap.android.sdk.x1 r1 = new com.clevertap.android.sdk.x1
            r2 = 512(0x200, float:7.175E-43)
            r1.<init>(r2, r0)
            r2 = r23
            r2.m15236b(r1)
            return
        L_0x05d0:
            r2 = r23
            r2.mo12469c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.m15153a(android.content.Context, android.os.Bundle, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: a */
    private static boolean m15198a(Context context, String str, Class cls) {
        int size = context.getPackageManager().queryIntentServices(new Intent(str), 0).size();
        String str2 = "";
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(cls.getName());
            sb.append(" is available");
            C3111h1.m14938f(sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(cls.getName());
        sb2.append(" is NOT available");
        C3111h1.m14938f(sb2.toString());
        return false;
    }

    /* renamed from: a */
    public static void m15162a(Context context, String str, CharSequence charSequence, String str2, int i, boolean z) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                C3161d0 d0Var = new C3161d0(context, str, charSequence, i, str2, z, n);
                n.m15188a("createNotificationChannel", (Runnable) d0Var);
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure creating Notification Channel", th);
        }
    }

    /* renamed from: a */
    public static void m15160a(Context context, String str, CharSequence charSequence, String str2, int i, String str3, boolean z) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                C3163e0 e0Var = new C3163e0(context, str, charSequence, i, str2, str3, z, n);
                n.m15188a("creatingNotificationChannel", (Runnable) e0Var);
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure creating Notification Channel", th);
        }
    }

    /* renamed from: a */
    public static void m15163a(Context context, String str, CharSequence charSequence, String str2, int i, boolean z, String str3) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                C3165f0 f0Var = new C3165f0(context, str3, n, str, charSequence, i, str2, z);
                n.m15188a("createNotificationChannel", (Runnable) f0Var);
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure creating Notification Channel", th);
        }
    }

    /* renamed from: a */
    public static void m15161a(Context context, String str, CharSequence charSequence, String str2, int i, String str3, boolean z, String str4) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                C3169h0 h0Var = new C3169h0(context, str4, n, str, charSequence, i, str2, str3, z);
                n.m15188a("creatingNotificationChannel", (Runnable) h0Var);
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure creating Notification Channel", th);
        }
    }

    /* renamed from: a */
    public static void m15159a(Context context, String str, CharSequence charSequence) {
        C3150p0 n = m15334n(context);
        if (n == null) {
            C3111h1.m14938f("No CleverTap Instance found in CleverTapAPI#createNotificationChannelGroup");
            return;
        }
        try {
            if (VERSION.SDK_INT >= 26) {
                n.m15188a("creatingNotificationChannelGroup", (Runnable) new C3171i0(context, str, charSequence, n));
            }
        } catch (Throwable th) {
            n.m15117U().mo12316c(n.m15110N(), "Failure creating Notification Channel Group", th);
        }
    }

    /* renamed from: a */
    static void m15150a(Context context, Intent intent) {
        HashMap<String, C3150p0> hashMap = f11235W0;
        if (hashMap == null) {
            C3111h1.m14938f("No CleverTap Instance found");
            C3150p0 m = m15330m(context);
            if (m != null) {
                m.mo12432a(intent);
            }
            return;
        }
        for (String str : hashMap.keySet()) {
            C3150p0 p0Var = (C3150p0) f11235W0.get(str);
            if (p0Var != null) {
                p0Var.mo12432a(intent);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12432a(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "referrer"
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x008c
            boolean r1 = r5.containsKey(r0)     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x0010
            goto L_0x008c
        L_0x0010:
            java.lang.String r5 = r5.getString(r0)     // Catch:{  }
            java.lang.String r0 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r0)     // Catch:{  }
            com.clevertap.android.sdk.h1 r0 = r4.m15117U()     // Catch:{  }
            java.lang.String r1 = r4.m15110N()     // Catch:{  }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
            r2.<init>()     // Catch:{  }
            java.lang.String r3 = "Referrer received: "
            r2.append(r3)     // Catch:{  }
            r2.append(r5)     // Catch:{  }
            java.lang.String r2 = r2.toString()     // Catch:{  }
            r0.mo12315c(r1, r2)     // Catch:{  }
            if (r5 != 0) goto L_0x0039
            return
        L_0x0039:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008c }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r1 = (int) r0     // Catch:{ all -> 0x008c }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f11297t0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0069
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f11297t0     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x008c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x008c }
            int r0 = r1 - r0
            r2 = 10
            if (r0 >= r2) goto L_0x0069
            com.clevertap.android.sdk.h1 r5 = r4.m15117U()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r4.m15110N()     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "Skipping install referrer due to duplicate within 10 seconds"
            r5.mo12315c(r0, r1)     // Catch:{ all -> 0x008c }
            return
        L_0x0069:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f11297t0     // Catch:{ all -> 0x008c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008c }
            r0.put(r5, r1)     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "wzrk://track?install=true&"
            r0.append(r1)     // Catch:{ all -> 0x008c }
            r0.append(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x008c }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x008c }
            r0 = 1
            r4.m15169a(r5, r0)     // Catch:{ all -> 0x008c }
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.mo12432a(android.content.Intent):void");
    }

    /* renamed from: a */
    public synchronized void mo12446a(String str, String str2, String str3) {
        if (str != null || str2 != null || str3 != null) {
            try {
                if (C3217s1.m15522a(this.f11261O, "app_install_status", 0) != 0) {
                    C3111h1.m14930d("Install referrer has already been set. Will not override it");
                    return;
                }
                C3217s1.m15532b(this.f11261O, "app_install_status", 1);
                if (str != null) {
                    str = Uri.encode(str);
                }
                if (str2 != null) {
                    str2 = Uri.encode(str2);
                }
                if (str3 != null) {
                    str3 = Uri.encode(str3);
                }
                String str4 = "wzrk://track?install=true";
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("&utm_source=");
                    sb.append(str);
                    str4 = sb.toString();
                }
                if (str2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append("&utm_medium=");
                    sb2.append(str2);
                    str4 = sb2.toString();
                }
                if (str3 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append("&utm_campaign=");
                    sb3.append(str3);
                    str4 = sb3.toString();
                }
                m15169a(Uri.parse(str4), true);
            } catch (Throwable th) {
                C3111h1.m14941f("Failed to push install referrer", th);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: a */
    public void mo12433a(Location location) {
        m15258c(location);
    }

    /* renamed from: a */
    private void m15193a(JSONArray jSONArray) {
        synchronized (this.f11256K0) {
            if (this.f11255J0 == null) {
                m15376x();
            }
            if (this.f11255J0 != null && this.f11255J0.mo12253a(jSONArray)) {
                m15386z();
            }
        }
    }

    /* renamed from: a */
    public void mo12439a(C3110h0 h0Var) {
        this.f11257L0 = h0Var;
    }

    /* renamed from: a */
    public void mo12436a(CTInboxMessage cTInboxMessage) {
        m15188a("deleteInboxMessage", (Runnable) new C3179m0(cTInboxMessage));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = m15118V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0.startActivity(r4);
        com.clevertap.android.sdk.C3111h1.m14930d("Displaying Notification Inbox");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        throw new java.lang.IllegalStateException("Current activity reference not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        com.clevertap.android.sdk.C3111h1.m14941f("Please verify the integration of your app. It is not setup to support Notification Inbox yet.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = new com.clevertap.android.sdk.CTInboxStyleConfig(r4);
        r4 = new android.content.Intent(r3.f11261O, com.clevertap.android.sdk.CTInboxActivity.class);
        r4.putExtra("styleConfig", r0);
        r4.putExtra("config", r3.f11265Q);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12437a(com.clevertap.android.sdk.CTInboxStyleConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11256K0
            monitor-enter(r0)
            com.clevertap.android.sdk.f0 r1 = r3.f11255J0     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0016
            com.clevertap.android.sdk.h1 r4 = r3.m15117U()     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r3.m15110N()     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "Notification Inbox not initialized"
            r4.mo12307a(r1, r2)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            com.clevertap.android.sdk.CTInboxStyleConfig r0 = new com.clevertap.android.sdk.CTInboxStyleConfig
            r0.<init>(r4)
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r1 = r3.f11261O
            java.lang.Class<com.clevertap.android.sdk.CTInboxActivity> r2 = com.clevertap.android.sdk.CTInboxActivity.class
            r4.<init>(r1, r2)
            java.lang.String r1 = "styleConfig"
            r4.putExtra(r1, r0)
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r3.f11265Q
            java.lang.String r1 = "config"
            r4.putExtra(r1, r0)
            android.app.Activity r0 = m15118V()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            r0.startActivity(r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "Displaying Notification Inbox"
            com.clevertap.android.sdk.C3111h1.m14930d(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x004e
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Current activity reference not found"
            r4.<init>(r0)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r4 = move-exception
            java.lang.String r0 = "Please verify the integration of your app. It is not setup to support Notification Inbox yet."
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r4)
        L_0x004e:
            return
        L_0x004f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3150p0.mo12437a(com.clevertap.android.sdk.CTInboxStyleConfig):void");
    }

    /* renamed from: a */
    public void mo12008a(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle) {
        m15188a("handleMessageDidShow", (Runnable) new C3183o0(cTInboxMessage, bundle));
    }

    /* renamed from: a */
    private void m15149a(Context context, JobParameters jobParameters) {
        m15188a("runningJobService", (Runnable) new C3185p0(context, jobParameters));
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    private static JobInfo m15126a(int i, JobScheduler jobScheduler) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            if (jobInfo.getId() == i) {
                return jobInfo;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15203a(Date date, Date date2, Date date3) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date3);
        Calendar instance3 = Calendar.getInstance();
        instance3.setTime(date2);
        if (date2.compareTo(date) < 0) {
            if (instance2.compareTo(instance3) < 0) {
                instance2.add(5, 1);
            }
            instance3.add(5, 1);
        }
        if (instance2.compareTo(instance) < 0 || instance2.compareTo(instance3) >= 0) {
            return false;
        }
        return true;
    }
}
