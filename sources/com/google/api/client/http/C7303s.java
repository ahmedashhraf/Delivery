package com.google.api.client.http;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.google.api.client.http.s */
/* compiled from: HttpMediaType */
public final class C7303s {

    /* renamed from: e */
    private static final Pattern f20657e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    private static final Pattern f20658f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    private static final Pattern f20659g;

    /* renamed from: h */
    private static final Pattern f20660h;

    /* renamed from: a */
    private String f20661a = "application";

    /* renamed from: b */
    private String f20662b = "octet-stream";

    /* renamed from: c */
    private final SortedMap<String, String> f20663c = new TreeMap();

    /* renamed from: d */
    private String f20664d;

    static {
        String str = "[^\\s/=;\"]+";
        String str2 = ";.*";
        StringBuilder sb = new StringBuilder(str.length() + 14 + str.length() + str2.length());
        String str3 = "\\s*(";
        sb.append(str3);
        sb.append(str);
        sb.append(")/(");
        sb.append(str);
        String str4 = ")";
        sb.append(str4);
        sb.append(str3);
        sb.append(str2);
        sb.append(")?");
        f20659g = Pattern.compile(sb.toString(), 32);
        String str5 = "\"([^\"]*)\"";
        String str6 = "[^\\s;\"]*";
        StringBuilder sb2 = new StringBuilder(str5.length() + 1 + str6.length());
        sb2.append(str5);
        sb2.append("|");
        sb2.append(str6);
        String valueOf = String.valueOf(String.valueOf(sb2.toString()));
        StringBuilder sb3 = new StringBuilder(str.length() + 12 + valueOf.length());
        sb3.append("\\s*;\\s*(");
        sb3.append(str);
        sb3.append(str4);
        sb3.append("=(");
        sb3.append(valueOf);
        sb3.append(str4);
        f20660h = Pattern.compile(sb3.toString());
    }

    public C7303s(String str, String str2) {
        mo29071d(str);
        mo29069c(str2);
    }

    /* renamed from: g */
    private static String m35307g(String str) {
        String str2 = "\"";
        String valueOf = String.valueOf(String.valueOf(str.replace("\\", "\\\\").replace(str2, "\\\"")));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2);
        sb.append(str2);
        sb.append(valueOf);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public C7303s mo29062a(String str, String str2) {
        if (str2 == null) {
            mo29067b(str);
            return this;
        }
        C6381h0.m29667a(f20658f.matcher(str).matches(), (Object) "Name contains reserved characters");
        this.f20664d = null;
        this.f20663c.put(str.toLowerCase(), str2);
        return this;
    }

    /* renamed from: b */
    public C7303s mo29067b(String str) {
        this.f20664d = null;
        this.f20663c.remove(str.toLowerCase());
        return this;
    }

    /* renamed from: c */
    public C7303s mo29069c(String str) {
        C6381h0.m29667a(f20657e.matcher(str).matches(), (Object) "Subtype contains reserved characters");
        this.f20662b = str;
        this.f20664d = null;
        return this;
    }

    /* renamed from: d */
    public C7303s mo29071d(String str) {
        C6381h0.m29667a(f20657e.matcher(str).matches(), (Object) "Type contains reserved characters");
        this.f20661a = str;
        this.f20664d = null;
        return this;
    }

    /* renamed from: e */
    public String mo29073e() {
        return this.f20662b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C7303s)) {
            return false;
        }
        C7303s sVar = (C7303s) obj;
        if (mo29066a(sVar) && this.f20663c.equals(sVar.f20663c)) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public String mo29075f() {
        return this.f20661a;
    }

    public int hashCode() {
        return mo29064a().hashCode();
    }

    public String toString() {
        return mo29064a();
    }

    /* renamed from: e */
    private C7303s m35305e(String str) {
        Matcher matcher = f20659g.matcher(str);
        C6381h0.m29667a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        mo29071d(matcher.group(1));
        mo29069c(matcher.group(2));
        String group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = f20660h.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                mo29062a(group2, group3);
            }
        }
        return this;
    }

    /* renamed from: f */
    static boolean m35306f(String str) {
        return f20658f.matcher(str).matches();
    }

    /* renamed from: b */
    public void mo29068b() {
        this.f20664d = null;
        this.f20663c.clear();
    }

    /* renamed from: c */
    public Charset mo29070c() {
        String a = mo29065a(HttpRequest.f42450O);
        if (a == null) {
            return null;
        }
        return Charset.forName(a);
    }

    /* renamed from: d */
    public Map<String, String> mo29072d() {
        return Collections.unmodifiableMap(this.f20663c);
    }

    /* renamed from: b */
    public static boolean m35304b(String str, String str2) {
        return (str == null && str2 == null) || !(str == null || str2 == null || !new C7303s(str).mo29066a(new C7303s(str2)));
    }

    /* renamed from: a */
    public String mo29065a(String str) {
        return (String) this.f20663c.get(str.toLowerCase());
    }

    /* renamed from: a */
    public String mo29064a() {
        String str = this.f20664d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20661a);
        sb.append('/');
        sb.append(this.f20662b);
        SortedMap<String, String> sortedMap = this.f20663c;
        if (sortedMap != null) {
            for (Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!m35306f(str2)) {
                    str2 = m35307g(str2);
                }
                sb.append(str2);
            }
        }
        this.f20664d = sb.toString();
        return this.f20664d;
    }

    public C7303s(String str) {
        m35305e(str);
    }

    /* renamed from: a */
    public boolean mo29066a(C7303s sVar) {
        return sVar != null && mo29075f().equalsIgnoreCase(sVar.mo29075f()) && mo29073e().equalsIgnoreCase(sVar.mo29073e());
    }

    /* renamed from: a */
    public C7303s mo29063a(Charset charset) {
        mo29062a(HttpRequest.f42450O, charset == null ? null : charset.name());
        return this;
    }
}
