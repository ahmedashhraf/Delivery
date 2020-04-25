package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.util.C4469a;
import com.google.android.gms.common.util.C4495n;
import java.util.concurrent.Callable;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C5944c
/* renamed from: com.google.android.gms.common.e0 */
class C4281e0 {

    /* renamed from: d */
    private static final C4281e0 f13280d = new C4281e0(true, null, null);

    /* renamed from: a */
    final boolean f13281a;

    /* renamed from: b */
    private final String f13282b;

    /* renamed from: c */
    private final Throwable f13283c;

    C4281e0(boolean z, @C5952h String str, @C5952h Throwable th) {
        this.f13281a = z;
        this.f13282b = str;
        this.f13283c = th;
    }

    /* renamed from: a */
    static C4281e0 m18506a(Callable<String> callable) {
        return new C4285g0(callable);
    }

    /* renamed from: c */
    static C4281e0 m18508c() {
        return f13280d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18118b() {
        if (!this.f13281a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f13283c != null) {
                mo18117a();
                return;
            }
            mo18117a();
        }
    }

    /* renamed from: a */
    static C4281e0 m18504a(@C0193h0 String str) {
        return new C4281e0(false, str, null);
    }

    /* renamed from: a */
    static C4281e0 m18505a(@C0193h0 String str, @C0193h0 Throwable th) {
        return new C4281e0(false, str, th);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public String mo18117a() {
        return this.f13282b;
    }

    /* renamed from: a */
    static String m18507a(String str, C4510x xVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C4495n.m19385a(C4469a.m19293a("SHA-1").digest(xVar.mo18575G0())), Boolean.valueOf(z), "12451009.false"});
    }
}
