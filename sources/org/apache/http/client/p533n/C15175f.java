package org.apache.http.client.p533n;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Stack;
import org.apache.http.C15460l;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.client.n.f */
/* compiled from: URIUtils */
public class C15175f {
    private C15175f() {
    }

    /* renamed from: a */
    public static URI m67284a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    /* renamed from: b */
    private static URI m67290b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri3);
        sb.append(uri2.toString());
        return URI.create(sb.toString());
    }

    /* renamed from: a */
    public static URI m67289a(URI uri, C15460l lVar, boolean z) throws URISyntaxException {
        if (uri != null) {
            String str = null;
            if (lVar != null) {
                String f = lVar.mo47785f();
                String d = lVar.mo47782d();
                int e = lVar.mo47783e();
                String rawPath = uri.getRawPath();
                String rawQuery = uri.getRawQuery();
                if (!z) {
                    str = uri.getRawFragment();
                }
                return m67284a(f, d, e, rawPath, rawQuery, str);
            }
            String rawPath2 = uri.getRawPath();
            String rawQuery2 = uri.getRawQuery();
            if (!z) {
                str = uri.getRawFragment();
            }
            return m67284a(null, null, -1, rawPath2, rawQuery2, str);
        }
        throw new IllegalArgumentException("URI may nor be null");
    }

    /* renamed from: a */
    public static URI m67288a(URI uri, C15460l lVar) throws URISyntaxException {
        return m67289a(uri, lVar, false);
    }

    /* renamed from: a */
    public static URI m67286a(URI uri, String str) {
        return m67287a(uri, URI.create(str));
    }

    /* renamed from: a */
    public static URI m67287a(URI uri, URI uri2) {
        if (uri == null) {
            throw new IllegalArgumentException("Base URI may nor be null");
        } else if (uri2 != null) {
            String uri3 = uri2.toString();
            if (uri3.startsWith("?")) {
                return m67290b(uri, uri2);
            }
            boolean z = uri3.length() == 0;
            if (z) {
                uri2 = URI.create("#");
            }
            URI resolve = uri.resolve(uri2);
            if (z) {
                String uri4 = resolve.toString();
                resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
            }
            return m67285a(resolve);
        } else {
            throw new IllegalArgumentException("Reference URI may nor be null");
        }
    }

    /* renamed from: a */
    private static URI m67285a(URI uri) {
        String path = uri.getPath();
        if (path == null || path.indexOf("/.") == -1) {
            return uri;
        }
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() != 0) {
                if (!".".equals(split[i])) {
                    if (!"..".equals(split[i])) {
                        stack.push(split[i]);
                    } else if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append('/');
            sb.append(str);
        }
        try {
            URI uri2 = new URI(uri.getScheme(), uri.getAuthority(), sb.toString(), uri.getQuery(), uri.getFragment());
            return uri2;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
