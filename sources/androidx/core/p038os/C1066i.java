package androidx.core.p038os;

import android.os.LocaleList;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
/* renamed from: androidx.core.os.i */
/* compiled from: LocaleListPlatformWrapper */
final class C1066i implements C1065h {

    /* renamed from: a */
    private final LocaleList f4739a;

    C1066i(LocaleList localeList) {
        this.f4739a = localeList;
    }

    /* renamed from: a */
    public int mo5215a(Locale locale) {
        return this.f4739a.indexOf(locale);
    }

    /* renamed from: b */
    public Object mo5218b() {
        return this.f4739a;
    }

    public boolean equals(Object obj) {
        return this.f4739a.equals(((C1065h) obj).mo5218b());
    }

    public Locale get(int i) {
        return this.f4739a.get(i);
    }

    public int hashCode() {
        return this.f4739a.hashCode();
    }

    public boolean isEmpty() {
        return this.f4739a.isEmpty();
    }

    public int size() {
        return this.f4739a.size();
    }

    public String toString() {
        return this.f4739a.toString();
    }

    /* renamed from: a */
    public String mo5216a() {
        return this.f4739a.toLanguageTags();
    }

    @C0195i0
    /* renamed from: a */
    public Locale mo5217a(@C0193h0 String[] strArr) {
        return this.f4739a.getFirstMatch(strArr);
    }
}
