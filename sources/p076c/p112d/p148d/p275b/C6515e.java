package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: c.d.d.b.e */
/* compiled from: CharEscaperBuilder */
public final class C6515e {

    /* renamed from: a */
    private final Map<Character, String> f18225a = new HashMap();

    /* renamed from: b */
    private int f18226b = -1;

    /* renamed from: c.d.d.b.e$a */
    /* compiled from: CharEscaperBuilder */
    private static class C6516a extends C6514d {

        /* renamed from: c */
        private final char[][] f18227c;

        /* renamed from: d */
        private final int f18228d;

        C6516a(char[][] cArr) {
            this.f18227c = cArr;
            this.f18228d = cArr.length;
        }

        /* renamed from: a */
        public String mo26396a(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.f18227c;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return mo26403a(str, i);
                }
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public char[] mo26397a(char c) {
            if (c < this.f18228d) {
                return this.f18227c[c];
            }
            return null;
        }
    }

    /* renamed from: a */
    public C6515e mo26404a(char c, String str) {
        this.f18225a.put(Character.valueOf(c), C7397x.m35664a(str));
        if (c > this.f18226b) {
            this.f18226b = c;
        }
        return this;
    }

    /* renamed from: b */
    public C6517f mo26407b() {
        return new C6516a(mo26406a());
    }

    /* renamed from: a */
    public C6515e mo26405a(char[] cArr, String str) {
        C7397x.m35664a(str);
        for (char a : cArr) {
            mo26404a(a, str);
        }
        return this;
    }

    /* renamed from: a */
    public char[][] mo26406a() {
        char[][] cArr = new char[(this.f18226b + 1)][];
        for (Entry entry : this.f18225a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
        return cArr;
    }
}
