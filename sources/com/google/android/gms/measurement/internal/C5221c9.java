package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import bolts.C2176m;
import com.amplitude.api.C2876e;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C4842l0.C4845b;
import com.google.android.gms.internal.measurement.C4842l0.C4847c;
import com.google.android.gms.internal.measurement.C4842l0.C4849d;
import com.google.android.gms.internal.measurement.C4842l0.C4852e;
import com.google.android.gms.internal.measurement.C4842l0.C4854f;
import com.google.android.gms.internal.measurement.C4903o8;
import com.google.android.gms.internal.measurement.C4932q5;
import com.google.android.gms.internal.measurement.C4966t0.C4967a;
import com.google.android.gms.internal.measurement.C4966t0.C4969b;
import com.google.android.gms.internal.measurement.C4966t0.C4971c;
import com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a;
import com.google.android.gms.internal.measurement.C4966t0.C4975e;
import com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a;
import com.google.android.gms.internal.measurement.C4966t0.C4977f;
import com.google.android.gms.internal.measurement.C4966t0.C4979g;
import com.google.android.gms.internal.measurement.C4966t0.C4984i;
import com.google.android.gms.internal.measurement.C4966t0.C4986j;
import com.google.android.gms.internal.measurement.C4966t0.C4988k;
import com.google.android.gms.internal.measurement.C4966t0.C4988k.C4989a;
import com.google.android.gms.internal.measurement.C5005u3;
import com.google.android.gms.internal.measurement.zzfn;
import com.instabug.library.model.State;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5221c9 extends C5429v8 {
    C5221c9(C5461y8 y8Var) {
        super(y8Var);
    }

    /* renamed from: b */
    static Object m22551b(C4971c cVar, String str) {
        C4975e a = m22540a(cVar, str);
        if (a != null) {
            if (a.mo19501o()) {
                return a.mo19502p();
            }
            if (a.mo19503q()) {
                return Long.valueOf(a.mo19504r());
            }
            if (a.mo19505s()) {
                return Double.valueOf(a.mo19506t());
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
    public final void mo21198a(C4989a aVar, Object obj) {
        C4300a0.m18620a(obj);
        aVar.mo19673a().mo19678l().mo19679m();
        if (obj instanceof String) {
            aVar.mo19677b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo19676b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo19674a(((Double) obj).doubleValue());
        } else {
            mo21205d().mo21533t().mo21550a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo21204c(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo21205d().mo21533t().mo21550a("Failed to gzip content", e);
            throw e;
        }
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

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: v */
    public final List<Integer> mo21220v() {
        Map a = C5310l.m23127a(this.f15561b.mo21206e());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C5310l.f15220T.mo21225a(null)).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo21205d().mo21536w().mo21550a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo21205d().mo21536w().mo21550a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo21202b(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo21205d().mo21533t().mo21550a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21197a(C4976a aVar, Object obj) {
        C4300a0.m18620a(obj);
        aVar.mo19507a().mo19511l().mo19512m();
        if (obj instanceof String) {
            aVar.mo19510b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo19509a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo19508a(((Double) obj).doubleValue());
        } else {
            mo21205d().mo21533t().mo21550a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: a */
    static C4975e m22540a(C4971c cVar, String str) {
        for (C4975e eVar : cVar.mo19475a()) {
            if (eVar.mo19500a().equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m22543a(C4972a aVar, String str, Object obj) {
        List a = aVar.mo19491a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(((C4975e) a.get(i)).mo19500a())) {
                break;
            } else {
                i++;
            }
        }
        C4976a a2 = C4975e.m21218u().mo19214a(str);
        if (obj instanceof Long) {
            a2.mo19509a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            a2.mo19510b((String) obj);
        } else if (obj instanceof Double) {
            a2.mo19508a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.mo19485a(i, a2);
        } else {
            aVar.mo19488a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo21194a(C4977f fVar) {
        if (fVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        Iterator it = fVar.mo19513a().iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                C4979g gVar = (C4979g) it.next();
                if (gVar != null) {
                    m22544a(sb, 1);
                    sb.append("bundle {\n");
                    if (gVar.mo19543a()) {
                        m22548a(sb, 1, "protocol_version", (Object) Integer.valueOf(gVar.mo19534R()));
                    }
                    m22548a(sb, 1, C2876e.f10125d0, (Object) gVar.mo19556k0());
                    if (gVar.mo19565q0()) {
                        m22548a(sb, 1, "gmp_version", (Object) Long.valueOf(gVar.mo19562p()));
                    }
                    if (gVar.mo19564q()) {
                        m22548a(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(gVar.mo19566r()));
                    }
                    if (gVar.mo19537U()) {
                        m22548a(sb, 1, "dynamite_version", (Object) Long.valueOf(gVar.mo19538V()));
                    }
                    if (gVar.mo19528L()) {
                        m22548a(sb, 1, "config_version", (Object) Long.valueOf(gVar.mo19529M()));
                    }
                    m22548a(sb, 1, "gmp_app_id", (Object) gVar.mo19519C());
                    m22548a(sb, 1, "admob_app_id", (Object) gVar.mo19536T());
                    m22548a(sb, 1, "app_id", (Object) gVar.mo19561o0());
                    m22548a(sb, 1, State.KEY_APP_VERSION, (Object) gVar.mo19563p0());
                    if (gVar.mo19525I()) {
                        m22548a(sb, 1, "app_version_major", (Object) Integer.valueOf(gVar.mo19526J()));
                    }
                    m22548a(sb, 1, "firebase_instance_id", (Object) gVar.mo19524H());
                    if (gVar.mo19571w()) {
                        m22548a(sb, 1, "dev_cert_hash", (Object) Long.valueOf(gVar.mo19572x()));
                    }
                    m22548a(sb, 1, "app_store", (Object) gVar.mo19559n0());
                    if (gVar.mo19544a0()) {
                        m22548a(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(gVar.mo19546b0()));
                    }
                    if (gVar.mo19548c0()) {
                        m22548a(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(gVar.mo19549d0()));
                    }
                    if (gVar.mo19550e0()) {
                        m22548a(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(gVar.mo19551f0()));
                    }
                    if (gVar.mo19552g0()) {
                        m22548a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(gVar.mo19553h0()));
                    }
                    if (gVar.mo19554i0()) {
                        m22548a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(gVar.mo19555j0()));
                    }
                    m22548a(sb, 1, "app_instance_id", (Object) gVar.mo19570v());
                    m22548a(sb, 1, "resettable_device_id", (Object) gVar.mo19567s());
                    m22548a(sb, 1, "device_id", (Object) gVar.mo19527K());
                    m22548a(sb, 1, "ds_id", (Object) gVar.mo19532P());
                    if (gVar.mo19568t()) {
                        m22548a(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(gVar.mo19569u()));
                    }
                    m22548a(sb, 1, C2876e.f10123c0, (Object) gVar.mo19557l0());
                    m22548a(sb, 1, C2876e.f10114W, (Object) gVar.mo19558m0());
                    m22548a(sb, 1, "user_default_language", (Object) gVar.mo19522F());
                    if (gVar.mo19518B()) {
                        m22548a(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(gVar.mo19560o()));
                    }
                    if (gVar.mo19573y()) {
                        m22548a(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(gVar.mo19574z()));
                    }
                    if (gVar.mo19520D()) {
                        m22548a(sb, 1, "service_upload", (Object) Boolean.valueOf(gVar.mo19521E()));
                    }
                    m22548a(sb, 1, "health_monitor", (Object) gVar.mo19517A());
                    if (gVar.mo19530N() && gVar.mo19531O() != 0) {
                        m22548a(sb, 1, "android_id", (Object) Long.valueOf(gVar.mo19531O()));
                    }
                    if (gVar.mo19533Q()) {
                        m22548a(sb, 1, "retry_counter", (Object) Integer.valueOf(gVar.mo19535S()));
                    }
                    List<C4988k> Y = gVar.mo19541Y();
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = "name";
                    if (Y != null) {
                        for (C4988k kVar : Y) {
                            if (kVar != null) {
                                m22544a(sb, 2);
                                sb.append("user_property {\n");
                                m22548a(sb, 2, "set_timestamp_millis", kVar.mo19664a() ? Long.valueOf(kVar.mo19665o()) : null);
                                m22548a(sb, 2, str5, (Object) mo21211j().mo21431c(kVar.mo19666p()));
                                m22548a(sb, 2, str4, (Object) kVar.mo19668r());
                                m22548a(sb, 2, str3, kVar.mo19669s() ? Long.valueOf(kVar.mo19670t()) : null);
                                m22548a(sb, 2, str2, kVar.mo19671u() ? Double.valueOf(kVar.mo19672v()) : null);
                                m22544a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<C4967a> G = gVar.mo19523G();
                    String o0 = gVar.mo19561o0();
                    if (G != null) {
                        for (C4967a aVar : G) {
                            if (aVar != null) {
                                m22544a(sb, 2);
                                sb.append("audience_membership {\n");
                                if (aVar.mo19455a()) {
                                    m22548a(sb, 2, "audience_id", (Object) Integer.valueOf(aVar.mo19456o()));
                                }
                                if (aVar.mo19460s()) {
                                    m22548a(sb, 2, "new_audience", (Object) Boolean.valueOf(aVar.mo19461t()));
                                }
                                m22547a(sb, 2, "current_data", aVar.mo19457p(), o0);
                                m22547a(sb, 2, "previous_data", aVar.mo19459r(), o0);
                                m22544a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<C4971c> W = gVar.mo19539W();
                    if (W != null) {
                        for (C4971c cVar : W) {
                            if (cVar != null) {
                                m22544a(sb, 2);
                                sb.append("event {\n");
                                m22548a(sb, 2, str5, (Object) mo21211j().mo21429a(cVar.mo19478p()));
                                if (cVar.mo19479q()) {
                                    m22548a(sb, 2, "timestamp_millis", (Object) Long.valueOf(cVar.mo19480r()));
                                }
                                if (cVar.mo19481s()) {
                                    m22548a(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(cVar.mo19482t()));
                                }
                                if (cVar.mo19483u()) {
                                    m22548a(sb, 2, "count", (Object) Integer.valueOf(cVar.mo19484v()));
                                }
                                if (cVar.mo19477o() != 0) {
                                    List<C4975e> a = cVar.mo19475a();
                                    if (a != null) {
                                        for (C4975e eVar : a) {
                                            if (eVar != null) {
                                                m22544a(sb, 3);
                                                sb.append("param {\n");
                                                m22548a(sb, 3, str5, (Object) mo21211j().mo21430b(eVar.mo19500a()));
                                                m22548a(sb, 3, str4, (Object) eVar.mo19502p());
                                                m22548a(sb, 3, str3, eVar.mo19503q() ? Long.valueOf(eVar.mo19504r()) : null);
                                                m22548a(sb, 3, str2, eVar.mo19505s() ? Double.valueOf(eVar.mo19506t()) : null);
                                                m22544a(sb, 3);
                                                sb.append(str);
                                            }
                                        }
                                    }
                                }
                                m22544a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    m22544a(sb, 1);
                    sb.append(str);
                }
            } else {
                sb.append(str);
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo21192a(C4845b bVar) {
        if (bVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (bVar.mo19201a()) {
            m22548a(sb, 0, "filter_id", (Object) Integer.valueOf(bVar.mo19203o()));
        }
        m22548a(sb, 0, C2176m.f8635e, (Object) mo21211j().mo21429a(bVar.mo19204p()));
        String a = m22541a(bVar.mo19209u(), bVar.mo19210v(), bVar.mo19212x());
        if (!a.isEmpty()) {
            m22548a(sb, 0, "filter_type", (Object) a);
        }
        m22546a(sb, 1, "event_count_filter", bVar.mo19208t());
        sb.append("  filters {\n");
        for (C4847c a2 : bVar.mo19205q()) {
            m22545a(sb, 2, a2);
        }
        m22544a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo21193a(C4852e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (eVar.mo19237a()) {
            m22548a(sb, 0, "filter_id", (Object) Integer.valueOf(eVar.mo19238o()));
        }
        m22548a(sb, 0, "property_name", (Object) mo21211j().mo21431c(eVar.mo19239p()));
        String a = m22541a(eVar.mo19241r(), eVar.mo19242s(), eVar.mo19244u());
        if (!a.isEmpty()) {
            m22548a(sb, 0, "filter_type", (Object) a);
        }
        m22545a(sb, 1, eVar.mo19240q());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m22541a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m22547a(StringBuilder sb, int i, String str, C4984i iVar, String str2) {
        if (iVar != null) {
            m22544a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            String str3 = ", ";
            if (iVar.mo19642q() != 0) {
                m22544a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : iVar.mo19641p()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (iVar.mo19640o() != 0) {
                m22544a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : iVar.mo19637a()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            String str4 = "}\n";
            if (iVar.mo19644s() != 0) {
                m22544a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C4969b bVar : iVar.mo19643r()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(str3);
                    }
                    sb.append(bVar.mo19469a() ? Integer.valueOf(bVar.mo19470o()) : null);
                    sb.append(":");
                    sb.append(bVar.mo19471p() ? Long.valueOf(bVar.mo19472q()) : null);
                    i6 = i7;
                }
                sb.append(str4);
            }
            if (iVar.mo19646u() != 0) {
                m22544a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C4986j jVar : iVar.mo19645t()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(str3);
                    }
                    sb.append(jVar.mo19655a() ? Integer.valueOf(jVar.mo19657o()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : jVar.mo19658p()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(str3);
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append(str4);
            }
            m22544a(sb, 3);
            sb.append(str4);
        }
    }

    /* renamed from: a */
    private final void m22546a(StringBuilder sb, int i, String str, C4849d dVar) {
        if (dVar != null) {
            m22544a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (dVar.mo19225a()) {
                m22548a(sb, i, "comparison_type", (Object) dVar.mo19226o().name());
            }
            if (dVar.mo19227p()) {
                m22548a(sb, i, "match_as_float", (Object) Boolean.valueOf(dVar.mo19228q()));
            }
            m22548a(sb, i, "comparison_value", (Object) dVar.mo19230s());
            m22548a(sb, i, "min_comparison_value", (Object) dVar.mo19232u());
            m22548a(sb, i, "max_comparison_value", (Object) dVar.mo19234w());
            m22544a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m22545a(StringBuilder sb, int i, C4847c cVar) {
        if (cVar != null) {
            m22544a(sb, i);
            sb.append("filter {\n");
            if (cVar.mo19222r()) {
                m22548a(sb, i, "complement", (Object) Boolean.valueOf(cVar.mo19223s()));
            }
            m22548a(sb, i, "param_name", (Object) mo21211j().mo21430b(cVar.mo19224t()));
            int i2 = i + 1;
            C4854f o = cVar.mo19219o();
            String str = "}\n";
            if (o != null) {
                m22544a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (o.mo19245a()) {
                    m22548a(sb, i2, "match_type", (Object) o.mo19246o().name());
                }
                m22548a(sb, i2, "expression", (Object) o.mo19248q());
                if (o.mo19249r()) {
                    m22548a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(o.mo19250s()));
                }
                if (o.mo19252u() > 0) {
                    m22544a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : o.mo19251t()) {
                        m22544a(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append(str);
                }
                m22544a(sb, i2);
                sb.append(str);
            }
            m22546a(sb, i2, "number_filter", cVar.mo19221q());
            m22544a(sb, i);
            sb.append(str);
        }
    }

    /* renamed from: a */
    private static void m22544a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m22548a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m22544a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo21205d().mo21533t().mo21549a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo21191a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo21205d()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo21549a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5221c9.mo21191a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final boolean mo21200a(zzak zzak, zzm zzm) {
        C4300a0.m18620a(zzak);
        C4300a0.m18620a(zzm);
        C4903o8.m20907b();
        if (mo21214m().mo21635a(C5310l.f15217Q0)) {
            if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
                return false;
            }
        } else if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
            mo21189B();
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m22549a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m22550a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static List<Long> m22542a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<Long> mo21195a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo21205d().mo21536w().mo21550a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo21205d().mo21536w().mo21551a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo21199a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo21208g().mo18569a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final long mo21190a(byte[] bArr) {
        C4300a0.m18620a(bArr);
        mo21212k().mo21209h();
        MessageDigest x = C5254f9.m22847x();
        if (x != null) {
            return C5254f9.m22824a(x.digest(bArr));
        }
        mo21205d().mo21533t().mo21549a("Failed to get MD5");
        return 0;
    }

    /* renamed from: a */
    static <Builder extends C4932q5> Builder m22539a(Builder builder, byte[] bArr) throws zzfn {
        C5005u3 b = C5005u3.m21603b();
        if (b != null) {
            return builder.mo19395a(bArr, b);
        }
        return builder.mo19394a(bArr);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
