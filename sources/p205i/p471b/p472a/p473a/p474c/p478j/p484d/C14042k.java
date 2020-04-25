package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.util.regex.Pattern;

/* renamed from: i.b.a.a.c.j.d.k */
/* compiled from: WildcardMatcher */
public class C14042k {

    /* renamed from: a */
    private final Pattern f41266a;

    public C14042k(String str) {
        String[] split = str.split("\\:");
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int length = split.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            String str2 = split[i];
            if (z) {
                sb.append('|');
            }
            sb.append('(');
            sb.append(m60594b(str2));
            sb.append(')');
            i++;
            z = true;
        }
        this.f41266a = Pattern.compile(sb.toString());
    }

    /* renamed from: b */
    private static CharSequence m60594b(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char c : str.toCharArray()) {
            if (c == '*') {
                sb.append(".*");
            } else if (c != '?') {
                sb.append(Pattern.quote(String.valueOf(c)));
            } else {
                sb.append(".?");
            }
        }
        return sb;
    }

    /* renamed from: a */
    public boolean mo44367a(String str) {
        return this.f41266a.matcher(str).matches();
    }
}
