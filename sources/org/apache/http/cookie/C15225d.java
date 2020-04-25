package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.cookie.d */
/* compiled from: CookieIdentityComparator */
public class C15225d implements Serializable, Comparator<C15223b> {
    private static final long serialVersionUID = 4466565437490631532L;

    /* renamed from: a */
    public int compare(C15223b bVar, C15223b bVar2) {
        int compareTo = bVar.getName().compareTo(bVar2.getName());
        if (compareTo == 0) {
            String h = bVar.mo47111h();
            String str = ".local";
            String str2 = "";
            if (h == null) {
                h = str2;
            } else if (h.indexOf(46) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(h);
                sb.append(str);
                h = sb.toString();
            }
            String h2 = bVar2.mo47111h();
            if (h2 != null) {
                if (h2.indexOf(46) == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(h2);
                    sb2.append(str);
                    str2 = sb2.toString();
                } else {
                    str2 = h2;
                }
            }
            compareTo = h.compareToIgnoreCase(str2);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String path = bVar.getPath();
        String str3 = "/";
        if (path == null) {
            path = str3;
        }
        String path2 = bVar2.getPath();
        if (path2 == null) {
            path2 = str3;
        }
        return path.compareTo(path2);
    }
}
