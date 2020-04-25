package p076c.p082c.p083a.p088u.p095j;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: c.c.a.u.j.d */
/* compiled from: GlideUrl */
public class C2395d {

    /* renamed from: f */
    private static final String f9354f = "@#&=*+-_.,:!?()/~'%";

    /* renamed from: a */
    private final URL f9355a;

    /* renamed from: b */
    private final C2396e f9356b;

    /* renamed from: c */
    private final String f9357c;

    /* renamed from: d */
    private String f9358d;

    /* renamed from: e */
    private URL f9359e;

    public C2395d(URL url) {
        this(url, C2396e.f9361b);
    }

    /* renamed from: e */
    private String m12230e() {
        if (TextUtils.isEmpty(this.f9358d)) {
            String str = this.f9357c;
            if (TextUtils.isEmpty(str)) {
                str = this.f9355a.toString();
            }
            this.f9358d = Uri.encode(str, f9354f);
        }
        return this.f9358d;
    }

    /* renamed from: f */
    private URL m12231f() throws MalformedURLException {
        if (this.f9359e == null) {
            this.f9359e = new URL(m12230e());
        }
        return this.f9359e;
    }

    /* renamed from: a */
    public String mo9818a() {
        String str = this.f9357c;
        return str != null ? str : this.f9355a.toString();
    }

    /* renamed from: b */
    public Map<String, String> mo9819b() {
        return this.f9356b.mo9825a();
    }

    /* renamed from: c */
    public String mo9820c() {
        return m12230e();
    }

    /* renamed from: d */
    public URL mo9821d() throws MalformedURLException {
        return m12231f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2395d)) {
            return false;
        }
        C2395d dVar = (C2395d) obj;
        if (!mo9818a().equals(dVar.mo9818a()) || !this.f9356b.equals(dVar.f9356b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo9818a().hashCode() * 31) + this.f9356b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo9818a());
        sb.append(10);
        sb.append(this.f9356b.toString());
        return sb.toString();
    }

    public C2395d(String str) {
        this(str, C2396e.f9361b);
    }

    public C2395d(URL url, C2396e eVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (eVar != null) {
            this.f9355a = url;
            this.f9357c = null;
            this.f9356b = eVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public C2395d(String str, C2396e eVar) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("String url must not be empty or null: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (eVar != null) {
            this.f9357c = str;
            this.f9355a = null;
            this.f9356b = eVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }
}
