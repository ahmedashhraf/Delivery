package p076c.p112d.p282e.p283a;

import com.google.common.base.C5822s;
import com.google.common.collect.C8302z2;
import com.google.common.collect.C8302z2.C8303a;
import com.google.common.collect.C8309z3;
import java.util.List;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.e.a.c */
/* compiled from: TrieParser */
class C6735c {

    /* renamed from: a */
    private static final C5822s f18716a = C5822s.m25525c("");

    C6735c() {
    }

    /* renamed from: a */
    static C8302z2<String, C6734b> m32128a(CharSequence charSequence) {
        C8303a g = C8302z2.m39628g();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += m32127a((List<CharSequence>) C8309z3.m39670c(), charSequence.subSequence(i, length), g);
        }
        return g.mo30690a();
    }

    /* renamed from: b */
    private static CharSequence m32130b(CharSequence charSequence) {
        int length = charSequence.length();
        if (length <= 1) {
            return charSequence;
        }
        char[] cArr = new char[length];
        int i = length - 1;
        cArr[0] = charSequence.charAt(i);
        for (int i2 = 1; i2 < length; i2++) {
            cArr[i2] = charSequence.charAt(i - i2);
            int i3 = i2 - 1;
            if (Character.isSurrogatePair(cArr[i2], cArr[i3])) {
                m32129a(cArr, i3, i2);
            }
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static int m32127a(List<CharSequence> list, CharSequence charSequence, C8303a<String, C6734b> aVar) {
        int length = charSequence.length();
        int i = 0;
        char c = 0;
        while (i < length) {
            c = charSequence.charAt(i);
            if (c == '&' || c == '?' || c == '!' || c == ':' || c == ',') {
                break;
            }
            i++;
        }
        list.add(0, m32130b(charSequence.subSequence(0, i)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            String a = f18716a.mo23119a((Iterable<?>) list);
            if (a.length() > 0) {
                aVar.mo30687a(a, C6734b.m32123a(c));
            }
        }
        int i2 = i + 1;
        if (c != '?' && c != ',') {
            while (true) {
                if (i2 >= length) {
                    break;
                }
                i2 += m32127a(list, charSequence.subSequence(i2, length), aVar);
                if (charSequence.charAt(i2) != '?') {
                    if (charSequence.charAt(i2) == ',') {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        list.remove(0);
        return i2;
    }

    /* renamed from: a */
    private static void m32129a(char[] cArr, int i, int i2) {
        char c = cArr[i];
        cArr[i] = cArr[i2];
        cArr[i2] = c;
    }
}
