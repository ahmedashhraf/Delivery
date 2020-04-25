package org.apache.http.cookie;

import java.util.Locale;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.cookie.e */
/* compiled from: CookieOrigin */
public final class C15226e {

    /* renamed from: a */
    private final String f44145a;

    /* renamed from: b */
    private final int f44146b;

    /* renamed from: c */
    private final String f44147c;

    /* renamed from: d */
    private final boolean f44148d;

    public C15226e(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        } else if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 != null) {
            this.f44145a = str.toLowerCase(Locale.ENGLISH);
            this.f44146b = i;
            if (str2.trim().length() != 0) {
                this.f44147c = str2;
            } else {
                this.f44147c = "/";
            }
            this.f44148d = z;
        } else {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
    }

    /* renamed from: a */
    public String mo47118a() {
        return this.f44145a;
    }

    /* renamed from: b */
    public String mo47119b() {
        return this.f44147c;
    }

    /* renamed from: c */
    public int mo47120c() {
        return this.f44146b;
    }

    /* renamed from: d */
    public boolean mo47121d() {
        return this.f44148d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f44148d) {
            sb.append("(secure)");
        }
        sb.append(this.f44145a);
        sb.append(':');
        sb.append(Integer.toString(this.f44146b));
        sb.append(this.f44147c);
        sb.append(']');
        return sb.toString();
    }
}
