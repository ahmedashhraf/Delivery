package org.apache.http.p549j0;

import java.util.HashMap;
import java.util.Map;
import p205i.p489f.C14069f;

/* renamed from: org.apache.http.j0.b0 */
/* compiled from: UriPatternMatcher */
public class C15427b0 {

    /* renamed from: a */
    private final Map f44561a = new HashMap();

    /* renamed from: a */
    public void mo47710a(String str, Object obj) {
        if (str != null) {
            this.f44561a.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("URI request pattern may not be null");
    }

    /* renamed from: b */
    public void mo47713b(String str) {
        if (str != null) {
            this.f44561a.remove(str);
        }
    }

    /* renamed from: a */
    public void mo47711a(Map map) {
        if (map != null) {
            this.f44561a.clear();
            this.f44561a.putAll(map);
            return;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
    }

    /* renamed from: a */
    public Object mo47709a(String str) {
        if (str != null) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            Object obj = this.f44561a.get(str);
            if (obj == null) {
                String str2 = null;
                for (String str3 : this.f44561a.keySet()) {
                    if (mo47712a(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith(C14069f.f41343G)))) {
                        obj = this.f44561a.get(str3);
                        str2 = str3;
                    }
                }
            }
            return obj;
        }
        throw new IllegalArgumentException("Request URI may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47712a(String str, String str2) {
        String str3 = C14069f.f41343G;
        boolean z = true;
        if (str.equals(str3)) {
            return true;
        }
        if ((!str.endsWith(str3) || !str2.startsWith(str.substring(0, str.length() - 1))) && (!str.startsWith(str3) || !str2.endsWith(str.substring(1, str.length())))) {
            z = false;
        }
        return z;
    }
}
