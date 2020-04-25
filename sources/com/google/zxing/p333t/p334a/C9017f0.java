package com.google.zxing.p333t.p334a;

import com.facebook.share.internal.ShareConstants;
import com.google.zxing.C8985n;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.f0 */
/* compiled from: VCardResultParser */
public final class C9017f0 extends C9037u {

    /* renamed from: f */
    private static final Pattern f23577f = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: g */
    private static final Pattern f23578g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: h */
    private static final Pattern f23579h = Pattern.compile("\r\n[ \t]");

    /* renamed from: i */
    private static final Pattern f23580i = Pattern.compile("\\\\[nN]");

    /* renamed from: j */
    private static final Pattern f23581j = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: k */
    private static final Pattern f23582k = Pattern.compile("=");

    /* renamed from: l */
    private static final Pattern f23583l = Pattern.compile(";");

    /* renamed from: m */
    private static final Pattern f23584m = Pattern.compile("(?<!\\\\);+");

    /* renamed from: n */
    private static final Pattern f23585n = Pattern.compile(",");

    /* renamed from: o */
    private static final Pattern f23586o = Pattern.compile("[;,]");

    /* renamed from: b */
    static List<List<String>> m42138b(CharSequence charSequence, String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        ArrayList arrayList;
        int indexOf;
        String str3;
        String str4 = str;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        List<List<String>> list = null;
        while (i2 < length) {
            StringBuilder sb = new StringBuilder("(?:^|\n)");
            sb.append(charSequence);
            sb.append("(?:;([^:]*))?:");
            Matcher matcher = Pattern.compile(sb.toString(), 2).matcher(str4);
            if (i2 > 0) {
                i2--;
            }
            if (!matcher.find(i2)) {
                break;
            }
            int end = matcher.end(i);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f23583l.split(group);
                int length2 = split.length;
                int i3 = 0;
                arrayList = null;
                z3 = false;
                str2 = null;
                while (i3 < length2) {
                    String str5 = split[i3];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str5);
                    String[] split2 = f23582k.split(str5, 2);
                    if (split2.length > 1) {
                        String str6 = split2[i];
                        String str7 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str6) && "QUOTED-PRINTABLE".equalsIgnoreCase(str7)) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str6)) {
                            str2 = str7;
                        }
                    }
                    i3++;
                    i = 0;
                }
            } else {
                arrayList = null;
                z3 = false;
                str2 = null;
            }
            int i4 = end;
            while (true) {
                indexOf = str4.indexOf(10, i4);
                if (indexOf >= 0) {
                    if (indexOf < str.length() - 1) {
                        int i5 = indexOf + 1;
                        if (str4.charAt(i5) == ' ' || str4.charAt(i5) == 9) {
                            i4 = indexOf + 2;
                        }
                    }
                    if (!z3 || ((indexOf <= 0 || str4.charAt(indexOf - 1) != '=') && (indexOf < 2 || str4.charAt(indexOf - 2) != '='))) {
                        break;
                    }
                    i4 = indexOf + 1;
                } else {
                    break;
                }
            }
            if (indexOf < 0) {
                i2 = length;
            } else {
                if (indexOf > end) {
                    if (list == null) {
                        list = new ArrayList<>(1);
                    }
                    if (indexOf > 0 && str4.charAt(indexOf - 1) == 13) {
                        indexOf--;
                    }
                    String substring = str4.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    String str8 = "\n";
                    if (z3) {
                        str3 = m42130a(substring, str2);
                        if (z2) {
                            str3 = f23584m.matcher(str3).replaceAll(str8).trim();
                        }
                    } else {
                        if (z2) {
                            substring = f23584m.matcher(substring).replaceAll(str8).trim();
                        }
                        str3 = f23581j.matcher(f23580i.matcher(f23579h.matcher(substring).replaceAll("")).replaceAll(str8)).replaceAll("$1");
                    }
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(str3);
                        list.add(arrayList2);
                    } else {
                        arrayList.add(0, str3);
                        list.add(arrayList);
                        i2 = indexOf + 1;
                    }
                }
                i2 = indexOf + 1;
            }
            i = 0;
        }
        return list;
    }

    /* renamed from: a */
    public C9012d m42141a(C8985n nVar) {
        String[] strArr;
        String[] strArr2;
        String b = C9037u.m42253b(nVar);
        Matcher matcher = f23577f.matcher(b);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List b2 = m42138b("FN", b, true, false);
        if (b2 == null) {
            b2 = m42138b("N", b, true, false);
            m42134a((Iterable<List<String>>) b2);
        }
        List a = m42132a("NICKNAME", b, true, false);
        if (a == null) {
            strArr = null;
        } else {
            strArr = f23585n.split((CharSequence) a.get(0));
        }
        List b3 = m42138b("TEL", b, true, false);
        List b4 = m42138b("EMAIL", b, true, false);
        List a2 = m42132a("NOTE", b, false, false);
        List b5 = m42138b("ADR", b, true, true);
        List a3 = m42132a("ORG", b, true, true);
        List a4 = m42132a("BDAY", b, true, false);
        List list = (a4 == null || m42136a((CharSequence) a4.get(0))) ? a4 : null;
        List a5 = m42132a(ShareConstants.TITLE, b, true, false);
        List b6 = m42138b("URL", b, true, false);
        List a6 = m42132a("IMPP", b, true, false);
        List a7 = m42132a("GEO", b, true, false);
        if (a7 == null) {
            strArr2 = null;
        } else {
            strArr2 = f23586o.split((CharSequence) a7.get(0));
        }
        C9012d dVar = new C9012d(m42137a((Collection<List<String>>) b2), strArr, null, m42137a((Collection<List<String>>) b3), m42139b(b3), m42137a((Collection<List<String>>) b4), m42139b(b4), m42131a(a6), m42131a(a2), m42137a((Collection<List<String>>) b5), m42139b(b5), m42131a(a3), m42131a(list), m42131a(a5), m42137a((Collection<List<String>>) b6), (strArr2 == null || strArr2.length == 2) ? strArr2 : null);
        return dVar;
    }

    /* renamed from: a */
    private static String m42130a(CharSequence charSequence, String str) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (!(charAt == 10 || charAt == 13)) {
                if (charAt != '=') {
                    m42133a(byteArrayOutputStream, str, sb);
                    sb.append(charAt);
                } else if (i < length - 2) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (!(charAt2 == 13 || charAt2 == 10)) {
                        i += 2;
                        char charAt3 = charSequence.charAt(i);
                        int a = C9037u.m42245a(charAt2);
                        int a2 = C9037u.m42245a(charAt3);
                        if (a >= 0 && a2 >= 0) {
                            byteArrayOutputStream.write((a << 4) + a2);
                        }
                    }
                }
            }
            i++;
        }
        m42133a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: b */
    private static String[] m42139b(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list : collection) {
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    str = null;
                    break;
                }
                String str2 = (String) list.get(i);
                int indexOf = str2.indexOf(61);
                if (indexOf < 0) {
                    str = str2;
                    break;
                }
                if ("TYPE".equalsIgnoreCase(str2.substring(0, indexOf))) {
                    str = str2.substring(indexOf + 1);
                    break;
                }
                i++;
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: a */
    private static void m42133a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str3 = "UTF-8";
            if (str == null) {
                str2 = new String(byteArray, Charset.forName(str3));
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, Charset.forName(str3));
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: a */
    static List<String> m42132a(CharSequence charSequence, String str, boolean z, boolean z2) {
        List b = m42138b(charSequence, str, z, z2);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return (List) b.get(0);
    }

    /* renamed from: a */
    private static String m42131a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: a */
    private static String[] m42137a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list : collection) {
            String str = (String) list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: a */
    private static boolean m42136a(CharSequence charSequence) {
        return charSequence == null || f23578g.matcher(charSequence).matches();
    }

    /* renamed from: a */
    private static void m42134a(Iterable<List<String>> iterable) {
        if (iterable != null) {
            for (List list : iterable) {
                String str = (String) list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4) {
                    int indexOf = str.indexOf(59, i2);
                    if (indexOf < 0) {
                        break;
                    }
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m42135a(strArr, 3, sb);
                m42135a(strArr, 1, sb);
                m42135a(strArr, 2, sb);
                m42135a(strArr, 0, sb);
                m42135a(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: a */
    private static void m42135a(String[] strArr, int i, StringBuilder sb) {
        if (strArr[i] != null && !strArr[i].isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i]);
        }
    }
}
