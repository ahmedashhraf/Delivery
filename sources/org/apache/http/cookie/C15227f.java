package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.cookie.f */
/* compiled from: CookiePathComparator */
public class C15227f implements Serializable, Comparator<C15223b> {
    private static final long serialVersionUID = 7523645369616405818L;

    /* renamed from: a */
    private String m67490a(C15223b bVar) {
        String path = bVar.getPath();
        String str = "/";
        if (path == null) {
            path = str;
        }
        if (path.endsWith(str)) {
            return path;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append('/');
        return sb.toString();
    }

    /* renamed from: a */
    public int compare(C15223b bVar, C15223b bVar2) {
        String a = m67490a(bVar);
        String a2 = m67490a(bVar2);
        if (a.equals(a2)) {
            return 0;
        }
        if (a.startsWith(a2)) {
            return -1;
        }
        if (a2.startsWith(a)) {
            return 1;
        }
        return 0;
    }
}
