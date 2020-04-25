package org.apache.http.p541f0.p544n;

import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.C15462n;
import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.p540e0.C15242e;
import org.apache.http.p548i0.C15352d;
import org.apache.http.p549j0.C15430e;

/* renamed from: org.apache.http.f0.n.c */
/* compiled from: LaxContentLengthStrategy */
public class C15297c implements C15242e {
    /* renamed from: a */
    public long mo47169a(C15462n nVar) throws HttpException {
        long j;
        if (nVar != null) {
            boolean e = nVar.getParams().mo47545e(C15352d.f44433I);
            C15133c f = nVar.mo47426f("Transfer-Encoding");
            String str = "Content-Length";
            C15133c f2 = nVar.mo47426f(str);
            if (f != null) {
                try {
                    C15236d[] b = f.mo46915b();
                    String str2 = C15430e.f44591r;
                    String str3 = C15430e.f44592s;
                    if (e) {
                        int i = 0;
                        while (i < b.length) {
                            String name = b[i].getName();
                            if (name == null || name.length() <= 0 || name.equalsIgnoreCase(str2) || name.equalsIgnoreCase(str3)) {
                                i++;
                            } else {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Unsupported transfer encoding: ");
                                stringBuffer.append(name);
                                throw new ProtocolException(stringBuffer.toString());
                            }
                        }
                    }
                    int length = b.length;
                    if (str3.equalsIgnoreCase(f.getValue())) {
                        return -1;
                    }
                    if (length > 0 && str2.equalsIgnoreCase(b[length - 1].getName())) {
                        return -2;
                    }
                    if (!e) {
                        return -1;
                    }
                    throw new ProtocolException("Chunk-encoding must be the last one applied");
                } catch (ParseException e2) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid Transfer-Encoding header value: ");
                    stringBuffer2.append(f);
                    throw new ProtocolException(stringBuffer2.toString(), e2);
                }
            } else {
                if (f2 != null) {
                    C15133c[] c = nVar.mo47422c(str);
                    if (!e || c.length <= 1) {
                        int length2 = c.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                j = -1;
                                break;
                            }
                            C15133c cVar = c[length2];
                            try {
                                j = Long.parseLong(cVar.getValue());
                                break;
                            } catch (NumberFormatException unused) {
                                if (!e) {
                                    length2--;
                                } else {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("Invalid content length: ");
                                    stringBuffer3.append(cVar.getValue());
                                    throw new ProtocolException(stringBuffer3.toString());
                                }
                            }
                        }
                        if (j >= 0) {
                            return j;
                        }
                    } else {
                        throw new ProtocolException("Multiple content length headers");
                    }
                }
                return -1;
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
