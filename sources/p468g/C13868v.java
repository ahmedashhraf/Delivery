package p468g;

import com.facebook.common.util.UriUtil;
import com.google.common.base.C5785c;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.p217i1.C14662d0;
import okhttp3.internal.C14910b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p201f.p202a.C5952h;
import p205i.p489f.C14069f;
import p470h.C13887c;

/* renamed from: g.v */
/* compiled from: HttpUrl */
public final class C13868v {

    /* renamed from: j */
    private static final char[] f40206j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: k */
    static final String f40207k = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: l */
    static final String f40208l = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: m */
    static final String f40209m = " \"<>^`{}|/\\?#";

    /* renamed from: n */
    static final String f40210n = "[]";

    /* renamed from: o */
    static final String f40211o = " \"'<>#";

    /* renamed from: p */
    static final String f40212p = " \"'<>#&=";

    /* renamed from: q */
    static final String f40213q = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: r */
    static final String f40214r = "\\^`{|}";

    /* renamed from: s */
    static final String f40215s = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: t */
    static final String f40216t = "";

    /* renamed from: u */
    static final String f40217u = " \"#<>\\^`{|}";

    /* renamed from: a */
    final String f40218a;

    /* renamed from: b */
    private final String f40219b;

    /* renamed from: c */
    private final String f40220c;

    /* renamed from: d */
    final String f40221d;

    /* renamed from: e */
    final int f40222e;

    /* renamed from: f */
    private final List<String> f40223f;
    @C5952h

    /* renamed from: g */
    private final List<String> f40224g;
    @C5952h

    /* renamed from: h */
    private final String f40225h;

    /* renamed from: i */
    private final String f40226i;

    /* renamed from: g.v$a */
    /* compiled from: HttpUrl */
    public static final class C13869a {

        /* renamed from: i */
        static final String f40227i = "Invalid URL host";
        @C5952h

        /* renamed from: a */
        String f40228a;

        /* renamed from: b */
        String f40229b;

        /* renamed from: c */
        String f40230c;
        @C5952h

        /* renamed from: d */
        String f40231d;

        /* renamed from: e */
        int f40232e = -1;

        /* renamed from: f */
        final List<String> f40233f = new ArrayList();
        @C5952h

        /* renamed from: g */
        List<String> f40234g;
        @C5952h

        /* renamed from: h */
        String f40235h;

        public C13869a() {
            String str = "";
            this.f40229b = str;
            this.f40230c = str;
            this.f40233f.add(str);
        }

        /* renamed from: r */
        private boolean m59319r(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: s */
        private boolean m59320s(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: t */
        private void m59321t(String str) {
            for (int size = this.f40234g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f40234g.get(size))) {
                    this.f40234g.remove(size + 1);
                    this.f40234g.remove(size);
                    if (this.f40234g.isEmpty()) {
                        this.f40234g = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public C13869a mo43667a(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f40232e = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo43673b() {
            int i = this.f40232e;
            return i != -1 ? i : C13868v.m59277e(this.f40228a);
        }

        /* renamed from: c */
        public C13869a mo43679c(String str) {
            if (str != null) {
                m59312a(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        /* renamed from: d */
        public C13869a mo43681d(String str) {
            if (str != null) {
                return m59310a(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        /* renamed from: e */
        public C13869a mo43683e(@C5952h String str) {
            String str2;
            if (str != null) {
                str2 = C13868v.m59268a(str, "", true, false, false, false);
            } else {
                str2 = null;
            }
            this.f40235h = str2;
            return this;
        }

        /* renamed from: f */
        public C13869a mo43684f(String str) {
            if (str != null) {
                this.f40230c = C13868v.m59268a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        /* renamed from: g */
        public C13869a mo43685g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                m59316d(str, 0, str.length());
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected encodedPath: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: h */
        public C13869a mo43686h(@C5952h String str) {
            List<String> list;
            if (str != null) {
                list = C13868v.m59280h(C13868v.m59268a(str, C13868v.f40211o, true, false, true, true));
            } else {
                list = null;
            }
            this.f40234g = list;
            return this;
        }

        /* renamed from: i */
        public C13869a mo43687i(String str) {
            if (str != null) {
                this.f40229b = C13868v.m59268a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        /* renamed from: j */
        public C13869a mo43688j(@C5952h String str) {
            String str2;
            if (str != null) {
                str2 = C13868v.m59268a(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.f40235h = str2;
            return this;
        }

        /* renamed from: k */
        public C13869a mo43689k(String str) {
            if (str != null) {
                String a = m59311a(str, 0, str.length());
                if (a != null) {
                    this.f40231d = a;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: l */
        public C13869a mo43690l(String str) {
            if (str != null) {
                this.f40230c = C13868v.m59268a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: m */
        public C13869a mo43691m(@C5952h String str) {
            List<String> list;
            if (str != null) {
                list = C13868v.m59280h(C13868v.m59268a(str, C13868v.f40211o, false, false, true, true));
            } else {
                list = null;
            }
            this.f40234g = list;
            return this;
        }

        /* renamed from: n */
        public C13869a mo43692n(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            } else if (this.f40234g == null) {
                return this;
            } else {
                m59321t(C13868v.m59268a(str, C13868v.f40212p, true, false, true, true));
                return this;
            }
        }

        /* renamed from: o */
        public C13869a mo43693o(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (this.f40234g == null) {
                return this;
            } else {
                m59321t(C13868v.m59268a(str, C13868v.f40213q, false, false, true, true));
                return this;
            }
        }

        /* renamed from: p */
        public C13869a mo43694p(String str) {
            if (str != null) {
                String str2 = "http";
                if (str.equalsIgnoreCase(str2)) {
                    this.f40228a = str2;
                } else {
                    String str3 = UriUtil.HTTPS_SCHEME;
                    if (str.equalsIgnoreCase(str3)) {
                        this.f40228a = str3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected scheme: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: q */
        public C13869a mo43695q(String str) {
            if (str != null) {
                this.f40229b = C13868v.m59268a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f40228a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f40229b.isEmpty() || !this.f40230c.isEmpty()) {
                sb.append(this.f40229b);
                if (!this.f40230c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f40230c);
                }
                sb.append('@');
            }
            String str2 = this.f40231d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f40231d);
                    sb.append(']');
                } else {
                    sb.append(this.f40231d);
                }
            }
            if (!(this.f40232e == -1 && this.f40228a == null)) {
                int b = mo43673b();
                String str3 = this.f40228a;
                if (str3 == null || b != C13868v.m59277e(str3)) {
                    sb.append(':');
                    sb.append(b);
                }
            }
            C13868v.m59276b(sb, this.f40233f);
            if (this.f40234g != null) {
                sb.append('?');
                C13868v.m59274a(sb, this.f40234g);
            }
            if (this.f40235h != null) {
                sb.append('#');
                sb.append(this.f40235h);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public C13869a mo43676b(String str) {
            if (str != null) {
                return m59310a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* renamed from: e */
        private static int m59317e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: f */
        private static int m59318f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C13869a mo43670a(String str) {
            if (str != null) {
                m59312a(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        /* renamed from: c */
        public C13869a mo43680c(String str, @C5952h String str2) {
            mo43692n(str);
            mo43671a(str, str2);
            return this;
        }

        /* renamed from: d */
        public C13869a mo43682d(String str, @C5952h String str2) {
            mo43693o(str);
            mo43677b(str, str2);
            return this;
        }

        /* renamed from: b */
        public C13869a mo43675b(int i, String str) {
            if (str != null) {
                String a = C13868v.m59266a(str, 0, str.length(), C13868v.f40209m, false, false, false, true, null);
                if (m59319r(a) || m59320s(a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected path segment: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f40233f.set(i, a);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        /* renamed from: a */
        private C13869a m59310a(String str, boolean z) {
            int i = 0;
            do {
                int a = C14910b.m66039a(str, i, str.length(), "/\\");
                m59312a(str, i, a, a < str.length(), z);
                i = a + 1;
            } while (i <= str.length());
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: d */
        private void m59316d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f40233f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f40233f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f40233f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.C14910b.m66039a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m59312a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p468g.C13868v.C13869a.m59316d(java.lang.String, int, int):void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C13869a mo43678c() {
            int size = this.f40233f.size();
            for (int i = 0; i < size; i++) {
                this.f40233f.set(i, C13868v.m59268a((String) this.f40233f.get(i), C13868v.f40210n, true, true, false, true));
            }
            List<String> list = this.f40234g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) this.f40234g.get(i2);
                    if (str != null) {
                        this.f40234g.set(i2, C13868v.m59268a(str, C13868v.f40214r, true, true, true, true));
                    }
                }
            }
            String str2 = this.f40235h;
            if (str2 != null) {
                this.f40235h = C13868v.m59268a(str2, C13868v.f40217u, true, true, false, false);
            }
            return this;
        }

        /* renamed from: a */
        public C13869a mo43668a(int i, String str) {
            if (str != null) {
                String a = C13868v.m59266a(str, 0, str.length(), C13868v.f40209m, true, false, false, true, null);
                this.f40233f.set(i, a);
                if (!m59319r(a) && !m59320s(a)) {
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected path segment: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        /* renamed from: b */
        public C13869a mo43674b(int i) {
            this.f40233f.remove(i);
            if (this.f40233f.isEmpty()) {
                this.f40233f.add("");
            }
            return this;
        }

        /* renamed from: d */
        private void m59315d() {
            List<String> list = this.f40233f;
            String str = "";
            if (!((String) list.remove(list.size() - 1)).isEmpty() || this.f40233f.isEmpty()) {
                this.f40233f.add(str);
                return;
            }
            List<String> list2 = this.f40233f;
            list2.set(list2.size() - 1, str);
        }

        /* renamed from: b */
        public C13869a mo43677b(String str, @C5952h String str2) {
            String str3;
            if (str != null) {
                if (this.f40234g == null) {
                    this.f40234g = new ArrayList();
                }
                this.f40234g.add(C13868v.m59268a(str, C13868v.f40213q, false, false, true, true));
                List<String> list = this.f40234g;
                if (str2 != null) {
                    str3 = C13868v.m59268a(str2, C13868v.f40213q, false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public C13869a mo43671a(String str, @C5952h String str2) {
            String str3;
            if (str != null) {
                if (this.f40234g == null) {
                    this.f40234g = new ArrayList();
                }
                this.f40234g.add(C13868v.m59268a(str, C13868v.f40212p, true, false, true, true));
                List<String> list = this.f40234g;
                if (str2 != null) {
                    str3 = C13868v.m59268a(str2, C13868v.f40212p, true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: c */
        private static int m59314c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        private static int m59313b(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C13868v.m59266a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: a */
        public C13868v mo43672a() {
            if (this.f40228a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f40231d != null) {
                return new C13868v(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13869a mo43669a(@C5952h C13868v vVar, String str) {
            int a;
            int i;
            C13868v vVar2 = vVar;
            String str2 = str;
            int b = C14910b.m66065b(str2, 0, str.length());
            int c = C14910b.m66071c(str2, b, str.length());
            int e = m59317e(str2, b, c);
            if (e != -1) {
                if (str.regionMatches(true, b, "https:", 0, 6)) {
                    this.f40228a = UriUtil.HTTPS_SCHEME;
                    b += 6;
                } else {
                    if (str.regionMatches(true, b, "http:", 0, 5)) {
                        this.f40228a = "http";
                        b += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, e));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (vVar2 != null) {
                this.f40228a = vVar2.f40218a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int f = m59318f(str2, b, c);
            char c2 = '?';
            char c3 = '#';
            if (f >= 2 || vVar2 == null || !vVar2.f40218a.equals(this.f40228a)) {
                int i2 = b + f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C14910b.m66039a(str2, i2, c, "@/\\?#");
                    char charAt = a != c ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int c4 = m59314c(str2, i2, i3);
                        int i4 = c4 + 1;
                    } else {
                        if (charAt == '@') {
                            String str3 = "%40";
                            if (!z) {
                                int a2 = C14910b.m66038a(str2, i2, a, ':');
                                int i5 = a2;
                                String str4 = str3;
                                i = a;
                                String a3 = C13868v.m59266a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f40229b);
                                    sb2.append(str4);
                                    sb2.append(a3);
                                    a3 = sb2.toString();
                                }
                                this.f40229b = a3;
                                if (i5 != i) {
                                    this.f40230c = C13868v.m59266a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                String str5 = str3;
                                i = a;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f40230c);
                                sb3.append(str5);
                                sb3.append(C13868v.m59266a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f40230c = sb3.toString();
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int c42 = m59314c(str2, i2, i32);
                int i42 = c42 + 1;
                if (i42 < i32) {
                    this.f40231d = m59311a(str2, i2, c42);
                    this.f40232e = m59313b(str2, i42, i32);
                    if (this.f40232e == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append(C14662d0.f42850a);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.f40231d = m59311a(str2, i2, c42);
                    this.f40232e = C13868v.m59277e(this.f40228a);
                }
                if (this.f40231d != null) {
                    b = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, c42));
                    sb5.append(C14662d0.f42850a);
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.f40229b = vVar.mo43647f();
                this.f40230c = vVar.mo43638b();
                this.f40231d = vVar2.f40221d;
                this.f40232e = vVar2.f40222e;
                this.f40233f.clear();
                this.f40233f.addAll(vVar.mo43644d());
                if (b == c || str2.charAt(b) == '#') {
                    mo43686h(vVar.mo43645e());
                }
            }
            int a4 = C14910b.m66039a(str2, b, c, "?#");
            m59316d(str2, b, a4);
            if (a4 < c && str2.charAt(a4) == '?') {
                int a5 = C14910b.m66038a(str2, a4, c, '#');
                this.f40234g = C13868v.m59280h(C13868v.m59266a(str, a4 + 1, a5, C13868v.f40211o, true, false, true, true, null));
                a4 = a5;
            }
            if (a4 < c && str2.charAt(a4) == '#') {
                this.f40235h = C13868v.m59266a(str, 1 + a4, c, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: a */
        private void m59312a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C13868v.m59266a(str, i, i2, C13868v.f40209m, z2, false, false, true, null);
            if (!m59319r(a)) {
                if (m59320s(a)) {
                    m59315d();
                    return;
                }
                List<String> list = this.f40233f;
                if (((String) list.get(list.size() - 1)).isEmpty()) {
                    List<String> list2 = this.f40233f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f40233f.add(a);
                }
                if (z) {
                    this.f40233f.add("");
                }
            }
        }

        /* renamed from: a */
        private static String m59311a(String str, int i, int i2) {
            return C14910b.m66044a(C13868v.m59267a(str, i, i2, false));
        }
    }

    C13868v(C13869a aVar) {
        this.f40218a = aVar.f40228a;
        this.f40219b = m59270a(aVar.f40229b, false);
        this.f40220c = m59270a(aVar.f40230c, false);
        this.f40221d = aVar.f40231d;
        this.f40222e = aVar.mo43673b();
        this.f40223f = m59271a(aVar.f40233f, false);
        List<String> list = aVar.f40234g;
        String str = null;
        this.f40224g = list != null ? m59271a(list, true) : null;
        String str2 = aVar.f40235h;
        if (str2 != null) {
            str = m59270a(str2, false);
        }
        this.f40225h = str;
        this.f40226i = aVar.toString();
    }

    /* renamed from: a */
    static void m59274a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append(C14662d0.f42852c);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: e */
    public static int m59277e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(UriUtil.HTTPS_SCHEME) ? 443 : -1;
    }

    /* renamed from: b */
    public String mo43638b() {
        if (this.f40220c.isEmpty()) {
            return "";
        }
        return this.f40226i.substring(this.f40226i.indexOf(58, this.f40218a.length() + 3) + 1, this.f40226i.indexOf(64));
    }

    /* renamed from: c */
    public String mo43641c() {
        int indexOf = this.f40226i.indexOf(47, this.f40218a.length() + 3);
        String str = this.f40226i;
        return this.f40226i.substring(indexOf, C14910b.m66039a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: d */
    public List<String> mo43644d() {
        int indexOf = this.f40226i.indexOf(47, this.f40218a.length() + 3);
        String str = this.f40226i;
        int a = C14910b.m66039a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C14910b.m66038a(this.f40226i, i, a, '/');
            arrayList.add(this.f40226i.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    public boolean equals(@C5952h Object obj) {
        return (obj instanceof C13868v) && ((C13868v) obj).f40226i.equals(this.f40226i);
    }

    /* renamed from: f */
    public String mo43647f() {
        if (this.f40219b.isEmpty()) {
            return "";
        }
        int length = this.f40218a.length() + 3;
        String str = this.f40226i;
        return this.f40226i.substring(length, C14910b.m66039a(str, length, str.length(), ":@"));
    }

    @C5952h
    /* renamed from: g */
    public String mo43648g() {
        return this.f40225h;
    }

    /* renamed from: h */
    public String mo43649h() {
        return this.f40221d;
    }

    public int hashCode() {
        return this.f40226i.hashCode();
    }

    /* renamed from: i */
    public boolean mo43651i() {
        return this.f40218a.equals(UriUtil.HTTPS_SCHEME);
    }

    /* renamed from: j */
    public C13869a mo43652j() {
        C13869a aVar = new C13869a();
        aVar.f40228a = this.f40218a;
        aVar.f40229b = mo43647f();
        aVar.f40230c = mo43638b();
        aVar.f40231d = this.f40221d;
        aVar.f40232e = this.f40222e != m59277e(this.f40218a) ? this.f40222e : -1;
        aVar.f40233f.clear();
        aVar.f40233f.addAll(mo43644d());
        aVar.mo43686h(mo43645e());
        aVar.f40235h = mo43636a();
        return aVar;
    }

    /* renamed from: k */
    public String mo43653k() {
        return this.f40220c;
    }

    /* renamed from: l */
    public List<String> mo43654l() {
        return this.f40223f;
    }

    /* renamed from: m */
    public int mo43655m() {
        return this.f40223f.size();
    }

    /* renamed from: n */
    public int mo43656n() {
        return this.f40222e;
    }

    @C5952h
    /* renamed from: o */
    public String mo43657o() {
        if (this.f40224g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m59274a(sb, this.f40224g);
        return sb.toString();
    }

    /* renamed from: p */
    public Set<String> mo43658p() {
        if (this.f40224g == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f40224g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.f40224g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: q */
    public int mo43659q() {
        List<String> list = this.f40224g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* renamed from: r */
    public String mo43660r() {
        String str = "";
        return mo43635a("/...").mo43695q(str).mo43690l(str).mo43672a().toString();
    }

    /* renamed from: s */
    public String mo43661s() {
        return this.f40218a;
    }

    @C5952h
    /* renamed from: t */
    public String mo43662t() {
        if (C14910b.m66073d(this.f40221d)) {
            return null;
        }
        return PublicSuffixDatabase.m66658a().mo46682a(this.f40221d);
    }

    public String toString() {
        return this.f40226i;
    }

    /* renamed from: u */
    public URI mo43664u() {
        String aVar = mo43652j().mo43678c().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: v */
    public URL mo43665v() {
        try {
            return new URL(this.f40226i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: w */
    public String mo43666w() {
        return this.f40219b;
    }

    @C5952h
    /* renamed from: g */
    public static C13868v m59279g(String str) {
        try {
            return m59278f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static List<String> m59280h(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    @C5952h
    /* renamed from: e */
    public String mo43645e() {
        if (this.f40224g == null) {
            return null;
        }
        int indexOf = this.f40226i.indexOf(63) + 1;
        String str = this.f40226i;
        return this.f40226i.substring(indexOf, C14910b.m66038a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: c */
    public List<String> mo43642c(String str) {
        if (this.f40224g == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f40224g.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f40224g.get(i))) {
                arrayList.add(this.f40224g.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    static void m59276b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: f */
    public static C13868v m59278f(String str) {
        return new C13869a().mo43669a((C13868v) null, str).mo43672a();
    }

    @C5952h
    /* renamed from: d */
    public C13868v mo43643d(String str) {
        C13869a a = mo43635a(str);
        if (a != null) {
            return a.mo43672a();
        }
        return null;
    }

    /* renamed from: a */
    public String mo43637a(int i) {
        List<String> list = this.f40224g;
        if (list != null) {
            return (String) list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    @C5952h
    /* renamed from: b */
    public String mo43640b(String str) {
        List<String> list = this.f40224g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f40224g.get(i))) {
                return (String) this.f40224g.get(i + 1);
            }
        }
        return null;
    }

    @C5952h
    /* renamed from: a */
    public String mo43636a() {
        if (this.f40225h == null) {
            return null;
        }
        return this.f40226i.substring(this.f40226i.indexOf(35) + 1);
    }

    /* renamed from: b */
    public String mo43639b(int i) {
        List<String> list = this.f40224g;
        if (list != null) {
            return (String) list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @C5952h
    /* renamed from: a */
    public C13869a mo43635a(String str) {
        try {
            return new C13869a().mo43669a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @C5952h
    /* renamed from: a */
    public static C13868v m59265a(URL url) {
        return m59279g(url.toString());
    }

    @C5952h
    /* renamed from: a */
    public static C13868v m59264a(URI uri) {
        return m59279g(uri.toString());
    }

    /* renamed from: a */
    static String m59270a(String str, boolean z) {
        return m59267a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m59271a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m59270a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m59267a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C13887c cVar = new C13887c();
                cVar.m59516a(str, i, i3);
                m59273a(cVar, str, i3, i2, z);
                return cVar.mo43923w();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m59273a(C13887c cVar, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C14910b.m66037a(str.charAt(i + 1));
                    int a2 = C14910b.m66037a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        cVar.writeByte((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    cVar.m59531b(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                cVar.writeByte(32);
                i += Character.charCount(codePointAt);
            }
            cVar.m59531b(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m59275a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C14910b.m66037a(str.charAt(i + 1)) == -1 || C14910b.m66037a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m59266a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m59275a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C13887c cVar = new C13887c();
            int i5 = i;
            cVar.m59516a(str, i, i4);
            m59272a(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo43923w();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m59272a(C13887c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C13887c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.m59515a(z ? C14069f.f41344H : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m59275a(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C13887c();
                    }
                    if (charset == null || charset.equals(C14910b.f43167j)) {
                        cVar2.m59531b(codePointAt);
                    } else {
                        cVar2.m59517a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo43904p()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        cVar.writeByte((int) f40206j[(readByte >> 4) & 15]);
                        cVar.writeByte((int) f40206j[readByte & C5785c.f16698q]);
                    }
                } else {
                    cVar.m59531b(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m59269a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m59266a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m59268a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m59266a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
