package org.apache.http.p547h0;

import org.apache.http.C15117a0;
import org.apache.http.C15131b;
import org.apache.http.C15132b0;
import org.apache.http.C15133c;
import org.apache.http.C15473y;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.k */
/* compiled from: BasicLineFormatter */
public class C15334k implements C15345v {

    /* renamed from: a */
    public static final C15334k f44392a = new C15334k();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15454b mo47471a(C15454b bVar) {
        if (bVar == null) {
            return new C15454b(64);
        }
        bVar.mo47768c();
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47476b(C15454b bVar, C15117a0 a0Var) {
        String e = a0Var.mo46855e();
        String f = a0Var.mo46856f();
        bVar.mo47766b(e.length() + 1 + f.length() + 1 + mo47470a(a0Var.mo46854b()));
        bVar.mo47757a(e);
        bVar.mo47755a(' ');
        bVar.mo47757a(f);
        bVar.mo47755a(' ');
        mo47475a(bVar, a0Var.mo46854b());
    }

    /* renamed from: a */
    public static final String m67891a(C15473y yVar, C15345v vVar) {
        if (vVar == null) {
            vVar = f44392a;
        }
        return vVar.mo47475a((C15454b) null, yVar).toString();
    }

    /* renamed from: a */
    public C15454b mo47475a(C15454b bVar, C15473y yVar) {
        if (yVar != null) {
            int a = mo47470a(yVar);
            if (bVar == null) {
                bVar = new C15454b(a);
            } else {
                bVar.mo47766b(a);
            }
            bVar.mo47757a(yVar.mo47799f());
            bVar.mo47755a('/');
            bVar.mo47757a(Integer.toString(yVar.mo47795d()));
            bVar.mo47755a('.');
            bVar.mo47757a(Integer.toString(yVar.mo47797e()));
            return bVar;
        }
        throw new IllegalArgumentException("Protocol version may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47477b(C15454b bVar, C15132b0 b0Var) {
        int a = mo47470a(b0Var.mo46912b()) + 1 + 3 + 1;
        String d = b0Var.mo46914d();
        if (d != null) {
            a += d.length();
        }
        bVar.mo47766b(a);
        mo47475a(bVar, b0Var.mo46912b());
        bVar.mo47755a(' ');
        bVar.mo47757a(Integer.toString(b0Var.mo46913c()));
        bVar.mo47755a(' ');
        if (d != null) {
            bVar.mo47757a(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47470a(C15473y yVar) {
        return yVar.mo47799f().length() + 4;
    }

    /* renamed from: a */
    public static final String m67888a(C15117a0 a0Var, C15345v vVar) {
        if (vVar == null) {
            vVar = f44392a;
        }
        return vVar.mo47472a((C15454b) null, a0Var).toString();
    }

    /* renamed from: a */
    public C15454b mo47472a(C15454b bVar, C15117a0 a0Var) {
        if (a0Var != null) {
            C15454b a = mo47471a(bVar);
            mo47476b(a, a0Var);
            return a;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47478b(C15454b bVar, C15133c cVar) {
        String name = cVar.getName();
        String value = cVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        bVar.mo47766b(length);
        bVar.mo47757a(name);
        bVar.mo47757a(": ");
        if (value != null) {
            bVar.mo47757a(value);
        }
    }

    /* renamed from: a */
    public static final String m67889a(C15132b0 b0Var, C15345v vVar) {
        if (vVar == null) {
            vVar = f44392a;
        }
        return vVar.mo47473a((C15454b) null, b0Var).toString();
    }

    /* renamed from: a */
    public C15454b mo47473a(C15454b bVar, C15132b0 b0Var) {
        if (b0Var != null) {
            C15454b a = mo47471a(bVar);
            mo47477b(a, b0Var);
            return a;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* renamed from: a */
    public static final String m67890a(C15133c cVar, C15345v vVar) {
        if (vVar == null) {
            vVar = f44392a;
        }
        return vVar.mo47474a((C15454b) null, cVar).toString();
    }

    /* renamed from: a */
    public C15454b mo47474a(C15454b bVar, C15133c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cVar instanceof C15131b) {
            return ((C15131b) cVar).mo46910c();
        } else {
            C15454b a = mo47471a(bVar);
            mo47478b(a, cVar);
            return a;
        }
    }
}
