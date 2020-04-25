package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15233l;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.cookie.d */
/* compiled from: BasicClientCookie */
public class C15394d implements C15233l, C15222a, Cloneable {

    /* renamed from: N */
    private String f44517N;

    /* renamed from: O */
    private String f44518O;

    /* renamed from: P */
    private String f44519P;

    /* renamed from: Q */
    private Date f44520Q;

    /* renamed from: R */
    private String f44521R;

    /* renamed from: S */
    private boolean f44522S;

    /* renamed from: T */
    private int f44523T;

    /* renamed from: a */
    private final String f44524a;

    /* renamed from: b */
    private Map<String, String> f44525b;

    public C15394d(String str, String str2) {
        if (str != null) {
            this.f44524a = str;
            this.f44525b = new HashMap();
            this.f44517N = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: a */
    public void mo47142a(boolean z) {
        this.f44522S = z;
    }

    /* renamed from: b */
    public void mo47144b(Date date) {
        this.f44520Q = date;
    }

    /* renamed from: c */
    public String mo47103c() {
        return this.f44518O;
    }

    public Object clone() throws CloneNotSupportedException {
        C15394d dVar = (C15394d) super.clone();
        dVar.f44525b = new HashMap(this.f44525b);
        return dVar;
    }

    /* renamed from: d */
    public boolean mo47104d() {
        return this.f44522S;
    }

    /* renamed from: e */
    public void mo47146e(String str) {
        if (str != null) {
            this.f44519P = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.f44519P = null;
        }
    }

    /* renamed from: e */
    public int[] mo47105e() {
        return null;
    }

    /* renamed from: f */
    public void mo47147f(String str) {
        this.f44517N = str;
    }

    /* renamed from: g */
    public String mo47107g() {
        return null;
    }

    /* renamed from: g */
    public boolean mo47100g(String str) {
        return this.f44525b.get(str) != null;
    }

    public String getName() {
        return this.f44524a;
    }

    public String getPath() {
        return this.f44521R;
    }

    public String getValue() {
        return this.f44517N;
    }

    /* renamed from: h */
    public String mo47111h() {
        return this.f44519P;
    }

    /* renamed from: i */
    public boolean mo47112i() {
        return this.f44520Q != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[version: ");
        sb.append(Integer.toString(this.f44523T));
        String str = "]";
        sb.append(str);
        sb.append("[name: ");
        sb.append(this.f44524a);
        sb.append(str);
        sb.append("[value: ");
        sb.append(this.f44517N);
        sb.append(str);
        sb.append("[domain: ");
        sb.append(this.f44519P);
        sb.append(str);
        sb.append("[path: ");
        sb.append(this.f44521R);
        sb.append(str);
        sb.append("[expiry: ");
        sb.append(this.f44520Q);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo47141a(int i) {
        this.f44523T = i;
    }

    /* renamed from: b */
    public void mo47143b(String str) {
        this.f44521R = str;
    }

    /* renamed from: c */
    public void mo47145c(String str) {
        this.f44518O = str;
    }

    /* renamed from: f */
    public Date mo47106f() {
        return this.f44520Q;
    }

    /* renamed from: a */
    public boolean mo47101a(Date date) {
        if (date != null) {
            Date date2 = this.f44520Q;
            return date2 != null && date2.getTime() <= date.getTime();
        }
        throw new IllegalArgumentException("Date may not be null");
    }

    /* renamed from: b */
    public int mo47102b() {
        return this.f44523T;
    }

    /* renamed from: a */
    public void mo47671a(String str, String str2) {
        this.f44525b.put(str, str2);
    }

    /* renamed from: a */
    public String mo47099a(String str) {
        return (String) this.f44525b.get(str);
    }
}
