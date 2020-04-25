package org.apache.http.client.p529j;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.C15472x;
import org.apache.http.client.p533n.C15176g;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p540e0.C15249l;

@C6145c
/* renamed from: org.apache.http.client.j.a */
/* compiled from: UrlEncodedFormEntity */
public class C15144a extends C15249l {
    public C15144a(List<? extends C15472x> list, String str) throws UnsupportedEncodingException {
        super(C15176g.m67292a(list, str), str);
        StringBuilder sb = new StringBuilder();
        sb.append("application/x-www-form-urlencoded; charset=");
        if (str == null) {
            str = "ISO-8859-1";
        }
        sb.append(str);
        mo47162b(sb.toString());
    }

    public C15144a(List<? extends C15472x> list) throws UnsupportedEncodingException {
        this(list, "ISO-8859-1");
    }
}
