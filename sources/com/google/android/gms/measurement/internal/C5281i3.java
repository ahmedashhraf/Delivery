package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4484g;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5281i3 extends C5360p5 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f15117c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f15118d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f15119e = new AtomicReference<>();

    C5281i3(C5359p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: t */
    private final boolean m22977t() {
        mo21189B();
        return this.f15309a.mo21610x() && this.f15309a.mo21205d().mo21532a(3);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public final String mo21429a(String str) {
        if (str == null) {
            return null;
        }
        if (!m22977t()) {
            return str;
        }
        return m22976a(str, C5371q5.f15419b, C5371q5.f15418a, f15117c);
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: b */
    public final String mo21430b(String str) {
        if (str == null) {
            return null;
        }
        if (!m22977t()) {
            return str;
        }
        return m22976a(str, C5404t5.f15488b, C5404t5.f15487a, f15118d);
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: c */
    public final String mo21431c(String str) {
        if (str == null) {
            return null;
        }
        if (!m22977t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m22976a(str, C5393s5.f15454b, C5393s5.f15453a, f15119e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
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

    @C0195i0
    /* renamed from: a */
    private static String m22976a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C4300a0.m18620a(strArr);
        C4300a0.m18620a(strArr2);
        C4300a0.m18620a(atomicReference);
        C4300a0.m18627a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C5254f9.m22842d(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public final String mo21428a(zzak zzak) {
        if (zzak == null) {
            return null;
        }
        if (!m22977t()) {
            return zzak.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzak.f15684N);
        sb.append(",name=");
        sb.append(mo21429a(zzak.f15686a));
        sb.append(",params=");
        sb.append(m22975a(zzak.f15687b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public final String mo21427a(C5233e eVar) {
        if (eVar == null) {
            return null;
        }
        if (!m22977t()) {
            return eVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(eVar.f14961a);
        sb.append("', name='");
        sb.append(mo21429a(eVar.f14962b));
        sb.append("', params=");
        sb.append(m22975a(eVar.f14966f));
        sb.append("}");
        return sb.toString();
    }

    @C0195i0
    /* renamed from: a */
    private final String m22975a(zzaf zzaf) {
        if (zzaf == null) {
            return null;
        }
        if (!m22977t()) {
            return zzaf.toString();
        }
        return mo21426a(zzaf.mo21880i());
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public final String mo21426a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m22977t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo21430b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
