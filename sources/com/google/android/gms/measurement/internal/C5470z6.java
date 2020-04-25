package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0193h0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.measurement.C4801i4;
import com.google.android.gms.internal.measurement.C4966t0.C4967a;
import com.google.android.gms.internal.measurement.C4966t0.C4971c;
import com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a;
import com.google.android.gms.internal.measurement.C4966t0.C4973d;
import com.google.android.gms.internal.measurement.C4966t0.C4975e;
import com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a;
import com.google.android.gms.internal.measurement.C4966t0.C4977f;
import com.google.android.gms.internal.measurement.C4966t0.C4977f.C4978a;
import com.google.android.gms.internal.measurement.C4966t0.C4979g;
import com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a;
import com.google.android.gms.internal.measurement.C4966t0.C4981h;
import com.google.android.gms.internal.measurement.C4966t0.C4988k;
import com.google.android.gms.internal.measurement.C4966t0.C4988k.C4989a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5470z6 extends C5429v8 {
    public C5470z6(C5461y8 y8Var) {
        super(y8Var);
    }

    @C0226w0
    /* renamed from: a */
    public final byte[] mo21873a(@C0193h0 zzak zzak, @C0210o0(min = 1) String str) {
        C5265g9 g9Var;
        C4978a aVar;
        C4980a aVar2;
        C5239e5 e5Var;
        byte[] bArr;
        Bundle bundle;
        C5255g gVar;
        long j;
        zzak zzak2 = zzak;
        String str2 = str;
        String str3 = "_r";
        mo21209h();
        this.f15309a.mo21596j();
        C4300a0.m18620a(zzak);
        C4300a0.m18630b(str);
        if (!mo21214m().mo21643e(str2, C5310l.f15254n0)) {
            mo21205d().mo21527A().mo21550a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzak2.f15686a)) {
            if (!"_iapx".equals(zzak2.f15686a)) {
                mo21205d().mo21527A().mo21551a("Generating a payload for this event is not available. package_name, event_name", str2, zzak2.f15686a);
                return null;
            }
        }
        C4978a o = C4977f.m21240o();
        mo21217p().mo21712z();
        try {
            C5239e5 b = mo21217p().mo21694b(str2);
            if (b == null) {
                mo21205d().mo21527A().mo21550a("Log and bundle not available. package_name", str2);
                return new byte[0];
            } else if (!b.mo21300w()) {
                mo21205d().mo21527A().mo21550a("Log and bundle disabled. package_name", str2);
                byte[] bArr2 = new byte[0];
                mo21217p().mo21668A();
                return bArr2;
            } else {
                C4980a a = C4979g.m21344r0().mo19575a(1).mo19214a("android");
                if (!TextUtils.isEmpty(b.mo21278i())) {
                    a.mo19604f(b.mo21278i());
                }
                if (!TextUtils.isEmpty(b.mo21296s())) {
                    a.mo19601e(b.mo21296s());
                }
                if (!TextUtils.isEmpty(b.mo21294q())) {
                    a.mo19607g(b.mo21294q());
                }
                if (b.mo21295r() != -2147483648L) {
                    a.mo19605g((int) b.mo21295r());
                }
                a.mo19603f(b.mo21297t()).mo19615k(b.mo21299v());
                if (!TextUtils.isEmpty(b.mo21282k())) {
                    a.mo19616k(b.mo21282k());
                } else if (!TextUtils.isEmpty(b.mo21284l())) {
                    a.mo19625o(b.mo21284l());
                }
                a.mo19609h(b.mo21298u());
                if (this.f15309a.mo21593f() && C5386r9.m23410z() && mo21214m().mo21640d(a.mo19630t())) {
                    a.mo19630t();
                    if (!TextUtils.isEmpty(null)) {
                        a.mo19622n(null);
                    }
                }
                Pair a2 = mo21213l().mo21804a(b.mo21278i());
                if (b.mo21268e() && a2 != null && !TextUtils.isEmpty((CharSequence) a2.first)) {
                    a.mo19610h(m23872a((String) a2.first, Long.toString(zzak2.f15685O)));
                    if (a2.second != null) {
                        a.mo19584a(((Boolean) a2.second).booleanValue());
                    }
                }
                mo21210i().mo21613o();
                C4980a c = a.mo19594c(Build.MODEL);
                mo21210i().mo21613o();
                c.mo19589b(VERSION.RELEASE).mo19599e((int) mo21210i().mo21327t()).mo19597d(mo21210i().mo21328u());
                try {
                    a.mo19612i(m23872a(b.mo21280j(), Long.toString(zzak2.f15685O)));
                    if (!TextUtils.isEmpty(b.mo21288n())) {
                        a.mo19619l(b.mo21288n());
                    }
                    String i = b.mo21278i();
                    List a3 = mo21217p().mo21680a(i);
                    Iterator it = a3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            g9Var = null;
                            break;
                        }
                        g9Var = (C5265g9) it.next();
                        if ("_lte".equals(g9Var.f15072c)) {
                            break;
                        }
                    }
                    if (g9Var == null || g9Var.f15074e == null) {
                        C5265g9 g9Var2 = new C5265g9(i, "auto", "_lte", mo21208g().mo18569a(), Long.valueOf(0));
                        a3.add(g9Var2);
                        mo21217p().mo21691a(g9Var2);
                    }
                    if (mo21214m().mo21643e(i, C5310l.f15244i0)) {
                        C5221c9 o2 = mo21216o();
                        o2.mo21205d().mo21528C().mo21549a("Checking account type status for ad personalization signals");
                        if (o2.mo21210i().mo21331x()) {
                            String i2 = b.mo21278i();
                            if (b.mo21268e() && o2.mo21218q().mo21513e(i2)) {
                                o2.mo21205d().mo21527A().mo21549a("Turning off ad personalization due to account type");
                                Iterator it2 = a3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C5265g9) it2.next()).f15072c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                C5265g9 g9Var3 = new C5265g9(i2, "auto", "_npa", o2.mo21208g().mo18569a(), Long.valueOf(1));
                                a3.add(g9Var3);
                            }
                        }
                    }
                    C4988k[] kVarArr = new C4988k[a3.size()];
                    for (int i3 = 0; i3 < a3.size(); i3++) {
                        C4989a a4 = C4988k.m21557w().mo19214a(((C5265g9) a3.get(i3)).f15072c).mo19675a(((C5265g9) a3.get(i3)).f15073d);
                        mo21216o().mo21198a(a4, ((C5265g9) a3.get(i3)).f15074e);
                        kVarArr[i3] = (C4988k) ((C4801i4) a4.mo19056B());
                    }
                    a.mo19588b((Iterable<? extends C4988k>) Arrays.asList(kVarArr));
                    Bundle i4 = zzak2.f15687b.mo21880i();
                    i4.putLong("_c", 1);
                    mo21205d().mo21527A().mo21549a("Marking in-app purchase as real-time");
                    i4.putLong(str3, 1);
                    i4.putString("_o", zzak2.f15684N);
                    if (mo21212k().mo21386d(a.mo19630t())) {
                        mo21212k().mo21368a(i4, "_dbg", (Object) Long.valueOf(1));
                        mo21212k().mo21368a(i4, str3, (Object) Long.valueOf(1));
                    }
                    C5255g a5 = mo21217p().mo21677a(str2, zzak2.f15686a);
                    if (a5 == null) {
                        e5Var = b;
                        aVar2 = a;
                        aVar = o;
                        bundle = i4;
                        bArr = null;
                        C5255g gVar2 = new C5255g(str, zzak2.f15686a, 0, 0, zzak2.f15685O, 0, null, null, null, null);
                        gVar = gVar2;
                        j = 0;
                    } else {
                        e5Var = b;
                        aVar2 = a;
                        aVar = o;
                        bundle = i4;
                        bArr = null;
                        j = a5.f15046f;
                        gVar = a5.mo21393a(zzak2.f15685O);
                    }
                    mo21217p().mo21686a(gVar);
                    C5233e eVar = new C5233e(this.f15309a, zzak2.f15684N, str, zzak2.f15686a, zzak2.f15685O, j, bundle);
                    C4972a b2 = C4971c.m21169w().mo19487a(eVar.f14964d).mo19214a(eVar.f14962b).mo19493b(eVar.f14965e);
                    Iterator it3 = eVar.f14966f.iterator();
                    while (it3.hasNext()) {
                        String str4 = (String) it3.next();
                        C4976a a6 = C4975e.m21218u().mo19214a(str4);
                        mo21216o().mo21197a(a6, eVar.f14966f.mo21876c(str4));
                        b2.mo19488a(a6);
                    }
                    C4980a aVar3 = aVar2;
                    aVar3.mo19579a(b2).mo19580a(C4981h.m21473a().mo19636a(C4973d.m21198a().mo19499a(gVar.f15043c).mo19214a(zzak2.f15686a)));
                    aVar3.mo19593c((Iterable<? extends C4967a>) mo21215n().mo21548a(e5Var.mo21278i(), Collections.emptyList(), aVar3.mo19623n(), Long.valueOf(b2.mo19497o())));
                    if (b2.mo19496n()) {
                        aVar3.mo19587b(b2.mo19497o()).mo19592c(b2.mo19497o());
                    }
                    long p = e5Var.mo21292p();
                    if (p != 0) {
                        aVar3.mo19600e(p);
                    }
                    long o3 = e5Var.mo21290o();
                    if (o3 != 0) {
                        aVar3.mo19595d(o3);
                    } else if (p != 0) {
                        aVar3.mo19595d(p);
                    }
                    e5Var.mo21242A();
                    aVar3.mo19602f((int) e5Var.mo21301x()).mo19606g(mo21214m().mo21652n()).mo19578a(mo21208g().mo18569a()).mo19590b(Boolean.TRUE.booleanValue());
                    C4978a aVar4 = aVar;
                    aVar4.mo19515a(aVar3);
                    C5239e5 e5Var2 = e5Var;
                    e5Var2.mo21250a(aVar3.mo19626p());
                    e5Var2.mo21256b(aVar3.mo19627q());
                    mo21217p().mo21685a(e5Var2);
                    mo21217p().mo21708v();
                    mo21217p().mo21668A();
                    try {
                        return mo21216o().mo21204c(((C4977f) ((C4801i4) aVar4.mo19056B())).mo19359f());
                    } catch (IOException e) {
                        mo21205d().mo21533t().mo21551a("Data loss. Failed to bundle and serialize. appId", C5303k3.m23051a(str), e);
                        return bArr;
                    }
                } catch (SecurityException e2) {
                    mo21205d().mo21527A().mo21550a("app instance id encryption failed", e2.getMessage());
                    byte[] bArr3 = new byte[0];
                    mo21217p().mo21668A();
                    return bArr3;
                }
            }
        } catch (SecurityException e3) {
            mo21205d().mo21527A().mo21550a("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            mo21217p().mo21668A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        return false;
    }

    /* renamed from: a */
    private static String m23872a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
