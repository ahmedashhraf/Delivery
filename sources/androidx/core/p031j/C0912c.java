package androidx.core.p031j;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import androidx.annotation.C0195i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.j.c */
/* compiled from: ICUCompat */
public final class C0912c {

    /* renamed from: a */
    private static final String f4169a = "ICUCompat";

    /* renamed from: b */
    private static Method f4170b;

    /* renamed from: c */
    private static Method f4171c;

    static {
        int i = VERSION.SDK_INT;
        String str = "addLikelySubtags";
        if (i < 21) {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f4170b = cls.getMethod("getScript", new Class[]{String.class});
                    f4171c = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception unused) {
                f4170b = null;
                f4171c = null;
            }
        } else if (i < 24) {
            try {
                f4171c = Class.forName("libcore.icu.ICU").getMethod(str, new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private C0912c() {
    }

    /* renamed from: a */
    private static String m5253a(String str) {
        try {
            if (f4170b != null) {
                return (String) f4170b.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @C0195i0
    /* renamed from: b */
    public static String m5255b(Locale locale) {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f4171c.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String a = m5254a(locale);
            if (a != null) {
                return m5253a(a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m5254a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f4171c != null) {
                return (String) f4171c.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }
}
