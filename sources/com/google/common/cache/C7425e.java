package com.google.common.cache;

import com.google.common.base.C5786c0;
import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8302z2;
import java.util.concurrent.TimeUnit;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.cache.e */
/* compiled from: CacheBuilderSpec */
public final class C7425e {

    /* renamed from: o */
    private static final C5786c0 f20877o = C5786c0.m25366b(',').mo23076b();

    /* renamed from: p */
    private static final C5786c0 f20878p = C5786c0.m25366b('=').mo23076b();

    /* renamed from: q */
    private static final C8302z2<String, C7438m> f20879q;
    @C2778d

    /* renamed from: a */
    Integer f20880a;
    @C2778d

    /* renamed from: b */
    Long f20881b;
    @C2778d

    /* renamed from: c */
    Long f20882c;
    @C2778d

    /* renamed from: d */
    Integer f20883d;
    @C2778d

    /* renamed from: e */
    C7496u f20884e;
    @C2778d

    /* renamed from: f */
    C7496u f20885f;
    @C2778d

    /* renamed from: g */
    Boolean f20886g;
    @C2778d

    /* renamed from: h */
    long f20887h;
    @C2778d

    /* renamed from: i */
    TimeUnit f20888i;
    @C2778d

    /* renamed from: j */
    long f20889j;
    @C2778d

    /* renamed from: k */
    TimeUnit f20890k;
    @C2778d

    /* renamed from: l */
    long f20891l;
    @C2778d

    /* renamed from: m */
    TimeUnit f20892m;

    /* renamed from: n */
    private final String f20893n;

    /* renamed from: com.google.common.cache.e$a */
    /* compiled from: CacheBuilderSpec */
    static /* synthetic */ class C7426a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20894a = new int[C7496u.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.cache.j$u[] r0 = com.google.common.cache.C7447j.C7496u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20894a = r0
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.cache.j$u r1 = com.google.common.cache.C7447j.C7496u.WEAK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20894a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.cache.j$u r1 = com.google.common.cache.C7447j.C7496u.SOFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7425e.C7426a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.cache.e$b */
    /* compiled from: CacheBuilderSpec */
    static class C7427b extends C7429d {
        C7427b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29342a(C7425e eVar, long j, TimeUnit timeUnit) {
            C7397x.m35671a(eVar.f20890k == null, (Object) "expireAfterAccess already set");
            eVar.f20889j = j;
            eVar.f20890k = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.e$c */
    /* compiled from: CacheBuilderSpec */
    static class C7428c extends C7431f {
        C7428c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29343a(C7425e eVar, int i) {
            C7397x.m35672a(eVar.f20883d == null, "concurrency level was already set to ", eVar.f20883d);
            eVar.f20883d = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.e$d */
    /* compiled from: CacheBuilderSpec */
    static abstract class C7429d implements C7438m {
        C7429d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo29342a(C7425e eVar, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, String str2) {
            C7397x.m35672a((str2 == null || str2.length() == 0) ? false : true, "value of key %s omitted", str);
            try {
                char charAt = str2.charAt(str2.length() - 1);
                long j = 1;
                if (charAt == 'd') {
                    j = 24;
                } else if (charAt != 'h') {
                    if (charAt != 'm') {
                        if (charAt == 's') {
                            mo29342a(eVar, Long.parseLong(str2.substring(0, str2.length() - 1)) * j, TimeUnit.SECONDS);
                        }
                        throw new IllegalArgumentException(String.format("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", new Object[]{str, str2}));
                    }
                    j *= 60;
                    mo29342a(eVar, Long.parseLong(str2.substring(0, str2.length() - 1)) * j, TimeUnit.SECONDS);
                }
                j *= 60;
                j *= 60;
                mo29342a(eVar, Long.parseLong(str2.substring(0, str2.length() - 1)) * j, TimeUnit.SECONDS);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[]{str, str2}));
            }
        }
    }

    /* renamed from: com.google.common.cache.e$e */
    /* compiled from: CacheBuilderSpec */
    static class C7430e extends C7431f {
        C7430e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29343a(C7425e eVar, int i) {
            C7397x.m35672a(eVar.f20880a == null, "initial capacity was already set to ", eVar.f20880a);
            eVar.f20880a = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.e$f */
    /* compiled from: CacheBuilderSpec */
    static abstract class C7431f implements C7438m {
        C7431f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo29343a(C7425e eVar, int i);

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, String str2) {
            C7397x.m35672a((str2 == null || str2.length() == 0) ? false : true, "value of key %s omitted", str);
            try {
                mo29343a(eVar, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[]{str, str2}), e);
            }
        }
    }

    /* renamed from: com.google.common.cache.e$g */
    /* compiled from: CacheBuilderSpec */
    static class C7432g implements C7438m {

        /* renamed from: a */
        private final C7496u f20895a;

        public C7432g(C7496u uVar) {
            this.f20895a = uVar;
        }

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, @C5952h String str2) {
            C7397x.m35672a(str2 == null, "key %s does not take values", str);
            C7397x.m35672a(eVar.f20884e == null, "%s was already set to %s", str, eVar.f20884e);
            eVar.f20884e = this.f20895a;
        }
    }

    /* renamed from: com.google.common.cache.e$h */
    /* compiled from: CacheBuilderSpec */
    static abstract class C7433h implements C7438m {
        C7433h() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo29345a(C7425e eVar, long j);

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, String str2) {
            C7397x.m35672a((str2 == null || str2.length() == 0) ? false : true, "value of key %s omitted", str);
            try {
                mo29345a(eVar, Long.parseLong(str2));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[]{str, str2}), e);
            }
        }
    }

    /* renamed from: com.google.common.cache.e$i */
    /* compiled from: CacheBuilderSpec */
    static class C7434i extends C7433h {
        C7434i() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29345a(C7425e eVar, long j) {
            C7397x.m35672a(eVar.f20881b == null, "maximum size was already set to ", eVar.f20881b);
            C7397x.m35672a(eVar.f20882c == null, "maximum weight was already set to ", eVar.f20882c);
            eVar.f20881b = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.e$j */
    /* compiled from: CacheBuilderSpec */
    static class C7435j extends C7433h {
        C7435j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29345a(C7425e eVar, long j) {
            C7397x.m35672a(eVar.f20882c == null, "maximum weight was already set to ", eVar.f20882c);
            C7397x.m35672a(eVar.f20881b == null, "maximum size was already set to ", eVar.f20881b);
            eVar.f20882c = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.e$k */
    /* compiled from: CacheBuilderSpec */
    static class C7436k implements C7438m {
        C7436k() {
        }

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, @C5952h String str2) {
            boolean z = false;
            C7397x.m35671a(str2 == null, (Object) "recordStats does not take values");
            if (eVar.f20886g == null) {
                z = true;
            }
            C7397x.m35671a(z, (Object) "recordStats already set");
            eVar.f20886g = Boolean.valueOf(true);
        }
    }

    /* renamed from: com.google.common.cache.e$l */
    /* compiled from: CacheBuilderSpec */
    static class C7437l extends C7429d {
        C7437l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29342a(C7425e eVar, long j, TimeUnit timeUnit) {
            C7397x.m35671a(eVar.f20892m == null, (Object) "refreshAfterWrite already set");
            eVar.f20891l = j;
            eVar.f20892m = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.e$m */
    /* compiled from: CacheBuilderSpec */
    private interface C7438m {
        /* renamed from: a */
        void mo29344a(C7425e eVar, String str, @C5952h String str2);
    }

    /* renamed from: com.google.common.cache.e$n */
    /* compiled from: CacheBuilderSpec */
    static class C7439n implements C7438m {

        /* renamed from: a */
        private final C7496u f20896a;

        public C7439n(C7496u uVar) {
            this.f20896a = uVar;
        }

        /* renamed from: a */
        public void mo29344a(C7425e eVar, String str, @C5952h String str2) {
            C7397x.m35672a(str2 == null, "key %s does not take values", str);
            C7397x.m35672a(eVar.f20885f == null, "%s was already set to %s", str, eVar.f20885f);
            eVar.f20885f = this.f20896a;
        }
    }

    /* renamed from: com.google.common.cache.e$o */
    /* compiled from: CacheBuilderSpec */
    static class C7440o extends C7429d {
        C7440o() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29342a(C7425e eVar, long j, TimeUnit timeUnit) {
            C7397x.m35671a(eVar.f20888i == null, (Object) "expireAfterWrite already set");
            eVar.f20887h = j;
            eVar.f20888i = timeUnit;
        }
    }

    static {
        String str = "maximumSize";
        String str2 = "maximumWeight";
        String str3 = "concurrencyLevel";
        String str4 = "recordStats";
        String str5 = "expireAfterAccess";
        String str6 = "expireAfterWrite";
        String str7 = "refreshAfterWrite";
        String str8 = "refreshInterval";
        f20879q = C8302z2.m39628g().mo30687a("initialCapacity", new C7430e()).mo30687a(str, new C7434i()).mo30687a(str2, new C7435j()).mo30687a(str3, new C7428c()).mo30687a("weakKeys", new C7432g(C7496u.WEAK)).mo30687a("softValues", new C7439n(C7496u.SOFT)).mo30687a("weakValues", new C7439n(C7496u.WEAK)).mo30687a(str4, new C7436k()).mo30687a(str5, new C7427b()).mo30687a(str6, new C7440o()).mo30687a(str7, new C7437l()).mo30687a(str8, new C7437l()).mo30690a();
    }

    private C7425e(String str) {
        this.f20893n = str;
    }

    /* renamed from: a */
    public static C7425e m35748a(String str) {
        C7425e eVar = new C7425e(str);
        if (str.length() != 0) {
            for (String str2 : f20877o.mo23075a((CharSequence) str)) {
                C8257x2 a = C8257x2.m39392a(f20878p.mo23075a((CharSequence) str2));
                C7397x.m35671a(!a.isEmpty(), (Object) "blank key-value pair");
                C7397x.m35672a(a.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                String str3 = (String) a.get(0);
                C7438m mVar = (C7438m) f20879q.get(str3);
                C7397x.m35672a(mVar != null, "unknown key %s", str3);
                mVar.mo29344a(eVar, str3, a.size() == 1 ? null : (String) a.get(1));
            }
        }
        return eVar;
    }

    /* renamed from: c */
    public static C7425e m35750c() {
        return m35748a("maximumSize=0");
    }

    /* renamed from: b */
    public String mo29338b() {
        return this.f20893n;
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7425e)) {
            return false;
        }
        C7425e eVar = (C7425e) obj;
        if (!C5827t.m25562a(this.f20880a, eVar.f20880a) || !C5827t.m25562a(this.f20881b, eVar.f20881b) || !C5827t.m25562a(this.f20882c, eVar.f20882c) || !C5827t.m25562a(this.f20883d, eVar.f20883d) || !C5827t.m25562a(this.f20884e, eVar.f20884e) || !C5827t.m25562a(this.f20885f, eVar.f20885f) || !C5827t.m25562a(this.f20886g, eVar.f20886g) || !C5827t.m25562a(m35749a(this.f20887h, this.f20888i), m35749a(eVar.f20887h, eVar.f20888i)) || !C5827t.m25562a(m35749a(this.f20889j, this.f20890k), m35749a(eVar.f20889j, eVar.f20890k)) || !C5827t.m25562a(m35749a(this.f20891l, this.f20892m), m35749a(eVar.f20891l, eVar.f20892m))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5827t.m25558a(this.f20880a, this.f20881b, this.f20882c, this.f20883d, this.f20884e, this.f20885f, this.f20886g, m35749a(this.f20887h, this.f20888i), m35749a(this.f20889j, this.f20890k), m35749a(this.f20891l, this.f20892m));
    }

    public String toString() {
        return C5827t.m25559a((Object) this).mo23146a((Object) mo29338b()).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5832d<Object, Object> mo29337a() {
        C5832d<Object, Object> w = C5832d.m25587w();
        Integer num = this.f20880a;
        if (num != null) {
            w.mo23169b(num.intValue());
        }
        Long l = this.f20881b;
        if (l != null) {
            w.mo23160a(l.longValue());
        }
        Long l2 = this.f20882c;
        if (l2 != null) {
            w.mo23170b(l2.longValue());
        }
        Integer num2 = this.f20883d;
        if (num2 != null) {
            w.mo23159a(num2.intValue());
        }
        C7496u uVar = this.f20884e;
        if (uVar != null) {
            if (C7426a.f20894a[uVar.ordinal()] == 1) {
                w.mo23191s();
            } else {
                throw new AssertionError();
            }
        }
        C7496u uVar2 = this.f20885f;
        if (uVar2 != null) {
            int i = C7426a.f20894a[uVar2.ordinal()];
            if (i == 1) {
                w.mo23192t();
            } else if (i == 2) {
                w.mo23190r();
            } else {
                throw new AssertionError();
            }
        }
        Boolean bool = this.f20886g;
        if (bool != null && bool.booleanValue()) {
            w.mo23189q();
        }
        TimeUnit timeUnit = this.f20888i;
        if (timeUnit != null) {
            w.mo23171b(this.f20887h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f20890k;
        if (timeUnit2 != null) {
            w.mo23161a(this.f20889j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f20892m;
        if (timeUnit3 != null) {
            w.mo23175c(this.f20891l, timeUnit3);
        }
        return w;
    }

    @C5952h
    /* renamed from: a */
    private static Long m35749a(long j, @C5952h TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j));
    }
}
