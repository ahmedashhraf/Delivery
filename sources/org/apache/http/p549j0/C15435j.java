package org.apache.http.p549j0;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.http.C15316g;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.p548i0.C15352d;

/* renamed from: org.apache.http.j0.j */
/* compiled from: HttpRequestExecutor */
public class C15435j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47720a(C15463o oVar, C15466r rVar) {
        boolean z = false;
        if ("HEAD".equalsIgnoreCase(oVar.mo46956h().mo46855e())) {
            return false;
        }
        int c = rVar.mo47468l().mo46913c();
        if (!(c < 200 || c == 204 || c == 304 || c == 205)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15466r mo47721b(C15463o oVar, C15316g gVar, C15431f fVar) throws IOException, HttpException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (fVar != null) {
            fVar.mo47686a(C15429d.f44564a, gVar);
            Boolean bool = Boolean.FALSE;
            String str = C15429d.f44569f;
            fVar.mo47686a(str, bool);
            gVar.sendRequestHeader(oVar);
            C15466r rVar = null;
            if (oVar instanceof C15452k) {
                boolean z = true;
                C15473y b = oVar.mo46956h().mo46854b();
                C15452k kVar = (C15452k) oVar;
                if (kVar.mo46952i() && !b.mo47796d(C15471w.f44688Q)) {
                    gVar.flush();
                    if (gVar.mo47180a(oVar.getParams().mo47541b(C15352d.f44435K, 2000))) {
                        C15466r a = gVar.mo47177a();
                        if (mo47720a(oVar, a)) {
                            gVar.mo47179a(a);
                        }
                        int c = a.mo47468l().mo46913c();
                        if (c >= 200) {
                            z = false;
                            rVar = a;
                        } else if (c != 100) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unexpected response: ");
                            stringBuffer.append(a.mo47468l());
                            throw new ProtocolException(stringBuffer.toString());
                        }
                    }
                }
                if (z) {
                    gVar.sendRequestEntity(kVar);
                }
            }
            gVar.flush();
            fVar.mo47686a(str, Boolean.TRUE);
            return rVar;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: c */
    public C15466r mo47722c(C15463o oVar, C15316g gVar, C15431f fVar) throws IOException, HttpException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        } else if (fVar != null) {
            try {
                C15466r b = mo47721b(oVar, gVar, fVar);
                return b == null ? mo47717a(oVar, gVar, fVar) : b;
            } catch (IOException e) {
                gVar.close();
                throw e;
            } catch (HttpException e2) {
                gVar.close();
                throw e2;
            } catch (RuntimeException e3) {
                gVar.close();
                throw e3;
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: a */
    public void mo47718a(C15463o oVar, C15434i iVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (iVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (fVar != null) {
            fVar.mo47686a(C15429d.f44565b, oVar);
            iVar.mo46975a(oVar, fVar);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15466r mo47717a(C15463o oVar, C15316g gVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (fVar != null) {
            C15466r rVar = null;
            int i = 0;
            while (true) {
                if (rVar != null && i >= 200) {
                    return rVar;
                }
                rVar = gVar.mo47177a();
                if (mo47720a(oVar, rVar)) {
                    gVar.mo47179a(rVar);
                }
                i = rVar.mo47468l().mo46913c();
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: a */
    public void mo47719a(C15466r rVar, C15434i iVar, C15431f fVar) throws HttpException, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (iVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (fVar != null) {
            fVar.mo47686a(C15429d.f44566c, rVar);
            iVar.mo46976a(rVar, fVar);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
