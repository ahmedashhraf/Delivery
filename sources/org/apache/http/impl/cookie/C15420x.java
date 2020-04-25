package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p217i1.C14662d0;
import org.apache.http.C15133c;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15227f;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.cookie.x */
/* compiled from: RFC2109Spec */
public class C15420x extends C15409o {

    /* renamed from: d */
    private static final C15227f f44553d = new C15227f();

    /* renamed from: e */
    private static final String[] f44554e = {"EEE, dd MMM yyyy HH:mm:ss zzz", C15410p.f44537b, C15410p.f44538c};

    /* renamed from: b */
    private final String[] f44555b;

    /* renamed from: c */
    private final boolean f44556c;

    public C15420x(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f44555b = (String[]) strArr.clone();
        } else {
            this.f44555b = f44554e;
        }
        this.f44556c = z;
        mo47666a("version", new C15422z());
        mo47666a(C15222a.f44141w, new C15403i());
        mo47666a(C15222a.f44142x, new C15419w());
        mo47666a(C15222a.f44143y, new C15402h());
        mo47666a(C15222a.f44144z, new C15404j());
        mo47666a(C15222a.f44135A, new C15396e());
        mo47666a(C15222a.f44136B, new C15400g(this.f44555b));
    }

    /* renamed from: b */
    private List<C15133c> m68348b(List<C15223b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C15223b bVar : list) {
            int b = bVar.mo47102b();
            C15454b bVar2 = new C15454b(40);
            bVar2.mo47757a("Cookie: ");
            bVar2.mo47757a("$Version=");
            bVar2.mo47757a(Integer.toString(b));
            bVar2.mo47757a("; ");
            mo47674a(bVar2, bVar, b);
            arrayList.add(new C15341r(bVar2));
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<C15133c> m68349c(List<C15223b> list) {
        int i = Integer.MAX_VALUE;
        for (C15223b bVar : list) {
            if (bVar.mo47102b() < i) {
                i = bVar.mo47102b();
            }
        }
        C15454b bVar2 = new C15454b(list.size() * 40);
        bVar2.mo47757a("Cookie");
        bVar2.mo47757a(": ");
        bVar2.mo47757a("$Version=");
        bVar2.mo47757a(Integer.toString(i));
        for (C15223b bVar3 : list) {
            bVar2.mo47757a("; ");
            mo47674a(bVar2, bVar3, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C15341r(bVar2));
        return arrayList;
    }

    /* renamed from: a */
    public List<C15223b> mo47126a(C15133c cVar, C15226e eVar) throws MalformedCookieException {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie")) {
            return mo47673a(cVar.mo46915b(), eVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new MalformedCookieException(sb.toString());
        }
    }

    /* renamed from: a */
    public C15133c mo47127a() {
        return null;
    }

    /* renamed from: b */
    public int mo47129b() {
        return 1;
    }

    public String toString() {
        return C15160e.f44034c;
    }

    /* renamed from: a */
    public void mo47128a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar != null) {
            String name = bVar.getName();
            if (name.indexOf(32) != -1) {
                throw new MalformedCookieException("Cookie name may not contain blanks");
            } else if (!name.startsWith("$")) {
                super.mo47128a(bVar, eVar);
            } else {
                throw new MalformedCookieException("Cookie name may not start with $");
            }
        } else {
            throw new IllegalArgumentException("Cookie may not be null");
        }
    }

    public C15420x() {
        this(null, false);
    }

    /* renamed from: a */
    public List<C15133c> mo47125a(List<C15223b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<C15223b> arrayList = new ArrayList<>(list);
                Collections.sort(arrayList, f44553d);
                list = arrayList;
            }
            if (this.f44556c) {
                return m68349c(list);
            }
            return m68348b(list);
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47684a(C15454b bVar, String str, String str2, int i) {
        bVar.mo47757a(str);
        bVar.mo47757a("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            bVar.mo47755a((char) C14662d0.f42850a);
            bVar.mo47757a(str2);
            bVar.mo47755a((char) C14662d0.f42850a);
            return;
        }
        bVar.mo47757a(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47674a(C15454b bVar, C15223b bVar2, int i) {
        mo47684a(bVar, bVar2.getName(), bVar2.getValue(), i);
        String str = "; ";
        if (bVar2.getPath() != null && (bVar2 instanceof C15222a) && ((C15222a) bVar2).mo47100g(C15222a.f44141w)) {
            bVar.mo47757a(str);
            mo47684a(bVar, "$Path", bVar2.getPath(), i);
        }
        if (bVar2.mo47111h() != null && (bVar2 instanceof C15222a) && ((C15222a) bVar2).mo47100g(C15222a.f44142x)) {
            bVar.mo47757a(str);
            mo47684a(bVar, "$Domain", bVar2.mo47111h(), i);
        }
    }
}
