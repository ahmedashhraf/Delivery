package org.apache.http.p547h0;

import org.apache.http.C15117a0;
import org.apache.http.C15132b0;
import org.apache.http.C15133c;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.ParseException;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.l */
/* compiled from: BasicLineParser */
public class C15335l implements C15346w {

    /* renamed from: b */
    public static final C15335l f44393b = new C15335l();

    /* renamed from: a */
    protected final C15473y f44394a;

    public C15335l(C15473y yVar) {
        if (yVar == null) {
            yVar = C15471w.f44689R;
        }
        this.f44394a = yVar;
    }

    /* renamed from: b */
    public static final C15473y m67902b(String str, C15346w wVar) throws ParseException {
        if (str != null) {
            if (wVar == null) {
                wVar = f44393b;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return wVar.mo47485c(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15473y mo47482a(int i, int i2) {
        return this.f44394a.mo47790a(i, i2);
    }

    /* renamed from: c */
    public C15473y mo47485c(C15454b bVar, C15347x xVar) throws ParseException {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            String f = this.f44394a.mo47799f();
            int length = f.length();
            int c = xVar.mo47533c();
            int d = xVar.mo47534d();
            mo47487e(bVar, xVar);
            int c2 = xVar.mo47533c();
            int i = c2 + length;
            String str = "Not a valid protocol version: ";
            if (i + 4 <= d) {
                boolean z = true;
                int i2 = 0;
                while (z && i2 < length) {
                    z = bVar.mo47752a(c2 + i2) == f.charAt(i2);
                    i2++;
                }
                if (z) {
                    z = bVar.mo47752a(i) == '/';
                }
                if (z) {
                    int i3 = c2 + length + 1;
                    int a = bVar.mo47753a(46, i3, d);
                    if (a != -1) {
                        try {
                            int parseInt = Integer.parseInt(bVar.mo47765b(i3, a));
                            int i4 = a + 1;
                            int a2 = bVar.mo47753a(32, i4, d);
                            if (a2 == -1) {
                                a2 = d;
                            }
                            try {
                                int parseInt2 = Integer.parseInt(bVar.mo47765b(i4, a2));
                                xVar.mo47530a(a2);
                                return mo47482a(parseInt, parseInt2);
                            } catch (NumberFormatException unused) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Invalid protocol minor version number: ");
                                stringBuffer.append(bVar.mo47754a(c, d));
                                throw new ParseException(stringBuffer.toString());
                            }
                        } catch (NumberFormatException unused2) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Invalid protocol major version number: ");
                            stringBuffer2.append(bVar.mo47754a(c, d));
                            throw new ParseException(stringBuffer2.toString());
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Invalid protocol version number: ");
                        stringBuffer3.append(bVar.mo47754a(c, d));
                        throw new ParseException(stringBuffer3.toString());
                    }
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(str);
                    stringBuffer4.append(bVar.mo47754a(c, d));
                    throw new ParseException(stringBuffer4.toString());
                }
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(str);
                stringBuffer5.append(bVar.mo47754a(c, d));
                throw new ParseException(stringBuffer5.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: d */
    public C15117a0 mo47486d(C15454b bVar, C15347x xVar) throws ParseException {
        String str = "Invalid request line: ";
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            int c = xVar.mo47533c();
            int d = xVar.mo47534d();
            try {
                mo47487e(bVar, xVar);
                int c2 = xVar.mo47533c();
                int a = bVar.mo47753a(32, c2, d);
                if (a >= 0) {
                    String b = bVar.mo47765b(c2, a);
                    xVar.mo47530a(a);
                    mo47487e(bVar, xVar);
                    int c3 = xVar.mo47533c();
                    int a2 = bVar.mo47753a(32, c3, d);
                    if (a2 >= 0) {
                        String b2 = bVar.mo47765b(c3, a2);
                        xVar.mo47530a(a2);
                        C15473y c4 = mo47485c(bVar, xVar);
                        mo47487e(bVar, xVar);
                        if (xVar.mo47531a()) {
                            return mo47479a(b, b2, c4);
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(str);
                        stringBuffer.append(bVar.mo47754a(c, d));
                        throw new ParseException(stringBuffer.toString());
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append(bVar.mo47754a(c, d));
                    throw new ParseException(stringBuffer2.toString());
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str);
                stringBuffer3.append(bVar.mo47754a(c, d));
                throw new ParseException(stringBuffer3.toString());
            } catch (IndexOutOfBoundsException unused) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append(bVar.mo47754a(c, d));
                throw new ParseException(stringBuffer4.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47487e(C15454b bVar, C15347x xVar) {
        int c = xVar.mo47533c();
        int d = xVar.mo47534d();
        while (c < d && C15430e.m68400a(bVar.mo47752a(c))) {
            c++;
        }
        xVar.mo47530a(c);
    }

    /* renamed from: a */
    public boolean mo47483a(C15454b bVar, C15347x xVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            int c = xVar.mo47533c();
            String f = this.f44394a.mo47799f();
            int length = f.length();
            if (bVar.mo47772f() < length + 4) {
                return false;
            }
            if (c < 0) {
                c = (bVar.mo47772f() - 4) - length;
            } else if (c == 0) {
                while (c < bVar.mo47772f() && C15430e.m68400a(bVar.mo47752a(c))) {
                    c++;
                }
            }
            int i = c + length;
            if (i + 4 > bVar.mo47772f()) {
                return false;
            }
            boolean z = true;
            int i2 = 0;
            while (z && i2 < length) {
                z = bVar.mo47752a(c + i2) == f.charAt(i2);
                i2++;
            }
            if (z) {
                z = bVar.mo47752a(i) == '/';
            }
            return z;
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public C15335l() {
        this(null);
    }

    /* renamed from: b */
    public C15132b0 mo47484b(C15454b bVar, C15347x xVar) throws ParseException {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            int c = xVar.mo47533c();
            int d = xVar.mo47534d();
            try {
                C15473y c2 = mo47485c(bVar, xVar);
                mo47487e(bVar, xVar);
                int c3 = xVar.mo47533c();
                int a = bVar.mo47753a(32, c3, d);
                if (a < 0) {
                    a = d;
                }
                return mo47480a(c2, Integer.parseInt(bVar.mo47765b(c3, a)), a < d ? bVar.mo47765b(a, d) : "");
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to parse status code from status line: ");
                stringBuffer.append(bVar.mo47754a(c, d));
                throw new ParseException(stringBuffer.toString());
            } catch (IndexOutOfBoundsException unused2) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid status line: ");
                stringBuffer2.append(bVar.mo47754a(c, d));
                throw new ParseException(stringBuffer2.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15117a0 mo47479a(String str, String str2, C15473y yVar) {
        return new C15338o(str, str2, yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15132b0 mo47480a(C15473y yVar, int i, String str) {
        return new C15339p(yVar, i, str);
    }

    /* renamed from: a */
    public static final C15133c m67901a(String str, C15346w wVar) throws ParseException {
        if (str != null) {
            if (wVar == null) {
                wVar = f44393b;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return wVar.mo47481a(bVar);
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: a */
    public C15133c mo47481a(C15454b bVar) throws ParseException {
        return new C15341r(bVar);
    }

    /* renamed from: c */
    public static final C15117a0 m67903c(String str, C15346w wVar) throws ParseException {
        if (str != null) {
            if (wVar == null) {
                wVar = f44393b;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return wVar.mo47486d(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }

    /* renamed from: d */
    public static final C15132b0 m67904d(String str, C15346w wVar) throws ParseException {
        if (str != null) {
            if (wVar == null) {
                wVar = f44393b;
            }
            C15454b bVar = new C15454b(str.length());
            bVar.mo47757a(str);
            return wVar.mo47484b(bVar, new C15347x(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }
}
