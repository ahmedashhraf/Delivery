package org.apache.http.p547h0;

import java.util.ArrayList;
import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.ParseException;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.g */
/* compiled from: BasicHeaderValueParser */
public class C15330g implements C15344u {

    /* renamed from: a */
    public static final C15330g f44380a = new C15330g();

    /* renamed from: b */
    private static final char f44381b = ';';

    /* renamed from: c */
    private static final char f44382c = ',';

    /* renamed from: d */
    private static final char[] f44383d = {f44381b, f44382c};

    /* renamed from: a */
    public static final C15236d[] m67860a(String str, C15344u uVar) throws ParseException {
        if (str != null) {
            if (uVar == null) {
                uVar = f44380a;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return uVar.mo47455a(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: b */
    public static final C15236d m67861b(String str, C15344u uVar) throws ParseException {
        if (str != null) {
            if (uVar == null) {
                uVar = f44380a;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return uVar.mo47456b(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: c */
    public static final C15472x m67862c(String str, C15344u uVar) throws ParseException {
        if (str != null) {
            if (uVar == null) {
                uVar = f44380a;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return uVar.mo47457c(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: d */
    public static final C15472x[] m67863d(String str, C15344u uVar) throws ParseException {
        if (str != null) {
            if (uVar == null) {
                uVar = f44380a;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return uVar.mo47458d(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: a */
    public C15236d[] mo47455a(C15454b bVar, C15347x xVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            ArrayList arrayList = new ArrayList();
            while (!xVar.mo47531a()) {
                C15236d b = mo47456b(bVar, xVar);
                if (b.getName().length() != 0 || b.getValue() != null) {
                    arrayList.add(b);
                }
            }
            return (C15236d[]) arrayList.toArray(new C15236d[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: b */
    public C15236d mo47456b(C15454b bVar, C15347x xVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            C15472x c = mo47457c(bVar, xVar);
            C15472x[] xVarArr = null;
            if (!xVar.mo47531a() && bVar.mo47752a(xVar.mo47533c() - 1) != ',') {
                xVarArr = mo47458d(bVar, xVar);
            }
            return mo47452a(c.getName(), c.getValue(), xVarArr);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: c */
    public C15472x mo47457c(C15454b bVar, C15347x xVar) {
        return mo47454a(bVar, xVar, f44383d);
    }

    /* renamed from: d */
    public C15472x[] mo47458d(C15454b bVar, C15347x xVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            int c = xVar.mo47533c();
            int d = xVar.mo47534d();
            while (c < d && C15430e.m68400a(bVar.mo47752a(c))) {
                c++;
            }
            xVar.mo47530a(c);
            if (xVar.mo47531a()) {
                return new C15472x[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!xVar.mo47531a()) {
                arrayList.add(mo47457c(bVar, xVar));
                if (bVar.mo47752a(xVar.mo47533c() - 1) == ',') {
                    break;
                }
            }
            return (C15472x[]) arrayList.toArray(new C15472x[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15236d mo47452a(String str, String str2, C15472x[] xVarArr) {
        return new C15326c(str, str2, xVarArr);
    }

    /* renamed from: a */
    private static boolean m67859a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C15472x mo47454a(C15454b bVar, C15347x xVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            int c = xVar.mo47533c();
            int c2 = xVar.mo47533c();
            int d = xVar.mo47534d();
            while (true) {
                z = true;
                if (c >= d) {
                    break;
                }
                char a = bVar.mo47752a(c);
                if (a == '=') {
                    break;
                } else if (m67859a(a, cArr)) {
                    z2 = true;
                    break;
                } else {
                    c++;
                }
            }
            z2 = false;
            if (c == d) {
                str = bVar.mo47765b(c2, d);
                z2 = true;
            } else {
                str = bVar.mo47765b(c2, c);
                c++;
            }
            if (z2) {
                xVar.mo47530a(c);
                return mo47453a(str, (String) null);
            }
            int i = c;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i >= d) {
                    z = z2;
                    break;
                }
                char a2 = bVar.mo47752a(i);
                if (a2 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && m67859a(a2, cArr)) {
                    break;
                }
                z3 = !z3 && z4 && a2 == '\\';
                i++;
            }
            while (c < i && C15430e.m68400a(bVar.mo47752a(c))) {
                c++;
            }
            int i2 = i;
            while (i2 > c && C15430e.m68400a(bVar.mo47752a(i2 - 1))) {
                i2--;
            }
            if (i2 - c >= 2 && bVar.mo47752a(c) == '\"' && bVar.mo47752a(i2 - 1) == '\"') {
                c++;
                i2--;
            }
            String a3 = bVar.mo47754a(c, i2);
            if (z) {
                i++;
            }
            xVar.mo47530a(i);
            return mo47453a(str, a3);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15472x mo47453a(String str, String str2) {
        return new C15337n(str, str2);
    }
}
