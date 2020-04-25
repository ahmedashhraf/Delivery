package org.apache.http.client.p532m;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15133c;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;
import org.apache.http.client.C15136b;
import org.apache.http.client.p530k.C15155k;
import org.apache.http.client.p531l.C15161f;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15228g;
import org.apache.http.cookie.C15230i;
import org.apache.http.cookie.C15232k;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.client.m.c */
/* compiled from: RequestAddCookies */
public class C15164c implements C15465q {

    /* renamed from: a */
    private final C15089a f44049a = C15096h.m66940c(C15164c.class);

    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        URI uri;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a)) {
            C15136b bVar = (C15136b) fVar.mo47685a(C15162a.f44041e);
            if (bVar == null) {
                this.f44049a.mo46779b("Cookie store not available in HTTP context");
                return;
            }
            C15230i iVar = (C15230i) fVar.mo47685a(C15162a.f44038b);
            if (iVar == null) {
                this.f44049a.mo46779b("CookieSpec registry not available in HTTP context");
                return;
            }
            C15460l lVar = (C15460l) fVar.mo47685a(C15429d.f44567d);
            if (lVar != null) {
                C15187k kVar = (C15187k) fVar.mo47685a(C15429d.f44564a);
                if (kVar != null) {
                    String a = C15161f.m67258a(oVar.getParams());
                    if (this.f44049a.mo46785d()) {
                        C15089a aVar = this.f44049a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("CookieSpec selected: ");
                        sb.append(a);
                        aVar.mo46776a(sb.toString());
                    }
                    if (oVar instanceof C15155k) {
                        uri = ((C15155k) oVar).mo46958k();
                    } else {
                        try {
                            uri = new URI(oVar.mo46956h().mo46856f());
                        } catch (URISyntaxException e) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid request URI: ");
                            sb2.append(oVar.mo46956h().mo46856f());
                            throw new ProtocolException(sb2.toString(), e);
                        }
                    }
                    String d = lVar.mo47782d();
                    int e2 = lVar.mo47783e();
                    if (e2 < 0) {
                        C15213e eVar = (C15213e) fVar.mo47685a(C15162a.f44037a);
                        if (eVar != null) {
                            e2 = eVar.mo47083a(lVar.mo47785f()).mo47075a(e2);
                        } else {
                            e2 = kVar.getRemotePort();
                        }
                    }
                    C15226e eVar2 = new C15226e(d, e2, uri.getPath(), kVar.mo47015d());
                    C15228g a2 = iVar.mo47134a(a, oVar.getParams());
                    ArrayList<C15223b> arrayList = new ArrayList<>(bVar.mo46924a());
                    ArrayList<C15223b> arrayList2 = new ArrayList<>();
                    Date date = new Date();
                    for (C15223b bVar2 : arrayList) {
                        String str = "Cookie ";
                        if (!bVar2.mo47101a(date)) {
                            if (a2.mo47130b(bVar2, eVar2)) {
                                if (this.f44049a.mo46785d()) {
                                    C15089a aVar2 = this.f44049a;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str);
                                    sb3.append(bVar2);
                                    sb3.append(" match ");
                                    sb3.append(eVar2);
                                    aVar2.mo46776a(sb3.toString());
                                }
                                arrayList2.add(bVar2);
                            }
                        } else if (this.f44049a.mo46785d()) {
                            C15089a aVar3 = this.f44049a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str);
                            sb4.append(bVar2);
                            sb4.append(" expired");
                            aVar3.mo46776a(sb4.toString());
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        for (C15133c a3 : a2.mo47125a(arrayList2)) {
                            oVar.mo47415a(a3);
                        }
                    }
                    int b = a2.mo47129b();
                    if (b > 0) {
                        boolean z = false;
                        for (C15223b bVar3 : arrayList2) {
                            if (b != bVar3.mo47102b() || !(bVar3 instanceof C15232k)) {
                                z = true;
                            }
                        }
                        if (z) {
                            C15133c a4 = a2.mo47127a();
                            if (a4 != null) {
                                oVar.mo47415a(a4);
                            }
                        }
                    }
                    fVar.mo47686a(C15162a.f44039c, a2);
                    fVar.mo47686a(C15162a.f44040d, eVar2);
                    return;
                }
                throw new IllegalStateException("Client connection not specified in HTTP context");
            }
            throw new IllegalStateException("Target host not specified in HTTP context");
        }
    }
}
