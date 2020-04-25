package org.apache.http.p541f0;

import java.util.Locale;
import org.apache.http.C15470v;
import org.apache.http.C15474z;

/* renamed from: org.apache.http.f0.h */
/* compiled from: EnglishReasonPhraseCatalog */
public class C15258h implements C15474z {

    /* renamed from: a */
    public static final C15258h f44196a = new C15258h();

    /* renamed from: b */
    private static final String[][] f44197b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        m67575a(200, "OK");
        m67575a(201, "Created");
        m67575a((int) C15470v.f44665f, "Accepted");
        m67575a(204, "No Content");
        m67575a(301, "Moved Permanently");
        m67575a(302, "Moved Temporarily");
        m67575a(304, "Not Modified");
        m67575a(400, "Bad Request");
        m67575a(401, "Unauthorized");
        m67575a(403, "Forbidden");
        m67575a(404, "Not Found");
        m67575a(500, "Internal Server Error");
        m67575a((int) C15470v.f44654Q, "Not Implemented");
        m67575a(502, "Bad Gateway");
        m67575a(503, "Service Unavailable");
        m67575a(100, "Continue");
        m67575a(307, "Temporary Redirect");
        m67575a(405, "Method Not Allowed");
        m67575a(409, "Conflict");
        m67575a(412, "Precondition Failed");
        m67575a((int) C15470v.f44643F, "Request Too Long");
        m67575a((int) C15470v.f44644G, "Request-URI Too Long");
        m67575a((int) C15470v.f44645H, "Unsupported Media Type");
        m67575a(300, "Multiple Choices");
        m67575a(303, "See Other");
        m67575a((int) C15470v.f44676q, "Use Proxy");
        m67575a(402, "Payment Required");
        m67575a((int) C15470v.f44684y, "Not Acceptable");
        m67575a((int) C15470v.f44685z, "Proxy Authentication Required");
        m67575a((int) C15470v.f44638A, "Request Timeout");
        m67575a(101, "Switching Protocols");
        m67575a(203, "Non Authoritative Information");
        m67575a((int) C15470v.f44668i, "Reset Content");
        m67575a((int) C15470v.f44669j, "Partial Content");
        m67575a((int) C15470v.f44657T, "Gateway Timeout");
        m67575a((int) C15470v.f44658U, "Http Version Not Supported");
        m67575a((int) C15470v.f44640C, "Gone");
        m67575a((int) C15470v.f44641D, "Length Required");
        m67575a((int) C15470v.f44646I, "Requested Range Not Satisfiable");
        m67575a((int) C15470v.f44647J, "Expectation Failed");
        m67575a(102, "Processing");
        m67575a((int) C15470v.f44670k, "Multi-Status");
        m67575a(422, "Unprocessable Entity");
        m67575a((int) C15470v.f44648K, "Insufficient Space On Resource");
        m67575a((int) C15470v.f44649L, "Method Failure");
        m67575a((int) C15470v.f44651N, "Locked");
        m67575a((int) C15470v.f44659V, "Insufficient Storage");
        m67575a((int) C15470v.f44652O, "Failed Dependency");
    }

    protected C15258h() {
    }

    /* renamed from: a */
    public String mo47216a(int i, Locale locale) {
        if (i < 100 || i >= 600) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unknown category for status code ");
            stringBuffer.append(i);
            stringBuffer.append(".");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        String[][] strArr = f44197b;
        if (strArr[i2].length > i3) {
            return strArr[i2][i3];
        }
        return null;
    }

    /* renamed from: a */
    private static void m67575a(int i, String str) {
        int i2 = i / 100;
        f44197b[i2][i - (i2 * 100)] = str;
    }
}
