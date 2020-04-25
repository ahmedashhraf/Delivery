package p076c.p112d.p134b.p135a.p143g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C2766f
/* renamed from: c.d.b.a.g.g0 */
/* compiled from: PemReader */
public final class C6378g0 {

    /* renamed from: b */
    private static final Pattern f17795b = Pattern.compile("-----BEGIN ([A-Z ]+)-----");

    /* renamed from: c */
    private static final Pattern f17796c = Pattern.compile("-----END ([A-Z ]+)-----");

    /* renamed from: a */
    private BufferedReader f17797a;

    /* renamed from: c.d.b.a.g.g0$a */
    /* compiled from: PemReader */
    public static final class C6379a {

        /* renamed from: a */
        private final String f17798a;

        /* renamed from: b */
        private final byte[] f17799b;

        C6379a(String str, byte[] bArr) {
            this.f17798a = (String) C6381h0.m29663a(str);
            this.f17799b = (byte[]) C6381h0.m29663a(bArr);
        }

        /* renamed from: a */
        public byte[] mo25757a() {
            return this.f17799b;
        }

        /* renamed from: b */
        public String mo25758b() {
            return this.f17798a;
        }
    }

    public C6378g0(Reader reader) {
        this.f17797a = new BufferedReader(reader);
    }

    /* renamed from: a */
    public C6379a mo25754a(String str) throws IOException {
        StringBuilder sb = null;
        String str2 = null;
        while (true) {
            String readLine = this.f17797a.readLine();
            if (readLine == null) {
                C6381h0.m29668a(str2 == null, "missing end tag (%s)", str2);
                return null;
            } else if (sb == null) {
                Matcher matcher = f17795b.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    if (str == null || group.equals(str)) {
                        sb = new StringBuilder();
                        str2 = group;
                    }
                }
            } else {
                Matcher matcher2 = f17796c.matcher(readLine);
                if (matcher2.matches()) {
                    String group2 = matcher2.group(1);
                    C6381h0.m29668a(group2.equals(str2), "end tag (%s) doesn't match begin tag (%s)", group2, str2);
                    return new C6379a(str2, C6371e.m29640a(sb.toString()));
                }
                sb.append(readLine);
            }
        }
    }

    /* renamed from: b */
    public C6379a mo25756b() throws IOException {
        return mo25754a((String) null);
    }

    /* renamed from: a */
    public static C6379a m29656a(Reader reader) throws IOException {
        return m29657a(reader, null);
    }

    /* renamed from: a */
    public static C6379a m29657a(Reader reader, String str) throws IOException {
        C6378g0 g0Var = new C6378g0(reader);
        try {
            return g0Var.mo25754a(str);
        } finally {
            g0Var.mo25755a();
        }
    }

    /* renamed from: a */
    public void mo25755a() throws IOException {
        this.f17797a.close();
    }
}
