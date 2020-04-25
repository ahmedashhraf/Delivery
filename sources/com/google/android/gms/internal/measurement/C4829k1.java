package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import p201f.p202a.C5952h;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4829k1 {
    @C5952h

    /* renamed from: a */
    private final Map<String, Map<String, String>> f14235a;

    C4829k1(@C5952h Map<String, Map<String, String>> map) {
        this.f14235a = map;
    }

    /* renamed from: a */
    static C4829k1 m20469a() {
        return new C4829k1(null);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public final String mo19160a(@C5952h Uri uri, @C5952h String str, @C5952h String str2, String str3) {
        if (this.f14235a == null) {
            return null;
        }
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = (Map) this.f14235a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
