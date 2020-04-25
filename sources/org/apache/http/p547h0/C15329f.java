package org.apache.http.p547h0;

import kotlin.p217i1.C14662d0;
import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.f */
/* compiled from: BasicHeaderValueFormatter */
public class C15329f implements C15343t {

    /* renamed from: a */
    public static final C15329f f44377a = new C15329f();

    /* renamed from: b */
    public static final String f44378b = " ;,:@()<>\\\"/[]?={}\t";

    /* renamed from: c */
    public static final String f44379c = "\"\\";

    /* renamed from: a */
    public static final String m67846a(C15236d[] dVarArr, boolean z, C15343t tVar) {
        if (tVar == null) {
            tVar = f44377a;
        }
        return tVar.mo47447a((C15454b) null, dVarArr, z).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo47451b(char c) {
        return f44379c.indexOf(c) >= 0;
    }

    /* renamed from: a */
    public C15454b mo47447a(C15454b bVar, C15236d[] dVarArr, boolean z) {
        if (dVarArr != null) {
            int a = mo47443a(dVarArr);
            if (bVar == null) {
                bVar = new C15454b(a);
            } else {
                bVar.mo47766b(a);
            }
            for (int i = 0; i < dVarArr.length; i++) {
                if (i > 0) {
                    bVar.mo47757a(", ");
                }
                mo47445a(bVar, dVarArr[i], z);
            }
            return bVar;
        }
        throw new IllegalArgumentException("Header element array must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47443a(C15236d[] dVarArr) {
        if (dVarArr == null || dVarArr.length < 1) {
            return 0;
        }
        int length = (dVarArr.length - 1) * 2;
        for (C15236d a : dVarArr) {
            length += mo47441a(a);
        }
        return length;
    }

    /* renamed from: a */
    public static final String m67844a(C15236d dVar, boolean z, C15343t tVar) {
        if (tVar == null) {
            tVar = f44377a;
        }
        return tVar.mo47445a((C15454b) null, dVar, z).toString();
    }

    /* renamed from: a */
    public C15454b mo47445a(C15454b bVar, C15236d dVar, boolean z) {
        if (dVar != null) {
            int a = mo47441a(dVar);
            if (bVar == null) {
                bVar = new C15454b(a);
            } else {
                bVar.mo47766b(a);
            }
            bVar.mo47757a(dVar.getName());
            String value = dVar.getValue();
            if (value != null) {
                bVar.mo47755a('=');
                mo47449a(bVar, value, z);
            }
            int b = dVar.mo47152b();
            if (b > 0) {
                for (int i = 0; i < b; i++) {
                    bVar.mo47757a("; ");
                    mo47446a(bVar, dVar.mo47150a(i), z);
                }
            }
            return bVar;
        }
        throw new IllegalArgumentException("Header element must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47441a(C15236d dVar) {
        if (dVar == null) {
            return 0;
        }
        int length = dVar.getName().length();
        String value = dVar.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int b = dVar.mo47152b();
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                length += mo47442a(dVar.mo47150a(i)) + 2;
            }
        }
        return length;
    }

    /* renamed from: a */
    public static final String m67847a(C15472x[] xVarArr, boolean z, C15343t tVar) {
        if (tVar == null) {
            tVar = f44377a;
        }
        return tVar.mo47448a((C15454b) null, xVarArr, z).toString();
    }

    /* renamed from: a */
    public C15454b mo47448a(C15454b bVar, C15472x[] xVarArr, boolean z) {
        if (xVarArr != null) {
            int a = mo47444a(xVarArr);
            if (bVar == null) {
                bVar = new C15454b(a);
            } else {
                bVar.mo47766b(a);
            }
            for (int i = 0; i < xVarArr.length; i++) {
                if (i > 0) {
                    bVar.mo47757a("; ");
                }
                mo47446a(bVar, xVarArr[i], z);
            }
            return bVar;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47444a(C15472x[] xVarArr) {
        if (xVarArr == null || xVarArr.length < 1) {
            return 0;
        }
        int length = (xVarArr.length - 1) * 2;
        for (C15472x a : xVarArr) {
            length += mo47442a(a);
        }
        return length;
    }

    /* renamed from: a */
    public static final String m67845a(C15472x xVar, boolean z, C15343t tVar) {
        if (tVar == null) {
            tVar = f44377a;
        }
        return tVar.mo47446a((C15454b) null, xVar, z).toString();
    }

    /* renamed from: a */
    public C15454b mo47446a(C15454b bVar, C15472x xVar, boolean z) {
        if (xVar != null) {
            int a = mo47442a(xVar);
            if (bVar == null) {
                bVar = new C15454b(a);
            } else {
                bVar.mo47766b(a);
            }
            bVar.mo47757a(xVar.getName());
            String value = xVar.getValue();
            if (value != null) {
                bVar.mo47755a('=');
                mo47449a(bVar, value, z);
            }
            return bVar;
        }
        throw new IllegalArgumentException("NameValuePair must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47442a(C15472x xVar) {
        if (xVar == null) {
            return 0;
        }
        int length = xVar.getName().length();
        String value = xVar.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        return length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47449a(C15454b bVar, String str, boolean z) {
        if (!z) {
            boolean z2 = z;
            for (int i = 0; i < str.length() && !z2; i++) {
                z2 = mo47450a(str.charAt(i));
            }
            z = z2;
        }
        if (z) {
            bVar.mo47755a((char) C14662d0.f42850a);
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (mo47451b(charAt)) {
                bVar.mo47755a('\\');
            }
            bVar.mo47755a(charAt);
        }
        if (z) {
            bVar.mo47755a((char) C14662d0.f42850a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47450a(char c) {
        return f44378b.indexOf(c) >= 0;
    }
}
