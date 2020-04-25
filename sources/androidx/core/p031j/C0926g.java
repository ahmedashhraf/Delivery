package androidx.core.p031j;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.Locale;
import org.jivesoftware.smack.util.StringUtils;

/* renamed from: androidx.core.j.g */
/* compiled from: TextUtilsCompat */
public final class C0926g {

    /* renamed from: a */
    private static final Locale f4205a;

    /* renamed from: b */
    private static final String f4206b = "Arab";

    /* renamed from: c */
    private static final String f4207c = "Hebr";

    static {
        String str = "";
        f4205a = new Locale(str, str);
    }

    private C0926g() {
    }

    @C0193h0
    /* renamed from: a */
    public static String m5286a(@C0193h0 String str) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(str);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append(StringUtils.QUOTE_ENCODE);
            } else if (charAt == '<') {
                sb.append(StringUtils.LT_ENCODE);
            } else if (charAt == '>') {
                sb.append(StringUtils.GT_ENCODE);
            } else if (charAt == '&') {
                sb.append(StringUtils.AMP_ENCODE);
            } else if (charAt != '\'') {
                sb.append(charAt);
            } else {
                sb.append("&#39;");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int m5287b(@C0195i0 Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f4205a)) {
            String b = C0912c.m5255b(locale);
            if (b == null) {
                return m5285a(locale);
            }
            if (b.equalsIgnoreCase(f4206b) || b.equalsIgnoreCase(f4207c)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static int m5285a(@C0193h0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
