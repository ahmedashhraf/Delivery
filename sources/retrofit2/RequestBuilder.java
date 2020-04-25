package retrofit2;

import com.google.common.base.C5785c;
import java.io.IOException;
import java.util.regex.Pattern;
import p201f.p202a.C5952h;
import p468g.C13813c0.C13814a;
import p468g.C13817d0;
import p468g.C13863s.C13864a;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13868v;
import p468g.C13868v.C13869a;
import p468g.C13872x;
import p468g.C13873y;
import p468g.C13873y.C13874a;
import p468g.C13873y.C13875b;
import p470h.C13887c;
import p470h.C13892d;

final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final C13868v baseUrl;
    @C5952h
    private C13817d0 body;
    @C5952h
    private C13872x contentType;
    @C5952h
    private C13864a formBuilder;
    private final boolean hasBody;
    private final C13867a headersBuilder;
    private final String method;
    @C5952h
    private C13874a multipartBuilder;
    @C5952h
    private String relativeUrl;
    private final C13814a requestBuilder = new C13814a();
    @C5952h
    private C13869a urlBuilder;

    private static class ContentTypeOverridingRequestBody extends C13817d0 {
        private final C13872x contentType;
        private final C13817d0 delegate;

        ContentTypeOverridingRequestBody(C13817d0 d0Var, C13872x xVar) {
            this.delegate = d0Var;
            this.contentType = xVar;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public C13872x contentType() {
            return this.contentType;
        }

        public void writeTo(C13892d dVar) throws IOException {
            this.delegate.writeTo(dVar);
        }
    }

    RequestBuilder(String str, C13868v vVar, @C5952h String str2, @C5952h C13866u uVar, @C5952h C13872x xVar, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = vVar;
        this.relativeUrl = str2;
        this.contentType = xVar;
        this.hasBody = z;
        if (uVar != null) {
            this.headersBuilder = uVar.mo43616c();
        } else {
            this.headersBuilder = new C13867a();
        }
        if (z2) {
            this.formBuilder = new C13864a();
        } else if (z3) {
            this.multipartBuilder = new C13874a();
            this.multipartBuilder.mo43721a(C13873y.f40248j);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C13887c cVar = new C13887c();
                cVar.m59516a(str, 0, i);
                canonicalizeForPath(cVar, str, i, length, z);
                return cVar.mo43923w();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.mo43601b(str, str2);
        } else {
            this.formBuilder.mo43599a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = C13872x.m59360a(str2);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            this.headersBuilder.mo43625a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void addHeaders(C13866u uVar) {
        this.headersBuilder.mo43623a(uVar);
    }

    /* access modifiers changed from: 0000 */
    public void addPart(C13866u uVar, C13817d0 d0Var) {
        this.multipartBuilder.mo43720a(uVar, d0Var);
    }

    /* access modifiers changed from: 0000 */
    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z);
            String str3 = this.relativeUrl;
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(str);
            sb.append("}");
            String replace = str3.replace(sb.toString(), canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public void addQueryParam(String str, @C5952h String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            this.urlBuilder = this.baseUrl.mo43635a(str3);
            if (this.urlBuilder != null) {
                this.relativeUrl = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.urlBuilder.mo43671a(str, str2);
        } else {
            this.urlBuilder.mo43677b(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public <T> void addTag(Class<T> cls, @C5952h T t) {
        this.requestBuilder.mo43365a(cls, t);
    }

    /* access modifiers changed from: 0000 */
    public C13814a get() {
        C13868v vVar;
        C13869a aVar = this.urlBuilder;
        if (aVar != null) {
            vVar = aVar.mo43672a();
        } else {
            vVar = this.baseUrl.mo43643d(this.relativeUrl);
            if (vVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                sb.append(", Relative: ");
                sb.append(this.relativeUrl);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C13817d0 d0Var = this.body;
        if (d0Var == null) {
            C13864a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                d0Var = aVar2.mo43600a();
            } else {
                C13874a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    d0Var = aVar3.mo43725a();
                } else if (this.hasBody) {
                    d0Var = C13817d0.create((C13872x) null, new byte[0]);
                }
            }
        }
        C13872x xVar = this.contentType;
        if (xVar != null) {
            if (d0Var != null) {
                d0Var = new ContentTypeOverridingRequestBody(d0Var, xVar);
            } else {
                this.headersBuilder.mo43625a("Content-Type", xVar.toString());
            }
        }
        return this.requestBuilder.mo43364a(vVar).mo43363a(this.headersBuilder.mo43627a()).mo43368a(this.method, d0Var);
    }

    /* access modifiers changed from: 0000 */
    public void setBody(C13817d0 d0Var) {
        this.body = d0Var;
    }

    /* access modifiers changed from: 0000 */
    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    /* access modifiers changed from: 0000 */
    public void addPart(C13875b bVar) {
        this.multipartBuilder.mo43722a(bVar);
    }

    private static void canonicalizeForPath(C13887c cVar, String str, int i, int i2, boolean z) {
        C13887c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new C13887c();
                    }
                    cVar2.m59531b(codePointAt);
                    while (!cVar2.mo43904p()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        cVar.writeByte((int) HEX_DIGITS[(readByte >> 4) & 15]);
                        cVar.writeByte((int) HEX_DIGITS[readByte & C5785c.f16698q]);
                    }
                } else {
                    cVar.m59531b(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }
}
