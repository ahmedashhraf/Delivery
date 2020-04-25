package androidx.core.p038os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: androidx.core.os.f */
/* compiled from: LocaleListCompat */
public final class C1063f {

    /* renamed from: b */
    private static final C1063f f4731b = m6161a(new Locale[0]);

    /* renamed from: a */
    private C1065h f4732a;

    private C1063f(C1065h hVar) {
        this.f4732a = hVar;
    }

    @RequiresApi(24)
    @Deprecated
    /* renamed from: a */
    public static C1063f m6160a(Object obj) {
        return m6159a((LocaleList) obj);
    }

    @C0193h0
    @C0210o0(min = 1)
    /* renamed from: e */
    public static C1063f m6164e() {
        if (VERSION.SDK_INT >= 24) {
            return m6159a(LocaleList.getAdjustedDefault());
        }
        return m6161a(Locale.getDefault());
    }

    @C0193h0
    @C0210o0(min = 1)
    /* renamed from: f */
    public static C1063f m6165f() {
        if (VERSION.SDK_INT >= 24) {
            return m6159a(LocaleList.getDefault());
        }
        return m6161a(Locale.getDefault());
    }

    @C0193h0
    /* renamed from: g */
    public static C1063f m6166g() {
        return f4731b;
    }

    @C0237z(from = 0)
    /* renamed from: b */
    public int mo5209b() {
        return this.f4732a.size();
    }

    @C0193h0
    /* renamed from: c */
    public String mo5210c() {
        return this.f4732a.mo5216a();
    }

    @C0195i0
    /* renamed from: d */
    public Object mo5211d() {
        return this.f4732a.mo5218b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1063f) && this.f4732a.equals(((C1063f) obj).f4732a);
    }

    public int hashCode() {
        return this.f4732a.hashCode();
    }

    public String toString() {
        return this.f4732a.toString();
    }

    @RequiresApi(24)
    @C0193h0
    /* renamed from: a */
    public static C1063f m6159a(@C0193h0 LocaleList localeList) {
        return new C1063f(new C1066i(localeList));
    }

    @C0193h0
    /* renamed from: b */
    public static C1063f m6163b(@C0195i0 String str) {
        Locale locale;
        if (str == null || str.isEmpty()) {
            return m6166g();
        }
        String[] split = str.split(",", -1);
        Locale[] localeArr = new Locale[split.length];
        for (int i = 0; i < localeArr.length; i++) {
            if (VERSION.SDK_INT >= 21) {
                locale = Locale.forLanguageTag(split[i]);
            } else {
                locale = m6162a(split[i]);
            }
            localeArr[i] = locale;
        }
        return m6161a(localeArr);
    }

    @C0193h0
    /* renamed from: a */
    public static C1063f m6161a(@C0193h0 Locale... localeArr) {
        if (VERSION.SDK_INT >= 24) {
            return m6159a(new LocaleList(localeArr));
        }
        return new C1063f(new C1064g(localeArr));
    }

    /* renamed from: a */
    public Locale mo5206a(int i) {
        return this.f4732a.get(i);
    }

    /* renamed from: a */
    public boolean mo5208a() {
        return this.f4732a.isEmpty();
    }

    @C0237z(from = -1)
    /* renamed from: a */
    public int mo5205a(Locale locale) {
        return this.f4732a.mo5215a(locale);
    }

    @C0195i0
    /* renamed from: a */
    public Locale mo5207a(@C0193h0 String[] strArr) {
        return this.f4732a.mo5217a(strArr);
    }

    /* renamed from: a */
    static Locale m6162a(String str) {
        String str2 = "-";
        if (str.contains(str2)) {
            String[] split = str.split(str2, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            String str3 = C14282d.ROLL_OVER_FILE_NAME_SEPARATOR;
            if (!str.contains(str3)) {
                return new Locale(str);
            }
            String[] split2 = str.split(str3, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
}
