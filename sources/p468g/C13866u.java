package p468g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.C14910b;
import okhttp3.internal.p516g.C14945d;
import p201f.p202a.C5952h;

/* renamed from: g.u */
/* compiled from: Headers */
public final class C13866u {

    /* renamed from: a */
    private final String[] f40204a;

    /* renamed from: g.u$a */
    /* compiled from: Headers */
    public static final class C13867a {

        /* renamed from: a */
        final List<String> f40205a = new ArrayList(20);

        /* renamed from: a */
        public C13867a mo43624a(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return mo43625a(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C13867a mo43628b(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                return mo43629b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            String str3 = "";
            if (str.startsWith(str2)) {
                return mo43629b(str3, str.substring(1));
            }
            return mo43629b(str3, str);
        }

        /* renamed from: c */
        public C13867a mo43631c(String str, String str2) {
            C13866u.m59241d(str);
            return mo43629b(str, str2);
        }

        /* renamed from: d */
        public C13867a mo43633d(String str) {
            int i = 0;
            while (i < this.f40205a.size()) {
                if (str.equalsIgnoreCase((String) this.f40205a.get(i))) {
                    this.f40205a.remove(i);
                    this.f40205a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public String mo43632c(String str) {
            for (int size = this.f40205a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f40205a.get(size))) {
                    return (String) this.f40205a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: a */
        public C13867a mo43625a(String str, String str2) {
            C13866u.m59241d(str);
            C13866u.m59240a(str2, str);
            return mo43629b(str, str2);
        }

        /* renamed from: d */
        public C13867a mo43634d(String str, String str2) {
            C13866u.m59241d(str);
            C13866u.m59240a(str2, str);
            mo43633d(str);
            mo43629b(str, str2);
            return this;
        }

        /* renamed from: b */
        public C13867a mo43630b(String str, Date date) {
            if (date != null) {
                mo43634d(str, C14945d.m66220a(date));
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("value for name ");
            sb.append(str);
            sb.append(" == null");
            throw new NullPointerException(sb.toString());
        }

        /* renamed from: a */
        public C13867a mo43623a(C13866u uVar) {
            int d = uVar.mo43618d();
            for (int i = 0; i < d; i++) {
                mo43629b(uVar.mo43611a(i), uVar.mo43613b(i));
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C13867a mo43629b(String str, String str2) {
            this.f40205a.add(str);
            this.f40205a.add(str2.trim());
            return this;
        }

        /* renamed from: a */
        public C13867a mo43626a(String str, Date date) {
            if (date != null) {
                mo43625a(str, C14945d.m66220a(date));
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("value for name ");
            sb.append(str);
            sb.append(" == null");
            throw new NullPointerException(sb.toString());
        }

        /* renamed from: a */
        public C13866u mo43627a() {
            return new C13866u(this);
        }
    }

    C13866u(C13867a aVar) {
        List<String> list = aVar.f40205a;
        this.f40204a = (String[]) list.toArray(new String[list.size()]);
    }

    @C5952h
    /* renamed from: a */
    public String mo43612a(String str) {
        return m59239a(this.f40204a, str);
    }

    @C5952h
    /* renamed from: b */
    public Date mo43614b(String str) {
        String a = mo43612a(str);
        if (a != null) {
            return C14945d.m66221a(a);
        }
        return null;
    }

    /* renamed from: c */
    public List<String> mo43617c(String str) {
        int d = mo43618d();
        ArrayList arrayList = null;
        for (int i = 0; i < d; i++) {
            if (str.equalsIgnoreCase(mo43611a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo43613b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public int mo43618d() {
        return this.f40204a.length / 2;
    }

    /* renamed from: e */
    public Map<String, List<String>> mo43619e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int d = mo43618d();
        for (int i = 0; i < d; i++) {
            String lowerCase = mo43611a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(mo43613b(i));
        }
        return treeMap;
    }

    public boolean equals(@C5952h Object obj) {
        return (obj instanceof C13866u) && Arrays.equals(((C13866u) obj).f40204a, this.f40204a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f40204a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int d = mo43618d();
        for (int i = 0; i < d; i++) {
            sb.append(mo43611a(i));
            sb.append(": ");
            sb.append(mo43613b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: d */
    static void m59241d(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C14910b.m66045a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public String mo43611a(int i) {
        return this.f40204a[i * 2];
    }

    private C13866u(String[] strArr) {
        this.f40204a = strArr;
    }

    /* renamed from: a */
    public long mo43610a() {
        String[] strArr = this.f40204a;
        long length = (long) (strArr.length * 2);
        for (int i = 0; i < strArr.length; i++) {
            length += (long) this.f40204a[i].length();
        }
        return length;
    }

    /* renamed from: b */
    public String mo43613b(int i) {
        return this.f40204a[(i * 2) + 1];
    }

    /* renamed from: b */
    public Set<String> mo43615b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int d = mo43618d();
        for (int i = 0; i < d; i++) {
            treeSet.add(mo43611a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* renamed from: a */
    private static String m59239a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: c */
    public C13867a mo43616c() {
        C13867a aVar = new C13867a();
        Collections.addAll(aVar.f40205a, this.f40204a);
        return aVar;
    }

    /* renamed from: a */
    public static C13866u m59238a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m59241d(str);
                m59240a(str2, str);
            }
            return new C13866u(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    /* renamed from: a */
    public static C13866u m59237a(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) entry.getKey()).trim();
                String trim2 = ((String) entry.getValue()).trim();
                m59241d(trim);
                m59240a(trim2, trim);
                strArr[i] = trim;
                strArr[i + 1] = trim2;
                i += 2;
            }
            return new C13866u(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    /* renamed from: a */
    static void m59240a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C14910b.m66045a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }
}
