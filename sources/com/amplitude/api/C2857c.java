package com.amplitude.api;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Pair;
import com.google.common.base.C5785c;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p468g.C13876z;

/* renamed from: com.amplitude.api.c */
/* compiled from: AmplitudeClient */
public class C2857c {

    /* renamed from: O */
    public static final String f9992O = "com.amplitude.api.AmplitudeClient";

    /* renamed from: P */
    public static final String f9993P = "session_start";

    /* renamed from: Q */
    public static final String f9994Q = "session_end";

    /* renamed from: R */
    public static final String f9995R = "device_id";

    /* renamed from: S */
    public static final String f9996S = "user_id";

    /* renamed from: T */
    public static final String f9997T = "opt_out";

    /* renamed from: U */
    public static final String f9998U = "sequence_number";

    /* renamed from: V */
    public static final String f9999V = "last_event_time";

    /* renamed from: W */
    public static final String f10000W = "last_event_id";

    /* renamed from: X */
    public static final String f10001X = "last_identify_id";

    /* renamed from: Y */
    public static final String f10002Y = "previous_session_id";
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final C2875d f10003Z = C2875d.m13566a();

    /* renamed from: A */
    private long f10004A;

    /* renamed from: B */
    private long f10005B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f10006C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f10007D;

    /* renamed from: E */
    private boolean f10008E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f10009F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f10010G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f10011H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public AtomicBoolean f10012I;

    /* renamed from: J */
    AtomicBoolean f10013J;

    /* renamed from: K */
    Throwable f10014K;

    /* renamed from: L */
    String f10015L;

    /* renamed from: M */
    C2893o f10016M;

    /* renamed from: N */
    C2893o f10017N;

    /* renamed from: a */
    protected Context f10018a;

    /* renamed from: b */
    protected C13876z f10019b;

    /* renamed from: c */
    protected C2877f f10020c;

    /* renamed from: d */
    protected String f10021d;

    /* renamed from: e */
    protected String f10022e;

    /* renamed from: f */
    protected String f10023f;

    /* renamed from: g */
    protected String f10024g;

    /* renamed from: h */
    private boolean f10025h;

    /* renamed from: i */
    private boolean f10026i;

    /* renamed from: j */
    protected boolean f10027j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f10028k;

    /* renamed from: l */
    private boolean f10029l;

    /* renamed from: m */
    C2891m f10030m;

    /* renamed from: n */
    JSONObject f10031n;

    /* renamed from: o */
    protected String f10032o;

    /* renamed from: p */
    long f10033p;

    /* renamed from: q */
    long f10034q;

    /* renamed from: r */
    long f10035r;

    /* renamed from: s */
    long f10036s;

    /* renamed from: t */
    long f10037t;

    /* renamed from: u */
    long f10038u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C2879h f10039v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f10040w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f10041x;

    /* renamed from: y */
    private int f10042y;

    /* renamed from: z */
    private long f10043z;

    /* renamed from: com.amplitude.api.c$a */
    /* compiled from: AmplitudeClient */
    class C2858a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ String f10044N;

        /* renamed from: O */
        final /* synthetic */ String f10045O;

        /* renamed from: P */
        final /* synthetic */ C2857c f10046P;

        /* renamed from: a */
        final /* synthetic */ Context f10048a;

        /* renamed from: b */
        final /* synthetic */ boolean f10049b;

        /* renamed from: com.amplitude.api.c$a$a */
        /* compiled from: AmplitudeClient */
        class C2859a implements C2878g {
            C2859a() {
            }

            /* renamed from: a */
            public void mo11268a(SQLiteDatabase sQLiteDatabase) {
                C2858a aVar = C2858a.this;
                String str = "store";
                C2857c.this.f10020c.mo11305a(sQLiteDatabase, str, "device_id", aVar.f10046P.f10024g);
                C2858a aVar2 = C2858a.this;
                C2857c.this.f10020c.mo11305a(sQLiteDatabase, str, "user_id", aVar2.f10046P.f10023f);
                C2858a aVar3 = C2858a.this;
                C2877f fVar = C2857c.this.f10020c;
                String str2 = "long_store";
                fVar.mo11305a(sQLiteDatabase, str2, C2857c.f9997T, Long.valueOf(aVar3.f10046P.f10028k ? 1 : 0));
                C2858a aVar4 = C2858a.this;
                C2857c.this.f10020c.mo11305a(sQLiteDatabase, str2, C2857c.f10002Y, Long.valueOf(aVar4.f10046P.f10033p));
                C2858a aVar5 = C2858a.this;
                C2857c.this.f10020c.mo11305a(sQLiteDatabase, str2, C2857c.f9999V, Long.valueOf(aVar5.f10046P.f10037t));
            }
        }

        C2858a(Context context, boolean z, String str, String str2, C2857c cVar) {
            this.f10048a = context;
            this.f10049b = z;
            this.f10044N = str;
            this.f10045O = str2;
            this.f10046P = cVar;
        }

        public void run() {
            C2857c cVar = C2857c.this;
            if (!cVar.f10027j) {
                try {
                    if (cVar.f10022e.equals(C2876e.f10132i)) {
                        C2857c.m13453a(this.f10048a);
                        C2857c.m13457b(this.f10048a);
                    }
                    C2857c.this.f10019b = new C13876z();
                    C2857c.this.f10039v = new C2879h(this.f10048a);
                    C2857c.this.f10024g = C2857c.this.m13479v();
                    if (this.f10049b) {
                        C2882i.m13675c().mo11351a(C2857c.this.f10019b, this.f10044N, C2857c.this.f10024g);
                    }
                    C2857c.this.f10039v.mo11348p();
                    String str = "user_id";
                    if (this.f10045O != null) {
                        this.f10046P.f10023f = this.f10045O;
                        C2857c.this.f10020c.mo11322c(str, this.f10045O);
                    } else {
                        this.f10046P.f10023f = C2857c.this.f10020c.mo11326d(str);
                    }
                    Long c = C2857c.this.f10020c.mo11323c(C2857c.f9997T);
                    C2857c.this.f10028k = c != null && c.longValue() == 1;
                    C2857c.this.f10038u = C2857c.this.m13445a(C2857c.f10002Y, -1);
                    if (C2857c.this.f10038u >= 0) {
                        C2857c.this.f10033p = C2857c.this.f10038u;
                    }
                    C2857c.this.f10034q = C2857c.this.m13445a(C2857c.f9998U, 0);
                    C2857c.this.f10035r = C2857c.this.m13445a(C2857c.f10000W, -1);
                    C2857c.this.f10036s = C2857c.this.m13445a(C2857c.f10001X, -1);
                    C2857c.this.f10037t = C2857c.this.m13445a(C2857c.f9999V, -1);
                    C2857c.this.f10020c.mo11313a((C2878g) new C2859a());
                    C2857c.this.f10027j = true;
                } catch (CursorWindowAllocationException e) {
                    C2857c.f10003Z.mo11292b(C2857c.f9992O, String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e.getMessage()}));
                    C2882i.m13675c().mo11353a("Failed to initialize Amplitude SDK", e);
                    this.f10046P.f10021d = null;
                }
            }
        }
    }

    /* renamed from: com.amplitude.api.c$b */
    /* compiled from: AmplitudeClient */
    class C2860b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2857c f10051a;

        C2860b(C2857c cVar) {
            this.f10051a = cVar;
        }

        public void run() {
            if (!C2892n.m13815a(this.f10051a.f10021d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C2879h.m13627q());
                sb.append("R");
                C2857c.this.mo11236d(sb.toString());
            }
        }
    }

    /* renamed from: com.amplitude.api.c$c */
    /* compiled from: AmplitudeClient */
    class C2861c implements Runnable {
        C2861c() {
        }

        public void run() {
            if (!C2892n.m13815a(C2857c.this.f10021d)) {
                C2857c.this.mo11263o();
            }
        }
    }

    /* renamed from: com.amplitude.api.c$d */
    /* compiled from: AmplitudeClient */
    class C2862d implements Runnable {
        C2862d() {
        }

        public void run() {
            C2857c.this.f10012I.set(false);
            C2857c.this.mo11263o();
        }
    }

    /* renamed from: com.amplitude.api.c$e */
    /* compiled from: AmplitudeClient */
    class C2863e implements Runnable {

        /* renamed from: N */
        final /* synthetic */ long f10055N;

        /* renamed from: a */
        final /* synthetic */ String f10057a;

        /* renamed from: b */
        final /* synthetic */ long f10058b;

        C2863e(String str, long j, long j2) {
            this.f10057a = str;
            this.f10058b = j;
            this.f10055N = j2;
        }

        public void run() {
            C2857c cVar = C2857c.this;
            cVar.mo11201a(cVar.f10019b, this.f10057a, this.f10058b, this.f10055N);
        }
    }

    /* renamed from: com.amplitude.api.c$f */
    /* compiled from: AmplitudeClient */
    class C2864f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f10060a;

        /* renamed from: b */
        final /* synthetic */ long f10061b;

        /* renamed from: com.amplitude.api.c$f$a */
        /* compiled from: AmplitudeClient */
        class C2865a implements Runnable {
            C2865a() {
            }

            public void run() {
                C2857c cVar = C2857c.this;
                cVar.mo11251g(cVar.f10006C);
            }
        }

        C2864f(long j, long j2) {
            this.f10060a = j;
            this.f10061b = j2;
        }

        public void run() {
            long j = this.f10060a;
            if (j >= 0) {
                C2857c.this.f10020c.mo11327d(j);
            }
            long j2 = this.f10061b;
            if (j2 >= 0) {
                C2857c.this.f10020c.mo11329f(j2);
            }
            C2857c.this.f10013J.set(false);
            if (C2857c.this.f10020c.mo11325d() > ((long) C2857c.this.f10040w)) {
                C2857c.this.f10016M.mo11478a(new C2865a());
                return;
            }
            C2857c.this.f10006C = false;
            C2857c cVar = C2857c.this;
            cVar.f10007D = cVar.f10041x;
        }
    }

    /* renamed from: com.amplitude.api.c$g */
    /* compiled from: AmplitudeClient */
    class C2866g implements Runnable {
        C2866g() {
        }

        public void run() {
            C2857c.this.f10013J.set(false);
            C2857c.this.mo11251g(true);
        }
    }

    /* renamed from: com.amplitude.api.c$h */
    /* compiled from: AmplitudeClient */
    class C2867h implements Runnable {
        C2867h() {
        }

        public void run() {
            if (C2857c.this.f10039v != null) {
                C2857c.this.f10039v.mo11333a(true);
                return;
            }
            throw new IllegalStateException("Must initialize before acting on location listening.");
        }
    }

    /* renamed from: com.amplitude.api.c$i */
    /* compiled from: AmplitudeClient */
    class C2868i implements Runnable {
        C2868i() {
        }

        public void run() {
            if (C2857c.this.f10039v != null) {
                C2857c.this.f10039v.mo11333a(false);
                return;
            }
            throw new IllegalStateException("Must initialize before acting on location listening.");
        }
    }

    /* renamed from: com.amplitude.api.c$j */
    /* compiled from: AmplitudeClient */
    class C2869j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2857c f10067a;

        /* renamed from: b */
        final /* synthetic */ boolean f10068b;

        C2869j(C2857c cVar, boolean z) {
            this.f10067a = cVar;
            this.f10068b = z;
        }

        public void run() {
            if (!C2892n.m13815a(C2857c.this.f10021d)) {
                this.f10067a.f10028k = this.f10068b;
                C2857c.this.f10020c.mo11307a(C2857c.f9997T, Long.valueOf(this.f10068b ? 1 : 0));
            }
        }
    }

    /* renamed from: com.amplitude.api.c$k */
    /* compiled from: AmplitudeClient */
    class C2870k implements Runnable {

        /* renamed from: N */
        final /* synthetic */ JSONObject f10069N;

        /* renamed from: O */
        final /* synthetic */ JSONObject f10070O;

        /* renamed from: P */
        final /* synthetic */ JSONObject f10071P;

        /* renamed from: Q */
        final /* synthetic */ JSONObject f10072Q;

        /* renamed from: R */
        final /* synthetic */ long f10073R;

        /* renamed from: S */
        final /* synthetic */ boolean f10074S;

        /* renamed from: a */
        final /* synthetic */ String f10076a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f10077b;

        C2870k(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
            this.f10076a = str;
            this.f10077b = jSONObject;
            this.f10069N = jSONObject2;
            this.f10070O = jSONObject3;
            this.f10071P = jSONObject4;
            this.f10072Q = jSONObject5;
            this.f10073R = j;
            this.f10074S = z;
        }

        public void run() {
            if (!C2892n.m13815a(C2857c.this.f10021d)) {
                C2857c.this.mo11182a(this.f10076a, this.f10077b, this.f10069N, this.f10070O, this.f10071P, this.f10072Q, this.f10073R, this.f10074S);
            }
        }
    }

    /* renamed from: com.amplitude.api.c$l */
    /* compiled from: AmplitudeClient */
    class C2871l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f10078a;

        C2871l(long j) {
            this.f10078a = j;
        }

        public void run() {
            if (!C2892n.m13815a(C2857c.this.f10021d)) {
                C2857c.this.mo11232c(this.f10078a);
                C2857c.this.f10010G = false;
                if (C2857c.this.f10011H) {
                    C2857c.this.mo11263o();
                }
                C2857c cVar = C2857c.this;
                cVar.f10020c.mo11322c("device_id", cVar.f10024g);
                C2857c cVar2 = C2857c.this;
                cVar2.f10020c.mo11322c("user_id", cVar2.f10023f);
                C2857c cVar3 = C2857c.this;
                cVar3.f10020c.mo11307a(C2857c.f9997T, Long.valueOf(cVar3.f10028k ? 1 : 0));
                C2857c cVar4 = C2857c.this;
                cVar4.f10020c.mo11307a(C2857c.f10002Y, Long.valueOf(cVar4.f10033p));
                C2857c cVar5 = C2857c.this;
                cVar5.f10020c.mo11307a(C2857c.f9999V, Long.valueOf(cVar5.f10037t));
            }
        }
    }

    /* renamed from: com.amplitude.api.c$m */
    /* compiled from: AmplitudeClient */
    class C2872m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f10080a;

        C2872m(long j) {
            this.f10080a = j;
        }

        public void run() {
            if (!C2892n.m13815a(C2857c.this.f10021d)) {
                C2857c.this.mo11258j(this.f10080a);
                C2857c.this.f10010G = true;
            }
        }
    }

    /* renamed from: com.amplitude.api.c$n */
    /* compiled from: AmplitudeClient */
    class C2873n implements Runnable {

        /* renamed from: N */
        final /* synthetic */ String f10082N;

        /* renamed from: a */
        final /* synthetic */ C2857c f10084a;

        /* renamed from: b */
        final /* synthetic */ boolean f10085b;

        C2873n(C2857c cVar, boolean z, String str) {
            this.f10084a = cVar;
            this.f10085b = z;
            this.f10082N = str;
        }

        public void run() {
            if (!C2892n.m13815a(this.f10084a.f10021d)) {
                if (this.f10085b && C2857c.this.f10009F) {
                    C2857c.this.m13469i(C2857c.f9994Q);
                }
                C2857c cVar = this.f10084a;
                String str = this.f10082N;
                cVar.f10023f = str;
                C2857c.this.f10020c.mo11322c("user_id", str);
                if (this.f10085b) {
                    long f = C2857c.this.mo11244f();
                    C2857c.this.m13473l(f);
                    C2857c.this.mo11232c(f);
                    if (C2857c.this.f10009F) {
                        C2857c.this.m13469i(C2857c.f9993P);
                    }
                }
            }
        }
    }

    /* renamed from: com.amplitude.api.c$o */
    /* compiled from: AmplitudeClient */
    class C2874o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2857c f10087a;

        /* renamed from: b */
        final /* synthetic */ String f10088b;

        C2874o(C2857c cVar, String str) {
            this.f10087a = cVar;
            this.f10088b = str;
        }

        public void run() {
            if (!C2892n.m13815a(this.f10087a.f10021d)) {
                C2857c cVar = this.f10087a;
                String str = this.f10088b;
                cVar.f10024g = str;
                C2857c.this.m13467h(str);
            }
        }
    }

    public C2857c() {
        this(null);
    }

    /* renamed from: t */
    private Set<String> mo11429t() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    /* renamed from: u */
    private boolean m13478u() {
        return this.f10033p >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public String m13479v() {
        Set t = mo11429t();
        String str = "device_id";
        String d = this.f10020c.mo11326d(str);
        String a = C2892n.m13812a(this.f10018a, this.f10022e, str);
        if (!C2892n.m13815a(d) && !t.contains(d)) {
            if (!d.equals(a)) {
                m13467h(d);
            }
            return d;
        } else if (C2892n.m13815a(a) || t.contains(a)) {
            if (!this.f10025h && this.f10026i && !this.f10039v.mo11346n()) {
                String a2 = this.f10039v.mo11332a();
                if (!C2892n.m13815a(a2) && !t.contains(a2)) {
                    m13467h(a2);
                    return a2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C2879h.m13627q());
            sb.append("R");
            String sb2 = sb.toString();
            m13467h(sb2);
            return sb2;
        } else {
            m13467h(a);
            return a;
        }
    }

    /* renamed from: j */
    public boolean mo11258j(long j) {
        if (m13478u()) {
            if (m13472k(j)) {
                mo11232c(j);
                return false;
            }
            m13474m(j);
            return true;
        } else if (m13472k(j)) {
            long j2 = this.f10038u;
            if (j2 == -1) {
                m13474m(j);
                return true;
            }
            m13473l(j2);
            mo11232c(j);
            return false;
        } else {
            m13474m(j);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo11259k() {
        return this.f10010G;
    }

    /* renamed from: l */
    public boolean mo11260l() {
        return this.f10028k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo11261m() {
        return this.f10008E;
    }

    /* renamed from: n */
    public C2857c mo11262n() {
        if (!mo11215a("regenerateDeviceId()")) {
            return this;
        }
        mo11202a((Runnable) new C2860b(this));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo11263o() {
        mo11251g(false);
        C2882i.m13675c().mo11355b();
    }

    /* renamed from: p */
    public void mo11264p() {
        if (mo11215a("uploadEvents()")) {
            this.f10016M.mo11478a(new C2861c());
        }
    }

    /* renamed from: q */
    public C2857c mo11265q() {
        this.f10026i = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo11266r() {
        this.f10008E = true;
    }

    public C2857c(String str) {
        this.f10025h = false;
        this.f10026i = false;
        this.f10027j = false;
        this.f10028k = false;
        this.f10029l = false;
        this.f10030m = new C2891m();
        this.f10033p = -1;
        this.f10034q = 0;
        this.f10035r = -1;
        this.f10036s = -1;
        this.f10037t = -1;
        this.f10038u = -1;
        this.f10040w = 30;
        this.f10041x = 50;
        this.f10042y = 1000;
        this.f10043z = C2876e.f10137n;
        this.f10004A = C2876e.f10138o;
        this.f10005B = C2876e.f10139p;
        this.f10006C = false;
        this.f10007D = this.f10041x;
        this.f10008E = false;
        this.f10009F = false;
        this.f10010G = false;
        this.f10011H = true;
        this.f10012I = new AtomicBoolean(false);
        this.f10013J = new AtomicBoolean(false);
        this.f10015L = C2876e.f10124d;
        this.f10016M = new C2893o("logThread");
        this.f10017N = new C2893o("httpThread");
        this.f10022e = C2892n.m13817b(str);
        this.f10016M.start();
        this.f10017N.start();
    }

    /* renamed from: k */
    private boolean m13472k(long j) {
        return j - this.f10037t < (this.f10008E ? this.f10004A : this.f10005B);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m13473l(long j) {
        this.f10033p = j;
        mo11254h(j);
    }

    /* renamed from: m */
    private void m13474m(long j) {
        if (this.f10009F) {
            m13469i(f9994Q);
        }
        m13473l(j);
        mo11232c(j);
        if (this.f10009F) {
            m13469i(f9993P);
        }
    }

    /* renamed from: d */
    public C2857c mo11234d() {
        if (!mo11215a("enableDiagnosticLogging")) {
            return this;
        }
        C2882i.m13675c().mo11351a(this.f10019b, this.f10021d, this.f10024g);
        return this;
    }

    /* renamed from: e */
    public C2857c mo11239e() {
        mo11202a((Runnable) new C2867h());
        return this;
    }

    /* renamed from: f */
    public C2857c mo11245f(int i) {
        f10003Z.mo11288a(i);
        return this;
    }

    /* renamed from: g */
    public C2857c mo11249g(long j) {
        this.f10004A = j;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public long mo11253h() {
        this.f10034q++;
        this.f10020c.mo11307a(f9998U, Long.valueOf(this.f10034q));
        return this.f10034q;
    }

    /* renamed from: i */
    public C2857c mo11256i(long j) {
        this.f10005B = j;
        return this;
    }

    /* renamed from: n */
    private void m13475n(long j) {
        if (!this.f10012I.getAndSet(true)) {
            this.f10016M.mo11479a(new C2862d(), j);
        }
    }

    /* renamed from: c */
    public C2857c mo11229c() {
        mo11202a((Runnable) new C2868i());
        return this;
    }

    /* renamed from: e */
    public C2857c mo11240e(int i) {
        this.f10040w = i;
        return this;
    }

    /* renamed from: f */
    public C2857c mo11247f(boolean z) {
        this.f10009F = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo11252g(String str) {
        if (!C2892n.m13815a(str)) {
            return mo11215a("logEvent()");
        }
        f10003Z.mo11292b(f9992O, "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    /* renamed from: i */
    public long mo11255i() {
        return this.f10033p;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m13469i(String str) {
        if (mo11215a(String.format("sendSessionEvent('%s')", new Object[]{str})) && m13478u()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                mo11182a(str, null, jSONObject, null, null, null, this.f10037t, false);
            } catch (JSONException e) {
                C2882i.m13675c().mo11353a(String.format("Failed to generate API Properties JSON for session event %s", new Object[]{str}), e);
            }
        }
    }

    /* renamed from: b */
    public C2857c mo11216b() {
        C2882i.m13675c().mo11349a();
        return this;
    }

    /* renamed from: c */
    public C2857c mo11230c(int i) {
        this.f10041x = i;
        this.f10007D = i;
        return this;
    }

    /* renamed from: d */
    public C2857c mo11235d(int i) {
        this.f10043z = (long) i;
        return this;
    }

    /* renamed from: e */
    public C2857c mo11241e(String str) {
        if (!C2892n.m13815a(str)) {
            this.f10015L = str;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo11248f(long j) {
        this.f10036s = j;
        this.f10020c.mo11307a(f10001X, Long.valueOf(j));
    }

    /* renamed from: b */
    public C2857c mo11218b(boolean z) {
        this.f10025h = z;
        return this;
    }

    /* renamed from: d */
    public C2857c mo11237d(boolean z) {
        this.f10029l = z;
        if (!z) {
            mo11264p();
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo11254h(long j) {
        this.f10038u = j;
        this.f10020c.mo11307a(f10002Y, Long.valueOf(j));
    }

    /* renamed from: b */
    public C2857c mo11217b(int i) {
        this.f10042y = i;
        return this;
    }

    /* renamed from: c */
    public C2857c mo11231c(boolean z) {
        this.f10011H = z;
        return this;
    }

    /* renamed from: e */
    public C2857c mo11242e(boolean z) {
        if (!mo11215a("setOptOut()")) {
            return this;
        }
        mo11202a((Runnable) new C2869j(this, z));
        return this;
    }

    /* renamed from: f */
    public C2857c mo11246f(String str) {
        return mo11190a(str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11251g(boolean z) {
        String str = "Failed to update server";
        String str2 = f9992O;
        if (!this.f10028k && !this.f10029l && !this.f10013J.getAndSet(true)) {
            long min = Math.min((long) (z ? this.f10007D : this.f10041x), this.f10020c.mo11325d());
            if (min <= 0) {
                this.f10013J.set(false);
                return;
            }
            try {
                Pair a = mo11183a(this.f10020c.mo11311a(this.f10035r, min), this.f10020c.mo11320b(this.f10036s, min), min);
                if (((JSONArray) a.second).length() == 0) {
                    this.f10013J.set(false);
                    return;
                }
                long longValue = ((Long) ((Pair) a.first).first).longValue();
                long longValue2 = ((Long) ((Pair) a.first).second).longValue();
                String jSONArray = ((JSONArray) a.second).toString();
                C2893o oVar = this.f10017N;
                C2863e eVar = new C2863e(jSONArray, longValue, longValue2);
                oVar.mo11478a(eVar);
            } catch (JSONException e) {
                this.f10013J.set(false);
                f10003Z.mo11292b(str2, e.toString());
                C2882i.m13675c().mo11353a(str, e);
            } catch (CursorWindowAllocationException e2) {
                this.f10013J.set(false);
                f10003Z.mo11292b(str2, String.format("Caught Cursor window exception during event upload, deferring upload: %s", new Object[]{e2.getMessage()}));
                C2882i.m13675c().mo11353a(str, e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m13467h(String str) {
        String str2 = "device_id";
        this.f10020c.mo11322c(str2, str);
        C2892n.m13814a(this.f10018a, this.f10022e, str2, str);
    }

    /* renamed from: b */
    public void mo11221b(String str) {
        mo11208a(str, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo11233c(String str) {
        mo11222b(str, (JSONObject) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11238d(long j) {
        this.f10035r = j;
        this.f10020c.mo11307a(f10000W, Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo11244f() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public C2857c mo11186a(Context context, String str) {
        return mo11187a(context, str, (String) null);
    }

    /* renamed from: b */
    public void mo11222b(String str, JSONObject jSONObject) {
        mo11227b(str, jSONObject, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo11228c(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (C2892n.m13815a(jSONObject2)) {
            f10003Z.mo11292b(f9992O, String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        String str2 = C2876e.f10092A;
        boolean equals = str.equals(str2);
        String str3 = C2876e.f10093B;
        if (equals || str.equals(str3)) {
            this.f10036s = this.f10020c.mo11318b(jSONObject2);
            mo11248f(this.f10036s);
        } else {
            this.f10035r = this.f10020c.mo11306a(jSONObject2);
            mo11238d(this.f10035r);
        }
        int min = Math.min(Math.max(1, this.f10042y / 10), 20);
        if (this.f10020c.mo11315b() > ((long) this.f10042y)) {
            C2877f fVar = this.f10020c;
            fVar.mo11327d(fVar.mo11303a((long) min));
        }
        if (this.f10020c.mo11321c() > ((long) this.f10042y)) {
            C2877f fVar2 = this.f10020c;
            fVar2.mo11329f(fVar2.mo11316b((long) min));
        }
        long d = this.f10020c.mo11325d();
        int i = this.f10040w;
        if (d % ((long) i) != 0 || d < ((long) i)) {
            m13475n(this.f10043z);
        } else {
            mo11263o();
        }
        return (str.equals(str2) || str.equals(str3)) ? this.f10036s : this.f10035r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11243e(long j) {
        this.f10037t = j;
        this.f10020c.mo11307a(f9999V, Long.valueOf(j));
    }

    /* renamed from: a */
    public C2857c mo11187a(Context context, String str, String str2) {
        return mo11188a(context, str, str2, (String) null, false);
    }

    /* renamed from: b */
    public void mo11227b(String str, JSONObject jSONObject, boolean z) {
        mo11226b(str, jSONObject, null, z);
    }

    /* renamed from: d */
    public C2857c mo11236d(String str) {
        Set t = mo11429t();
        if (mo11215a("setDeviceId()") && !C2892n.m13815a(str) && !t.contains(str)) {
            mo11202a((Runnable) new C2874o(this, str));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized C2857c mo11188a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f10003Z.mo11292b(f9992O, "Argument context cannot be null in initialize()");
            return this;
        } else if (C2892n.m13815a(str)) {
            f10003Z.mo11292b(f9992O, "Argument apiKey cannot be null or blank in initialize()");
            return this;
        } else {
            this.f10018a = context.getApplicationContext();
            this.f10021d = str;
            this.f10020c = C2877f.m13588a(this.f10018a, this.f10022e);
            if (C2892n.m13815a(str3)) {
                str3 = "Android";
            }
            this.f10032o = str3;
            C2858a aVar = new C2858a(context, z, str, str2, this);
            mo11202a((Runnable) aVar);
            return this;
        }
    }

    /* renamed from: b */
    public void mo11223b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo11226b(str, jSONObject, jSONObject2, false);
    }

    /* renamed from: j */
    public static String m13471j(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    /* renamed from: b */
    public void mo11226b(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        mo11224b(str, jSONObject, jSONObject2, mo11244f(), z);
    }

    /* renamed from: b */
    public void mo11224b(String str, JSONObject jSONObject, JSONObject jSONObject2, long j, boolean z) {
        if (mo11252g(str)) {
            mo11182a(str, jSONObject, null, null, jSONObject2, null, j, z);
        }
    }

    /* renamed from: j */
    public String mo11257j() {
        return this.f10023f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11225b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
        C2870k kVar = new C2870k(str, jSONObject != null ? C2892n.m13813a(jSONObject) : jSONObject, jSONObject2 != null ? C2892n.m13813a(jSONObject2) : jSONObject2, jSONObject3 != null ? C2892n.m13813a(jSONObject3) : jSONObject3, jSONObject4 != null ? C2892n.m13813a(jSONObject4) : jSONObject4, jSONObject5 != null ? C2892n.m13813a(jSONObject5) : jSONObject5, j, z);
        mo11202a((Runnable) kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11220b(long j) {
        mo11202a((Runnable) new C2871l(j));
    }

    /* renamed from: a */
    public C2857c mo11185a(Application application) {
        if (!this.f10008E && mo11215a("enableForegroundTracking()") && VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new C2856b(this));
        }
        return this;
    }

    /* renamed from: b */
    public JSONObject mo11219b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int length = jSONObject.length();
        String str = f9992O;
        if (length > 1000) {
            f10003Z.mo11299e(str, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            try {
                Object obj = jSONObject.get(str2);
                if (!str2.equals(C2876e.f10106O)) {
                    if (!str2.equals(C2876e.f10107P)) {
                        if (obj.getClass().equals(String.class)) {
                            jSONObject.put(str2, m13471j((String) obj));
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            jSONObject.put(str2, mo11219b((JSONObject) obj));
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            jSONObject.put(str2, mo11194a((JSONArray) obj));
                        }
                    }
                }
                jSONObject.put(str2, obj);
            } catch (JSONException e) {
                f10003Z.mo11292b(str, e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C2857c mo11184a(int i) {
        C2882i.m13675c().mo11350a(i);
        return this;
    }

    /* renamed from: a */
    public C2857c mo11189a(C2891m mVar) {
        this.f10030m = mVar;
        this.f10031n = mVar.mo11467q();
        return this;
    }

    /* renamed from: a */
    public C2857c mo11191a(boolean z) {
        f10003Z.mo11289a(z);
        return this;
    }

    /* renamed from: a */
    public void mo11208a(String str, JSONObject jSONObject) {
        mo11212a(str, jSONObject, false);
    }

    /* renamed from: a */
    public void mo11212a(String str, JSONObject jSONObject, boolean z) {
        mo11211a(str, jSONObject, (JSONObject) null, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo11232c(long j) {
        if (m13478u()) {
            mo11243e(j);
        }
    }

    /* renamed from: g */
    public String mo11250g() {
        return this.f10024g;
    }

    /* renamed from: a */
    public void mo11209a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo11211a(str, jSONObject, jSONObject2, false);
    }

    /* renamed from: a */
    public void mo11211a(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        mo11210a(str, jSONObject, jSONObject2, mo11244f(), z);
    }

    /* renamed from: a */
    public void mo11210a(String str, JSONObject jSONObject, JSONObject jSONObject2, long j, boolean z) {
        if (mo11252g(str)) {
            mo11225b(str, jSONObject, null, null, jSONObject2, null, j, z);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021a A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022b A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0231 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023c A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0242 A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024d A[Catch:{ JSONException -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0253 A[Catch:{ JSONException -> 0x025f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11182a(java.lang.String r17, org.json.JSONObject r18, org.json.JSONObject r19, org.json.JSONObject r20, org.json.JSONObject r21, org.json.JSONObject r22, long r23, boolean r25) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            com.amplitude.api.d r8 = f10003Z
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Logged event to Amplitude: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "com.amplitude.api.AmplitudeClient"
            r8.mo11285a(r10, r9)
            boolean r8 = r1.f10028k
            r11 = -1
            if (r8 == 0) goto L_0x002d
            return r11
        L_0x002d:
            boolean r8 = r1.f10009F
            r13 = 0
            if (r8 == 0) goto L_0x0044
            java.lang.String r8 = "session_start"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0042
            java.lang.String r8 = "session_end"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x0044
        L_0x0042:
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            if (r8 != 0) goto L_0x0054
            if (r25 != 0) goto L_0x0054
            boolean r8 = r1.f10010G
            if (r8 != 0) goto L_0x0051
            r1.mo11258j(r6)
            goto L_0x0054
        L_0x0051:
            r1.mo11232c(r6)
        L_0x0054:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r14 = "event_type"
            java.lang.Object r15 = r16.mo11192a(r17)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r14, r15)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r14 = "timestamp"
            r8.put(r14, r6)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "user_id"
            java.lang.String r7 = r1.f10023f     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "device_id"
            java.lang.String r7 = r1.f10024g     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "session_id"
            if (r25 == 0) goto L_0x0083
            r14 = r11
            goto L_0x0085
        L_0x0083:
            long r14 = r1.f10033p     // Catch:{ JSONException -> 0x0261 }
        L_0x0085:
            r8.put(r6, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "uuid"
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r6 = "sequence_number"
            long r14 = r16.mo11253h()     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r14)     // Catch:{ JSONException -> 0x0261 }
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11450G()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = "version_name"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11344l()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00b5:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11446C()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00cc
            java.lang.String r6 = "os_name"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11342j()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00cc:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11447D()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = "os_version"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11343k()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00e3:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11472v()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x00fa
            java.lang.String r6 = "device_brand"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11334b()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x00fa:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11473w()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0111
            java.lang.String r6 = "device_manufacturer"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11339g()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0111:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11474x()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = "device_model"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11340h()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0128:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11469s()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x013f
            java.lang.String r6 = "carrier"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11335c()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x013f:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11471u()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x0156
            java.lang.String r6 = "country"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11336d()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x0156:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11444A()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x016d
            java.lang.String r6 = "language"
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = r7.mo11338f()     // Catch:{ JSONException -> 0x0261 }
            java.lang.Object r7 = r1.mo11192a(r7)     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x016d:
            com.amplitude.api.m r6 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r6 = r6.mo11448E()     // Catch:{ JSONException -> 0x0261 }
            if (r6 == 0) goto L_0x017c
            java.lang.String r6 = "platform"
            java.lang.String r7 = r1.f10032o     // Catch:{ JSONException -> 0x0261 }
            r8.put(r6, r7)     // Catch:{ JSONException -> 0x0261 }
        L_0x017c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r6.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "name"
            java.lang.String r14 = "amplitude-android"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "version"
            java.lang.String r14 = "2.23.2"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r7 = "library"
            r8.put(r7, r6)     // Catch:{ JSONException -> 0x0261 }
            if (r19 != 0) goto L_0x019c
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r6.<init>()     // Catch:{ JSONException -> 0x0261 }
            goto L_0x019e
        L_0x019c:
            r6 = r19
        L_0x019e:
            org.json.JSONObject r7 = r1.f10031n     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01b1
            org.json.JSONObject r7 = r1.f10031n     // Catch:{ JSONException -> 0x0261 }
            int r7 = r7.length()     // Catch:{ JSONException -> 0x0261 }
            if (r7 <= 0) goto L_0x01b1
            java.lang.String r7 = "tracking_options"
            org.json.JSONObject r14 = r1.f10031n     // Catch:{ JSONException -> 0x0261 }
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x0261 }
        L_0x01b1:
            com.amplitude.api.m r7 = r1.f10030m     // Catch:{ JSONException -> 0x0261 }
            boolean r7 = r7.mo11445B()     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01df
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x0261 }
            android.location.Location r7 = r7.mo11341i()     // Catch:{ JSONException -> 0x0261 }
            if (r7 == 0) goto L_0x01df
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0261 }
            r14.<init>()     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r15 = "lat"
            double r11 = r7.getLatitude()     // Catch:{ JSONException -> 0x0261 }
            r14.put(r15, r11)     // Catch:{ JSONException -> 0x0261 }
            java.lang.String r11 = "lng"
            r12 = r10
            double r9 = r7.getLongitude()     // Catch:{ JSONException -> 0x025f }
            r14.put(r11, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "location"
            r6.put(r7, r14)     // Catch:{ JSONException -> 0x025f }
            goto L_0x01e0
        L_0x01df:
            r12 = r10
        L_0x01e0:
            com.amplitude.api.m r7 = r1.f10030m     // Catch:{ JSONException -> 0x025f }
            boolean r7 = r7.mo11468r()     // Catch:{ JSONException -> 0x025f }
            if (r7 == 0) goto L_0x01fb
            com.amplitude.api.h r7 = r1.f10039v     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = r7.mo11332a()     // Catch:{ JSONException -> 0x025f }
            if (r7 == 0) goto L_0x01fb
            java.lang.String r7 = "androidADID"
            com.amplitude.api.h r9 = r1.f10039v     // Catch:{ JSONException -> 0x025f }
            java.lang.String r9 = r9.mo11332a()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
        L_0x01fb:
            java.lang.String r7 = "limit_ad_tracking"
            com.amplitude.api.h r9 = r1.f10039v     // Catch:{ JSONException -> 0x025f }
            boolean r9 = r9.mo11346n()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "gps_enabled"
            com.amplitude.api.h r9 = r1.f10039v     // Catch:{ JSONException -> 0x025f }
            boolean r9 = r9.mo11345m()     // Catch:{ JSONException -> 0x025f }
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r7 = "api_properties"
            r8.put(r7, r6)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r6 = "event_properties"
            if (r0 != 0) goto L_0x0220
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r0.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0224
        L_0x0220:
            org.json.JSONObject r0 = r1.mo11219b(r0)     // Catch:{ JSONException -> 0x025f }
        L_0x0224:
            r8.put(r6, r0)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "user_properties"
            if (r3 != 0) goto L_0x0231
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0235
        L_0x0231:
            org.json.JSONObject r3 = r1.mo11219b(r3)     // Catch:{ JSONException -> 0x025f }
        L_0x0235:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "groups"
            if (r4 != 0) goto L_0x0242
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0246
        L_0x0242:
            org.json.JSONObject r3 = r1.mo11219b(r4)     // Catch:{ JSONException -> 0x025f }
        L_0x0246:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            java.lang.String r0 = "group_properties"
            if (r5 != 0) goto L_0x0253
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x025f }
            r3.<init>()     // Catch:{ JSONException -> 0x025f }
            goto L_0x0257
        L_0x0253:
            org.json.JSONObject r3 = r1.mo11219b(r5)     // Catch:{ JSONException -> 0x025f }
        L_0x0257:
            r8.put(r0, r3)     // Catch:{ JSONException -> 0x025f }
            long r11 = r1.mo11228c(r2, r8)     // Catch:{ JSONException -> 0x025f }
            goto L_0x028e
        L_0x025f:
            r0 = move-exception
            goto L_0x0263
        L_0x0261:
            r0 = move-exception
            r12 = r10
        L_0x0263:
            com.amplitude.api.d r3 = f10003Z
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r13] = r2
            java.lang.String r5 = r0.toString()
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "JSON Serialization of event type %s failed, skipping: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r5 = r12
            r3.mo11292b(r5, r4)
            com.amplitude.api.i r3 = com.amplitude.api.C2882i.m13675c()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r13] = r2
            java.lang.String r2 = "Failed to JSON serialize event type %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.mo11353a(r2, r0)
            r11 = -1
        L_0x028e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2857c.mo11182a(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, long, boolean):long");
    }

    /* renamed from: b */
    static boolean m13459b(Context context, String str, String str2) {
        String str3 = ".optOut";
        String str4 = ".userId";
        String str5 = ".deviceId";
        String str6 = ".previousSessionId";
        String str7 = ".";
        String str8 = f9992O;
        String str9 = "com.amplitude.api";
        if (str == null) {
            try {
                str = C2876e.class.getPackage().getName();
            } catch (Exception unused) {
                str = str9;
            }
        }
        if (str2 == null) {
            str2 = str9;
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str7);
            sb.append(context.getPackageName());
            String sb2 = sb.toString();
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb2, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str7);
            sb3.append(context.getPackageName());
            String sb4 = sb3.toString();
            Editor edit = context.getSharedPreferences(sb4, 0).edit();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(str6);
            if (sharedPreferences.contains(sb5.toString())) {
                String str10 = C2876e.f10146w;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(str6);
                edit.putLong(str10, sharedPreferences.getLong(sb6.toString(), -1));
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(str5);
            if (sharedPreferences.contains(sb7.toString())) {
                String str11 = C2876e.f10147x;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(str5);
                edit.putString(str11, sharedPreferences.getString(sb8.toString(), null));
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(str4);
            if (sharedPreferences.contains(sb9.toString())) {
                String str12 = C2876e.f10148y;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(str4);
                edit.putString(str12, sharedPreferences.getString(sb10.toString(), null));
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str);
            sb11.append(str3);
            if (sharedPreferences.contains(sb11.toString())) {
                String str13 = C2876e.f10149z;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(str3);
                edit.putBoolean(str13, sharedPreferences.getBoolean(sb12.toString(), false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            C2875d dVar = f10003Z;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Upgraded shared preferences from ");
            sb13.append(sb2);
            sb13.append(" to ");
            sb13.append(sb4);
            dVar.mo11295c(str8, sb13.toString());
            return true;
        } catch (Exception e) {
            f10003Z.mo11293b(str8, "Error upgrading shared preferences", e);
            C2882i.m13675c().mo11353a("Failed to upgrade shared prefs", e);
            return false;
        }
    }

    /* renamed from: b */
    static boolean m13457b(Context context) {
        return m13458b(context, (String) null);
    }

    /* renamed from: b */
    static boolean m13458b(Context context, String str) {
        if (str == null) {
            str = "com.amplitude.api";
        }
        C2877f a = C2877f.m13587a(context);
        String str2 = "device_id";
        String d = a.mo11326d(str2);
        Long c = a.mo11323c(f10002Y);
        Long c2 = a.mo11323c(f9999V);
        if (!C2892n.m13815a(d) && c != null && c2 != null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(context.getPackageName());
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        m13449a(sharedPreferences, C2876e.f10147x, (String) null, a, str2);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C2877f fVar = a;
        m13448a(sharedPreferences2, C2876e.f10144u, -1, fVar, f9999V);
        m13448a(sharedPreferences2, C2876e.f10143t, -1, fVar, f10000W);
        m13448a(sharedPreferences2, C2876e.f10145v, -1, fVar, f10001X);
        m13448a(sharedPreferences2, C2876e.f10146w, -1, fVar, f10002Y);
        m13449a(sharedPreferences, C2876e.f10148y, (String) null, a, "user_id");
        m13450a(sharedPreferences, C2876e.f10149z, false, a, f9997T);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m13445a(String str, long j) {
        Long c = this.f10020c.mo11323c(str);
        return c == null ? j : c.longValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11197a(long j) {
        mo11202a((Runnable) new C2872m(j));
    }

    /* renamed from: a */
    public void mo11196a(double d) {
        mo11203a((String) null, 1, d);
    }

    /* renamed from: a */
    public void mo11203a(String str, int i, double d) {
        mo11204a(str, i, d, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo11204a(String str, int i, double d, String str2, String str3) {
        if (mo11215a("logRevenue()")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", C2876e.f10101J);
                String str4 = str;
                jSONObject.put("productId", str);
                int i2 = i;
                jSONObject.put(C5854b.f16894A, i);
                jSONObject.put(C5854b.f16944z, d);
                jSONObject.put("receipt", str2);
                jSONObject.put("receiptSig", str3);
            } catch (JSONException e) {
                C2882i.m13675c().mo11353a("Failed to generate API Properties JSON for revenue event", e);
            }
            mo11225b(C2876e.f10101J, null, jSONObject, null, null, null, mo11244f(), false);
        }
    }

    /* renamed from: a */
    public void mo11200a(C2890l lVar) {
        if (mo11215a("logRevenueV2()") && lVar != null && lVar.mo11438a()) {
            mo11208a(C2876e.f10101J, lVar.mo11441b());
        }
    }

    /* renamed from: a */
    public void mo11214a(JSONObject jSONObject, boolean z) {
        mo11213a(jSONObject);
    }

    /* renamed from: a */
    public void mo11213a(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0 || !mo11215a("setUserProperties"))) {
            JSONObject b = mo11219b(jSONObject);
            if (b.length() != 0) {
                C2886j jVar = new C2886j();
                Iterator keys = b.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    try {
                        jVar.mo11397c(str, b.get(str));
                    } catch (JSONException e) {
                        f10003Z.mo11292b(f9992O, e.toString());
                        C2882i.m13675c().mo11353a(String.format("Failed to set user property %s", new Object[]{str}), e);
                    }
                }
                mo11198a(jVar);
            }
        }
    }

    /* renamed from: a */
    public void mo11195a() {
        mo11198a(new C2886j().mo11360a());
    }

    /* renamed from: a */
    public void mo11198a(C2886j jVar) {
        mo11199a(jVar, false);
    }

    /* renamed from: a */
    public void mo11199a(C2886j jVar, boolean z) {
        if (jVar != null && jVar.f10211a.length() != 0 && mo11215a("identify()")) {
            mo11225b(C2876e.f10092A, null, null, jVar.f10211a, null, null, mo11244f(), z);
        }
    }

    /* renamed from: a */
    public void mo11205a(String str, Object obj) {
        JSONObject jSONObject;
        if (mo11215a("setGroup()") && !C2892n.m13815a(str)) {
            try {
                jSONObject = new JSONObject().put(str, obj);
            } catch (JSONException e) {
                f10003Z.mo11292b(f9992O, e.toString());
                C2882i.m13675c().mo11353a(String.format("Failed to generate Group JSON for groupType: %s", new Object[]{str}), e);
                jSONObject = null;
            }
            mo11225b(C2876e.f10092A, null, null, new C2886j().mo11397c(str, obj).f10211a, jSONObject, null, mo11244f(), false);
        }
    }

    /* renamed from: a */
    public void mo11206a(String str, Object obj, C2886j jVar) {
        mo11207a(str, obj, jVar, false);
    }

    /* renamed from: a */
    public void mo11207a(String str, Object obj, C2886j jVar, boolean z) {
        JSONObject jSONObject;
        String str2 = str;
        C2886j jVar2 = jVar;
        if (jVar2 != null && jVar2.f10211a.length() != 0) {
            if (mo11215a("groupIdentify()") && !C2892n.m13815a(str)) {
                try {
                    Object obj2 = obj;
                    jSONObject = new JSONObject().put(str, obj);
                } catch (JSONException e) {
                    f10003Z.mo11292b(f9992O, e.toString());
                    C2882i.m13675c().mo11353a(String.format("Failed to generate Group Identify JSON Object for groupType %s", new Object[]{str2}), e);
                    jSONObject = null;
                }
                mo11225b(C2876e.f10093B, null, null, null, jSONObject, jVar2.f10211a, mo11244f(), z);
            }
        }
    }

    /* renamed from: a */
    public JSONArray mo11194a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i, m13471j((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i, mo11219b((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i, mo11194a((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public C2857c mo11190a(String str, boolean z) {
        if (!mo11215a("setUserId()")) {
            return this;
        }
        mo11202a((Runnable) new C2873n(this, z, str));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Pair<Long, Long>, JSONArray> mo11183a(List<JSONObject> list, List<JSONObject> list2, long j) throws JSONException {
        long j2;
        long j3;
        List<JSONObject> list3 = list;
        List<JSONObject> list4 = list2;
        JSONArray jSONArray = new JSONArray();
        long j4 = -1;
        long j5 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                f10003Z.mo11299e(f9992O, String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j - ((long) jSONArray.length()))}));
                break;
            }
            String str = "event_id";
            if (isEmpty2) {
                JSONObject jSONObject = (JSONObject) list.remove(0);
                j2 = jSONObject.getLong(str);
                jSONArray.put(jSONObject);
            } else {
                if (isEmpty) {
                    JSONObject jSONObject2 = (JSONObject) list4.remove(0);
                    j3 = jSONObject2.getLong(str);
                    jSONArray.put(jSONObject2);
                } else {
                    JSONObject jSONObject3 = (JSONObject) list.get(0);
                    String str2 = f9998U;
                    if (!jSONObject3.has(str2) || ((JSONObject) list.get(0)).getLong(str2) < ((JSONObject) list4.get(0)).getLong(str2)) {
                        JSONObject jSONObject4 = (JSONObject) list.remove(0);
                        j2 = jSONObject4.getLong(str);
                        jSONArray.put(jSONObject4);
                    } else {
                        JSONObject jSONObject5 = (JSONObject) list4.remove(0);
                        j3 = jSONObject5.getLong(str);
                        jSONArray.put(jSONObject5);
                    }
                }
                j5 = j3;
            }
            j4 = j2;
        }
        return new Pair<>(new Pair(Long.valueOf(j4), Long.valueOf(j5)), jSONArray);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11201a(p468g.C13876z r16, java.lang.String r17, long r18, long r20) {
        /*
            r15 = this;
            r7 = r15
            r1 = r17
            r3 = r18
            r5 = r20
            java.lang.String r8 = "Exception:"
            java.lang.String r9 = "Failed to post upload request"
            java.lang.String r10 = "com.amplitude.api.AmplitudeClient"
            java.lang.String r2 = "2"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = ""
            r0.append(r11)
            long r12 = r15.mo11244f()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r13 = r7.f10021d     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r0.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            c.a.a.a r13 = new c.a.a.a     // Catch:{ UnsupportedEncodingException -> 0x004f }
            r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r14 = "UTF-8"
            byte[] r0 = r0.getBytes(r14)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            byte[] r0 = r13.digest(r0)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            java.lang.String r11 = r15.mo11193a(r0)     // Catch:{ UnsupportedEncodingException -> 0x004f }
            goto L_0x0062
        L_0x004f:
            r0 = move-exception
            com.amplitude.api.d r13 = f10003Z
            java.lang.String r14 = r0.toString()
            r13.mo11292b(r10, r14)
            com.amplitude.api.i r13 = com.amplitude.api.C2882i.m13675c()
            java.lang.String r14 = "Failed to compute checksum for upload request"
            r13.mo11353a(r14, r0)
        L_0x0062:
            g.s$a r0 = new g.s$a
            r0.<init>()
            java.lang.String r13 = "v"
            g.s$a r0 = r0.mo43599a(r13, r2)
            java.lang.String r2 = r7.f10021d
            java.lang.String r13 = "client"
            g.s$a r0 = r0.mo43599a(r13, r2)
            java.lang.String r2 = "e"
            g.s$a r0 = r0.mo43599a(r2, r1)
            java.lang.String r1 = "upload_time"
            g.s$a r0 = r0.mo43599a(r1, r12)
            java.lang.String r1 = "checksum"
            g.s$a r0 = r0.mo43599a(r1, r11)
            g.s r0 = r0.mo43600a()
            r11 = 0
            g.c0$a r1 = new g.c0$a     // Catch:{ IllegalArgumentException -> 0x01d3 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x01d3 }
            java.lang.String r2 = r7.f10015L     // Catch:{ IllegalArgumentException -> 0x01d3 }
            g.c0$a r1 = r1.mo43374b(r2)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            g.c0$a r0 = r1.mo43377c(r0)     // Catch:{ IllegalArgumentException -> 0x01d3 }
            g.c0 r0 = r0.mo43371a()     // Catch:{ IllegalArgumentException -> 0x01d3 }
            r12 = 1
            r1 = r16
            g.e r0 = r1.mo43405a(r0)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            g.e0 r0 = r0.execute()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            g.f0 r1 = r0.mo43416a()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = r1.string()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r2 = "success"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r2 == 0) goto L_0x00db
            com.amplitude.api.o r0 = r7.f10016M     // Catch:{ ConnectException -> 0x00d8, UnknownHostException -> 0x00d5, IOException -> 0x00d2, AssertionError -> 0x00cf, Exception -> 0x00cc }
            com.amplitude.api.c$f r13 = new com.amplitude.api.c$f     // Catch:{ ConnectException -> 0x00d8, UnknownHostException -> 0x00d5, IOException -> 0x00d2, AssertionError -> 0x00cf, Exception -> 0x00cc }
            r1 = r13
            r2 = r15
            r3 = r18
            r5 = r20
            r1.<init>(r3, r5)     // Catch:{ ConnectException -> 0x00d8, UnknownHostException -> 0x00d5, IOException -> 0x00d2, AssertionError -> 0x00cf, Exception -> 0x00cc }
            r0.mo11478a(r13)     // Catch:{ ConnectException -> 0x00d8, UnknownHostException -> 0x00d5, IOException -> 0x00d2, AssertionError -> 0x00cf, Exception -> 0x00cc }
            goto L_0x01cb
        L_0x00cc:
            r0 = move-exception
            goto L_0x017f
        L_0x00cf:
            r0 = move-exception
            goto L_0x0190
        L_0x00d2:
            r0 = move-exception
            goto L_0x01a1
        L_0x00d5:
            r0 = move-exception
            goto L_0x01b6
        L_0x00d8:
            r0 = move-exception
            goto L_0x01c2
        L_0x00db:
            java.lang.String r2 = "invalid_api_key"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r2 == 0) goto L_0x00ec
            com.amplitude.api.d r0 = f10003Z     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = "Invalid API key, make sure your API key is correct in initialize()"
            r0.mo11292b(r10, r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            goto L_0x017b
        L_0x00ec:
            java.lang.String r2 = "bad_checksum"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r2 == 0) goto L_0x00fd
            com.amplitude.api.d r0 = f10003Z     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
            r0.mo11299e(r10, r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            goto L_0x017b
        L_0x00fd:
            java.lang.String r2 = "request_db_write_failed"
            boolean r2 = r1.equals(r2)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r2 == 0) goto L_0x010d
            com.amplitude.api.d r0 = f10003Z     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = "Couldn't write to request database on server, will attempt to reupload later"
            r0.mo11299e(r10, r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            goto L_0x017b
        L_0x010d:
            int r0 = r0.mo43425g()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r2 = 413(0x19d, float:5.79E-43)
            if (r0 != r2) goto L_0x0160
            boolean r0 = r7.f10006C     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r0 == 0) goto L_0x0131
            int r0 = r7.f10007D     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            if (r0 != r12) goto L_0x0131
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0128
            com.amplitude.api.f r2 = r7.f10020c     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r2.mo11324c(r3)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
        L_0x0128:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0131
            com.amplitude.api.f r0 = r7.f10020c     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r0.mo11328e(r5)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
        L_0x0131:
            r7.f10006C = r12     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            com.amplitude.api.f r0 = r7.f10020c     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            long r0 = r0.mo11315b()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            int r1 = (int) r0     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            int r0 = r7.f10007D     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            int r0 = (int) r0     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r7.f10007D = r0     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            com.amplitude.api.d r0 = f10003Z     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = "Request too large, will decrease size and attempt to reupload"
            r0.mo11299e(r10, r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            com.amplitude.api.o r0 = r7.f10016M     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            com.amplitude.api.c$g r1 = new com.amplitude.api.c$g     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r1.<init>()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r0.mo11478a(r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            goto L_0x017b
        L_0x0160:
            com.amplitude.api.d r0 = f10003Z     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r2.<init>()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r3 = "Upload failed, "
            r2.append(r3)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r2.append(r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = ", will attempt to reupload later"
            r2.append(r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            java.lang.String r1 = r2.toString()     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
            r0.mo11299e(r10, r1)     // Catch:{ ConnectException -> 0x01c0, UnknownHostException -> 0x01b4, IOException -> 0x019f, AssertionError -> 0x018e, Exception -> 0x017d }
        L_0x017b:
            r12 = 0
            goto L_0x01cb
        L_0x017d:
            r0 = move-exception
            r12 = 0
        L_0x017f:
            com.amplitude.api.d r1 = f10003Z
            r1.mo11293b(r10, r8, r0)
            r7.f10014K = r0
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            r1.mo11353a(r9, r0)
            goto L_0x01cb
        L_0x018e:
            r0 = move-exception
            r12 = 0
        L_0x0190:
            com.amplitude.api.d r1 = f10003Z
            r1.mo11293b(r10, r8, r0)
            r7.f10014K = r0
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            r1.mo11353a(r9, r0)
            goto L_0x01cb
        L_0x019f:
            r0 = move-exception
            r12 = 0
        L_0x01a1:
            com.amplitude.api.d r1 = f10003Z
            java.lang.String r2 = r0.toString()
            r1.mo11292b(r10, r2)
            r7.f10014K = r0
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            r1.mo11353a(r9, r0)
            goto L_0x01cb
        L_0x01b4:
            r0 = move-exception
            r12 = 0
        L_0x01b6:
            r7.f10014K = r0
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            r1.mo11353a(r9, r0)
            goto L_0x01cb
        L_0x01c0:
            r0 = move-exception
            r12 = 0
        L_0x01c2:
            r7.f10014K = r0
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            r1.mo11353a(r9, r0)
        L_0x01cb:
            if (r12 != 0) goto L_0x01d2
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f10013J
            r0.set(r11)
        L_0x01d2:
            return
        L_0x01d3:
            r0 = move-exception
            com.amplitude.api.d r1 = f10003Z
            java.lang.String r2 = r0.toString()
            r1.mo11292b(r10, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f10013J
            r1.set(r11)
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()
            java.lang.String r2 = "Failed to build upload request"
            r1.mo11353a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2857c.mo11201a(g.z, java.lang.String, long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11202a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C2893o oVar = this.f10016M;
        if (currentThread != oVar) {
            oVar.mo11478a(runnable);
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo11192a(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized boolean mo11215a(String str) {
        if (this.f10018a == null) {
            C2875d dVar = f10003Z;
            String str2 = f9992O;
            StringBuilder sb = new StringBuilder();
            sb.append("context cannot be null, set context with initialize() before calling ");
            sb.append(str);
            dVar.mo11292b(str2, sb.toString());
            return false;
        } else if (!C2892n.m13815a(this.f10021d)) {
            return true;
        } else {
            C2875d dVar2 = f10003Z;
            String str3 = f9992O;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("apiKey cannot be null or empty, set apiKey with initialize() before calling ");
            sb2.append(str);
            dVar2.mo11292b(str3, sb2.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo11193a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & C5785c.f16698q];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    static boolean m13453a(Context context) {
        return m13459b(context, (String) null, (String) null);
    }

    /* renamed from: a */
    private static void m13448a(SharedPreferences sharedPreferences, String str, long j, C2877f fVar, String str2) {
        if (fVar.mo11323c(str2) == null) {
            fVar.mo11307a(str2, Long.valueOf(sharedPreferences.getLong(str, j)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: a */
    private static void m13449a(SharedPreferences sharedPreferences, String str, String str2, C2877f fVar, String str3) {
        if (C2892n.m13815a(fVar.mo11326d(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (!C2892n.m13815a(string)) {
                fVar.mo11322c(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    /* renamed from: a */
    private static void m13450a(SharedPreferences sharedPreferences, String str, boolean z, C2877f fVar, String str2) {
        if (fVar.mo11323c(str2) == null) {
            fVar.mo11307a(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1 : 0));
            sharedPreferences.edit().remove(str).apply();
        }
    }
}
