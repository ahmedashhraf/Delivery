package org.apache.http.p541f0;

import org.apache.http.C15117a0;
import org.apache.http.C15463o;
import org.apache.http.C15464p;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.p547h0.C15331h;
import org.apache.http.p547h0.C15332i;

/* renamed from: org.apache.http.f0.e */
/* compiled from: DefaultHttpRequestFactory */
public class C15255e implements C15464p {

    /* renamed from: a */
    private static final String[] f44192a = {"GET"};

    /* renamed from: b */
    private static final String[] f44193b = {"POST", "PUT"};

    /* renamed from: c */
    private static final String[] f44194c = {"HEAD", "OPTIONS", "DELETE", "TRACE"};

    /* renamed from: a */
    private static boolean m67568a(String[] strArr, String str) {
        for (String equalsIgnoreCase : strArr) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C15463o mo47210a(C15117a0 a0Var) throws MethodNotSupportedException {
        if (a0Var != null) {
            String e = a0Var.mo46855e();
            if (m67568a(f44192a, e)) {
                return new C15332i(a0Var);
            }
            if (m67568a(f44193b, e)) {
                return new C15331h(a0Var);
            }
            if (m67568a(f44194c, e)) {
                return new C15332i(a0Var);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(e);
            stringBuffer.append(" method not supported");
            throw new MethodNotSupportedException(stringBuffer.toString());
        }
        throw new IllegalArgumentException("Request line may not be null");
    }

    /* renamed from: a */
    public C15463o mo47209a(String str, String str2) throws MethodNotSupportedException {
        if (m67568a(f44192a, str)) {
            return new C15332i(str, str2);
        }
        if (m67568a(f44193b, str)) {
            return new C15331h(str, str2);
        }
        if (m67568a(f44194c, str)) {
            return new C15332i(str, str2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" method not supported");
        throw new MethodNotSupportedException(stringBuffer.toString());
    }
}
