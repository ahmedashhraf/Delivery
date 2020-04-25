package org.apache.http.auth;

import java.util.Locale;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15458f;

@C6144b
/* renamed from: org.apache.http.auth.e */
/* compiled from: AuthScope */
public class C15122e {

    /* renamed from: e */
    public static final String f43985e = null;

    /* renamed from: f */
    public static final int f43986f = -1;

    /* renamed from: g */
    public static final String f43987g = null;

    /* renamed from: h */
    public static final String f43988h = null;

    /* renamed from: i */
    public static final C15122e f43989i = new C15122e(f43985e, -1, f43987g, f43988h);

    /* renamed from: a */
    private final String f43990a;

    /* renamed from: b */
    private final String f43991b;

    /* renamed from: c */
    private final String f43992c;

    /* renamed from: d */
    private final int f43993d;

    public C15122e(String str, int i, String str2, String str3) {
        this.f43992c = str == null ? f43985e : str.toLowerCase(Locale.ENGLISH);
        if (i < 0) {
            i = -1;
        }
        this.f43993d = i;
        if (str2 == null) {
            str2 = f43987g;
        }
        this.f43991b = str2;
        this.f43990a = str3 == null ? f43988h : str3.toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public String mo46880a() {
        return this.f43992c;
    }

    /* renamed from: b */
    public int mo46881b() {
        return this.f43993d;
    }

    /* renamed from: c */
    public String mo46882c() {
        return this.f43991b;
    }

    /* renamed from: d */
    public String mo46883d() {
        return this.f43990a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15122e)) {
            return super.equals(obj);
        }
        C15122e eVar = (C15122e) obj;
        if (C15458f.m68507a((Object) this.f43992c, (Object) eVar.f43992c) && this.f43993d == eVar.f43993d && C15458f.m68507a((Object) this.f43991b, (Object) eVar.f43991b) && C15458f.m68507a((Object) this.f43990a, (Object) eVar.f43990a)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C15458f.m68505a(C15458f.m68505a(C15458f.m68504a(C15458f.m68505a(17, (Object) this.f43992c), this.f43993d), (Object) this.f43991b), (Object) this.f43990a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f43990a;
        if (str != null) {
            stringBuffer.append(str.toUpperCase(Locale.ENGLISH));
            stringBuffer.append(' ');
        }
        if (this.f43991b != null) {
            stringBuffer.append('\'');
            stringBuffer.append(this.f43991b);
            stringBuffer.append('\'');
        } else {
            stringBuffer.append("<any realm>");
        }
        if (this.f43992c != null) {
            stringBuffer.append('@');
            stringBuffer.append(this.f43992c);
            if (this.f43993d >= 0) {
                stringBuffer.append(':');
                stringBuffer.append(this.f43993d);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public int mo46879a(C15122e eVar) {
        int i;
        if (C15458f.m68507a((Object) this.f43990a, (Object) eVar.f43990a)) {
            i = 1;
        } else {
            String str = this.f43990a;
            String str2 = f43988h;
            if (str != str2 && eVar.f43990a != str2) {
                return -1;
            }
            i = 0;
        }
        if (C15458f.m68507a((Object) this.f43991b, (Object) eVar.f43991b)) {
            i += 2;
        } else {
            String str3 = this.f43991b;
            String str4 = f43987g;
            if (!(str3 == str4 || eVar.f43991b == str4)) {
                return -1;
            }
        }
        int i2 = this.f43993d;
        int i3 = eVar.f43993d;
        if (i2 == i3) {
            i += 4;
        } else if (!(i2 == -1 || i3 == -1)) {
            return -1;
        }
        if (C15458f.m68507a((Object) this.f43992c, (Object) eVar.f43992c)) {
            i += 8;
        } else {
            String str5 = this.f43992c;
            String str6 = f43985e;
            if (str5 == str6 || eVar.f43992c == str6) {
                return i;
            }
            return -1;
        }
        return i;
    }

    public C15122e(String str, int i, String str2) {
        this(str, i, str2, f43988h);
    }

    public C15122e(String str, int i) {
        this(str, i, f43987g, f43988h);
    }

    public C15122e(C15122e eVar) {
        if (eVar != null) {
            this.f43992c = eVar.mo46880a();
            this.f43993d = eVar.mo46881b();
            this.f43991b = eVar.mo46882c();
            this.f43990a = eVar.mo46883d();
            return;
        }
        throw new IllegalArgumentException("Scope may not be null");
    }
}
