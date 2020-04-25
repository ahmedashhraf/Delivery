package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C4801i4;
import com.google.android.gms.internal.measurement.C4842l0.C4843a;
import com.google.android.gms.internal.measurement.C4842l0.C4843a.C4844a;
import com.google.android.gms.internal.measurement.C4842l0.C4845b.C4846a;
import com.google.android.gms.internal.measurement.C4842l0.C4847c;
import com.google.android.gms.internal.measurement.C4842l0.C4847c.C4848a;
import com.google.android.gms.internal.measurement.C4842l0.C4852e;
import com.google.android.gms.internal.measurement.C4842l0.C4852e.C4853a;
import com.google.android.gms.internal.measurement.C4921q0.C4922a.C4923a;
import com.google.android.gms.internal.measurement.C4921q0.C4924b;
import com.google.android.gms.internal.measurement.C4921q0.C4924b.C4925a;
import com.google.android.gms.internal.measurement.C4921q0.C4926c;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.firebase.analytics.FirebaseAnalytics.C5853a;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5293j4 extends C5429v8 implements C5408t9 {
    @C4476d0

    /* renamed from: j */
    private static int f15140j = 65535;
    @C4476d0

    /* renamed from: k */
    private static int f15141k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f15142d = new C0635a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f15143e = new C0635a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f15144f = new C0635a();

    /* renamed from: g */
    private final Map<String, C4924b> f15145g = new C0635a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f15146h = new C0635a();

    /* renamed from: i */
    private final Map<String, String> f15147i = new C0635a();

    C5293j4(C5461y8 y8Var) {
        super(y8Var);
    }

    @C0226w0
    /* renamed from: i */
    private final void m23005i(String str) {
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        if (this.f15145g.get(str) == null) {
            byte[] d = mo21217p().mo21700d(str);
            if (d == null) {
                this.f15142d.put(str, null);
                this.f15143e.put(str, null);
                this.f15144f.put(str, null);
                this.f15145g.put(str, null);
                this.f15147i.put(str, null);
                this.f15146h.put(str, null);
                return;
            }
            C4925a aVar = (C4925a) m23002a(str, d).mo19052i();
            m23004a(str, aVar);
            this.f15142d.put(str, m23003a((C4924b) aVar.mo19056B()));
            this.f15145g.put(str, (C4924b) aVar.mo19056B());
            this.f15147i.put(str, null);
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final C4924b mo21504a(String str) {
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        m23005i(str);
        return (C4924b) this.f15145g.get(str);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: b */
    public final String mo21507b(String str) {
        mo21209h();
        return (String) this.f15147i.get(str);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: c */
    public final void mo21509c(String str) {
        mo21209h();
        this.f15147i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: d */
    public final void mo21512d(String str) {
        mo21209h();
        this.f15145g.remove(str);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: e */
    public final boolean mo21513e(String str) {
        mo21209h();
        C4924b a = mo21504a(str);
        if (a == null) {
            return false;
        }
        return a.mo19385u();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: f */
    public final long mo21514f(String str) {
        String a = mo21505a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo21205d().mo21536w().mo21551a("Unable to parse timezone offset. appId", C5303k3.m23051a(str), e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo21515g(String str) {
        return "1".equals(mo21505a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo21516h(String str) {
        return "1".equals(mo21505a(str, "measurement.upload.blacklist_public"));
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

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5320l9 mo21215n() {
        return super.mo21215n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5221c9 mo21216o() {
        return super.mo21216o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5397s9 mo21217p() {
        return super.mo21217p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C5293j4 mo21218q() {
        return super.mo21218q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        return false;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final boolean mo21508b(String str, String str2) {
        mo21209h();
        m23005i(str);
        if (mo21515g(str) && C5254f9.m22844g(str2)) {
            return true;
        }
        if (mo21516h(str) && C5254f9.m22843f(str2)) {
            return true;
        }
        Map map = (Map) this.f15143e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: c */
    public final boolean mo21510c(String str, String str2) {
        mo21209h();
        m23005i(str);
        if (C5853a.f16874g.equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15144f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: d */
    public final int mo21511d(String str, String str2) {
        mo21209h();
        m23005i(str);
        Map map = (Map) this.f15146h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    @C0226w0
    /* renamed from: a */
    public final String mo21505a(String str, String str2) {
        mo21209h();
        m23005i(str);
        Map map = (Map) this.f15142d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: a */
    private static Map<String, String> m23003a(C4924b bVar) {
        C0635a aVar = new C0635a();
        if (bVar != null) {
            for (C4926c cVar : bVar.mo19382r()) {
                aVar.put(cVar.mo19391a(), cVar.mo19392o());
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: a */
    private final void m23004a(String str, C4925a aVar) {
        C0635a aVar2 = new C0635a();
        C0635a aVar3 = new C0635a();
        C0635a aVar4 = new C0635a();
        if (aVar != null) {
            for (int i = 0; i < aVar.mo19386a(); i++) {
                C4923a aVar5 = (C4923a) aVar.mo19387a(i).mo19052i();
                if (TextUtils.isEmpty(aVar5.mo19372a())) {
                    mo21205d().mo21536w().mo21549a("EventConfig contained null event name");
                } else {
                    String b = C5371q5.m23393b(aVar5.mo19372a());
                    if (!TextUtils.isEmpty(b)) {
                        aVar5 = aVar5.mo19214a(b);
                        aVar.mo19388a(i, aVar5);
                    }
                    aVar2.put(aVar5.mo19372a(), Boolean.valueOf(aVar5.mo19373l()));
                    aVar3.put(aVar5.mo19372a(), Boolean.valueOf(aVar5.mo19374m()));
                    if (aVar5.mo19375n()) {
                        if (aVar5.mo19376o() < f15141k || aVar5.mo19376o() > f15140j) {
                            mo21205d().mo21536w().mo21551a("Invalid sampling rate. Event name, sample rate", aVar5.mo19372a(), Integer.valueOf(aVar5.mo19376o()));
                        } else {
                            aVar4.put(aVar5.mo19372a(), Integer.valueOf(aVar5.mo19376o()));
                        }
                    }
                }
            }
        }
        this.f15143e.put(str, aVar2);
        this.f15144f.put(str, aVar3);
        this.f15146h.put(str, aVar4);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final boolean mo21506a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        String str3 = str;
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        C4925a aVar = (C4925a) m23002a(str, bArr).mo19052i();
        if (aVar == null) {
            return false;
        }
        m23004a(str3, aVar);
        this.f15145g.put(str3, (C4924b) aVar.mo19056B());
        this.f15147i.put(str3, str2);
        this.f15142d.put(str3, m23003a((C4924b) aVar.mo19056B()));
        C5320l9 n = mo21215n();
        C4843a[] aVarArr = (C4843a[]) aVar.mo19389l().toArray(new C4843a[0]);
        C4300a0.m18620a(aVarArr);
        for (int i = 0; i < aVarArr.length; i++) {
            C4844a aVar2 = (C4844a) aVarArr[i].mo19052i();
            if (aVar2.mo19200l() != 0) {
                C4844a aVar3 = aVar2;
                for (int i2 = 0; i2 < aVar3.mo19200l(); i2++) {
                    C4846a aVar4 = (C4846a) aVar3.mo19199b(i2).mo19052i();
                    C4846a aVar5 = (C4846a) aVar4.clone();
                    String b = C5371q5.m23393b(aVar4.mo19216a());
                    if (b != null) {
                        aVar5.mo19214a(b);
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    for (int i3 = 0; i3 < aVar4.mo19217l(); i3++) {
                        C4847c a = aVar4.mo19215a(i3);
                        String a2 = C5404t5.m23529a(a.mo19224t());
                        if (a2 != null) {
                            aVar5.mo19213a(i3, (C4847c) ((C4848a) a.mo19052i()).mo19214a(a2).mo19056B());
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVar3 = aVar3.mo19196a(i2, aVar5);
                        aVarArr[i] = (C4843a) aVar3.mo19056B();
                    }
                }
                aVar2 = aVar3;
            }
            if (aVar2.mo19195a() != 0) {
                C4844a aVar6 = aVar2;
                for (int i4 = 0; i4 < aVar6.mo19195a(); i4++) {
                    C4852e a3 = aVar6.mo19198a(i4);
                    String a4 = C5393s5.m23461a(a3.mo19239p());
                    if (a4 != null) {
                        aVar6 = aVar6.mo19197a(i4, ((C4853a) a3.mo19052i()).mo19214a(a4));
                        aVarArr[i] = (C4843a) aVar6.mo19056B();
                    }
                }
            }
        }
        n.mo21217p().mo21687a(str3, aVarArr);
        try {
            aVar.mo19390m();
            bArr2 = ((C4924b) ((C4801i4) aVar.mo19056B())).mo19359f();
        } catch (RuntimeException e) {
            mo21205d().mo21536w().mo21551a("Unable to serialize reduced-size config. Storing full config instead. appId", C5303k3.m23051a(str), e);
            bArr2 = bArr;
        }
        C5397s9 p = mo21217p();
        C4300a0.m18630b(str);
        p.mo21209h();
        p.mo21739s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) p.mo21709w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                p.mo21205d().mo21533t().mo21550a("Failed to update remote config (got 0). appId", C5303k3.m23051a(str));
            }
        } catch (SQLiteException e2) {
            p.mo21205d().mo21533t().mo21551a("Error storing remote config. appId", C5303k3.m23051a(str), e2);
        }
        this.f15145g.put(str3, (C4924b) aVar.mo19056B());
        return true;
    }

    @C0226w0
    /* renamed from: a */
    private final C4924b m23002a(String str, byte[] bArr) {
        String str2 = "Unable to merge remote config. appId";
        if (bArr == null) {
            return C4924b.m20986w();
        }
        try {
            C4924b bVar = (C4924b) ((C4801i4) ((C4925a) C5221c9.m22539a(C4924b.m20985v(), bArr)).mo19056B());
            C5325m3 C = mo21205d().mo21528C();
            String str3 = "Parsed config. version, gmp_app_id";
            String str4 = null;
            Object valueOf = bVar.mo19377a() ? Long.valueOf(bVar.mo19379o()) : null;
            if (bVar.mo19380p()) {
                str4 = bVar.mo19381q();
            }
            C.mo21551a(str3, valueOf, str4);
            return bVar;
        } catch (zzfn e) {
            mo21205d().mo21536w().mo21551a(str2, C5303k3.m23051a(str), e);
            return C4924b.m20986w();
        } catch (RuntimeException e2) {
            mo21205d().mo21536w().mo21551a(str2, C5303k3.m23051a(str), e2);
            return C4924b.m20986w();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
