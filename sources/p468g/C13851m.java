package p468g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.C14910b;
import okhttp3.internal.p516g.C14945d;
import p201f.p202a.C5952h;

/* renamed from: g.m */
/* compiled from: Cookie */
public final class C13851m {

    /* renamed from: j */
    private static final Pattern f40160j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f40161k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f40162l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f40163m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f40164a;

    /* renamed from: b */
    private final String f40165b;

    /* renamed from: c */
    private final long f40166c;

    /* renamed from: d */
    private final String f40167d;

    /* renamed from: e */
    private final String f40168e;

    /* renamed from: f */
    private final boolean f40169f;

    /* renamed from: g */
    private final boolean f40170g;

    /* renamed from: h */
    private final boolean f40171h;

    /* renamed from: i */
    private final boolean f40172i;

    /* renamed from: g.m$a */
    /* compiled from: Cookie */
    public static final class C13852a {
        @C5952h

        /* renamed from: a */
        String f40173a;
        @C5952h

        /* renamed from: b */
        String f40174b;

        /* renamed from: c */
        long f40175c = C14945d.f43333a;
        @C5952h

        /* renamed from: d */
        String f40176d;

        /* renamed from: e */
        String f40177e = "/";

        /* renamed from: f */
        boolean f40178f;

        /* renamed from: g */
        boolean f40179g;

        /* renamed from: h */
        boolean f40180h;

        /* renamed from: i */
        boolean f40181i;

        /* renamed from: a */
        public C13852a mo43546a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > C14945d.f43333a) {
                j = 253402300799999L;
            }
            this.f40175c = j;
            this.f40180h = true;
            return this;
        }

        /* renamed from: b */
        public C13852a mo43550b(String str) {
            return m59163a(str, true);
        }

        /* renamed from: c */
        public C13852a mo43552c(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f40173a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        /* renamed from: d */
        public C13852a mo43553d(String str) {
            if (str.startsWith("/")) {
                this.f40177e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        /* renamed from: e */
        public C13852a mo43554e(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.f40174b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        /* renamed from: b */
        public C13852a mo43549b() {
            this.f40179g = true;
            return this;
        }

        /* renamed from: a */
        public C13852a mo43547a(String str) {
            return m59163a(str, false);
        }

        /* renamed from: a */
        private C13852a m59163a(String str, boolean z) {
            if (str != null) {
                String a = C14910b.m66044a(str);
                if (a != null) {
                    this.f40176d = a;
                    this.f40181i = z;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected domain: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("domain == null");
        }

        /* renamed from: c */
        public C13852a mo43551c() {
            this.f40178f = true;
            return this;
        }

        /* renamed from: a */
        public C13851m mo43548a() {
            return new C13851m(this);
        }
    }

    private C13851m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f40164a = str;
        this.f40165b = str2;
        this.f40166c = j;
        this.f40167d = str3;
        this.f40168e = str4;
        this.f40169f = z;
        this.f40170g = z2;
        this.f40172i = z3;
        this.f40171h = z4;
    }

    /* renamed from: a */
    public String mo43532a() {
        return this.f40167d;
    }

    /* renamed from: b */
    public long mo43535b() {
        return this.f40166c;
    }

    /* renamed from: c */
    public boolean mo43536c() {
        return this.f40172i;
    }

    /* renamed from: d */
    public boolean mo43537d() {
        return this.f40170g;
    }

    /* renamed from: e */
    public String mo43538e() {
        return this.f40164a;
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = false;
        if (!(obj instanceof C13851m)) {
            return false;
        }
        C13851m mVar = (C13851m) obj;
        if (mVar.f40164a.equals(this.f40164a) && mVar.f40165b.equals(this.f40165b) && mVar.f40167d.equals(this.f40167d) && mVar.f40168e.equals(this.f40168e) && mVar.f40166c == this.f40166c && mVar.f40169f == this.f40169f && mVar.f40170g == this.f40170g && mVar.f40171h == this.f40171h && mVar.f40172i == this.f40172i) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public String mo43540f() {
        return this.f40168e;
    }

    /* renamed from: g */
    public boolean mo43541g() {
        return this.f40171h;
    }

    /* renamed from: h */
    public boolean mo43542h() {
        return this.f40169f;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f40164a.hashCode()) * 31) + this.f40165b.hashCode()) * 31) + this.f40167d.hashCode()) * 31) + this.f40168e.hashCode()) * 31;
        long j = this.f40166c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.f40169f ^ true ? 1 : 0)) * 31) + (this.f40170g ^ true ? 1 : 0)) * 31) + (this.f40171h ^ true ? 1 : 0)) * 31) + (this.f40172i ^ true ? 1 : 0);
    }

    /* renamed from: i */
    public String mo43544i() {
        return this.f40165b;
    }

    public String toString() {
        return mo43533a(false);
    }

    /* renamed from: b */
    private static boolean m59151b(C13868v vVar, String str) {
        String c = vVar.mo43641c();
        if (c.equals(str)) {
            return true;
        }
        if (!c.startsWith(str) || (!str.endsWith("/") && c.charAt(str.length()) != '/')) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo43534a(C13868v vVar) {
        boolean z;
        if (this.f40172i) {
            z = vVar.mo43649h().equals(this.f40167d);
        } else {
            z = m59149a(vVar.mo43649h(), this.f40167d);
        }
        if (!z || !m59151b(vVar, this.f40168e)) {
            return false;
        }
        if (!this.f40169f || vVar.mo43651i()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m59149a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C14910b.m66073d(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static long m59150b(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    j = Long.MAX_VALUE;
                }
                return j;
            }
            throw e;
        }
    }

    C13851m(C13852a aVar) {
        String str = aVar.f40173a;
        if (str != null) {
            String str2 = aVar.f40174b;
            if (str2 != null) {
                String str3 = aVar.f40176d;
                if (str3 != null) {
                    this.f40164a = str;
                    this.f40165b = str2;
                    this.f40166c = aVar.f40175c;
                    this.f40167d = str3;
                    this.f40168e = aVar.f40177e;
                    this.f40169f = aVar.f40178f;
                    this.f40170g = aVar.f40179g;
                    this.f40171h = aVar.f40180h;
                    this.f40172i = aVar.f40181i;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    @C5952h
    /* renamed from: a */
    public static C13851m m59146a(C13868v vVar, String str) {
        return m59145a(System.currentTimeMillis(), vVar, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0131  */
    @p201f.p202a.C5952h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p468g.C13851m m59145a(long r24, p468g.C13868v r26, java.lang.String r27) {
        /*
            r0 = r27
            int r1 = r27.length()
            r2 = 59
            r3 = 0
            int r4 = okhttp3.internal.C14910b.m66038a(r0, r3, r1, r2)
            r5 = 61
            int r6 = okhttp3.internal.C14910b.m66038a(r0, r3, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = okhttp3.internal.C14910b.m66072d(r0, r3, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0146
            int r8 = okhttp3.internal.C14910b.m66070c(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0146
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = okhttp3.internal.C14910b.m66072d(r0, r6, r4)
            int r11 = okhttp3.internal.C14910b.m66070c(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r19 = r8
            r14 = r10
            r21 = r12
            r17 = 0
            r18 = 0
            r20 = 1
            r23 = 0
        L_0x004d:
            if (r4 >= r1) goto L_0x00c1
            int r7 = okhttp3.internal.C14910b.m66038a(r0, r4, r1, r2)
            int r2 = okhttp3.internal.C14910b.m66038a(r0, r4, r7, r5)
            java.lang.String r4 = okhttp3.internal.C14910b.m66072d(r0, r4, r2)
            if (r2 >= r7) goto L_0x0064
            int r2 = r2 + 1
            java.lang.String r2 = okhttp3.internal.C14910b.m66072d(r0, r2, r7)
            goto L_0x0066
        L_0x0064:
            java.lang.String r2 = ""
        L_0x0066:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0079
            int r4 = r2.length()     // Catch:{ IllegalArgumentException -> 0x00b9 }
            long r4 = m59144a(r2, r3, r4)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            r21 = r4
            goto L_0x0086
        L_0x0079:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0089
            long r4 = m59150b(r2)     // Catch:{  }
            r14 = r4
        L_0x0086:
            r23 = 1
            goto L_0x00b9
        L_0x0089:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0099
            java.lang.String r2 = m59147a(r2)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            r8 = r2
            r20 = 0
            goto L_0x00b9
        L_0x0099:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00a4
            r19 = r2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r2 = "secure"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00af
            r17 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r2 = "httponly"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00b9
            r18 = 1
        L_0x00b9:
            int r4 = r7 + 1
            r2 = 59
            r5 = 61
            r7 = 0
            goto L_0x004d
        L_0x00c1:
            r0 = -9223372036854775808
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00c9
        L_0x00c7:
            r11 = r0
            goto L_0x00ee
        L_0x00c9:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00db
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            goto L_0x00e0
        L_0x00db:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00e0:
            long r0 = r24 + r14
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r2 < 0) goto L_0x00ea
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c7
        L_0x00ea:
            r11 = r12
            goto L_0x00ee
        L_0x00ec:
            r11 = r21
        L_0x00ee:
            java.lang.String r0 = r26.mo43649h()
            if (r8 != 0) goto L_0x00f7
            r13 = r0
            r1 = 0
            goto L_0x0101
        L_0x00f7:
            boolean r1 = m59149a(r0, r8)
            if (r1 != 0) goto L_0x00ff
            r1 = 0
            return r1
        L_0x00ff:
            r1 = 0
            r13 = r8
        L_0x0101:
            int r0 = r0.length()
            int r2 = r13.length()
            if (r0 == r2) goto L_0x0116
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m66658a()
            java.lang.String r0 = r0.mo46682a(r13)
            if (r0 != 0) goto L_0x0116
            return r1
        L_0x0116:
            java.lang.String r0 = "/"
            r7 = r19
            if (r7 == 0) goto L_0x0125
            boolean r1 = r7.startsWith(r0)
            if (r1 != 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r14 = r7
            goto L_0x0136
        L_0x0125:
            java.lang.String r1 = r26.mo43641c()
            r2 = 47
            int r2 = r1.lastIndexOf(r2)
            if (r2 == 0) goto L_0x0135
            java.lang.String r0 = r1.substring(r3, r2)
        L_0x0135:
            r14 = r0
        L_0x0136:
            g.m r0 = new g.m
            r8 = r0
            r10 = r6
            r15 = r17
            r16 = r18
            r17 = r20
            r18 = r23
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0146:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p468g.C13851m.m59145a(long, g.v, java.lang.String):g.m");
    }

    /* renamed from: a */
    private static long m59144a(String str, int i, int i2) {
        int a = m59143a(str, i, i2, false);
        Matcher matcher = f40163m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m59143a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f40163m).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = parseInt2;
                i4 = parseInt;
            } else if (i5 == -1 && matcher.usePattern(f40162l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f40161k).matches()) {
                i6 = f40161k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(f40160j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a = m59143a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C14910b.f43173p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: a */
    private static int m59143a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static String m59147a(String str) {
        String str2 = ".";
        if (!str.endsWith(str2)) {
            if (str.startsWith(str2)) {
                str = str.substring(1);
            }
            String a = C14910b.m66044a(str);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static List<C13851m> m59148a(C13868v vVar, C13866u uVar) {
        List c = uVar.mo43617c("Set-Cookie");
        int size = c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C13851m a = m59146a(vVar, (String) c.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo43533a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40164a);
        sb.append('=');
        sb.append(this.f40165b);
        if (this.f40171h) {
            if (this.f40166c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C14945d.m66220a(new Date(this.f40166c)));
            }
        }
        if (!this.f40172i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f40167d);
        }
        sb.append("; path=");
        sb.append(this.f40168e);
        if (this.f40169f) {
            sb.append("; secure");
        }
        if (this.f40170g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
