package org.apache.http.p549j0;

import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: org.apache.http.j0.r */
/* compiled from: RequestContent */
public class C15443r implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar != null) {
            if (oVar instanceof C15452k) {
                String str = "Transfer-Encoding";
                if (!oVar.mo47425e(str)) {
                    String str2 = "Content-Length";
                    if (!oVar.mo47425e(str2)) {
                        C15473y b = oVar.mo46956h().mo46854b();
                        C15423j g = ((C15452k) oVar).mo46951g();
                        if (g == null) {
                            oVar.mo47414a(str2, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                            return;
                        }
                        if (!g.mo47164c() && g.getContentLength() >= 0) {
                            oVar.mo47414a(str2, Long.toString(g.getContentLength()));
                        } else if (!b.mo47796d(C15471w.f44688Q)) {
                            oVar.mo47414a(str, C15430e.f44591r);
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Chunked transfer encoding not allowed for ");
                            stringBuffer.append(b);
                            throw new ProtocolException(stringBuffer.toString());
                        }
                        if (g.getContentType() != null && !oVar.mo47425e("Content-Type")) {
                            oVar.mo47415a(g.getContentType());
                        }
                        if (g.mo47161b() != null && !oVar.mo47425e("Content-Encoding")) {
                            oVar.mo47415a(g.mo47161b());
                        }
                    } else {
                        throw new ProtocolException("Content-Length header already present");
                    }
                } else {
                    throw new ProtocolException("Transfer-encoding header already present");
                }
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
