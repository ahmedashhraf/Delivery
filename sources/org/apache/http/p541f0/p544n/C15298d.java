package org.apache.http.p541f0.p544n;

import org.apache.http.C15133c;
import org.apache.http.C15462n;
import org.apache.http.C15471w;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;
import org.apache.http.p540e0.C15242e;
import org.apache.http.p549j0.C15430e;

/* renamed from: org.apache.http.f0.n.d */
/* compiled from: StrictContentLengthStrategy */
public class C15298d implements C15242e {
    /* renamed from: a */
    public long mo47169a(C15462n nVar) throws HttpException {
        if (nVar != null) {
            C15133c f = nVar.mo47426f("Transfer-Encoding");
            C15133c f2 = nVar.mo47426f("Content-Length");
            if (f != null) {
                String value = f.getValue();
                if (C15430e.f44591r.equalsIgnoreCase(value)) {
                    if (!nVar.mo46955b().mo47796d(C15471w.f44688Q)) {
                        return -2;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Chunked transfer encoding not allowed for ");
                    stringBuffer.append(nVar.mo46955b());
                    throw new ProtocolException(stringBuffer.toString());
                } else if (C15430e.f44592s.equalsIgnoreCase(value)) {
                    return -1;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Unsupported transfer encoding: ");
                    stringBuffer2.append(value);
                    throw new ProtocolException(stringBuffer2.toString());
                }
            } else if (f2 == null) {
                return -1;
            } else {
                String value2 = f2.getValue();
                try {
                    return Long.parseLong(value2);
                } catch (NumberFormatException unused) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Invalid content length: ");
                    stringBuffer3.append(value2);
                    throw new ProtocolException(stringBuffer3.toString());
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
