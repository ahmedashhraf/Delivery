package p468g;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.p217i1.C14662d0;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: g.x */
/* compiled from: MediaType */
public final class C13872x {

    /* renamed from: e */
    private static final String f40236e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: f */
    private static final String f40237f = "\"([^\"]*)\"";

    /* renamed from: g */
    private static final Pattern f40238g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: h */
    private static final Pattern f40239h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f40240a;

    /* renamed from: b */
    private final String f40241b;

    /* renamed from: c */
    private final String f40242c;
    @C5952h

    /* renamed from: d */
    private final String f40243d;

    private C13872x(String str, String str2, String str3, @C5952h String str4) {
        this.f40240a = str;
        this.f40241b = str2;
        this.f40242c = str3;
        this.f40243d = str4;
    }

    /* renamed from: a */
    public static C13872x m59360a(String str) {
        Matcher matcher = f40238g.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f40239h.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                String str3 = "\" for: \"";
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase(HttpRequest.f42450O)) {
                        String group2 = matcher2.group(2);
                        if (group2 != null) {
                            String str4 = "'";
                            if (group2.startsWith(str4) && group2.endsWith(str4) && group2.length() > 2) {
                                group2 = group2.substring(1, group2.length() - 1);
                            }
                        } else {
                            group2 = matcher2.group(3);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group2);
                            sb.append(str3);
                            sb.append(str);
                            sb.append(C14662d0.f42850a);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append(str3);
                    sb2.append(str);
                    sb2.append(C14662d0.f42850a);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new C13872x(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No subtype found for: \"");
        sb3.append(str);
        sb3.append(C14662d0.f42850a);
        throw new IllegalArgumentException(sb3.toString());
    }

    @C5952h
    /* renamed from: b */
    public static C13872x m59361b(String str) {
        try {
            return m59360a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public String mo43710c() {
        return this.f40241b;
    }

    public boolean equals(@C5952h Object obj) {
        return (obj instanceof C13872x) && ((C13872x) obj).f40240a.equals(this.f40240a);
    }

    public int hashCode() {
        return this.f40240a.hashCode();
    }

    public String toString() {
        return this.f40240a;
    }

    /* renamed from: b */
    public String mo43709b() {
        return this.f40242c;
    }

    @C5952h
    /* renamed from: a */
    public Charset mo43707a() {
        return mo43708a((Charset) null);
    }

    @C5952h
    /* renamed from: a */
    public Charset mo43708a(@C5952h Charset charset) {
        try {
            return this.f40243d != null ? Charset.forName(this.f40243d) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
