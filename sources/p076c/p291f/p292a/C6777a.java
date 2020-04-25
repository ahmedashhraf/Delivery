package p076c.p291f.p292a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.p217i1.C14662d0;

/* renamed from: c.f.a.a */
/* compiled from: FormEncoding */
public final class C6777a implements C6784c {

    /* renamed from: b */
    private static final Map<String, String> f18862b = Collections.singletonMap("Content-Type", "application/x-www-form-urlencoded");

    /* renamed from: a */
    private final byte[] f18863a;

    /* renamed from: c.f.a.a$b */
    /* compiled from: FormEncoding */
    public static class C6779b {

        /* renamed from: a */
        private final StringBuilder f18864a = new StringBuilder();

        /* renamed from: a */
        public C6779b mo27058a(String str, String str2) {
            String str3 = "UTF-8";
            if (this.f18864a.length() > 0) {
                this.f18864a.append(C14662d0.f42852c);
            }
            try {
                StringBuilder sb = this.f18864a;
                sb.append(URLEncoder.encode(str, str3));
                sb.append('=');
                sb.append(URLEncoder.encode(str2, str3));
                return this;
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public C6777a mo27059a() {
            if (this.f18864a.length() != 0) {
                return new C6777a(this.f18864a.toString());
            }
            throw new IllegalStateException("Form encoded body must have at least one part.");
        }
    }

    /* renamed from: a */
    public Map<String, String> mo27056a() {
        return f18862b;
    }

    private C6777a(String str) {
        try {
            this.f18863a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert input to UTF-8: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo27057a(OutputStream outputStream) throws IOException {
        outputStream.write(this.f18863a);
    }
}
