package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;
import org.apache.http.p548i0.C15359k;

/* renamed from: org.apache.http.j0.v */
/* compiled from: RequestUserAgent */
public class C15447v implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar != null) {
            String str = "User-Agent";
            if (!oVar.mo47425e(str)) {
                String c = C15359k.m68044c(oVar.getParams());
                if (c != null) {
                    oVar.mo47414a(str, c);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
