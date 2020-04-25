package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.core.app.C0770p;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.common.util.C4486h;
import com.google.android.gms.internal.measurement.C5027vb;
import com.google.android.gms.measurement.p174b.C5179a.C5180a;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smack.util.StringUtils;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5254f9 extends C5360p5 {

    /* renamed from: g */
    private static final String[] f15036g = {"firebase_", "google_", "ga_"};

    /* renamed from: c */
    private SecureRandom f15037c;

    /* renamed from: d */
    private final AtomicLong f15038d = new AtomicLong(0);

    /* renamed from: e */
    private int f15039e;

    /* renamed from: f */
    private Integer f15040f = null;

    C5254f9(C5359p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: d */
    static boolean m22842d(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: f */
    static boolean m22843f(String str) {
        C4300a0.m18630b(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    static boolean m22844g(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
    }

    @C4476d0
    /* renamed from: h */
    private static boolean m22845h(String str) {
        C4300a0.m18620a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: i */
    private static int m22846i(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return FeatureRequestEntry.COLUMN_ID.equals(str) ? 256 : 36;
    }

    /* renamed from: x */
    static MessageDigest m22847x() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(StringUtils.MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo21360a(@C0193h0 Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(C5854b.f16903J, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(C5854b.f16905L, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(C5854b.f16906M, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = C5854b.f16908O;
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = C5854b.f16909P;
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo21205d().mo21536w().mo21550a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo21382b(String str, String str2) {
        if (str2 == null) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo21205d().mo21535v().mo21551a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo21205d().mo21535v().mo21551a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo21385c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m22845h(str)) {
                if (this.f15309a.mo21610x()) {
                    mo21205d().mo21535v().mo21550a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C5303k3.m23051a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f15309a.mo21610x()) {
                mo21205d().mo21535v().mo21549a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m22845h(str2)) {
            mo21205d().mo21535v().mo21550a("Invalid admob_app_id. Analytics disabled.", C5303k3.m23051a(str2));
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: e */
    public final boolean mo21387e(String str) {
        try {
            Editor edit = mo21206e().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            return edit.commit();
        } catch (Exception e) {
            mo21205d().mo21533t().mo21550a("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: n */
    public final void mo21388n() {
        mo21209h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo21205d().mo21536w().mo21549a("Utils falling back to Random for random id");
            }
        }
        this.f15038d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo21326r() {
        return true;
    }

    /* renamed from: t */
    public final long mo21389t() {
        long andIncrement;
        long j;
        if (this.f15038d.get() == 0) {
            synchronized (this.f15038d) {
                long nextLong = new Random(System.nanoTime() ^ mo21208g().mo18569a()).nextLong();
                int i = this.f15039e + 1;
                this.f15039e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f15038d) {
            this.f15038d.compareAndSet(-1, 1);
            andIncrement = this.f15038d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: u */
    public final SecureRandom mo21390u() {
        mo21209h();
        if (this.f15037c == null) {
            this.f15037c = new SecureRandom();
        }
        return this.f15037c;
    }

    /* renamed from: v */
    public final int mo21391v() {
        if (this.f15040f == null) {
            this.f15040f = Integer.valueOf(C4282f.m18511a().mo18123b(mo21206e()) / 1000);
        }
        return this.f15040f.intValue();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: w */
    public final String mo21392w() {
        byte[] bArr = new byte[16];
        mo21390u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo21386d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s = mo21214m().mo21660s();
        mo21189B();
        return s.equals(str);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo21380b(String str) {
        String str2 = "user property";
        if (!mo21382b(str2, str)) {
            return 6;
        }
        if (!mo21379a(str2, C5393s5.f15453a, str)) {
            return 15;
        }
        if (!mo21377a(str2, 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo21383c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m22826a(m22846i(str), obj, true);
        }
        return m22826a(m22846i(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo21381b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m22833a("user property referrer", str, m22846i(str), obj, false);
        } else {
            z = m22833a("user property", str, m22846i(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: c */
    public final boolean mo21384c(String str) {
        mo21209h();
        if (C4439c.m19110a(mo21206e()).mo18444a(str) == 0) {
            return true;
        }
        mo21205d().mo21527A().mo21550a("Permission not granted", str);
        return false;
    }

    @C4476d0
    /* renamed from: c */
    private final boolean m22841c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C4439c.m19110a(context).mo18451b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo21205d().mo21533t().mo21550a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo21205d().mo21533t().mo21550a("Package name not found", e2);
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m22840b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static Bundle m22838b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: a */
    static boolean m22830a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo21378a(String str, String str2) {
        if (str2 == null) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo21205d().mo21535v().mo21551a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo21205d().mo21535v().mo21551a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m22839b(List<zzs> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzs zzs : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzs.f15726a);
            bundle.putString("origin", zzs.f15727b);
            bundle.putLong(C5180a.f14847m, zzs.f15718O);
            bundle.putString("name", zzs.f15717N.f15695b);
            C5382r5.m23401a(bundle, zzs.f15717N.mo21886a());
            bundle.putBoolean("active", zzs.f15719P);
            String str = zzs.f15720Q;
            if (str != null) {
                bundle.putString(C5180a.f14838d, str);
            }
            zzak zzak = zzs.f15721R;
            if (zzak != null) {
                bundle.putString(C5180a.f14840f, zzak.f15686a);
                zzaf zzaf = zzs.f15721R.f15687b;
                if (zzaf != null) {
                    bundle.putBundle(C5180a.f14841g, zzaf.mo21880i());
                }
            }
            bundle.putLong(C5180a.f14839e, zzs.f15722S);
            zzak zzak2 = zzs.f15723T;
            if (zzak2 != null) {
                bundle.putString(C5180a.f14842h, zzak2.f15686a);
                zzaf zzaf2 = zzs.f15723T.f15687b;
                if (zzaf2 != null) {
                    bundle.putBundle(C5180a.f14843i, zzaf2.mo21880i());
                }
            }
            bundle.putLong(C5180a.f14849o, zzs.f15717N.f15688N);
            bundle.putLong(C5180a.f14844j, zzs.f15724U);
            zzak zzak3 = zzs.f15725V;
            if (zzak3 != null) {
                bundle.putString(C5180a.f14845k, zzak3.f15686a);
                zzaf zzaf3 = zzs.f15725V.f15687b;
                if (zzaf3 != null) {
                    bundle.putBundle(C5180a.f14846l, zzaf3.mo21880i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo21379a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be null. Type", str);
            return false;
        }
        C4300a0.m18620a(str2);
        String[] strArr2 = f15036g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo21205d().mo21535v().mo21551a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C4300a0.m18620a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m22842d(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo21205d().mo21535v().mo21551a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo21377a(String str, int i, String str2) {
        if (str2 == null) {
            mo21205d().mo21535v().mo21550a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo21205d().mo21535v().mo21552a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo21358a(String str) {
        String str2 = C0770p.f3524g0;
        if (!mo21382b(str2, str)) {
            return 2;
        }
        if (!mo21379a(str2, C5371q5.f15418a, str)) {
            return 13;
        }
        if (!mo21377a(str2, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m22833a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    mo21205d().mo21538y().mo21552a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo21205d().mo21538y().mo21551a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            mo21205d().mo21538y().mo21551a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: a */
    static boolean m22834a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: a */
    private static Object m22826a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m22827a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m22827a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo21364a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m22826a(256, obj, true);
        }
        if (!m22844g(str)) {
            i = 100;
        }
        return m22826a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m22837a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (mo21377a(r2, 40, r15) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (mo21377a(r2, 40, r15) == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo21362a(java.lang.String r17, java.lang.String r18, android.os.Bundle r19, @androidx.annotation.C0195i0 java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = 0
            if (r8 == 0) goto L_0x0185
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>(r8)
            com.google.android.gms.measurement.internal.r9 r0 = r16.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C5310l.f15264s0
            boolean r0 = r0.mo21643e(r7, r1)
            if (r0 == 0) goto L_0x0026
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r19.keySet()
            r0.<init>(r1)
            goto L_0x002a
        L_0x0026:
            java.util.Set r0 = r19.keySet()
        L_0x002a:
            java.util.Iterator r12 = r0.iterator()
            r14 = 0
        L_0x002f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r12.next()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r5 = 40
            r0 = 3
            if (r9 == 0) goto L_0x004a
            boolean r1 = r9.contains(r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x0082
        L_0x004a:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r21 == 0) goto L_0x0068
            boolean r3 = r6.mo21378a(r2, r15)
            if (r3 != 0) goto L_0x0058
        L_0x0056:
            r3 = 3
            goto L_0x0069
        L_0x0058:
            boolean r3 = r6.mo21379a(r2, r10, r15)
            if (r3 != 0) goto L_0x0061
            r3 = 14
            goto L_0x0069
        L_0x0061:
            boolean r3 = r6.mo21377a(r2, r5, r15)
            if (r3 != 0) goto L_0x0068
            goto L_0x0056
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 != 0) goto L_0x0081
            boolean r3 = r6.mo21382b(r2, r15)
            if (r3 != 0) goto L_0x0073
        L_0x0071:
            r1 = 3
            goto L_0x0082
        L_0x0073:
            boolean r3 = r6.mo21379a(r2, r10, r15)
            if (r3 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            boolean r1 = r6.mo21377a(r2, r5, r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x0071
        L_0x0081:
            r1 = r3
        L_0x0082:
            java.lang.String r4 = "_ev"
            r3 = 1
            if (r1 == 0) goto L_0x009e
            boolean r2 = m22831a(r11, r1)
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = m22827a(r15, r5, r3)
            r11.putString(r4, r2)
            if (r1 != r0) goto L_0x0099
            m22828a(r11, r15)
        L_0x0099:
            r11.remove(r15)
            goto L_0x013e
        L_0x009e:
            java.lang.Object r2 = r8.get(r15)
            r16.mo21209h()
            if (r22 == 0) goto L_0x00dd
            boolean r0 = r2 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x00b0
            r0 = r2
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x00bb
        L_0x00b0:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00d4
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x00bb:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00d4
            com.google.android.gms.measurement.internal.k3 r1 = r16.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21538y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "param"
            java.lang.String r5 = "Parameter array is too long; discarded. Value kind, name, array length"
            r1.mo21552a(r5, r3, r15, r0)
            r0 = 0
            goto L_0x00d5
        L_0x00d4:
            r0 = 1
        L_0x00d5:
            if (r0 != 0) goto L_0x00dd
            r0 = 17
            r13 = r4
            r10 = 40
            goto L_0x011e
        L_0x00dd:
            com.google.android.gms.measurement.internal.r9 r0 = r16.mo21214m()
            boolean r0 = r0.mo21644f(r7)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = m22844g(r18)
            if (r0 != 0) goto L_0x00f3
        L_0x00ed:
            boolean r0 = m22844g(r15)
            if (r0 == 0) goto L_0x0107
        L_0x00f3:
            r3 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r16
            r5 = r2
            r2 = r15
            r10 = 1
            r13 = r4
            r4 = r5
            r10 = 40
            r5 = r22
            boolean r0 = r0.m22833a(r1, r2, r3, r4, r5)
            goto L_0x0119
        L_0x0107:
            r5 = r2
            r13 = r4
            r10 = 40
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r16
            r2 = r15
            r4 = r5
            r5 = r22
            boolean r0 = r0.m22833a(r1, r2, r3, r4, r5)
        L_0x0119:
            if (r0 == 0) goto L_0x011d
            r0 = 0
            goto L_0x011e
        L_0x011d:
            r0 = 4
        L_0x011e:
            if (r0 == 0) goto L_0x0141
            boolean r1 = r13.equals(r15)
            if (r1 != 0) goto L_0x0141
            boolean r0 = m22831a(r11, r0)
            if (r0 == 0) goto L_0x013b
            r0 = 1
            java.lang.String r0 = m22827a(r15, r10, r0)
            r11.putString(r13, r0)
            java.lang.Object r0 = r8.get(r15)
            m22828a(r11, r0)
        L_0x013b:
            r11.remove(r15)
        L_0x013e:
            r10 = 0
            goto L_0x002f
        L_0x0141:
            boolean r0 = m22843f(r15)
            if (r0 == 0) goto L_0x0182
            int r14 = r14 + 1
            r0 = 25
            if (r14 <= r0) goto L_0x0182
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.k3 r1 = r16.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21535v()
            com.google.android.gms.measurement.internal.i3 r2 = r16.mo21211j()
            r3 = r18
            java.lang.String r2 = r2.mo21429a(r3)
            com.google.android.gms.measurement.internal.i3 r4 = r16.mo21211j()
            java.lang.String r4 = r4.mo21426a(r8)
            r1.mo21551a(r0, r2, r4)
            r0 = 5
            m22831a(r11, r0)
            r11.remove(r15)
            goto L_0x013e
        L_0x0182:
            r3 = r18
            goto L_0x013e
        L_0x0185:
            r11 = 0
        L_0x0186:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5254f9.mo21362a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m22831a(Bundle bundle, int i) {
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m22828a(Bundle bundle, Object obj) {
        C4300a0.m18620a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21368a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo21205d().mo21538y().mo21551a("Not putting event parameter. Invalid value type. name, type", mo21211j().mo21430b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21366a(int i, String str, String str2, int i2) {
        mo21376a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21376a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m22831a(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f15309a.mo21189B();
        this.f15309a.mo21606t().mo21764a("auto", "_err", bundle);
    }

    @C4476d0
    /* renamed from: a */
    static long m22824a(byte[] bArr) {
        C4300a0.m18620a(bArr);
        int i = 0;
        C4300a0.m18631b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m22829a(Context context, boolean z) {
        C4300a0.m18620a(context);
        if (VERSION.SDK_INT >= 24) {
            return m22840b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m22840b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a */
    static boolean m22832a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: a */
    static boolean m22835a(@C0195i0 List<String> list, @C0195i0 List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo21361a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo21364a(str, bundle.get(str));
                if (a == null) {
                    mo21205d().mo21538y().mo21550a("Param value can't be null", mo21211j().mo21430b(str));
                } else {
                    mo21368a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzak mo21363a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo21358a(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            String str4 = "_o";
            bundle3.putString(str4, str3);
            String str5 = str2;
            zzak zzak = new zzak(str5, new zzaf(mo21361a(mo21362a(str, str2, bundle3, C4486h.m19352a(str4), false, false))), str3, j);
            return zzak;
        }
        mo21205d().mo21533t().mo21550a("Invalid conditional property event name", mo21211j().mo21431c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final long mo21359a(Context context, String str) {
        mo21209h();
        C4300a0.m18620a(context);
        C4300a0.m18630b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest x = m22847x();
        if (x == null) {
            mo21205d().mo21533t().mo21549a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m22841c(context, str)) {
                    PackageInfo b = C4439c.m19110a(context).mo18451b(mo21206e().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m22824a(x.digest(b.signatures[0].toByteArray()));
                    }
                    mo21205d().mo21536w().mo21549a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo21205d().mo21533t().mo21550a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    static byte[] m22836a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final int mo21357a(int i) {
        return C4282f.m18511a().mo18094a(mo21206e(), (int) C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* renamed from: a */
    public static long m22823a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21367a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            mo21205d().mo21536w().mo21550a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    /* renamed from: a */
    public final void mo21372a(C5027vb vbVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AckRequest.ELEMENT, str);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo21370a(C5027vb vbVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(AckRequest.ELEMENT, j);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo21369a(C5027vb vbVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(AckRequest.ELEMENT, i);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo21375a(C5027vb vbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AckRequest.ELEMENT, bArr);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo21374a(C5027vb vbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AckRequest.ELEMENT, z);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo21371a(C5027vb vbVar, Bundle bundle) {
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public static Bundle m22825a(List<zzjx> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzjx zzjx : list) {
            String str = zzjx.f15691Q;
            if (str != null) {
                bundle.putString(zzjx.f15695b, str);
            } else {
                Long l = zzjx.f15689O;
                if (l != null) {
                    bundle.putLong(zzjx.f15695b, l.longValue());
                } else {
                    Double d = zzjx.f15693S;
                    if (d != null) {
                        bundle.putDouble(zzjx.f15695b, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo21373a(C5027vb vbVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AckRequest.ELEMENT, arrayList);
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f15309a.mo21205d().mo21536w().mo21550a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final URL mo21365a(long j, @C0193h0 String str, @C0193h0 String str2, long j2) {
        try {
            C4300a0.m18630b(str2);
            C4300a0.m18630b(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(mo21391v())}), str2, str, Long.valueOf(j2)});
            if (str.equals(mo21214m().mo21661t())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo21205d().mo21533t().mo21550a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
