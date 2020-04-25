package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i.b.a.a.c.j.d.c */
/* compiled from: CommandLineSupport */
final class C14032c {

    /* renamed from: a */
    private static final char f41247a = ' ';

    /* renamed from: b */
    private static final char f41248b = '\"';

    /* renamed from: c */
    private static final char f41249c = '\\';

    /* renamed from: d */
    private static final int f41250d = 0;

    /* renamed from: e */
    private static final int f41251e = 1;

    /* renamed from: f */
    private static final int f41252f = 2;

    private C14032c() {
    }

    /* renamed from: a */
    static String m60565a(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '\"' || c == '\\') {
                sb.append(f41249c);
            }
            sb.append(c);
        }
        if (!(str.indexOf(32) == -1 && str.indexOf(34) == -1)) {
            sb.insert(0, '\"').append('\"');
        }
        return sb.toString();
    }

    /* renamed from: b */
    static List<String> m60568b(String str) {
        char[] charArray;
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char c = 0;
        char c2 = f41247a;
        for (char c3 : str.toCharArray()) {
            char c4 = '\"';
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (c3 == '\"' || c3 == '\\') {
                            sb.setCharAt(sb.length() - 1, c3);
                        } else if (c3 == c2) {
                            m60567a(arrayList, sb);
                        } else {
                            sb.append(c3);
                        }
                    }
                } else if (c3 == c2) {
                    m60567a(arrayList, sb);
                    c = 0;
                } else if (c3 == '\\') {
                    sb.append(f41249c);
                    c = 2;
                } else {
                    sb.append(c3);
                }
            } else if (Character.isWhitespace(c3)) {
            } else {
                if (c3 != '\"') {
                    sb.append(c3);
                    c4 = f41247a;
                }
                c2 = c4;
            }
            c = 1;
        }
        m60567a(arrayList, sb);
        return arrayList;
    }

    /* renamed from: a */
    static String m60566a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (String str : list) {
            if (z) {
                sb.append(f41247a);
            }
            sb.append(m60565a(str));
            z = true;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m60567a(List<String> list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
            sb.setLength(0);
        }
    }
}
