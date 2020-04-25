package p468g;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: g.h */
/* compiled from: Challenge */
public final class C13833h {

    /* renamed from: a */
    private final String f40009a;

    /* renamed from: b */
    private final Map<String, String> f40010b;

    public C13833h(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (map != null) {
            this.f40009a = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey() == null ? null : ((String) entry.getKey()).toLowerCase(Locale.US), entry.getValue());
            }
            this.f40010b = Collections.unmodifiableMap(linkedHashMap);
        } else {
            throw new NullPointerException("authParams == null");
        }
    }

    /* renamed from: a */
    public C13833h mo43473a(Charset charset) {
        if (charset != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f40010b);
            linkedHashMap.put(HttpRequest.f42450O, charset.name());
            return new C13833h(this.f40009a, (Map<String, String>) linkedHashMap);
        }
        throw new NullPointerException("charset == null");
    }

    /* renamed from: b */
    public Charset mo43475b() {
        String str = (String) this.f40010b.get(HttpRequest.f42450O);
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return C14910b.f43168k;
    }

    /* renamed from: c */
    public String mo43476c() {
        return (String) this.f40010b.get("realm");
    }

    /* renamed from: d */
    public String mo43477d() {
        return this.f40009a;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof C13833h) {
            C13833h hVar = (C13833h) obj;
            if (hVar.f40009a.equals(this.f40009a) && hVar.f40010b.equals(this.f40010b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f40009a.hashCode()) * 31) + this.f40010b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40009a);
        sb.append(" authParams=");
        sb.append(this.f40010b);
        return sb.toString();
    }

    /* renamed from: a */
    public Map<String, String> mo43474a() {
        return this.f40010b;
    }

    public C13833h(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 != null) {
            this.f40009a = str;
            this.f40010b = Collections.singletonMap("realm", str2);
        } else {
            throw new NullPointerException("realm == null");
        }
    }
}
