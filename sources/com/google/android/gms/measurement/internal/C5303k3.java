package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.C0221u;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5303k3 extends C5360p5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f15159c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f15160d = -1;
    @C0221u("this")

    /* renamed from: e */
    private String f15161e;

    /* renamed from: f */
    private final C5325m3 f15162f = new C5325m3(this, 6, false, false);

    /* renamed from: g */
    private final C5325m3 f15163g = new C5325m3(this, 6, true, false);

    /* renamed from: h */
    private final C5325m3 f15164h = new C5325m3(this, 6, false, true);

    /* renamed from: i */
    private final C5325m3 f15165i = new C5325m3(this, 5, false, false);

    /* renamed from: j */
    private final C5325m3 f15166j = new C5325m3(this, 5, true, false);

    /* renamed from: k */
    private final C5325m3 f15167k = new C5325m3(this, 5, false, true);

    /* renamed from: l */
    private final C5325m3 f15168l = new C5325m3(this, 4, false, false);

    /* renamed from: m */
    private final C5325m3 f15169m = new C5325m3(this, 3, false, false);

    /* renamed from: n */
    private final C5325m3 f15170n = new C5325m3(this, 2, false, false);

    C5303k3(C5359p4 p4Var) {
        super(p4Var);
    }

    @C4476d0
    /* renamed from: E */
    private final String m23047E() {
        String str;
        synchronized (this) {
            if (this.f15161e == null) {
                if (this.f15309a.mo21580A() != null) {
                    this.f15161e = this.f15309a.mo21580A();
                } else {
                    this.f15161e = C5386r9.m23407w();
                }
            }
            str = this.f15161e;
        }
        return str;
    }

    /* renamed from: a */
    protected static Object m23051a(String str) {
        if (str == null) {
            return null;
        }
        return new C5358p3(str);
    }

    /* renamed from: b */
    private static String m23055b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C5325m3 mo21527A() {
        return this.f15169m;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: C */
    public final C5325m3 mo21528C() {
        return this.f15170n;
    }

    /* renamed from: D */
    public final String mo21529D() {
        Pair<String, Long> a = mo21213l().f15569d.mo21171a();
        if (a == null || a == C5446x3.f15566B) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
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
    /* renamed from: r */
    public final boolean mo21326r() {
        return false;
    }

    /* renamed from: t */
    public final C5325m3 mo21533t() {
        return this.f15162f;
    }

    /* renamed from: u */
    public final C5325m3 mo21534u() {
        return this.f15163g;
    }

    /* renamed from: v */
    public final C5325m3 mo21535v() {
        return this.f15164h;
    }

    /* renamed from: w */
    public final C5325m3 mo21536w() {
        return this.f15165i;
    }

    /* renamed from: x */
    public final C5325m3 mo21537x() {
        return this.f15166j;
    }

    /* renamed from: y */
    public final C5325m3 mo21538y() {
        return this.f15167k;
    }

    /* renamed from: z */
    public final C5325m3 mo21539z() {
        return this.f15168l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21531a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo21532a(i)) {
            mo21530a(i, m23053a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C4300a0.m18620a(str);
            C5326m4 s = this.f15309a.mo21605s();
            if (s == null) {
                mo21530a(6, "Scheduler not set. Not logging error/warn");
            } else if (!s.mo21616s()) {
                mo21530a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                C5336n3 n3Var = new C5336n3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                s.mo21555a((Runnable) n3Var);
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* access modifiers changed from: protected */
    @C4476d0
    /* renamed from: a */
    public final boolean mo21532a(int i) {
        return Log.isLoggable(m23047E(), i);
    }

    /* access modifiers changed from: protected */
    @C4476d0
    /* renamed from: a */
    public final void mo21530a(int i, String str) {
        m23047E();
    }

    /* renamed from: a */
    static String m23053a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m23052a(z, obj);
        String a2 = m23052a(z, obj2);
        String a3 = m23052a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    @C4476d0
    /* renamed from: a */
    private static String m23052a(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m23055b(C5359p4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null && m23055b(className).equals(b)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C5358p3) {
                return ((C5358p3) obj).f15369a;
            } else {
                if (z) {
                    return str2;
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
