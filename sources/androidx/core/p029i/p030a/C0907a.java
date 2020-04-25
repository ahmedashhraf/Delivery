package androidx.core.p029i.p030a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.Locale;

/* renamed from: androidx.core.i.a.a */
/* compiled from: MbmsHelper */
public final class C0907a {
    private C0907a() {
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    @C0195i0
    /* renamed from: a */
    public static CharSequence m5215a(@C0193h0 Context context, @C0193h0 ServiceInfo serviceInfo) {
        CharSequence charSequence = null;
        if (VERSION.SDK_INT < 28) {
            return null;
        }
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        int size = serviceInfo.getNamedContentLocales().size();
        if (size == 0) {
            return null;
        }
        String[] strArr = new String[size];
        int i = 0;
        for (Locale languageTag : serviceInfo.getNamedContentLocales()) {
            strArr[i] = languageTag.toLanguageTag();
            i++;
        }
        Locale firstMatch = locales.getFirstMatch(strArr);
        if (firstMatch != null) {
            charSequence = serviceInfo.getNameForLocale(firstMatch);
        }
        return charSequence;
    }
}
