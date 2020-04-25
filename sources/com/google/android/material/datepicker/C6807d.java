package com.google.android.material.datepicker;

import android.os.Build.VERSION;
import androidx.annotation.C0195i0;
import androidx.core.p033k.C0938f;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: DateStrings */
class C6807d {
    private C6807d() {
    }

    /* renamed from: a */
    static String m32568a(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return C6840p.m32681a(locale).format(new Date(j));
        }
        return C6840p.m32696e(locale).format(new Date(j));
    }

    /* renamed from: b */
    static String m32569b(long j) {
        return m32568a(j, Locale.getDefault());
    }

    /* renamed from: c */
    static String m32572c(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return C6840p.m32698f(locale).format(new Date(j));
        }
        return C6840p.m32694d(locale).format(new Date(j));
    }

    /* renamed from: d */
    static String m32573d(long j) {
        return m32572c(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m32575e(long j) {
        return m32574d(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m32570b(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return C6840p.m32687b(locale).format(new Date(j));
        }
        return C6840p.m32693c(locale).format(new Date(j));
    }

    /* renamed from: d */
    static String m32574d(long j, Locale locale) {
        if (VERSION.SDK_INT >= 24) {
            return C6840p.m32700g(locale).format(new Date(j));
        }
        return C6840p.m32693c(locale).format(new Date(j));
    }

    /* renamed from: a */
    static String m32566a(long j) {
        return m32567a(j, (SimpleDateFormat) null);
    }

    /* renamed from: c */
    static String m32571c(long j) {
        return m32570b(j, Locale.getDefault());
    }

    /* renamed from: a */
    static String m32567a(long j, @C0195i0 SimpleDateFormat simpleDateFormat) {
        Calendar f = C6840p.m32699f();
        Calendar h = C6840p.m32703h();
        h.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (f.get(1) == h.get(1)) {
            return m32569b(j);
        }
        return m32573d(j);
    }

    /* renamed from: a */
    static C0938f<String, String> m32564a(@C0195i0 Long l, @C0195i0 Long l2) {
        return m32565a(l, l2, null);
    }

    /* renamed from: a */
    static C0938f<String, String> m32565a(@C0195i0 Long l, @C0195i0 Long l2, @C0195i0 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C0938f.m5329a(null, null);
        }
        if (l == null) {
            return C0938f.m5329a(null, m32567a(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C0938f.m5329a(m32567a(l.longValue(), simpleDateFormat), null);
        }
        Calendar f = C6840p.m32699f();
        Calendar h = C6840p.m32703h();
        h.setTimeInMillis(l.longValue());
        Calendar h2 = C6840p.m32703h();
        h2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C0938f.m5329a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (h.get(1) != h2.get(1)) {
            return C0938f.m5329a(m32572c(l.longValue(), Locale.getDefault()), m32572c(l2.longValue(), Locale.getDefault()));
        } else {
            if (h.get(1) == f.get(1)) {
                return C0938f.m5329a(m32568a(l.longValue(), Locale.getDefault()), m32568a(l2.longValue(), Locale.getDefault()));
            }
            return C0938f.m5329a(m32568a(l.longValue(), Locale.getDefault()), m32572c(l2.longValue(), Locale.getDefault()));
        }
    }
}
