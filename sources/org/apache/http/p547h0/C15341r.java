package org.apache.http.p547h0;

import org.apache.http.C15131b;
import org.apache.http.C15236d;
import org.apache.http.ParseException;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.r */
/* compiled from: BufferedHeader */
public class C15341r implements C15131b, Cloneable {

    /* renamed from: N */
    private final int f44412N;

    /* renamed from: a */
    private final String f44413a;

    /* renamed from: b */
    private final C15454b f44414b;

    public C15341r(C15454b bVar) throws ParseException {
        if (bVar != null) {
            int c = bVar.mo47767c(58);
            String str = "Invalid header: ";
            if (c != -1) {
                String b = bVar.mo47765b(0, c);
                if (b.length() != 0) {
                    this.f44414b = bVar;
                    this.f44413a = b;
                    this.f44412N = c + 1;
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(bVar.toString());
                throw new ParseException(stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(bVar.toString());
            throw new ParseException(stringBuffer2.toString());
        }
        throw new IllegalArgumentException("Char array buffer may not be null");
    }

    /* renamed from: b */
    public C15236d[] mo46915b() throws ParseException {
        C15347x xVar = new C15347x(0, this.f44414b.mo47772f());
        xVar.mo47530a(this.f44412N);
        return C15330g.f44380a.mo47455a(this.f44414b, xVar);
    }

    /* renamed from: c */
    public C15454b mo46910c() {
        return this.f44414b;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public int mo46911d() {
        return this.f44412N;
    }

    public String getName() {
        return this.f44413a;
    }

    public String getValue() {
        C15454b bVar = this.f44414b;
        return bVar.mo47765b(this.f44412N, bVar.mo47772f());
    }

    public String toString() {
        return this.f44414b.toString();
    }
}
