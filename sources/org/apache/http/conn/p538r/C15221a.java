package org.apache.http.conn.p538r;

import java.util.regex.Pattern;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.conn.r.a */
/* compiled from: InetAddressUtils */
public class C15221a {

    /* renamed from: a */
    private static final Pattern f44132a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f44133b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f44134c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private C15221a() {
    }

    /* renamed from: a */
    public static boolean m67467a(String str) {
        return f44132a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m67468b(String str) {
        return m67470d(str) || m67469c(str);
    }

    /* renamed from: c */
    public static boolean m67469c(String str) {
        return f44134c.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m67470d(String str) {
        return f44133b.matcher(str).matches();
    }
}
