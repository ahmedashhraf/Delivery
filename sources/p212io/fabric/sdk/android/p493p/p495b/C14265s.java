package p212io.fabric.sdk.android.p493p.p495b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.p.b.s */
/* compiled from: IdManager */
public class C14265s {

    /* renamed from: m */
    public static final String f42074m = "com.crashlytics.CollectDeviceIdentifiers";

    /* renamed from: n */
    public static final String f42075n = "com.crashlytics.CollectUserIdentifiers";

    /* renamed from: o */
    public static final String f42076o = "0.0";

    /* renamed from: p */
    static final String f42077p = "crashlytics.advertising.id";

    /* renamed from: q */
    private static final String f42078q = "crashlytics.installation.id";

    /* renamed from: r */
    private static final Pattern f42079r = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: s */
    private static final String f42080s = "9774d56d682e549c";

    /* renamed from: t */
    private static final String f42081t = Pattern.quote("/");

    /* renamed from: a */
    private final ReentrantLock f42082a = new ReentrantLock();

    /* renamed from: b */
    private final C14267t f42083b;

    /* renamed from: c */
    private final boolean f42084c;

    /* renamed from: d */
    private final boolean f42085d;

    /* renamed from: e */
    private final Context f42086e;

    /* renamed from: f */
    private final String f42087f;

    /* renamed from: g */
    private final String f42088g;

    /* renamed from: h */
    private final Collection<C14225i> f42089h;

    /* renamed from: i */
    C14238c f42090i;

    /* renamed from: j */
    C14237b f42091j;

    /* renamed from: k */
    boolean f42092k;

    /* renamed from: l */
    C14264r f42093l;

    /* renamed from: io.fabric.sdk.android.p.b.s$a */
    /* compiled from: IdManager */
    public enum C14266a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private C14266a(int i) {
            this.protobufIndex = i;
        }
    }

    public C14265s(Context context, String str, String str2, Collection<C14225i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f42086e = context;
            this.f42087f = str;
            this.f42088g = str2;
            this.f42089h = collection;
            this.f42083b = new C14267t();
            this.f42090i = new C14238c(context);
            this.f42093l = new C14264r();
            this.f42084c = C14248i.m61819a(context, f42074m, true);
            boolean z = this.f42084c;
            String str3 = C14215d.f41919m;
            if (!z) {
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                j.mo45042d(str3, sb.toString());
            }
            this.f42085d = C14248i.m61819a(context, f42075n, true);
            if (!this.f42085d) {
                C14228l j2 = C14215d.m61672j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User information collection disabled for ");
                sb2.append(context.getPackageName());
                j2.mo45042d(str3, sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: b */
    private String m61881b(String str) {
        return str.replaceAll(f42081t, "");
    }

    /* renamed from: s */
    private Boolean m61882s() {
        C14237b c = mo45162c();
        if (c != null) {
            return Boolean.valueOf(c.f41981b);
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public String mo45159a(String str, String str2) {
        return "";
    }

    /* renamed from: a */
    public boolean mo45160a() {
        return this.f42085d;
    }

    @Deprecated
    /* renamed from: b */
    public String mo45161b() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized C14237b mo45162c() {
        if (!this.f42092k) {
            this.f42091j = this.f42090i.mo45122a();
            this.f42092k = true;
        }
        return this.f42091j;
    }

    @Deprecated
    /* renamed from: d */
    public String mo45163d() {
        return null;
    }

    /* renamed from: e */
    public String mo45164e() {
        return this.f42087f;
    }

    /* renamed from: f */
    public String mo45165f() {
        String str = this.f42088g;
        if (str != null) {
            return str;
        }
        SharedPreferences i = C14248i.m61841i(this.f42086e);
        m61877a(i);
        String string = i.getString(f42078q, null);
        return string == null ? m61880b(i) : string;
    }

    @Deprecated
    /* renamed from: g */
    public String mo45166g() {
        return null;
    }

    /* renamed from: h */
    public Map<C14266a, String> mo45167h() {
        HashMap hashMap = new HashMap();
        for (C14225i iVar : this.f42089h) {
            if (iVar instanceof C14257n) {
                for (Entry entry : ((C14257n) iVar).getDeviceIdentifiers().entrySet()) {
                    m61879a(hashMap, (C14266a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String mo45168i() {
        return this.f42083b.mo45178a(this.f42086e);
    }

    /* renamed from: j */
    public String mo45169j() {
        return String.format(Locale.US, "%s/%s", new Object[]{m61881b(Build.MANUFACTURER), m61881b(Build.MODEL)});
    }

    /* renamed from: k */
    public String mo45170k() {
        return m61881b(VERSION.INCREMENTAL);
    }

    /* renamed from: l */
    public String mo45171l() {
        return m61881b(VERSION.RELEASE);
    }

    /* renamed from: m */
    public String mo45172m() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo45171l());
        sb.append("/");
        sb.append(mo45170k());
        return sb.toString();
    }

    @Deprecated
    /* renamed from: n */
    public String mo45173n() {
        return null;
    }

    @Deprecated
    /* renamed from: o */
    public String mo45174o() {
        return null;
    }

    @Deprecated
    /* renamed from: p */
    public String mo45175p() {
        return null;
    }

    /* renamed from: q */
    public Boolean mo45176q() {
        if (mo45177r()) {
            return m61882s();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo45177r() {
        return this.f42084c && !this.f42093l.mo45158e(this.f42086e);
    }

    /* renamed from: a */
    private String m61876a(String str) {
        if (str == null) {
            return null;
        }
        return f42079r.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private String m61880b(SharedPreferences sharedPreferences) {
        String str = f42078q;
        this.f42082a.lock();
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = m61876a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(str, string).commit();
            }
            return string;
        } finally {
            this.f42082a.unlock();
        }
    }

    /* renamed from: a */
    private void m61877a(SharedPreferences sharedPreferences) {
        C14237b c = mo45162c();
        if (c != null) {
            m61878a(sharedPreferences, c.f41980a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m61878a(SharedPreferences sharedPreferences, String str) {
        String str2 = f42077p;
        this.f42082a.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString(str2, str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove(f42078q).putString(str2, str).commit();
                }
                this.f42082a.unlock();
            }
        } finally {
            this.f42082a.unlock();
        }
    }

    /* renamed from: a */
    private void m61879a(Map<C14266a, String> map, C14266a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }
}
