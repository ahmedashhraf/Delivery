package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.C15133c;
import org.apache.http.C15462n;
import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.p546g0.C15318b;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p547h0.C15335l;
import org.apache.http.p547h0.C15346w;
import org.apache.http.p548i0.C15351c;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.a */
/* compiled from: AbstractMessageParser */
public abstract class C15299a implements C15318b {

    /* renamed from: a */
    private final C15321e f44305a;

    /* renamed from: b */
    private final int f44306b;

    /* renamed from: c */
    private final int f44307c;

    /* renamed from: d */
    protected final C15346w f44308d;

    public C15299a(C15321e eVar, C15346w wVar, C15357i iVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (iVar != null) {
            this.f44305a = eVar;
            this.f44306b = iVar.mo47541b(C15351c.f44422C, -1);
            this.f44307c = iVar.mo47541b(C15351c.f44421B, -1);
            if (wVar == null) {
                wVar = C15335l.f44393b;
            }
            this.f44308d = wVar;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: a */
    public static C15133c[] m67772a(C15321e eVar, int i, int i2, C15346w wVar) throws HttpException, IOException {
        int i3;
        if (eVar != null) {
            if (wVar == null) {
                wVar = C15335l.f44393b;
            }
            ArrayList arrayList = new ArrayList();
            C15454b bVar = null;
            C15454b bVar2 = null;
            while (true) {
                if (bVar == null) {
                    bVar = new C15454b(64);
                } else {
                    bVar.mo47768c();
                }
                i3 = 0;
                if (eVar.mo47265a(bVar) == -1 || bVar.mo47772f() < 1) {
                    C15133c[] cVarArr = new C15133c[arrayList.size()];
                } else {
                    if ((bVar.mo47752a(0) == ' ' || bVar.mo47752a(0) == 9) && bVar2 != null) {
                        while (i3 < bVar.mo47772f()) {
                            char a = bVar.mo47752a(i3);
                            if (a != ' ' && a != 9) {
                                break;
                            }
                            i3++;
                        }
                        if (i2 <= 0 || ((bVar2.mo47772f() + 1) + bVar.mo47772f()) - i3 <= i2) {
                            bVar2.mo47755a(' ');
                            bVar2.mo47760a(bVar, i3, bVar.mo47772f() - i3);
                        } else {
                            throw new IOException("Maximum line length limit exceeded");
                        }
                    } else {
                        arrayList.add(bVar);
                        bVar2 = bVar;
                        bVar = null;
                    }
                    if (i > 0 && arrayList.size() >= i) {
                        throw new IOException("Maximum header count exceeded");
                    }
                }
            }
            C15133c[] cVarArr2 = new C15133c[arrayList.size()];
            while (i3 < arrayList.size()) {
                try {
                    cVarArr2[i3] = wVar.mo47481a((C15454b) arrayList.get(i3));
                    i3++;
                } catch (ParseException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            return cVarArr2;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C15462n mo47259a(C15321e eVar) throws IOException, HttpException, ParseException;

    /* renamed from: a */
    public C15462n mo47367a() throws IOException, HttpException {
        try {
            C15462n a = mo47259a(this.f44305a);
            a.mo47417a(m67772a(this.f44305a, this.f44306b, this.f44307c, this.f44308d));
            return a;
        } catch (ParseException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }
}
