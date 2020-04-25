package org.apache.http.p547h0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.C15133c;
import org.apache.http.C15250f;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.s */
/* compiled from: HeaderGroup */
public class C15342s implements Cloneable {

    /* renamed from: a */
    private List f44415a = new ArrayList(16);

    /* renamed from: a */
    public void mo47515a(C15133c cVar) {
        if (cVar != null) {
            this.f44415a.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo47519b() {
        this.f44415a.clear();
    }

    /* renamed from: c */
    public void mo47523c(C15133c cVar) {
        if (cVar != null) {
            for (int i = 0; i < this.f44415a.size(); i++) {
                if (((C15133c) this.f44415a.get(i)).getName().equalsIgnoreCase(cVar.getName())) {
                    this.f44415a.set(i, cVar);
                    return;
                }
            }
            this.f44415a.add(cVar);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        C15342s sVar = (C15342s) super.clone();
        sVar.f44415a = new ArrayList(this.f44415a);
        return sVar;
    }

    /* renamed from: d */
    public C15133c[] mo47526d(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f44415a.size(); i++) {
            C15133c cVar = (C15133c) this.f44415a.get(i);
            if (cVar.getName().equalsIgnoreCase(str)) {
                arrayList.add(cVar);
            }
        }
        return (C15133c[]) arrayList.toArray(new C15133c[arrayList.size()]);
    }

    /* renamed from: e */
    public C15133c mo47527e(String str) {
        for (int size = this.f44415a.size() - 1; size >= 0; size--) {
            C15133c cVar = (C15133c) this.f44415a.get(size);
            if (cVar.getName().equalsIgnoreCase(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C15250f mo47529f(String str) {
        return new C15336m(this.f44415a, str);
    }

    /* renamed from: a */
    public void mo47516a(C15133c[] cVarArr) {
        mo47519b();
        if (cVarArr != null) {
            for (C15133c add : cVarArr) {
                this.f44415a.add(add);
            }
        }
    }

    /* renamed from: b */
    public void mo47520b(C15133c cVar) {
        if (cVar != null) {
            this.f44415a.remove(cVar);
        }
    }

    /* renamed from: b */
    public C15133c mo47518b(String str) {
        C15133c[] d = mo47526d(str);
        if (d.length == 0) {
            return null;
        }
        if (d.length == 1) {
            return d[0];
        }
        C15454b bVar = new C15454b(128);
        bVar.mo47757a(d[0].getValue());
        for (int i = 1; i < d.length; i++) {
            bVar.mo47757a(", ");
            bVar.mo47757a(d[i].getValue());
        }
        return new C15325b(str.toLowerCase(Locale.ENGLISH), bVar.toString());
    }

    /* renamed from: e */
    public C15250f mo47528e() {
        return new C15336m(this.f44415a, null);
    }

    /* renamed from: a */
    public boolean mo47517a(String str) {
        for (int i = 0; i < this.f44415a.size(); i++) {
            if (((C15133c) this.f44415a.get(i)).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C15133c mo47521c(String str) {
        for (int i = 0; i < this.f44415a.size(); i++) {
            C15133c cVar = (C15133c) this.f44415a.get(i);
            if (cVar.getName().equalsIgnoreCase(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public C15133c[] mo47525d() {
        List list = this.f44415a;
        return (C15133c[]) list.toArray(new C15133c[list.size()]);
    }

    /* renamed from: c */
    public C15342s mo47522c() {
        C15342s sVar = new C15342s();
        sVar.f44415a.addAll(this.f44415a);
        return sVar;
    }
}
