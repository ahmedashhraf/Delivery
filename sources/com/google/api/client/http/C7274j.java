package com.google.api.client.http;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6413s;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6417a;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6418b;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6419c;

/* renamed from: com.google.api.client.http.j */
/* compiled from: GenericUrl */
public class C7274j extends C6413s {

    /* renamed from: T */
    private static final C6418b f20576T = new C6419c("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: N */
    private String f20577N;

    /* renamed from: O */
    private String f20578O;

    /* renamed from: P */
    private String f20579P;

    /* renamed from: Q */
    private int f20580Q;

    /* renamed from: R */
    private List<String> f20581R;

    /* renamed from: S */
    private String f20582S;

    public C7274j() {
        this.f20580Q = -1;
    }

    /* renamed from: k */
    public static List<String> m35110k(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (z) {
            int indexOf = str.indexOf(47, i);
            boolean z2 = indexOf != -1;
            if (z2) {
                str2 = str.substring(i, indexOf);
            } else {
                str2 = str.substring(i);
            }
            arrayList.add(C6417a.m29796a(str2));
            i = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo28925a(int i) {
        C6381h0.m29667a(i >= -1, (Object) "expected port >= -1");
        this.f20580Q = i;
    }

    /* renamed from: c */
    public Object mo28929c(String str) {
        Object obj = get(str);
        if (!(obj instanceof Collection)) {
            return obj;
        }
        Iterator it = ((Collection) obj).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo28931d(String str) {
        this.f20582S = str;
    }

    /* renamed from: e */
    public final void mo28933e(String str) {
        this.f20578O = (String) C6381h0.m29663a(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C7274j)) {
            return false;
        }
        return mo28930d().equals(((C7274j) obj).toString());
    }

    /* renamed from: f */
    public final String mo28935f() {
        StringBuilder sb = new StringBuilder();
        if (this.f20581R != null) {
            m35106a(sb);
        }
        m35107a(entrySet(), sb);
        String str = this.f20582S;
        if (str != null) {
            sb.append('#');
            sb.append(f20576T.mo25853a(str));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo28938g(String str) {
        this.f20577N = (String) C6381h0.m29663a(str);
    }

    /* renamed from: h */
    public String mo28939h() {
        return this.f20578O;
    }

    public int hashCode() {
        return mo28930d().hashCode();
    }

    /* renamed from: i */
    public List<String> mo28943i() {
        return this.f20581R;
    }

    /* renamed from: j */
    public int mo28944j() {
        return this.f20580Q;
    }

    /* renamed from: l */
    public String mo28945l() {
        if (this.f20581R == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m35106a(sb);
        return sb.toString();
    }

    /* renamed from: m */
    public final String mo28946m() {
        return this.f20577N;
    }

    /* renamed from: n */
    public final String mo28947n() {
        return this.f20579P;
    }

    /* renamed from: o */
    public final URI mo28948o() {
        return mo25221l(mo28930d());
    }

    /* renamed from: p */
    public final URL mo28949p() {
        return mo25220j(mo28930d());
    }

    public String toString() {
        return mo28930d();
    }

    /* renamed from: j */
    private static URL mo25220j(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public C7274j m35116b(String str, Object obj) {
        return (C7274j) super.mo25098b(str, obj);
    }

    /* renamed from: d */
    public final String mo28930d() {
        String valueOf = String.valueOf(mo28932e());
        String valueOf2 = String.valueOf(mo28935f());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: e */
    public final String mo28932e() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) C6381h0.m29663a(this.f20577N));
        sb.append("://");
        String str = this.f20579P;
        if (str != null) {
            sb.append(C6417a.m29801f(str));
            sb.append('@');
        }
        sb.append((String) C6381h0.m29663a(this.f20578O));
        int i = this.f20580Q;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public String mo28937g() {
        return this.f20582S;
    }

    /* renamed from: h */
    public final void mo28940h(String str) {
        this.f20579P = str;
    }

    /* renamed from: i */
    public final URL mo28942i(String str) {
        try {
            return new URL(mo28949p(), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C7274j(String str) {
        this(mo25220j(str));
    }

    /* renamed from: a */
    public void mo28927a(List<String> list) {
        this.f20581R = list;
    }

    /* renamed from: b */
    public Collection<Object> mo28928b(String str) {
        Object obj = get(str);
        if (obj == null) {
            return Collections.emptySet();
        }
        if (obj instanceof Collection) {
            return Collections.unmodifiableCollection((Collection) obj);
        }
        return Collections.singleton(obj);
    }

    public C7274j clone() {
        C7274j jVar = (C7274j) super.clone();
        List<String> list = this.f20581R;
        if (list != null) {
            jVar.f20581R = new ArrayList(list);
        }
        return jVar;
    }

    public C7274j(URI uri) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo());
    }

    /* renamed from: a */
    public void mo28926a(String str) {
        if (str != null && str.length() != 0) {
            List<String> k = m35110k(str);
            List<String> list = this.f20581R;
            if (list == null || list.isEmpty()) {
                this.f20581R = k;
                return;
            }
            int size = this.f20581R.size();
            List<String> list2 = this.f20581R;
            int i = size - 1;
            String valueOf = String.valueOf((String) list2.get(i));
            String valueOf2 = String.valueOf((String) k.get(0));
            list2.set(i, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            this.f20581R.addAll(k.subList(1, k.size()));
        }
    }

    public C7274j(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    /* renamed from: l */
    private static URI mo25221l(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C7274j(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.f20580Q = -1;
        this.f20577N = str.toLowerCase();
        this.f20578O = str2;
        this.f20580Q = i;
        this.f20581R = m35110k(str3);
        String str7 = null;
        this.f20582S = str4 != null ? C6417a.m29796a(str4) : null;
        if (str5 != null) {
            C7273i0.m35101a(str5, (Object) this);
        }
        if (str6 != null) {
            str7 = C6417a.m29796a(str6);
        }
        this.f20579P = str7;
    }

    /* renamed from: f */
    public void mo28936f(String str) {
        this.f20581R = m35110k(str);
    }

    /* renamed from: a */
    private void m35106a(StringBuilder sb) {
        int size = this.f20581R.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f20581R.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(C6417a.m29798c(str));
            }
        }
    }

    /* renamed from: a */
    static void m35107a(Set<Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Entry entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String e = C6417a.m29800e((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object a : (Collection) value) {
                        z = m35108a(z, sb, e, a);
                    }
                } else {
                    z = m35108a(z, sb, e, value);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m35108a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append(C14662d0.f42852c);
        }
        sb.append(str);
        String e = C6417a.m29800e(obj.toString());
        if (e.length() != 0) {
            sb.append('=');
            sb.append(e);
        }
        return z;
    }
}
