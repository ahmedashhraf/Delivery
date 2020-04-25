package org.apache.http.client.p533n;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.C15423j;
import org.apache.http.C15472x;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p547h0.C15337n;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15456d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

@C6144b
/* renamed from: org.apache.http.client.n.g */
/* compiled from: URLEncodedUtils */
public class C15176g {

    /* renamed from: a */
    public static final String f44065a = "application/x-www-form-urlencoded";

    /* renamed from: b */
    private static final String f44066b = "&";

    /* renamed from: c */
    private static final String f44067c = "=";

    /* renamed from: a */
    public static List<C15472x> m67293a(URI uri, String str) {
        List<C15472x> emptyList = Collections.emptyList();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        m67294a(arrayList, new Scanner(rawQuery), str);
        return arrayList;
    }

    /* renamed from: b */
    public static List<C15472x> m67297b(C15423j jVar) throws IOException {
        String str;
        List<C15472x> emptyList = Collections.emptyList();
        C15133c contentType = jVar.getContentType();
        String str2 = null;
        if (contentType != null) {
            C15236d[] b = contentType.mo46915b();
            if (b.length > 0) {
                C15236d dVar = b[0];
                str = dVar.getName();
                C15472x a = dVar.mo47151a(HttpRequest.f42450O);
                if (a != null) {
                    str2 = a.getValue();
                }
                if (str == null && str.equalsIgnoreCase("application/x-www-form-urlencoded")) {
                    String a2 = C15456d.m68498a(jVar, C15430e.f44596w);
                    if (a2 == null || a2.length() <= 0) {
                        return emptyList;
                    }
                    ArrayList arrayList = new ArrayList();
                    m67294a(arrayList, new Scanner(a2), str2);
                    return arrayList;
                }
            }
        }
        str = null;
        return str == null ? emptyList : emptyList;
    }

    /* renamed from: a */
    public static boolean m67295a(C15423j jVar) {
        C15133c contentType = jVar.getContentType();
        if (contentType != null) {
            C15236d[] b = contentType.mo46915b();
            if (b.length > 0) {
                return b[0].getName().equalsIgnoreCase("application/x-www-form-urlencoded");
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m67294a(List<C15472x> list, Scanner scanner, String str) {
        scanner.useDelimiter(f44066b);
        while (scanner.hasNext()) {
            String[] split = scanner.next().split(f44067c);
            if (split.length == 0 || split.length > 2) {
                throw new IllegalArgumentException("bad parameter");
            }
            String a = m67291a(split[0], str);
            String str2 = null;
            if (split.length == 2) {
                str2 = m67291a(split[1], str);
            }
            list.add(new C15337n(a, str2));
        }
    }

    /* renamed from: b */
    private static String m67296b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m67292a(List<? extends C15472x> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (C15472x xVar : list) {
            String b = m67296b(xVar.getName(), str);
            String value = xVar.getValue();
            String b2 = value != null ? m67296b(value, str) : "";
            if (sb.length() > 0) {
                sb.append(f44066b);
            }
            sb.append(b);
            sb.append(f44067c);
            sb.append(b2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m67291a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
