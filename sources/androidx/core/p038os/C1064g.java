package androidx.core.p038os;

import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0237z;
import com.mrsool.utils.C11644i;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.g */
/* compiled from: LocaleListCompatWrapper */
final class C1064g implements C1065h {

    /* renamed from: c */
    private static final Locale[] f4733c = new Locale[0];

    /* renamed from: d */
    private static final Locale f4734d = new Locale(C11644i.f33183R5, "XA");

    /* renamed from: e */
    private static final Locale f4735e = new Locale(C11644i.f33191S5, "XB");

    /* renamed from: f */
    private static final Locale f4736f = C1063f.m6162a("en-Latn");

    /* renamed from: a */
    private final Locale[] f4737a;
    @C0193h0

    /* renamed from: b */
    private final String f4738b;

    C1064g(@C0193h0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f4737a = f4733c;
            this.f4738b = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            String str = "list[";
            if (locale == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                m6176a(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i);
                sb3.append("] is a repetition");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        this.f4737a = localeArr2;
        this.f4738b = sb.toString();
    }

    /* renamed from: b */
    private int m6178b(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f4737a;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (m6174a(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: c */
    private static String m6179c(Locale locale) {
        String str = "";
        if (VERSION.SDK_INT >= 21) {
            String script = locale.getScript();
            if (!script.isEmpty()) {
                return script;
            }
        }
        return str;
    }

    /* renamed from: d */
    private static boolean m6180d(Locale locale) {
        return f4734d.equals(locale) || f4735e.equals(locale);
    }

    /* renamed from: a */
    public int mo5215a(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f4737a;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @C0195i0
    /* renamed from: b */
    public Object mo5218b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1064g)) {
            return false;
        }
        Locale[] localeArr = ((C1064g) obj).f4737a;
        if (this.f4737a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f4737a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f4737a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f4737a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public boolean isEmpty() {
        return this.f4737a.length == 0;
    }

    public int size() {
        return this.f4737a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f4737a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f4737a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m6177b(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f4737a
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = f4736f
            int r6 = r4.m6178b(r6)
            if (r6 != 0) goto L_0x001b
            return r2
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0021:
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.p038os.C1063f.m6162a(r1)
            int r1 = r4.m6178b(r1)
            if (r1 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r1 >= r6) goto L_0x0025
            r6 = r1
            goto L_0x0025
        L_0x0040:
            if (r6 != r0) goto L_0x0043
            return r2
        L_0x0043:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p038os.C1064g.m6177b(java.util.Collection, boolean):int");
    }

    /* renamed from: a */
    public String mo5216a() {
        return this.f4738b;
    }

    @C0224v0
    /* renamed from: a */
    static void m6176a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @C0237z(from = 0, mo691to = 1)
    /* renamed from: a */
    private static int m6174a(Locale locale, Locale locale2) {
        int i = 1;
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m6180d(locale) || m6180d(locale2)) {
            return 0;
        }
        String c = m6179c(locale);
        if (!c.isEmpty()) {
            return c.equals(m6179c(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (!country.isEmpty() && !country.equals(locale2.getCountry())) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    private Locale m6175a(Collection<String> collection, boolean z) {
        int b = m6177b(collection, z);
        if (b == -1) {
            return null;
        }
        return this.f4737a[b];
    }

    /* renamed from: a */
    public Locale mo5217a(@C0193h0 String[] strArr) {
        return m6175a((Collection<String>) Arrays.asList(strArr), false);
    }
}
