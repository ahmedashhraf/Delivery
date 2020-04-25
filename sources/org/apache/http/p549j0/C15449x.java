package org.apache.http.p549j0;

import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import org.apache.http.C15423j;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: org.apache.http.j0.x */
/* compiled from: ResponseContent */
public class C15449x implements C15468t {
    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws HttpException, IOException {
        if (rVar != null) {
            String str = "Transfer-Encoding";
            if (!rVar.mo47425e(str)) {
                String str2 = "Content-Length";
                if (!rVar.mo47425e(str2)) {
                    C15473y b = rVar.mo47468l().mo46912b();
                    C15423j g = rVar.mo47466g();
                    if (g != null) {
                        long contentLength = g.getContentLength();
                        if (g.mo47164c() && !b.mo47796d(C15471w.f44688Q)) {
                            rVar.mo47414a(str, C15430e.f44591r);
                        } else if (contentLength >= 0) {
                            rVar.mo47414a(str2, Long.toString(g.getContentLength()));
                        }
                        if (g.getContentType() != null && !rVar.mo47425e("Content-Type")) {
                            rVar.mo47415a(g.getContentType());
                        }
                        if (g.mo47161b() != null && !rVar.mo47425e("Content-Encoding")) {
                            rVar.mo47415a(g.mo47161b());
                            return;
                        }
                        return;
                    }
                    int c = rVar.mo47468l().mo46913c();
                    if (c != 204 && c != 304 && c != 205) {
                        rVar.mo47414a(str2, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Content-Length header already present");
            }
            throw new ProtocolException("Transfer-encoding header already present");
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
